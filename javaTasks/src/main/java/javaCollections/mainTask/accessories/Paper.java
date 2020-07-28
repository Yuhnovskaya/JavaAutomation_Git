package javaCollections.mainTask.accessories;

public
class Paper {
    private PaperType paperType;
    private double price;

    public
    Paper(PaperType paperType) {
        this.paperType = paperType;
        switch (this.paperType) {
            case CORRUGATED:
                this.price = 9.45;
                break;
            case CRUFT:
                this.price = 5.29;
                break;
            case TWOTONE:
                this.price = 12.5;
                break;
            default:
                this.price = 0;
        }
    }

    public
    PaperType getPaperType() {
        return paperType;
    }

    public
    double getPrice() {
        return price;
    }

    @Override
    public
    String toString() {
        return "Paper{" +
                "paperType=" + paperType +
                ", price=" + price +
                '}';
    }
}
