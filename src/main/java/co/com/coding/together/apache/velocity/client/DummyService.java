package co.com.coding.together.apache.velocity.client;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class DummyService {

    private static final String USER_ORDERS_JSON_PATH = "src/main/resources/data/user_orders.json";

    public Map<String, Object> getUserOrdersData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(USER_ORDERS_JSON_PATH), Map.class);
    }
}
