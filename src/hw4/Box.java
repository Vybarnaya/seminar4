package hw4;

public class Box <T> {
    private T age;

    private String name;

    public Box(T age, String name) {
        this.age = age;
        this.name = name;
    }

    public T getAge() {

        return age;
    }

    public void setAge(T age) {

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void printBoxContents(){
        System.out.println("Имя: " + getName() + ", возраст:   " + getAge() + " года" );

    }

}
