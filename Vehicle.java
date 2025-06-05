class Vah {
    int year;
    String model;

    Vah(int year, String model) {
        this.year = year;
        this.model = model;
    }

    void startEngine() {
        System.out.println("veh started" + year + model);
    }
}

class Car extends Vah {
    Car(int year, String model) {
        super(year, model);
    }

    void startEngine() {
        System.out.println("veh started" + year + model);
    }
}

class Truck extends Vah {
    Truck(int year, String model) {
        super(year, model);
    }

    void startEngine() {
        System.out.println("veh started" + year + model);
    }
}

class Vehicle {
    public static void main(String[] args) {
        Vah c1 = new Vah(10, "first");
        Car c2 = new Car(20, "third");
        Truck c3 = new Truck(30, "fifth");
        c1.startEngine();
        c2.startEngine();
        c3.startEngine();
    }
}