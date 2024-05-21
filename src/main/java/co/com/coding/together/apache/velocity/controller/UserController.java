package co.com.coding.together.apache.velocity.controller;

import co.com.coding.together.apache.velocity.service.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@RestController
public class UserController {


    private UserOrderService userOrderService;

    @Autowired
    public UserController(UserOrderService userOrderService) {
        this.userOrderService = userOrderService;
    }

    @GetMapping("/user/orders")
    public ResponseEntity<String> getUserOrders() {
        try {
            String response = userOrderService.getUserOrders();
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error retrieving user orders");
        }
    }
}