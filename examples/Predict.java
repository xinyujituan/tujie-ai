import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Base64;

public class Predict {
    public static void main(String[] args) throws Exception {
        String api = "http://gpu1.xinyuocr.xyz:8889/api/qrcode/predict";
        String image = Base64.getEncoder().encodeToString(Files.readAllBytes(Path.of("demo.png")));
        String json = "{"
                + "\"base64Image\":\"" + image + "\","
                + "\"modelName\":\"普通模型\","
                + "\"keyCode\":\"YOUR_KEYCODE\","
                + "\"question\":\"识别图中文本\""
                + "}";
        HttpClient client = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(60)).build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(api))
                .timeout(Duration.ofSeconds(60))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
