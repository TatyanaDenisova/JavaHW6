package org.example;

import java.util.HashSet;
import java.util.Set;

import static org.example.Notebooks.newSelection;

public class MainNotebook {
    public static void main(String[] args) {
    Notebooks notebook1 = new Notebooks(Brand.LENOVO, Color.BLACK, 12, 16, 8);
    Notebooks notebook2 = new Notebooks(Brand.ASUS, Color.WHITE, 32, 10, 6);
    Notebooks notebook3 = new Notebooks(Brand.APPLE, Color.WHITE, 24, 14, 10);
    Notebooks notebook4 = new Notebooks(Brand.LENOVO, Color.BLACK, 64, 10, 12);
    Notebooks notebook5 = new Notebooks(Brand.LENOVO, Color.BLACK, 12, 16, 8);
    Notebooks notebook6 = new Notebooks(Brand.ACER, Color.BLUE, 24, 14, 10);
    Notebooks notebook7 = new Notebooks(Brand.HUAWEI, Color.GRAY, 32, 16, 6);
    Notebooks notebook8 = new Notebooks(Brand.ASUS, Color.BLUE, 64, 16, 12);
    Set<Notebooks> noteSet = new HashSet<>();
    noteSet.add(notebook1);
    noteSet.add(notebook2);
    noteSet.add(notebook3);
    noteSet.add(notebook4);
    noteSet.add(notebook5);
    noteSet.add(notebook6);
    noteSet.add(notebook7);
    noteSet.add(notebook8);
    System.out.println(noteSet);

    newSelection(noteSet);
    }
}
