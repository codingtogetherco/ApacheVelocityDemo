package co.com.coding.together.apache.velocity.service;

import co.com.coding.together.apache.velocity.client.DummyService;
import co.com.coding.together.apache.velocity.manager.VelocityTemplateManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.Map;

@Service
public class UserOrderService {

    private final VelocityTemplateManager velocityTemplateManager;

    private final DummyService dummyService;

    @Autowired
    public UserOrderService(VelocityTemplateManager velocityTemplateManager, DummyService dummyService) {
        this.velocityTemplateManager = velocityTemplateManager;
        this.dummyService = dummyService;
    }

    public String getUserOrders() throws IOException {
        Map<String, Object> userData = dummyService.getUserOrdersData();
        return velocityTemplateManager.generateResponse(userData);
    }
}
