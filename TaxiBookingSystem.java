package JDBC.Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

class Booking {
    String Pickup_Location;
    String Drop_Location;
    Long phone_no;

    Booking(String Pickup_Location, String Drop_Location, Long phone_no) {
        this.Pickup_Location = Pickup_Location;
        this.Drop_Location = Drop_Location;
        this.phone_no = phone_no;
    }

    static void cab(Connection con, Scanner sc) {
        try {
            String query = ("INSERT INTO cab(PICKUP_LOCATION, DROP_LOCATION, PHONE_NO, PAYMENT) VALUES(?,?,?,?)");
            con.setAutoCommit(false);

            try (PreparedStatement p = con.prepareStatement(query)) {
                System.out.println("Please enter you pickup location");
                String pickup = sc.nextLine();
                System.out.println("Please enter you Drop location");
                String drop = sc.nextLine();
                System.out.println("Enter your phone number");
                Long phonno = sc.nextLong();
                sc.nextLine();

                Booking obj = new Booking(pickup, drop, phonno);

                Random r = new Random();
                int r2 = 150;
                int r3 = 200;
                int r4 = 1;
                int r5 = 10;
                int pay = r.nextInt(((r3 - r2 + 1)) + r2);
                System.out.println("please pay the amount " + pay);
                int payment = sc.nextInt();
                sc.nextLine();

                int driver = r.nextInt(1000);
                int minutes = r.nextInt(((r5 - r4 + 1)) + r4);

                p.setString(1, pickup);
                p.setString(2, drop);
                if (phonno >= 1_000_000_000L && phonno <= 9_999_999_999L) {
                    p.setLong(3, phonno);
                }else{
                    System.out.println("Please enter valid number");
                }
                p.setInt(4, pay);

                int rowsaffect = p.executeUpdate();
                if (rowsaffect > 0 && payment == pay) {
                    con.commit();
                    System.out.println("Payment successfull");
                    System.out.println("Your cab is booked");
                    System.out.println("Driver " + driver + " is coming in " + minutes + " minutes");
                } else {
                    con.rollback();
                    System.out.println("Payment failed");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void cabPremium(Connection con, Scanner sc) {
        try {
            String query = ("INSERT INTO cabpremium(PICKUP_LOCATION, DROP_LOCATION, PHONE_NO, PAYMENT) VALUES(?,?,?,?)");
            con.setAutoCommit(false);

            try (PreparedStatement p = con.prepareStatement(query)) {
                System.out.println("Please enter you pickup location");
                String pickup = sc.nextLine();
                System.out.println("Please enter you Drop location");
                String drop = sc.nextLine();
                System.out.println("Enter your phone number");
                Long phonno = sc.nextLong();
                sc.nextLine();

                Booking obj = new Booking(pickup, drop, phonno);

                Random r = new Random();
                int r2 = 200;
                int r3 = 300;
                int r4 = 1;
                int r5 = 10;
                int pay = r.nextInt(((r3 - r2 + 1)) + r2);
                System.out.println("please pay the amount " + pay);
                int payment = sc.nextInt();
                sc.nextLine();

                int driver = r.nextInt(1000);
                int minutes = r.nextInt(((r5 - r4 + 1)) + r4);

                p.setString(1, pickup);
                p.setString(2, drop);
                if (phonno >= 1_000_000_000L && phonno <= 9_999_999_999L) {
                    p.setLong(3, phonno);
                }else{
                    System.out.println("Please enter valid number");
                }
                p.setInt(4, pay);

                int rowsaffect = p.executeUpdate();
                if (rowsaffect > 0 && payment == pay) {
                    con.commit();
                    System.out.println("Payment successfull");
                    System.out.println("Your cabPremium is booked");
                    System.out.println("Driver " + driver + " is coming in " + minutes + " minutes");
                } else {
                    con.rollback();
                    System.out.println("Payment failed");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void auto(Connection con, Scanner sc) {
        try {
            String query = ("INSERT INTO auto(PICKUP_LOCATION, DROP_LOCATION, PHONE_NO, PAYMENT) VALUES(?,?,?,?)");
            con.setAutoCommit(false);

            try (PreparedStatement p = con.prepareStatement(query)) {
                System.out.println("Please enter you pickup location");
                String pickup = sc.nextLine();
                System.out.println("Please enter you Drop location");
                String drop = sc.nextLine();
                System.out.println("Enter your phone number");
                Long phonno = sc.nextLong();
                sc.nextLine();

                Booking obj = new Booking(pickup, drop, phonno);

                Random r = new Random();
                int r2 = 20;
                int r3 = 100;
                int r4 = 1;
                int r5 = 6;
                int pay = r.nextInt(((r3 - r2 + 1)) + r2);
                System.out.println("please pay the amount " + pay);
                int payment = sc.nextInt();
                sc.nextLine();

                int driver = r.nextInt(1000);
                int minutes = r.nextInt(((r5 - r4 + 1)) + r4);

                p.setString(1, pickup);
                p.setString(2, drop);
                if (phonno >= 1_000_000_000L && phonno <= 9_999_999_999L) {
                    p.setLong(3, phonno);
                }else{
                    System.out.println("Please enter valid number");
                }
                p.setInt(4, pay);

                int rowsaffect = p.executeUpdate();
                if (rowsaffect > 0 && payment == pay) {
                    con.commit();
                    System.out.println("Payment successfull");
                    System.out.println("Your auto is booked");
                    System.out.println("Driver " + driver + " is coming in " + minutes + " minutes");
                } else {
                    con.rollback();
                    System.out.println("Payment failed");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static void bike(Connection con, Scanner sc) {
        try {
            String query = ("INSERT INTO bike(PICKUP_LOCATION, DROP_LOCATION, PHONE_NO, PAYMENT) VALUES(?,?,?,?)");
            con.setAutoCommit(false);

            try (PreparedStatement p = con.prepareStatement(query)) {
                System.out.println("Please enter you pickup location");
                String pickup = sc.nextLine();
                System.out.println("Please enter you Drop location");
                String drop = sc.nextLine();
                System.out.println("Enter your phone number");
                long phonno = sc.nextLong();
                sc.nextLine();

                Booking obj = new Booking(pickup, drop, phonno);

                Random r = new Random();
                int r2 = 50;
                int r3 = 150;
                int r4 = 5;
                int r5 = 10;
                int pay = r.nextInt(((r3 - r2 + 1)) + r2);
                System.out.println("please pay the amount " + pay);
                int payment = sc.nextInt();
                sc.nextLine();

                int driver = r.nextInt(1000);
                int minutes = r.nextInt(((r5 - r4 + 1)) + r4);

                p.setString(1, pickup);
                p.setString(2, drop);
                if (phonno >= 1_000_000_000L && phonno <= 9_999_999_999L) {
                    p.setLong(3, phonno);
                }else{
                    System.out.println("Please enter valid number");
                }
                p.setInt(4, pay);

                int rowsaffect = p.executeUpdate();
                if (rowsaffect > 0 && payment == pay) {
                    con.commit();
                    System.out.println("Payment successfull");
                    System.out.println("Your auto is booked");
                    System.out.println("Driver " + driver + " is coming in " + minutes + " minutes");
                } else {
                    con.rollback();
                    System.out.println("Payment failed");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exit() throws InterruptedException {
        System.out.print("exiting booking window");
        int i = 3;
        while (i != 0) {
            System.out.print(".");
            Thread.sleep(1000);
            i--;
        }
        System.out.println();
        System.out.println("Thanks for visit ");
    }
}

public class TaxiBookingSystem {
    private static final String url = "jdbc:mysql://localhost:3306/cab";
    private static final String user = "root";
    private static final String password = "PIYUSH@111WORD016";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            while (true) {
                System.out.println();
                Scanner sc = new Scanner(System.in);
                System.out.println("We welcome you to our fast cab service ");
                System.out.println("Please enter the details to book your ride");
                System.out.println("Select option 1: Cab");
                System.out.println("Select option 2: Cab Premium");
                System.out.println("Select option 3: Auto");
                System.out.println("Select option 4: Bike");
                System.out.println("Enter 0 : exit ");
                int option = sc.nextInt();
                sc.nextLine();

                switch (option) {
                    case 1:
                        Booking.cab(con, sc);
                        break;
                    case 2:
                        Booking.cabPremium(con, sc);
                        break;
                    case 3:
                        Booking.auto(con, sc);
                        break;
                    case 4:
                        Booking.bike(con, sc);
                        break;
                    case 0:
                        Booking.exit();
                        sc.close();
                        return;

                    default:
                        System.out.println("Please select a valid option");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
