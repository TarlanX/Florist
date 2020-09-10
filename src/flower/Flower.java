package flower;

import java.util.ArrayList;

public abstract class Flower {
    private String color;
    private double stemLength;
    private double cost;
    public Freshness fresh;

    public Flower(String color, double stemLength, double cost, Freshness fresh) {
        this.color = color;
        this.stemLength = stemLength;
        this.cost = cost;
        this.fresh = fresh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) { this.cost = cost; }

    public Freshness getFreshness() {
        return fresh;
    }

    public void setFreshness(Freshness freshness) {
        this.fresh = freshness;
    }

    public String toString() {
        return String.format("Color: %s | Cost: %s Rub | Freshness: %s | StemLength: %s Cm",
                color, cost, fresh, stemLength);
    }

    //Сортировка цветов
    public static ArrayList<Flower> sortFlowers(ArrayList<Flower> flowers) {
        int i = 0;
        while (i < flowers.size() - 1) {
            if (flowers.get(i).getFreshness().findEnum() < flowers.get(i + 1).getFreshness().findEnum()) {
                Flower temp = flowers.get(i);
                flowers.set(i, flowers.get(i + 1));
                flowers.set(i + 1, temp);
                if (i > 0)
                    i--;
                else
                    i++;
            } else
                i++;
        }
        return flowers;
    }
}
