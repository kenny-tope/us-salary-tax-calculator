import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.events.VerifyEvent;

public class App {

	protected Shell shell;
	private Text salary_text_field;
	private Text bonus_text_field;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			App window = new App();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		
		shell = new Shell();
		shell.setSize(500, 500);
		shell.setText("SWT Application");
		
		Combo state_combo = new Combo(shell, SWT.READ_ONLY);
		state_combo.setItems(new String[] {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"});
		state_combo.setBounds(111, 81, 84, 34);
		
		Label heading_label = new Label(shell, SWT.WRAP);
		heading_label.setAlignment(SWT.CENTER);
		heading_label.setFont(SWTResourceManager.getFont("Noto Sans", 24, SWT.NORMAL));
		heading_label.setBounds(140, 10, 222, 65);
		heading_label.setText("Tax Calculator");
		
		Combo year_combo = new Combo(shell, SWT.READ_ONLY);
		year_combo.setItems(new String[] {"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"});
		year_combo.setBounds(314, 81, 118, 34);
		
		Label year_label = new Label(shell, SWT.WRAP);
		year_label.setFont(SWTResourceManager.getFont("Noto Sans", 14, SWT.NORMAL));
		year_label.setBounds(259, 82, 77, 34);
		year_label.setText("Year:");
		
		Label state_label = new Label(shell, SWT.WRAP);
		state_label.setText("State:");
		state_label.setFont(SWTResourceManager.getFont("Noto Sans", 14, SWT.NORMAL));
		state_label.setBounds(49, 82, 77, 34);
		
		salary_text_field = new Text(shell, SWT.BORDER);
		salary_text_field.setBounds(188, 181, 172, 30);	
		// 
	    salary_text_field.addVerifyListener(new VerifyListener() {
	        @Override
	        public void verifyText(VerifyEvent e) {
	            String currentText = salary_text_field.getText();
	            String newText = currentText.substring(0, e.start) + e.text + currentText.substring(e.end);
	            String regex = "^\\d*\\.?\\d{0,2}$"; // Regular expression for valid format

	            // Allow digits (0-9), commas, periods, and backspace (to delete)
	            if (newText.matches(regex) || e.text.isEmpty()) {
	                e.doit = true;
	            } else {
	                e.doit = false;
	            }
	        }
	    });

		
		Label salary_label = new Label(shell, SWT.WRAP);
		salary_label.setText("Salary:");
		salary_label.setFont(SWTResourceManager.getFont("Noto Sans", 14, SWT.NORMAL));
		salary_label.setBounds(121, 180, 84, 34);
		
		bonus_text_field = new Text(shell, SWT.BORDER);
		bonus_text_field.setBounds(188, 244, 172, 30);
		// 
		bonus_text_field.addVerifyListener(new VerifyListener() {
	        @Override
	        public void verifyText(VerifyEvent e) {
	            String currentText = bonus_text_field.getText();
	            String newText = currentText.substring(0, e.start) + e.text + currentText.substring(e.end);
	            String regex = "^\\d*\\.?\\d{0,2}$"; // Regular expression for valid format

	            // Allow digits (0-9), commas, periods, and backspace (to delete)
	            if (newText.matches(regex) || e.text.isEmpty()) {
	                e.doit = true;
	            } else {
	                e.doit = false;
	            }
	        }
	    });
		
		Label bonus_label = new Label(shell, SWT.WRAP);
		bonus_label.setText("Bonus:");
		bonus_label.setFont(SWTResourceManager.getFont("Noto Sans", 14, SWT.NORMAL));
		bonus_label.setBounds(121, 243, 84, 34);
		
		Button calculate_income_button = new Button(shell, SWT.NONE);
		calculate_income_button.setBounds(169, 314, 154, 34);
		calculate_income_button.setText("Calculate Income");
		calculate_income_button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// do it right here
			}
		});
	}
}
