# 1-1 절차지향
## 현재 패키지의 RestaurantChain은 절차지향적 코드
1. RestaurantChain의 클래스와 객체들이 calculateRevenue, calculateProfit을 실행하기 위한 데이터로서 존재할 뿐.
2. Store, Order, food 클래스는 존재하기만 할 뿐 아무런 책임이 없음. 단순 data를 실어 나르는 용도
3. 모든 멤버 변수들이 private이라 C언어의 구조체보다 사용하기 불편함.

=> 우리가 해왔던 스프링 프로젝트를 생각해보자. 모든 비즈니스 로직이 서비스에 들어가 있진 않았나?

## RestaurantChainService - 일반적인 절차지향적 서비스(우리가 흔히 접하는 서비스)
1. 서비스에 모든 비즈니스 로직이 담기고
2. 클래스는 그저 데이터를 저장하는 용도

=> 우리는 많은 프로젝트에서 레이어드 아키텍처(layered architecture)는 미명하에 절차지향적 코드를 보고 있다.