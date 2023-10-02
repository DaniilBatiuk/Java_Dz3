package org.example;

class Device {
    private String name;
    private String description;

    public Device(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void Sound() {
        System.out.println(name + " видає звук.");
    }

    public void Show() {
        System.out.println("Назва пристрою: " + name);
    }

    public void Desc() {
        System.out.println("Опис пристрою: " + description);
    }
}

class Kettle extends Device {
    public Kettle(String name, String description) {
        super(name, description);
    }
}

class Microwave extends Device {
    public Microwave(String name, String description) {
        super(name, description);
    }
}

class Car extends Device {
    public Car(String name, String description) {
        super(name, description);
    }
}

class Steamboat extends Device {
    public Steamboat(String name, String description) {
        super(name, description);
    }
}
