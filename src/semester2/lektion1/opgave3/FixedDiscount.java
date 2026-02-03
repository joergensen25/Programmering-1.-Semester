package semester2.lektion1.opgave3;

public class FixedDiscount extends Discount {

    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount (int fixedDiscount, int discountLimit) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    @Override
    public double getDiscount(double price) {

        return (price >= discountLimit) ? fixedDiscount : 0.0;
    }
}
