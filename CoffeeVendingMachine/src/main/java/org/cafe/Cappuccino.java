package org.cafe;

import org.springframework.stereotype.Component;

@Component
public class Cappuccino extends Coffee{
    private Float remainingQuantity = 100F;
    private final Float price = 550F;

    @Override
    public Float getCoffeePrice(){
        return price;
    }

    @Override
    public Float getRemainingQuantity(){
        return remainingQuantity;
    }

    @Override
    public void setRemainingQuantity() {
        remainingQuantity -= 0.5F;
    }
}
