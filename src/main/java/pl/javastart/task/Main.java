package pl.javastart.task;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Mojito";
        drink.price = 13.0;
        drink.isAlcoholic = true;

        drink.ingredient1 = new Ingredient();
        drink.ingredient1.name = "woda";
        drink.ingredient1.amount = 120;
        drink.ingredient2 = new Ingredient();
        drink.ingredient2.name = "sok cytrynowy";
        drink.ingredient2.amount = 20;
        drink.ingredient3 = new Ingredient();
        drink.ingredient3.name = "wódka";
        drink.ingredient3.amount = 70;
        int drinkCapacity = drink.ingredient1.amount + drink.ingredient2.amount + drink.ingredient3.amount;

        System.out.printf("Drink: %s\n", drink.name);
        System.out.printf(Locale.ROOT, "Cena: %.1fzł\n", drink.price);
        System.out.printf("Czy zawiera alkohol? %b\n", drink.isAlcoholic);
        System.out.print("Składniki:\n");
        System.out.printf("%s\n", drink.ingredient1.name);
        System.out.printf("%s\n", drink.ingredient2.name);
        System.out.printf("%s\n", drink.ingredient3.name);
        System.out.printf("Pojemność: %dml", drinkCapacity);
    }
}
