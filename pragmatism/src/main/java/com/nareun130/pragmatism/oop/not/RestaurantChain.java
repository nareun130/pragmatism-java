package com.nareun130.pragmatism.oop.not;

import java.util.List;

import lombok.Getter;

/*
 * 절자치향적 코드
 * c언어의 구조체와 별반다를바 없다.
 * 오히려 멤버변수가 private으로 모두 선언되어 있어서 구조체보다 사용하기 어렵다.
 */

public class RestaurantChain {
    private List<Store> stores;

    // 매출 계산 함수
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

    // 순이익 계산 함수
    public long calculateProfit() {
        // 드는 비용
        long cost = 0;
        for (Store store : stores) {
            for (Order order : store.getOrders()) {
                long orderPrice = 0;
                for (Food food : order.getFoods()) {
                    orderPrice += food.getPrice();
                    cost += food.getOriginCost();
                }
                // 결제 금액의 3%를 비용으로 잡는다.
                cost += orderPrice * order.getTransactionFeePercent();
            }
            cost += store.getRentalFee();
        }
        //총 매출 - 드는 비용
        return calculateRevenue() - cost;

    }
}

@Getter
class Store {
    private List<Order> orders;
    private long rentalFee;// 임대료
}

@Getter
class Order {
    private List<Food> foods;
    private double transactionFeePercent = 0.03;// 결제 수수료 0.3%
}

@Getter
class Food {
    private long price;
    private long originCost; // 원가
}