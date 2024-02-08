package creational_patterns.factory_example;

//no access modifier means 'package-private'; this class cannot be accessed outside of factory_example
class Rectangle implements Shape {
    public void draw() {
        String drawnSquare = horizontalBorder() + "\n";

        for(int i = 0; i < 5; i++) {
            drawnSquare += "|     |\n";
        }

        drawnSquare += horizontalBorder();

        System.out.println(drawnSquare);
    }

    private String horizontalBorder() {
        String toReturn = "+";
        for(int i = 0; i < 5; i++) {
            toReturn += "-";
        }
        toReturn += "+";
        return toReturn;
    }
}
