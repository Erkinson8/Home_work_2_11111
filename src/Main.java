public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Address address = new Address("Bishkek", "Ibraimova 26");

        Officer objectA = new Officer(1, address, Rank.CAPTAIN);
        System.out.println("\nObjectA (Captain):");
        System.out.println("Id: " + objectA.getId());
        System.out.println("Address: " + objectA.getAddress().getCity() + ',' + objectA.getAddress().getStreet());
        System.out.println("Rank: " + objectA.getRank());
        objectA.Order2();
        System.out.println(objectA.getInfo("Умный"));

        Senior_officer objectB = new Senior_officer(2,address, Rank.GENERAL, "Manas Manasov");
        System.out.println("\nObjectB (General):");
        System.out.println("Id: " + objectB.getId());
        System.out.println("Address: " + objectB.getAddress().getCity() + ',' + objectB.getAddress().getStreet());
        System.out.println("Rank: " + objectB.getRank());
        System.out.println("Name: " + objectB.getName());
        objectB.Order();
        System.out.println(objectB.getInfo("Опытный"));

        Senior_officer objectC = new Senior_officer(3,new Address("Osh", "Centralnaya 1"),
                Rank.MARSHAL, "Baatyr Baatyrov", 40);
        System.out.println("\nObjectC (MARSHAL):");
        System.out.println("Address: " + objectC.getAddress().getCity() + ',' + objectC.getAddress().getStreet());
        System.out.println("Id: " + objectC.getId());
        System.out.println("Rank: " + objectC.getRank());
        System.out.println("Name: " + objectC.getName());
        System.out.println("Experience: " + objectC.getExperience());
        objectC.Order1();
        objectC.Gratitude();
        System.out.println(objectC.getInfo("Мудрый"));

    }

}