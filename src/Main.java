public class Main {


    public static void main(String[] args) {
        House house1 = new House("Via Verdi 5", 4);
        House house2 = new House("Via Rosmini 23", 7);
        House house3 = new House("Via dei fiori 7", 15);

        System.out.println(house1.address + " è un condominio alto " + house1.numberOfFloors + " piani");
        System.out.println(house2.address + " è un condominio alto " + house2.numberOfFloors + " piani");
        System.out.println(house3.address + " è un condominio alto " + house3.numberOfFloors + " piani");
    }
}
