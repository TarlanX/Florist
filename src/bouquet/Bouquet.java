package bouquet;

import flower.Flower;
import flower.Rose;

import java.util.ArrayList;

public class Bouquet {
    private Wrapper wrapper;
    private Ribbon ribbon;
    private ArrayList<Flower> flowers;

    public Bouquet(Wrapper wrapper, Ribbon ribbon, ArrayList<Flower> flowers) {
        this.wrapper = wrapper;
        this.ribbon = ribbon;
        this.flowers = flowers;
    }

    public Wrapper getWrapper() {
        return wrapper;
    }

    public void setWrapper(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    public Ribbon getRibbon() {
        return ribbon;
    }

    public void setRibbon(Ribbon ribbon) {
        this.ribbon = ribbon;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    //Расчет стоимости букета вместе с аксессуарами
    public double bouquetCost() {
        double cost = 0;
        for (int i = 0; i < flowers.size(); i++) {
            cost += flowers.get(i).getCost();
        }
        cost = cost + wrapper.findCost() + ribbon.findCost();
        return cost;
    }

    public String toString() {
        if (flowers.get(0).getClass().getName().equals("flower.Rose"))
            return String.format("Bouquet: %s | Wrapper: %s | Ribbon: %s | Pieces: %s | Total cost: %s Rub", "Roses", wrapper, ribbon, flowers.size(), bouquetCost());
        else
            return String.format("Bouquet: %s | Wrapper: %s | Ribbon: %s | Pieces: %s | Total cost: %s Rub", "Tulips", wrapper, ribbon, flowers.size(), bouquetCost());
    }
}
