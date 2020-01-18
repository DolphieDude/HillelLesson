package Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        Product product = Product.builder()
                .id(1)
                .name("hello")
                .description("Greeting")
                .build();
        File file = new File("product.json");
        try {
            objectMapper.writeValue(file, product);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Product product1 = objectMapper.readValue(file, Product.class);
            System.out.println(product1);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
