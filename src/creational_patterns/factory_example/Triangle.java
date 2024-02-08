package creational_patterns.factory_example;

//no access modifier means 'package-private'; this class cannot be accessed outside of factory_example
class Triangle implements Shape {
    public void draw() {
        String drawnTri = "     /\\\n";

        for(int i = 0; i < 5; i++) {

            for(int j = 2; j <= 5-i; j++) {
                drawnTri += " ";
            }

            drawnTri += "/";

            for(int j = 0; j <= i; j++) {
                drawnTri += "  ";
            }

            drawnTri += "\\\n";
        }

        for(int i = 0; i < 12; i++) {
            drawnTri += "-";
        }

        System.out.println(drawnTri);
    } //this was not very scientific

}
