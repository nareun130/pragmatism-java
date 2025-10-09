package objects.vo.mutable;

import lombok.Data;

@Data
public class Rectangle extends Shape {

    //* 불변이 아니다. */
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
}
