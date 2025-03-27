package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;

public class ShopMainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane shopTabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMainFrame frame = new ShopMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShopMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel northSearchPanel = new JPanel();
		contentPane.add(northSearchPanel, BorderLayout.NORTH);
		
		JPanel southMenuPanel = new JPanel();
		contentPane.add(southMenuPanel, BorderLayout.SOUTH);
		
		shopTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shopTabbedPane, BorderLayout.CENTER);
		
		JTabbedPane memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("New tab", null, memberTabbedPane, null);
		
		JPanel memberJoinPanel = new JPanel();
		memberTabbedPane.addTab("New tab", null, memberJoinPanel, null);
		
		JPanel memberLoginPanel = new JPanel();
		memberTabbedPane.addTab("New tab", null, memberLoginPanel, null);
	}

}
