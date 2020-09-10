package flower;

public class Rose extends Flower {

    private double roseCost;

    public Rose(String color, double stemLength, double cost, Freshness fresh) {
        super(color, stemLength, 0, fresh);
        setRoseCost(cost);
        super.setCost(roseCost);
    }

    public double getRoseCost() {
        return roseCost;
    }

    /*  Расчет стоимости розы в зависимости от свежести:
        - на свежие розы скидки нет
        - на средней свежести роз 20% скидка
        - на старые розы 50% скидка
    */
    public void setRoseCost(double roseCost) {
        switch (fresh) {
            case FullFresh:
                this.roseCost = roseCost;
                break;
            case MiddleFresh:
                this.roseCost = roseCost *0.8;
                break;
            case OldFresh:
                this.roseCost = roseCost *0.5;
                break;
            default:
                throw new EnumConstantNotPresentException(fresh.getDeclaringClass(), fresh.name());
        }
    }

    public String toString()
    {
        return String.format("%s - %s","Rose", super.toString());
    }
}
