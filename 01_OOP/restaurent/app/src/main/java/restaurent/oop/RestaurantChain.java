package restaurent.oop;

import java.util.List;

import lombok.Getter;

/*
 * 객체지향적 
 * 비즈니스 로직 -> 객체가 처리
 */
public class RestaurantChain implements Calculable {// ! 역할을 구현
    // ! 역할에 의존하도록
    private List<Calculable> stores;

    // 매출 계산
    public long calculateRevenue() {

        long revenue = 0;

        for (Calculable store : stores) {
            revenue += store.calculateRevenue();
        }

        return revenue;
    }

    // 순이익 계산
    public long calculateProfit() {
        long income = 0;

        for (Calculable store : stores) {
            income += store.calculateProfit();
        }

        return income;

    }

    @Getter
    class Store implements Calculable {
        private List<Calculable> orders;
        private long rentalFee; // 임대료

        public long calculateRevenue() {
            long revenue = 0;
            for (Calculable order : orders) {
                revenue += order.calculateRevenue();
            }
            return revenue;
        }

        public long calculateProfit() {
            long income = 0;
            for (Calculable order : orders) {
                income += order.calculateProfit();
            }
            return income - rentalFee;
        }
    }

    @Getter
    class Order implements Calculable {

        List<Calculable> items;
        private double transactionFeePercent = 0.03; // 결제 수수료 3%

        public long calculateRevenue() {

            long revenue = 0;

            for (Calculable item : items) {
                revenue += item.calculateRevenue();
            }
            return revenue;
        }

        // 순이익 계산
        public long calculateProfit() {
            long income = 0;

            for (Calculable item : items) {
                income += item.calculateProfit();
            }
            return (long) (income - calculateRevenue() * transactionFeePercent);

        }
    }

    @Getter
    class Food implements Calculable {

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

    class BrandProduct implements Calculable {

        private long price;
        private long originCost;

        @Override
        public long calculateRevenue() {
            return price;
        }

        @Override
        public long calculateProfit() {
            return price - originCost;
        }

    }

}
