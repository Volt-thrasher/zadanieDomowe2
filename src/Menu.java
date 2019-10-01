public class Menu {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Mojito";
        drink1.alko = true;
        Ingredient ingredient1 = new Ingredient();
        ingredient1.name = "Vodka";
        ingredient1.volume = 50;
        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "Lime juice";
        ingredient2.volume = 50;
        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "Water";
        ingredient3.volume = 50;
        Ingredient ingredient4 = new Ingredient();
        ingredient4.name = "Mint";
        drink1.price = 16;

        System.out.println("Name: "+drink1.name);
        System.out.println("Alkohol? "+drink1.alko);
        System.out.println("Ingredients: "+ingredient1.name+" - "+ingredient1.volume+
                "\n"+ingredient2.name+" - "+ingredient2.volume+"\n"+ingredient3.name+" - "+
                ingredient3.volume+"\n"+ingredient4.name);
        System.out.println("Price: "+drink1.price+"zl");
    }
}
