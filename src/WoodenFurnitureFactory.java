class WoodenFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new WoodenChair();
    }

    @Override
    public Sofa createSofa() {
        return new WoodenSofa();
    }

    @Override
    public Table createTable() {
        return new WoodenTable();
    }
}