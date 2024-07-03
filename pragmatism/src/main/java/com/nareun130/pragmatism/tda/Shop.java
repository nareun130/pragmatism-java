package com.nareun130.tda;

public class Shop {

    public void sell(Account account, Product product) {
        //* Account 객체에게 일을 시킴
        if (account.canAfford(product.getPrice())) {
            account.withdraw(product.getPrice());
            System.out.println(product.getName() + "을 구매.");
        } else {
            System.out.println("잔액 부족");
        }
    }
}

//! 불필요한 getter, setter가 사라짐.
class Account {
    private long money;

    //* TDA원칙에 따라 객체가 일을 함. -> 책임을 짐. 
    public boolean canAfford(long amount) {
        return money >= amount;
    }

    public void withdraw(long amount) {
        money -= amount;
    }
}

class Product {
    private String name;
    private long price;

    public long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}