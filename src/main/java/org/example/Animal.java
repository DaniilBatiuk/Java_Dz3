package org.example;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " їсть.");
    }

    public void sleep() {
        System.out.println(name + " спить.");
    }
}

class Tiger extends Animal {
    private int numberOfStripes;

    public Tiger(String name, int numberOfStripes) {
        super(name);
        this.numberOfStripes = numberOfStripes;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void roar() {
        System.out.println(getName() + " реве.");
    }
}

class Crocodile extends Animal {
    private boolean hasSharpTeeth;

    public Crocodile(String name, boolean hasSharpTeeth) {
        super(name);
        this.hasSharpTeeth = hasSharpTeeth;
    }

    public boolean hasSharpTeeth() {
        return hasSharpTeeth;
    }

    public void swim() {
        System.out.println(getName() + " плаває.");
    }
}

class Kangaroo extends Animal {
    private double jumpHeight;

    public Kangaroo(String name, double jumpHeight) {
        super(name);
        this.jumpHeight = jumpHeight;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void jump() {
        System.out.println(getName() + " стрибає на висоту " + jumpHeight + " метра.");
    }
}

