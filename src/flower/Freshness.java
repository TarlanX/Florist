package flower;

public enum  Freshness {
    FullFresh, MiddleFresh, OldFresh;

    public int findEnum() {
        switch (this) {
            case FullFresh:
                return 1;
            case MiddleFresh:
                return 0;
            case OldFresh:
                return -1;
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }
}
