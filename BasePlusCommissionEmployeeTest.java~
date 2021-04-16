public class BasePlusCommissionEmployeeTest
{
  public static void main(String[] args)
  {
    //instantiate BasePlusCommissionEmployee object
    BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
    
    //get commission employee data
    System.out.println("Employee information obtained by get methods: ");
    System.out.println("First name is: " + employee.getFirstName());
    System.out.println("Last name is: " + employee.getLastName());
    System.out.println("SSN is: " + employee.getSocialSecurityNumber());
    System.out.println("Gross sales are : "+ employee.getGrossSales());
    System.out.println("Commission rate is : " + employee.getCommissionRate()); 
    System.out.println("BaseSalary is : " + employee.getBaseSalary());  
                        
    employee.setGrossSales(5000.0);
    employee.setCommissionRate(.1);
    
    System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);
  }//end main
}//end CommissionEmployeeTest