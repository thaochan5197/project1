import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class MyCheckBox extends JFrame implements ItemListener {
	
	JCheckBox cb1,cb2,cb3;
	JPanel pn;
	JButton bt_kiemtra;
	String kiemtracheckbox;
	public MyCheckBox() {
		super("Ví dụ: CheckBox");
		
		cb1 = new JCheckBox("Android");
		cb2 = new JCheckBox("IOS");
		cb3 = new JCheckBox("Window phone");
		pn = new JPanel();
		bt_kiemtra = new JButton("Kiểm tra");
		
		pn.setLayout(new FlowLayout());
		
		pn.add(cb1);
		pn.add(cb2);
		pn.add(cb3);
		pn.add(bt_kiemtra);
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		
		bt_kiemtra.addActionListener(new ActionListener() {
			
			//xử lý sự kiện click button
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Đây là hệ điều hành: " + kiemtracheckbox );
				 
			}
		});
		
		
		Container con = getContentPane();
		con.add(pn);
		
	}

	//Xử lý sự kiện checkbox
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getItemSelectable() == cb1) {
			kiemtracheckbox += cb1.getText() + "\n";
		}
		if(e.getItemSelectable() == cb2) {
			kiemtracheckbox += cb2.getText() + "\n";
		}
		if(e.getItemSelectable() == cb3) {
			kiemtracheckbox += cb3.getText() + "\n";
		}
		
		
		
				
			
	}
	

}
