package shop.tda;

import lombok.Getter;

public class Shop {

    public void sell(Account account, Product product) {

        if (account.canAfford(product.getPrice())) {
            account.withdraw(product.getPrice());
            System.out.println(product.getName() + "을 구매.");
        } else {
            System.out.println("잔액 부족");
        }
    }

    class Account {
        private long money;

        public boolean canAfford(long amount) {
            return money >= amount;
        }

        public void withdraw(long amount) {
            money -= amount;
        }
    }

    @Getter
    class Product {
        private String name;
        private long price;
    }
}
