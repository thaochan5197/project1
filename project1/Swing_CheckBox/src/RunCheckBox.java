import javax.swing.*;

public class RunCheckBox {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				MyCheckBox giaodien = new MyCheckBox();
				giaodien.setSize(300,150);
				giaodien.setVisible(true);
				giaodien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
	}

}
