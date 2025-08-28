public class EmployeeSalarySlip {
    public static void main(String[] args) {
        
        String[] names = {"Amit", "Riya", "John"};
        int[] basicSalary = {40000, 55000, 30000};

       
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int basic = basicSalary[i];

          
            double hra = 0.20 * basic; 
            double da = 0.10 * basic;  

         
            double net = basic + hra + da;

           
            if (net > 50000) {
                double tax = 0.10 * net;
                net = net - tax;
            }

           
            System.out.println("\n--- Salary Slip ---");
            System.out.println("Employee: " + name);
            System.out.println("Basic Salary: " + basic);
            System.out.println("HRA (20%): " + hra);
            System.out.println("DA (10%): " + da);
            System.out.println("Net Salary: " + net);
        }
    }
}
