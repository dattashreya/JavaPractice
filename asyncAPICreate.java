@Service
public class OrderService {
    @Async("taskExecutor")
    public void processOrderAsync(Long orderId) {
        // Simulate a long-running process like sending an email or processing payment
        try {
            Thread.sleep(5000); 
            System.out.println("Order " + orderId + " processed by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> placeOrder(@PathVariable Long id) {
        orderService.processOrderAsync(id);
        return ResponseEntity.accepted().body("Order request accepted and processing in background.");
    }
}
