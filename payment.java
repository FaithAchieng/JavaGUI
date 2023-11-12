package payment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;

public class payment {

	private JFrame frame;
	private JTextField textFieldRate;
	private JTextField textFieldEmployeeName;
	private JTextField textFieldHour;
	private JTextField textFieldDays;
	private JTextField textFieldGrossSalary;
	private JTextField textFieldTAX;
	private JTextField textFieldPhilhealth;
	private JTextField textFieldSSS;
	private JTextField textFieldTotalDeduction;
	private JTextField textFieldGross;
	private JTextField textFieldDeduction;
	private JTextField textFieldNetSalary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment window = new payment();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1106, 575);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSimplePayroll = new JLabel("Simple Payroll System:");
		lblSimplePayroll.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSimplePayroll.setBounds(346, 11, 425, 61);
		frame.getContentPane().add(lblSimplePayroll);
		
		JLabel EmployeeName = new JLabel("Employee Name:");
		EmployeeName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		EmployeeName.setBounds(72, 106, 155, 32);
		frame.getContentPane().add(EmployeeName);
		
		JLabel Rate = new JLabel("Rate Per Hour:");
		Rate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Rate.setBounds(72, 155, 137, 14);
		frame.getContentPane().add(Rate);
		
		JLabel Hour = new JLabel("Hour Per Day:");
		Hour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Hour.setBounds(72, 194, 117, 32);
		frame.getContentPane().add(Hour);
		
		textFieldRate = new JTextField();
		textFieldRate.setBounds(198, 155, 117, 20);
		frame.getContentPane().add(textFieldRate);
		textFieldRate.setColumns(10);
		
		textFieldEmployeeName = new JTextField();
		textFieldEmployeeName.setBounds(198, 115, 117, 20);
		frame.getContentPane().add(textFieldEmployeeName);
		textFieldEmployeeName.setColumns(10);
		
		textFieldHour = new JTextField();
		textFieldHour.setBounds(199, 203, 116, 20);
		frame.getContentPane().add(textFieldHour);
		textFieldHour.setColumns(10);
		
		JLabel Days = new JLabel("Number of Days Worked:");
		Days.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Days.setBounds(10, 250, 217, 32);
		frame.getContentPane().add(Days);
		
		textFieldDays = new JTextField();
		textFieldDays.setBounds(198, 258, 117, 20);
		frame.getContentPane().add(textFieldDays);
		textFieldDays.setColumns(10);
		
		JLabel GrossSalary = new JLabel("GROSS SALARY:");
		GrossSalary.setFont(new Font("Tahoma", Font.BOLD, 22));
		GrossSalary.setBounds(10, 350, 194, 42);
		frame.getContentPane().add(GrossSalary);
		
		textFieldGrossSalary = new JTextField();
		textFieldGrossSalary.setEditable(false);
		textFieldGrossSalary.setBounds(219, 366, 96, 20);
		frame.getContentPane().add(textFieldGrossSalary);
		textFieldGrossSalary.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DEDUCTION OF SALARY:");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBackground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(344, 113, 289, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel Tax = new JLabel("TAX 15% of Monthly Wage:");
		Tax.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Tax.setBounds(354, 155, 228, 20);
		frame.getContentPane().add(Tax);
		
		textFieldTAX = new JTextField();
		textFieldTAX.setEditable(false);
		textFieldTAX.setBounds(546, 157, 96, 20);
		frame.getContentPane().add(textFieldTAX);
		textFieldTAX.setColumns(10);
		
		JLabel Philhealth = new JLabel("Philhealth 5%");
		Philhealth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Philhealth.setBounds(440, 205, 99, 14);
		frame.getContentPane().add(Philhealth);
		
		textFieldPhilhealth = new JTextField();
		textFieldPhilhealth.setEditable(false);
		textFieldPhilhealth.setBounds(546, 206, 96, 20);
		frame.getContentPane().add(textFieldPhilhealth);
		textFieldPhilhealth.setColumns(10);
		
		JLabel SSS = new JLabel("SSS 2%");
		SSS.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SSS.setBounds(460, 258, 99, 14);
		frame.getContentPane().add(SSS);
		
		textFieldSSS = new JTextField();
		textFieldSSS.setEditable(false);
		textFieldSSS.setBounds(546, 257, 96, 20);
		frame.getContentPane().add(textFieldSSS);
		textFieldSSS.setColumns(10);
		
		JLabel TotalDeduction = new JLabel("TOTAL DEDUCTION:");
		TotalDeduction.setFont(new Font("Tahoma", Font.BOLD, 20));
		TotalDeduction.setBounds(364, 359, 218, 27);
		frame.getContentPane().add(TotalDeduction);
		
		textFieldTotalDeduction = new JTextField();
		textFieldTotalDeduction.setEditable(false);
		textFieldTotalDeduction.setBounds(570, 366, 96, 20);
		frame.getContentPane().add(textFieldTotalDeduction);
		textFieldTotalDeduction.setColumns(10);
		
		JLabel Gross = new JLabel("Gross Salary:");
		Gross.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Gross.setBounds(771, 155, 87, 19);
		frame.getContentPane().add(Gross);
		
		textFieldGross = new JTextField();
		textFieldGross.setEditable(false);
		textFieldGross.setBounds(868, 154, 96, 20);
		frame.getContentPane().add(textFieldGross);
		textFieldGross.setColumns(10);
		
		JLabel Deduction = new JLabel("Deduction:");
		Deduction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Deduction.setBounds(771, 212, 87, 14);
		frame.getContentPane().add(Deduction);
		
		textFieldDeduction = new JTextField();
		textFieldDeduction.setEditable(false);
		textFieldDeduction.setBounds(868, 206, 96, 20);
		frame.getContentPane().add(textFieldDeduction);
		textFieldDeduction.setColumns(10);
		
		JLabel NetSalary = new JLabel("NET SALARY:");
		NetSalary.setFont(new Font("Tahoma", Font.BOLD, 20));
		NetSalary.setBounds(708, 350, 150, 42);
		frame.getContentPane().add(NetSalary);
		
		textFieldNetSalary = new JTextField();
		textFieldNetSalary.setEditable(false);
		textFieldNetSalary.setBounds(851, 366, 96, 20);
		frame.getContentPane().add(textFieldNetSalary);
		textFieldNetSalary.setColumns(10);
		
		JButton ComputeButton = new JButton("Compute");
		ComputeButton.addActionListener(new ActionListener() {
	

			public void actionPerformed(ActionEvent e) {
			int rate,hour,days,gross,tax,phil,deduct,net,sss;
			rate=Integer.valueOf(textFieldRate.getText());
			hour=Integer.valueOf(textFieldHour.getText());
			days=Integer.valueOf(textFieldDays.getText());
			gross=rate*hour*days;
			
			textFieldGrossSalary.setText(String.valueOf(gross));
			tax=(gross*15)/100;
			textFieldTAX.setText(String.valueOf(tax));
			sss=(gross*2)/100;
			textFieldSSS.setText(String.valueOf(sss));
			phil=(gross*5)/100;
			textFieldPhilhealth.setText(String.valueOf(phil));
			deduct=phil+tax+sss;
			textFieldTotalDeduction.setText(String.valueOf(deduct));
			
			net=gross-deduct;
			textFieldNetSalary.setText(String.valueOf(net));
			textFieldGross.setText(String.valueOf(gross));
			textFieldDeduction.setText(String.valueOf(deduct));
			}

			public void actionPerformed1(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		ComputeButton.setForeground(new Color(255, 255, 255));
		ComputeButton.setBackground(new Color(0, 34, 0));
		ComputeButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ComputeButton.setBounds(406, 427, 144, 42);
		frame.getContentPane().add(ComputeButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Pictures\\Screenshots\\Screenshot (456).png"));
		lblNewLabel.setBounds(-34, 11, 349, 84);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Pictures\\Screenshots\\Screenshot (456).png"));
		lblNewLabel_1.setBounds(666, 11, 324, 94);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
