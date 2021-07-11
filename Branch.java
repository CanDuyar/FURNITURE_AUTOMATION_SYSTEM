/**
 * @author Can Duyar 171044075
 *
 */

/**
* Branch class which is derived from company class.
*/
public class Branch extends Company {
	/**
	* It's for name of administrator.
	*/
	private String branchName;
	/**
	* It's for number of branch.
	*/
	private int branchID;
	
	/**
	 * Constructor with one-parameter for branch
	 * @param name string of the branch's name.
	 */
	public Branch(String branchName){
		super();
		this.branchName = branchName;
	}

		/**
	 * This method gets name of branch.
	 * @return name of branch.
	 */
	public String getBranchName() {
		return branchName;
	}


	/**
	 * This method sets name of branch.
	 * @param branchName name of branch.
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/**
	 * This method gets id of branch.
	 * @return id of branch
	 */
	public int getBranchID() {
		return branchID;
	}


	/**
	 * This method sets id of branch .
	 * @param id id of branch.
	 */
	public void setBranchID(int id) {
		this.branchID = id;
	}


	/**
	 * method for checking an object is member of branches or not.
	 * if this object is member of branches then it returns true otherwise returns false.
	 * @param object Branch object to check.
	 * @return true or false
	 */
	public boolean isInThere(Branch object) {
		for(int i = 0; i < branches.length; ++i){
			if(branches[i] == object)
				return true;
		}

		return false;
	}

}