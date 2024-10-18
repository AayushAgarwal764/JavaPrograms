import java.util.Scanner;

class D {
    private int dd = 0;
    private int mm = 0;
    private int yyyy = 0;

    public void setDate(int dd, int mm, int yyyy) {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }

    public String getDate() {
        String currentDate = dd + "/" + mm + "/" + yyyy;
        return currentDate;
    }
}

class ticketSystem {
    String beginningLocation;
    String endingLocation;

    D dateOfTravel;

    public ticketSystem() {
        this.beginningLocation = "Pune";
        this.endingLocation = "Mumbai";

        this.dateOfTravel = new D();
        this.dateOfTravel.setDate(1, 1, 2024);

    }

    public void checkForAvailableTickets(String beginningLocation, String endingLocation, D dateOfTravel) {
        int flagTicketsAvailable = 0;

        if (flagTicketsAvailable == 0) {
            System.out.println("Sorry, no tickets are available");
        }
    }

    public void bookNewTickets() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Beginning Location:");
        this.beginningLocation = sc.nextLine();

        System.out.println("Enter your Destination:");
        this.endingLocation = sc.nextLine();

        System.out.println("Enter Date of Travel [int dd-mm-yyyy format]:");
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();

        sc.close();

        this.dateOfTravel.setDate(dd, mm, yyyy);

        this.checkForAvailableTickets(this.beginningLocation, this.endingLocation, this.dateOfTravel);

    }

}

public class busTicketSystem {
    public static void main(String[] args) {

    }
}
