package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;

public class ShopMainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane shopTabbedPane;
	private JTabbedPane memberTabbedPane;
	private JPanel memberLoginPanel;
	private JTextField searchTextField;

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
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel northSearchPanel = new JPanel();
		northSearchPanel.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout = (FlowLayout) northSearchPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(northSearchPanel, BorderLayout.NORTH);
		
		JLabel mainLoginImageLabel = new JLabel("");
		mainLoginImageLabel.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/main_logo60X25.png")));
		northSearchPanel.add(mainLoginImageLabel);
		
		searchTextField = new JTextField();
		northSearchPanel.add(searchTextField);
		searchTextField.setColumns(17);
		
		JButton searchButton = new JButton("");
		searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		searchButton.setBorder(null);
		searchButton.setBackground(new Color(255, 255, 255));
		searchButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/search_image20.png")));
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		northSearchPanel.add(searchButton);
		
		JPanel southMenuPanel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) southMenuPanel.getLayout();
		flowLayout_1.setHgap(60);
		southMenuPanel.setBackground(new Color(255, 255, 255));
		contentPane.add(southMenuPanel, BorderLayout.SOUTH);
		
		JButton southSearchNewButton = new JButton("");
		southSearchNewButton.setBorder(null);
		southSearchNewButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/search_dog50.png")));
		southMenuPanel.add(southSearchNewButton);
		
		JButton southHomeButton = new JButton("");
		southHomeButton.setBorder(null);
		southHomeButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/shoppingmall.png")));
		southMenuPanel.add(southHomeButton);
		
		JButton southMyButton = new JButton("");
		southMyButton.setBorder(null);
		southMyButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/user.png")));
		southMenuPanel.add(southMyButton);
		
		shopTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shopTabbedPane, BorderLayout.CENTER);
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("회원", new ImageIcon(ShopMainFrame.class.getResource("/images/user20.png")), memberTabbedPane, null);
		
		JPanel memberJoinPanel = new JPanel();
		memberTabbedPane.addTab("회원가입", null, memberJoinPanel, null);
		memberJoinPanel.setLayout(null);
		
		JLabel idNewLabel = new JLabel("아이디");
		idNewLabel.setBounds(38, 29, 57, 15);
		memberJoinPanel.add(idNewLabel);
		
		JLabel passwordNewLabel_1 = new JLabel("비밀번호");
		passwordNewLabel_1.setBounds(207, 29, 57, 15);
		memberJoinPanel.add(passwordNewLabel_1);
		
		memberLoginPanel = new JPanel();
		memberTabbedPane.addTab("회원로그인", null, memberLoginPanel, null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("제품", null, tabbedPane, null);
	}
}
