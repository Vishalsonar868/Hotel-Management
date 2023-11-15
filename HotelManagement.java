package hotel;
import java.util.Scanner;

public class HotelManagement {
	static int bill;
    static void bill(int x)
    {

        bill=bill+x;
        System.out.println("Your bill is"+bill);
    }
    public static void main(String args[])
    {

        int choice,choice1,menu,a,price;
        int quantity =1;
        Scanner s =new Scanner(System.in);
        System.out.println("Welcome to our Hotel ");
        System.out.println("Do you want to order");
        System.out.println("1.Yes");
        System.out.println("2.No");
        System.out.println(" ");
        choice=s.nextInt();
        switch (choice) {

            // Case
            case 1:

                System.out.println("Choose Menu Options");
                System.out.println("1.Veg");
                System.out.println("2.Non-Veg");
                System.out.println(" ");
                choice1=s.nextInt();
                if(choice1==1)
                {

                    do
                    {
                        System.out.println("Our Veg Menu");
                        System.out.println("1.Chhole Bhature.....Rs:70/-");
                        System.out.println("2.Pav Bhaji..........Rs:70/-");
                        System.out.println("3.Mutter Paneer......Rs:100/-");
                        System.out.println("4.Veg Biryani........Rs:120/-");
                        System.out.println("5.French Fries.......Rs:80/-");
                        System.out.println(" ");
                        menu=s.nextInt();
                        switch (menu)
                        {



                            case 1:

                                System.out.println("Enter Quantity");
                                System.out.println(" ");
                                quantity =s.nextInt();
                                price=quantity*70;
                                bill(price);
                                break;

                            case 2:
                                System.out.println("Enter Quantity");
                                System.out.println(" ");
                                quantity =s.nextInt();
                                price=quantity*70;
                                bill(price);
                                break;
                            case 3:
                                System.out.println("Enter Quantity");
                                System.out.println(" ");
                                quantity =s.nextInt();
                                price=quantity*100;
                                bill(price);
                                break;

                            case 4:
                                System.out.println("Enter Quantity");
                                System.out.println(" ");
                                quantity =s.nextInt();
                                price=quantity*120;
                                bill(price);
                                break;
                            case 5:
                                System.out.println("Enter Quantity");
                                System.out.println(" ");
                                quantity =s.nextInt();
                                price=quantity*80;
                                bill(price);
                                break;
                            default:
                                System.out.println("Invalid choice ");
                                break;
                        }
                        System.out.println("Do you want to order more");
                        System.out.println("Yes:Press 1");
                        System.out.println("No:Press any key ");
                        System.out.println(" ");
                        a=s.nextInt();
                    }while(a==1);
                    System.out.println("Thank You Visit Again..... ");
                }
                else if(choice1==2)
                {

                    do
                    {
                        System.out.println("Our Non-Veg Menu");
                        System.out.println("1.Egg Fried Rice...........Rs:120/-");
                        System.out.println("2.Egg Curry................Rs:90/-");
                        System.out.println("3.Chicken Handi............Rs:320/-");
                        System.out.println("4.Chicken Kholapuri........Rs:190/-");
                        System.out.println("5.Chicken Lajeez...........Rs:250/-");
                        menu=s.nextInt();
                        System.out.println(" ");
                        switch (menu)
                        {
                            case 1:
                                System.out.println("Enter Quantity");
                                System.out.println(" ");
                                quantity =s.nextInt();
                                price=quantity*120;
                                bill(price);
                                break;

                            case 2:
                                System.out.println("Enter Quantity");
                                System.out.println(" ");
                                quantity =s.nextInt();
                                price=quantity*90;
                                bill(price);
                                break;
                            case 3:
                                System.out.println("Enter Quantity");
                                System.out.println(" ");
                                quantity =s.nextInt();
                                price=quantity*320;
                                bill(price);
                                break;

                            case 4:
                                System.out.println("Enter Quantity");
                                System.out.println(" ");
                                quantity =s.nextInt();
                                price=quantity*190;
                                bill(price);
                                break;
                            case 5:
                                System.out.println("Enter Quantity");
                                System.out.println(" ");
                                quantity =s.nextInt();
                                price=quantity*250;
                                bill(price);
                                break;
                            default:
                                System.out.println("Invalid choice ");

                                break;
                        }
                        System.out.println("Do you want to order more");
                        System.out.println("Yes:Press 1");
                        System.out.println("No:Press any key ");
                        System.out.println(" ");
                        a=s.nextInt();
                    }while(a==1);
                    System.out.println("Thank You Visit Again..... ");
                }
                break;
            // Case
            case 2:
                System.out.println("Thank You Visit Again..... ");
                break;



            // Default case
            default:
                System.out.println("Invalid choice");
        }
        s.close();
    }

}
