
/**
 * @author Can Duyar 171044075
 *
 */

/**
* Customer class which is derived from Company class and implements Users class
*/
public class Customer extends Company implements Users{

	/**
	* it's for name of customer
	*/	
	private String name;

	/**
	* it's for surname of customer
	*/	
	private String surname;


	/**
	* it's for email of customer
	*/	
	private String email;

	/**
	* it's for address of customer
	*/	
	private String address;

	/**
	* it's for phone number of customer
	*/	
	private String phoneNumber;

	/**
	* it's for password of customer
	*/	
	private String password;
	
	/**
	* it's for number of customer
	*/	
	private int customer_number;

	/**
	* this array keeps previous orders of customer
	*/
	private Furniture [] previousOrders = new Furniture [100];
	/**
	* it's for number of bought products  
	*/	
	private int boughtProductNum = 0;

	/**
	* no-parameter constructor for customer.
	*/
	public Customer(){}


	/**
	* constructor for customer with four parameters to initialize name,surname,email,password.
	* @param name name of customer
	* @param surname surname of customer
	* @param email email of customer
	* @param password password of customer
	*/
	public Customer(String name, String surname, String email,String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}



	/**
	 * This method gets the customer's name.
	 * @return customer's name.
	 */
	@Override
	public String getName() {
		return name;
	}


	/**
	 * This method sets the customer's name.
	 * @param name customer's name.
	 */
	@Override
	public void setName(String name) {
		this.name = name;	
	}
	

	/**
	 * This method gets the customer's surname.
	 * @return customer's surname.
	 */
	@Override
	public String getSurname() {
		return surname;
	}


	/**
	 * This method sets the customer's surname.
	 * @param surname customer's surname.
	 */
	@Override
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * This method gets the customer's email.
	 * @return customer's email
	 */
	public String getEmail() {
		return email;
	}
	

	/**
	 * This method sets the customer's email.
	 * @param em customer's email.
	 */
	public void setEmail(String em) {
		this.email = em;
	}

	/**
	 * This method gets the customer's password.
	 * @return customer's password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method sets the customer's password.
	 * @param pw customer's password.
	 */
	public void setPassword(String pw) {
		this.password = pw;
	}


	/**
	 * This method gets the customer's number.
	 * @return customer's number.
	 */
	public int getNumber() {
		return customer_number;
	}

	/**
	 * This method sets the customer's number.
	 * @param cn customer's number.
	 */
	public void setNumber(int cn) {
		this.customer_number = cn;
	}

	/**
	 * This method gets the customer's previous orders.
	 * @return array of customer's previous orders.
	 */
	public Furniture [] getPreviousOrders(){
		return previousOrders;
	}


	/**
	 * This method gets the customer's address.
	 * @return address of customer.
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * This method sets the customer's address.
	 * @param address customer's address.
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * This method gets the customer's phone number.
	 * @return customer's phone number.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * This method sets the customer's phone number.
	 * @param phoneNumber customer's phone number.
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * This method sets the bought product number of customer.
	 * @param num bought product number of customer.
	 */
	public void setBoughtProductNum(int num){
		this.boughtProductNum = num;
	}


	/**
	 * This method gets the bought product number of customer.
	 * @return bought product number of customer.
	 */
	public int getBoughtProductNum() {
		return boughtProductNum;
	}


	
	/**
	 * This method add new customers for my automation system.
	 * @param newCustomer new customer object to add it.
	 * @param customer_number customer number to add him/her to customers array as a new customer.
	 */
	public void addCustomer(Customer newCustomer,int customer_number){

		customers[customer_number] = newCustomer;
		customers[customer_number].setNumber(customer_number);
		numberOfCustomers = customer_number;
	
	}



	/**
	 * This method search a product,if it's found in the system then it prints informations of this product
	 * otherwise prints an error message.
	 * @param product_name name of the product that customer searched.
	 * @param color color of the product that customer searched.
	 * @param model_name model name of the product that customer searched 
	 */
	public void searchProducts(String product_name,String color,String model_name){

		//for(int t = 0; products[t]!=null; t++)
		//	System.out.println(products[t].getProduct());

		boolean search_control = false;


		for(int t = 0; products[t]!=null; t++){
			if(products[t].getProduct().equals(product_name) && products[t].getModel().equals(model_name) && products[t].getColor().equals(color)){
				if(products[t].getNumberInStock() > 0){
					System.out.println("Furniture that you searched was founded!!!\n");
					System.out.println("Product: " + products[t].getProduct());
					System.out.println("Color: " + products[t].getColor());
					System.out.println("Model: " + products[t].getModel());
					System.out.println("Number of stock: " + products[t].getNumberInStock());
					System.out.println("\n");
					search_control = true;
					break;
			}
		}
	}
		if(search_control == false)
			System.out.println("We couldn't find the furniture that you searched :(");
}

	/**
	 * This method determines that user logged in before or not. 
	 *if he/she logged in before then it returns false otherwise returns true.
	 * @param email email of customer.
	 * @param password password of customer.
	 * @param special_number special number of customer.
	 * @return true or false.
	 */

	public boolean isLoginRequire(String email,String password,int special_number){
		
		if(customers[special_number]!= null){ 
			if(customers[special_number].getNumber() == special_number){
				if((customers[special_number].getEmail().equals(email)) && (customers[special_number].getPassword().equals(password)))
					return false;
				else
					return true;
			}
	}
		else{
			System.out.println("You entered your special number as wrong!!!");
			return true;
		}

		return true;

	}	


	/**
	 * this method to buy products during the online shopping, if this operation is done then it returns true
	 * otherwise returns false.
	 * @param fur Product object that customer wanted to buy.
	 * @param numberToBuy the number of products the cutomer wants to buy.
	 * @return true or false.
	 */	

	public boolean buy(Furniture fur,int numberToBuy){
		int check = 0;
		if(numberOfFurnitures > 0){	
			for(int i=0; i<numberOfFurnitures; i++){
				if(products[i].getProduct().equals(fur.getProduct()) && products[i].getModel().equals(fur.getModel())) {
					check = i;				
					break;				
				}
			}
		}

		if(numberToBuy > products[check].getNumberInStock()){
			System.out.println("Stock is not enough!!!");
			return false;
		}

		if(check != 0){
			this.setPreviousOrders(fur);
			products[check].setNumberInStock(products[check].getNumberInStock() - numberToBuy);
			return true;
		}
		else{
			System.out.println("Sorry, we couldn't find product you wanted.\n");
			return false;
		}
	}



	/**
	 * This method sets previous orders of a customer.
	 * @param f Furniture object to add a customer's previous orders .
	 */
	public void setPreviousOrders(Furniture f){
		if(this.boughtProductNum != this.previousOrders.length){
			this.previousOrders[this.boughtProductNum] = f;
			this.boughtProductNum += 1;
		}
		else{
			if(this.boughtProductNum == this.previousOrders.length){
				this.boughtProductNum -= 1;
			}
			
			for(int i=0; i<this.previousOrders.length-1; ++i){
				this.previousOrders[i] = this.previousOrders[i+1];
			}
			this.previousOrders[this.boughtProductNum] = f;
		}
	}


	/**
	 * This method to show previous orders of a customer.
	 */
	public void viewPreviousOrders(){
		if(this.boughtProductNum >0){
			System.out.println("Previous Orders: \n");
			for(int i=0; i<boughtProductNum; i++){
				System.out.println("Product Name: " + previousOrders[i].getProduct());
				System.out.println("Model: " + previousOrders[i].getModel());
				System.out.println("Color: " + previousOrders[i].getColor());
				System.out.println("\n");
			}
		}
		else
			System.out.println("There is no previous order. \n");
	}

}