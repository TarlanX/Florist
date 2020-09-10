package bouquet;


public enum Wrapper {
    Paper, Net, Felt;

    public double findCost() {
        switch (this) {
            case Paper:
                return 100;
            case Net:
                return 150;
            case Felt:
                return 200;
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }
}
