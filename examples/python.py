import base64
import requests

# 国内节点。海外把主机换成 43.164.131.46，端口仍是 8889。
API = "http://ai.xinyuocr.xyz/api/qrcode/predict"
# question: 识别图中文本 / 回答图中问题 / 框出正确位置
# modelName: 免费模型 / 普通模型


def predict(image_path, key_code, question="识别图中文本", model_name="普通模型"):
    with open(image_path, "rb") as f:
        image_b64 = base64.b64encode(f.read()).decode()
    payload = {
        "base64Image": image_b64,
        "modelName": model_name,
        "keyCode": key_code,
        "question": question,
    }
    data = requests.post(API, json=payload, timeout=60).json()
    if data.get("errCode", 0) != 0:
        raise RuntimeError("%s %s" % (data.get("errCode"), data.get("err")))
    return data.get("msg")


if __name__ == "__main__":
    print(predict("demo.png", "YOUR_KEYCODE"))
