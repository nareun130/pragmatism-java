package behavior;

public class CarEx2 {

    class Car {

        // * 구현을 고민하면서 속성이 생김.
        private int degree;// 자동차의 각도(0~360도)

        public void drive() {
        }

        public float changeDirection(float amount) {
            float result = (degree + amount) % 360;
            if (result < 0) {
                result += 360;
            } 
            return result;
        }

        public void accelerate(float speed) {
        }

        public void decelerate(float speed) {

        }
    }
}
