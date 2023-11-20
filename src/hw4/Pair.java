package hw4;

public class Pair <T, S> {

    private T id;

    private S salary;

    public Pair(T id, S salary) {
        this.id = id;
        this.salary = salary;
    }

    public T getId() {

        return id;
    }

    public void setId(T id) {

        this.id = id;
    }

    public S getSalary() {

        return salary;
    }

    public void setSalary(S salary) {

        this.salary = salary;
    }

    public String toString() {
        return "(" + id + ", " + salary + ")";
    }

    public static <T> void swapPairs(Pair<T, T>[] pairs) {
        for (Pair<T, T> pair : pairs) {
            T tmp = pair.getId();
            pair.setId(pair.getSalary());
            pair.setSalary(tmp);
        }
    }

}


