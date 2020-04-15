class Test {
    public static void main(String[] args) {
        Room room1 = new Room(21, 24, true);
        Room room2 = new Room(9, 29, false);
        Room room3 = new Room(9, 17, true);

        System.out.println(room1.getInfo());
        room1.decreaseTemp();
        System.out.println(room1.getInfo() + "\n");

        System.out.println(room2.getInfo());
        room2.decreaseTemp();
        System.out.println(room2.getInfo() + "\n");

        System.out.println(room3.getInfo());
        room3.decreaseTemp();
        System.out.println(room3.getInfo());
        room3.decreaseTemp();
        System.out.println(room3.getInfo());
        room3.decreaseTemp();
        System.out.println(room3.getInfo());
    }
}
