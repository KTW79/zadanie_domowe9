package pl.javastart.zadanie1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Kasia on 26.01.2017.
 */
public class List {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> eNumbers = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int usernumbers = 0;

        System.out.println("Podaj dowolną ilość liczb dodatnichczy.Liczba ujemna kończy możliwośc dalszego wpisu");
        usernumbers = scan.nextInt();


        while (usernumbers > 0) {
            eNumbers.add(usernumbers);
            usernumbers = scan.nextInt();
        }


        System.out.println("koniec");

        FileWriter fileWriter = new FileWriter("lista.txt", true); //dopisywanie
        BufferedWriter bfw = new BufferedWriter(fileWriter);

        for (Integer b : eNumbers) {
            bfw.newLine();
            bfw.write("" + b);
        }
        bfw.close();
    }
}

