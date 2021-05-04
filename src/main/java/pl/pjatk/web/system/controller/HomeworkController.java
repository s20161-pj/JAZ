package pl.pjatk.web.system.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.service.AnimalService;
import pl.pjatk.web.system.model.AnimalModel;
import pl.pjatk.web.system.model.DogModel;

import java.util.List;

@RestController
@RequestMapping("/homework")
public class HomeworkController {
    private AnimalService animalService;

    public HomeworkController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> getName(@PathVariable String name) {
        return ResponseEntity.ok(name);
    }

    @GetMapping("/name")
    public ResponseEntity<String> getReqParam(@RequestParam String reqParam) {
        return ResponseEntity.ok(reqParam);
    }
    @PostMapping("/animal/add")
    public ResponseEntity<AnimalModel> addAnimalModel(@RequestBody AnimalModel animalModel) {
        return ResponseEntity.ok(animalModel);
    }
    @GetMapping("/all")
    public ResponseEntity<List<AnimalModel>> getAll(){
        return ResponseEntity.ok(this.animalService.getAllAnimals());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateAnimal(@PathVariable Long id, @RequestBody AnimalModel animal) {
        try {
            return ResponseEntity.ok(this.animalService.update(animal));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(e.getMessage());
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteAnimal(@PathVariable Long id){
        return new ResponseEntity(HttpStatus.OK);
    }
}
