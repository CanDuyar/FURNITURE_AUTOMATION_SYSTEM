import java.util.Scanner;

/**
 * @author Can Duyar 171044075
 *
 */

public class Company{
	/**
	* this array keeps all branches of the automation system.
	*/
	protected static Branch branches[] = new Branch[100];

	/**
	* this array keeps all branch-employees of the automation system.
	*/	
	protected static BranchEmployee employees[] = new BranchEmployee[100];

	/**
	* this array keeps all customers of the automation system.
	*/
	protected static Customer customers[] = new Customer[100];

	/**
	* this array keeps all products of the automation system.
	*/ 
	protected static Furniture products[] = new Furniture[100];

	/**
	* it keeps number of furnitures of the automation system.
	*/
	protected static int numberOfFurnitures = 0;

	/**
	* it keeps number of customers of the automation system.
	*/
	protected static int numberOfCustomers;


	/**
	* this is a variable from Administrator type to reach methods of Administrator class from Company class.
	*/

	private Administrator admin;


	/**
	* No-parameter Company constructor.
	*/
	public Company(){}


	/**
	 * This method gets admin object.
	 * @return admin object.
	 */
	public Administrator getAdmin(){
		return admin;
	}


	/**
	 * This method gets number of furnitures.
	 * @return number of furnitures.
	 */
	public int getNumberOfFurnitures(){
		return numberOfFurnitures;
	}

	/**
	 * This method gets customers array.
	 * @return customers array.
	 */
	public Customer [] getCustomers(){
		return customers;
	}


	/**
	 * This method gets number of customers.
	 * @return number of customers.
	 */
	public int getNumberOfCustomers(){
		return numberOfCustomers;
	}

	/**
	 * This method gets array of employees.
	 * @return employees array.
	 */
	public BranchEmployee [] getEmployeeList(){
		return employees;
	}


	/**
	 * This method sets number of customer.
	 * @param nc number of customer.
	 */
	public void setNumberOfCustomers(int nc){
		this.numberOfCustomers = nc;
	}

	/**
	 * This method gets array of products.
	 * @return products array.
	 */
	public Furniture [] getProductList(){
		return products;
	}

	
	/**
	 * This method sets administrator object.
	 * @param admin Administrator object.
	 */
	public void setAdmin(Administrator admin) {
		this.admin = admin;
	}	



	/**
	 * This method gets branch object if it's member of branches.
	 * @return branch object.
	 */
	public Branch getBranch(Branch branch) throws Exception {
		if(branches.length > 0 && branches[0].isInThere(branch))
			return branch;
		else
			throw new Exception("This company has not the branch.\n");
	}


	/**
	 * This method shows customers.
	 */	
	public void showCustomers(){

		boolean control = false;
		for(int t = 0; t < customers.length; t++){
			if(customers[t]!=null){
				System.out.println();
				System.out.println((customers[t].getNumber()+1) + ". Customer:");
				System.out.println("Name: " + customers[t].getName());
				System.out.println("Surname: " + customers[t].getSurname());
				System.out.println("Customer Number: " + (customers[t].getNumber()+1));
				control = true;
			}
		}

		if(control == false){
			System.out.println("There is no customer...");
			return;
		}
	}


	/**
	 * This method shows list of products.
	 * @param manage_menuPanel this parameter determines which informations of products will be printed in the menu.
	 */	

	public void seeProductList(int manage_menuPanel){
		//see the list of products
		if(manage_menuPanel == 1 || manage_menuPanel == 2){
			for(int i=0; products[i]!= null; i++){
				if(products[i].getNumberInStock() > 0){
					System.out.println((i+1)+"." + "Product: " + products[i].getProduct());
					System.out.println("Color: " + products[i].getColor());
					System.out.println("Model: " + products[i].getModel());
					System.out.println("Number of stock: " + products[i].getNumberInStock());
					System.out.println("\n");
				}
				else{
					System.out.println("Product stock is empty now.\n");
				}
			}
		}
		//see the list of products
		if(manage_menuPanel == 3){
			for(int i=0;products[i]!= null; i++){
				if(products[i].getNumberInStock() > 0){
					System.out.println((i+1)+"." + "Product: " + products[i].getProduct());
					System.out.println("Color: " + products[i].getColor());
					System.out.println("Model: " + products[i].getModel());
					System.out.println("Number of stock: " + products[i].getNumberInStock());
					System.out.println("Branch: " + products[i].getProductBranch());
					System.out.println("\n");
				}
				else{
					System.out.println("Product stock is empty now.\n");
				}
			}
		}

		if(manage_menuPanel == -1){
			String whichStore;
			Scanner inpu = new Scanner(System.in);
			System.out.println("Please enter the name of product to see which store is in:");
			whichStore = inpu.next();
			for(int i=0;products[i]!= null; i++){
				if(products[i].getNumberInStock() > 0 && products[i].getProduct().equals(whichStore)){
					System.out.println((i+1)+"." + "Product: " + products[i].getProduct());
					System.out.println("Color: " + products[i].getColor());
					System.out.println("Model: " + products[i].getModel());
					System.out.println("Number of stock: " + products[i].getNumberInStock());
					System.out.println("Branch: " + products[i].getProductBranch());
					System.out.println("\n");
				}
				
			}

		}

    }
}