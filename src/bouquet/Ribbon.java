package bouquet;

public enum Ribbon {
    Red, Green, White, Black;

    public double findCost() {
        switch (this) {
            case Red:
                return 20;
            case Green:
                return 18;
            case Black:
                return 15;
            case White:
                return 10;
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }
}
