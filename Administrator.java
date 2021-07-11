/**
 * @author Can Duyar 171044075
 *
 */

/**
* Administrator class which is derived from company class and implements Users class
*/
public class Administrator extends Company implements Users{
	/**
	 * It's for name of administrator.
	 */
	private String name;
	/**
	 * It's for surname of administrator.
	 */
	private String surname;

	/**
	 * Constructor with two-parameters for administrator
	 * @param name string of the administrator's name.
	 * @param surname string of the administrator's surname.
	 */
	public Administrator(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	/**
	 * This method gets the administrator's name.
	 * @return administrator's name.
	 */
	@Override
	public String getName() {
		return name;
	}


	/**
	 * This method sets the administrator's name.
	 * @param name string of the administrator's name..
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * This method gets the administrator's surname.
	 * @return administrator's surname.
	 */
	@Override
	public String getSurname() {
		return surname;
	}


	/**
	 * This method sets the administrator's surname.
	 * @param surname string of the administrator's surname.
	 */
	@Override
	public void setSurname(String surname) {
		this.surname = surname;
	}


	/**
	 * At the beginning of the program, administator adds products with this method because
	 * there is no branch-employee to add products.
	 * @param f Furniture to add. 
	 * @param numberToAdd the number of furniture to be added.
	 */
	public void addProduct(Furniture f, int numberToAdd){
		
		if(numberToAdd > 0 && numberOfFurnitures > 0){
			int check = -1;
			for(int i=0; i<numberOfFurnitures; i++){
				if(products[i].getProduct() == f.getProduct() && products[i].getModel() == f.getModel()){
					check = i;
					break;
				}
			}
			if(check != -1){
				products[check].setNumberInStock(products[check].getNumberInStock() + numberToAdd);
				numberOfFurnitures += 1;
			}
			else{
				products[numberOfFurnitures] = f;
				products[numberOfFurnitures].setNumberInStock(products[numberOfFurnitures].getNumberInStock() + numberToAdd);
				numberOfFurnitures += 1;
			}
		}
		else if(numberToAdd > 0 && numberOfFurnitures == 0){
			products[numberOfFurnitures] = f;
			products[numberOfFurnitures].setNumberInStock(products[numberOfFurnitures].getNumberInStock() + numberToAdd);
			numberOfFurnitures += 1;
		}		
	}	


	/**
	 * this method to see there are any products that need to be supplied. 
	 */	
	public void productQuery(){

		boolean queryCheck = false;

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
			System.out.println("There is no furniture that need to be supplied....");
		}
	}

	
	/** 
	 * This method is used for adding branch.
	 * @param newBranch Branch to add.
	 * @param branch_number the order of branch to be added.
	 */
	public void addBranch(Branch newBranch,int branch_number){
		
		int check = 0;
		if(branch_number > 0){
			for(int i=0; i<branch_number; i++){
				if(branches[i] != null && branches[i].getBranchName() == newBranch.getBranchName())
					check = 1;
			}
		}

		if(check == 1){
			System.out.println("branch is not added because it already exists!!!\n");
			return;
		}
		else{
			branches[branch_number] = newBranch;
			System.out.println(newBranch.getBranchName() + " branch is added.\n");
		}

		for(int t = 0; branches[t] != null; t++)   
				System.out.println((t+1) + " " + branches[t].getBranchName());	
				
	}



	/** 
	 * This method is used for removing branch.
	 * @param branch_number the order of branch that you want to remove.
	 */
	public void removeBranch(int branch_number){

    	System.out.println();

		for(int t = 0; branches[t] != null; t++)   
			System.out.println((t+1) + " " + branches[t].getBranchName());	

      		if(branches[branch_number] != null ){
        		for(int j = branch_number; j < branches.length - 1; j++){
            			branches[j] = branches[j+1];
        		}
        	System.out.println((branch_number+1) + ". branch is removed.\n");
        	
      		}


      		else{
      			System.out.println("Branch with branchnumber- " + (branch_number+1) + " is not removed because this branch is not found!\n");
      		}

	}


	/** 
	 * to show branches during interactive menu.
	 */
	public void showBranchMenu(){
		for(int t = 0; t < branches.length; t++)
			if(branches[t] != null)   
				System.out.println((t+1) + " " + branches[t].getBranchName());	
	}

	
	/** 
	 * This method is used for adding branch-employee.
	 * @param newEmployee branch-employee to add.
	 * @param branchId the number of the branch where the branch-employee will be added.
	 * @param employeeNum the number of the branch-employee that will be added.
	 */
	public void addBranchEmployee(BranchEmployee newEmployee, int branchId,int employeeNum) {
		int t;
		for(t = 0;branches[branchId].employees[t] != null; t++){
			;
		}

		for(int u = 0; u < employeeNum; u++){
			if(branches[branchId].employees[u] == newEmployee){
				System.out.println("Error:Branch-employee already assigned to a branch.You can not add same branch-employee to different branches.Please enter again!!!");
				System.exit(-1);
		    }		
		}

			branches[branchId].employees[t] = newEmployee;
			branches[branchId].employees[t].setID(branchId);   
			System.out.println(newEmployee.getName() + " branchemployee is added.\n");
		
		
		for(t = 0; branches[branchId].employees[t] != null; t++){
			System.out.println((branches[branches[branchId].employees[t].getID()].getBranchName() + " - " + branches[branchId].employees[t].getName() +" " +branches[branchId].employees[t].getSurname()));
		}

	}


	/** 
	 * This method is used for removing branch-employee.
	 * @param employeeNum the number of the branch-employee that will be removed.
	 */
	public void removeBranchEmployee(int employeeNum) {
		for(int t = 0; t < employees.length; t++){
		if(branches[0].employees[t] != null)
			System.out.println((branches[branches[0].employees[t].getID()].getBranchName() + "(" + (branches[0].employees[t].getID()+1) + ")" + " - " + branches[0].employees[t].getName() +" " +branches[0].employees[t].getSurname()));
		}
	}

	/** 
	 * This method is used for removing branch-employee.
	 * @param removeEmployee branch-employee that will be removed.
	 * @param branchId the number of the branch-employee that will be removed.
	 */
	public void removeBranchEmployee(BranchEmployee removeEmployee,int branchId) {
		for(int u = 0; branches[branchId].employees[u] != null; u++){
			if(branches[branchId].employees[u] == removeEmployee){
				System.out.println(removeEmployee.getName() + " branchemployee is removed.\n");
				for(int j = u; j < branches.length - 1; j++){
					branches[branchId].employees[j] = branches[branchId].employees[j+1];
			    }
		    }		
	}

}


}