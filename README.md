<div align="center">

# 图界 Tujie

**万能 AI 图像识别平台** — 人眼能看懂的图，AI 都能识别

`OCR 文字识别` · `目标定位（坐标级）` · `GIF 动态图理解` · `一切验证码识别`

[🌐 官网](https://ai.xinyuocr.xyz) | [🚀 在线测试（免费）](https://ai.xinyuocr.xyz/predict2) | [💰 价格说明](https://ai.xinyuocr.xyz/numbers) | [📧 联系我们](https://ai.xinyuocr.xyz/tipoffs)

</div>

---

## ✨ 核心能力

| 能力 | 说明 |
| --- | --- |
| 📝 **文字识别 (OCR)** | 印刷体 / 手写体 / 表格 / 票据 / 多语言文字，图片直接返回文本 |
| 🎯 **目标定位** | 框选目标、坐标级返回，支持目标检测与多目标一次识别 |
| 🎞️ **动态图理解** | 原生支持 GIF / 动图 / 视频帧，动态内容也能识别 |
| ⚡ **极速响应** | 平均响应 < 1s，高并发稳定，API 即开即用 |

**一句话：把识别压力交给 图界，结果支持文本与坐标返回。**

## 🧩 一切验证码都能识别（核心场景）

点选、英文、数字、问答、智力题……人眼能看懂的验证码，图界都能识别：

- 🖱️ **点选验证码**：点字 / 点图 / 顺序点选
- 🔤 **英文验证码**：字母、大小写与特殊字符
- 🔢 **数字验证码**：纯数字与多位数字
- 🔡 **字母数字混合**：任意组合
- ❓ **问答验证码**：数学题 / 常识问答
- 🧠 **智力题**：规律题 / 图形推理

> 💡 适合自动化测试、批量录入、登录过验证、机器人过验证等一切需要「看图识别」的场景。

## 🚀 快速开始

```bash
# 注册账号获取 API Key 后，直接调用识别接口（示例）
curl -X POST "https://ai.xinyuocr.xyz/api/recognize" \
  -H "Authorization: Bearer YOUR_API_KEY" \
  -F "file=@captcha.jpg"
```

返回示例（以实际接入文档为准）：

```json
{
  "code": 0,
  "data": {
    "text": "73k9",
    "confidence": 0.99,
    "boxes": [[12, 8, 40, 30]]
  }
}
```

## 💰 定价

- **按量付费**：按识别次数计费，[查看价格说明](https://ai.xinyuocr.xyz/numbers)
- **包月套餐**：联系顾问获取报价
- **企业定制**：私有化部署 / 专属模型，联系顾问

## 📄 使用须知

- [使用须知 / 免责声明](https://ai.xinyuocr.xyz/disclaimer)
- [违法举报](https://ai.xinyuocr.xyz/tipoffs)

## 📞 联系我们

- **官网**：https://ai.xinyuocr.xyz
- **QQ**：855902642
- **微信**：q77254558

---

<div align="center">

**图界 Tujie** — Universal AI Image Recognition Platform

人眼能看懂的图，AI 都能识别。

<sub>© 2026 图界 Tujie. All rights reserved.</sub>

</div>
