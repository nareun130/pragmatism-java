package solid.lsk;

public class Squre extends Rectangle {

    public Squre(long length) {
        super(length, length);
    }

    /* 
     * 이렇게 변환하면 Square는 기본 클래스를 대체 가능? 
     * -> NO, 기본 클래스 의도를 위반한 것일 수도 있어서
     * 일반 적으로 setter는 다른 속성은 건드리지 않고 내가 원하는 특정 속성값만 그대로 치환
    */
    @Override
    public void setHeight(long height) {
        super.width = height;
        super.height = height;
    }

    @Override
    public void setWidth(long width) {
        super.width = width;
        super.height = width;
    }

}
