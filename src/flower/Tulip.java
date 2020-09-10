package flower;

public class Tulip extends Flower {

    private double tulipCost;

    public Tulip(String color, double stemLength, double cost, Freshness fresh) {
        super(color, stemLength, cost, fresh);
        setTulipCost(cost);
        super.setCost(tulipCost);
    }

    public double getTulipCost() {
        return tulipCost;
    }

    /*  Расчет стоимости розы в зависимости от свежести:
        - на свежие тюльпаны скидки нет
        - на средней свежести тюльпанов 30% скидка
        - на старые тюльпаны 60% скидка
    */
    public void setTulipCost(double tulipCost) {
        switch (fresh) {
            case FullFresh:
                this.tulipCost = tulipCost;
                break;
            case MiddleFresh:
                this.tulipCost = tulipCost *0.7;
                break;
            case OldFresh:
                this.tulipCost = tulipCost *0.4;
                break;
            default:
                throw new EnumConstantNotPresentException(fresh.getDeclaringClass(), fresh.name());
        }
    }

    public String toString()
    {
        return String.format("%s - %s","Tulip", super.toString());
    }
}
