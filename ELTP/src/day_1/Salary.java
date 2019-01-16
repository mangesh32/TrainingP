package day_1;

public class Salary {

	public static void main(String[] args) {
		double basicSalary=10000;
		double dearnessAllowance=basicSalary*10/100;
		double houserentAllowance=basicSalary*7/100;
		double grossSalary=basicSalary+dearnessAllowance+houserentAllowance;
		double incomeTax=grossSalary*8/100;
		double netSalary=grossSalary-incomeTax;
		
		System.out.println("Basic Salary:"+basicSalary);
		System.out.println("Dearness Allowance:"+dearnessAllowance);
		System.out.println("HouseRent Allowance:"+houserentAllowance);
		System.out.println("Gross Salary:"+grossSalary);
		System.out.println("Income Tax:"+incomeTax);
		System.out.println("Net Salary:"+netSalary);

	}

}
