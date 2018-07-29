
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        return new Money(this.euros + added.euros, this.cents + added.cents);
    }

    public boolean less(Money compared) {
        return this.euros < compared.euros
                || this.euros == compared.euros && this.cents < compared.cents;
    }

    public Money minus(Money decremented) {

        if (this.less(decremented)) {
            return new Money(0, 0);
        }

        if (this.cents - decremented.cents <= 0) {
            if (this.euros - 1 - decremented.euros <= 0) {
                return new Money(0, 0);
            }
            return new Money(this.euros - 1 - decremented.euros, this.cents + 100 - decremented.cents);
        }

        return new Money(this.euros - decremented.euros, this.cents - decremented.cents);
    }

}
