
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//==================================================== Abstraction / Method Overriding / Polymorphism ===================================================
interface Dec         //------------------------------- Abstract Class
{
	void LoginPage();
}


class Declaration implements Dec			 //------------------------------- Concrete Class & Multi-Level Inheritance
{
	static ArrayList<Comparable> info=new ArrayList<Comparable>();
	static ArrayList<String> cart=new ArrayList<String>();
	
	Scanner sc = new Scanner(System.in);
	
	public void LoginPage()
	{
		System.out.println("Press 1 to Login");
		System.out.println("Press 2 to Creat New Account ");
		System.out.println("Press 3 to Exit ");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");
		String choice=sc.nextLine();
		
		switch (choice)
		{
		case "1" :
			Login();
			break;
			
		case "2" :
			SignUp();
			break;
			
		case "3" :
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("                    -----Thank You For Visiting Rkart ! -----");
			System.out.println("                    -----------> Have a Nice Day <-----------");
			System.out.println("---------------------------------------------------------------------------------");
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			LoginPage();                                        //Method Recursion
			break;
		}	
	}
	
	public void Login()
	{
		String mobile;
		String password;
		
		System.out.println();
		System.out.println("================================================================================");
		System.out.println("                                 Login Page                                     ");
		System.out.println("================================================================================");
		System.out.print("Enter Your Mobile Number ---> ");
		mobile=sc.nextLine();
		System.out.print("Enter Your Password --------> ");
		password=sc.nextLine();

			System.out.println();
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("!! Invalid Mobile Number Or Password !!");
			System.out.println("---------------------------------------------------------------------------------");
			LoginPage();
	
	}
	
	public void SignUp()
	{
		Uname();
	}
	
	String userName;
	long mobileNumber;
	String email;
	String address;
	
		
	public void Uname()
	{
		System.out.println("================================================================================");
		System.out.println("                                Sign Up Page                                    ");
		System.out.println("================================================================================");
		System.out.println();
		System.out.print("Kindly Enter your Name ---> ");
		String userName = sc.nextLine();
		info.add(0,userName);					
		
		nameSwitch(); // Calling nameSwitch method 
	}
	
	public void nameSwitch()
	{		
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Hello... "+ info.get(0));
		System.out.println();
		System.out.print("To Continue Press 1, To Edit Name Press 2 ---> ");
		String value0 = sc.nextLine();
	
		switch (value0)
		{
		case "1" :
			mobileNum();// call phone number method
			break;
			
		case "2" :
			info.clear();
			Uname(); // Calling Uname method to rename
			break;
			
		default : 
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			nameSwitch();
			break;		
		}
	}
	
	public void mobileNum()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.print("Enter Your 10 digit Mobile Number ---> ");

//===========================================================================================================================
		// Exception Handling 
		
		try
		{
		Scanner ref = new Scanner(System.in);
		mobileNumber = ref.nextLong();
		info.add(1,mobileNumber);
		
		
//===========================================================================================================================		
		
		
		if (mobileNumber>1000000000L && mobileNumber<9999999999L)
		{
			
			mobileSwitch();//call mobileSwitch method
		}
		
		else 
		{
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println();
			mobileNum();
		}
		}
		catch (InputMismatchException ref1)
		{
			System.out.println("Mobile Number Should Contains Numbers only");
			mobileNum();
		}
	}
	public void mobileSwitch()
	{	
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Your Enter Mobile Number is :- "+ info.get(1)+  ".");
		System.out.println();
		System.out.print("To continue Press 1 Or to Edit Mobile Number Press 2 ---> ");
		String value1 = sc.nextLine();
	
		switch (value1)
		{
		case "1" : 
			Email();// Main Menu method
			break;
			
		case "2" : 
			info.remove(1);
			mobileNum(); // Calling Uname method to rename
			break;
			
		default : 
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			mobileSwitch();  //Method Recursion
			break;		
		}
	}
	
	public void Email()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.print("Kindly Enter your Email ID --> ");
		String email = sc.nextLine();
		info.add(2,email);					
		
		emailSwitch(); // Calling emailSwitch method 
	}
	
	public void emailSwitch()
	{		
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Your Entered Email Id is:- "+ info.get(2));
		System.out.println();
		System.out.print("To Continue Press 1, To Edit Email Press 2 ---> ");
		String value2 = sc.nextLine();
	
		switch (value2)
		{
		case "1" :
			Address();// address method
			break;
			
		case "2" :
			info.remove(2);
			Email(); // Calling Email method to rename
			break;
			
		default : 
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			emailSwitch();
			break;		
		}
	}

	public void Address()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.print("Kindly Enter your Address ---> ");
		String address = sc.nextLine();
		info.add(3,address);					
		
		addressSwitch(); // Calling emailSwitch method 
	}
	
	public void addressSwitch()
	{		
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Your Entered Address is:- "+ info.get(3));
		System.out.println();
		System.out.print("To Continue Press 1, To Edit Address Press 2 ---> ");
		String value3 = sc.nextLine();
	
		switch (value3)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println();
			System.out.println("******** Your Account Created Sucessfully ********");
			Welcome();// Welcome method
			break;
			
		case "2" :
			info.remove(3);
			Address(); // Calling Email method to rename
			break;
			
		default : 
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			addressSwitch();
			break;		
		}
	}	
	

	public void Welcome()
	{
		MainMenu ref1=new MainMenu();
		ref1.MainMenuOption();
	}
	
	public static void AllDetails()
	{
		System.out.println("* Name ------------> " + info.get(0));
		System.out.println("* Mobile Number ---> " + info.get(1));
		System.out.println("* Email -----------> " + info.get(2));
		System.out.println("* Address ---------> " + info.get(3));
	}
}

//====================================================================================================================================================
//------------------------------------------------------------       Main Menu     -----------------------------------------------------------------
//====================================================================================================================================================

class MainMenu
{	
	public void Exit()
	{
	 
	}
	Scanner sc = new Scanner(System.in);
	
	public void MainMenuOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println("Welcome "+ Declaration.info.get(0));
		System.out.println("================================================================================");
		System.out.println("                                  Home Page                                     ");
		System.out.println("================================================================================");
		System.out.println(" 1. Press 1 for Fashion ");
		System.out.println(" 2. Press 2 for Electronics ");
		System.out.println(" 3. Press 3 for Electronic Accessories ");
		System.out.println(" 4. Press 4 for Homehold ");
		System.out.println(" 5. Press 5 for Applications ");
		System.out.println(" 6. Press 6 for Personal Cares ");
		System.out.println(" 7. Press 7 for Toys ");
		System.out.println(" 8. Press 8 for Sports ");
		System.out.println(" 9. Press 9 To View Your Cart Items & Placing Order");
		System.out.println("10. Press 10 To Exit");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();

		System.out.print("Enter your choice ---> ");
		String menuChoice = sc.nextLine();
		
		MainMenuSwitch(menuChoice);
	}
	
	public void MainMenuSwitch(String menuChoice)
	{ 
		switch (menuChoice)
		{
		case "1" :
			Fashion ref1=new Fashion();
			ref1.FashionOption();
			break;
			
		case "2" :
			Electronics ref2=new Electronics();
			ref2.ElectronicsOption();
			break;
			
		case "3" :
			ElectronicAccessories ref3=new ElectronicAccessories();
			ref3.ElectronicAccessoriesOption();
			break;
			
		case "4" :
			Home ref4=new Home();
			ref4.HomeOption();
			break;
			
		case "5" :
			Appliances ref5=new Appliances();
			ref5.AppliancesOption();
			break;
			
		case "6" :
			PersonalCare ref6=new PersonalCare();
			ref6.PersonalCareOption();
			break;
			
		case "7" :
			Toys ref7=new Toys();
			ref7.ToysOption();
			break;
			
		case "8" :
			Sports ref8=new Sports();
			ref8.SportsOption();
			break;
			
		case "9" :
			int cartSize=Declaration.cart.size();
			
			if (cartSize==0)
			{
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Your Cart is Empty ---------                      ");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("Sending To Home page.......");
				MainMenuOption();
			}
			else
			{
				ViewPlace();
			}
			break;
			
		case "10" :
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("                    -----Thank You " + Declaration.info.get(0) +" For Visiting Rkart ! -----");
			System.out.println("                    -----------> Have a Nice Day <-----------");
			System.out.println("---------------------------------------------------------------------------------");
			break;
			
		default :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println();
			System.out.println("Invalid Input ");
			MainMenuOption();
			break;
		}
	}
	
//==================================================================================================================================================
	
	String name;
	long price;
	String Dimensions;
	String warranty;

	@Override             //========================================  Polymorphism / Method Overriding  ============================================
	public String toString()
	{
		System.out.println("Product Name:- " + name);
		System.out.println("Product Price:- Rs " + price);
		System.out.println("Product Dimensions/Size:- " + Dimensions);
		System.out.println("Product Warranty:- " + warranty);
		return "";
	}
	
//==================================================================================================================================================

	public void OrderDetails()
	{
		System.out.println("Press 1 To Continue Shopping");
		System.out.println("Press 2 To View Your Cart Items & Placing Order");
		System.out.println("Press remaining any key Exit");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");
		String ex=sc.nextLine();
		
		switch (ex)
		{
		//Press 1 To Continue Shopping
		case "1" :
			MainMenuOption();
			break;

		//Press 2 To View Your Cart Items & Placing Order
		case "2" :
			ViewPlace();
			break;
			
		default :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println("---------- Thank You " + Declaration.info.get(0) +" For Shopping From Rkart ! ----------");
			System.out.println("                ----------> Have a Nice Day <-----------");
			System.out.println("================================================================================");
			break;
		}
}
	
	public void ViewPlace()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println("                                 Cart Items                                     ");
		System.out.println("================================================================================");
		System.out.println();
		for (Object obj : Declaration.cart)     //For each loop
		{
			System.out.println(obj);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Press 1 To Edit Cart List");
		System.out.println("Press 2 To Placed Order");
		System.out.println("Press 3 Back to Home Page");
		System.out.println();
		System.out.print("Enter Your Choice here ---> ");
		String rp=sc.nextLine();
		
		switch (rp)
		{
		//Press 1 To Edit Cart List
		case "1":
			int cartSize=Declaration.cart.size();
			
			if (cartSize==0)
			{
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Your Cart is Empty ---------                      ");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("Sending To Home page.......");
				MainMenuOption();
			}
			else
			{
			RemoveCart();
			}
			break;
		
		//Press 2 To Placed Order"
		case "2":
			OrderPlace();
			break;
			
		case "3":
			MainMenuOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			ViewPlace();
			break;
		}	
		
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void RemoveCart()
	{
		
			System.out.println();
			System.out.println("================================================================================");
			System.out.println("                                Your Cart Items                                 ");
			System.out.println("================================================================================");
			for (Object obj : Declaration.cart)     //For each loop
			{
				System.out.println(obj);
				System.out.println();
			}
			
			int size=Declaration.cart.size();
			System.out.println();
			System.out.println("Enter the Serial No of item you want to remove from list");
			System.out.println();
			System.out.print("Enter Your Choice here ---> ");
			
			try
			{
			int pk=sc.nextInt();
			int index=pk-1;
			if (pk>0 && pk<=size)
			{
				Declaration.cart.remove(index);
				
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                --------- Item Removed SucessFully ---------                    ");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println();
				ViewPlace();
			}
			else 
			{
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				ViewPlace();
			}
			}
			catch (InputMismatchException re)
			{
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				ViewPlace();
			}
			
	}

//-------------------------------------------------------------------------------------------------------------------------------------------------

	public void OrderPlace()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println("                         Your Order Placed Successfully                         ");
		System.out.println("================================================================================");

		System.out.println();
		System.out.println("                    ---------- Personal Details ----------");
		System.out.println();
		Declaration.AllDetails();
		System.out.println();
		System.out.println("Payment Method: COD");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("                        ---------- Order List ----------");
		System.out.println();
		for (Object obj : Declaration.cart)     //For each loop
		{
			System.out.println(obj);
			System.out.println();
		}
	
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Press 1 To Continue Shopping");
		System.out.println("Press remaining any key Exit");
		System.out.print("Enter Your Choice ---> ");
		String ex1=sc.nextLine();
	
		switch (ex1)
		{
		case "1" :
			MainMenuOption();
			break;
		
		default :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println("---------- Thank You " + Declaration.info.get(0) +" For Shopping From Rkart ! ----------");
			System.out.println("                ----------> Have a Nice Day <-----------"); 
			System.out.println("================================================================================");
			break;
		}

	}
}
	
	
//====================================================================================================================================================
//-----------------------------------------------------------        1. Fashion       ----------------------------------------------------------------
//====================================================================================================================================================

class Fashion extends MainMenu
{
	public void FashionOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion");
		System.out.println();
		System.out.println("-------------- Fashion Section --------------");
		System.out.println("1. Press 1 For Mens Section");
		System.out.println("2. Press 2 For Womens Section");
		System.out.println("3. Press 3 For Kids Section");
		System.out.println("4. Press 4 To Return Home Page");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();

		System.out.print("Enter your choice ---> ");
		String fashionChoice = sc.nextLine();
		FashionSwitch(fashionChoice);
	}
	
	public void FashionSwitch(String fashionChoice)
	{
		switch (fashionChoice)
		{
		case "1" :
			Mens ref1=new Mens();
			ref1.MensOption();
			break;
			
		case "2" :
			Womens ref2=new Womens();
			ref2.WomensOption();
			break;
			
		case "3" :
			Kids ref3=new Kids();
			ref3.KidsOption();
			break;
					
		case "4" :
			MainMenuOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			FashionOption();
			break;
	}
}
}

class Mens extends Fashion
{
	public void MensOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Mens");
		System.out.println();
		System.out.println("** Select the Product you want from Mens Section **");
		System.out.println("1. Press 1 For T - Shirts");
		System.out.println("2. Press 2 For Shirts");
		System.out.println("3. Press 3 For Jeans");
		System.out.println("4. Press 4 For Shorts");
		System.out.println("5. Press 5 To return Back");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		System.out.print("Enter your choice ---> ");
		String kidsChoice = sc.nextLine();
		MensSwitch(kidsChoice);
	}
	
	public void MensSwitch(String mobileChoice)
	{
		switch (mobileChoice)
		{
		case "1" :
			MTshirt ref1=new MTshirt("",0,"","");
			ref1.MTshirtOption();
			break;
			
		case "2" :
			MShirt ref2=new MShirt("",0,"","");
			ref2.MShirtOption();
			break;
			
		case "3" :
			MJeans ref3=new MJeans("",0,"","");
			ref3.MJeansOption();
			break;

		case "4" :
			MShorts ref4=new MShorts("",0,"","");
			ref4.MShortsOption();
			break;
			
		case "5" :
			FashionOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			MensOption();
			break;
		}
	}	
}

//==============================================================================================================================================

class MTshirt extends Mens
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public MTshirt(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}	
	
	public void MTshirtOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Mens > T-Shirts");
		System.out.println();
		System.out.println("1. ");
		MTshirt productDetails1 = new MTshirt("LEVI'S Color Block Men Polo Neck Multicolor T-Shirt", 799, "S", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		MTshirt productDetails2 = new MTshirt("LEWEL Checkered Men Hooded Neck White, Black T-Shirt", 333, "M", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		MTshirt productDetails3 = new MTshirt("EyeBogler Striped Men Polo Neck White, Blue, Yellow T-Shirt", 239, "L", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- LEVI'S Color Block Men Polo Neck Multicolor T-Shirt\r\n"
						+ "Product Price:- Rs 799\r\n"
						+ "Product Size:- S\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- LEWEL Checkered Men Hooded Neck White, Black T-Shirt\r\n"
						+ "Product Price:- Rs 333\r\n"
						+ "Product Size:- M\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- EyeBogler Striped Men Polo Neck White, Blue, Yellow T-Shirt\r\n"
						+ "Product Price:- Rs 239\r\n"
						+ "Product Size:- L\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				MensOption();
				break;
				
			default :
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("--------------------------------------------------------------------------------");
				MTshirtOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			MTshirtOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//============================================================================================================================================================

class MShirt extends Mens
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public MShirt(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	//---------------------------------------------------------------------------------------------------
	
	public void MShirtOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Mens > Shirts");
		System.out.println();
		System.out.println("1. ");
		MShirt productDetails1 = new MShirt("Men Slim Fit Solid Cut Away Collar Casual Shirt", 399, "M", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		MShirt productDetails2 = new MShirt("Men Slim Fit Solid Spread Collar Casual Shirt", 303, "L", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		MShirt productDetails3 = new MShirt("Men Slim Fit Checkered Spread Collar Casual Shirt", 263, "XL", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Men Slim Fit Solid Cut Away Collar Casual Shirt\r\n"
						+ "Product Price:- Rs 399\r\n"
						+ "Product Size:- M\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Men Slim Fit Solid Spread Collar Casual Shirt\r\n"
						+ "Product Price:- Rs 303\r\n"
						+ "Product Size:- L\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Men Slim Fit Checkered Spread Collar Casual Shirt\r\n"
						+ "Product Price:- Rs 263\r\n"
						+ "Product Size:- XL\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				MensOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				MShirtOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			MShirtOption();
			break;
	
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class MJeans extends Mens
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public MJeans(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------	
	
	public void MJeansOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Mens > Jeans");
		System.out.println();
		System.out.println("1. ");
		MJeans productDetails1 = new MJeans("LEE Skinny Men Dark Blue Jeans", 949, "30", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		MJeans productDetails2 = new MJeans("LEVI'S 512 Regular Men Blue Jeans", 1339, "32", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		MJeans productDetails3 = new MJeans("LEVI'S 512 Tapered Fit Men Blue Jeans", 1499, "28", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- LEE Skinny Men Dark Blue Jeans\r\n"
						+ "Product Price:- Rs 949\r\n"
						+ "Product Size:- 30\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- LEVI'S 512 Regular Men Blue Jeans\r\n"
						+ "Product Price:- Rs 1339\r\n"
						+ "Product Size:- 32\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- LEVI'S 512 Tapered Fit Men Blue Jeans\r\n"
						+ "Product Price:- Rs 1499\r\n"
						+ "Product Size:- 28\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				MensOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				MJeansOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			MJeansOption();
			break;
	
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class MShorts extends Mens
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public MShorts(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
//---------------------------------------------------------------------------------------------------
	
	public void MShortsOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Mens > Shorts");
		System.out.println();
		System.out.println("1. ");
		MShorts productDetails1 = new MShorts("Printed Men Dark Blue Boxer Shorts", 359, "M", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		MShorts productDetails2 = new MShorts("Solid Men Light Green Sports Shorts", 215, "L", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		MShorts productDetails3 = new MShorts("Pack of 2 Printed Men Green, Black Basic Shorts", 263, "XL", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Printed Men Dark Blue Boxer Shorts\r\n"
						+ "Product Price:- Rs 359\r\n"
						+ "Product Size:- M\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Solid Men Light Green Sports Shorts\r\n"
						+ "Product Price:- Rs 215\r\n"
						+ "Product Size:- L\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Pack of 2 Printed Men Green, Black Basic Shorts\r\n"
						+ "Product Price:- Rs 263\r\n"
						+ "Product Size:- XL\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				MensOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				MShortsOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			MShortsOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//============================================================================================================================================================

class Womens extends Fashion
{
	public void WomensOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Womens");
		System.out.println();
		System.out.println("** Select the Product you want from Womens Section **");
		System.out.println("1. Press 1 For T - Shirts");
		System.out.println("2. Press 2 For Shirts");
		System.out.println("3. Press 3 For Jeans");
		System.out.println("4. Press 4 For Shorts");
		System.out.println("5. Press 5 To return Back");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		System.out.print("Enter your choice ---> ");
		String kidsChoice = sc.nextLine();
		WomensSwitch(kidsChoice);
	}
	
	public void WomensSwitch(String mobileChoice)
	{
		switch (mobileChoice)
		{
		case "1" :
			WTshirt ref1=new WTshirt("",0,"","");
			ref1.WTshirtOption();
			break;
			
		case "2" :
			WShirt ref2=new WShirt("",0,"","");
			ref2.WShirtOption();
			break;
			
		case "3" :
			WJeans ref3=new WJeans("",0,"","");
			ref3.WJeansOption();
			break;

		case "4" :
			WShorts ref4=new WShorts("",0,"","");
			ref4.WShortsOption();
			break;
			
		case "5" :
			FashionOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			WomensOption();
			break;
		}
	}	
}

//==============================================================================================================================================

class WTshirt extends Womens
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public WTshirt(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
//---------------------------------------------------------------------------------------------------	
	
	public void WTshirtOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Womens > T-Shirts");
		System.out.println();
		System.out.println("1. ");
		WTshirt productDetails1 = new WTshirt("Tie & Dye Women Round Neck Multicolor T-Shirt", 239, "S", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		WTshirt productDetails2 = new WTshirt("Color Block Women Round Neck Black T-Shirt", 159, "M", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		WTshirt productDetails3 = new WTshirt("Striped Women Round Neck White, Maroon T-Shirt", 159, "L", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Tie & Dye Women Round Neck Multicolor T-Shirt\r\n"
						+ "Product Price:- Rs 239\r\n"
						+ "Product Size:- S\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Color Block Women Round Neck Black T-Shirt\r\n"
						+ "Product Price:- Rs 159\r\n"
						+ "Product Size:- M\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Striped Women Round Neck White, Maroon T-Shirt\r\n"
						+ "Product Price:- Rs 159\r\n"
						+ "Product Size:- L\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				WomensOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				WTshirtOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			WTshirtOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//============================================================================================================================================================

class WShirt extends Womens
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public WShirt(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
	//---------------------------------------------------------------------------------------------------	
	
	public void WShirtOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Womens > Shirts");
		System.out.println();
		System.out.println("1. ");
		WShirt productDetails1 = new WShirt("Women Regular Fit Printed Spread Collar Casual Shirt", 239, "L", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		WShirt productDetails2 = new WShirt("Women Regular Fit Striped Mandarin Collar Casual Shirt", 279, "M", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		WShirt productDetails3 = new WShirt("Women Regular Fit Printed Curved Collar Casual Shirt", 348, "S", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Women Regular Fit Printed Spread Collar Casual Shirt\r\n"
						+ "Product Price:- Rs 239\r\n"
						+ "Product Size:- L\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Women Regular Fit Striped Mandarin Collar Casual Shirt\r\n"
						+ "Product Price:- Rs 279\r\n"
						+ "Product Size:- M\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Women Regular Fit Printed Curved Collar Casual Shirt\r\n"
						+ "Product Price:- Rs 348\r\n"
						+ "Product Size:- S\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				WomensOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				WShirtOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			WShirtOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class WJeans extends Womens
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public WJeans(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//----------------------------------------------------------------------------------------------------------------------------------------
	
	public void WJeansOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Womens > Jeans");
		System.out.println();
		System.out.println("1. ");
		WJeans productDetails1 = new WJeans("Regular Women Grey Jeans", 599, "32", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		WJeans productDetails2 = new WJeans("Skinny Women Grey Jeans", 659, "30", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		WJeans productDetails3 = new WJeans("Skinny Women Dark Blue Jeans", 571, "28", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Regular Women Grey Jeans\r\n"
						+ "Product Price:- Rs 599\r\n"
						+ "Product Size:- 32\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Skinny Women Grey Jeans\r\n"
						+ "Product Price:- Rs 659\r\n"
						+ "Product Size:- 30\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Skinny Women Dark Blue Jeans\r\n"
						+ "Product Price:- Rs 571\r\n"
						+ "Product Size:- 28\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				WomensOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				WJeansOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			WJeansOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class WShorts extends Womens
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public WShorts(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
//------------------------------------------------------------------------------------------------------------------------------------
	
	public void WShortsOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Womens > Shorts");
		System.out.println();
		System.out.println("1. ");
		WShorts productDetails1 = new WShorts("Pack of 2 Solid Women Black, Grey Regular Shorts", 359, "M size", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		WShorts productDetails2 = new WShorts("Solid Women Black High Waist Shorts", 239, "M size", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		WShorts productDetails3 = new WShorts("Pack of 2 Printed Women Dark Green, Grey Basic Shorts, Night Shorts, Basic Shorts, Regular Shorts", 300, "M size", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Pack of 2 Solid Women Black, Grey Regular Shorts\r\n"
						+ "Product Price:- Rs 359\r\n"
						+ "Product Size:- M size\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Solid Women Black High Waist Shorts\r\n"
						+ "Product Price:- Rs 239\r\n"
						+ "Product Size:- M size\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Pack of 2 Printed Women Dark Green, Grey Basic Shorts, Night Shorts, Basic Shorts, Regular Shorts\r\n"
						+ "Product Price:- Rs 300\r\n"
						+ "Product Size:- M size\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				WomensOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				WShortsOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			WShortsOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//============================================================================================================================================================

class Kids extends Fashion
{
	public void KidsOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Kids");
		System.out.println();
		System.out.println("** Select the Product you want from Kids Section **");
		System.out.println("1. Press 1 For T - Shirts");
		System.out.println("2. Press 2 For Shirts");
		System.out.println("3. Press 3 For Jeans");
		System.out.println("4. Press 4 For Shorts");
		System.out.println("5. Press 5 To return Back");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		System.out.print("Enter your choice ---> ");
		String kidsChoice = sc.nextLine();
		KidsSwitch(kidsChoice);
	}
	
	public void KidsSwitch(String mobileChoice)
	{
		switch (mobileChoice)
		{
		case "1" :
			KTshirt ref1=new KTshirt("",0,"","");
			ref1.KTshirtOption();
			break;
			
		case "2" :
			KShirt ref2=new KShirt("",0,"","");
			ref2.KShirtOption();
			break;
			
		case "3" :
			KJeans ref3=new KJeans("",0,"","");
			ref3.KJeansOption();
			break;

		case "4" :
			KShorts ref4=new KShorts("",0,"","");
			ref4.KShortsOption();
			break;
			
		case "5" :
			FashionOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			KidsOption();
			break;
		}
	}	
}

//==============================================================================================================================================

class KTshirt extends Kids
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public KTshirt(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
//----------------------------------------------------------------------------------------------------------
	
	public void KTshirtOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Kids > T-Shirts");
		System.out.println();
		System.out.println("1. ");
		KTshirt productDetails1 = new KTshirt("Boys Printed Cotton Blend T Shirt  (Yellow, Pack of 1)", 359, "3-4 Years", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		KTshirt productDetails2 = new KTshirt("Boys Graphic Print Cotton Blend T Shirt  (Multicolor, Pack of 3)", 499, "4-5 Years", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		KTshirt productDetails3 = new KTshirt("Boys Solid Cotton Blend T Shirt  (Yellow, Pack of 1)", 167, "6-7 Years", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Boys Printed Cotton Blend T Shirt  (Yellow, Pack of 1)\r\n"
						+ "Product Price:- Rs 359\r\n"
						+ "Product Size:- 3-4 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Boys Graphic Print Cotton Blend T Shirt  (Multicolor, Pack of 3)\r\n"
						+ "Product Price:- Rs 499\r\n"
						+ "Product Size:- 4-5 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Boys Solid Cotton Blend T Shirt  (Yellow, Pack of 1)\r\n"
						+ "Product Price:- Rs 167\r\n"
						+ "Product Size:- 6-7 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				KidsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				KTshirtOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			KTshirtOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//============================================================================================================================================================

class KShirt extends Kids
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public KShirt(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
	//---------------------------------------------------------------------------------------------------
	
	
	public void KShirtOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Kids > Shirts");
		System.out.println();
		System.out.println("1. ");
		KShirt productDetails1 = new KShirt("Boys Regular Fit Printed Button Down Collar Casual Shirt", 579, "3-4 Years", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		KShirt productDetails2 = new KShirt("Boys Slim Fit Solid Spread Collar Casual Shirt", 397, "5-6 Years", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		KShirt productDetails3 = new KShirt("Boys Slim Fit Printed Casual Shirt", 559, "7-8 Years", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Boys Regular Fit Printed Button Down Collar Casual Shirt\r\n"
						+ "Product Price:- Rs 579\r\n"
						+ "Product Size:- 3-4 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Boys Slim Fit Solid Spread Collar Casual Shirt\r\n"
						+ "Product Price:- Rs 397\r\n"
						+ "Product Size:- 5-6 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Boys Slim Fit Printed Casual Shirt\r\n"
						+ "Product Price:- Rs 559\r\n"
						+ "Product Size:- 7-8 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				KidsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				KShirtOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			KShirtOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class KJeans extends Kids
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public KJeans(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------	
	
	public void KJeansOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Kids > Jeans");
		System.out.println();
		System.out.println("1. ");
		KJeans productDetails1 = new KJeans("Jogger Fit Boys Black Jeans", 303, "2-4 Years", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		KJeans productDetails2 = new KJeans("Slim Boys Black Jeans", 499, "5-6 Years", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		KJeans productDetails3 = new KJeans("Slim Boys Dark Blue Jeans", 327, "7-8 Years", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Jogger Fit Boys Black Jeans\r\n"
						+ "Product Price:- Rs 303\r\n"
						+ "Product Size:- 2-4 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Slim Boys Black Jeans\r\n"
						+ "Product Price:- Rs 499\r\n"
						+ "Product Size:- 5-6 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Slim Boys Dark Blue Jeans\r\n"
						+ "Product Price:- Rs 327\r\n"
						+ "Product Size:- 7-8 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				KidsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				KJeansOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			KJeansOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class KShorts extends Kids
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public KShorts(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
//---------------------------------------------------------------------------------------------------
	
	public void KShortsOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Fashion > Kids > Shorts");
		System.out.println();
		System.out.println("1. ");
		KShorts productDetails1 = new KShorts("Short For Boys Casual Printed, Solid Pure Cotton  (Multicolor, Pack of 5)", 359, "2-4 Years", "10 Days Return Policy");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		KShorts productDetails2 = new KShorts("Short For Boys & Girls Casual Printed Hosiery  (Multicolor, Pack of 10)", 376, "5-6 Years", "10 Days Return Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		KShorts productDetails3 = new KShorts("Short For Boys & Girls Casual Printed Cotton Blend  (Multicolor, Pack of 4)", 287, "7-8 Years", "10 Days Return Policy");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Short For Boys Casual Printed, Solid Pure Cotton  (Multicolor, Pack of 5)\r\n"
						+ "Product Price:- Rs 359\r\n"
						+ "Product Size:- 2-4 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Short For Boys & Girls Casual Printed Hosiery  (Multicolor, Pack of 10)\r\n"
						+ "Product Price:- Rs 376\r\n"
						+ "Product Size:- 5-6 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Short For Boys & Girls Casual Printed Cotton Blend  (Multicolor, Pack of 4)\r\n"
						+ "Product Price:- Rs 287\r\n"
						+ "Product Size:- 7-8 Years\r\n"
						+ "Product Warranty:- 10 Days Return Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				KidsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				KShortsOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			KShortsOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//====================================================================================================================================================
//---------------------------------------------------        2. Electronics       ----------------------------------------------------------------
//====================================================================================================================================================

class Electronics extends MainMenu
{
	public void ElectronicsOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics");
		System.out.println();
		System.out.println("-------------- Electronics Section --------------");
		System.out.println("1. Press 1 For Mobile Phones");
		System.out.println("2. Press 2 for Laptop");
		System.out.println("3. Press 3 To Return Home Page");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();

		System.out.print("Enter your choice ---> ");
		String electronicsChoice = sc.nextLine();
		ElectronicsSwitch(electronicsChoice);
	}
		
	public void ElectronicsSwitch(String electronicsChoice)
	{
		switch (electronicsChoice)
		{
			case "1" :
				Mobile ref1=new Mobile();
				ref1.MobileOption();
				break;
				
			case "2" :
				Laptops ref2=new Laptops();
				ref2.LaptopsOption();
				break;
				
			case "3" :
				MainMenuOption();
				break;
				
			default :
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				ElectronicsOption();
				break;
		}
	}
}

//============================================================================================================================================

class Mobile extends Electronics
{
	public void MobileOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Mobile");
		System.out.println();
		System.out.println("** Choose the Mobile Brand **");
		System.out.println("1. Press 1 For Apple");
		System.out.println("2. Press 2 For Samsung");
		System.out.println("3. Press 3 For ASUS");
		System.out.println("4. Press 4 For Oppo");
		System.out.println("5. Press 5 For Vivo");
		System.out.println("6. Press 6 To return Back");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		System.out.print("Enter your choice ---> ");
		String mobileChoice = sc.nextLine();
		KidsSwitch(mobileChoice);
	}
	
	public void KidsSwitch(String mobileChoice)
	{
		switch (mobileChoice)
		{
		case "1" :
			Apple ref1=new Apple("",0,"","");
			ref1.AppleOption();
			break;
			
		case "2" :
			Samsung ref2=new Samsung("",0,"","");
			ref2.SamsungOption();
			break;
			
		case "3" :
			ASUS ref3=new ASUS("",0,"","");
			ref3.ASUSOption();
			break;

		case "4" :
			Oppo ref4=new Oppo("",0,"","");
			ref4.OppoOption();
			break;
			
		case "5" :
			Vivo ref5=new Vivo("",0,"","");
			ref5.VivoOption();
			break;
			
		case "6" :
			ElectronicsOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			MobileOption();
			break;
		}
	}	
}

//==============================================================================================================================================

class Apple extends Mobile
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public Apple(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
//---------------------------------------------------------------------------------------------------
	
	
	public void AppleOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Mobile > Apple");
		System.out.println();
		System.out.println("1. ");
		Apple productDetails1 = new Apple("APPLE iPhone 14 (Purple, 128 GB)", 79990, "Width: 71.5 mm, Height: 146.7 mm, Depth: 7.8 mm, Weight: 172 g", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Apple productDetails2 = new Apple("APPLE iPhone 13 (Starlight, 128 GB)", 60990, "Width: 71.5 mm, Height: 146.7 mm, Depth: 7.65 mm, Weight: 173 g", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Apple productDetails3 = new Apple("APPLE iPhone 12 (Green, 128 GB)", 58990, "Width: 71.5 mm, Height: 146.7 mm, Depth: 7.4 mm, Weight: 162 g", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- APPLE iPhone 14 (Purple, 128 GB)\r\n"
						+ "Product Price:- Rs 79990\r\n"
						+ "Product Dimensions:- Width: 71.5 mm, Height: 146.7 mm, Depth: 7.8 mm, Weight: 172 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- APPLE iPhone 13 (Starlight, 128 GB)\r\n"
						+ "Product Price:- Rs 60990\r\n"
						+ "Product Dimensions:- Width: 71.5 mm, Height: 146.7 mm, Depth: 7.65 mm, Weight: 173 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- APPLE iPhone 12 (Green, 128 GB)\r\n"
						+ "Product Price:- Rs 58990\r\n"
						+ "Product Dimensions:- Width: 71.5 mm, Height: 146.7 mm, Depth: 7.4 mm, Weight: 162 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				MobileOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				AppleOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			AppleOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//============================================================================================================================================================

class Samsung extends Mobile
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Samsung(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void SamsungOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Mobile > Samsung");
		System.out.println();
		System.out.println("1. ");
		Samsung productDetails1 = new Samsung("SAMSUNG Galaxy S22 5G (Green, 256 GB)  (8 GB RAM)", 58990, "Width: 70.6 mm, Height: 146 mm, Depth: 7.6 mm, Weight: 167 g", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Samsung productDetails2 = new Samsung("SAMSUNG Galaxy F23 5G (Forest Green, 128 GB)  (6 GB RAM)", 13999, "Width: 77 mm, Height: 165.5 mm, Depth: 8.4 mm, Weight: 198 g", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Samsung productDetails3 = new Samsung("SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)  (4 GB RAM)", 9499, "Width: 76.9 mm, Height: 165.4 mm, Depth: 9.3 mm, Weight: 207 g", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- SAMSUNG Galaxy S22 5G (Green, 256 GB)  (8 GB RAM)\r\n"
						+ "Product Price:- Rs 58990\r\n"
						+ "Product Dimensions:- Width: 70.6 mm, Height: 146 mm, Depth: 7.6 mm, Weight: 167 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- SAMSUNG Galaxy F23 5G (Forest Green, 128 GB)  (6 GB RAM)\r\n"
						+ "Product Price:- Rs 13999\r\n"
						+ "Product Dimensions:- Width: 77 mm, Height: 165.5 mm, Depth: 8.4 mm, Weight: 198 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)  (4 GB RAM)\r\n"
						+ "Product Price:- Rs 9499\r\n"
						+ "Product Dimensions:- Width: 76.9 mm, Height: 165.4 mm, Depth: 9.3 mm, Weight: 207 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				MobileOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				SamsungOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			SamsungOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class ASUS extends Mobile
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public ASUS(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	
	public void ASUSOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Mobile > ASUS");
		System.out.println();
		System.out.println("1. ");
		ASUS productDetails1 = new ASUS("ASUS ROG 5s (Phantom Black, 256 GB)  (12 GB RAM)", 54999, "Width: 77.25 mm, Height: 172.83 mm, Depth: 9.85 mm, Weight: 238 g", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		ASUS productDetails2 = new ASUS("ASUS Zenfone Max Pro M1 (Black, 64 GB)  (6 GB RAM)", 17999, "Width: 76 mm, Height: 159 mm, Depth: 8.46 mm, Weight: 180 g", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		ASUS productDetails3 = new ASUS("ASUS ZenFone Max M2 (Black, 64 GB)  (4 GB RAM)", 14999, "Width: 76.28 mm, Height: 158.41 mm, Depth: 7.7 mm, Weight: 160 g", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");
		
		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- ASUS ROG 5s (Phantom Black, 256 GB)  (12 GB RAM)\r\n"
						+ "Product Price:- Rs 54999\r\n"
						+ "Product Dimensions:- Width: 77.25 mm, Height: 172.83 mm, Depth: 9.85 mm, Weight: 238 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- ASUS Zenfone Max Pro M1 (Black, 64 GB)  (6 GB RAM)\r\n"
						+ "Product Price:- Rs 17999\r\n"
						+ "Product Dimensions:- Width: 76 mm, Height: 159 mm, Depth: 8.46 mm, Weight: 180 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- ASUS ZenFone Max M2 (Black, 64 GB)  (4 GB RAM)\r\n"
						+ "Product Price:- Rs 14999\r\n"
						+ "Product Dimensions:- Width: 76.28 mm, Height: 158.41 mm, Depth: 7.7 mm, Weight: 160 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				MobileOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				ASUSOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			ASUSOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class Oppo extends Mobile
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public Oppo(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
//---------------------------------------------------------------------------------------------------
	
	
	public void OppoOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Mobile > Oppo");
		System.out.println();
		System.out.println("1. ");
		Oppo productDetails1 = new Oppo("OPPO K10 5G (Ocean Blue, 128 GB)  (8 GB RAM)", 17499, "Width: 75.1 mm, Height: 163.8 mm, Depth: 7.99 mm, Weight: 190 g", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Oppo productDetails2 = new Oppo("OPPO F19 Pro+ 5G (Space Silver, 128 GB)  (8 GB RAM)", 17990, "Width: 73.4 mm, Height: 160.01 mm, Depth: 7.8 mm, Weight: 173 g", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Oppo productDetails3 = new Oppo("OPPO A17 (Midnight Black, 64 GB)  (4 GB RAM)", 12499, "Width: 75.6 mm, Height: 164.2 mm, Depth: 8.3 mm, Weight: 189 g", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- OPPO K10 5G (Ocean Blue, 128 GB)  (8 GB RAM)\r\n"
						+ "Product Price:- Rs 17499\r\n"
						+ "Product Dimensions:- Width: 75.1 mm, Height: 163.8 mm, Depth: 7.99 mm, Weight: 190 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- OPPO F19 Pro+ 5G (Space Silver, 128 GB)  (8 GB RAM)\r\n"
						+ "Product Price:- Rs 17990\r\n"
						+ "Product Dimensions:- Width: 73.4 mm, Height: 160.01 mm, Depth: 7.8 mm, Weight: 173 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- OPPO A17 (Midnight Black, 64 GB)  (4 GB RAM)\r\n"
						+ "Product Price:- Rs 12499\r\n"
						+ "Product Dimensions:- Width: 75.6 mm, Height: 164.2 mm, Depth: 8.3 mm, Weight: 189 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				MobileOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				OppoOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			OppoOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//============================================================================================================================================================

class Vivo extends Mobile
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Vivo(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void VivoOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Mobile > Vivo");
		System.out.println();
		System.out.println("1. ");
		Vivo productDetails1 = new Vivo("vivo T1 5G (Rainbow Fantasy, 128 GB)  (6 GB RAM)", 16990, "Width: 75.84 mm, Height: 164 mm, Depth: 8.25 mm, Weight: 187 g", "1 Year");		
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Vivo productDetails2 = new Vivo("vivo T1 44W (Midnight Galaxy, 128 GB)  (4 GB RAM)", 14499, "Width: 73.79 mm, Height: 160.8 mm, Depth: 8.42 mm, Weight: 182 g", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Vivo productDetails3 = new Vivo("vivo T1X (Gravity Black, 64 GB)  (4 GB RAM)", 11999, "Width: 76.08 mm, Height: 164.26 mm, Depth: 8 mm, Weight: 182 g", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- vivo T1 5G (Rainbow Fantasy, 128 GB)  (6 GB RAM)\r\n"
						+ "Product Price:- Rs 16990\r\n"
						+ "Product Dimensions:- Width: 75.84 mm, Height: 164 mm, Depth: 8.25 mm, Weight: 187 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- vivo T1 44W (Midnight Galaxy, 128 GB)  (4 GB RAM)\r\n"
						+ "Product Price:- Rs 14499\r\n"
						+ "Product Dimensions:- Width: 73.79 mm, Height: 160.8 mm, Depth: 8.42 mm, Weight: 182 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- vivo T1X (Gravity Black, 64 GB)  (4 GB RAM)\r\n"
						+ "Product Price:- Rs 11999\r\n"
						+ "Product Dimensions:- Width: 76.08 mm, Height: 164.26 mm, Depth: 8 mm, Weight: 182 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				MobileOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				VivoOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			VivoOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//=========================================================================================================================================================

class Laptops extends Electronics
{
	public void LaptopsOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Laptops");
		System.out.println();
		System.out.println("** Choose the Laptop Brand **");
		System.out.println("1. Press 1 For Apple");
		System.out.println("2. Press 2 For Lenevo");
		System.out.println("3. Press 3 For Dell");
		System.out.println("4. Press 4 For Asus");
		System.out.println("5. Press 5 For Acer");
		System.out.println("6. Press 6 To return Back");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		System.out.print("Enter your choice ---> ");
		String laptopsChoice = sc.nextLine();
		LaptopsSwitch(laptopsChoice);
	}
	
	public void LaptopsSwitch(String laptopsChoice)
	{
		switch (laptopsChoice)
		{
		case "1" :
			AppleLap ref1=new AppleLap("",0,"","");
			ref1.AppleLapOption();
			break;
			
		case "2" :
			Lenevo ref2=new Lenevo("",0,"","");
			ref2.LenevoOption();
			break;
			
		case "3" :
			Dell ref3=new Dell("",0,"","");
			ref3.DellOption();
			break;

		case "4" :
			ASUSLap ref4=new ASUSLap("",0,"","");
			ref4.ASUSLapOption();
			break;
			
		case "5" :
			Acer ref5=new Acer("",0,"","");
			ref5.AcerOption();
			break;
			
		case "6" :
			ElectronicsOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			LaptopsOption();
			break;
		}
	}	
}

//----------------------------------------------------------------------------------------------------------------------------------------

class AppleLap extends Laptops
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public AppleLap(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
//---------------------------------------------------------------------------------------------------
	
	
	public void AppleLapOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Laptops > Apple");
		System.out.println();
		System.out.println("1. ");
		AppleLap productDetails1 = new AppleLap("APPLE 2020 Macbook Air M1 - (8 GB/512 GB SSD/Mac OS Big Sur) MGN73HN/A  (13.3 inch, Space Grey, 1.29 kg)", 104890, "Dimensions: 304.1 x 212.4 x 10.9 mm, Weight: 1.29 kg", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		AppleLap productDetails2 = new AppleLap("APPLE MacBook Air M1 - (16 GB/256 GB SSD/Mac OS Big Sur) Z124J001KD  (13.3 inch, Space Grey, 1.29 Kg)", 99890, "Dimensions: 304.1 x 212.4 x 10.9, Weight: 1.29 Kg", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		AppleLap productDetails3 = new AppleLap("APPLE 2020 Macbook Air M1 - (8 GB/256 GB SSD/Mac OS Big Sur) MGN63HN/A  (13.3 inch, Space Grey, 1.29 kg)", 928900, "Dimensions: 30.41 cm x 1.61 cm x 21.24 cm, Weight: 1.29 kg", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- APPLE 2020 Macbook Air M1 - (8 GB/512 GB SSD/Mac OS Big Sur) MGN73HN/A  (13.3 inch, Space Grey, 1.29 kg)\r\n"
						+ "Product Price:- Rs 104890\r\n"
						+ "Product Dimensions:- Dimensions: 304.1 x 212.4 x 10.9 mm, Weight: 1.29 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- APPLE MacBook Air M1 - (16 GB/256 GB SSD/Mac OS Big Sur) Z124J001KD  (13.3 inch, Space Grey, 1.29 Kg)\r\n"
						+ "Product Price:- Rs 99890\r\n"
						+ "Product Dimensions:- Dimensions: 304.1 x 212.4 x 10.9, Weight: 1.29 Kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- APPLE 2020 Macbook Air M1 - (8 GB/256 GB SSD/Mac OS Big Sur) MGN63HN/A  (13.3 inch, Space Grey, 1.29 kg)\r\n"
						+ "Product Price:- Rs 928900\r\n"
						+ "Product Dimensions:- Dimensions: 30.41 cm x 1.61 cm x 21.24 cm, Weight: 1.29 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				LaptopsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				AppleLapOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			AppleLapOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//============================================================================================================================================================

class Lenevo extends Laptops
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Lenevo(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
	//---------------------------------------------------------------------------------------------------
	
	
	public void LenevoOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Laptops > Lenevo");
		System.out.println();
		System.out.println("1. ");
		Lenevo productDetails1 = new Lenevo("Lenovo IdeaPad Gaming Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce GTX 1650) 82K101B6IN|82K101FTIN Gaming Laptop  (15.6 Inch, Shadow Black, 2.25 kg)", 54890, "Dimensions: 359.6 x 251.9 x 24.2 mm, Weight: 2.25 kg", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Lenevo productDetails2 = new Lenevo("Lenovo IdeaPad Flex 5 Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 14ITL05 2 in 1 Laptop  (14 Inch, Graphite Grey, With MS Office)", 52140, "Dimensions: 321.5 x 217.5 x 20.4 mm", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Lenevo productDetails3 = new Lenevo("Lenovo IdeaPad 3 Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 82H801L7IN | 82H802FJIN | 82H802L3IN | 82H801LHIN Thin and Light Laptop  (15.6 inch, Arctic Grey, 1.65 kg, With MS Office)", 38890, "Dimensions: 359.2 x 236.5 x 19.9 mm, Weight: 1.65 kg", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Lenovo IdeaPad Gaming Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce GTX 1650) 82K101B6IN|82K101FTIN Gaming Laptop  (15.6 Inch, Shadow Black, 2.25 kg)\r\n"
						+ "Product Price:- Rs 54890\r\n"
						+ "Product Dimensions:- Dimensions: 359.6 x 251.9 x 24.2 mm, Weight: 2.25 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Lenovo IdeaPad Flex 5 Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 14ITL05 2 in 1 Laptop  (14 Inch, Graphite Grey, With MS Office)\r\n"
						+ "Product Price:- Rs 52140\r\n"
						+ "Product Dimensions:- Dimensions: 321.5 x 217.5 x 20.4 mm\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Lenovo IdeaPad 3 Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) 82H801L7IN | 82H802FJIN | 82H802L3IN | 82H801LHIN Thin and Light Laptop  (15.6 inch, Arctic Grey, 1.65 kg, With MS Office)\r\n"
						+ "Product Price:- Rs 38890\r\n"
						+ "Product Dimensions:- Dimensions: 359.2 x 236.5 x 19.9 mm, Weight: 1.65 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				LaptopsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				LenevoOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			LenevoOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class Dell extends Laptops
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public Dell(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void DellOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Laptops > Dell");
		System.out.println();
		System.out.println("1. ");
		Dell productDetails1 = new Dell("DELL Inspiron Ryzen 7 Octa Core 5825U - (16 GB/512 GB SSD/Windows 11 Home) Vostro 5625 Notebook  (16 Inch, Titan Grey, 1.91 Kg, With MS Office)", 77768, "Dimensions: 356 x 183 x 25.1 mm, Weight: 1.91 Kg", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Dell productDetails2 = new Dell("DELL Inspiron Core i3 11th Gen - (8 GB/256 GB SSD/Windows 11 Home) INSPIRON 5410 2 in 1 Laptop  (14 inch, Platinum Silver, 1.5 kg, With MS Office)", 45890, "Dimensions: 321 x 211 x 18.3 mm, Weight: 1.5 kg", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Dell productDetails3 = new Dell("DELL Vostro Ryzen 3 Dual Core R3-3250U - (8 GB/1 TB HDD/Windows 11 Home) Vostro 3405 Thin and Light Laptop  (35 cm, Accent Black, 1.59 Kg, With MS Office)", 34890, "Dimensions: 19.9 x 328 x 239, Weight: 1.59 Kg", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- DELL Inspiron Ryzen 7 Octa Core 5825U - (16 GB/512 GB SSD/Windows 11 Home) Vostro 5625 Notebook  (16 Inch, Titan Grey, 1.91 Kg, With MS Office)\r\n"
						+ "Product Price:- Rs 77768\r\n"
						+ "Product Dimensions:- Dimensions: 356 x 183 x 25.1 mm, Weight: 1.91 Kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- DELL Inspiron Core i3 11th Gen - (8 GB/256 GB SSD/Windows 11 Home) INSPIRON 5410 2 in 1 Laptop  (14 inch, Platinum Silver, 1.5 kg, With MS Office)\r\n"
						+ "Product Price:- Rs 45890\r\n"
						+ "Product Dimensions:- Dimensions: 321 x 211 x 18.3 mm, Weight: 1.5 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- DELL Vostro Ryzen 3 Dual Core R3-3250U - (8 GB/1 TB HDD/Windows 11 Home) Vostro 3405 Thin and Light Laptop  (35 cm, Accent Black, 1.59 Kg, With MS Office)\r\n"
						+ "Product Price:- Rs 34890\r\n"
						+ "Product Dimensions:- Dimensions: 19.9 x 328 x 239, Weight: 1.59 Kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				LaptopsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				DellOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			DellOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class ASUSLap extends Laptops
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public ASUSLap(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
//---------------------------------------------------------------------------------------------------
	
	
	public void ASUSLapOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Laptops > ASUS");
		System.out.println();
		System.out.println("1. ");
		ASUSLap productDetails1 = new ASUSLap("ASUS Zenbook 14X (2022) Space Edition Core i5 12th Gen - (16 GB/512 GB SSD/Windows 11 Home) UX5401ZAS-KN521WS Thin and Light Laptop  (14 inch, Titanium, 1.40 kg, With MS Office)", 114890, "Dimensions: 311.2 x 221.1 x 15.9 mm, Weight: 1.40 kg", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		ASUSLap productDetails2 = new ASUSLap("ASUS TUF Gaming F15 Core i5 10th Gen - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce GTX 1650/144 Hz) FX506LHB-HN358W Gaming Laptop  (15.6 inch, Black Plastic, 2.30 kg kg)", 47890, "Dimensions: 359 x 256 x 24.7 mm, Weight: 2.30 kg kg", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		ASUSLap productDetails3 = new ASUSLap("ASUS VivoBook 15 (2022) Core i5 10th Gen - (8 GB/512 GB SSD/Windows 11 Home) X515JA-EJ562WS | X515JA-EJ592WS Thin and Light Laptop  (15.6 inch, Transparent Silver, 1.80 kg, With MS Office)", 38890, "Dimensions: 360.2 x 234.9 x 19.9 mm, Weight: 1.80 kg", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- ASUS Zenbook 14X (2022) Space Edition Core i5 12th Gen - (16 GB/512 GB SSD/Windows 11 Home) UX5401ZAS-KN521WS Thin and Light Laptop  (14 inch, Titanium, 1.40 kg, With MS Office)\r\n"
						+ "Product Price:- Rs 114890\r\n"
						+ "Product Dimensions:- Dimensions: 311.2 x 221.1 x 15.9 mm, Weight: 1.40 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- ASUS TUF Gaming F15 Core i5 10th Gen - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce GTX 1650/144 Hz) FX506LHB-HN358W Gaming Laptop  (15.6 inch, Black Plastic, 2.30 kg kg)\r\n"
						+ "Product Price:- Rs 47890\r\n"
						+ "Product Dimensions:- Dimensions: 359 x 256 x 24.7 mm, Weight: 2.30 kg kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- ASUS VivoBook 15 (2022) Core i5 10th Gen - (8 GB/512 GB SSD/Windows 11 Home) X515JA-EJ562WS | X515JA-EJ592WS Thin and Light Laptop  (15.6 inch, Transparent Silver, 1.80 kg, With MS Office)\r\n"
						+ "Product Price:- Rs 38890\r\n"
						+ "Product Dimensions:- Dimensions: 360.2 x 234.9 x 19.9 mm, Weight: 1.80 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				LaptopsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				ASUSLapOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			ASUSLapOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//============================================================================================================================================================

class Acer extends Laptops
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Acer(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void AcerOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronics > Laptops > Acer");
		System.out.println();
		System.out.println("1. ");
		Acer productDetails1 = new Acer("acer Aspire 7 Core i5 12th Gen - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce RTX 3050) A715-51G Gaming Laptop  (15.6 Inch, Charcoal Black)", 59890, "Dimensions: 362.3 x 237.4 x 19.9 mm", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Acer productDetails2 = new Acer("acer Extensa Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) EX 215-54-583M Thin and Light Laptop  (15.6 Inch, Charcoal Black, 1.7 Kg)", 39890, "Dimensions: 363.4 x 238.4 x 19.9 mm, Weight: 1.7 Kg", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Acer productDetails3 = new Acer("acer Extensa Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) EX 215-54/ EX 215-54-356V Thin and Light Laptop  (15.6 Inch, Charcoal Black, 1.7 Kg)", 33890, "Dimensions: 363.4 x 238.4 x 19.9 mm, Weight: 1.7 Kg", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- acer Aspire 7 Core i5 12th Gen - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce RTX 3050) A715-51G Gaming Laptop  (15.6 Inch, Charcoal Black)\r\n"
						+ "Product Price:- Rs 59890\r\n"
						+ "Product Dimensions:- Dimensions: 362.3 x 237.4 x 19.9 mm\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- acer Extensa Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) EX 215-54-583M Thin and Light Laptop  (15.6 Inch, Charcoal Black, 1.7 Kg)\r\n"
						+ "Product Price:- Rs 39890\r\n"
						+ "Product Dimensions:- Dimensions: 363.4 x 238.4 x 19.9 mm, Weight: 1.7 Kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- acer Extensa Core i3 11th Gen - (8 GB/512 GB SSD/Windows 11 Home) EX 215-54/ EX 215-54-356V Thin and Light Laptop  (15.6 Inch, Charcoal Black, 1.7 Kg)\r\n"
						+ "Product Price:- Rs 33890\r\n"
						+ "Product Dimensions:- Dimensions: 363.4 x 238.4 x 19.9 mm, Weight: 1.7 Kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				LaptopsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				AcerOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			AcerOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//=================================================================================================================================================
//-------------------------------------------------        3. Electronic Accessories       --------------------------------------------------------
//=================================================================================================================================================

class ElectronicAccessories extends MainMenu
{
	public void ElectronicAccessoriesOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories");
		System.out.println();
		System.out.println("-------------- Electronic Accessories Section --------------");
		System.out.println("1. Press 1 For USB Cables");
		System.out.println("2. Press 2 For Adaptors");
		System.out.println("3. Press 3 For Power Banks");
		System.out.println("4. Press 4 For Earphones");
		System.out.println("5. Press 5 To Return Home Page");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();

		System.out.print("Enter your choice :- ");
		String electronicAccessoriesChoice = sc.nextLine();
		ElectronicAccessoriesSwitch(electronicAccessoriesChoice);
	}
			
	public void ElectronicAccessoriesSwitch(String electronicAccessoriesChoice)
	{
		switch (electronicAccessoriesChoice)
		{
			case "1" :
				USB ref1=new USB();
				ref1.USBOption();
				break;
					
			case "2" :
				Adaptors ref2=new Adaptors();
				ref2.AdaptorsOption();
				break;
					
			case "3" :
				PowerBanks ref3=new PowerBanks();
				ref3.PowerBanksOption();
				break;
					
			case "4" :
				Earphones ref4=new Earphones();
				ref4.EarphonesOption();
				break;
					
			case "5" :
				MainMenuOption();
				break;
					
			default :
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				ElectronicAccessoriesOption();
				break;
		}
	}
}

//==============================================================================================================================================

class USB extends ElectronicAccessories
{
	public void USBOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > USB Cables");
		System.out.println();
		System.out.println("** Choose the Type Of USB Cable you want **");
		System.out.println("1. Press 1 For Type C Port");
		System.out.println("2. Press 2 For Micro");
		System.out.println("3. Press 3 For iPhone Type Port");
		System.out.println("4. Press 4 To return Back");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		System.out.print("Enter your choice ---> ");
		String USBChoice = sc.nextLine();
		USBSwitch(USBChoice);
	}
	
	public void USBSwitch(String USBChoice)
	{
		switch (USBChoice)
		{
		case "1" :
			CPort ref1=new CPort("",0,"","");
			ref1.CPortOption();
			break;
			
		case "2" :
			Micro ref2=new Micro("",0,"","");
			ref2.MicroOption();
			break;
			
		case "3" :
			iPhone ref3=new iPhone("",0,"","");
			ref3.iPhoneOption();
			break;
						
		case "4" :
			ElectronicAccessoriesOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			USBOption();
			break;
		}
	}	
}

//========================================================================================================================================================

class CPort extends USB
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public CPort(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
//---------------------------------------------------------------------------------------------------
	
	
	public void CPortOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > USB Cables > C-port type");
		System.out.println();
		System.out.println("1. ");
		CPort productDetails1 = new CPort("boAt USB Type C Cable 2 m Type C A400 - 2m  (Compatible with All Phones, Black, One Cable)", 239, "Cable Length: 2 m", "2 Years");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		CPort productDetails2 = new CPort("ULTRADART USB Type C Cable 6.5 A 1.01 m ORIGINAL 65W VOOC/DART/WARP/DASH/SUPERVOOC/SUPERDART FAST CHARGER CABLE", 177, "Cable Length: 1.01 m", "3 Months");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		CPort productDetails3 = new CPort("SharpDart USB Type C Cable 6.5 A 1 m 65W DART/WARP/VOOC/DASH/SUPERVOOC/SUPERDART CHARGER CABLE", 200, "Cable Length: 1 m", "3 Months");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- boAt USB Type C Cable 2 m Type C A400 - 2m  (Compatible with All Phones, Black, One Cable)\r\n"
						+ "Product Price:- Rs 239\r\n"
						+ "Product Dimensions:- Cable Length: 2 m\r\n"
						+ "Product Warranty:- 2 Years";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- ULTRADART USB Type C Cable 6.5 A 1.01 m ORIGINAL 65W VOOC/DART/WARP/DASH/SUPERVOOC/SUPERDART FAST CHARGER CABLE\r\n"
						+ "Product Price:- Rs 177\r\n"
						+ "Product Dimensions:- Cable Length: 1.01 m\r\n"
						+ "Product Warranty:- 3 Months";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- SharpDart USB Type C Cable 6.5 A 1 m 65W DART/WARP/VOOC/DASH/SUPERVOOC/SUPERDART CHARGER CABLE\r\n"
						+ "Product Price:- Rs 200\r\n"
						+ "Product Dimensions:- Cable Length: 1 m\r\n"
						+ "Product Warranty:- 3 Months";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				USBOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				CPortOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			CPortOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//============================================================================================================================================================

class Micro extends USB
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Micro(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
	//---------------------------------------------------------------------------------------------------
	
	
	public void MicroOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > USB Cables > Micro type");
		System.out.println();
		System.out.println("1. ");
		Micro productDetails1 = new Micro("boAt Micro USB Cable 1.5 m Micro USB150  (Compatible with Mobiles, Tablets, Gaming Console, Black, Red)", 119, "Cable Length: 1.5 m", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Micro productDetails2 = new Micro("Ambrane Micro USB Cable 3 A 1 m ACM-1 1m  (Compatible with Tablets, Mobiles, Black, One Cable)", 119, "Cable Length: 1 m", "6 Months");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Micro productDetails3 = new Micro("Flipkart SmartBuy Micro USB Cable 2.4 A 1 m AMRPB1M01  (Compatible with Mobile, Laptop, Tablet, White, One Cable)", 103, "Cable Length: 1 ", "6 Months");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- boAt Micro USB Cable 1.5 m Micro USB150  (Compatible with Mobiles, Tablets, Gaming Console, Black, Red)\r\n"
						+ "Product Price:- Rs 119\r\n"
						+ "Product Dimensions:- Cable Length: 1.5 m\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Ambrane Micro USB Cable 3 A 1 m ACM-1 1m  (Compatible with Tablets, Mobiles, Black, One Cable)\r\n"
						+ "Product Price:- Rs 119\r\n"
						+ "Product Dimensions:- Cable Length: 1 m\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Flipkart SmartBuy Micro USB Cable 2.4 A 1 m AMRPB1M01  (Compatible with Mobile, Laptop, Tablet, White, One Cable)\r\n"
						+ "Product Price:- Rs 103\r\n"
						+ "Product Dimensions:- Cable Length: 1 \r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				USBOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				MicroOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			MicroOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class iPhone extends USB
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public iPhone(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void iPhoneOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > USB Cables > iPhone type");
		System.out.println();
		System.out.println("1. ");
		iPhone productDetails1 = new iPhone("APPLE Lightning Cable 1 A 1 m MXLY2ZM/A  (Compatible with Mobile, White, One Cable)", 1599, "Cable Length: 1 m", "Not Available");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		iPhone productDetails2 = new iPhone("boAt Lightning Cable 2.4 A 2 m ltgsilver500-2m  (Compatible with Apple iPod, Apple iPad, Apple iPhone, Black, White, One Cable)", 699, "Cable Length: 2 m", "Not available");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		iPhone productDetails3 = new iPhone("Black wizard Lightning Cable 3 A 1.5 m 3.1A Unbreakable Braided 100% MFI Certified  (Compatible with Mobile, Black, One Cable)", 333,  "Cable Length: 1.5 m", "Not available");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- APPLE Lightning Cable 1 A 1 m MXLY2ZM/A  (Compatible with Mobile, White, One Cable)\r\n"
						+ "Product Price:- Rs 1599\r\n"
						+ "Product Dimensions:- Cable Length: 1 m\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- boAt Lightning Cable 2.4 A 2 m ltgsilver500-2m  (Compatible with Apple iPod, Apple iPad, Apple iPhone, Black, White, One Cable)\r\n"
						+ "Product Price:- Rs 699\r\n"
						+ "Product Dimensions:- Cable Length: 2 m\r\n"
						+ "Product Warranty:- Not available";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Black wizard Lightning Cable 3 A 1.5 m 3.1A Unbreakable Braided 100% MFI Certified  (Compatible with Mobile, Black, One Cable)\r\n"
						+ "Product Price:- Rs 333\r\n"
						+ "Product Dimensions:- Cable Length: 1.5 m\r\n"
						+ "Product Warranty:- Not available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				USBOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				iPhoneOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			iPhoneOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}


//========================================================================================================================================================

class Adaptors extends ElectronicAccessories
{
	public void AdaptorsOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Adaptors");
		System.out.println();
		System.out.println("** Choose the Type Of Adaptor you want **");
		System.out.println("1. Press 1 For C Port");
		System.out.println("2. Press 2 For USB");
		System.out.println("3. Press 3 To return Back");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		System.out.print("Enter your choice ---> ");
		String adaptorsChoice = sc.nextLine();
		AdaptorsSwitch(adaptorsChoice);
	}
	
	public void AdaptorsSwitch(String adaptorsChoice)
	{
		switch (adaptorsChoice)
		{
		case "1" :
			Cport1 ref1=new Cport1("",0,"","");
			ref1.Cport1Option();
			break;
			
		case "2" :
			USB1 ref2=new USB1("",0,"","");
			ref2.USB1Option();
			break;
			
		case "3" :
			ElectronicAccessoriesOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			AdaptorsOption();
			break;
		}
	}	
}

//========================================================================================================================================================

class Cport1 extends Adaptors
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public Cport1(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
//---------------------------------------------------------------------------------------------------
	
	public void Cport1Option()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Adaptors > C-port type");
		System.out.println();
		System.out.println("1. ");
		Cport1 productDetails1 = new Cport1("CIHYARD Fast Type-C Charger for Xiaomi Mi Max 4 / Max4 Charger Original 27 W 5 A Mobile Charger  (White)", 421, "Not Available", "10 DAYS ONSITE REPLACEMENT WARRANTY");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Cport1 productDetails2 = new Cport1("Ubon Fasto Power CH-1000 Fast GaN PD Charger 45 W 3 A Multiport Mobile Charger  (White)", 1339, "Width x Height x Depth: 45 mm x 70 mm x 30 mm, Weight: 64 g", "6 Months");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Cport1 productDetails3 = new Cport1("MAK 20 W 3 A Multiport Mobile MK-479 PD + QC Super Fast Type C & USB Charger with Type C to Type C Cable Charger with Detachable Cable  (White, Cable Included)", 446, "Not Available", "Not Available");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- CIHYARD Fast Type-C Charger for Xiaomi Mi Max 4 / Max4 Charger Original 27 W 5 A Mobile Charger  (White)\r\n"
						+ "Product Price:- Rs 421\r\n"
						+ "Product Dimensions:- Not Available\r\n"
						+ "Product Warranty:- 10 DAYS ONSITE REPLACEMENT WARRANTY";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Ubon Fasto Power CH-1000 Fast GaN PD Charger 45 W 3 A Multiport Mobile Charger  (White)\r\n"
						+ "Product Price:- Rs 1339\r\n"
						+ "Product Dimensions:- Width x Height x Depth: 45 mm x 70 mm x 30 mm, Weight: 64 g\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- MAK 20 W 3 A Multiport Mobile MK-479 PD + QC Super Fast Type C & USB Charger with Type C to Type C Cable Charger with Detachable Cable  (White, Cable Included)\r\n"
						+ "Product Price:- Rs 446\r\n"
						+ "Product Dimensions:- Not Available\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				AdaptorsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				Cport1Option();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			Cport1Option();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//============================================================================================================================================================

class USB1 extends Adaptors
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public USB1(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	
	public void USB1Option()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Adaptors > USB Type");
		System.out.println();
		System.out.println("1. ");
		USB1 productDetails1 = new USB1("Mi 10W Fast Charger combo for Mi,Redmi,Xiomi devices (MicroUSB - Cable Included)  (Black, Cable Included)", 359, "Not Availabe", "6 Months");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		USB1 productDetails2 = new USB1("boAt 18W Power QC 3.0 Charger combo Compatible with Vivo,Oppo,Gionee,Xiomi,Redmi,realme,infinix,POCO,iphone,Samsung,Mi devices (Type C - Cable Included)  (White, Cable Included)", 319, "Not Availabe", "2 Years");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		USB1 productDetails3 = new USB1("Flipkart SmartBuy 12 W 2.4 A Mobile NC24MS01 Charger with Detachable Cable  (White, Cable Included)", 319, "Not Availabe", "6 Months");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Mi 10W Fast Charger combo for Mi,Redmi,Xiomi devices (MicroUSB - Cable Included)  (Black, Cable Included)\r\n"
						+ "Product Price:- Rs 359\r\n"
						+ "Product Dimensions:- Not Availabe\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- boAt 18W Power QC 3.0 Charger combo Compatible with Vivo,Oppo,Gionee,Xiomi,Redmi,realme,infinix,POCO,iphone,Samsung,Mi devices (Type C - Cable Included)  (White, Cable Included)\r\n"
						+ "Product Price:- Rs 319\r\n"
						+ "Product Dimensions:- Not Availabe\r\n"
						+ "Product Warranty:- 2 Years";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Flipkart SmartBuy 12 W 2.4 A Mobile NC24MS01 Charger with Detachable Cable  (White, Cable Included)\r\n"
						+ "Product Price:- Rs 319\r\n"
						+ "Product Dimensions:- Not Availabe\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				AdaptorsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				USB1Option();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			USB1Option();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//========================================================================================================================================================

class PowerBanks extends ElectronicAccessories
{
	public void PowerBanksOption()
	{
		System.out.println();
		System.out.println("Home > Electronic Accessories > Power Banks");
		System.out.println();
		System.out.println("** Choose the Brand Of Power-Bank you want **");
		System.out.println("1. Press 1 For Ambrane");
		System.out.println("2. Press 2 For Syska");
		System.out.println("3. Press 3 For Mi");
		System.out.println("4. Press 4 For Redmi");
		System.out.println("5. Press 5 For Realme");
		System.out.println("6. Press 6 To return Back");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		System.out.print("Enter your choice :- ");
		String powerBanksChoice = sc.nextLine();
		PowerBanksSwitch(powerBanksChoice);
	}
	
	public void PowerBanksSwitch(String powerBanksChoice)
	{
		switch (powerBanksChoice)
		{
		case "1" :
			Ambrane ref1=new Ambrane("",0,"","");
			ref1.AmbraneOption();
			break;
			
		case "2" :
			Syska ref2=new Syska("",0,"","");
			ref2.SyskaOption();
			break;
			
		case "3" :
			Mi ref3=new Mi("",0,"","");
			ref3.MiOption();
			break;

		case "4" :
			Redmi ref4=new Redmi("",0,"","");
			ref4.RedmiOption();
			break;
			
		case "5" :
			Realme ref5=new Realme("",0,"","");
			ref5.RealmeOption();
			break;
			
		case "6" :
			ElectronicAccessoriesOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			PowerBanksOption();
			break;
		}
	}	
}


//========================================================================================================================================================

class Ambrane extends PowerBanks
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public Ambrane(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

//---------------------------------------------------------------------------------------------------
	
	public void AmbraneOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Power Banks > Ambrane");
		System.out.println();
		System.out.println("1. ");
		Ambrane productDetails1 = new Ambrane("Ambrane 20000 mAh Power Bank (18 W, Power Delivery 3.0, Quick Charge 3.0)  (Black, Lithium Polymer)", 1799, "Not Available", "6 Months");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Ambrane productDetails2 = new Ambrane("Ambrane 10000 mAh Power Bank (20 W, Quick Charge 3.0, Power Delivery 2.0)  (Green, Lithium Polymer)", 999, "Not Available", "6 Months");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Ambrane productDetails3 = new Ambrane("Ambrane 10000 mAh Power Bank (12 W, Fast Charging)  (Black, Lithium Polymer)", 899, "Width: 6.9 mm, Depth: 13.5 mm, Weight: 187 g", "6 Months");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Ambrane 20000 mAh Power Bank (18 W, Power Delivery 3.0, Quick Charge 3.0)  (Black, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 1799\r\n"
						+ "Product Dimensions:- Not Available\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Ambrane 10000 mAh Power Bank (20 W, Quick Charge 3.0, Power Delivery 2.0)  (Green, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 999\r\n"
						+ "Product Dimensions:- Not Available\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Ambrane 10000 mAh Power Bank (12 W, Fast Charging)  (Black, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 899\r\n"
						+ "Product Dimensions:- Width: 6.9 mm, Depth: 13.5 mm, Weight: 187 g\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				PowerBanksOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				AmbraneOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			AmbraneOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//============================================================================================================================================================

class Syska extends PowerBanks
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Syska(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void SyskaOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Power Banks > Syska");
		System.out.println();
		System.out.println("1. ");
		Syska productDetails1 = new Syska("Syska 20000 mAh Power Bank (18 W, Fast Charging)  (Midnight Blue, Lithium Polymer)", 1499, "Weight: 445 mg", "6 Months");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Syska productDetails2 = new Syska("Syska 20000 mAh Power Bank (10 W, Fast Charging)  (Black, Lithium Polymer)", 1299, "Weight: 403 g", "6 Months");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Syska productDetails3 = new Syska("Syska 10000 mAh Power Bank  (Black, Lithium Polymer)", 799, "Not Availabe", "6 Months");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Syska 20000 mAh Power Bank (18 W, Fast Charging)  (Midnight Blue, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 1499\r\n"
						+ "Product Dimensions:- Weight: 445 mg\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Syska 20000 mAh Power Bank (10 W, Fast Charging)  (Black, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 1299\r\n"
						+ "Product Dimensions:- Weight: 403 g\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Syska 10000 mAh Power Bank  (Black, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 799\r\n"
						+ "Product Dimensions:- Not Availabe\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				PowerBanksOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				SyskaOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			SyskaOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class Mi extends PowerBanks
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public Mi(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
	//---------------------------------------------------------------------------------------------------
	
	public void MiOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Power Banks > Mi");
		System.out.println();
		System.out.println("1. ");
		Mi productDetails1 = new Mi("Mi 3i 20000 mAh Power Bank (Fast Charging, 18W)  (Black, Lithium Polymer)", 1999, "Width: 72.2 mm, Height: 150.6 mm, Depth: 26.3 mm, Weight: 434 g", "6 Months");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Mi productDetails2 = new Mi("Mi 3i 10000 mAh Power Bank (Fast Charging, 18W)  (Blue,Black,Midnight Black, Lithium Polymer)", 1149, "Width: 73.9 mm, Height: 147.8 mm, Depth: 15.3 mm, Weight: 251 g", "6 Months");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Mi productDetails3 = new Mi("Mi 3i 10000 mAh Power Bank (Fast Charging, 18W)  (Blue, Lithium Polymer)", 1149, "Width: 73.9 mm, Height: 147.8 mm, Depth: 15.3 mm, Weight: 251 g", "6 Months");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Mi 3i 20000 mAh Power Bank (Fast Charging, 18W)  (Black, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 1999\r\n"
						+ "Product Dimensions:- Width: 72.2 mm, Height: 150.6 mm, Depth: 26.3 mm, Weight: 434 g\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Mi 3i 10000 mAh Power Bank (Fast Charging, 18W)  (Blue,Black,Midnight Black, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 1149\r\n"
						+ "Product Dimensions:- Width: 73.9 mm, Height: 147.8 mm, Depth: 15.3 mm, Weight: 251 g\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Mi 3i 10000 mAh Power Bank (Fast Charging, 18W)  (Blue, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 1149\r\n"
						+ "Product Dimensions:- Width: 73.9 mm, Height: 147.8 mm, Depth: 15.3 mm, Weight: 251 g\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				PowerBanksOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				MiOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			MiOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class Redmi extends PowerBanks
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public Redmi(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}	
	
//---------------------------------------------------------------------------------------------------
	
	
	public void RedmiOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Power Banks > Redmi");
		System.out.println();
		System.out.println("1. ");
		Redmi productDetails1 = new Redmi("REDMI 20000 mAh Power Bank (18 W, Fast Charging)  (Black, Lithium Polymer)", 1899, "Width: 73.6 mm, Height: 154 mm, Depth: 27.3 mm, Weight: 447 g", "6 Months");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Redmi productDetails2 = new Redmi("REDMI 10000 mAh Power Bank (10 W, Fast Charging)  (Black, Lithium Polymer)", 1049, "Width: 73.6 mm, Height: 150.5 mm, Depth: 15.1 mm, Weight: 246.5 g", "6 Months");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Redmi productDetails3 = new Redmi("REDMI 10000 mAh Power Bank (10 W, Fast Charging)  (White, Lithium Polymer)", 1049, "Width: 73.6 mm, Height: 150.5 mm, Depth: 15.1 mm, Weight: 246.5 g", "6 Months");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- REDMI 20000 mAh Power Bank (18 W, Fast Charging)  (Black, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 1899\r\n"
						+ "Product Dimensions:- Width: 73.6 mm, Height: 154 mm, Depth: 27.3 mm, Weight: 447 g\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- REDMI 10000 mAh Power Bank (10 W, Fast Charging)  (Black, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 1049\r\n"
						+ "Product Dimensions:- Width: 73.6 mm, Height: 150.5 mm, Depth: 15.1 mm, Weight: 246.5 g\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- REDMI 10000 mAh Power Bank (10 W, Fast Charging)  (White, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 1049\r\n"
						+ "Product Dimensions:- Width: 73.6 mm, Height: 150.5 mm, Depth: 15.1 mm, Weight: 246.5 g\r\n"
						+ "Product Warranty:- 6 Months";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				PowerBanksOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				RedmiOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			RedmiOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//============================================================================================================================================================

class Realme extends PowerBanks
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Realme(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void RealmeOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Power Banks > Realme");
		System.out.println();
		System.out.println("1. ");
		Realme productDetails1 = new Realme("realme 10000 mAh Power Bank (30 W, Fast Charging)  (Yellow, Black, Lithium Polymer)", 1999, "Width: 75 mm, Height: 148 mm, Depth: 17 mm, Weight: 230 g", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Realme productDetails2 = new Realme("realme 10000 mAh Power Bank (22.5 W, Quick Charge 3.0)  (Yellow, Lithium-ion)", 1599, "Width: 90 mm, Height: 180 mm, Depth: 26.2 mm, Weight: 215 g", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Realme productDetails3 = new Realme("realme 10000 mAh Power Bank (12 W, Fast Charging)  (Yellow, Lithium-ion)", 1299, "Width: 90 mm, Height: 180 mm, Depth: 26.2 mm, Weight: 290 g", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- realme 10000 mAh Power Bank (30 W, Fast Charging)  (Yellow, Black, Lithium Polymer)\r\n"
						+ "Product Price:- Rs 1999\r\n"
						+ "Product Dimensions:- Width: 75 mm, Height: 148 mm, Depth: 17 mm, Weight: 230 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- realme 10000 mAh Power Bank (22.5 W, Quick Charge 3.0)  (Yellow, Lithium-ion)\r\n"
						+ "Product Price:- Rs 1599\r\n"
						+ "Product Dimensions:- Width: 90 mm, Height: 180 mm, Depth: 26.2 mm, Weight: 215 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- realme 10000 mAh Power Bank (12 W, Fast Charging)  (Yellow, Lithium-ion)\r\n"
						+ "Product Price:- Rs 1299\r\n"
						+ "Product Dimensions:- Width: 90 mm, Height: 180 mm, Depth: 26.2 mm, Weight: 290 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				PowerBanksOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				RealmeOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			RealmeOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//========================================================================================================================================================

class Earphones extends ElectronicAccessories
{
	public void EarphonesOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Earphones");
		System.out.println();
		System.out.println("** Choose the Brand Of Earphones you want **");
		System.out.println("1. Press 1 For Sony");
		System.out.println("2. Press 2 For JBL");
		System.out.println("3. Press 3 For Boat");
		System.out.println("4. Press 4 For Noise");
		System.out.println("5. Press 5 For Samsung");
		System.out.println("6. Press 6 To return Back");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		System.out.print("Enter your choice :- ");
		String earphonesChoice = sc.nextLine();
		EarphonesSwitch(earphonesChoice);
	}
	
	public void EarphonesSwitch(String earphonesChoice)
	{
		switch (earphonesChoice)
		{
		case "1" :
			Sony ref1=new Sony("",0,"","");
			ref1.SonyOption();
			break;
			
		case "2" :
			JBL ref2=new JBL("",0,"","");
			ref2.JBLOption();
			break;
			
		case "3" :
			Boat ref3=new Boat("",0,"","");
			ref3.BoatOption();
			break;

		case "4" :
			Noise ref4=new Noise("",0,"","");
			ref4.NoiseOption();
			break;
			
		case "5" :
			SamsungEar ref5=new SamsungEar("",0,"","");
			ref5.SamsungEarOption();
			break;
			
		case "6" :
			ElectronicAccessoriesOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			EarphonesOption();
			break;
		}
	}	
}

//----------------------------------------------------------------------------------------------------------------------------------------

class Sony extends Earphones
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public Sony(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}	
	
//---------------------------------------------------------------------------------------------------
	
	
	public void SonyOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Earphones > Sony");
		System.out.println();
		System.out.println("1. ");
		Sony productDetails1 = new Sony("SONY WF-C500/WZ IN IPX4/20Hrs Battery Life Bluetooth Headset  (Black, True Wireless)", 4399, "Width: 80 mm, Height: 34.9 mm, Depth: 30.9 mm, Weight: 35 g, Weight Without Battery: 32 g", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Sony productDetails2 = new Sony("SONY WI-C310 Bluetooth Headset  (Black, In the Ear)", 1699, "Not Available", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Sony productDetails3 = new Sony("SONY EX155 Wired Headset  (Black, In the Ear)", 899, "Cord Length: 1.2 mm, Other Dimensions: Product Dimensions: 4 x 4 x 17.3 cm", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- SONY WF-C500/WZ IN IPX4/20Hrs Battery Life Bluetooth Headset  (Black, True Wireless)\r\n"
						+ "Product Price:- Rs 4399\r\n"
						+ "Product Dimensions:- Width: 80 mm, Height: 34.9 mm, Depth: 30.9 mm, Weight: 35 g, Weight Without Battery: 32 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- SONY WI-C310 Bluetooth Headset  (Black, In the Ear)\r\n"
						+ "Product Price:- Rs 1699\r\n"
						+ "Product Dimensions:- Not Available\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- SONY EX155 Wired Headset  (Black, In the Ear)\r\n"
						+ "Product Price:- Rs 899\r\n"
						+ "Product Dimensions:- Cord Length: 1.2 mm, Other Dimensions: Product Dimensions: 4 x 4 x 17.3 cm\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				EarphonesOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				SonyOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			SonyOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//============================================================================================================================================================

class JBL extends Earphones
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public JBL(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void JBLOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Earphones > JBL");
		System.out.println();
		System.out.println("1. ");
		JBL productDetails1 = new JBL("JBL Tune 230NCTWS with Active Noise Cancellation,40H Playtime,JBL App & Speed Charge Bluetooth Headset  (Blue, True Wireless)", 5099, "Width: 46 mm, Height: 60 mm, Depth: 28 mm, Weight: 58 g", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		JBL productDetails2 = new JBL("JBL C150SI with One Button Universal Remote Wired Headset  (Black, In the Ear)", 649, "Cord Length: 1.2 m", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		JBL productDetails3 = new JBL("JBL Tune 125BT Flex Neckband with 16 Hour Playtime, Quick Charge, Multipoint Connect Bluetooth Headset  (Black, In the Ear)", 1899, "Width: 160 mm, Depth: 100 mm, Weight: 20 g", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- JBL Tune 230NCTWS with Active Noise Cancellation,40H Playtime,JBL App & Speed Charge Bluetooth Headset  (Blue, True Wireless)\r\n"
						+ "Product Price:- Rs 5099\r\n"
						+ "Product Dimensions:- Width: 46 mm, Height: 60 mm, Depth: 28 mm, Weight: 58 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- JBL C150SI with One Button Universal Remote Wired Headset  (Black, In the Ear)\r\n"
						+ "Product Price:- Rs 649\r\n"
						+ "Product Dimensions:- Cord Length: 1.2 m\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- JBL Tune 125BT Flex Neckband with 16 Hour Playtime, Quick Charge, Multipoint Connect Bluetooth Headset  (Black, In the Ear)\r\n"
						+ "Product Price:- Rs 1899\r\n"
						+ "Product Dimensions:- Width: 160 mm, Depth: 100 mm, Weight: 20 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				EarphonesOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				JBLOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			JBLOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class Boat extends Earphones
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public Boat(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void BoatOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Earphones > Boat");
		System.out.println();
		System.out.println("1. ");
		Boat productDetails1 = new Boat("boAt Airdopes 131 with upto 15 Hours Playback, 13mm Drivers and IWP Technology Bluetooth Headset  (Active Black, True Wireless)", 1099, "Not Available", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Boat productDetails2 = new Boat("boAt Rockerz 235v2/238 with ASAP Charge and upto 8 Hours Playback Bluetooth Headset  (Black, In the Ear)", 1099, "Not Available", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Boat productDetails3 = new Boat("boAt BassHeads 220 Wired Headset  (Black, In the Ear)", 599, "Not Available", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- boAt Airdopes 131 with upto 15 Hours Playback, 13mm Drivers and IWP Technology Bluetooth Headset  (Active Black, True Wireless)\r\n"
						+ "Product Price:- Rs 1099\r\n"
						+ "Product Dimensions:- Not Available\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- boAt Rockerz 235v2/238 with ASAP Charge and upto 8 Hours Playback Bluetooth Headset  (Black, In the Ear)\r\n"
						+ "Product Price:- Rs 1099\r\n"
						+ "Product Dimensions:- Not Available\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- boAt BassHeads 220 Wired Headset  (Black, In the Ear)\r\n"
						+ "Product Price:- Rs 599\r\n"
						+ "Product Dimensions:- Not Available\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				EarphonesOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				BoatOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			BoatOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class Noise extends Earphones
{
	Scanner sc = new Scanner(System.in);
	
//============================  Parameterized Construction  ==================================================================
	public Noise(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}
	
//---------------------------------------------------------------------------------------------------
	
	public void NoiseOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Earphones > Noise");
		System.out.println();
		System.out.println("1. ");
		Noise productDetails1 = new Noise("Noise Buds VS102 with 14 Hours Playtime, 11mm Driver, IPX5, and Unique Flybird Design Bluetooth Headset  (Jet Black, True Wireless)", 1199, "Not Available", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Noise productDetails2 = new Noise("Noise Combat with Ultra low latency, Dual Mic calling and Instacharge Bluetooth Gaming Headset  (Thunderblack, In the Ear)", 1699, "Not Available", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Noise productDetails3 = new Noise("Noise Nerve Neckband Bluetooth Headset  (Mist Grey, In the Ear)", 899, "Not Available", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Noise Buds VS102 with 14 Hours Playtime, 11mm Driver, IPX5, and Unique Flybird Design Bluetooth Headset  (Jet Black, True Wireless)\r\n"
						+ "Product Price:- Rs 1199\r\n"
						+ "Product Dimensions:- Not Available\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Noise Combat with Ultra low latency, Dual Mic calling and Instacharge Bluetooth Gaming Headset  (Thunderblack, In the Ear)\r\n"
						+ "Product Price:- Rs 1699\r\n"
						+ "Product Dimensions:- Not Available\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Noise Nerve Neckband Bluetooth Headset  (Mist Grey, In the Ear)\r\n"
						+ "Product Price:- Rs 899\r\n"
						+ "Product Dimensions:- Not Available\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				EarphonesOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				NoiseOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			NoiseOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//============================================================================================================================================================

class SamsungEar extends Earphones
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public SamsungEar(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void SamsungEarOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Electronic Accessories > Earphones > Samsung");
		System.out.println();
		System.out.println("1. ");
		SamsungEar productDetails1 = new SamsungEar("SAMSUNG Galaxy Buds 2 Bluetooth Headset  (Graphite, True Wireless)", 6898, "Width: 17 mm, Height: 20.9 mm, Depth: 21.1 mm, Weight: 41.2 g", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		SamsungEar productDetails2 = new SamsungEar("SAMSUNG Level U2 With Type-C Charging Bluetooth Headset  (Blue, In the Ear)", 2099, "Width: 19.48 mm, Height: 170.83 mm, Depth: 146 mm, Weight: 41.5 g", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		SamsungEar productDetails3 = new SamsungEar("SAMSUNG AKG-tuned IC100 Type-C Earphone Wired Headset  (White, In the Ear)", 1499, "Cord Length: 1 m", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- SAMSUNG Galaxy Buds 2 Bluetooth Headset  (Graphite, True Wireless)\r\n"
						+ "Product Price:- Rs 6898\r\n"
						+ "Product Dimensions:- Width: 17 mm, Height: 20.9 mm, Depth: 21.1 mm, Weight: 41.2 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- SAMSUNG Level U2 With Type-C Charging Bluetooth Headset  (Blue, In the Ear)\r\n"
						+ "Product Price:- Rs 2099\r\n"
						+ "Product Dimensions:- Width: 19.48 mm, Height: 170.83 mm, Depth: 146 mm, Weight: 41.5 g\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- SAMSUNG AKG-tuned IC100 Type-C Earphone Wired Headset  (White, In the Ear)\r\n"
						+ "Product Price:- Rs 1499\r\n"
						+ "Product Dimensions:- Cord Length: 1 m\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				EarphonesOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				SamsungEarOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			SamsungEarOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//====================================================================================================================================================
//--------------------------------------------------------------       4. Home       -----------------------------------------------------------------
//====================================================================================================================================================

class Home extends MainMenu
{
	public void HomeOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Households");
		System.out.println();
		System.out.println("-------------- Households Section --------------");
		System.out.println("1. Press 1 For Wall Clock Section");
		System.out.println("2. Press 2 For Utensils Section");
		System.out.println("3. Press 3 For BedSheets Section");
		System.out.println("4. Press 4 To Return Home Page ");
		System.out.println();


		System.out.print("Enter your choice :- ");
		String homeChoice = sc.nextLine();
		HomeSwitch(homeChoice);
	}
				
	public void HomeSwitch(String homeChoice)
	{
		switch (homeChoice)
		{
		case "1" :
			WallClock ref1=new WallClock("",0,"","");
			ref1.WallClockOption();
			break;
			
		case "2" :
			Utensils ref2=new Utensils("",0,"","");
			ref2.UtensilsOption();
			break;
			
		case "3" :
			BedSheets ref3=new BedSheets("",0,"","");
			ref3.BedSheetsOption();
			break;
						
			case "4" :
				MainMenuOption();
				break;	
						
			default :
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				HomeOption();
				break;
		}
	}
}

//========================================================================================================================================================

class WallClock extends Home
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public WallClock(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

//---------------------------------------------------------------------------------------------------
	
	public void WallClockOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Households > WallClocks");
		System.out.println();
		System.out.println("1. ");
		WallClock productDetails1 = new WallClock("Harris & Co. Clockmasters Analog 35 cm X 35 cm Wall Clock  (Brown, With Glass, Standard)", 3199,"Size: 35 cm x 35 cm", "1 Year");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		WallClock productDetails2 = new WallClock("Titan Analog 30 cm X 30 cm Wall Clock  (White, With Glass, Standard)", 1426,"Size: 30 cm x 30 cm", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		WallClock productDetails3 = new WallClock("AJANTA Digital 30 cm X 40 cm Wall Clock  (Black, With Glass, Standard)", 1090,"Size: 30 cm x 40 cm", "1 Year");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Harris & Co. Clockmasters Analog 35 cm X 35 cm Wall Clock  (Brown, With Glass, Standard)\r\n"
						+ "Product Price:- Rs 3199\r\n"
						+ "Product Dimensions:- Size: 35 cm x 35 cm\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Titan Analog 30 cm X 30 cm Wall Clock  (White, With Glass, Standard)\r\n"
						+ "Product Price:- Rs 1426\r\n"
						+ "Product Dimensions:- Size: 30 cm x 30 cm\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- AJANTA Digital 30 cm X 40 cm Wall Clock  (Black, With Glass, Standard)\r\n"
						+ "Product Price:- Rs 1090\r\n"
						+ "Product Dimensions:- Size: 30 cm x 40 cm\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				HomeOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				WallClockOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			WallClockOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//============================================================================================================================================================

class Utensils extends Home
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Utensils(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void UtensilsOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Households > Utensils");
		System.out.println();
		System.out.println("1. ");
		Utensils productDetails1 = new Utensils("Pigeon Special Plus Inner Lid 5 L Induction Bottom Pressure Cooker  (Hard Anodized)", 1649,"Capacity: 5 L", "Not Available");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Utensils productDetails2 = new Utensils("Pigeon Essentials Induction Bottom Non-Stick Coated Cookware Set  (Aluminium, 4 - Piece)", 1399,"Diameter:- Kadhai - 24 cm, Fry Pan - 24 cm, Tawa - 25 cm", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Utensils productDetails3 = new Utensils("Redific (Capacity 0.400 L, 0.650 L, 0.950 L, 1.250 L, 1.850 L) Non-Stick Coated Cookware Set  (Stainless Steel, 5 - Piece)", 399,"Diameter:- 21,19,17,15,13 cm", "Not Available");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Pigeon Special Plus Inner Lid 5 L Induction Bottom Pressure Cooker  (Hard Anodized)\r\n"
						+ "Product Price:- Rs 1649\r\n"
						+ "Product Dimensions:- Capacity: 5 L\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Pigeon Essentials Induction Bottom Non-Stick Coated Cookware Set  (Aluminium, 4 - Piece)\r\n"
						+ "Product Price:- Rs 1399\r\n"
						+ "Product Dimensions:- Diameter:- Kadhai - 24 cm, Fry Pan - 24 cm, Tawa - 25 cm\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Redific (Capacity 0.400 L, 0.650 L, 0.950 L, 1.250 L, 1.850 L) Non-Stick Coated Cookware Set  (Stainless Steel, 5 - Piece)\r\n"
						+ "Product Price:- Rs 399\r\n"
						+ "Product Dimensions:- Diameter:- 21,19,17,15,13 cm\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				HomeOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				UtensilsOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			UtensilsOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------

class BedSheets extends Home
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public BedSheets(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void BedSheetsOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Households > Bedsheets");
		System.out.println();
		System.out.println("1. ");
		BedSheets productDetails1 = new BedSheets("CLOTHOLOGY 144 TC Cotton Double Jaipuri Prints Flat Bedsheet  (Pack of 1, Yellow)", 323,"Flat Sheet Width: 82 inch / 210 cm, Flat Sheet Length: 92 inch / 235 cm, Fitted Sheet Depth, N/A cm, Pillow Cover Width: 17 inch / 44 cm, Pillow Cover Length: 25 inch / 66 cm, Weight: 600 g", "Not Available");
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		BedSheets productDetails2 = new BedSheets("RS Quality 144 TC Microfiber Double Printed Flat Bedsheet  (Pack of 1, Multicolor)", 319,"Flat Sheet Width: 88 inch / 225 cm, Flat Sheet Length: 90 inch / 230 cm", "Not Available");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		BedSheets productDetails3 = new BedSheets("METRO LIVING 104 TC Cotton Double Animal Flat Bedsheet  (Pack of 1, Pink)", 295,"Flat Sheet Width: 82 inch / 210 cm, Flat Sheet Length: 92 inch / 235 cm, Pillow Cover Width: 17 inch / 44 cm, Pillow Cover Length: 25 inch / 66 cm, Weight: 850 g", "Not Available");
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- CLOTHOLOGY 144 TC Cotton Double Jaipuri Prints Flat Bedsheet  (Pack of 1, Yellow)\r\n"
						+ "Product Price:- Rs 323\r\n"
						+ "Product Dimensions:- Flat Sheet Width: 82 inch / 210 cm, Flat Sheet Length: 92 inch / 235 cm, Fitted Sheet Depth, N/A cm, Pillow Cover Width: 17 inch / 44 cm, Pillow Cover Length: 25 inch / 66 cm, Weight: 600 g\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- RS Quality 144 TC Microfiber Double Printed Flat Bedsheet  (Pack of 1, Multicolor)\r\n"
						+ "Product Price:- Rs 319\r\n"
						+ "Product Dimensions:- Flat Sheet Width: 88 inch / 225 cm, Flat Sheet Length: 90 inch / 230 cm\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- METRO LIVING 104 TC Cotton Double Animal Flat Bedsheet  (Pack of 1, Pink)\r\n"
						+ "Product Price:- Rs 295\r\n"
						+ "Product Dimensions:- Flat Sheet Width: 82 inch / 210 cm, Flat Sheet Length: 92 inch / 235 cm, Pillow Cover Width: 17 inch / 44 cm, Pillow Cover Length: 25 inch / 66 cm, Weight: 850 g\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				HomeOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				BedSheetsOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			BedSheetsOption();
			break;
		
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//====================================================================================================================================================
//----------------------------------------------------------      5. Appliances      -----------------------------------------------------------------
//====================================================================================================================================================

class Appliances extends MainMenu
{
	public void AppliancesOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Appliances");
		System.out.println();
		System.out.println("-------------- Appliances Section --------------");
		System.out.println("1. Press 1 For Televisions Section");
		System.out.println("2. Press 2 For Washing Machines Section");
		System.out.println("3. Press 3 For Refrigerators Section");
		System.out.println("4. Press 4 For Air Conditioners Section");
		System.out.println("5. Press 5 For Microwaves Section");
		System.out.println("6. Press 6 For Kitchen Section");
		System.out.println("7. Press 7 To Return Home Page");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();

		System.out.print("Enter your choice :- ");
		String appliancesChoice = sc.nextLine();
		HomeSwitch(appliancesChoice);
	}
				
	public void HomeSwitch(String appliancesChoice)
	{
		switch (appliancesChoice)
		{
			case "1" :
				Televisions ref1=new Televisions("",0,"","");
				ref1.TelevisionsOption();
				break;
			
			case "2" :
				WashingMachines ref2=new WashingMachines("",0,"","");
				ref2.WashingMachinesOption();
				break;
			
			case "3" :
				Refrigerators ref3=new Refrigerators("",0,"","");
				ref3.RefrigeratorsOption();
				break;
						
			case "4" :
				AirConditioners ref4=new AirConditioners("",0,"","");
				ref4.AirConditionersOption();
				break;
			
			case "5" :
				Microwaves ref5=new Microwaves("",0,"","");
				ref5.MicrowavesOption();
				break;
			
			case "6" :
				Kitchen ref6=new Kitchen("",0,"","");
				ref6.KitchenOption();
				break;
						
			case "7" :
				MainMenuOption();
				break;
						
			default :
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				AppliancesOption();
				break;
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------

class Televisions extends  Appliances
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public Televisions(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void TelevisionsOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Appliances > Televisions");
		System.out.println();
		System.out.println("1. ");
		Televisions productDetails1 = new Televisions("LG 80 cm (32 inch) HD Ready LED Smart WebOS TV  (32LM565BPTA)", 12980, "Supported Apps: Netflix|Prime Video|Disney+Hotstar|Youtube, Operating System: WebOS, Resolution: HD Ready 1366 x 768 Pixels, Sound Output: 10 W, Refresh Rate: 50 Hz", "1 Year");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Televisions productDetails2 = new Televisions("Mi 5A 80 cm (32 inch) HD Ready LED Smart Android TV with Dolby Audio (2022 Model) ", 12999, "Supported Apps: Netflix|Prime Video|Disney+Hotstar|Youtube, Operating System: Android (Google Assistant & Chromecast in-built), Resolution: HD Ready 1366 x 768 Pixels, Sound Output: 20 W, Refresh Rate: 60 Hz", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Televisions productDetails3 = new Televisions("realme 80 cm (32 inch) HD Ready LED Smart Android TV  (TV 32)", 10999, "Supported Apps: Netflix|Prime Video|Disney+Hotstar|Youtube, Operating System: Android (Google Assistant & Chromecast in-built), Resolution: HD Ready 1366 x 768 Pixels, Sound Output: 24 W, Refresh Rate: 60 Hz", "1 Year");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- LG 80 cm (32 inch) HD Ready LED Smart WebOS TV  (32LM565BPTA)\r\n"
						+ "Product Price:- Rs 12980\r\n"
						+ "Product Dimensions:- Supported Apps: Netflix|Prime Video|Disney+Hotstar|Youtube, Operating System: WebOS, Resolution: HD Ready 1366 x 768 Pixels, Sound Output: 10 W, Refresh Rate: 50 Hz\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Mi 5A 80 cm (32 inch) HD Ready LED Smart Android TV with Dolby Audio (2022 Model) \r\n"
						+ "Product Price:- Rs 12999\r\n"
						+ "Product Dimensions:- Supported Apps: Netflix|Prime Video|Disney+Hotstar|Youtube, Operating System: Android (Google Assistant & Chromecast in-built), Resolution: HD Ready 1366 x 768 Pixels, Sound Output: 20 W, Refresh Rate: 60 Hz\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- realme 80 cm (32 inch) HD Ready LED Smart Android TV  (TV 32)\r\n"
						+ "Product Price:- Rs 10999\r\n"
						+ "Product Dimensions:- Supported Apps: Netflix|Prime Video|Disney+Hotstar|Youtube, Operating System: Android (Google Assistant & Chromecast in-built), Resolution: HD Ready 1366 x 768 Pixels, Sound Output: 24 W, Refresh Rate: 60 Hz\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				AppliancesOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				TelevisionsOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			TelevisionsOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------

class WashingMachines extends  Appliances
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public WashingMachines(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------

	public void WashingMachinesOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Appliances > Washing Machines");
		System.out.println();
		System.out.println("1. ");
		WashingMachines productDetails1 = new WashingMachines("LG 7 kg Steam Fully Automatic Front Load with In-built Heater Silver  (FHM1207SDL)", 28990, "Width: 60 cm, Height: 85 cm, Depth: 44 cm, Weight: 62 kg", "2 Years");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		WashingMachines productDetails2 = new WashingMachines("SAMSUNG 6.5 kg Diamond Drum feature Fully Automatic Top Load Silver  (WA65A4002VS/TL)", 13990, "Width: 54 cm, Height: 90.6 cm, Depth: 56.8 cm, Weight: 29.5 kg", "2 Years");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		WashingMachines productDetails3 = new WashingMachines("Whirlpool 7.5 kg 5 Star, Ace Wash Station Semi Automatic Top Load Grey  (ACE 7.5 SUPREME GREY DAZZLE)", 10990, "Width: 79.3 cm, Height: 95.6 cm, Depth: 48.5 cm, Weight: 22.5 kg", "2 Years");	
		System.out.println(productDetails3);
				
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- LG 7 kg Steam Fully Automatic Front Load with In-built Heater Silver  (FHM1207SDL)\r\n"
						+ "Product Price:- Rs 28990\r\n"
						+ "Product Dimensions:- Width: 60 cm, Height: 85 cm, Depth: 44 cm, Weight: 62 kg\r\n"
						+ "Product Warranty:- 2 Years";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- SAMSUNG 6.5 kg Diamond Drum feature Fully Automatic Top Load Silver  (WA65A4002VS/TL)\r\n"
						+ "Product Price:- Rs 13990\r\n"
						+ "Product Dimensions:- Width: 54 cm, Height: 90.6 cm, Depth: 56.8 cm, Weight: 29.5 kg\r\n"
						+ "Product Warranty:- 2 Years";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Whirlpool 7.5 kg 5 Star, Ace Wash Station Semi Automatic Top Load Grey  (ACE 7.5 SUPREME GREY DAZZLE)\r\n"
						+ "Product Price:- Rs 10990\r\n"
						+ "Product Dimensions:- Width: 79.3 cm, Height: 95.6 cm, Depth: 48.5 cm, Weight: 22.5 kg\r\n"
						+ "Product Warranty:- 2 Years";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				AppliancesOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				WashingMachinesOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			WashingMachinesOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------

class Refrigerators extends  Appliances
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public Refrigerators(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void RefrigeratorsOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Appliances > Refrigerators");
		System.out.println();
		System.out.println("1. ");
		Refrigerators productDetails1 = new Refrigerators("SAMSUNG 253 L Frost Free Double Door 3 Star Refrigerator  (Elegant Inox, RT28A3453S8/HL)", 24190, "Net Height: 1545 mm, Net Depth: 637 mm, Net Width: 555 mm, Weight: 48 kg", "1 Year");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Refrigerators productDetails2 = new Refrigerators("Whirlpool 215 L Direct Cool Single Door 5 Star Refrigerator with Base Drawer  (Wine Abyss, 230 IMPRO ROY 5S INV WINE ABYSS) ", 19990, "Net Height: 150.2 cm, Net Depth: 68.2 cm, Net Width: 56.6 cm, Weight: 41 kg", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Refrigerators productDetails3 = new Refrigerators("LG 190 L Direct Cool Single Door 4 Star Refrigerator with Base Drawer  (Blue Plumeria, GL-D201ABPY)", 15990, "Net Height: 132.6 cm, Net Depth: 63.3 cm, Net Width: 53.4 cm, Weight: 33 kg", "1 Year");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- SAMSUNG 253 L Frost Free Double Door 3 Star Refrigerator  (Elegant Inox, RT28A3453S8/HL)\r\n"
						+ "Product Price:- Rs 24190\r\n"
						+ "Product Dimensions:- Net Height: 1545 mm, Net Depth: 637 mm, Net Width: 555 mm, Weight: 48 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Whirlpool 215 L Direct Cool Single Door 5 Star Refrigerator with Base Drawer  (Wine Abyss, 230 IMPRO ROY 5S INV WINE ABYSS) \r\n"
						+ "Product Price:- Rs 19990\r\n"
						+ "Product Dimensions:- Net Height: 150.2 cm, Net Depth: 68.2 cm, Net Width: 56.6 cm, Weight: 41 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- LG 190 L Direct Cool Single Door 4 Star Refrigerator with Base Drawer  (Blue Plumeria, GL-D201ABPY)\r\n"
						+ "Product Price:- Rs 15990\r\n"
						+ "Product Dimensions:- Net Height: 132.6 cm, Net Depth: 63.3 cm, Net Width: 53.4 cm, Weight: 33 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				AppliancesOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				RefrigeratorsOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			RefrigeratorsOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------

class AirConditioners extends  Appliances
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public AirConditioners(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void AirConditionersOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Appliances > Air Conditioners");
		System.out.println();
		System.out.println("1. ");
		AirConditioners productDetails1 = new AirConditioners("LG Super Convertible 5-in-1 Cooling 1.5 Ton 3 Star Hot and Cold Split Dual Inverter HD Filter with Anti-Virus Protection AC - White  (PS-H19VNXF, Copper Condenser)", 40490, "Indoor W x H x D: 99.8 cm x 34.5 cm x 21 cm, Indoor Unit Weight: 11 kg, Outdoor W x H x D: 77 cm x 54.5 cm x 28.8 cm, Outdoor Unit Weight: 32 kg", "1 Year");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		AirConditioners productDetails2 = new AirConditioners("Voltas 1.5 Ton 5 Star Split Inverter AC - White  (4503224-185V DAZJ, Copper Condenser) ", 36499, "Indoor W x H x D: 99 cm x 31.5 cm x 24.2 c, Indoor Unit Weight: 12.2 kg, Outdoor W x H x D: 83.5 cm x 55.5 cm x 29.5 cm, Outdoor Unit Weight: 27.6 kg", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		AirConditioners productDetails3 = new AirConditioners("Whirlpool 4 in 1 Convertible Cooling 1.5 Ton 3 Star Split Inverter AC - White  (1.5T Magicool Convert Pro 3S INV (N) I/O, Copper Condenser)", 30990, "Indoor W x H x D: 100 cm x 29.5 cm x 23 cm, Indoor Unit Weight: 11 kg, Outdoor W x H x D: 78 cm x 55.7 cm x 24.1 cm, Outdoor Unit Weight: 23.6 kg", "1 Year");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- LG Super Convertible 5-in-1 Cooling 1.5 Ton 3 Star Hot and Cold Split Dual Inverter HD Filter with Anti-Virus Protection AC - White  (PS-H19VNXF, Copper Condenser)\r\n"
						+ "Product Price:- Rs 40490\r\n"
						+ "Product Dimensions:- Indoor W x H x D: 99.8 cm x 34.5 cm x 21 cm, Indoor Unit Weight: 11 kg, Outdoor W x H x D: 77 cm x 54.5 cm x 28.8 cm, Outdoor Unit Weight: 32 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Voltas 1.5 Ton 5 Star Split Inverter AC - White  (4503224-185V DAZJ, Copper Condenser) \r\n"
						+ "Product Price:- Rs 36499\r\n"
						+ "Product Dimensions:- Indoor W x H x D: 99 cm x 31.5 cm x 24.2 c, Indoor Unit Weight: 12.2 kg, Outdoor W x H x D: 83.5 cm x 55.5 cm x 29.5 cm, Outdoor Unit Weight: 27.6 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Whirlpool 4 in 1 Convertible Cooling 1.5 Ton 3 Star Split Inverter AC - White  (1.5T Magicool Convert Pro 3S INV (N) I/O, Copper Condenser)\r\n"
						+ "Product Price:- Rs 30990\r\n"
						+ "Product Dimensions:- Indoor W x H x D: 100 cm x 29.5 cm x 23 cm, Indoor Unit Weight: 11 kg, Outdoor W x H x D: 78 cm x 55.7 cm x 24.1 cm, Outdoor Unit Weight: 23.6 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				AppliancesOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				AirConditionersOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			AppliancesOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------

class Microwaves extends  Appliances
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Microwaves(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	
	public void MicrowavesOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Appliances > Microwaves");
		System.out.println();
		System.out.println("1. ");
		Microwaves productDetails1 = new Microwaves("SAMSUNG 28 L Convection & Grill Microwave Oven  (MC28A5013AK, Black)", 10999, "Width: 51.7 cm, Height: 31 cm, Depth: 47.48 cm, Weight: 17.5 kg", "1 Year");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Microwaves productDetails2 = new Microwaves("BAJAJ 23 L Convection & Grill Microwave Oven  (2310 ETC Convection Microwave Oven 23L, Black)", 8499, "Width: 33 cm, Height: 43 cm, Depth: 54 cm, Weight: 14.2 kg", "1 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Microwaves productDetails3 = new Microwaves("AJAJ 17 L Solo Microwave Oven  (1701MT, White)", 4290, "Width: 40.99 cm, Height: 30.98 cm, Depth: 51.99 cm, Weight: 12.2 kg", "1 Year");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- SAMSUNG 28 L Convection & Grill Microwave Oven  (MC28A5013AK, Black)\r\n"
						+ "Product Price:- Rs 10999\r\n"
						+ "Product Dimensions:- Width: 51.7 cm, Height: 31 cm, Depth: 47.48 cm, Weight: 17.5 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- BAJAJ 23 L Convection & Grill Microwave Oven  (2310 ETC Convection Microwave Oven 23L, Black)\r\n"
						+ "Product Price:- Rs 8499\r\n"
						+ "Product Dimensions:- Width: 33 cm, Height: 43 cm, Depth: 54 cm, Weight: 14.2 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- AJAJ 17 L Solo Microwave Oven  (1701MT, White)\r\n"
						+ "Product Price:- Rs 4290\r\n"
						+ "Product Dimensions:- Width: 40.99 cm, Height: 30.98 cm, Depth: 51.99 cm, Weight: 12.2 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				AppliancesOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				MicrowavesOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			MicrowavesOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------

class Kitchen extends  Appliances
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public Kitchen(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void KitchenOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Appliances > Kitchen");
		System.out.println();
		System.out.println("1. ");
		Kitchen productDetails1 = new Kitchen("Bajaj GX1 500 W Mixer Grinder", 1999, "Depth: 31.4 cm, Height: 23.5 cm, Width: 19 cm, Weight: 3.85 kg", "1 Year");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Kitchen productDetails2 = new Kitchen("Prestige Flash Atlas 500 W Mixer Grinder (3 Jars, White, Black) ", 1499, "Depth: 29 cm, Height: 30 cm, Width: 25 cm, Weight: 4.6 kg", "2 Year");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Kitchen productDetails3 = new Kitchen("Flipkart SmartBuy Classico PowerChef 500 W Mixer Grinder (3 Jars, Black, Grey)", 1199, "Depth: 11 cm, Height: 27 cm, Width: 57 cm, Weight: 4 kg", "2 Year");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Bajaj GX1 500 W Mixer Grinder\r\n"
						+ "Product Price:- Rs 1999\r\n"
						+ "Product Dimensions:- Depth: 31.4 cm, Height: 23.5 cm, Width: 19 cm, Weight: 3.85 kg\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Prestige Flash Atlas 500 W Mixer Grinder (3 Jars, White, Black) \r\n"
						+ "Product Price:- Rs 1499\r\n"
						+ "Product Dimensions:- Depth: 29 cm, Height: 30 cm, Width: 25 cm, Weight: 4.6 kg\r\n"
						+ "Product Warranty:- 2 Year";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Flipkart SmartBuy Classico PowerChef 500 W Mixer Grinder (3 Jars, Black, Grey)\r\n"
						+ "Product Price:- Rs 1199\r\n"
						+ "Product Dimensions:- Depth: 11 cm, Height: 27 cm, Width: 57 cm, Weight: 4 kg\r\n"
						+ "Product Warranty:- 2 Year";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				AppliancesOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				KitchenOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			KitchenOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//====================================================================================================================================================
//-----------------------------------------------------        6. Personal care       ----------------------------------------------------------------
//====================================================================================================================================================

class PersonalCare extends MainMenu
{
	public void PersonalCareOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Personal Care");
		System.out.println();
		System.out.println("-------------- Personal care Section --------------");
		System.out.println("1. Press 1 For Skin Care Section");
		System.out.println("2. Press 2 For Hair Care Section");
		System.out.println("3. Press 3 For Fragrances Section");
		System.out.println("4. Press 4 To Return Home Page");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();

		System.out.print("Enter your choice :- ");
		String personalCareChoice = sc.nextLine();
		PersonalCareSwitch(personalCareChoice);
	}
				
	public void PersonalCareSwitch(String personalCareChoice)
	{
		switch (personalCareChoice)
		{
		case "1" :
			Skin ref1=new Skin("",0,"","");
			ref1.SkinOption();
			break;
			
		case "2" :
			Hair ref2=new Hair("",0,"","");
			ref2.HairOption();
			break;
			
		case "3" :
			Fragrances ref3=new Fragrances("",0,"","");
			ref3.FragrancesOption();
			break;
						
			case "4" :
				MainMenuOption();
				break;	
						
			default :
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				PersonalCareOption();
				break;
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------

class Skin extends PersonalCare
{
	Scanner sc = new Scanner(System.in);
	
	//============================  Parameterized Construction  ==================================================================
	public Skin(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void SkinOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Personal Care > Skin Section");
		System.out.println();
		System.out.println("1. ");
		Skin productDetails1 = new Skin("MUUCHSTAC Men’s Herbal Skin Lightening Oil & Haldi Enriched Foam Face Wash  (2 Items in the set)", 439, "Skin Lightening Oil-30ML, Skin Lightening Haldi Enriched Foam Face Wash-100ML", "Not Available");	
		System.out.println(productDetails1);
		
		//2rd Product
		System.out.println();
		System.out.println("2. ");
		Skin productDetails2 = new Skin("APilgrim Acne Care Essentials Combo Kit ", 971, "1 Unit of Anti Acne Serum::1 Unit of Face Wash::1 Unit of Face Mist & Toner::1 Unit of Day Cream", "Not Available");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Skin productDetails3 = new Skin("LmCaffeine Coffee Moment Festive Skincare Gift Set| Daily Essentials for all skin types  (5 Items in the set)", 1129, "Coffee Body Scrub, Coffee Face Wash, Coffee Face Scrub, Towel, Wood Brew Scoop", "Not Available");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- MUUCHSTAC Men�s Herbal Skin Lightening Oil & Haldi Enriched Foam Face Wash  (2 Items in the set)\r\n"
						+ "Product Price:- Rs 439\r\n"
						+ "Product Dimensions:- Skin Lightening Oil-30ML, Skin Lightening Haldi Enriched Foam Face Wash-100ML\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- APilgrim Acne Care Essentials Combo Kit \r\n"
						+ "Product Price:- Rs 971\r\n"
						+ "Product Dimensions:- 1 Unit of Anti Acne Serum::1 Unit of Face Wash::1 Unit of Face Mist & Toner::1 Unit of Day Cream\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- LmCaffeine Coffee Moment Festive Skincare Gift Set| Daily Essentials for all skin types  (5 Items in the set)\r\n"
						+ "Product Price:- Rs 1129\r\n"
						+ "Product Dimensions:- Coffee Body Scrub, Coffee Face Wash, Coffee Face Scrub, Towel, Wood Brew Scoop\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				PersonalCareOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				SkinOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			SkinOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//----------------------------------------------------------------------------------------------------------------------------------------

class Hair extends PersonalCare
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Hair(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void HairOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Personal Care > Hair Section");
		System.out.println();
		System.out.println("1. ");
		Hair productDetails1 = new Hair("urbangabru Zero to Infinity Clay Hair Wax for Strong Hold Hair Wax  (100 g)", 289, "Quantity: 100 g", "Not Available");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Hair productDetails2 = new Hair("USTRAA Hair Cream for men - Daily Use Hair Cream  (100 g)", 128, "Quantity: 100 g", "Not Available");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Hair productDetails3 = new Hair("BEARDO XXTRA STRONG HOLD HAIR WAX Hair Wax  (50 g)", 156, "Quantity: 100 g", "Not Available");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- urbangabru Zero to Infinity Clay Hair Wax for Strong Hold Hair Wax  (100 g)\r\n"
						+ "Product Price:- Rs 289\r\n"
						+ "Product Dimensions:- Quantity: 100 g\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- USTRAA Hair Cream for men - Daily Use Hair Cream  (100 g)\r\n"
						+ "Product Price:- Rs 128\r\n"
						+ "Product Dimensions:- Quantity: 100 g\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- BEARDO XXTRA STRONG HOLD HAIR WAX Hair Wax  (50 g)\r\n"
						+ "Product Price:- Rs 156\r\n"
						+ "Product Dimensions:- Quantity: 100 g\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				PersonalCareOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				HairOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			HairOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//------------------------------------------------------------------------------------------------------------------------------------------

class Fragrances extends PersonalCare
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public Fragrances(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void FragrancesOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Personal Care > Fragrances");
		System.out.println();
		System.out.println("1. ");
		Fragrances productDetails1 = new Fragrances("DENVER Hamilton and Pride Combo Deodorant Spray - For Men  (400 ml, Pack of 2)", 265, "1 Hamilton Deo, 1 Pride Deo", "Not Available");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Fragrances productDetails2 = new Fragrances("FOGG Deo Combo Pack (PUNCH + RUSH 300ml) Body Spray - For Men  (300 ml, Pack of 2)", 176, "Quantity: 300 ml", "Not Available");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Fragrances productDetails3 = new Fragrances("KS SPARK Deodorant Spray - For Men & Women  (300 ml, Pack of 2)", 165, "Quantity: 300 ml", "Not Available");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- DENVER Hamilton and Pride Combo Deodorant Spray - For Men  (400 ml, Pack of 2)\r\n"
						+ "Product Price:- Rs 265\r\n"
						+ "Product Dimensions:- 1 Hamilton Deo, 1 Pride Deo\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- FOGG Deo Combo Pack (PUNCH + RUSH 300ml) Body Spray - For Men  (300 ml, Pack of 2)\r\n"
						+ "Product Price:- Rs 176\r\n"
						+ "Product Dimensions:- Quantity: 300 ml\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- KS SPARK Deodorant Spray - For Men & Women  (300 ml, Pack of 2)\r\n"
						+ "Product Price:- Rs 165\r\n"
						+ "Product Dimensions:- Quantity: 300 ml\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				PersonalCareOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				FragrancesOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			FragrancesOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//====================================================================================================================================================
//--------------------------------------------------------------        7. Toys       ----------------------------------------------------------------
//====================================================================================================================================================

class Toys extends MainMenu
{
	public void ToysOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Toys");
		System.out.println();
		System.out.println("-------------- Toys Section --------------");
		System.out.println("1. Press 1 For Indoor Toys Section");
		System.out.println("2. Press 2 For Outdoor Toys Section");
		System.out.println("3. Press 3 To Return Home Page");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();

		System.out.print("Enter your choice :- ");
		String toysChoice = sc.nextLine();
		ToysSwitch(toysChoice);
	}
				
	public void ToysSwitch(String toysChoice)
	{
		switch (toysChoice)
		{
		case "1" :
			Indoor ref1=new Indoor("",0,"","");
			ref1.IndoorOption();
			break;
			
		case "2" :
			Outdoor ref2=new Outdoor("",0,"","");
			ref2.OutdoorOption();
			break;
						
			case "3" :
				MainMenuOption();
				break;
						
			default :
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				ToysOption();
				break;
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------


class Indoor extends Toys
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Indoor(String name, long price, String description, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = description;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void IndoorOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Toys > Indoor");
		System.out.println();
		System.out.println("1. ");
		Indoor productDetails1 = new Indoor("Kids creation International Business Game with Folding Board Game Set", 220, "International business board game an all time favourite family game the older variations of the international business board game have been all time favourite family games. plastic brings you this family board game with a revamped modern day appeal and more exciting game play than ever. In this game you have to act and play as if you are a foreign businessman. You can trade in any currency and you are supposed to make maximum profit to win this game. A minimum of two and a maximum of six players is required to play this interesting game, so you can enjoy it with your friend or the entire family. Develops business skills and logical reasoning as a player you are required to trade in properties around the world, and in the bargain, earn maximum points and currencies. Recommended for children above 5 years of age, this board game for family includes a game board, 26 property cards, 4 passports, 6 pawns, 24 houses, 4 credit cards, dollar, 2 dices and a rule book. The player who uses his business acumen to accumulate highest profit at the end is the winner. Playing this international business board game stimulates your child's logical reasoning and trading skills.", "7 Days Replacement Policy");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Indoor productDetails2 = new Indoor("MPH ENTERPRISE Magnetic Educational Toys Travel Chess Set with Folding Board", 343, "Magnetic Travel Chess Board Set, Smooth Surface, Folding Portable Chess Set For Adult And Kids. Ideal for:- Boys and girls. Material:- Plastic with magnet finishing. Includes:- 64 square board with 32 plastic moulded chess pieces. Recommended Age:- 6 years and up. Sharpen Your Child's Mental Skills. Product Features: 1) Due to the magnetism, all the pieces could be stay in place even if the board is bumped or if you have to pick the board up and move it. Never worry the pieces may missing. 2) The chess set Made of durable HIPS plastic with Fine texture, gives you smooth hand-feel while lightweight and portable; well-crafted chess pieces make it much more deluxe. 3) The board can be folded to a small storage box and to be put into the backpack and take anywhere, travel, way to school, outdoor picnic and so on. 4) This chess set is suitable for both adult and child. Get one and play with your child after work or at weekend at home, relieve stress and enjoy the happy chess time together. 5) The chess set is compact and lightweight, easy-carrying and perfect for travel. Play the chess game with your partner or even a stranger on the train to make your journey full of fun.", "7 Days Replacement Policy");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Indoor productDetails3 = new Indoor("Aryan Sports Round Pocket Carrom Board with Coins,Striker &,Powder (SMALL-20 Inch) 3 MM Ply 5.08 cm Carrom Board  (Beige)", 399, "Width: 50.8 cm, Height: 5.08 cm, Depth: 50.8 cm, Weight: 2 kg", "7 Days Replacement Policy");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Kids creation International Business Game with Folding Board Game Set\r\n"
						+ "Product Price:- Rs 220\r\n"
						+ "Product Description:- International business board game an all time favourite family game the older variations of the international business board game have been all time favourite family games. plastic brings you this family board game with a revamped modern day appeal and more exciting game play than ever. In this game you have to act and play as if you are a foreign businessman. You can trade in any currency and you are supposed to make maximum profit to win this game. A minimum of two and a maximum of six players is required to play this interesting game, so you can enjoy it with your friend or the entire family. Develops business skills and logical reasoning as a player you are required to trade in properties around the world, and in the bargain, earn maximum points and currencies. Recommended for children above 5 years of age, this board game for family includes a game board, 26 property cards, 4 passports, 6 pawns, 24 houses, 4 credit cards, dollar, 2 dices and a rule book. The player who uses his business acumen to accumulate highest profit at the end is the winner. Playing this international business board game stimulates your child's logical reasoning and trading skills.\r\n"
						+ "Product Warranty:- 7 Days Replacement Policy";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- MPH ENTERPRISE Magnetic Educational Toys Travel Chess Set with Folding Board\r\n"
						+ "Product Price:- Rs 343\r\n"
						+ "Product Description:- Magnetic Travel Chess Board Set, Smooth Surface, Folding Portable Chess Set For Adult And Kids. Ideal for:- Boys and girls. Material:- Plastic with magnet finishing. Includes:- 64 square board with 32 plastic moulded chess pieces. Recommended Age:- 6 years and up. Sharpen Your Child's Mental Skills. Product Features: 1) Due to the magnetism, all the pieces could be stay in place even if the board is bumped or if you have to pick the board up and move it. Never worry the pieces may missing. 2) The chess set Made of durable HIPS plastic with Fine texture, gives you smooth hand-feel while lightweight and portable; well-crafted chess pieces make it much more deluxe. 3) The board can be folded to a small storage box and to be put into the backpack and take anywhere, travel, way to school, outdoor picnic and so on. 4) This chess set is suitable for both adult and child. Get one and play with your child after work or at weekend at home, relieve stress and enjoy the happy chess time together. 5) The chess set is compact and lightweight, easy-carrying and perfect for travel. Play the chess game with your partner or even a stranger on the train to make your journey full of fun.\r\n"
						+ "Product Warranty:- 7 Days Replacement Policy";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Aryan Sports Round Pocket Carrom Board with Coins,Striker &,Powder (SMALL-20 Inch) 3 MM Ply 5.08 cm Carrom Board  (Beige)\r\n"
						+ "Product Price:- Rs 399\r\n"
						+ "Product Description:- Width: 50.8 cm, Height: 5.08 cm, Depth: 50.8 cm, Weight: 2 kg\r\n"
						+ "Product Warranty:- 7 Days Replacement Policy";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				ToysOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				IndoorOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			IndoorOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//------------------------------------------------------------------------------------------------------------------------------------------

class Outdoor extends Toys
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	public Outdoor(String name, long price, String description, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = description;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	
	public void OutdoorOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Toys > Indoor");
		System.out.println();
		System.out.println("1. ");
		Outdoor productDetails1 = new Outdoor("R for Rabbit Road Runner Mario Kick Scooter for Kids Kids Scooter  (Yellow Blue)", 3349, "Package Dimensions: 61cms x 19.5cms x 31cms, Product Dimensions: 62cms(L) x 30cms(B) x 82cms(H)", "1 Year");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Outdoor productDetails2 = new Outdoor("THELHARSATOYS Inflatable Pool For Kids and Adults 10 Ft Family Swimming Pool , Pool For Backyard, Outdoor, Party (And Get an 3 Nozzles Electric Pump For Free) Inflatable Swimming Pool  (Blue)", 4129, "Inflatable Pool For Kids and Adults 10 Ft Family Swimming Pool , Pool For Backyard, Outdoor, Party (And Get an 3 Nozzles Electric Pump For Free)", "Manufacturing defect or Only if the Product is already Damage when open from the Package,If you have received a damaged or defective product or if it is not as described");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Outdoor productDetails3 = new Outdoor("Webby Foldable Baby Garden Slide for Kids  (Multicolor)", 1570, "Product Depth: 97 cm, Product Width: 33.02 cm, Product Height: 80 cm, Product Weight: 4 kg", "Not Available");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- R for Rabbit Road Runner Mario Kick Scooter for Kids Kids Scooter  (Yellow Blue)\r\n"
						+ "Product Price:- Rs 3349\r\n"
						+ "Product Dimensions:- Package Dimensions: 61cms x 19.5cms x 31cms, Product Dimensions: 62cms(L) x 30cms(B) x 82cms(H)\r\n"
						+ "Product Warranty:- 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- THELHARSATOYS Inflatable Pool For Kids and Adults 10 Ft Family Swimming Pool , Pool For Backyard, Outdoor, Party (And Get an 3 Nozzles Electric Pump For Free) Inflatable Swimming Pool  (Blue)\r\n"
						+ "Product Price:- Rs 4129\r\n"
						+ "Product Description:- Inflatable Pool For Kids and Adults 10 Ft Family Swimming Pool , Pool For Backyard, Outdoor, Party (And Get an 3 Nozzles Electric Pump For Free)\r\n"
						+ "Product Warranty:- Manufacturing defect or Only if the Product is already Damage when open from the Package,If you have received a damaged or defective product or if it is not as described";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Webby Foldable Baby Garden Slide for Kids  (Multicolor)\r\n"
						+ "Product Price:- Rs 1570\r\n"
						+ "Product Dimensions:- Product Depth: 97 cm, Product Width: 33.02 cm, Product Height: 80 cm, Product Weight: 4 kg\r\n"
						+ "Product Warranty:- Not Available\r\n"
						+ "";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				ToysOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				OutdoorOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			OutdoorOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//====================================================================================================================================================
//------------------------------------------------------------        8. Sports       ----------------------------------------------------------------
//====================================================================================================================================================

class Sports extends MainMenu
{
	
	public void SportsOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Sports");
		System.out.println();
		System.out.println("-------------- Sports Section --------------");
		System.out.println("1. Press 1 For Badminton Section");
		System.out.println("2. Press 2 For Football Section");
		System.out.println("3. Press 3 For Cricket Section");
		System.out.println("4. Press 4 To Return Home Page");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();

		System.out.print("Enter your choice :- ");
		String sportsChoice = sc.nextLine();
		SportsSwitch(sportsChoice);
	}
				
	public void SportsSwitch(String sportsChoice)
	{
		switch (sportsChoice)
		{
			case "1" :
				Badminton ref1=new Badminton();
				ref1.BadmintonOption();
				break;
				
			case "2" :
				Football ref2=new Football("",0,"","");
				ref2.FootballOption();
				break;
						
			case "3" :
				Cricket ref3=new Cricket();
				ref3.CricketOption();
				break;
						
			case "4" :
				MainMenuOption();
				break;

			default :
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				SportsOption();
				break;
		}
	}
}

//------------------------------------------------------------------------------------------------------------------------------------------


class Badminton extends Sports
{
	public void BadmintonOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Sports > Badminton");
		System.out.println();
		System.out.println("** Choose the Badminton Equipment You want **");
		System.out.println("1. Press 1 For Badminton Racquet");
		System.out.println("2. Press 2 For Shuttlecock");
		System.out.println("3. Press 3 For Combo");
		System.out.println("4. Press 4 To return Back");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		System.out.print("Enter your choice :- ");
		String badmintonChoice = sc.nextLine();
		BadmintonSwitch(badmintonChoice);
	}
	
	public void BadmintonSwitch(String badmintonChoice)
	{
		switch (badmintonChoice)
		{
		case "1" :
			Racquet ref1=new Racquet("",0,"","");
			ref1.RacquetOption();
			break;
			
		case "2" :
			Shuttlecock ref2=new Shuttlecock("",0,"","");
			ref2.ShuttlecockOption();
			break;
			
		case "3" :
			Combo ref3=new Combo("",0,"","");
			ref3.ComboOption();
			break;
						
		case "4" :
			SportsOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			BadmintonOption();
			break;
		}
	}	
}
//------------------------------------------------------------------------------------------------------------------------------------------
class Racquet extends Badminton
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public Racquet(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	
	public void RacquetOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Sports > Badminton > Raquet");
		System.out.println();
		System.out.println("1. ");
		Racquet productDetails1 = new Racquet("Yonex Nanoray Light 18i Black Strung Badminton Racquet (Weight: 77 g, Tension: 30 lbs)  (Pack of: 1, 77 g)", 1599, "Height: 25.5 inch, Beam Width: 15 mm", "Not Available");	
		System.out.println(productDetails1);
		
		//1st Product
		System.out.println();
		System.out.println("2. ");
		Racquet productDetails2 = new Racquet("Adrenex by Flipkart Dominate Plus 3000 Graphite Multicolor Strung Badminton Racquet  (Pack of: 1, 84 g)", 899, "Height: 66.4 cm, Beam Width: 11.6 mm", "Not Available");
		System.out.println(productDetails2);
		
		//1st Product
		System.out.println();
		System.out.println("3. ");
		Racquet productDetails3 = new Racquet("LI-NING XP-90-IV Black, White, Silver Strung Badminton Racquet  (Pack of: 1, 86 g)", 415, "Height: 23.87 inch, Beam Width: 20 mm", "Not Available");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Yonex Nanoray Light 18i Black Strung Badminton Racquet (Weight: 77 g, Tension: 30 lbs)  (Pack of: 1, 77 g)\r\n"
						+ "Product Price:- Rs 1599\r\n"
						+ "Product Dimensions:- Height: 25.5 inch, Beam Width: 15 mm\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Adrenex by Flipkart Dominate Plus 3000 Graphite Multicolor Strung Badminton Racquet  (Pack of: 1, 84 g)\r\n"
						+ "Product Price:- Rs 899\r\n"
						+ "Product Dimensions:- Height: 66.4 cm, Beam Width: 11.6 mm\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- LI-NING XP-90-IV Black, White, Silver Strung Badminton Racquet  (Pack of: 1, 86 g)\r\n"
						+ "Product Price:- Rs 415\r\n"
						+ "Product Dimensions:- Height: 23.87 inch, Beam Width: 20 mm\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				BadmintonOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				RacquetOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			RacquetOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//------------------------------------------------------------------------------------------------------------------------------------------
class Shuttlecock extends Badminton
{
	Scanner sc = new Scanner(System.in);

	//========================================  Parameterized Constructor   ============================================	
	public Shuttlecock(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void ShuttlecockOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Sports > Badminton > Shuttlecock");
		System.out.println();
		System.out.println("1. ");
		Shuttlecock productDetails1 = new Shuttlecock("YONEX MAVIS 350 Nylon Shuttle - Yellow  (Slow, 75, Pack of 6))", 899, "Weight: 0.9 g * 6", "Not Available");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Shuttlecock productDetails2 = new Shuttlecock("LI-NING Bolt Boost Nylon Shuttle - Yellow  (Slow, 75, Pack of 6)", 347, "Weight: 100g", "Not Available");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Shuttlecock productDetails3 = new Shuttlecock("Strauss Badminton Shuttlecock Nylon Shuttle - Green  (Fast, 79, Pack of 6)", 249, "Weight: 110 g", "Not Available");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- YONEX MAVIS 350 Nylon Shuttle - Yellow  (Slow, 75, Pack of 6))\r\n"
						+ "Product Price:- Rs 899\r\n"
						+ "Product Dimensions:- Weight: 0.9 g * 6\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- LI-NING Bolt Boost Nylon Shuttle - Yellow  (Slow, 75, Pack of 6)\r\n"
						+ "Product Price:- Rs 347\r\n"
						+ "Product Dimensions:- Weight: 100g\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Strauss Badminton Shuttlecock Nylon Shuttle - Green  (Fast, 79, Pack of 6)\r\n"
						+ "Product Price:- Rs 249\r\n"
						+ "Product Dimensions:- Weight: 110 g\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				BadmintonOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				ShuttlecockOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			ShuttlecockOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//---------------------------------------------------------------------------------------------------------------------------------------
class Combo extends Badminton
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================
	
	public Combo(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void ComboOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Sports > Badminton > Combo");
		System.out.println();
		System.out.println("1. ");
		Combo productDetails1 = new Combo("YONEX GR 303 F Multicolor Strung Badminton Racquet  (Pack of: 2, 95 g)", 899, "WHeight: 20.5 inch, Beam Width: 20.5 mm", "Not Available");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Combo productDetails2 = new Combo("Adrenex by Flipkart R201 Combo with cover Multicolor Strung Badminton Racquet  (Pack of: 2, 196 g)", 399, "Height: 26 Inch, Weight: 196.0 g, Beam Width: 20 mm", "Not Available");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Combo productDetails3 = new Combo("Jager-Smith PB-2000 Combo & Featherlite 2 Shuttle Badminton Kit", 424, "Width: 26 cm, Height: 59 cm, Depth: 4 cm", "Not Available");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- YONEX GR 303 F Multicolor Strung Badminton Racquet  (Pack of: 2, 95 g)\r\n"
						+ "Product Price:- Rs 899\r\n"
						+ "Product Dimensions:- WHeight: 20.5 inch, Beam Width: 20.5 mm\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Adrenex by Flipkart R201 Combo with cover Multicolor Strung Badminton Racquet  (Pack of: 2, 196 g)\r\n"
						+ "Product Price:- Rs 399\r\n"
						+ "Product Dimensions:- Height: 26 Inch, Weight: 196.0 g, Beam Width: 20 mm\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Jager-Smith PB-2000 Combo & Featherlite 2 Shuttle Badminton Kit\r\n"
						+ "Product Price:- Rs 424\r\n"
						+ "Product Dimensions:- Width: 26 cm, Height: 59 cm, Depth: 4 cm\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				BadmintonOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				ComboOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			ComboOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Football extends Sports
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public Football(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	
	public void FootballOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Sports > Football");
		System.out.println();
		System.out.println("1. ");
		Football productDetails1 = new Football("NSUN KIPSTA Football Ball Size 5 F300 Football Kit", 1599, "Width: 12 cm, Height: 12 cm, Depth: 7 cm", "Domestic Warranty: 1 Year, International Warranty: 1 Year");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Football productDetails2 = new Football("Statu S Vintex football HRE with Yellow color 1pcs Football - Size: 5  (Pack of 1)", 1499, "Weight: 50-100 g", "Not Available");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Football productDetails3 = new Football("PUMA TeamFinal Turf Ball Football - Size: 5  (Pack of 1)", 928, "Weight: 50-100 g", "Domestic Warranty: 3 Months");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- NSUN KIPSTA Football Ball Size 5 F300 Football Kit\r\n"
						+ "Product Price:- Rs 1599\r\n"
						+ "Product Dimensions:- Width: 12 cm, Height: 12 cm, Depth: 7 cm\r\n"
						+ "Product Warranty:- Domestic Warranty: 1 Year, International Warranty: 1 Year";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- Statu S Vintex football HRE with Yellow color 1pcs Football - Size: 5  (Pack of 1)\r\n"
						+ "Product Price:- Rs 1499\r\n"
						+ "Product Dimensions:- Weight: 50-100 g\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- PUMA TeamFinal Turf Ball Football - Size: 5  (Pack of 1)\r\n"
						+ "Product Price:- Rs 928\r\n"
						+ "Product Dimensions:- Weight: 50-100 g\r\n"
						+ "Product Warranty:- Domestic Warranty: 3 Months";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				SportsOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				FootballOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			FootballOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
		

//===========================================================================================================================================
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Cricket extends Sports
{	
	public void CricketOption()
	{
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Sports > Cricket");
		System.out.println();
		System.out.println("** Choose the cricket equipment you want **");
		System.out.println("1. Press 1 For Bat");
		System.out.println("2. Press 2 For Ball");
		System.out.println("3. Press 3 To return Back");
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		
		System.out.print("Enter your choice :- ");
		String cricketChoice = sc.nextLine();
		CricketSwitch(cricketChoice);
	}
	
	public void CricketSwitch(String cricketChoice)
	{
		switch (cricketChoice)
		{
		case "1" :
			Bat ref1=new Bat("",0,"","");
			ref1.BatOption();
			break;
			
		case "2" :
			Ball ref2=new Ball("",0,"","");
			ref2.BallOption();
			break;
						
		case "3" :
			SportsOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			CricketOption();
			break;
		}
	}
}

class Bat extends Cricket
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public Bat(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	
	public void BatOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Sports > Cricket > Bat");
		System.out.println();
		System.out.println("1. ");
		Bat productDetails1 = new Bat("PUMA FUTURE EW SNR 7.1 English Willow Cricket Bat  (700-1200 g)", 6992, "Width: 10.8 cm, Height: 87 cm, Depth: 10 cm", "3 Months");	
		System.out.println(productDetails1);
		
		//1st Product
		System.out.println();
		System.out.println("2. ");
		Bat productDetails2 = new Bat("kushm player edition bat Kashmir Willow Cricket Bat  (1200-1250 g)", 1723, "Width: 12.7 cm, Height: 70 cm, Depth: 8 cm", "Not Available");
		System.out.println(productDetails2);
		
		//1st Product
		System.out.println();
		System.out.println("3. ");
		Bat productDetails3 = new Bat("CEAT Z-Cart Plus Kashmir Willow Cricket Bat  (1120 - 1200 g)", 1717, "Width: 4.25 inch, Height: 33.5 inch, Depth: 5 cm", "Not Available");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- PUMA FUTURE EW SNR 7.1 English Willow Cricket Bat  (700-1200 g)\r\n"
						+ "Product Price:- Rs 6992\r\n"
						+ "Product Dimensions:- Width: 10.8 cm, Height: 87 cm, Depth: 10 cm\r\n"
						+ "Product Warranty:- 3 Months";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- kushm player edition bat Kashmir Willow Cricket Bat  (1200-1250 g)\r\n"
						+ "Product Price:- Rs 1723\r\n"
						+ "Product Dimensions:- Width: 12.7 cm, Height: 70 cm, Depth: 8 cm\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- CEAT Z-Cart Plus Kashmir Willow Cricket Bat  (1120 - 1200 g)\r\n"
						+ "Product Price:- Rs 1717\r\n"
						+ "Product Dimensions:- Width: 4.25 inch, Height: 33.5 inch, Depth: 5 cm\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				CricketOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				BatOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			BatOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}
//------------------------------------------------------------------------------------------------------------------------------------------

class Ball extends Cricket
{
	Scanner sc = new Scanner(System.in);
	
	//========================================  Parameterized Constructor  ============================================	
	public Ball(String name, long price, String dimensions, String warranty) {
		super();
		this.name = name;
		this.price = price;
		this.Dimensions = dimensions;
		this.warranty = warranty;
	}

	//---------------------------------------------------------------------------------------------------
	
	public void BallOption()
	{	
		//1st Product
		System.out.println();
		System.out.println("================================================================================");
		System.out.println();
		System.out.println("Home > Sports > Cricket > Ball");
		System.out.println();
		System.out.println("1. ");
		Ball productDetails1 = new Ball("Joxen Sports Cricket Leather Ball (Pack Of 2)", 255, "Weight: 247 g", "Not Available");	
		System.out.println(productDetails1);
		
		//2nd Product
		System.out.println();
		System.out.println("2. ");
		Ball productDetails2 = new Ball("SG Club Cricket Leather Ball  (Pack of 1)", 572, "Weight: 50-100 g", "Not Available");
		System.out.println(productDetails2);
		
		//3rd Product
		System.out.println();
		System.out.println("3. ");
		Ball productDetails3 = new Ball("Adrenex by Flipkart Maestro 2 panel White Cricket Leather ball  (Pack of 1, White)", 249, "Weight: 150-170 g", "Not Available");	
		System.out.println(productDetails3);
		
		System.out.println();
		System.out.println("Press 4 For Previous Menu");
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println();
		System.out.print("Enter Your Choice ---> ");

		String value=sc.nextLine();
		
		switch (value)
		{
			case "1" :
				String a = "Product Name:- Joxen Sports Cricket Leather Ball (Pack Of 2)\r\n"
						+ "Product Price:- Rs 255\r\n"
						+ "Product Dimensions:- Weight: 247 g\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(a);
				break;
				
			case "2" :
				String b = "Product Name:- SG Club Cricket Leather Ball  (Pack of 1)\r\n"
						+ "Product Price:- Rs 572\r\n"
						+ "Product Dimensions:- Weight: 50-100 g\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(b);
				break;
				
			case "3" :
				String c = "Product Name:- Adrenex by Flipkart Maestro 2 panel White Cricket Leather ball  (Pack of 1, White)\r\n"
						+ "Product Price:- Rs 249\r\n"
						+ "Product Dimensions:- Weight: 150-170 g\r\n"
						+ "Product Warranty:- Not Available";
				Declaration.cart.add(c);
				break;
				
			case "4" :
				CricketOption();
				break;
				
			default :
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println("                    --------- Enter Valid Input ---------                       ");
				System.out.println("--------------------------------------------------------------------------------");
				BallOption();
				break;
		}
		
		Order();
	}
		
	public void Order()
	{
		System.out.println();
		System.out.println("Enter 1 for Add to Cart");
		System.out.println("Enter 2 For Back to Product List");
		System.out.println();
		System.out.print("Enter your Choice ---> ");
		String r=sc.nextLine();
		
		switch (r)
		{
		case "1" :
			System.out.println();
			System.out.println("================================================================================");
			System.out.println(                     "Added to Cart Successfully !!!"); 
			System.out.println("================================================================================");
			System.out.println();
			OrderDetails();
			break;
			
		case "2" :	
			int size=Declaration.cart.size();
			int length=size-1;
			Declaration.cart.remove(length);
			BallOption();
			break;
			
		default :
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("                    --------- Enter Valid Input ---------                       ");
			System.out.println("--------------------------------------------------------------------------------");
			Order();
			break;	
		}
	}
}

//====================================================================================================================================================
//----------------------------------------------------           Main Method           ---------------------------------------------------------------
//====================================================================================================================================================
public class Driver // Main Class or Driver Class
{	
	static // Static Block
	{
		System.out.println("|-------------------------------------------------------------------------------|");
		System.out.println("|                               Welcome to Rkart                                |");
		System.out.println("|-------------------------------------------------------------------------------|");
		System.out.println();
		System.out.println(" For Better Experience Kindly Enter following Details ");
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
	}

	public static void main(String[] args) // Main Method Or Driver Method
	{
		Dec ref1 = new Declaration();     // upcasting
		
		ref1.LoginPage();
			
    }
}
//====================================================================================================================================================
//====================================================================================================================================================
