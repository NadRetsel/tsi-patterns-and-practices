package creational_patterns.factory_example;

public class ShapeFactory {
        public static Shape createShape(String shapeRequired) {
            if(shapeRequired.equals("Rectangle")) {
                return new Rectangle();
            } else {
                return new Triangle();
            }
        }

        public static void main(String[] args){
            Shape triangle = ShapeFactory.createShape("Triangle");
            triangle.draw();
        }
}
