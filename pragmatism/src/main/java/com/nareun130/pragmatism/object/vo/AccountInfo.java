package com.nareun130.pragmatism.object.vo;

import lombok.AllArgsConstructor;

//* 불변성을 보여주는 코드
@AllArgsConstructor
public class AccountInfo {

    //! VO에는 식별자를 넣어서는 안된다! -> 동등성과 식별자는 의미상 충돌이 생길 수 밖에 없다.
    // private final long id; 
    // private long mileage;
    private final long mileage;

    public AccountLevel getLevel() {
        if (mileage > 100_000)
            return AccountLevel.DIAMOND;
        else if (mileage > 50_000)
            return AccountLevel.GOLD;
        else if (mileage > 30_000)
            return AccountLevel.SILVER;
        else if (mileage > 10_000)
            return AccountLevel.BRONZE;
        else
            return AccountLevel.NONE;
    }
    // * setter로 인해 멀티 스레드 환경에서 불변성이 깨짐
    // public void setMileage(long mileage){
    // this.mileage = mileage;
    // }

    // * setter가 사라진 대신 변경 요청이 들어올 대 새로운 객체를 반환하는 메서드 추가
    public AccountInfo withMileage(long mileage) {
        return new AccountInfo(mileage);
    }
}

enum AccountLevel {
    DIAMOND, GOLD, SILVER, BRONZE, NONE;
}