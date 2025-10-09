package objects.vo.mutable;

public class AccountInfo {

    private long mileage;

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

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

    
    enum AccountLevel {
        DIAMOND, GOLD, SILVER, BRAONZE, NONE;
    }
}
