package restaurent.procedure;

import java.util.List;

import lombok.Getter;

public class RestaurantChain {
    private List<Store> stores;

    @Getter
    class Store {

        private List<Order> orders;
        private long rentalFee; // 임대료
    }

    @Getter
    class Order {

        private List<Food> foods;
        private double transactionFeePercent = 0.03; // 결제 수수료 3%

    }

    @Getter
    class Food {

        private long price;
        private long originCost; // 원가
    }

    // 매출 계산
    public long calculateRevenue() {

        long revenue = 0;

        for (Store store : stores) {
            for (Order order : store.getOrders()) {
                for (Food food : order.getFoods()) {
                    revenue += food.getPrice();
                }
            }
        }
        return revenue;
    }

    // 순이익 계산
    public long calculateProfit() {
        long cost = 0;
        for (Store store : stores) {
            for (Order order : store.getOrders()) {
                long orderPrice = 0;
                for (Food food : order.getFoods()) {
                    orderPrice += food.getPrice();
                    cost += food.getOriginCost();
                }
                // 결제 금액의 3%를 비용으로 잡음.
                cost += orderPrice * order.getTransactionFeePercent();
            }
            cost += store.getRentalFee();
        }
        return calculateRevenue() - cost;
    }

}
