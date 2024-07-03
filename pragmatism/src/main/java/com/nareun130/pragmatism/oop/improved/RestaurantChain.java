package com.nareun130.pragmatism.oop.improved;

import java.util.List;

/*
 * 객체에 할당된 책임 -> 인터페이스로 분리 => 추상화의 원리 -> 다형성을 지원
 * 객체지향에서는 책임을 객체에 할당x, 추상화한 역할에 책임을 할당!
 */
public class RestaurantChain implements Calculable {

    private List<Calculable> stores;

    @Override
    public long calculateRevenue() {
        long revenue = 0;
        for (Calculable store : stores) {
            revenue += store.calculateRevenue();
        }
        return revenue;
    }

    @Override
    public long calculateProfit() {
        long income = 0;
        for (Calculable store : stores) {
            income += store.calculateProfit();
        }
        return income;
    }

}

class Store implements Calculable {

    private List<Calculable> orders;
    private long rentalFee;// 임대료

    @Override
    public long calculateRevenue() {
        long revenue = 0;
        for (Calculable order : orders) {
            revenue += order.calculateRevenue();
        }
        return revenue;
    }

    @Override
    public long calculateProfit() {
        long income = 0;
        for (Calculable order : orders) {
            income += order.calculateProfit();
        }
        return income - rentalFee;
    }
}

class Order implements Calculable {
    private List<Calculable> foods;
    private double transactionFeePercent = 0.03;

    @Override
    public long calculateRevenue() {
        long revenue = 0;
        for (Calculable food : foods) {
            revenue += food.calculateRevenue();
        }
        return revenue;
    }

    @Override
    public long calculateProfit() {
        long income = 0;
        for (Calculable food : foods) {
            income += food.calculateProfit();
        }
        return (long) (income - calculateRevenue() * transactionFeePercent);
    }
}

class Food implements Calculable {
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