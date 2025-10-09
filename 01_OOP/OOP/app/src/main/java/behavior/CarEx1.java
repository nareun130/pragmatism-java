package behavior;

import java.util.List;

public class CarEx1 {

    // 데이터 위주
    class Car1 {

        private Frame frame;

        private Engine engine;

        private List<Wheel> wheels;

        private float speed;

        private float direction;
    }

    // 행동위주
    class Car2 {

        public void drive() {
        }

        public void changeDirection(float amount) {
        }

        public void accelerate(float speed) {
        }

        public void decelerate(float speed) {

        }
    }

    class Frame {

    }

    class Engine {

    }

    class Wheel {

    }
}
