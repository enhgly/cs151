public class ChicagoStyle extends Pizza {
    @Override
    public void makeCrust() {
        System.out.println("making Chicago style crust");
    }

    @Override
    public void addToppings() {
        System.out.println("adding Chicago style toppings");
    }

    @Override
    public void preHeatOven() {
        System.out.println("Preheating oven for Chicago style pizza");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Chicago style pizza");
    }
}
