interface Residential {}
interface Uninhabited {}

class Transport {
    protected int a;
}

class Auto extends Transport {
    private int b;

    Auto (int a, int b) {
        this.a = a;
        this.b = b;
        int z = a * b;
        System.out.println("\n  All Residental: \n");
        System.out.println("Residential building" + " Area = " + a + " Cost = " + b + " FullCost = " + z + "\n");
    }
}

class Home extends Transport {
    private int b;
    Home (int a, int b) {
        this.a = a;
        this.b = b;
        int z = a * b;
        System.out.println("House" + " Area = " + a + " Cost = " + b + " FullCost = " + z);
    }
}
class Shop extends Transport {
    private int b;
    Shop (int a, int b) {
        this.a = a;
        this.b = b;
        int z = a * b;
        System.out.println("\n All Uninhabited: \n");
        System.out.println("Shop" + " Area = " + a + " Cost = " + b + " FullCost = " + z);
    }
}

public class Test {
    public static void main(String[] args) {
        Auto bmw = new Auto(3, 3);
        Home home = new Home(5,6);
        Shop shop = new Shop(6,2);
    }
}