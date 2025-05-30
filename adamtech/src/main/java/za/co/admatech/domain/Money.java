package za.co.admatech.domain;

public class Money {
    private int amount;
    private String currency;

    public Money() {
    }

    private Money(Builder builder) {
        this.amount = builder.amount;
        this.currency = builder.currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public static class Builder {
        private int amount;
        private String currency;

        public Builder setAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public Money build() {
           return new Money(this);
        }

        public Builder copy(Money money) {
            this.amount = money.amount;
            this.currency = money.currency;
            return this;
        }

    }

}
