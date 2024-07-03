package com.nareun130.not_oop;

import java.util.List;

public interface StoreRepository {

    List<Store> findByRestaurantId(long restaurantId);
    
}
