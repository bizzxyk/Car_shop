package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Cars> cars = new ArrayList<>();
    static List<Buyers> buyers = new ArrayList<>();
    static List<Managers> managers = new ArrayList<>();


    public static void main(String[] args) {

        //список с авто
        Cars car1 = new Cars("Toyota", 1_000_000, "red");
        Cars car2 = new Cars("Shkoda", 1_500_000, "blue");
        Cars car3 = new Cars("Nisan", 2_000_000, "white");
        Cars car4 = new Cars("Toyota", 900_000, "grey");
        Cars car5 = new Cars("BMW", 1_500_000, "blue");
        Cars car6 = new Cars("Mercedes", 3_000_000, "dark-red");
        Cars car7 = new Cars("BMW", 2_000_000, "black");
        Cars car8 = new Cars("Shkoda", 1_000_000, "green");
        Cars car9 = new Cars("Nisan", 1_400_000, "brown");
        Cars car10 = new Cars("Mitsubishi", 1_000_000, "black");


        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);


        //Список с клиентами
        Buyers buyers1 = new Buyers("Liza", "Br");
        Buyers buyers2 = new Buyers("Nazar", "Bredihin");
        Buyers buyers3 = new Buyers("Diana", "Veselova");


        buyers.add(buyers1);
        buyers.add(buyers2);
        buyers.add(buyers3);


        //Список менеджеров
        Managers manager1 = new Managers("Tom", "Smith",01,111);
        Managers manager2 = new Managers("Jack", "Jackson",02,222);

        managers.add(manager1);
        managers.add(manager2);




        boolean go = true;

        while (go) {
            System.out.println("Добро пожаловать в магазин автомобилей!! Выберете действие: \n" +
                    "1 - просмотр всех авто \n" +
                    "2 - Войти в аккаут покупателя и оформить заказ\n"+
                    " ");

            Scanner sc = new Scanner(System.in);
            int otvet1 = sc.nextInt();

            //просмотр авто
            if (otvet1 == 1) {

                for (int i = 0; i < cars.size(); i++) {
                    System.out.print(cars.get(i).getName() + " ");
                    System.out.print(cars.get(i).getColor() + " ");
                    System.out.print(cars.get(i).getCost());
                    System.out.println(" ");

                }
                System.out.println(" \n" +
                        " ");

                //Оформление заказа
            } else if (otvet1 == 2) {
                System.out.println( "Выберете действие: \n" +
                "1 - Войти в аккаунт \n" +
                        "2 - Зарегистрироваться\n"+
                        " ");

                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Введите Имя: ");
                    String otvet_name = sc1.nextLine();
                    System.out.println("Введите Фамилию: ");
                    String otvet_surname = sc1.nextLine();


                int n = 0;

                for (var buyer : buyers) {
                    if(otvet_name.equals(buyer.getName()) && otvet_surname.equals(buyer.getSurname())){
                        n += 1;
                }else {
                        n += 0;
                    }

                }
                if (n>0){
                    System.out.println("Добро пожаловать!");
                }else{
                    System.out.println("Вас нет в системе, хотите зарегистрироваться??");
                }
                System.out.println(" \n" +
                        " ");

            }

        }
    }
}
