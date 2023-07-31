
// factory for state tax objects
public abstract class StateTaxFactory {
	
	// returns a StateTax -> AzStateTax || CaStateTax || OrStateTax etc..
	// will fill in the rest of the Classes later -> only 2 for testing for now ...
	
	public static StateTax create_state_tax(String state) {
		switch (state) {
		case "AZ":
			return new AzStateTax(); // return AZ State Tax Object containing function logic for calculating AZ state tax
		case "CA":
			return new CaStateTax();
		default:
			throw new IllegalArgumentException("State does not exist"); // if state is not currently created
		}
	}
}


/* when you get back ->
 * 	implement button click -> pull the state -> and create_state_tax to create an AZ or CA object with it
 * 	using that object, call it's function calculate_state_tax(salary_from_text_field)
 *	then print that object to the console
 *
 *	ALSO -> change name to 2023 Tax Calculator -> you dont want to deal with looking up the rates from every year 
 *	when this project is only to familiarize yourself with the factory method design pattern
 *
 *	Then you will have to create the FedTaxClass with function for returning tax owed to fed
 *
 *	Then sum the 2 taxes
 *	
 *	Then print to screen, and show new button 'Save Tax profile', which will gather all info (salary, state, total tax) 
 *	create a TaxProfile object with it, and save it.
 *
 *	A Button 'See Tax Profiles' will open a page with all currently saved TaxProfile objects, shown on the screen in a grid
 */
*/