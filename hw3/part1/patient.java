public class patient extends personnel
{
    public patient(String name, String id)
    {
        super(name, id);
    }
    
    public void recover()
    {
        System.out.println("Patient is assisted by nurse and doctor");
    }
}
