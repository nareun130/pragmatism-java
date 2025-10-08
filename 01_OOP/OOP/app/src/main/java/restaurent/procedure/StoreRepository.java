package restaurent.procedure;

import java.util.List;

import org.springframework.stereotype.Repository;

import restaurent.procedure.RestaurantChain.Store;

@Repository
public interface StoreRepository {
    
    List<Store> findByRestaurantId(Long restaurantId);
}
