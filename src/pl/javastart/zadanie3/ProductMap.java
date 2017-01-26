package pl.javastart.zadanie3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Kasia on 26.01.2017.
 */
public class ProductMap {
    public static void main(String[] args) throws IOException {
        TreeMap<String,Product> products = new TreeMap<>();
        products.put("mleko",new Product("mleko zagęszczone","Mlekowita",7.50));
        products.put("pieczywo",new Product("Chleb wiejski", "Asprod",4.5));
        products.put("napoje",new Product("Sok pomarańczowy","Tymbark",3.5));
        products.put("alkohole", new Product("likier miętowy","Baileys",23.50));

        System.out.println("Wybierz produkt: ");
        //wyświetlamy zbiór kluczy
        for(String key: products.keySet()) {
            System.out.println("- " + key);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Twój wybór to: ");
        String key = scan.nextLine();


        if (!(key.equals(products))){ //jeśli klucz jest równy produktowi ( porównuję stringi)
            System.out.println(products.get(key));//to wyświetl produkt, który odpowiada wartości danego klucza
        }

//        FileWriter fileWriter = new FileWriter("productList");
//        BufferedWriter bfw = new BufferedWriter(fileWriter);
//       for(int i =0; i<products.size();i++){
//           System.out.println(products.getName() + "; " + products.getProducer() + "; " + products.getPrice());
//       }
//





        /*
        Poproś	użytkownika	o	podanie	nazwy	produktu,	pobierz	z	mapy	informację	o
        danym	produkcie	i	wyświetl	je	na	ekranie.

         */
    }
}
