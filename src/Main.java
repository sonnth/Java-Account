public class Main {
        public static void main(String[] args) {
            Account account = new Account();
            account.setId(1122);
            account.setBalance(20000.0);
            account.setAnnualInterestRate(0.045);
            account.setDateCreated(115,0,10);
            System.out.println("Withdraw is: " + account.withdraw());
            System.out.println("Deposit is:  " + account.deposit(3000.0));
            System.out.println("Your account have $" + account.getBalance() + " ,your monthly interest is "
                    + account.getMonthlyInterestRate() + " and your created date is " + account.getDateCreated());
        }

    }