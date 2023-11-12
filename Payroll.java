package Payroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import javax.swing.JEditorPane;
import javax.swing.JMenuBar;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;

public class Payroll {

	private JFrame frmGeorgetownCleaningServicesemployee;
	private JTextField textFieldEmployeeName;
	private JTextField textFieldHourlySalary;
	private JTextField textFieldMonday1;
	private JTextField textFieldMonday2;
	private JTextField textFieldTuesday1;
	private JTextField textFieldTuesday2;
	private JTextField textFieldWednesday1;
	private JTextField textFieldWednesday2;
	private JTextField textFieldThursday1;
	private JTextField textFieldThursday2;
	private JTextField textFieldFriday1;
	private JTextField textFieldFriday2;
	private JTextField textFieldSaturday1;
	private JTextField textFieldSaturday2;
	private JTextField textFieldSunday1;
	private JTextField textFieldSunday2;
	private JTextField textFieldRegularHours;
	private JTextField textFieldOvertimeHours;
	private JTextField textFieldRegularAmount;
	private JTextField textFieldOvertimeAmount;
	private JTextField textFieldNetPay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll window = new Payroll();
					window.frmGeorgetownCleaningServicesemployee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetownCleaningServicesemployee = new JFrame();
		frmGeorgetownCleaningServicesemployee.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Pictures\\desktopicon.png"));
		frmGeorgetownCleaningServicesemployee.setForeground(new Color(255, 255, 255));
		frmGeorgetownCleaningServicesemployee.setBackground(new Color(0, 0, 255));
		frmGeorgetownCleaningServicesemployee.setTitle("Georgetown Cleaning Services-Employee Payroll");
		frmGeorgetownCleaningServicesemployee.setBounds(100, 100, 896, 547);
		frmGeorgetownCleaningServicesemployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorgetownCleaningServicesemployee.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(40, 45, 121, 24);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel);
		
		textFieldEmployeeName = new JTextField();
		textFieldEmployeeName.setBounds(162, 49, 209, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldEmployeeName);
		textFieldEmployeeName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Hourly Salary:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(475, 45, 121, 21);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_1);
		
		textFieldHourlySalary = new JTextField();
		textFieldHourlySalary.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldHourlySalary.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldHourlySalary.setBounds(581, 49, 131, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldHourlySalary);
		textFieldHourlySalary.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 25, 820, 76);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("First Week:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(40, 186, 73, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Second Week:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(32, 224, 91, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Monday");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(135, 152, 58, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tuesday");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(231, 152, 66, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Wednesday");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(307, 152, 81, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Thursday");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(398, 152, 67, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Friday");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(475, 152, 73, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Saturday");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(558, 152, 68, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Sunday");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(664, 152, 48, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_10);
		
		textFieldMonday1 = new JTextField();
		textFieldMonday1.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldMonday1.setBounds(123, 183, 73, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldMonday1);
		textFieldMonday1.setColumns(10);
		
		textFieldMonday2 = new JTextField();
		textFieldMonday2.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldMonday2.setBounds(123, 221, 73, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldMonday2);
		textFieldMonday2.setColumns(10);
		
		textFieldTuesday1 = new JTextField();
		textFieldTuesday1.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldTuesday1.setBounds(220, 183, 79, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldTuesday1);
		textFieldTuesday1.setColumns(10);
		
		textFieldTuesday2 = new JTextField();
		textFieldTuesday2.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldTuesday2.setBounds(220, 221, 77, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldTuesday2);
		textFieldTuesday2.setColumns(10);
		
		textFieldWednesday1 = new JTextField();
		textFieldWednesday1.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldWednesday1.setBounds(314, 183, 73, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldWednesday1);
		textFieldWednesday1.setColumns(10);
		
		textFieldWednesday2 = new JTextField();
		textFieldWednesday2.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldWednesday2.setBounds(314, 221, 74, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldWednesday2);
		textFieldWednesday2.setColumns(10);
		
		textFieldThursday1 = new JTextField();
		textFieldThursday1.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldThursday1.setBounds(397, 183, 68, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldThursday1);
		textFieldThursday1.setColumns(10);
		
		textFieldThursday2 = new JTextField();
		textFieldThursday2.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldThursday2.setBounds(398, 224, 67, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldThursday2);
		textFieldThursday2.setColumns(10);
		
		textFieldFriday1 = new JTextField();
		textFieldFriday1.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldFriday1.setBounds(475, 183, 66, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldFriday1);
		textFieldFriday1.setColumns(10);
		
		textFieldFriday2 = new JTextField();
		textFieldFriday2.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldFriday2.setBounds(475, 224, 66, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldFriday2);
		textFieldFriday2.setColumns(10);
		
		textFieldSaturday1 = new JTextField();
		textFieldSaturday1.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldSaturday1.setBounds(562, 183, 66, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldSaturday1);
		textFieldSaturday1.setColumns(10);
		
		textFieldSaturday2 = new JTextField();
		textFieldSaturday2.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldSaturday2.setBounds(562, 221, 70, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldSaturday2);
		textFieldSaturday2.setColumns(10);
		
		textFieldSunday1 = new JTextField();
		textFieldSunday1.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldSunday1.setBounds(664, 183, 70, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldSunday1);
		textFieldSunday1.setColumns(10);
		
		textFieldSunday2 = new JTextField();
		textFieldSunday2.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldSunday2.setBounds(664, 221, 70, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldSunday2);
		textFieldSunday2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 127, 820, 155);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("Process it");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double mon1,mon2,tue1,tue2,wed1,wed2,thur1,thur2,fri1,fri2,sat1,sat2,sun1,sun2,overtime,regular,salary,regamount,overamount,net;
				double overtimesalary=27.78;
				salary=Double.valueOf(textFieldHourlySalary.getText());
			mon1=Double.valueOf(textFieldMonday1.getText());
				mon2=Double.valueOf(textFieldMonday2.getText());
				tue1=Double.valueOf(textFieldTuesday1.getText());
				tue2=Double.valueOf(textFieldTuesday2.getText());
				wed1=Double.valueOf(textFieldWednesday1.getText());
				wed2=Double.valueOf(textFieldWednesday2.getText());
				thur1=Double.valueOf(textFieldThursday1.getText());
				thur2=Double.valueOf(textFieldThursday2.getText());
				fri1=Double.valueOf(textFieldFriday1.getText());
				fri2=Double.valueOf(textFieldFriday2.getText());
				sat1=Double.valueOf(textFieldSaturday1.getText());
				sat2=Double.valueOf(textFieldSaturday2.getText());
				sun1=Double.valueOf(textFieldSunday1.getText());
				sun2=Double.valueOf(textFieldSunday2.getText());
				overtime=(mon2-8)+(tue2-8)+(wed2-8)+(thur2-8);
				textFieldOvertimeHours.setText(String.valueOf(overtime));
				regular=(mon1+mon2+tue1+tue2+wed1+wed2+thur1+thur2+fri1+fri2+sat1+sat2+sun1+sun2)-overtime;
				textFieldRegularHours.setText(String.valueOf(regular));
				regamount=salary*regular;
				overamount=overtime*overtimesalary;
				textFieldRegularAmount.setText(String.valueOf(regamount));
				textFieldOvertimeAmount.setText(String.format("%.2f", overamount));
				net=regamount+overamount;
				textFieldNetPay.setText(String.valueOf(net));
				
			}
		});
		btnNewButton.setBackground(new Color(227, 227, 227));
		btnNewButton.setBounds(52, 375, 109, 76);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("Regular:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(196, 406, 73, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Overtime:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_12.setBounds(196, 437, 73, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Hours");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_13.setBounds(292, 375, 49, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Amount");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_14.setBounds(379, 375, 49, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_14);
		
		textFieldRegularHours = new JTextField();
		textFieldRegularHours.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldRegularHours.setBounds(275, 403, 73, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldRegularHours);
		textFieldRegularHours.setColumns(10);
		
		textFieldOvertimeHours = new JTextField();
		textFieldOvertimeHours.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldOvertimeHours.setBounds(275, 431, 73, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldOvertimeHours);
		textFieldOvertimeHours.setColumns(10);
		
		textFieldRegularAmount = new JTextField();
		textFieldRegularAmount.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldRegularAmount.setBounds(358, 403, 81, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldRegularAmount);
		textFieldRegularAmount.setColumns(10);
		
		textFieldOvertimeAmount = new JTextField();
		textFieldOvertimeAmount.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldOvertimeAmount.setBounds(358, 431, 81, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldOvertimeAmount);
		textFieldOvertimeAmount.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Net Pay:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_15.setBounds(490, 409, 73, 14);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(lblNewLabel_15);
		
		textFieldNetPay = new JTextField();
		textFieldNetPay.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldNetPay.setBounds(562, 409, 66, 20);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldNetPay);
		textFieldNetPay.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setBackground(new Color(211, 211, 211));
		btnNewButton_1.setBounds(700, 375, 109, 76);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 325, 820, 143);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel_2);
		frmGeorgetownCleaningServicesemployee.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frmGeorgetownCleaningServicesemployee.getContentPane(), lblNewLabel, textFieldEmployeeName, lblNewLabel_1, textFieldHourlySalary, panel, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5, lblNewLabel_6, lblNewLabel_7, lblNewLabel_8, lblNewLabel_9, lblNewLabel_10, textFieldMonday1, textFieldMonday2, textFieldTuesday1, textFieldTuesday2, textFieldWednesday1, textFieldWednesday2, textFieldThursday1, textFieldThursday2, textFieldFriday1, textFieldFriday2, textFieldSaturday1, textFieldSaturday2, textFieldSunday1, textFieldSunday2, panel_1, btnNewButton, lblNewLabel_11, lblNewLabel_12, lblNewLabel_13, lblNewLabel_14, textFieldRegularHours, textFieldOvertimeHours, textFieldRegularAmount, textFieldOvertimeAmount, lblNewLabel_15, textFieldNetPay, btnNewButton_1, panel_2}));
	}
}
