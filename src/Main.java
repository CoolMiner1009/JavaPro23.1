public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new WoodenFurnitureFactory();

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        Table table = factory.createTable();

        chair.sitOn();
        sofa.lieOn();
        table.putOn();
    }
}