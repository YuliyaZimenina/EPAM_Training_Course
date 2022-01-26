package com.juliya.zimenina;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountPeople = scanner.nextInt();
        int amountPartOfPizza = scanner.nextInt();
        int amountPizzas;
        int i = 1;

        while (true) {
            amountPizzas = i * amountPartOfPizza;
            if (amountPizzas % amountPeople == 0) {
                break;
            }
            i++;
        }

        System.out.println(amountPizzas/amountPartOfPizza);
    }

}
