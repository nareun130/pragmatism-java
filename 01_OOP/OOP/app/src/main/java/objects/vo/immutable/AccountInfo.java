package objects.vo.immutable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountInfo {

    // private final long id; //! 식별자가 존재 -> VO가 될 수 없다.
    private final long mileage;

    public AccountLevel getLevel() {
        if (mileage > 100_000)
            return AccountLevel.DIAMOND;
        else if (mileage > 50_000)
            return AccountLevel.GOLD;
        else if (mileage > 30_000)
            return AccountLevel.SILVER;
        else if (mileage > 100_000)
            return AccountLevel.BRAONZE;
        else
            return AccountLevel.NONE;
    }

    //* setter를 제거하고 새로운 객체를 반환
    public AccountInfo withMileage(long mileage){
        // return new AccountInfo(this.id, mileage);
        return new AccountInfo(mileage);
    }
    
    enum AccountLevel {
        DIAMOND, GOLD, SILVER, BRAONZE, NONE;
    }
}
