package com.nareun130.pragmatism.object.vo;

import java.util.Objects;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

//* VO : 객체지만 동시에 값 
//* 불변성& 동등성& 자가 검증 -> 값 객체
@EqualsAndHashCode
@RequiredArgsConstructor
public class Color {
    public final int r;
    public final int g;
    public final int b;

    // * 이렇게 구성되면 자가검증 x -> 색삼ㅇ 검증 - #포함 7자리 ~> 8자리가 나와버림
    public String toHex() {
        return String.format("#%02x%02x%02x", r, g, b);
    }
    // public Color(int r, int g, int b) {
    //     if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
    //         throw new IllegalArgumentException("RGB should be 0 to 255");
    //     }
    //     this.r = r;
    //     this.g = g;
    //     this.b = b;
    // }

    //* 아래 메서드로 동등성을 보장
    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) {
    //         return true;
    //     }
    //     if (o == null || getClass() != o.getClass()) {
    //         return false;
    //     }
    //     final Color color = (Color) o;
    //     return r == color.r && g == color.g && b == color.b;
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(r, g, b);
    // }
    
}
