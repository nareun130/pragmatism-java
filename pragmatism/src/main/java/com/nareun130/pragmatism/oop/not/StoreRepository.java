package com.nareun130.pragmatism.oop.not;

import java.util.List;

public interface StoreRepository {

    List<Store> findByRestaurantId(long restaurantId);
    
}
