package restaurent.oop;

import java.util.List;

import lombok.Getter;

public class RestaurantChain {
    private List<Store> stores;

    // 매출 계산
    public long calculateRevenue() {

        long revenue = 0;

        for (Store store : stores) {
            revenue += store.calculateRevenue();
        }
        return revenue;
    }

    // 순이익 계산
    public long calculateProfit() {
        long income = 0;

        for (Store store : stores) {
            income += store.calculateProfit();
        }
        return income;

    }

    @Getter
    class Store {
        private List<Order> orders;
        private long rentalFee; // 임대료

        public long calculateRevenue() {
            long revenue = 0;
            for (Order order : orders) {
                revenue += order.calculateRevenue();
            }
            return revenue;
        }

        public long calculateProfit() {
            long income = 0;
            for (Order order : orders) {
                income += order.calculateProfit();
            }
            return income - rentalFee;
        }
    }

    @Getter
    class Order {

        private List<Food> foods;
        private double transactionFeePercent = 0.03; // 결제 수수료 3%

        public long calculateRevenue() {

            long revenue = 0;

            for (Food food : foods) {
                revenue += food.calculateRevenue();
            }
            return revenue;
        }

        // 순이익 계산
        public long calculateProfit() {
            long income = 0;
            for (Food food : foods) {
                income += food.calculateProfit();
            }

            return (long) (income - calculateRevenue() * transactionFeePercent);

        }
    }

    @Getter
    class Food {

        private long price;
        private long originCost; // 원가

        public long calculateRevenue() {
            return price;
        }

        // 순이익 계산
        public long calculateProfit() {
            return price - originCost;

        }
    }
}
