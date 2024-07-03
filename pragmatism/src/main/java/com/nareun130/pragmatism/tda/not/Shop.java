package com.nareun130.not_tda;

import lombok.Getter;
import lombok.Setter;

//* TDA(Tell, Don't Ask) : 물어보지 말고 시켜라 -> 객체에게 값에 관해 물어보지 말고 일을 시켜라
public class Shop {

    public void sell(Account account, Product product) {
        long price = product.getPrice();
        long mileage = account.getMoney();
        if (mileage >= price) {
            account.setMoney(mileage - price);
            System.out.println(product.getName() + "을 구매함.");
        } else {
            System.out.println("잔액 부족");
        }
    }
}

@Getter
@Setter
class Account {
    private long money;
}

@Getter
@Setter
class Product {
    private String name;
    private long price;
}