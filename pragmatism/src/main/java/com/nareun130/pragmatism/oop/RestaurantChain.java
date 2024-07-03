package com.nareun130.pragmatism.oop;

import java.util.List;

//! 객체지향은 가독성 보다는 책임에 좀 더 집중한다.
//! 각 객체는 어떻게 일했는지 신경x, 제대로 해왔는지만 신경쓴다. -> 캡슐화 -> 병렬적인 처리가 가능해짐.
//! 객체지향 -> 책임을 함수가 아닌, 객체에 할당!!
/*
 * 객체지향 코드
 * ~> 비즈니스 로직을 객체가 처리하기 때문
 * 1. 객체에 어떤 메시지를 전달할 수 있다.
 * 2. 객체가 어떤 책임을 진다.
 * 3. 객체는 어떤 책임을 처리하는 방법을 스스로 안다.
 * => 어떤 요청이 들어왔을 때, 어떤 일을 책임지고 처리한다.
 * -> 높은 응집도(cohesion)
 */
public class RestaurantChain {
    private List<Store> stores;

    public long calculateRevenue() {
        long revenue = 0;
        for (Store store : stores) {
            revenue += store.calculateRevenue();
        }
        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Store store : stores) {
            income += store.calculateProfit();
        }
        return income;
    }
}

class Store {
    private List<Order> orders;
    private long rentalFee;

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
        return income;
    }
}

class Order {
    private List<Food> foods;
    private double transactionFeePercent = 0.03;// 결제 수수료

    public long calculateRevenue() {
        long revenue = 0;
        for (Food food : foods) {
            revenue += food.calculateRevenue();
        }
        return revenue;
    }

    public long calculateProfit() {
        long income = 0;
        for (Food food : foods) {
            income += food.calculateProfit();
        }
        return (long) (income - calculateRevenue() * transactionFeePercent);
    }
}

class Food {
    private long price;
    private long originCost;// 원가

    public long calculateRevenue() {
        return price;
    }

    public long calculateProfit() {
        return price - originCost;
    }
}