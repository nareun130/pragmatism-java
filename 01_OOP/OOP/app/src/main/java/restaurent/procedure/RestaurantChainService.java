package restaurent.procedure;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import restaurent.procedure.RestaurantChain.Food;
import restaurent.procedure.RestaurantChain.Order;
import restaurent.procedure.RestaurantChain.Store;


/*
 * 우리가 흔히 접하는 Service
 * 서비스 로직에서 모든 비즈니스 로직을 처리
 * 클래스는 그저 data를 저장하는 용도
 * => 절차지향적
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

    public long calculateProfit(long restaurantId) {
        List<Store> stores = storeRepository.findByRestaurantId(restaurantId);
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
        return calculateRevenue(restaurantId) - cost;
    }

}
