import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClaculatorSwing {

	private JFrame frame;
	private JTextField txtNull;
	public String str=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaculatorSwing window = new ClaculatorSwing();
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
	public ClaculatorSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		txtNull = new JTextField("");
		GridBagConstraints gbc_txtNull = new GridBagConstraints();
		gbc_txtNull.gridheight = 2;
		gbc_txtNull.insets = new Insets(0, 0, 5, 0);
		gbc_txtNull.gridwidth = 7;
		gbc_txtNull.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNull.gridx = 0;
		gbc_txtNull.gridy = 0;
		frame.getContentPane().add(txtNull, gbc_txtNull);
		txtNull.setColumns(10);
		
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="1";
				txtNull.setText(str);
			}
		});
		
		GridBagConstraints gbc_btnNewButton1 = new GridBagConstraints();
		gbc_btnNewButton1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton1.gridx = 2;
		gbc_btnNewButton1.gridy = 2;
		frame.getContentPane().add(btnNewButton1, gbc_btnNewButton1);
		
		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="2";
				txtNull.setText(str);
				
			}
			
		});
		
		GridBagConstraints gbc_btnNewButton2 = new GridBagConstraints();
		gbc_btnNewButton2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton2.gridx = 3;
		gbc_btnNewButton2.gridy = 2;
		frame.getContentPane().add(btnNewButton2, gbc_btnNewButton2);
		
		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="3";
				txtNull.setText(str);
				
			}
			
		});
		GridBagConstraints gbc_btnNewButton3 = new GridBagConstraints();
		gbc_btnNewButton3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton3.gridx = 4;
		gbc_btnNewButton3.gridy = 2;
		frame.getContentPane().add(btnNewButton3, gbc_btnNewButton3);
		
		JButton btnNewButtonAddition = new JButton("+");
		btnNewButtonAddition.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="+";
				txtNull.setText(str);
				
			}
			
		});
		
		GridBagConstraints gbc_btnNewButtonAddition = new GridBagConstraints();
		gbc_btnNewButtonAddition.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButtonAddition.gridx = 5;
		gbc_btnNewButtonAddition.gridy = 2;
		frame.getContentPane().add(btnNewButtonAddition, gbc_btnNewButtonAddition);
		
		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="4";
				txtNull.setText(str);
			}
		});
	
		GridBagConstraints gbc_btnNewButton4 = new GridBagConstraints();
		gbc_btnNewButton4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton4.gridx = 2;
		gbc_btnNewButton4.gridy = 3;
		frame.getContentPane().add(btnNewButton4, gbc_btnNewButton4);
		
		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="5";
				txtNull.setText(str);
			}
		});
		GridBagConstraints gbc_btnNewButton5 = new GridBagConstraints();
		gbc_btnNewButton5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton5.gridx = 3;
		gbc_btnNewButton5.gridy = 3;
		frame.getContentPane().add(btnNewButton5, gbc_btnNewButton5);
		
		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="6";
				txtNull.setText(str);
			}
		});
		GridBagConstraints gbc_btnNewButton6 = new GridBagConstraints();
		gbc_btnNewButton6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton6.gridx = 4;
		gbc_btnNewButton6.gridy = 3;
		frame.getContentPane().add(btnNewButton6, gbc_btnNewButton6);
		
		JButton btnNewButtonSubtraction = new JButton("-");
		btnNewButtonSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="-";
				txtNull.setText(str);
			}
		});
		GridBagConstraints gbc_btnNewButtonSubtraction = new GridBagConstraints();
		gbc_btnNewButtonSubtraction.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButtonSubtraction.gridx = 5;
		gbc_btnNewButtonSubtraction.gridy = 3;
		frame.getContentPane().add(btnNewButtonSubtraction, gbc_btnNewButtonSubtraction);
		
		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   str=txtNull.getText();
				str+="7";
				txtNull.setText(str);
			}
		});
		GridBagConstraints gbc_btnNewButton7 = new GridBagConstraints();
		gbc_btnNewButton7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton7.gridx = 2;
		gbc_btnNewButton7.gridy = 4;
		frame.getContentPane().add(btnNewButton7, gbc_btnNewButton7);
		
		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="8";
				txtNull.setText(str);
			}
		});
		GridBagConstraints gbc_btnNewButton8 = new GridBagConstraints();
		gbc_btnNewButton8.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton8.gridx = 3;
		gbc_btnNewButton8.gridy = 4;
		frame.getContentPane().add(btnNewButton8, gbc_btnNewButton8);
		
		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="9";
				txtNull.setText(str);
			}
		});
		GridBagConstraints gbc_btnNewButton9 = new GridBagConstraints();
		gbc_btnNewButton9.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton9.gridx = 4;
		gbc_btnNewButton9.gridy = 4;
		frame.getContentPane().add(btnNewButton9, gbc_btnNewButton9);
		
		JButton btnNewButtonMult = new JButton("*");
		btnNewButtonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="*";
				txtNull.setText(str);
			}
		});
		GridBagConstraints gbc_btnNewButtonMult = new GridBagConstraints();
		gbc_btnNewButtonMult.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButtonMult.gridx = 5;
		gbc_btnNewButtonMult.gridy = 4;
		frame.getContentPane().add(btnNewButtonMult, gbc_btnNewButtonMult);
		
		JButton btnNewButtonDiv = new JButton("/");
		btnNewButtonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="/";
				txtNull.setText(str);
			}
		});
		GridBagConstraints gbc_btnNewButtonDiv = new GridBagConstraints();
		gbc_btnNewButtonDiv.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButtonDiv.gridx = 2;
		gbc_btnNewButtonDiv.gridy = 5;
		frame.getContentPane().add(btnNewButtonDiv, gbc_btnNewButtonDiv);
		
		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str+="0";
				txtNull.setText(str);
			}
		});
		GridBagConstraints gbc_btnNewButton0 = new GridBagConstraints();
		gbc_btnNewButton0.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton0.gridx = 3;
		gbc_btnNewButton0.gridy = 5;
		frame.getContentPane().add(btnNewButton0, gbc_btnNewButton0);
		
		JButton btnNewButtonCalculate = new JButton("=");
		btnNewButtonCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str=calculateResult(str);
				txtNull.setText(str);
			}
		});
		
		JButton btnNewButtonClear = new JButton("clr");
		btnNewButtonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str=txtNull.getText();
				str=null;
				txtNull.setText(str);
			}
		});
		GridBagConstraints gbc_btnNewButtonClear = new GridBagConstraints();
		gbc_btnNewButtonClear.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButtonClear.gridx = 4;
		gbc_btnNewButtonClear.gridy = 5;
		frame.getContentPane().add(btnNewButtonClear, gbc_btnNewButtonClear);
		GridBagConstraints gbc_btnNewButtonCalculate = new GridBagConstraints();
		gbc_btnNewButtonCalculate.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButtonCalculate.gridx = 5;
		gbc_btnNewButtonCalculate.gridy = 5;
		frame.getContentPane().add(btnNewButtonCalculate, gbc_btnNewButtonCalculate);
		
		
	}
	public static String calculateResult(String input) {
		  // will get all numbers and store it to `numberStr`
	    String numberStr[] = input.replaceAll("[+*/()-]+"," ").split(" ");
	    // will get all operators and store it to `operatorStr`
	    String operatorStr[] = input.replaceAll("[0-9()]+","").split("");

	    int total = Integer.parseInt(numberStr[0]);

	    for (int i=0; i<operatorStr.length; i++) {
	        switch (operatorStr[i]) {
	            case "+" :
	                total += Integer.parseInt(numberStr[i+1]);
	                break;
	            case "-" :
	                total -= Integer.parseInt(numberStr[i+1]);
	                break;
	            case "*" :
	                total *= Integer.parseInt(numberStr[i+1]);
	                break;
	            case "/" :
	                total /= Integer.parseInt(numberStr[i+1]);
	                break;
	        }

	        if(i+2 >= operatorStr.length) continue; // if meets the last operands already
	        numberStr[i+1] = String.valueOf(total);

	    }
	    return String.valueOf(total);
	}

}
