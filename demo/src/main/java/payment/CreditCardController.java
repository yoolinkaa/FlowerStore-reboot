package payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/credit_card_payment")
@RestController
public class CreditCardController {
    @GetMapping
    public List<? extends Payment> getPayments() {
        return List.of(new CreditCardPaymentStrategy());
    }
}