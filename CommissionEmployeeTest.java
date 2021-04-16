public class CommissionEmployeeTest
{
  public static void main(String[] args)
  {
    //instantiate CommissionEmployee object
   CommissionEmployee employee = new CommissionEmployee("Sue","Jones","222-22-2222",10000,.06);
    
    //get commission employee data
System.out.println("Employee information obtained by get methods:");
    System.out.printf("%n%s %s%n", "First name is",employee.getFirstName());
    System.out.printf("%n%s %s%n", "Last name is",employee.getLastName());
    System.out.printf("%n%s %s%n", "Social Security Number is",employee.getSocialSecurityNumber());
    System.out.printf("%n%s %s%n", "Gross Sales is",employee.getGrossSales());
    System.out.printf("%n%s %s%n", "Commission Rate is",employee.getCommissionRate());
    //set gross sales to 5000.0 and commission to .1                    
 employee.setGrossSales(5000);
 employee.setCommissionRate(.1);
    
    System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);
  }//end main
}//end CommissionEmployeeTest