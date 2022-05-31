
import java.io.Reader;
import java.util.Scanner;

public class Program {

    public static boolean checkBetween(int tester, int floor, int ceiling)
    {
        return((tester > floor) && (tester < ceiling));
    }

    public static String StringInput()
    {
        Scanner Read = new Scanner(System.in);
        try {
            return Read.nextLine();
        }
        catch (Exception e)
        {
            System.out.println("Error! Incorrect input, try again!");
        }
        return StringInput();
    }

    public static Integer IntegerInput()
    {
        Scanner Read = new Scanner(System.in);
        try {
            return Read.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Error! Incorrect input, try again!");
        }
        return IntegerInput();
    }

    public static String MonthInput()
    {
        Scanner Read = new Scanner(System.in);
        String Input = StringInput();

        String Checker = Input.split(" ")[1].toUpperCase();
        Integer Day = Integer.parseInt(Input.split(" ")[0]);
        System.out.println(Day);

        if (Checker.equals("FEBRUARY") || Checker.equals("MARCH") || Checker.equals("MAY") || Checker.equals("JULY") || Checker.equals("AUGUST") || Checker.equals("OCTOBER") || Checker.equals("DECEMBER")
            || Checker.equals("APRIL") || Checker.equals("JUNE") || Checker.equals("SEPTEMBER") || Checker.equals("NOVEMBER") || Checker.equals("JANUARY"))
            {
                if(checkBetween(Day, 0, 32))
                {
                    return Input;
                }
            }
        System.out.println("Error! Incorrect input, try again!");
        return MonthInput();
    }

    public static void main(String[] args) {
        EmployeeData e1  = new EmployeeData();
        Scanner Read = new Scanner(System.in);
        String tempString;
        Integer tempInt;

        System.out.println("Enter your name: ");
        tempString = StringInput();
        e1.setEmployeeFirstName(tempString);

        System.out.println("Enter your surname: ");
        tempString = StringInput();
        e1.setEmployeeSurname(tempString);

        System.out.println("Enter your annual salary: ");
        tempInt = IntegerInput();
        e1.setSalary(tempInt);

        System.out.println("Enter your super rate: ");
        tempInt = IntegerInput();
        e1.setSuperRate(tempInt);

        System.out.println("Enter your payment start date: ");
        tempString = MonthInput();
        e1.setStartDate(tempString);

        System.out.println("Enter your payment end date: ");
        tempString = MonthInput();
        e1.setEndDate(tempString);

        System.out.println(System.lineSeparator() + "~~~Your payslip has been generated: ~~~" + System.lineSeparator());

        System.out.println("Name: " + e1.getEmployeeFirstName() + " " + e1.getEmployeeSurname());
        System.out.println("Pay Period: " + e1.CalculatePayMonth());
        System.out.println("Gross Income: " + e1.CalculateGrossPay());
        System.out.println("Income Tax: " + e1.CalculateIncomeTax());
        System.out.println("Net Income: " + e1.CalculateNetIncome());
        System.out.println("Super: " + e1.CalculateSuper());

        System.out.println("~~~Thank you!~~~");
    }
}