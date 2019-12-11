/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.wPkg;
import javaapplication1.RMS.*;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/**
 *
 * @author DustedPixels
 */
public class SelectStuffFrame extends javax.swing.JFrame {

    /**
     * Creates new form SelectFrame
     */
    private static HandheldDevice handheldDevice;
    private int selectedTable;


	private void jButton1ActionPerformed(ActionEvent e) {
        new OrderFrame(handheldDevice).setVisible(true);
        handheldDevice.openOrderTicket(selectedTable);
		this.dispose();

	}

    SelectStuffFrame(HandheldDevice handheldDevice) {
	    this.handheldDevice = handheldDevice;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	// Generated using JFormDesigner Evaluation license - unknown
	private void initComponents() {
		jButton1 = new JButton();
		tablePanel = new JPanel();
		table01 = new JLabel();
		table02 = new JLabel();
		table03 = new JLabel();
		table04 = new JLabel();
		table05 = new JLabel();
		table06 = new JLabel();
		table07 = new JLabel();
		table08 = new JLabel();
		table09 = new JLabel();
		table10 = new JLabel();
		table11 = new JLabel();
		table12 = new JLabel();
		table13 = new JLabel();
		table14 = new JLabel();
		table15 = new JLabel();
		table16 = new JLabel();
		table17 = new JLabel();
		backButton = new JButton();

		//======== this ========
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		var contentPane = getContentPane();

		//---- jButton1 ----
		jButton1.setText("Select table");
		jButton1.addActionListener(e -> jButton1ActionPerformed(e));

		//======== tablePanel ========
		{
			tablePanel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
			javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax
			. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
			.awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
			. Color. red) ,tablePanel. getBorder( )) ); tablePanel. addPropertyChangeListener (new java. beans.
			PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .
			equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

			//---- table01 ----
			table01.setText("Table 1");
			table01.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					table01MouseClicked(e);
				}
			});

			//---- table02 ----
			table02.setText("Table 2");

			//---- table03 ----
			table03.setText("Table 3");

			//---- table04 ----
			table04.setText("Table 4");

			//---- table05 ----
			table05.setText("Table 5");

			//---- table06 ----
			table06.setText("Table 6");

			//---- table07 ----
			table07.setText("Table 7");

			//---- table08 ----
			table08.setText("Table 8");

			//---- table09 ----
			table09.setText("Table 9");

			//---- table10 ----
			table10.setText("Table 10");

			//---- table11 ----
			table11.setText("Table 11");

			//---- table12 ----
			table12.setText("Table 12");

			//---- table13 ----
			table13.setText("Table 13");

			//---- table14 ----
			table14.setText("Table 14");

			//---- table15 ----
			table15.setText("Table 15");

			//---- table16 ----
			table16.setText("Table 16");

			//---- table17 ----
			table17.setText("Table 17");

			GroupLayout tablePanelLayout = new GroupLayout(tablePanel);
			tablePanel.setLayout(tablePanelLayout);
			tablePanelLayout.setHorizontalGroup(
				tablePanelLayout.createParallelGroup()
					.addGroup(GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
						.addGroup(tablePanelLayout.createParallelGroup()
							.addComponent(table09)
							.addGroup(tablePanelLayout.createSequentialGroup()
								.addGroup(tablePanelLayout.createParallelGroup()
									.addComponent(table08)
									.addComponent(table07)
									.addComponent(table01)
									.addComponent(table02)
									.addComponent(table03)
									.addComponent(table04)
									.addComponent(table05)
									.addComponent(table06))
								.addGap(72, 72, 72)
								.addGroup(tablePanelLayout.createParallelGroup()
									.addComponent(table11)
									.addComponent(table17)
									.addComponent(table16)
									.addComponent(table15)
									.addComponent(table14)
									.addComponent(table13)
									.addComponent(table12)
									.addComponent(table10))))
						.addContainerGap(37, Short.MAX_VALUE))
			);
			tablePanelLayout.setVerticalGroup(
				tablePanelLayout.createParallelGroup()
					.addGroup(tablePanelLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(tablePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addGroup(tablePanelLayout.createSequentialGroup()
								.addComponent(table13)
								.addGap(18, 18, 18)
								.addComponent(table14)
								.addGap(18, 18, 18)
								.addComponent(table15)
								.addGap(18, 18, 18)
								.addComponent(table16)
								.addGap(18, 18, 18)
								.addComponent(table17))
							.addGroup(tablePanelLayout.createSequentialGroup()
								.addGroup(tablePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(table01)
									.addComponent(table10))
								.addGap(14, 14, 14)
								.addGroup(tablePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(table02)
									.addComponent(table11))
								.addGap(18, 18, 18)
								.addGroup(tablePanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(table03)
									.addComponent(table12))
								.addGap(22, 22, 22)
								.addComponent(table04)
								.addGap(18, 18, 18)
								.addComponent(table05)
								.addGap(18, 18, 18)
								.addComponent(table06)
								.addGap(18, 18, 18)
								.addComponent(table07)
								.addGap(18, 18, 18)
								.addComponent(table08)))
						.addGap(18, 18, 18)
						.addComponent(table09)
						.addContainerGap(66, Short.MAX_VALUE))
			);
		}

		//---- backButton ----
		backButton.setText("Back");
		backButton.addActionListener(e -> {
			backButtonActionPerformed(e);
			backButtonActionPerformed(e);
		});

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(jButton1)
						.addComponent(backButton))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(tablePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(95, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(21, 21, 21)
							.addComponent(tablePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(backButton)
							.addGap(24, 24, 24)
							.addComponent(jButton1)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pack();
		setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new WaiterFrame(handheldDevice).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void table01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table01MouseClicked
        // TODO add your handling code here:
        selectedTable = 1;
        System.out.println(selectedTable);



    }//GEN-LAST:event_table01MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectStuffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectStuffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectStuffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectStuffFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectStuffFrame(handheldDevice).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - unknown
	private JButton jButton1;
	private JPanel tablePanel;
	private JLabel table01;
	private JLabel table02;
	private JLabel table03;
	private JLabel table04;
	private JLabel table05;
	private JLabel table06;
	private JLabel table07;
	private JLabel table08;
	private JLabel table09;
	private JLabel table10;
	private JLabel table11;
	private JLabel table12;
	private JLabel table13;
	private JLabel table14;
	private JLabel table15;
	private JLabel table16;
	private JLabel table17;
	private JButton backButton;

    // End of variables declaration//GEN-END:variables
}
