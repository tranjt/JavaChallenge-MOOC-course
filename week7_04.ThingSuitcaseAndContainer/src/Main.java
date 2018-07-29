
public class Main {

    public static void main(String[] Container) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        Thing tempThing;
        Suitcase tempSuitcase;
       
            for (int i = 1; i <= 100; i++) {
                tempThing = new Thing("Brick", i);
                tempSuitcase = new Suitcase(100);
                tempSuitcase.addThing(tempThing);
                container.addSuitcase(tempSuitcase);
            }       

    }

}
