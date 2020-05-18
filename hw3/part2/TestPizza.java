public class TestPizza
{
    public static void main(String[] args)
    {
        ChicagoStyle chicago = new ChicagoStyle();
        CaliforniaStyle california = new CaliforniaStyle();
        NewYorkStyle newYork = new NewYorkStyle();
        
        System.out.println("*Testing Chicago Style*");
        chicago.makeFromScratch();
        System.out.println();
        
        System.out.println("*Testing California Style*");
        california.makeFromScratch();
        System.out.println();
        
        System.out.println("*Testing New York Style*");
        newYork.makeFromScratch();
        System.out.println();
    }
}
