const fs = require("fs");
const axios = require("axios");

// 国内节点。海外主机换成 43.164.131.46，端口 8889。
const API = "http://gpu1.xinyuocr.xyz:8889/api/qrcode/predict";

async function predict(imagePath, keyCode, question = "识别图中文本", modelName = "普通模型") {
  const image = fs.readFileSync(imagePath).toString("base64");
  const { data } = await axios.post(
    API,
    { base64Image: image, modelName, keyCode, question },
    { timeout: 60000 }
  );
  if (data.errCode !== 0) {
    throw new Error(data.errCode + " " + data.err);
  }
  return data.msg;
}

predict("demo.png", "YOUR_KEYCODE").then(console.log).catch(console.error);
