import java.util.*;
public class Shopping {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean moreCustomers=true;
        while(moreCustomers){
            int totalAmount=0;
            System.out.println("Welcome to Online Shooping Mart");
            int items;
            do{
                System.out.println("Please choose the value fom cart take min 1:");
                items=sc.nextInt();

            }
            while(items<1);

            for(int i=1;i<=items;i++){
                System.out.println("\nProduct Menu");
                System.out.println("1.Mobile - Rs.20000");
                System.out.println("2.laptop - Rs.35000");
                System.out.println("3.Headphone - Rs.2500");
                System.out.println("4.Watch - Rs.3000");
                System.out.println("5 N.A - Rs.0000");
                System.out.println("Choose on of  them the menu"+i+":");
                int choice=sc.nextInt();
                switch(choice){
                    case 1:
                        totalAmount+=20000;
                        break;
                    case 2:
                        totalAmount+=35000;
                        break;
                    case 3:
                        totalAmount+=2500;
                        break;
                    case 4:
                        totalAmount+=3000;
                        break;
                    default:
                        System.out.println("Skipping the cart Invalid");
                }


            }
            if(totalAmount>5000){
                int discount=(int)(totalAmount*0.1);
                totalAmount-=discount;
                System.out.println("You have got 10% discount");
            }
            System.out.println("Final Amount of the cart:"+totalAmount);
            System.out.print("\nIs there another customer? (yes/no): ");
            String ans=sc.next();
            if(ans.equalsIgnoreCase("no")){
                moreCustomers=false;
            }
        }
        System.out.println("Thank you for your shopping apka din subh ho!");

    }
}
