package shop.no_tda;

import lombok.Getter;
import lombok.Setter;

public class Shop {

    public void sell(Account account, Product product) {
        long price = product.getPrice();
        long mileage = account.getMoney();

        if (mileage >= price) {
            account.setMoney(mileage - price);
            System.out.println(product.getName() + "을 구매.");
        } else {
            System.out.println("잔액 부족");
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
}
