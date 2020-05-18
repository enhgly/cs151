public class NewYorkStyle extends Pizza {
    @Override
    public void makeCrust() {
        System.out.println("making New York style crust");
    }

    @Override
    public void addToppings() {
        System.out.println("adding New York style toppings");
    }

    @Override
    public void preHeatOven() {
        System.out.println("Preheating oven for New York style pizza");
    }

    @Override
    public void cook() {
        System.out.println("Cooking New York style pizza");
    }
}
