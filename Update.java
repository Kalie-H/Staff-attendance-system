package ke;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

class Update extends Panel implements ActionListener {
	Connection con;
	Statement sql;
	JButton b1, b2, b3;
	Box box,  box0, box1, box2, box4, box5, box6, box7,box8,box9,box10,box11,box12,box13,box14,box15,box16,box17,box18,box19;
	JTextField num, name, sex,  year, professional,shangbandaka,xiabandaka,queqin,chuchai1,chuchai2,count1,qingjia1,qingjia2,count2,jiaban1,jiaban2,shijian;;
	Update() {
		setLayout(new BorderLayout());
		Font font = new Font("��������", Font.BOLD, 10);
		UIManager.put("Label.font", font);
		b1 = new JButton("��ʼ�޸�");
		b1.setFont(new Font("�����п�", Font.BOLD, 10));
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b2 = new JButton("¼���޸�");
		b2.setFont(new Font("�����п�", Font.BOLD, 10));
		b2.setBackground(Color.white);
		b2.setForeground(Color.black);
		b3 = new JButton("����");
		b3.setFont(new Font("�����п�", Font.BOLD, 10));
		b3.setForeground(Color.black);
		b3.setBackground(Color.white);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		num = new JTextField(26);
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
		Panel pNorth = new Panel();
		JLabel jl = new JLabel("  �޸�Ա��������Ϣ  ");
		jl.setForeground(Color.red);
		jl.setFont(new Font("�����п�", Font.BOLD, 10));
		pNorth.add(jl);
		add(pNorth, "North");
		box0 = Box.createHorizontalBox();
		box0.add(new JLabel("����Ҫ�޸���Ϣ��Ա����:"));
		box0.add(Box.createHorizontalStrut(8));
		box0.add(num);
		box0.add(Box.createHorizontalStrut(8));
		box0.add(b1);
		box1 = Box.createHorizontalBox();
		box1.add(new JLabel("(��)����:"));
		box1.add(Box.createHorizontalStrut(8));
		box1.add(name);
		box2 = Box.createHorizontalBox();
		box2.add(new JLabel("(��)�Ա�:"));
		box2.add(Box.createHorizontalStrut(8));
		box2.add(sex);
		box4 = Box.createHorizontalBox();
		box4.add(new JLabel("(��)ְ��:"));
		box4.add(Box.createHorizontalStrut(8));
		box4.add(professional);
		box5 = Box.createHorizontalBox();
		box5.add(new JLabel("(��)����:"));
		box5.add(Box.createHorizontalStrut(8));
		box5.add(year);
		box6 = Box.createHorizontalBox();
		box6.add(new JLabel("(��)�ϰ��:"));
		box6.add(Box.createHorizontalStrut(8));
		box6.add(shangbandaka);
		box7 = Box.createHorizontalBox();
		box7.add(new JLabel("(��)�°��:"));
		box7.add(Box.createHorizontalStrut(8));
		box7.add(xiabandaka);
		box8 = Box.createHorizontalBox();
		box8.add(new JLabel("(��)ȱ��:"));
		box8.add(Box.createHorizontalStrut(8));
		box8.add(queqin);
		box9 = Box.createHorizontalBox();
		box9.add(new JLabel("(��)���ʼ:"));
		box9.add(Box.createHorizontalStrut(8));
		box9.add(chuchai1);
		box10 = Box.createHorizontalBox();
		box10.add(new JLabel("(��)�������:"));
		box10.add(Box.createHorizontalStrut(8));
		box10.add(chuchai2);
		box11 = Box.createHorizontalBox();
		box11.add(new JLabel("(��)��������:"));
		box11.add(Box.createHorizontalStrut(8));
		box11.add(count1);
		box12 = Box.createHorizontalBox();
		box12.add(new JLabel("(��)��ٿ�ʼ:"));
		box12.add(Box.createHorizontalStrut(8));
		box12.add(qingjia1);
		box13 = Box.createHorizontalBox();
		box13.add(new JLabel("(��)��ٽ���:"));
		box13.add(Box.createHorizontalStrut(8));
		box13.add(qingjia2);
		box14 = Box.createHorizontalBox();
		box14.add(new JLabel("(��)�������:"));
		box14.add(Box.createHorizontalStrut(8));
		box14.add(count2);
		box15 = Box.createHorizontalBox();
		box15.add(new JLabel("(��)�Ӱ࿪ʼ:"));
		box15.add(Box.createHorizontalStrut(8));
		box15.add(jiaban1);
		box16 = Box.createHorizontalBox();
		box16.add(new JLabel("(��)�Ӱ����:"));
		box16.add(Box.createHorizontalStrut(8));
		box16.add(jiaban2);
		box17 = Box.createHorizontalBox();
		box17.add(new JLabel("(��)�Ӱ�ʱ��:"));
		box17.add(Box.createHorizontalStrut(8));
		box17.add(shijian);
		box18 = Box.createHorizontalBox();
		box18.add(b2);
		box18.add(Box.createHorizontalStrut(8));
		box18.add(b3);
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
		setBackground(Color.orange);
	}
	public void actionPerformed(ActionEvent e) {
		String num1, name1, sex1, year1, professional1, shangbandaka1,xiabandaka1,queqin1,chuchai3,chuchai4,count3,qingjia3,qingjia4,count4,jiaban3,jiaban4,shijian1;;
		int flag = 0;
		if (e.getSource() == b1) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException ce) {
				System.out.println("SQLException:" + ce.getMessage());
			}
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee", "root", "123456");
				sql = con.createStatement();
				ResultSet rs = sql.executeQuery("select * from stud ");
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
						year.setText(year1);
						professional.setText(professional1);
						shangbandaka.setText(shangbandaka1);
						xiabandaka.setText(xiabandaka1 );
						queqin.setText(queqin1);
						chuchai1.setText(chuchai3);
						chuchai2.setText(chuchai4);
						count1.setText(count3);
						qingjia1.setText(qingjia3);
						qingjia2.setText(qingjia4);
						count2.setText(count3);
						jiaban1.setText(jiaban3);
						jiaban2.setText(jiaban4);
						shijian.setText(shijian1);
						flag = 1;
						break;
					}
				}
				sql.close();
				rs.close();
				con.close();
			} catch (SQLException ee) {
			}
			if (flag == 0) {
				JOptionPane.showMessageDialog(null, "û�и�Ա�������Ϣ!��				�������룡","Ա������ϵͳ", JOptionPane.ERROR_MESSAGE);
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
		if (e.getSource() == b2) {
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
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException ee) {
			}
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Employee", "root", "123456");
				sql = con.createStatement();
				String temp = "update stud set ����=" + name1 + ","
						+ "�Ա�=" + sex1 + "," + "ְ��=" + professional1 + ","
						+ "����=" + year1 + "," + "�ϰ��=" + shangbandaka1+ ","+"�°��=" + xiabandaka1+","+
						"ȱ��=" + queqin1+"," +"���ʼ=" + chuchai3+"," +"�������=" +chuchai4 +","
						+"��������=" + count3 +","+"��ٿ�ʼ=" + qingjia3 +","+"��ٽ���=" + qingjia4  +","
						+"�������=" + count4 +","+"�Ӱ࿪ʼ=" + jiaban3+"," +"�Ӱ����=" + jiaban4+ ","+"�Ӱ�ʱ��=" + shijian1 +
						" where Ա����=        "  +num1 ;
				System.out.println(temp);
				sql.executeUpdate(temp);
				sql.close();
				con.close();
				JOptionPane.showMessageDialog(this, "�޸ĳɹ�!", "Ա������ϵͳ", JOptionPane.INFORMATION_MESSAGE);
			} catch (SQLException ex) {
				System.out.println(ex);
			}
		}
		if (e.getSource() == b3) {
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
