package pl.pjatk.web.system.model;

public class DogModel {
    private String race;
    private int age;

    public DogModel(String race, int age) {
        this.race = race;
        this.age = age;
    }


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
