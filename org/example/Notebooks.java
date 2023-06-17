package org.example;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков (Set).
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map или в Сет. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - цвет
//        2 - бренд

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Notebooks {
    Brand brand;
    Color color;
    int ram;
    int numberOfCores;
    int batteryTime;

    public Notebooks(Brand brand, Color color, int ram, int numberOfCores, int batteryTime) {
        this.brand = brand;
        this.color = color;
        this.ram = ram;
        this.numberOfCores = numberOfCores;
        this.batteryTime = batteryTime;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public int getBatteryTime() {
        return batteryTime;
    }

    @Override
    public String toString() {
        return "Notebooks{" +
                "brand=" + brand +
                ", color=" + color +
                ", ram=" + ram +
                ", numberOfCores=" + numberOfCores +
                ", batteryTime=" + batteryTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebooks notebooks)) return false;
        return ram == notebooks.ram && numberOfCores == notebooks.numberOfCores && batteryTime == notebooks.batteryTime && brand == notebooks.brand && color == notebooks.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, ram, numberOfCores, batteryTime);
    }
    public static Set<Notebooks> newSelection(Set<Notebooks> notebooksSet) {
        Scanner scan = new Scanner(System.in);
        Set<Notebooks> listNotes = new HashSet<>(notebooksSet);
        System.out.println("Введите цифру, соответствующую необходимому критерию: \n" +
                "1 - бренд\n" +
                "2 - цвет\n" +
                "3 - оперативная память\n" +
                "4 - количество ядер\n" +
                "5 - время заряда батареи\n");
        Integer userInput = scan.nextInt();

        if (userInput == 1 ) {
            System.out.println("Укажите бренд ноутбука: APPLE, LENOVO, ACER, ASUS, HUAWEI ");
            Scanner c1 = new Scanner(System.in);
            Brand noteBrand = Brand.valueOf(c1.nextLine());
            for (Notebooks tempNote : notebooksSet) {
                if (noteBrand != tempNote.brand) {
                    listNotes.remove(tempNote);
                }
            }
        } else if (userInput == 2) {
            System.out.println("Укажите цвет ноутбука: BLACK, WHITE, GRAY, BLUE ");
            Scanner c2 = new Scanner(System.in);
            Color noteColor = Color.valueOf(c2.next());
            for (Notebooks tempNote : notebooksSet) {
                if (!(tempNote.color == noteColor)) {
                    listNotes.remove(tempNote);
                }
            }
        } else if (userInput == 3) {
            System.out.println("Укажите размер оперативной памяти: 12, 24, 32, 64 ");
            Scanner c3 = new Scanner(System.in);
            Integer noteRam = c3.nextInt();
            for (Notebooks tempNote : notebooksSet) {
                if (noteRam != tempNote.ram) {
                    listNotes.remove(tempNote);
                }
            }
        } else if (userInput == 4) {
            System.out.println("Укажите количество ядер: 10, 14, 16 ");
            Scanner c4 = new Scanner(System.in);
            Integer noteCore = c4.nextInt();
            for (Notebooks tempNote : notebooksSet) {
                if (noteCore != tempNote.numberOfCores) {
                    listNotes.remove(tempNote);
                }
            }
        } else if (userInput == 5) {
            System.out.println("Укажите возможности батари: 6, 8, 10, 12 ");
            Scanner c5 = new Scanner(System.in);
            Integer noteBat = c5.nextInt();
            for (Notebooks tempNote : notebooksSet) {
                if (noteBat != tempNote.batteryTime) {
                    listNotes.remove(tempNote);
                }
            }
        }
        System.out.println("Такие ноутбуки представлены с параметрами: " + listNotes);
        return listNotes;
    }
}
