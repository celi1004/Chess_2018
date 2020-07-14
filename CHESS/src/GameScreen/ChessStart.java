package GameScreen;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Chess_1vs1.Game;
import Chess_2vs2.Game2;

public class ChessStart extends JFrame{

	ChessStart(){
      setTitle("Chess game");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      Container contentPane = getContentPane();
      contentPane.setBackground(new Color(230,230,230));
      contentPane.setLayout(null);
      
      JLabel chessword = new JLabel("CHESS", JLabel.CENTER);
      chessword.setSize(300,40);
      chessword.setLocation(150,30);
      contentPane.add(chessword);
      chessword.setFont(new Font("ÈÞ¸Õ°íµñ",Font.BOLD, 19));
      
      String[] btn = {"1 VS 1","2 VS 2", "EXIT"};
      JButton[] clickButton = new JButton[3];
      
      for(int i = 0; i<clickButton.length; i++) {
         contentPane.add(clickButton[i] = new JButton(btn[i]));
         clickButton[i].setSize(300, 60);
         clickButton[i].setLocation(150, 95*(i+1));
         clickButton[i].setBackground(new Color(255,170,170));
         clickButton[i].setFocusPainted(false);
         clickButton[i].setFont(new Font("ÈÞ¸Õ°íµñ",Font.BOLD, 17));
         clickButton[i].setForeground(new Color(255,255,255));
         clickButton[i].addActionListener(new MyActionListener());
      }
      
      Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
      setLocation((int)(screen.getWidth()/2 - 300), (int)(screen.getHeight()/2-200));
      setSize(600, 400);
      setResizable(false);
      setVisible(true);
   }
	
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if(b.getText().equals("1 VS 1")){
				new Game();
				setVisible(false);
			}
			else if(b.getText().equals("2 VS 2")) {
				new Game2();
				setVisible(false);
			}
			else if(b.getText().equals("EXIT")) {
				System.exit(0);
			}
		}

		
	}
	
	public static void main(String[] args) {
		new ChessStart();
	}
}
