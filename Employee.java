package ke;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
/*����Ա��������Ϣ*/
class add extends Panel implements ActionListener {
	Connection con;
	Statement sql;
	Panel pNorth, pCenter;
	JButton done, readd;
	Box box, box0, box1, box2, box3, box4, box5, box6, box7,box8,box9,box10,box11,box12,box13,box14,box15,box16,box17,box18;
	JTextField num, name, sex,  year, professional,shangbandaka,xiabandaka,queqin,chuchai1,chuchai2,count1,qingjia1,qingjia2,count2,jiaban1,jiaban2,shijian;
	public add() {
		setLayout(new BorderLayout());
		Font font = new Font("��������", Font.BOLD, 10);
		UIManager.put("Label.font", font);
		num = new JTextField(20);
		name = new JTextField(20);
		sex = new JTextField(20);
		professional = new JTextField(20);
		year = new JTextField(6);
		shangbandaka = new JTextField(20);
		xiabandaka = new JTextField(20);
		queqin = new JTextField(20);
		chuchai1 = new JTextField(20);
		chuchai2 = new JTextField(20);
		count1 = new JTextField(20);
		qingjia1 = new JTextField(20);
		qingjia2 = new JTextField(20);
		count2 = new JTextField(20);
		jiaban1 = new JTextField(20);
		jiaban2= new JTextField(20);
		shijian = new JTextField(20);
		box0 = Box.createHorizontalBox();
		JLabel jl = new JLabel("            ¼��Ա��������Ϣ            ");
		jl.setForeground(Color.red);
		jl.setFont(new Font("�����п�", Font.BOLD, 20));
		box0.add(jl);
		box1 = Box.createHorizontalBox();
		box1.add(new JLabel("Ա����:"));
		box1.add(Box.createHorizontalStrut(8));
		box1.add(num);
		box2 = Box.createHorizontalBox();
		box2.add(new JLabel("����:"));
		box2.add(Box.createHorizontalStrut(8));
		box2.add(name);
		box3 = Box.createHorizontalBox();
		box3.add(new JLabel("�Ա�:"));
		box3.add(Box.createHorizontalStrut(8));
		box3.add(sex);
		box4 = Box.createHorizontalBox();
		box4.add(new JLabel("ְ��:"));
		box4.add(Box.createHorizontalStrut(8));
		box4.add(professional);
		box5 = Box.createHorizontalBox();
		box5.add(new JLabel("����:"));
		box5.add(Box.createHorizontalStrut(8));
		box5.add(year);
		box6 = Box.createHorizontalBox();
		box6.add(new JLabel("�ϰ��:"));
		box6.add(Box.createHorizontalStrut(8));
		box6.add(shangbandaka);
		box7 = Box.createHorizontalBox();
		box7.add(new JLabel("�°��:"));
		box7.add(Box.createHorizontalStrut(8));
		box7.add(xiabandaka);
		box8 = Box.createHorizontalBox();
		box8.add(new JLabel("ȱ��:"));
		box8.add(Box.createHorizontalStrut(8));
		box8.add(queqin);
		box9 = Box.createHorizontalBox();
		box9.add(new JLabel("���ʼ:"));
		box9.add(Box.createHorizontalStrut(8));
		box9.add(chuchai1);
		box10 = Box.createHorizontalBox();
		box10.add(new JLabel("�������:"));
		box10.add(Box.createHorizontalStrut(8));
		box10.add(chuchai2);
		box11 = Box.createHorizontalBox();
		box11.add(new JLabel("��������:"));
		box11.add(Box.createHorizontalStrut(8));
		box11.add(count1);
		box12 = Box.createHorizontalBox();
		box12.add(new JLabel("��ٿ�ʼ:"));
		box12.add(Box.createHorizontalStrut(8));
		box12.add(qingjia1);
		box13 = Box.createHorizontalBox();
		box13.add(new JLabel("��ٽ���:"));
		box13.add(Box.createHorizontalStrut(8));
		box13.add(qingjia2);
		box14 = Box.createHorizontalBox();
		box14.add(new JLabel("�������:"));
		box14.add(Box.createHorizontalStrut(8));
		box14.add(count2);
		box15 = Box.createHorizontalBox();
		box15.add(new JLabel("�Ӱ࿪ʼ:"));
		box15.add(Box.createHorizontalStrut(8));
		box15.add(jiaban1);
		box16 = Box.createHorizontalBox();
		box16.add(new JLabel("�Ӱ����:"));
		box16.add(Box.createHorizontalStrut(8));
		box16.add(jiaban2);
		box17 = Box.createHorizontalBox();
		box17.add(new JLabel("�Ӱ�ʱ��:"));
		box17.add(Box.createHorizontalStrut(8));
		box17.add(shijian);
		box18 = Box.createHorizontalBox();
		done = new JButton("¼��");
		done.setFont(new Font("�����п�", Font.BOLD, 10));
		done.setForeground(Color.black);
		done.setBackground(Color.white);
		done.addActionListener(this);
		box18.add(done);
		box18.add(Box.createHorizontalStrut(8));
		readd = new JButton("����");
		readd.setFont(new Font("�����п�", Font.BOLD, 10));
		readd.setForeground(Color.black);
		readd.setBackground(Color.white);
		readd.addActionListener(this);
		box18.add(readd);
		box = Box.createVerticalBox();
		box.add(box0);
		box.add(Box.createVerticalStrut(12));
		box.add(box1);
		box.add(Box.createVerticalStrut(12));
		box.add(box2);
		box.add(Box.createVerticalStrut(12));
		box.add(box3);
		box.add(Box.createVerticalStrut(12));
		box.add(box4);
		box.add(Box.createVerticalStrut(12));
		box.add(box5);
		box.add(Box.createVerticalStrut(12));
		box.add(box6);
		box.add(Box.createVerticalStrut(12));
		box.add(box7);
		box.add(Box.createVerticalStrut(12));
		box.add(box8);
		box.add(Box.createVerticalStrut(12));
		box.add(box9);
		box.add(Box.createVerticalStrut(12));
		box.add(box10);
		box.add(Box.createVerticalStrut(12));
		box.add(box11);
		box.add(Box.createVerticalStrut(12));
		box.add(box12);
		box.add(Box.createVerticalStrut(12));
		box.add(box13);
		box.add(Box.createVerticalStrut(12));
		box.add(box14);
		box.add(Box.createVerticalStrut(12));
		box.add(box15);
		box.add(Box.createVerticalStrut(12));
		box.add(box16);
		box.add(Box.createVerticalStrut(12));
		box.add(box17);
		box.add(Box.createVerticalStrut(12));
		box.add(box18);
		pCenter = new Panel();
		pCenter.add(box);
		add(pCenter, "Center");
		setBackground(Color.cyan);
	}
	public void actionPerformed(ActionEvent e) {
		String num0, num1, name1, sex1, year1, professional1, shangbandaka1,xiabandaka1,queqin1,chuchai3,chuchai4,count3,qingjia3,qingjia4,count4,jiaban3,jiaban4,shijian1;
		int out = 1;
		if (e.getSource() == done) {
			name1 = name.getText();
			if (name1.equals("")) {
				JOptionPane.showMessageDialog(this, "�Բ���,��������Ϊ��!");
			}
			else {
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (java.lang.ClassNotFoundException ee) {
				}
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee", "root", "123456");
					sql = con.createStatement();
					ResultSet rs = null;
					boolean Abook;
					rs = sql.executeQuery("select * from stud");
					while (rs.next()) {
						num1 = rs.getString("Ա����");
						if (num1.equals(num.getText().trim())) {
							num.setText("");
							JOptionPane.showMessageDialog(this, "�Բ���,��Ա�����Ѵ���!", "Ա������ϵͳ",
							JOptionPane.ERROR_MESSAGE);
							out = 0;
							break;
						}
					}
					con.close();
					sql.close();
				} catch (SQLException r) {
				}
				try{
					Class.forName("com.mysql.jdbc.Driver");
				} catch (java.lang.ClassNotFoundException ee) {
				}
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee", "root", "123456");
					sql = con.createStatement();
					num1 = "'" + num.getText().trim() + "'";
					name1 = name.getText().trim();
					sex1 = "'" + sex.getText().trim() + "'";
					professional1 = "'" + professional.getText().trim() + "'";
					year1 = "'" + year.getText().trim() + "'";
					shangbandaka1 = "'" + shangbandaka.getText().trim() + "'";
					xiabandaka1 = "'" + xiabandaka.getText().trim() + "'";
					queqin1= "'" + queqin.getText().trim() + "'";
					chuchai3 = "'" + chuchai1.getText().trim() + "'";
					chuchai4 = "'" + chuchai2.getText().trim() + "'";
					count3= "'" + count1.getText().trim() + "'";
					qingjia3 = "'" + qingjia1.getText().trim() + "'";
					qingjia4 = "'" + qingjia2.getText().trim() + "'";
					count4 = "'" + count2.getText().trim() + "'";
					jiaban3 = "'" + jiaban1.getText().trim() + "'";
					jiaban4 = "'" + jiaban2.getText().trim() + "'";
					shijian1 = "'" + shijian.getText().trim() + "'";
					String temp = "insert into stud values (" + num1 + ","
							+ "'" + name1 + "'" + "," + sex1 + ","
							+ professional1 + "," + year1 + "," + shangbandaka1 + ","+xiabandaka1 + ","+queqin1 +
							","+chuchai3 + ","+chuchai4 + ","+count3 + ","+qingjia3 + ","+qingjia4 + ","+
							count4 + ","+jiaban3 + ","+jiaban4 + ","+shijian1 + ")";
					sql.executeUpdate(temp);
					sql.close();
					con.close();
				} catch (SQLException err) {
					JOptionPane.showMessageDialog(this, "��Ϣ¼�����,����					��¼��!", "Ա������ϵͳ",
					JOptionPane.ERROR_MESSAGE);
					out = 0;
				}
				if (out == 1) {
					JOptionPane.showMessageDialog(this, "¼��ɹ�!", 
					"Ա����	��ϵͳ",
							JOptionPane.INFORMATION_MESSAGE);
					num.setText(" ");
					name.setText(" ");
					sex.setText("");
					year.setText(" ");
					professional.setText(" ");
					shangbandaka.setText(" ");
					xiabandaka.setText(" ");
					queqin.setText(" ");
					chuchai1.setText(" ");
					chuchai2.setText(" ");
					count1.setText(" ");
					qingjia1.setText(" ");
					qingjia2.setText(" ");
					count2.setText(" ");
					jiaban1.setText(" ");
					jiaban2.setText(" ");
					shijian.setText(" ");
				}
			}
		}
		if (e.getSource() == readd) {
			num.setText(" ");
			name.setText(" ");
			sex.setText("");
			year.setText(" ");
			professional.setText(" ");
			shangbandaka.setText(" ");
			xiabandaka.setText(" ");
			queqin.setText(" ");
			chuchai1.setText(" ");
			chuchai2.setText(" ");
			count1.setText(" ");
			qingjia1.setText(" ");
			qingjia2.setText(" ");
			count2.setText(" ");
			jiaban1.setText(" ");
			jiaban2.setText(" ");
			shijian.setText(" ");
		}
	}
}
//��ѯԱ����Ϣ

//�޸�Ա����Ϣ

//ɾ��Ա����Ϣ
class Delete extends Panel implements ActionListener {
	Connection con;
	Statement sql;
	JTextField num, name, sex,  year, professional,shangbandaka,xiabandaka,queqin,chuchai1,chuchai2,count1,qingjia1,qingjia2,count2,jiaban1,jiaban2,shijian;
	JButton b, b1;
	Box box,  box0, box1, box2, box4, box5, box6, box7,box8,box9,box10,box11,box12,box13,box14,box15,box16,box17,box18;
	ButtonGroup bg;
	JRadioButton male, female;
	Delete() {
		setLayout(new BorderLayout());
		Font font = new Font("��������", Font.BOLD, 10);
		UIManager.put("Label.font", font);
		b1 = new JButton("ȷ��ɾ��");
		b1.setForeground(Color.black);
		b1.setFont(new Font("�����п�", Font.BOLD, 10));
		b1.setBackground(Color.white);
		b1.addActionListener(this);
		b = new JButton("ȷ��");
		b.setForeground(Color.black);
		b.setFont(new Font("�����п�", Font.BOLD, 10));
		b.setBackground(Color.white);
		b.addActionListener(this);
		num = new JTextField(24);
		name = new JTextField(20);
		sex = new JTextField(20);
		professional = new JTextField(20);
		year = new JTextField(6);
		shangbandaka = new JTextField(20);
		xiabandaka = new JTextField(20);
		queqin = new JTextField(20);
		chuchai1 = new JTextField(20);
		chuchai2 = new JTextField(20);
		count1 = new JTextField(20);
		qingjia1 = new JTextField(20);
		qingjia2 = new JTextField(20);
		count2 = new JTextField(20);
		jiaban1 = new JTextField(20);
		jiaban2= new JTextField(20);
		shijian = new JTextField(20);
		professional.setEditable(false);
		year.setEditable(false);
		shangbandaka.setEditable(false);
		Panel pNorth = new Panel();
		JLabel jl = new JLabel("  ɾ��Ա��������Ϣ  ");
		jl.setForeground(Color.red);
		jl.setFont(new Font("�����п�", Font.BOLD, 10));
		pNorth.add(jl);
		add(pNorth, "North");
		box0 = Box.createHorizontalBox();
		box0.add(new JLabel("����Ҫɾ����Ա����:"));
		box0.add(Box.createHorizontalStrut(8));
		box0.add(num);
		box0.add(Box.createHorizontalStrut(8));
		box0.add(b);
		box1 = Box.createHorizontalBox();
		box1.add(new JLabel("����:"));
		box1.add(Box.createHorizontalStrut(8));
		box1.add(name);
		box2 = Box.createHorizontalBox();
		box2.add(new JLabel("�Ա�:"));
		box2.add(Box.createHorizontalStrut(8));
		box2.add(sex);
		box4 = Box.createHorizontalBox();
		box4.add(new JLabel("ְ��:"));
		box4.add(Box.createHorizontalStrut(8));
		box4.add(professional);
		box5 = Box.createHorizontalBox();
		box5.add(new JLabel("����:"));
		box5.add(Box.createHorizontalStrut(8));
		box5.add(year);
		box6 = Box.createHorizontalBox();
		box6.add(new JLabel("�ϰ��:"));
		box6.add(Box.createHorizontalStrut(8));
		box6.add(shangbandaka);
		box7 = Box.createHorizontalBox();
		box7.add(new JLabel("�°��:"));
		box7.add(Box.createHorizontalStrut(8));
		box7.add(xiabandaka);
		box8 = Box.createHorizontalBox();
		box8.add(new JLabel("ȱ��:"));
		box8.add(Box.createHorizontalStrut(8));
		box8.add(queqin);
		box9 = Box.createHorizontalBox();
		box9.add(new JLabel("���ʼ:"));
		box9.add(Box.createHorizontalStrut(8));
		box9.add(chuchai1);
		box10 = Box.createHorizontalBox();
		box10.add(new JLabel("�������:"));
		box10.add(Box.createHorizontalStrut(8));
		box10.add(chuchai2);
		box11 = Box.createHorizontalBox();
		box11.add(new JLabel("��������:"));
		box11.add(Box.createHorizontalStrut(8));
		box11.add(count1);
		box12 = Box.createHorizontalBox();
		box12.add(new JLabel("��ٿ�ʼ:"));
		box12.add(Box.createHorizontalStrut(8));
		box12.add(qingjia1);
		box13 = Box.createHorizontalBox();
		box13.add(new JLabel("��ٽ���:"));
		box13.add(Box.createHorizontalStrut(8));
		box13.add(qingjia2);
		box14 = Box.createHorizontalBox();
		box14.add(new JLabel("�������:"));
		box14.add(Box.createHorizontalStrut(8));
		box14.add(count2);
		box15 = Box.createHorizontalBox();
		box15.add(new JLabel("�Ӱ࿪ʼ:"));
		box15.add(Box.createHorizontalStrut(8));
		box15.add(jiaban1);
		box16 = Box.createHorizontalBox();
		box16.add(new JLabel("�Ӱ����:"));
		box16.add(Box.createHorizontalStrut(8));
		box16.add(jiaban2);
		box17 = Box.createHorizontalBox();
		box17.add(new JLabel("�Ӱ�ʱ��:"));
		box17.add(Box.createHorizontalStrut(8));
		box17.add(shijian);
		box18 = Box.createHorizontalBox();
		box18.add(b1);
		box = Box.createVerticalBox();
		box.add(box0);
		box.add(Box.createVerticalStrut(12));
		box.add(box1);
		box.add(Box.createVerticalStrut(12));
		box.add(box2);
		box.add(Box.createVerticalStrut(12));
		box.add(box4);
		box.add(Box.createVerticalStrut(12));
		box.add(box5);
		box.add(Box.createVerticalStrut(12));
		box.add(box6);
		box.add(Box.createVerticalStrut(12));
		box.add(box7);
		box.add(Box.createVerticalStrut(12));
		box.add(box8);
		box.add(Box.createVerticalStrut(12));
		box.add(box9);
		box.add(Box.createVerticalStrut(12));
		box.add(box10);
		box.add(Box.createVerticalStrut(12));
		box.add(box11);
		box.add(Box.createVerticalStrut(12));
		box.add(box12);
		box.add(Box.createVerticalStrut(12));
		box.add(box13);
		box.add(Box.createVerticalStrut(12));
		box.add(box14);
		box.add(Box.createVerticalStrut(12));
		box.add(box15);
		box.add(Box.createVerticalStrut(12));
		box.add(box16);
		box.add(Box.createVerticalStrut(12));
		box.add(box17);
		box.add(Box.createVerticalStrut(12));
		box.add(box18);
		Panel pCenter = new Panel();
		pCenter.add(box);
		add(pCenter, "Center");
		setBackground(Color.gray);
	}
	public void actionPerformed(ActionEvent e) {
		String num1, name1, sex1, year1, professional1, shangbandaka1,xiabandaka1,queqin1,chuchai3,chuchai4,count3,qingjia3,qingjia4,count4,jiaban3,jiaban4,shijian1;
		int flag = 0;
		if (e.getSource() == b) {
			try {
				Class.forName("com.mysql.jdbc.Driver");//
			} catch (ClassNotFoundException ee) {
				System.out.println("SQLException:" + ee.getMessage());
			}
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee", "root", "123456");//
				sql = con.createStatement();
				ResultSet rs = sql.executeQuery("SELECT * FROM stud ");
				while (rs.next()) {
					num1 = rs.getString("Ա����");
					name1 = rs.getString("����");
					sex1 = rs.getString("�Ա�");
					professional1 = rs.getString("ְ��");
					year1 = rs.getString("����");
					shangbandaka1 = rs.getString("�ϰ��");
					xiabandaka1 = rs.getString("�°��");
					queqin1 = rs.getString("ȱ��");
					chuchai3= rs.getString("���ʼ");
					chuchai4= rs.getString("�������");
					count3 = rs.getString("��������");
					qingjia3 = rs.getString("��ٿ�ʼ");
					qingjia4 = rs.getString("��ٽ���");
					count4= rs.getString("�������");
					jiaban3 = rs.getString("�Ӱ࿪ʼ");
					jiaban4= rs.getString("�Ӱ����");
					shijian1= rs.getString("�Ӱ�ʱ��");
					if (num1.equals(num.getText().trim())) {
						name.setText(name1);
						sex.setText(sex1);
						professional.setText(professional1);
						year.setText(year1);
						shangbandaka.setText(shangbandaka1);
						xiabandaka.setText(xiabandaka1);
						queqin.setText(queqin1);
						chuchai1.setText(chuchai3);
						chuchai2.setText(chuchai4);
						count1.setText(count3);
						qingjia1.setText(qingjia3);
						qingjia2.setText(qingjia4);
						count2.setText(count4);
						jiaban1.setText(jiaban3);
						jiaban2.setText(jiaban4);
						shijian.setText(shijian1);
						flag = 1;
						break;
					}
				}
				sql.close();
				con.close();
			} catch (SQLException ex) {
				System.out.println("SQLException:" + ex.getMessage());
			}
			if (flag == 0) {
				JOptionPane.showMessageDialog(null, "���Ա���Ų�����,������				����!", "����!", JOptionPane.YES_NO_OPTION);
				name.setText(" ");
				sex.setText("");
				year.setText(" ");
				professional.setText(" ");
				shangbandaka.setText(" ");
				xiabandaka.setText(" ");
				queqin.setText(" ");
				chuchai1.setText(" ");
				chuchai2.setText(" ");
				count1.setText(" ");
				qingjia1.setText(" ");
				qingjia2.setText(" ");
				count2.setText(" ");
				jiaban1.setText(" ");
				jiaban2.setText(" ");
				shijian.setText(" ");
			}
		}
		if (e.getSource() == b1) {
			int n = JOptionPane.showConfirmDialog(this, "ȷ��Ҫɾ����Ա����			ȫ����Ϣ��?", "Ա������ϵͳ", JOptionPane.YES_NO_OPTION);
			if (n == JOptionPane.YES_OPTION) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException ee) {
				}
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee", "root", "123456");
					sql = con.createStatement();
					num1 = "'" + num.getText().trim() + "'";
					String temp = "DELETE FROM stud WHERE Ա����=" + num1;
					sql.executeUpdate(temp);
					num.setText("");
					name.setText(" ");
					sex.setText("");
					year.setText(" ");
					professional.setText(" ");
					shangbandaka.setText(" ");
					xiabandaka.setText(" ");
					queqin.setText(" ");
					chuchai1.setText(" ");
					chuchai2.setText(" ");
					count1.setText(" ");
					qingjia1.setText(" ");
					qingjia2.setText(" ");
					count2.setText(" ");
					jiaban1.setText(" ");
					jiaban2.setText(" ");
					shijian.setText(" ");
					sql.close();
					con.close();
				} catch (SQLException ex) {
				}
			} else if (n == JOptionPane.NO_OPTION) {
			}
		}
	}
}
class exit extends JDialog implements ActionListener {
	JFrame mainFrame;
	JPanel panelS, panelN;
	JButton yes, no;
	JLabel lab;
	public exit(JFrame mainFrame) {
		super(mainFrame, "Ա������ϵͳ", true); 
		// true ����Ϊ��ģʽ�Ի���
		this.mainFrame = mainFrame;
		panelN = new JPanel();
		panelS = new JPanel();
		lab = new JLabel("ȷ��Ҫ�˳�Ա������ϵͳ��?");
		lab.setForeground(Color.RED);
		lab.setFont(new Font("�����п�", Font.PLAIN, 22));
		panelN.add(lab);
		yes = new JButton("�˳�");
		yes.setForeground(Color.RED);
		yes.setFont(new Font("�����п�", Font.PLAIN, 20));
		yes.addActionListener(this);
		no = new JButton("ȡ��");
		no.setFont(new Font("�����п�", Font.PLAIN, 20));
		no.setForeground(Color.RED);
		no.addActionListener(this);
		panelS.add(yes);
		panelS.add(no);
		getContentPane().add(panelS, BorderLayout.SOUTH);
		getContentPane().add(panelN, BorderLayout.NORTH);
		this.setBackground(Color.yellow);
		this.setResizable(false); // ���öԻ���Ϊ���ɸı��С
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == yes) {
			System.exit(0);
		}
		if (e.getSource() == no) {
			this.setVisible(false);
		}
	}
}
class fram extends Frame implements ActionListener {
	MenuBar menubar;
	Menu menu_select;
	MenuItem item_stud_add, item_stud_search, item_stud_update,
			item_stud_delete, item_exit;
	add luru;
	Query chaxun;
	Update xiugai;
	Delete shanchu;
	Box box, box1, box2;
	fram() {
		super("Ա������ϵͳ");
		luru = new add();
		chaxun = new Query();
		xiugai = new Update();
		shanchu = new Delete();
		menubar = new MenuBar();
		menu_select = new Menu("�˵�ѡ��");
		menu_select.setFont(new Font("�����п�", Font.BOLD, 18));
		item_stud_add = new MenuItem("¼��Ա��������Ϣ");
		item_stud_add.addActionListener(this);
		item_stud_update = new MenuItem("�޸�Ա��������Ϣ");
		item_stud_update.addActionListener(this);
		item_stud_search = new MenuItem("��ѯԱ��������Ϣ");
		item_stud_search.addActionListener(this);
		item_stud_delete = new MenuItem("ɾ��Ա��������Ϣ");
		item_stud_delete.addActionListener(this);
		item_exit = new MenuItem("�˳�");
		item_exit.addActionListener(this);
		menu_select.add(item_stud_search);
		menu_select.add(item_stud_add);
		menu_select.add(item_stud_update);
		menu_select.add(item_stud_delete);
		menu_select.add(item_exit);
		menubar.add(menu_select);
		setMenuBar(menubar);
		/*ImageIcon img = new ImageIcon("E:\\44.png");
		JLabel hy = new JLabel(img);
		hy.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
		add(hy);
		setVisible(true);*/
		Label label = new Label("��ӭ����Ա������ϵͳ", Label.CENTER);
		label.setFont(new Font("�����п�", Font.BOLD, 40));
		label.setForeground(Color.RED);
		this.add(label);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == item_stud_add) {
			removeAll();
			add(luru, "Center");
			validate();
		}
		if (e.getSource() == item_stud_search) {
			removeAll();
			add(chaxun, "Center");
			validate();
		}
		if (e.getSource() == item_stud_update) {
			removeAll();
			add(xiugai, "Center");
			validate();
		}
		if (e.getSource() == item_stud_delete) {
			removeAll();
			add(shanchu, "Center");
			validate();
		}
		if (e.getSource() == item_exit) {
			JFrame f4 = new JFrame();
			exit exit1 = new exit(f4);
			exit1.setBounds(500, 240, 300, 120);
			exit1.setVisible(true);
		}
	}
}
public class Employee {
	public static void main(String[] args) {
		String url = "jdbc:odbc:Employee";
		String sql = "create table stud "
				+ "(Ա���� String(20), ���� String(20), �Ա� String(6), ְ��String(20),���� String(20),�ϰ�� String(20),�°�� String(20),ȱ�� String(20),���ʼ String(20),������� String(20),�������� String(20),��ٿ�ʼ String(20),��ٽ��� String(20),������� String(20),�Ӱ࿪ʼString(20),�Ӱ����String(20),�Ӱ�ʱ�� String(20))";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("successfull");
		} catch (java.lang.ClassNotFoundException e) {
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee","root","123456");
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("stud table created ");
			stmt.close();
			con.close();
		} catch (SQLException exe) {
		}
		Frame fra = new fram();
		fra.setBounds(300, 80, 500, 400);
		fra.setVisible(true);
		/* �����¼����� */
		fra.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}