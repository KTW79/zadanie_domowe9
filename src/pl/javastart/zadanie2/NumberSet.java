package pl.javastart.zadanie2;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by Kasia on 26.01.2017.
 */
public class NumberSet {
    public static void main(String[] args) {
        TreeSet<Integer> randomNumbers = new TreeSet<>();
        Random generator = new Random();


        while (randomNumbers.size() != 50) {
            randomNumbers.add(generator.nextInt(1000));
        }
        System.out.println(randomNumbers);

        int i = 0;
        int sum = 0;

        Iterator iterator = randomNumbers.iterator();

            for(i=0;i<=randomNumbers.size();i++){
                while (iterator.hasNext()){
                    Integer next = (Integer) iterator.next();
                    sum = sum + next;
            }
        }System.out.println("\nSuma:" + sum);


        System.out.println("\nWielkość zbioru: " + randomNumbers.size());
        System.out.println("Najmniejsza liczba to: " + randomNumbers.first());
        System.out.println("Najwięszka liczba to: " + randomNumbers.last());
        System.out.println("Średnia ze wszystkich liczb to: " + sum/randomNumbers.size());
    }
}

/*
 Stwórz	zbiór	i	umieść	w	nim	50	losowych	liczb	z	przedziału	0-1000.
 Do	stworzenia	liczb	losowych	wykorzystaj	metodę	nextInt()	z	klasy	Random.
 Na	ekranie	wyświetl:
 -	najmniejszą	z	liczb
 -	największą	z	liczb
 -	średnią	ze	wszystkich	liczb
 */