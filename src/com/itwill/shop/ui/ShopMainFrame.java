package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Dimension;

public class ShopMainFrame extends JFrame {
	/*
	 * Service객체선언
	 */
	Product
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane shopTabbedPane;
	private JTextField idTextField;
	private JTabbedPane memberTabbedPane;
	private JPanel productListPanel;
	private JTextField searchTextField;
	private JPanel productContentListPanel;

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
		northSearchPanel.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout = (FlowLayout) northSearchPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(northSearchPanel, BorderLayout.NORTH);
		
		JLabel mainLogoImageLabel = new JLabel("");
		mainLogoImageLabel.setHorizontalAlignment(SwingConstants.LEFT);
		mainLogoImageLabel.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/main_logo60X25.png")));
		northSearchPanel.add(mainLogoImageLabel);
		
		searchTextField = new JTextField();
		northSearchPanel.add(searchTextField);
		searchTextField.setColumns(17);
		
		JButton searchButton = new JButton("");
		searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		searchButton.setBorder(null);
		searchButton.setBackground(new Color(255, 255, 255));
		searchButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/search_image20.png")));
		northSearchPanel.add(searchButton);
		
		JPanel southMenuPanel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) southMenuPanel.getLayout();
		flowLayout_1.setHgap(50);
		southMenuPanel.setBackground(new Color(255, 255, 255));
		contentPane.add(southMenuPanel, BorderLayout.SOUTH);
		
		JButton southSearchButton = new JButton("");
		southSearchButton.setBorder(null);
		southSearchButton.setBackground(new Color(255, 255, 255));
		southSearchButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/search_dog50.png")));
		southMenuPanel.add(southSearchButton);
		
		JButton southHomeButton = new JButton("");
		southHomeButton.setBorder(null);
		southHomeButton.setBackground(new Color(255, 255, 255));
		southHomeButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/shoppingmall.png")));
		southMenuPanel.add(southHomeButton);
		
		JButton southMyButton = new JButton("");
		southMyButton.setBorder(null);
		southMyButton.setBackground(new Color(255, 255, 255));
		southMyButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/user.png")));
		southMenuPanel.add(southMyButton);
		
		shopTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shopTabbedPane, BorderLayout.CENTER);
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("회원", new ImageIcon(ShopMainFrame.class.getResource("/images/user20.png")), memberTabbedPane, null);
		
		JPanel memberJoinPanel = new JPanel();
		memberTabbedPane.addTab("회원가입", null, memberJoinPanel, null);
		memberJoinPanel.setLayout(null);
		
		JLabel idLabel = new JLabel("아이디");
		idLabel.setBounds(59, 36, 57, 15);
		memberJoinPanel.add(idLabel);
		
		idTextField = new JTextField();
		idTextField.setBounds(161, 33, 116, 21);
		memberJoinPanel.add(idTextField);
		idTextField.setColumns(10);
		
		JPanel memberLoginPanel = new JPanel();
		memberTabbedPane.addTab("회원로그인", null, memberLoginPanel, null);
		
		productListPanel = new JPanel();
		shopTabbedPane.addTab("제품", null, productListPanel, null);
		productListPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane productListScrollPane = new JScrollPane();
		productListScrollPane.setPreferredSize(new Dimension(400, 500));
		productListPanel.add(productListScrollPane, BorderLayout.CENTER);
		
		productContentListPanel = new JPanel();
		productContentListPanel.setPreferredSize(new Dimension(340, 600));
		FlowLayout flowLayout_2 = (FlowLayout) productContentListPanel.getLayout();
		flowLayout_2.setVgap(20);
		flowLayout_2.setHgap(27);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		productListScrollPane.setViewportView(productContentListPanel);
		/***********************productPanel start****************************/
		JPanel productPanel = new JPanel();
		productPanel.setPreferredSize(new Dimension(130, 130));
		productPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		productPanel.setBackground(new Color(255, 255, 255));
		productPanel.setLayout(null);
		productContentListPanel.add(productPanel);
		/***********************productPanel end*****************************/
		
		displayProductList();
	}//생성자의끝
	/*
	 * 상품리스트보여주기
	 */
	private void displayProductList() {
		for(int i=0;i<5;i++) {
			JPanel productPanel = new JPanel();
			productPanel.setPreferredSize(new Dimension(130, 130));
			productPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
			productPanel.setBackground(new Color(255, 255, 255));
			productPanel.setLayout(null);
			productContentListPanel.add(productPanel);
		}
		
	}
	
	
}