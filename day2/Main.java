// 2. Payment Project


import java.util.Scanner;

abstract class Payment {
    public abstract void pay();
    public abstract void printReciept();
}

class Card extends Payment {

    public String cardNum;
    public String cvv;
    public String expDate;

    
    boolean paymentSuccess = false;
    String Mno, Dot, Amt;

    Card(String cardNum, String cvv, String expDate) {
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.expDate = expDate;
    }

    public void pay() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Card Number: ");
        String cardnum = sc.nextLine();

        System.out.print("Enter the CVV : ");
        String Cvv = sc.nextLine();

        System.out.print("Enter the Expiry Date : ");
        String exp = sc.nextLine();

        System.out.println("------------------------------------");

        System.out.print("Enter the Mobile No : ");
        Mno = sc.nextLine();

        System.out.print("Enter the Date Of Transaction : ");
        Dot = sc.nextLine();

        System.out.print("Enter the Amount : ");
        Amt = sc.nextLine();

        if (!cardnum.equals(cardNum) || !Cvv.equals(cvv) || !exp.equals(expDate)) {
            System.out.println("Entered credentials are invalid!");
            System.out.println("------------------------------------");
            paymentSuccess = false;
        } else {
            System.out.println("Payment successful");
            System.out.println("------------------------------------");
            paymentSuccess = true;
        }
    }

    public void printReciept() {
        if (paymentSuccess) {
            System.out.println("-------PAYMENT DETAILS---------");
            System.out.println("Mobile Number: " + Mno);
            System.out.println("Date of Transaction: " + Dot);
            System.out.println("Amount: " + Amt);
        } else {
            System.out.println("-------PAYMENT FAILED---------");
        }
    }
}

class UPI extends Payment {

    public String UpiId;
    public String BankName;
   
    boolean paymentSuccess = false;
    String Mno, Dot, Amt;

    UPI(String UpiId, String BankName) {
        this.UpiId = UpiId;
        this.BankName = BankName;
    }

    public void pay() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the UPI Id: ");
        String upiid = sc.nextLine();

        System.out.print("Enter the Bank Name : ");
        String bankname = sc.nextLine();


        System.out.println("------------------------------------");

        System.out.print("Enter the Mobile No : ");
        Mno = sc.nextLine();

        System.out.print("Enter the Date Of Transaction : ");
        Dot = sc.nextLine();

        System.out.print("Enter the Amount : ");
        Amt = sc.nextLine();

        if (!UpiId.equals(upiid) || !BankName.equals(bankname)) {
            System.out.println("Entered credentials are invalid!");
            System.out.println("------------------------------------");
            paymentSuccess = false;
        } else {
            System.out.println("Payment successful");
            System.out.println("------------------------------------");
            paymentSuccess = true;
        }
    }

    public void printReciept() {
        if (paymentSuccess) {
            System.out.println("-------PAYMENT DETAILS---------");
            System.out.println("Mobile Number: " + Mno);
            System.out.println("Date of Transaction: " + Dot);
            System.out.println("Amount: " + Amt);
        } else {
            System.out.println("-------PAYMENT FAILED---------");
        }
    }
}

class Wallet extends Payment {

    public String number;
    public String BankName;
   
    boolean paymentSuccess = false;
    String Mno, Dot, Amt;

    Wallet(String number, String BankName) {
        this.number = number;
        this.BankName = BankName;
    }

    public void pay() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Wallet Number: ");
        String wal = sc.nextLine();

        System.out.print("Enter the Bank Name : ");
        String bankname = sc.nextLine();


        System.out.println("------------------------------------");

        System.out.print("Enter the Mobile No : ");
        Mno = sc.nextLine();

        System.out.print("Enter the Date Of Transaction : ");
        Dot = sc.nextLine();

        System.out.print("Enter the Amount : ");
        Amt = sc.nextLine();

        if (!wal.equals(number) || !BankName.equals(bankname)) {
            System.out.println("Entered credentials are invalid!");
            System.out.println("------------------------------------");
            paymentSuccess = false;
        } else {
            System.out.println("Payment successful");
            System.out.println("------------------------------------");
            paymentSuccess = true;
        }
    }

    public void printReciept() {
        if (paymentSuccess) {
            System.out.println("-------PAYMENT DETAILS---------");
            System.out.println("Mobile Number: " + Mno);
            System.out.println("Date of Transaction: " + Dot);
            System.out.println("Amount: " + Amt);
        } else {
            System.out.println("-------PAYMENT FAILED---------");
        }
    }
}

class Netbanking extends Payment {

    public String accNum;
    public String cardNum;
    public String OTP;
   
    boolean paymentSuccess = false;
    String Mno, Dot, Amt;

    Netbanking(String accNum, String cardNum, String OTP) {
        this.accNum = accNum;
        this.cardNum = cardNum;
        this.OTP = OTP;
    }

    public void pay() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account Number: ");
        String acc = sc.nextLine();

        System.out.print("Enter the Card Number : ");
        String cardnum = sc.nextLine();

        System.out.print("Enter the OTP : ");
        String otp = sc.nextLine();

        System.out.println("------------------------------------");

        System.out.print("Enter the Mobile No : ");
        Mno = sc.nextLine();

        System.out.print("Enter the Date Of Transaction : ");
        Dot = sc.nextLine();

        System.out.print("Enter the Amount : ");
        Amt = sc.nextLine();

        if (!cardNum.equals(cardnum) || !accNum.equals(acc) || !OTP.equals(otp)) {
            System.out.println("Entered credentials are invalid!");
            System.out.println("------------------------------------");
            paymentSuccess = false;
        } else {
            System.out.println("Payment successful");
            System.out.println("------------------------------------");
            paymentSuccess = true;
        }
    }

    public void printReciept() {
        if (paymentSuccess) {
            System.out.println("-------PAYMENT DETAILS---------");
            System.out.println("Mobile Number: " + Mno);
            System.out.println("Date of Transaction: " + Dot);
            System.out.println("Amount: " + Amt);
        } else {
            System.out.println("-------PAYMENT FAILED---------");
        }
    }
}


class Main {
    public static void main(String[] args) {
        Card c1 = new Card("81000186", "233", "23/02/2027");
        c1.pay();
        c1.printReciept();
        
        UPI u1 = new UPI("anurag@oksbi", "SBI");
        u1.pay();
        u1.printReciept();
        
        Wallet w1 = new Wallet("220164", "icici");
        w1.pay();
        w1.printReciept();
        
        Netbanking n1 = new Netbanking("5428140975", "2222", "1105");
        n1.pay();
        n1.printReciept();
    }
}