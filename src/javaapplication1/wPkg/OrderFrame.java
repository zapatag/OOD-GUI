/*
 * Created by JFormDesigner on Tue Dec 10 21:27:00 CST 2019
 */

package javaapplication1.wPkg;
import javaapplication1.cPkg.CookFrame;

import javaapplication1.RMS.HandheldDevice;
import javaapplication1.RMS.OrderManager;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/**
 * @author unknown
 */



public class OrderFrame extends JFrame {

	private HandheldDevice handheldDevice;

	public OrderFrame(HandheldDevice handheldDevice) {
		this.handheldDevice = handheldDevice;
		initComponents();
	}

	private void backButtonActionPerformed(ActionEvent e) {
		// TODO add your code here

	}

	private void addToOrderActionPerformed(ActionEvent e) {
		String foodName = textField1.getText();
		String foodDescription = textField2.getText();
		Double foodCost = Double.parseDouble(textField3.getText());
		this.handheldDevice.inputOrder(foodName, foodDescription, foodCost, 1);
		this.handheldDevice.printOrder();
	}

	private void sendOrderActionPerformed(ActionEvent e) {
		// TODO add your code here
		OrderManager orderManager = new OrderManager();
		orderManager.addToOrderQueue(this.handheldDevice.getOrder());
		new CookFrame(orderManager).setVisible(true);
		this.dispose();
	}

	private void textField1ActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - unknown
		backButton = new JButton();
		textField1 = new JTextField();
		label1 = new JLabel();
		label2 = new JLabel();
		textField2 = new JTextField();
		label3 = new JLabel();
		textField3 = new JTextField();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		var contentPane = getContentPane();

		//---- backButton ----
		backButton.setText("Back");
		backButton.addActionListener(e -> {
			backButtonActionPerformed(e);
			backButtonActionPerformed(e);
		});

		//---- textField1 ----
		textField1.addActionListener(e -> textField1ActionPerformed(e));

		//---- label1 ----
		label1.setText("Food Name");
		label1.setLabelFor(textField1);

		//---- label2 ----
		label2.setText("Food Description");
		label2.setLabelFor(textField2);

		//---- label3 ----
		label3.setText("Food Cost");
		label3.setLabelFor(textField3);

		//---- button1 ----
		button1.setText("Add to Order");
		button1.addActionListener(e -> addToOrderActionPerformed(e));

		//---- button2 ----
		button2.setText("Send Order");
		button2.addActionListener(e -> sendOrderActionPerformed(e));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(backButton)
							.addContainerGap(314, Short.MAX_VALUE))
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addGap(0, 91, Short.MAX_VALUE)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
									.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(label2)
										.addComponent(label3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(contentPaneLayout.createParallelGroup()
										.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField3, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
									.addGap(58, 58, 58))
								.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
									.addComponent(label1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
									.addGap(55, 55, 55))
								.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
									.addGroup(contentPaneLayout.createParallelGroup()
										.addGroup(contentPaneLayout.createSequentialGroup()
											.addGap(6, 6, 6)
											.addComponent(button2))
										.addComponent(button1))
									.addGap(46, 46, 46))))))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(backButton)
					.addGap(35, 35, 35)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(button1)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(button2)
					.addContainerGap())
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - unknown
	private JButton backButton;
	private JTextField textField1;
	private JLabel label1;
	private JLabel label2;
	private JTextField textField2;
	private JLabel label3;
	private JTextField textField3;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
