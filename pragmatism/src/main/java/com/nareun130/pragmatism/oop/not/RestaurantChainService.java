package com.nareun130.pragmatism.oop.not;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/*
 * 이것도 절차지향적 코드
 * calcurateRevenue, calculateProfit을 실행시키기 위해 Store,Order,Food가 존재할 뿐
 */
@Service
@RequiredArgsConstructor
public class RestaurantChainService {

    private final StoreRepository storeRepository;

    public long calculateRevenue(long restaurantId) {
        List<Store> stores = storeRepository.findByRestaurantId(restaurantId);
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
}
