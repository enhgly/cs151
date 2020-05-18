import java.util.*;

public class Employee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static class compareByName implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    }

    public static ArrayList<Employee> clone(ArrayList<Employee> arr) {
        ArrayList<Employee> temp = new ArrayList<Employee>();
        for (int i = 0; i < arr.size(); i++)
            temp.add(arr.get(i));
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> arr = new ArrayList<Employee>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter id: ");
            int id = scan.nextInt();
            System.out.print("Enter name: ");
            scan.nextLine();
            String name = scan.nextLine();
            arr.add(new Employee(id, name));
        }
        ArrayList<Employee> cloneArray = clone(arr);
        Collections.sort(arr, new compareByName());
        System.out.println("Array after cloning: ");
        for (int i = 0; i < cloneArray.size(); i++) {
            System.out.println(cloneArray.get(i).getId() + " " + cloneArray.get(i).getName());
        }
        System.out.println("Array after sorting: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getId() + " " + arr.get(i).getName());
        }
    }
}