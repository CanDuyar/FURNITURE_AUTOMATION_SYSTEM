import java.util.Scanner;

/**
* @author Can Duyar 171044075
* interactive menu design to test all methods...
*/

public class Main{

public static void main(String[] args) {

	Branch b1 = new Branch("Gebze");
	Branch b2 = new Branch("Darica");
	Branch b3 = new Branch("Cayirova");
	Branch b4 = new Branch("Istanbul");
	Branch b5 = new Branch("Pendik");
	Branch b6 = new Branch("Kadikoy");
	Branch b7 = new Branch("Maltepe");
	Branch b8 = new Branch("Kartal");

	BranchEmployee e1 = new BranchEmployee("Gebze", "Elon", "Musk");
	BranchEmployee e2 = new BranchEmployee("Darica", "Bill","Gates");
	BranchEmployee e3 = new BranchEmployee("Cayirova", "Steve", "Jobs");
	BranchEmployee e4 = new BranchEmployee("Istanbul", "Mark", "Zuckerberg");
	BranchEmployee e5 = new BranchEmployee("Sakarya", "Jack","Ma");
	BranchEmployee e6 = new BranchEmployee("Kadikoy", "Sundar", "Pichai");
	BranchEmployee e7 = new BranchEmployee("Maltepe", "James", "Gosling");
	BranchEmployee e8 = new BranchEmployee("Kartal", "Dennis","Ritchie");
	
	//OFFICE CHAIRS WITH DIFFERENT COLORS AND MODELS ACCORDING TO PDF INSTRUCTIONS
	Furniture f1 = new Furniture("OfficeChair", "M1", "Red", 5);
	Furniture f2 = new Furniture("OfficeChair", "M2", "Green", 5);
	Furniture f3 = new Furniture("OfficeChair", "M3", "Blue", 5);
	Furniture f4 = new Furniture("OfficeChair", "M4", "Black", 5);
	Furniture f5 = new Furniture("OfficeChair", "M5", "White", 5);
	Furniture f6 = new Furniture("OfficeChair", "M6", "Pink", 5);
	Furniture f7 = new Furniture("OfficeChair", "M7", "Yellow", 5);

	//OFFICE DESKS WITH DIFFERENT COLORS AND MODELS ACCORDING TO PDF INSTRUCTIONS
	Furniture f8 = new Furniture("OfficeDesk","M1","Yellow",4);
	Furniture f9 = new Furniture("OfficeDesk","M2","White",4);
	Furniture f10 = new Furniture("OfficeDesk","M3","Black",4);
	Furniture f11 = new Furniture("OfficeDesk","M4","Green",4);
	Furniture f12 = new Furniture("OfficeDesk","M5","Brown",4);

	//MEETING TABLES WITH DIFFERENT COLORS AND MODELS ACCORDING TO PDF INSTRUCTIONS
	Furniture f13 = new Furniture("MeetingTable","M1","Green",4);
	Furniture f14 = new Furniture("MeetingTable","M2","Pink",4);
	Furniture f15 = new Furniture("MeetingTable","M3","Blue",4);
	Furniture f16 = new Furniture("MeetingTable","M4","White",4);
	Furniture f17 = new Furniture("MeetingTable","M5","Black",4);
	Furniture f18 = new Furniture("MeetingTable","M6","Brown",4);
	Furniture f19 = new Furniture("MeetingTable","M7","Black",4);
	Furniture f20 = new Furniture("MeetingTable","M8","Blue",4);
	Furniture f21 = new Furniture("MeetingTable","M9","Yellow",4);
	Furniture f22 = new Furniture("MeetingTable","M10","Green",4);

	//OFFICE CABINETS WITH DIFFERENT MODELS ACCORDING TO PDF INSTRUCTIONS
	Furniture f23 = new Furniture("OfficeCabinet","M1",1);
	Furniture f24 = new Furniture("OfficeCabinet","M2",1);
	Furniture f25 = new Furniture("OfficeCabinet","M3",1);
	Furniture f26 = new Furniture("OfficeCabinet","M4",1);
	Furniture f27 = new Furniture("OfficeCabinet","M5",1);
	Furniture f28 = new Furniture("OfficeCabinet","M6",1);
	Furniture f29 = new Furniture("OfficeCabinet","M7",1);
	Furniture f30 = new Furniture("OfficeCabinet","M8",1);
	Furniture f31 = new Furniture("OfficeCabinet","M9",1);
	Furniture f32 = new Furniture("OfficeCabinet","M10",1);
	Furniture f33 = new Furniture("OfficeCabinet","M11",1);
	Furniture f34 = new Furniture("OfficeCabinet","M12",1);

	//BOOKCASES WITH DIFFERENT MODELS ACCORDING TO PDF INSTRUCTIONS
	Furniture f35 = new Furniture("Bookcase","M1",1);
	Furniture f36 = new Furniture("Bookcase","M2",1);
	Furniture f37 = new Furniture("Bookcase","M3",1);
	Furniture f38 = new Furniture("Bookcase","M4",1);
	Furniture f39 = new Furniture("Bookcase","M5",1);
	Furniture f40 = new Furniture("Bookcase","M6",1);
	Furniture f41 = new Furniture("Bookcase","M7",1);
	Furniture f42 = new Furniture("Bookcase","M8",1);
	Furniture f43 = new Furniture("Bookcase","M9",1);
	Furniture f44 = new Furniture("Bookcase","M10",1);
	Furniture f45 = new Furniture("Bookcase","M11",1);
	Furniture f46 = new Furniture("Bookcase","M12",1);

	Customer custom = new Customer();
	Company company = new Company();

	Administrator admin = new Administrator("Can","Duyar");
	company.setAdmin(admin);

	boolean control = true;
	int order_control = 4;
	Scanner input = new Scanner(System.in);
	//adding branches
	company.getAdmin().addBranch(b1,0);
	company.getAdmin().addBranch(b2,1);
	company.getAdmin().addBranch(b3,2);
	company.getAdmin().addBranch(b4,3);

	System.out.println("********* FURNITURE - AUTOMATION SYSTEM *********\n");


	/*adding furnitures-> according to my algorithm design, at the beginning of the program admin did this operation because there was no
	branch employee. After administrator added at least one branch employee then these branch employee(s)
	will add products instead of administrator, because it is the task of branch employee... Please go to 
	line 527 to see this.
	*/
	company.getAdmin().addProduct(f1,1);
	company.getAdmin().addProduct(f2,1);
	company.getAdmin().addProduct(f3,1);
	company.getAdmin().addProduct(f4,1);
	company.getAdmin().addProduct(f5,1);
	company.getAdmin().addProduct(f6,1);
	company.getAdmin().addProduct(f7,1);
	company.getAdmin().addProduct(f8,1);
	company.getAdmin().addProduct(f9,1);
	company.getAdmin().addProduct(f10,2);
	company.getAdmin().addProduct(f11,2);
	company.getAdmin().addProduct(f12,2);
	company.getAdmin().addProduct(f13,2);
	company.getAdmin().addProduct(f14,2);
	company.getAdmin().addProduct(f15,2);
	company.getAdmin().addProduct(f16,2);
	company.getAdmin().addProduct(f17,2);
	company.getAdmin().addProduct(f18,2);
	company.getAdmin().addProduct(f19,2);
	company.getAdmin().addProduct(f20,2);
	company.getAdmin().addProduct(f21,2);
	company.getAdmin().addProduct(f22,3);
	company.getAdmin().addProduct(f23,3);
	company.getAdmin().addProduct(f24,3);
	company.getAdmin().addProduct(f25,3);
	company.getAdmin().addProduct(f26,3);
	company.getAdmin().addProduct(f27,3);
	company.getAdmin().addProduct(f28,3);
	company.getAdmin().addProduct(f29,3);
	company.getAdmin().addProduct(f30,3);
	company.getAdmin().addProduct(f31,3);
	company.getAdmin().addProduct(f32,3);
	company.getAdmin().addProduct(f33,4);
	company.getAdmin().addProduct(f34,4);
	company.getAdmin().addProduct(f35,4);
	company.getAdmin().addProduct(f36,4);
	company.getAdmin().addProduct(f37,4);
	company.getAdmin().addProduct(f38,4);
	company.getAdmin().addProduct(f39,4);
	company.getAdmin().addProduct(f40,4);
	company.getAdmin().addProduct(f41,4);
	company.getAdmin().addProduct(f42,4);
	company.getAdmin().addProduct(f43,4);
	company.getAdmin().addProduct(f44,4);
	company.getAdmin().addProduct(f45,4);
	company.getAdmin().addProduct(f46,4);




	int customerNumber = 0;
	boolean registrationMod = false;


	while(control){
		int employeeNum = 0;

		System.out.println("\n1-Administrator Mode");
		System.out.println("2-Branch Employee Mode");
		System.out.println("3-Customer Mode");						
		System.out.println("4-Exit");
		System.out.println("\nPlease enter your choice:");
		int operation = input.nextInt();

		switch(operation){

			//administrator mode
			case 1:
				boolean control_adminPanel = true;
				while(control_adminPanel){
					System.out.println("\nDear " + company.getAdmin().getName() + " " + company.getAdmin().getSurname() + ", Welcome!");
					System.out.println("\n1-Adding branch");
					System.out.println("2-Removing branch");
					System.out.println("3-Adding branch employee");
					System.out.println("4-Removing branch employee");
					System.out.println("5-Query for products that need to be supplied");
					System.out.println("6-Go back");
					System.out.println("\nPlease enter your choice:");
					int operation_admin = input.nextInt();


				//ADDING BRANCH
					if(operation_admin == 1){
						
						boolean control_addingPanel = true;
						
						while(control_addingPanel){
							System.out.println("\n1- " + b1.getBranchName());
							System.out.println("2- " + b2.getBranchName());
							System.out.println("3- " + b3.getBranchName());
							System.out.println("4- " + b4.getBranchName());
							System.out.println("5- " + b5.getBranchName());
							System.out.println("6- " + b6.getBranchName());
							System.out.println("7- " + b7.getBranchName());
							System.out.println("8- " + b8.getBranchName());
							System.out.println("9- Go back");
							System.out.println("\nPlease enter a district to add branchs:");
							int add_branch = input.nextInt();

							if(add_branch > 9 || add_branch < 1){
								System.out.println("\nYou entered an invalid operation!!! Please try again...");
							}
	

							else if(add_branch != 9){

								if(add_branch == 1)
									company.getAdmin().addBranch(b1,order_control);
								else if(add_branch == 2)
									company.getAdmin().addBranch(b2,order_control);
								else if(add_branch == 3)
									company.getAdmin().addBranch(b3,order_control);
								else if(add_branch == 4)
									company.getAdmin().addBranch(b4,order_control);
								else if(add_branch == 5)
									company.getAdmin().addBranch(b5,order_control);
								else if(add_branch == 6)
									company.getAdmin().addBranch(b6,order_control);
								else if(add_branch == 7)
									company.getAdmin().addBranch(b7,order_control);
								else if(add_branch == 8)
									company.getAdmin().addBranch(b8,order_control);

								order_control++;
								}

							else if(add_branch == 9){
								System.out.println("\nYou exit from the adding-branch panel...");
								control_addingPanel = false;
							}

					}

				}

					//REMOVING BRANCH
					else if(operation_admin == 2){
						
						boolean remove_control = true;

						while(remove_control){
							System.out.println();
							company.getAdmin().showBranchMenu();
							System.out.println("0-Go back");
							System.out.println("\nPlease enter district-id to remove from branches:");
							int remove_branch = input.nextInt();
							if(remove_branch == 0){
								System.out.println("You exit from the removing-branch panel");
								remove_control = false;
								break;
							}
							
							remove_branch = remove_branch-1;
							company.getAdmin().removeBranch(remove_branch);

						}
	

					}

					//ADDING BRANCH EMPLOYEE
					
					else if(operation_admin == 3){
						boolean branchEmployee_adding = true;

					  while(branchEmployee_adding){
						System.out.println();
						company.getAdmin().showBranchMenu();
						System.out.println();
						System.out.println("\n1- " + e1.getName()+" "+ e1.getSurname());
						System.out.println("2- " + e2.getName()+" "+e2.getSurname());
						System.out.println("3- " + e3.getName()+" "+e3.getSurname());
						System.out.println("4- " + e4.getName()+" " +e4.getSurname());
						System.out.println("5- " + e5.getName()+" " +e5.getSurname());
						System.out.println("6- " + e6.getName()+" "+e6.getSurname());
						System.out.println("7- " + e7.getName()+" " +e7.getSurname());
						System.out.println("8- " + e8.getName()+" " +e8.getSurname());

						System.out.println("0-Go back");
						System.out.println("\nPlease enter 'district-id of branch' ");	
						int adding_be = input.nextInt();
						if(adding_be == 0){
							System.out.println("You exit from the adding-branchemployee panel");
							branchEmployee_adding = false;
							break;
						}
						System.out.println("\n'Please enter the 'id of branch-employee' to assign her/him:");
						int id_be = input.nextInt();
						
						if(id_be == 1){
							company.getAdmin().addBranchEmployee(e1,adding_be-1,employeeNum);
							employeeNum++;
						}

						else if(id_be == 2){
							company.getAdmin().addBranchEmployee(e2,adding_be-1,employeeNum);
							employeeNum++;
						}

						else if(id_be == 3){
							company.getAdmin().addBranchEmployee(e3,adding_be-1,employeeNum);
							employeeNum++;
						}

						else if(id_be == 4){
							company.getAdmin().addBranchEmployee(e4,adding_be-1,employeeNum);
							employeeNum++;
						}

						else if(id_be == 5){
							company.getAdmin().addBranchEmployee(e5,adding_be-1,employeeNum);
							employeeNum++;
						}

						else if(id_be == 6){
							company.getAdmin().addBranchEmployee(e6,adding_be-1,employeeNum);
							employeeNum++;
						}
						
						else if(id_be == 7){
							company.getAdmin().addBranchEmployee(e7,adding_be-1,employeeNum);
							employeeNum++;
						}

						else if(id_be == 8){
							company.getAdmin().addBranchEmployee(e8,adding_be-1,employeeNum);
							employeeNum++;
						}

						else
							System.out.println("You entered an invalid number, please try again...");
						
						
						}

					}
	
				//REMOVING BRANCH EMPLOYEE
					else if(operation_admin == 4){

					boolean branchEmployee_removing = true;

					  while(branchEmployee_removing){
						System.out.println();
						company.getAdmin().removeBranchEmployee(employeeNum);
						System.out.println();
						System.out.println("\n1- " + e1.getName()+" "+ e1.getSurname());
						System.out.println("2- " + e2.getName()+" "+e2.getSurname());
						System.out.println("3- " + e3.getName()+" "+e3.getSurname());
						System.out.println("4- " + e4.getName()+" " +e4.getSurname());
						System.out.println("5- " + e5.getName()+" " +e5.getSurname());
						System.out.println("6- " + e6.getName()+" "+e6.getSurname());
						System.out.println("7- " + e7.getName()+" " +e7.getSurname());
						System.out.println("8- " + e8.getName()+" " +e8.getSurname());
						

						System.out.println("0-Go back");
						System.out.println("\nPlease enter 'district-id of branch' ");	
						int removing_be = input.nextInt();
						if(removing_be == 0){
							System.out.println("You exit from the adding-branchemployee panel");
							branchEmployee_removing = false;
							break;
						}
						System.out.println("\n'Please enter the 'id of branch-employee' to assign her/him:");
						int id_rbe = input.nextInt();
						
						if(id_rbe == 1){
							company.getAdmin().removeBranchEmployee(e1,removing_be-1);
							employeeNum--;
						}

						else if(id_rbe == 2){
							company.getAdmin().removeBranchEmployee(e2,removing_be-1);
							employeeNum--;
						}

						else if(id_rbe == 3){
							company.getAdmin().removeBranchEmployee(e3,removing_be-1);
							employeeNum--;
						}

						else if(id_rbe == 4){
							company.getAdmin().removeBranchEmployee(e4,removing_be-1);
							employeeNum--;
						}

						else if(id_rbe == 5){
							company.getAdmin().removeBranchEmployee(e5,removing_be-1);
							employeeNum--;
						}

						else if(id_rbe == 6){
							company.getAdmin().removeBranchEmployee(e6,removing_be-1);
							employeeNum--;
						}
						
						else if(id_rbe == 7){
							company.getAdmin().removeBranchEmployee(e7,removing_be-1);
							employeeNum--;
						}

						else if(id_rbe == 8){
							company.getAdmin().removeBranchEmployee(e8,removing_be-1);
							employeeNum--;
						}

						else
							System.out.println("You entered an invalid number, please try again...");
							
						
						}
					
				}

				//Query for products that need to be supplied
					else if(operation_admin == 5){
						company.getAdmin().productQuery();
					}




					else if(operation_admin == 6){
						System.out.println("You exit from the admin panel");
						control_adminPanel = false;
					}

					else{
						System.out.println("You entered an invalid operation! Please try again");
					}

				}	

			break;


			// BRANCH EMPLOYEE MENU
			case 2:
				boolean branchEmployeeMenu = true;
				System.out.println("**************WELCOME TO THE BRANCH-EMPLOYEE MENU***************");

				while(branchEmployeeMenu){
					System.out.println("\n1- See products in stock");
					System.out.println("2-Inform the manager about products");
					System.out.println("3-Add products");
					System.out.println("4-Remove products");
					System.out.println("5-Make Sales");
					System.out.println("6-Access the information of the previous orders of a customer");
					System.out.println("7-Go back");
					System.out.println("\nPlease enter your choice:");
					int operation_be = input.nextInt();


					// see the products in stock
					if(operation_be == 1){	
			
						if(company.getEmployeeList()[0]!= null)
				   			company.getEmployeeList()[0].seeProductList();
				   		else
				   			System.out.println("There is no branch-employee to do it!!!");
					}

					else if(operation_be == 2){
						if(company.getEmployeeList()[0]!= null)
							company.getEmployeeList()[0].informManager();
						else
							System.out.println("There is no branch-employee to do it!!!");		
					}


					// add products
					else if(operation_be == 3){
							int numberToAdd = 0;
                    		String productName;
                    		String modelName;
                    		String color;

                    		if(company.getEmployeeList()[0] != null)
                    			company.getEmployeeList()[0].seeProductList();
                    		else{
                    			System.out.println("There is no branch-employee to add products!!!");
                    			break;
                    		}

                    		Scanner in1 = new Scanner(System.in);
                    		Scanner in2 = new Scanner(System.in);
                    		Scanner in3 = new Scanner(System.in);
                    		Scanner in4 = new Scanner(System.in);
                    		int controlVar = 0;
	                    	while(controlVar == 0){
	                    		System.out.println("\nEnter product name: ");
	                    		productName = in1.next();
	                    		System.out.println("Enter color: ");
	                    		color = in2.next();
	                    		System.out.println("Enter model name: ");
	                    		modelName = in3.next();
	                    		System.out.println("How many you want to add: ");
	                    		
	                    		numberToAdd = in4.nextInt();

	                    		if(numberToAdd == 0){
	                    			System.out.println("You can not enter 0 as product number! Please try again...");
	                    		}

			                	for(int i=0; i<company.getNumberOfFurnitures(); i++){
			                		if(company.getProductList()[i].getProduct().equals(productName) && company.getProductList()[i].getModel().equals(modelName)){
			                			controlVar = i;
			                			break;
			                		}
			                	}

			                	if(controlVar == 0){
			                		System.out.println("Invalid product!!! Please enter informations of products properly...");
			                		break;
			                	}

	                    	}
                    		company.getEmployeeList()[0].addProduct(company.getProductList()[controlVar],numberToAdd);
                    		
					}


					// remove products
					else if(operation_be == 4){
							int numberToRemove= 0;
                    		String productName_remove;
                    		String modelName_remove;
                    		String color_remove;

                    		if(company.getEmployeeList()[0] != null)
                    			company.getEmployeeList()[0].seeProductList();
                    		else{
                    			System.out.println("There is no branch-employee to remove products!!!");
                    			break;
                    		}

                    		Scanner in5 = new Scanner(System.in);
                    		Scanner in6 = new Scanner(System.in);
                    		Scanner in7 = new Scanner(System.in);
                    		Scanner in8 = new Scanner(System.in);
                    		int controlVar2 = 0;
	                    	while(controlVar2 == 0){
	                    		System.out.println("\nEnter product name: ");
	                    		productName_remove = in5.next();
	                    		System.out.println("Enter color: ");
	                    		color_remove = in6.next();
	                    		System.out.println("Enter model name: ");
	                    		modelName_remove = in7.next();
	                    		System.out.println("How many you want to remove: ");
	                    		
	                    		numberToRemove = in8.nextInt();

	                    		if(numberToRemove == 0){
	                    			System.out.println("You can not enter 0 as product number! Please try again...");
	                    		}

			                	for(int i=0; i<company.getNumberOfFurnitures(); i++){
			                		if(company.getProductList()[i].getProduct().equals(productName_remove) && company.getProductList()[i].getModel().equals(modelName_remove)){
			                			controlVar2 = i;
			                			break;
			                		}
			                	}

			                	if(controlVar2 == 0){
			                		System.out.println("Invalid product!!! Please enter informations of products properly...");
			                		break;
			                	}

	                    	}
                    		company.getEmployeeList()[0].removeProduct(company.getProductList()[controlVar2],numberToRemove);
                    		
					}

					//MAKE SALES
					else if (operation_be == 5){
						int specialNum;
						String nameSale;
						String modelSale;
						String colorSale;
						int saleNumber;
						int control2 = -1;
						Scanner inp1 = new Scanner(System.in);
						Scanner inp2 = new Scanner(System.in);
						Scanner inp3 = new Scanner(System.in);
						custom.showCustomers();
						
						if(customerNumber!=0){
						
						System.out.println("Please select customer number to make sale");
						specialNum = input.nextInt();
						if(specialNum > 0 && specialNum < (customerNumber+2)){
							company.seeProductList(1);
							System.out.println();
							System.out.println("\nProduct name: ");
                    		nameSale = inp1.nextLine();
                    		System.out.println("Please enter color: ");
                    		colorSale = inp3.nextLine();
                    		System.out.println("Please enter model name: ");
                    		modelSale = inp2.nextLine();
				        	System.out.println("How many did you sale? :");
				        	saleNumber = inp2.nextInt();



				        for(int i=0; i<company.getNumberOfFurnitures(); i++){
				            if(company.getProductList()[i].getProduct().equals(nameSale) && company.getProductList()[i].getModel().equals(modelSale)){
				                control2 = i;
				                break;
	               	     	}
				    	}

				    	if(control2 != -1){
				    		System.out.println();
				    		if(company.getEmployeeList()[0] != null)
								company.getEmployeeList()[0].makeSale(company.getCustomers()[specialNum-1], company.getProductList()[control2],saleNumber);
							else{
								System.out.println("Sorry,There is no branch-employee to do this operation!!!");
							}
							break;
						}

						}

						else{
							System.out.println("There is no customer who has this customer number!!!Please try again");
							break;
						}

					}
				}

					//Access the information of the previous orders of a customer
					else if(operation_be == 6){
						custom.showCustomers();
						System.out.println("Please enter the customer number to see him/her previous orders:");
						int accessInfo = input.nextInt();

						if(company.getEmployeeList()[0] != null){
						
							if(custom.getNumber() == (accessInfo-1))
								custom.viewPreviousOrders();
							else
								System.out.println("There is no customer with this id!!!");
						}
						else
							System.out.println("Sorry,There is no branch-employee to do this operation!!!");
					}

					//Go back
					else if(operation_be == 7){
						branchEmployeeMenu = false;
						break;
					}




				} 

			break;

			//CUSTOMER MENU
			case 3:
					boolean customer_menu = true;
					System.out.println("\n**********WELCOME TO THE CUSTOMER REGISTRATION/LOGIN PANEL*********");
				
				while(customer_menu){

					System.out.println("\n1-Customer Registration");
					System.out.println("2-Customer Login");
					System.out.println("3-Go back");
					System.out.println("\nPlease enter your choice:");
					int operation_customer = input.nextInt();

					if(operation_customer == 3){
						System.out.println("You exit from the Customer-Registation/Login panel");
						customer_menu = false;
						break;
					}

					else if(operation_customer == 1){
						
						System.out.println("Enter your name: ");
						String customer_name= input.next(); 
						
						System.out.println("Enter your surname: ");
						String customer_surname= input.next();

						System.out.println("Enter your email: ");
						String customer_email= input.next();

						System.out.println("Define a password: ");
						String customer_password = input.next();						

						System.out.println("Registration is done :) Your customer number is " + (customerNumber+1));
						System.out.println("Thanks to join us ....\n");

						registrationMod = true;

						Customer c = new Customer(customer_name,customer_surname,customer_email,customer_password);
						c.addCustomer(c,customerNumber);
						customerNumber++;

					}


					else if(operation_customer == 2){
						System.out.println("Customer Login Panel");

						if(registrationMod == false){
							System.out.println("This is your first time.Please go to the Customer-Registration panel and subscribe to our system first :)\n");							
						}

						else if(registrationMod == true){

							boolean loginRequire = true;
							int whileControl = 0;

							while(loginRequire){
								if(whileControl != 0 && loginRequire){
									System.out.println("Invalid user,please enter your informations properly.Do you want to try again? (NO: 0 / YES: a number except 0)");
									int again = input.nextInt();
									
									if(again == 0){
										return;
									}
								}

								whileControl++;

								System.out.println("Enter your email: ");
								String email= input.next();

								System.out.println("Enter your password: ");
								String password = input.next();

								System.out.println("Enter your special customer-number: ");
								int special_number = input.nextInt();


								//Customer c_control = new Customer();
								loginRequire = custom.isLoginRequire(email,password,special_number-1);
								
							}  

							System.out.println("You logged into the system succesfully...\n");
							boolean sub_menu = true;
							while(sub_menu){

								System.out.println("\n1-Search for products");
								System.out.println("2-List of products");
								System.out.println("3-See which store a product is in");
								System.out.println("4-Shop Online");
								System.out.println("5-Go back");
								System.out.println("\nPlease enter your choice:");
								int customer_mainMenu = input.nextInt();


								if(customer_mainMenu == 2){
								   System.out.println("LIST OF PRODUCTS\n");
				   				   company.seeProductList(customer_mainMenu);
								}

								//search for products
								else if(customer_mainMenu == 1){
								   	Scanner in9 = new Scanner(System.in);
                					Scanner in10 = new Scanner(System.in);
                					Scanner in11 = new Scanner(System.in);

                					String productName_search;
                					String color_search;
                					String model_search;
                					
																	
		                    		System.out.println("\nEnter product name: ");
		                    		productName_search = in9.next();
		                    		System.out.println("Enter color: ");
		                    		color_search = in10.next();
		                    		System.out.println("Enter model name: ");
		                    		model_search = in11.next();
		                    			 
		                    		custom.searchProducts(productName_search,color_search,model_search);
				                	
									
								}

								else if(customer_mainMenu == 3){				   		
								   System.out.println();	
								   admin.showBranchMenu();
								   System.out.println();
				   				   company.seeProductList(-1);
								} 
								//SHOPPING ONLINE
								else if(customer_mainMenu == 4){
									String address;
									String phoneNumber;
									String nameBuy;
                					String colorBuy;
                					String modelBuy;
                					int num;
            
									Scanner in12 = new Scanner(System.in);
                					Scanner in13 = new Scanner(System.in);
									System.out.println("Enter your address:");
									address = in12.next();
									custom.setAddress(address);
									System.out.println("Enter your phoneNumber:");
									phoneNumber = in13.next();
									custom.setPhoneNumber(phoneNumber);
									System.out.println("\n");
									
				   				   	company.seeProductList(1);
				   				   	Scanner s1 = new Scanner(System.in);
                					Scanner s2 = new Scanner(System.in);
                					Scanner s3 = new Scanner(System.in);
                					Scanner s4 = new Scanner(System.in);
                					boolean shopping = true;

                					while(shopping){
					   				   	System.out.println("Please enter following informations to buy it!\n");
					   				   	System.out.println("Product name:");
					   				   	nameBuy = s1.next();
					   				   	System.out.println("Product color:");
					   				   	colorBuy = s2.next();
					   				   	System.out.println("Product model");
					   				   	modelBuy = s3.next();
					   				   	System.out.println("How many you want to buy? :");
					   				   	num = s4.nextInt();
					   				   	
					   				   	Furniture fur = new Furniture(nameBuy,modelBuy,colorBuy,num);
										boolean keep = custom.buy(fur,num);
					   				  
										custom.viewPreviousOrders();

										System.out.println("Do you want to continue for shopping? (No: 0  /  Yes: a number except 0)");
										int cntrl =s4.nextInt();

										if(cntrl == 0)
											shopping = false;
										else
											shopping = true;
											
									}	
 
								}

								else if(customer_mainMenu == 5){
									System.out.println("You exit from the customer panel.");
									sub_menu = false;
									break;	
								}

								else{
									System.out.println("You enter an invalid operation. please try again!!!");
								}
							}
						}
					}
				} 
			break;


			//Exit mode
			case 4:
			  System.out.println("You exit from the system.Thanks for using our furniture - automation system :)");
			  control = false;
			break;

			
			default:
				System.out.println("You entered an invalid operation, please try again...");
	}

   }
 
 }
}