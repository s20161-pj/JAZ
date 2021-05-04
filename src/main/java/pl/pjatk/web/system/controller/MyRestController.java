package pl.pjatk.web.system.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.web.system.model.CarModel;
import pl.pjatk.web.system.model.DogModel;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @GetMapping("/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/car")
    public ResponseEntity<CarModel> getCar() {
        return ResponseEntity.ok(new CarModel("Audi", "A4", 2021));
    }
    @GetMapping("/dog")
    public ResponseEntity<DogModel> getDog() {
        return ResponseEntity.ok(new DogModel("mieszaniec", 12));
    }

    @GetMapping("/hello/{title}")
    public ResponseEntity getTitle(@PathVariable String title) {
        return ResponseEntity.ok(title);
    }

    @GetMapping("/test")
    public ResponseEntity<String> getReqParam(@RequestParam String reqParam, @RequestParam String test) {
        return ResponseEntity.ok(reqParam + " " + test);
    }

    @PostMapping("/car/add")
    public ResponseEntity<CarModel> addCar(@RequestBody CarModel car) {
        return ResponseEntity.ok(car);
    }


}
