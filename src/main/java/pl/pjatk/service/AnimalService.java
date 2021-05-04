package pl.pjatk.service;

import org.apache.coyote.Response;
import org.springframework.stereotype.Service;
import pl.pjatk.web.system.model.AnimalModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {
    private List<AnimalModel> animals;


    public AnimalService() {
        this.animals = List.of(
                new AnimalModel(1L,"Giraffe","mammal",30),
                new AnimalModel(2L,"Lizard", "reptile",4),
                new AnimalModel(3L,"Dolphin","mammal",40)
        );
    }

    public List<AnimalModel> addAnimal (AnimalModel addAnimal) {
        this.animals.add(addAnimal);

        return this.animals;
  }
  public AnimalModel update(AnimalModel animal) throws Exception {
      Long animalId = animal.getId();
      AnimalModel animalToUpdate = this.findAnimal(animalId);
      if(animalToUpdate == null) {
          throw new Exception("Nie ma takiego zwierzaka");
      }

      animalToUpdate.setName(animal.getName());
      animalToUpdate.setLengthOfLife(animal.getLengthOfLife());
      animalToUpdate.setType(animal.getType());

      return animalToUpdate;
    }

    private AnimalModel findAnimal(Long animalId) {
        for (AnimalModel animal : this.animals) {
            if (animal.getId().equals(animalId)) {
                return animal;
            }
        }
        return null;
    }
    public List<AnimalModel> getAllAnimals() {
        return this.animals;
    }

}


