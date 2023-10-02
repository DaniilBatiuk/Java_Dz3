package org.example;

class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public void display() {
        System.out.println("Сума: " + dollars + " доларів і " + cents + " центів.");
    }

    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }
}
 class Product {
     private String name;
     private Money price;

     public Product(String name, Money price) {
         this.name = name;
         this.price = price;
     }

     public void reducePrice(Money reduction) {
         int newDollars = price.getDollars() - reduction.getDollars();
         int newCents = price.getCents() - reduction.getCents();

         if (newCents < 0) {
             newDollars--;
             newCents += 100;
         }

         if (newDollars < 0) {
             System.out.println("Помилка: Ціна продукту не може бути від'ємною.");
         } else {
             price.setDollars(newDollars);
             price.setCents(newCents);
             System.out.println("Ціна продукту '" + name + "' була зменшена.");
         }
     }

     public void display() {
         System.out.println("Назва продукту: " + name);
         System.out.print("Ціна продукту: ");
         price.display();
     }
 }