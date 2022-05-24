import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        // TOOD the next few lines will load your apiKey from the file src/main/resources/api.properties replace the xxx in that file with your API key
        Properties props = new Properties();
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("api.properties");
        if (inputStream != null) {
            props.load(inputStream);
        }
        final String apiKey = props.getProperty("apiKey");

        // TODO write a loop to take input from the user one symbol at a time until the user inputs an empty line
        // TODO for each symbol input, query the finnhub API, read the response into a class, and print out the data with meaningful labels
        HttpClient httpClient = HttpClient.newHttpClient();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the symbol");
        List<String> symbols = new ArrayList<>();

        String line = input.nextLine();
        while (!line.equals("")) {
            symbols.add(line);

            //System.out.println("Enter ");
            line = input.nextLine();
        }


        for (String symbol : symbols) {

            
            String http = "https://finnhub.io/api/v1/quote?symbol=" + symbol + "&token=" + apiKey;

            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(http))
                    .header("Accept", "application/json")
                    .build();

            ObjectMapper objectMapper = new ObjectMapper();

            HttpResponse<String> response = httpClient.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

//        o - Open price of the day
//        h - High price of the day
//        l - Low price of the day
//        c - Current price
//        pc - Previous close price

            Finance finance = objectMapper.readValue(response.body(), Finance.class);
            
            String s = "Open price of the day = " + finance.o + ", " + "High price of the day = " + finance.o
                    + ", " + "Low price of the day = " + finance.l + ", " + "Current price= " + finance.c + ", "
                    + "Previous close price = " + finance.pc;
            System.out.println(s);



        }
    }
}
class Finance
{
    public float c;
    public float d;
    public float dp;
    public float h;
    public float l;
    public float o;
    public float pc;
    public int t;

}





