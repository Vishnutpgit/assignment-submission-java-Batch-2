import java.util.Scanner;
class RideCab {
    public static void main(String[] args) {
        int cd;   
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cab distance from user: ");
        cd = sc.nextInt();
        if(cd > 7) {
            Cab ob = new Cab(20 + 10 * (cd - 7));
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare = ob.fare + 10 * ob.d;
            
            ob.showFare();
        }
        else {
            Cab ob = new Cab();
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare = ob.fare + 10 * ob.d;
            
            ob.showFare();

        }

        
    }
}


class Cab {
    int fare;
    int d;    

    public Cab() {
        fare = 20;
    }

    public Cab(int amt) {
        fare = amt;
    }

   void showFare() {
        System.out.println("Total Fare: Rs " + fare);
    }
}


