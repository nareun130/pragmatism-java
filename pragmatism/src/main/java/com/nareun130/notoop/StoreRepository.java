package com.nareun130.notoop;

import java.util.List;

public interface StoreRepository {

    List<Store> findByRestaurantId(long restaurantId);
    
}
