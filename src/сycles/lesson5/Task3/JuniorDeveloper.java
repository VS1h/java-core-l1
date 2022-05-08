package сycles.lesson5.Task3;

public class JuniorDeveloper {
    public static void main(String[] args) {

        double money = 600;
        int month = 38;
        calculateFinance(600.0, 0.1, 38);
    }


    static void calculateFinance(double startSalary, double percent, int month) {
        double salary = startSalary;
        double bankAcc = 0;
        double investAccount = 0;
        for (int i = 1; i < month + 1; i++) {
            if (i == 7 || i == 13 || i == 19 || i == 25 || i == 31 || i == 37) {
                salary += 400;
            }

            double invest = salary * percent;
            double moneyInKarmane = salary - invest - 300;

            bankAcc += moneyInKarmane;
            investAccount += invest + investAccount * 0.02;

        }
        System.out.println("Vanya'll have bank account in 3 years 2 month - " + bankAcc + "$");
        System.out.println("Vanya'll have invest account in 3 years 2 month - " + investAccount + "$");
        System.out.println("Vanya'll have salary in month - " + salary + "$");

    }
}

