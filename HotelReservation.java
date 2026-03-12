import java.util.Scanner;

public class HotelReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rooms = 5;
        boolean[] booked = new boolean[rooms];

        while(true){

            System.out.println("\nHotel Reservation System");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if(choice == 1){

                for(int i=0;i<rooms;i++){
                    if(booked[i])
                        System.out.println("Room "+(i+1)+" : Booked");
                    else
                        System.out.println("Room "+(i+1)+" : Available");
                }
            }

            else if(choice == 2){

                System.out.print("Enter room number to book (1-5): ");
                int r = sc.nextInt();

                if(!booked[r-1]){
                    booked[r-1] = true;
                    System.out.println("Room booked successfully!");
                }
                else{
                    System.out.println("Room already booked!");
                }
            }

            else if(choice == 3){
                System.out.println("Thank you!");
                break;
            }

            else{
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}