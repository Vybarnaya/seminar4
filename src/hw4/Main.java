package hw4;

import java.util.ArrayList;
import java.util.List;
import static hw4.Pair.swapPairs;

public class Main {
    public static void main(String[] args) {
        // Создаем объект типа Box<Integer>
        Box<Integer> box1 = new Box<>(34, "Ivan");

        // Создаем объект типа Box<String>
        Box<String> box2 = new Box<>("37", "Marya");

        //Выводим объекты на печать, используя созданный в обобщенном классе Box метод printBoxContents
        box1.printBoxContents();
        box2.printBoxContents();
        System.out.println();

        // Создаем объект Pair с параметрами Integer и Integer
        Pair<Integer, Integer> pair1 = new Pair<>(123, 78965);
        Pair<Integer, Integer> pair11 = new Pair<>(852, 23965);

        // Создаем объект Pair с параметрами String и Integer
        Pair<String, Integer> pair2 = new Pair<>("P-456", 13965);

        // Создаем объект Pair с параметрами Integer и  Double
        Pair<Integer, Double> pair4 = new Pair<>(2, 13.5);


        // Создаем массив пар Pair<Integer, Integer>
        Pair<Integer,Integer> [] pairs = new Pair[2];
        pairs[0]= new Pair<>(pair1.getId(),pair1.getSalary());
        pairs[1]= new Pair<>(pair11.getId(),pair11.getSalary());

        // Выводим на печать первоначальный массив
        System.out.println("BasicPair: ");

        for (Pair<Integer, Integer> item : pairs) {
            System.out.println("( " + item.getId() + " " + item.getSalary()+" )");
        }
        System.out.println();

        //Меняем местами элементы в каждой паре, используя метод swapPairs, созданный в обобщенном классе Pair
        swapPairs(pairs);

        // Выводим на печать массив с перевернутые пары
        System.out.println("ReversePair: ");

        for (Pair<Integer, Integer> item : pairs) {
            System.out.println("( " + item.getId() + " " + item.getSalary()+ " )");
        }
        System.out.println();

        // Создаем массивы пар Pair разных типов (второй вариант)
        List<Pair<Integer, Integer>> pairs1 = new ArrayList<>();
        List<Pair<String, Integer>> pairs2 = new ArrayList<>();
        List<Pair<Integer, Double>> pairs3 = new ArrayList<>();

        pairs1.add(pair1);
        pairs1.add(pair11);
        pairs2.add(pair2);
        pairs3.add(pair4);

        // Выводим на печать первоначальные массивы c использованием метода toString
        System.out.println("BasicPair: ");
        System.out.println(pairs1);
        System.out.println(pairs2);
        System.out.println(pairs3);
        System.out.println();

        //Применяем медот swapPairs для каждой пары
        for(Pair<Integer,Integer> item: pairs1){
            swapPairs(new Pair[]{item});
        }

        for(Pair<String,Integer> item: pairs2){
            swapPairs(new Pair[]{item});
        }

        for(Pair<Integer,Double> item: pairs3){
            swapPairs(new Pair[]{item});
        }

        // Выводим на печать массивы с перевернутыми парами
        System.out.println("ReversePair: ");
        System.out.println(pairs1);
        System.out.println(pairs2);
        System.out.println(pairs3);
        System.out.println();

        System.out.println("Студент " + box1.getName() +" " + box1.getAge()+" года  : личный номер " + pair1.getId() + ", стипендия  " + pair1.getSalary());
        System.out.println("Студент " + box2.getName() +" "+ box2.getAge() + " года : личный номер " + pair11.getId() + ", стипендия  " + pair11.getSalary());


    }
}

















