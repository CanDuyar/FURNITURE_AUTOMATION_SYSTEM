/**
 * @author Can Duyar 171044075
 *
 */

/**
* BranchEmployee class which is derived from Branch class and implements Users class
*/

public class BranchEmployee extends Branch implements Users{

	/**
	 * It's for name of branch-employee.
	 */
	private String name;

	/**
	 * It's for surname of branch-employee.
	 */

	private String surname;
	/**
	 * It's for id of branch-employee.
	 */
	private int ID;


	/**
	 * Branch employee constructor with three-parameters
	 * @param branchName name of the branch
	 * @param name name of the branch-employee
	 * @param surname surname of the branch-employee
	 */

	public BranchEmployee(String branchName, String name, String surname) {
		super(branchName);
		this.name = name;
		this.surname = surname;	
	}

	/**
	 * This method gets the branch employee's name.
	 * @return branch employee's name.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * This method sets the branch employee's name.
	 * @param name branch employee's name.
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method gets the branch employee's surname.
	 * @return branch employee's surname.
	 */
	@Override
	public String getSurname() {
		return surname;
	}


	/**
	 * This method sets the branch employee's surname.
	 * @param surname branch employee's surname.
	 */
	@Override
	public void setSurname(String surname) {
		this.surname = surname;
	}


	/**
	 * This method gets the branch employee's ID.
	 * @return branch employee's ID.
	*/
	public int getID() {
		return ID;
	}

	/**
	 * This method sets the branch employee's ID.
	 * @param ID int value of the branch employee's ID.
	*/
	public void setID(int ID) {
		this.ID = ID;
	}


	/**
	 * This method shows the list of products if their stock number is not equal to 0.
	 */
	public void seeProductList(){
			//see the list of products
				for(int i=0; products[i]!=null; i++){
					if(products[i].getNumberInStock() > 0){
						System.out.println((i+1)+"." + "Product: " + products[i].getProduct());
						System.out.println("Color: " + products[i].getColor());
						System.out.println("Model: " + products[i].getModel());
						System.out.println("Number of stock: " + products[i].getNumberInStock());
						System.out.println("\n");
					}
					else{
						System.out.println("Stock is empty now.\n");
					}
				}
			}
	

	/**
	 * This method for making sale.
	 * @param cust object of sales customer
	 * @param furn object of sold Furniture
	 * @param number number of sold furnitures
	 */
	public void makeSale(Customer cust, Furniture furn,int number){

		if(cust.buy(furn,number))
			System.out.println("Sale is done for this customer :).\n");
		
	}

	/**
	 * This method adds product.
	 * @param f Furniture to add. 
	 * @param numberToAdd the number of the products that will be added.
	 */

	public void addProduct(Furniture f, int numberToAdd){
	
		if(numberToAdd > 0 && numberOfFurnitures > 0){
			int check = -1;
			for(int i=0; i<numberOfFurnitures; i++){
				if(products[i].getProduct() == f.getProduct() && products[i].getModel() == f.getModel()){
					check = i;
					numberOfFurnitures += 1;
					break;
				}
			}
			if(check != -1){
				products[check].setNumberInStock(products[check].getNumberInStock() + numberToAdd);
			}
			else if(check == -1){
				System.out.println("There is no product that you want to add in stock.\n");
			}
		}
	}

	/**
	 * This method removes the product.
	 * @param f Furniture to remove. 
	 * @param numberToRemove the number of the products that will be removed.
	 */
	public void removeProduct(Furniture f, int numberToRemove){
	
		if(numberToRemove > 0 && numberOfFurnitures > 0){
			int check = -1;
			for(int i=0; i<numberOfFurnitures; i++){
				if(products[i].getProduct() == f.getProduct() && products[i].getModel() == f.getModel()){
					check = i;
					break;
				}
			}
			if(check != -1){
				products[check].setNumberInStock(products[check].getNumberInStock() - numberToRemove);
			}
			else if(check == -1){
				System.out.println("There is no product that you want to remove from the stock.\n");
			}
		}
		
	}

	/**
	 * method to access product informations of a customer.
	 * @param id id of specific customer.
	 */
	public void accessProductInformation(int customId){
		for(int t = 0;customers[t]!=null; t++){
			if(customers[t].getNumber() == customId){
				customers[t].viewPreviousOrders();

			}
		  }
	    }

	/**
	 * method to show products that have 0 stock number.Branch employee informs manager for these products.
	 * if this object is member of branches then it returns true otherwise returns false.
	 */

	public void informManager(){
		boolean queryCheck = false;
		System.out.println("Administrator was informed by branch-employee for following products.");
		for(int t = 0; t < numberOfFurnitures; t++){
			if(products[t].getNumberInStock() == 0){
					System.out.println("Product: " + products[t].getProduct());
					System.out.println("Color: " + products[t].getColor());
					System.out.println("Model: " + products[t].getModel());
					System.out.println("Number of stock: " + products[t].getNumberInStock());
					System.out.println("\n");
					queryCheck = true;
			}
		} 
		if(queryCheck == false){
			System.out.println("No need to inform administrator because there is no furniture that need to be supplied!!!");
		}
	}

	/**
	 * method for checking an object is member of branches or not.
	 * if this object is member of branches then it returns true otherwise returns false.
	 * @param object Branch object to check.
	 * @return true or false
	 */
	@Override
	public boolean isInThere(Branch object) {
		BranchEmployee employee = (BranchEmployee) object;
		for(Branch b : branches) {
			if( employee.getBranchName() == b.getBranchName() ) {
				for(int i = 0; i < employees.length; i++){
					if(employees[i] == employee);
						return true;
				}
			}
		}
		return false;
}

	

}