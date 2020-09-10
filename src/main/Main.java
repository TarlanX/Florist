package main;

import bouquet.Bouquet;
import bouquet.Ribbon;
import bouquet.Wrapper;
import flower.Flower;
import flower.Freshness;
import flower.Rose;
import flower.Tulip;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Flower r1 = new Rose("Red", 30, 70, Freshness.OldFresh);
        Flower r2 = new Rose("Red", 20, 70, Freshness.MiddleFresh);
        Flower r3 = new Rose("Red", 30, 70, Freshness.FullFresh);

        ArrayList<Flower> roses = new ArrayList<Flower>();
        roses.add(r1);
        roses.add(r2);
        roses.add(r3);

        System.out.println("Отсортированный список цветов: ");
        ArrayList<Flower> sortRoses = Flower.sortFlowers(roses);
        for (int i = 0; i < sortRoses.size(); i++) {
            Flower temp = sortRoses.get(i);
            System.out.println(temp);
        }

        Bouquet bouquetRose = new Bouquet(Wrapper.Paper, Ribbon.Black, roses);
        System.out.println(bouquetRose);

        Flower t1 = new Tulip("Blue", 15, 35, Freshness.FullFresh);
        Flower t2 = new Tulip("Blue", 15, 35, Freshness.MiddleFresh);

        ArrayList<Flower> tulips = new ArrayList<Flower>();
        tulips.add(t1);
        tulips.add(t2);

        Bouquet bouquetTulip = new Bouquet(Wrapper.Net, Ribbon.White, tulips);
        System.out.println(bouquetTulip);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало диапазона: ");
        double stemLengthFirst = scanner.nextDouble();
        System.out.print("Введите конец диапазона: ");
        double stemLengthLast = scanner.nextDouble();

        int count = 0;
        for (int i = 0; i < bouquetRose.getFlowers().size(); i++) {
            if (bouquetRose.getFlowers().get(i).getStemLength() >= stemLengthFirst &&
                    bouquetRose.getFlowers().get(i).getStemLength() <= stemLengthLast) {
                System.out.println(bouquetRose.getFlowers().get(i));
                count++;
            }
        }
        if (count == 0)
            System.out.println("В букете нет цветков, соответствующему заданному диапазону");
    }
}
