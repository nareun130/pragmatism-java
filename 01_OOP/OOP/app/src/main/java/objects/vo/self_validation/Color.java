package objects.vo.self_validation;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode
@RequiredArgsConstructor
public class Color {
    
    public final int r;
    public final int g;
    public final int b;

    /*
     * 자가 검증 x
     * 1. 색상을 Hex 표기로 변환 #을 포함 7자리
     * 2. r값이 0~255 범위를 벗어남.
      */
    public String toHex(){
        // int 값을 16진수로 
        //%02 : 숫자를 최소 2자리의 16진수로 출력
        return String.format("#%02x%02x%02x", r,g,b);
    }

    public static void main(String[] args) {
        System.out.println(new Color(300,0,0).toHex());
    }
}
