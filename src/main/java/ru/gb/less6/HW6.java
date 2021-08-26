package ru.gb.less6;

import java.util.Scanner;

public class HW6 {
    private static Scanner scanner;
    public static void main(String[] args) {
        float catValueRun, catValueSwim, dogValueRun, dogValueSwim;
        int c = 0;
        int d = 0;
        int w;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Введите имя кота");
            String catName = scanner.next();
            c++;

            System.out.println("Введите дистанцию для бега кота");
            catValueRun = scanner.nextFloat();

            System.out.println("Введите дистанцию для плавания кота");
            catValueSwim = scanner.nextFloat();
            System.out.println("***************************");

            System.out.println("Введите имя собаки");
            String dogName = scanner.next();
            d++;
            System.out.println("Введите дистанцию для бега собаки");
            dogValueRun = scanner.nextFloat();

            System.out.println("Введите дистанцию для плавания собаки");
            dogValueSwim = scanner.nextFloat();

            Animal Cat = new Cat(catName, catValueRun, catValueSwim);
            Cat.run(catValueRun);
            Cat.swim(catValueSwim);

            Animal Dog = new Dog(dogName, dogValueRun, dogValueSwim);
            Dog.run(dogValueRun);
            Dog.swim(dogValueSwim);

            System.out.println("Хотите еще ввести данные? Введите 0-ДА/1-НЕТ");
            w = scanner.nextInt();
        } while (w == 0);
        System.out.println("Количество введеных животных - " + (c + d));
        System.out.println(" *** котов - " + c + " *** собак - " + d);

    }
}
