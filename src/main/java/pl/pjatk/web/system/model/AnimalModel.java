package pl.pjatk.web.system.model;

public class AnimalModel {
    private Long id;
    private String name;
    private String type;
    private int lengthOfLife;

    public AnimalModel(Long id, String name, String type, int lengthOfLife) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.lengthOfLife = lengthOfLife;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLengthOfLife() {
        return lengthOfLife;
    }

    public void setLengthOfLife(int lengthOfLife) {
        this.lengthOfLife = lengthOfLife;
    }
}
