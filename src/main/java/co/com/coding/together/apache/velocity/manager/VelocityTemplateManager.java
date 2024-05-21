package co.com.coding.together.apache.velocity.manager;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.StringWriter;
import java.util.Map;

@Component
public class VelocityTemplateManager {

    private static final String TEMPLATE_PATH = "templates/user_orders_template.vm";

    private final VelocityEngine velocityEngine;

    @Autowired
    public VelocityTemplateManager(VelocityEngine velocityEngine) {
        this.velocityEngine = velocityEngine;
    }

    public String generateResponse(Map<String, Object> userData) {
        VelocityContext context = new VelocityContext();
        context.put("status", "success");
        context.put("message", "Data retrieved successfully");
        context.put("user", userData.get("user"));
        context.put("orders", userData.get("orders"));

//        VelocityContext context = new VelocityContext();
//        userData.forEach(context::put);

        try (StringWriter writer = new StringWriter()) {
            velocityEngine.mergeTemplate(TEMPLATE_PATH, "UTF-8", context, writer);
            return writer.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error while generating response with Velocity template", e);
        }
    }
}