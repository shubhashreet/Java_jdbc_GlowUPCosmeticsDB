package shubha_cosmetic;
import java.util.*;
public class Main {
	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);

	    inventory in=new inventory();

	    System.out.println("Welcome to GlowUp cosmeticsDB");

	    cosmetic s=new cosmetic();

	    System.out.println("username:");

	    String lname=sc.next()+sc.nextLine();

	    System.out.println("Password:");

	    String password=sc.next()+sc.nextLine();

	    login l=new login();

	    user u=new user(lname,password);

	    String choice;

	    try {

	         if(l.admin(u)) {

	    do {

	    System.out.println("1.Add 2.Update 3.search 4.remove 5.show 6.Logout");

	    System.out.println("Enter option:");

	    int op=sc.nextInt();

	    switch(op) {

	    case 1:

	    s=new cosmetic();

	        s.setname(sc.next()+sc.nextLine());

	        s.setbrand(sc.next()+sc.nextLine());

	        s.setquan(sc.nextInt());

	        s.setprice(sc.nextInt());

	        s.setid(sc.next()+sc.nextLine());

	        in.addP(s);

	        break;

	    case 2:

	    	System.out.println("Enter id :");

	        String idu=sc.next()+sc.nextLine();

	        s.setid(idu);

	        System.out.println("Enter name to update");

	        s.setname(sc.next()+sc.nextLine());

	        in.update(s);

	        break;

	    case 3:

	    String ids=sc.next()+sc.nextLine();

	    s=in.search(ids);

	    System.out.println(s);

	    break;

	    case 4:

	    System.out.println("Enter id to delete");

	    String ids1=sc.next()+sc.nextLine();

	    in.Remove(ids1);

	    break;

	    case 5:

	    in.show();

	    break;

	    case 6:

	    in.logout();

	    }

	    System.out.println("Enter yes to continue");

	    choice=sc.next()+sc.nextLine();

	    }while(choice!="No");

	    }

	         else {

	        	 throw new InvalidPassword();

	         }

	     }

	    catch(InvalidPassword e)

	    {

	    	System.out.println("Invalid password");

	    }

	    

        }

        }



