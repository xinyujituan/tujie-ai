using System.Text;
using System.Text.Json;

const string Api = "http://gpu1.xinyuocr.xyz:8889/api/qrcode/predict";
string image = Convert.ToBase64String(File.ReadAllBytes("demo.png"));
var payload = new
{
    base64Image = image,
    modelName = "普通模型",
    keyCode = "YOUR_KEYCODE",
    question = "识别图中文本"
};
using var client = new HttpClient { Timeout = TimeSpan.FromSeconds(60) };
var body = new StringContent(JsonSerializer.Serialize(payload), Encoding.UTF8, "application/json");
string text = await client.PostAsync(Api, body).Result.Content.ReadAsStringAsync();
Console.WriteLine(text);
