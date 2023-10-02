package org.example;

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Мене звуть " + name + " і мені " + age + " років.");
    }
}

class Builder extends Human {
    private String specialization;

    public Builder(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void build() {
        System.out.println(getName() + " є будівельником зі спеціалізацією у " + specialization + ".");
        System.out.println(getName() + " будує будівлі.");
    }
}

class Sailor extends Human {
    private String shipName;

    public Sailor(String name, int age, String shipName) {
        super(name, age);
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }

    public void sail() {
        System.out.println(getName() + " є моряком на кораблі " + shipName + ".");
        System.out.println(getName() + " виконує обов'язки на кораблі.");
    }
}
class Pilot extends Human {
    private String aircraftType;

    public Pilot(String name, int age, String aircraftType) {
        super(name, age);
        this.aircraftType = aircraftType;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void fly() {
        System.out.println(getName() + " є льотчиком на літаку типу " + aircraftType + ".");
        System.out.println(getName() + " виконує польоти.");
    }
}
