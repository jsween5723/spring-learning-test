package cholog.controller;

import cholog.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping("/products")
    public ResponseEntity<Void> searchProduct(@RequestParam String keyword) {
        if (true) {
            throw new IllegalArgumentException("Invalid keyword: " + keyword);
        }

        return ResponseEntity.ok().build();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Void> badRequest(IllegalArgumentException e){
        return ResponseEntity.badRequest().build();
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<Void> getProduct(@PathVariable Long id) {
        if (true) {
            throw new NotFoundException("Product not found: id=" + id);
        }

        return ResponseEntity.ok().build();
    }
}
