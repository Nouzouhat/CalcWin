import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalcWin extends JFrame implements ActionListener {
	private JButton btAc = new JButton("AC");
	private JButton btPM = new JButton("+/-");
	private JButton btPC = new JButton("%");
	private JButton btSous = new JButton("-");
	private JButton btDiv = new JButton("/");
	private JButton btMult= new JButton("*");
	private JButton btAdd = new JButton("+");
	private JButton btEgal = new JButton("=");
	private JButton btPoint = new JButton(".");
	private JButton bt0 = new JButton("0");
	private JButton bt1= new JButton("1");
	private JButton bt2 = new JButton("2");
	private JButton bt3 = new JButton("3");
	private JButton bt4 = new JButton("4");
	private JButton bt5 = new JButton("5");
	private JButton bt6 = new JButton("6");
	private JButton bt7 = new JButton("7");
	private JButton bt8= new JButton("8");
	private JButton bt9 = new JButton("9");
	
	private JTextField txtNombre = new JTextField();
	
	private float nb1, nb2, result;
	private char operateur;
	
	public CalcWin () {
		this.setTitle("Ma Calc 2024");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(200, 200, 250, 390);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(100, 78,156));
        
        
        this.btAc.setBounds(20, 70, 50, 50);
        this.add(this.btAc);
        this.btPM.setBounds(70, 70, 50, 50);
        this.add(this.btPM);
        this.btPC.setBounds(120, 70, 50, 50);
        this.add(this.btPC);
        this.btDiv.setBounds(170, 70, 50, 50);
        this.add(this.btDiv);
        
        this.bt7.setBounds(20, 120, 50, 50);
        this.add(this.bt7);
        this.bt8.setBounds(70, 120, 50, 50);
        this.add(this.bt8);
        this.bt9.setBounds(120, 120, 50, 50);
        this.add(this.bt9);
        this.btMult.setBounds(170, 120, 50, 50);
        this.add(this.btMult);
        
        this.bt4.setBounds(20, 170, 50, 50);
        this.add(this.bt4);
        this.bt5.setBounds(70, 170, 50, 50);
        this.add(this.bt5);
        this.bt6.setBounds(120, 170, 50, 50);
        this.add(this.bt6);
        this.btSous.setBounds(170, 170, 50, 50);
        this.add(this.btSous);
        
        
        this.bt1.setBounds(20, 220, 50, 50);
        this.add(this.bt1);
        this.bt2.setBounds(70, 220, 50, 50);
        this.add(this.bt2);
        this.bt3.setBounds(120, 220, 50, 50);
        this.add(this.bt3);
        this.btAdd.setBounds(170, 220, 50, 50);
        this.add(this.btAdd);
        
        
        this.bt0.setBounds(20, 270, 100, 50);
        this.add(this.bt0);
        this.btPoint.setBounds(120, 270, 50, 50);
        this.add(this.btPoint);
        this.btEgal.setBounds(170, 270, 50, 50);
        this.add(this.btEgal);
        
      //rendre les boutons ecoutables
      		this.bt0.addActionListener(this);
      		this.bt1.addActionListener(this);
      		this.bt2.addActionListener(this);
      		this.bt3.addActionListener(this);
      		this.bt4.addActionListener(this);
      		this.bt5.addActionListener(this);
      		this.bt6.addActionListener(this);
      		this.bt7.addActionListener(this);
      		this.bt8.addActionListener(this);
      		this.bt9.addActionListener(this);
      		this.btAdd.addActionListener(this);
      		this.btSous.addActionListener(this);
      		this.btMult.addActionListener(this);
      		this.btDiv.addActionListener(this);
      		this.btPC.addActionListener(this);
      		this.btPM.addActionListener(this);
      		this.btAc.addActionListener(this);
      		this.btPoint.addActionListener(this);
      		this.btEgal.addActionListener(this);

      		this.txtNombre.setBounds(20, 20, 200, 30);
      		this.add(this.txtNombre);
        
        this.setVisible(true);
	}

	public static void main(String[] args) {
		CalcWin maCalc = new CalcWin();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.bt0) {
			this.txtNombre.setText(this.txtNombre.getText()+"0");
		}
		else if (e.getSource() == this.bt1) {
			this.txtNombre.setText(this.txtNombre.getText()+"1");
		}
		
		else if (e.getSource() == this.bt2) {
			this.txtNombre.setText(this.txtNombre.getText()+"2");
		}
		
		else if (e.getSource() == this.bt3) {
			this.txtNombre.setText(this.txtNombre.getText()+"3");
		}
		
		else if (e.getSource() == this.bt4) {
			this.txtNombre.setText(this.txtNombre.getText()+"4");
		}
		
		else if (e.getSource() == this.bt5) {
			this.txtNombre.setText(this.txtNombre.getText()+"5");
		}
		
		else if (e.getSource() == this.bt6) {
			this.txtNombre.setText(this.txtNombre.getText()+"6");
		}
		
		else if (e.getSource() == this.bt7) {
			this.txtNombre.setText(this.txtNombre.getText()+"7");
		}
		
		else if (e.getSource() == this.bt8) {
			this.txtNombre.setText(this.txtNombre.getText()+"8");
		}
		
		else if (e.getSource() == this.bt9) {
			this.txtNombre.setText(this.txtNombre.getText()+"9");
		}

		else if (e.getSource() == this.btAc) {
			this.txtNombre.setText("");
		}
		
		else if (e.getSource() == this.btPM) {
			if(this.txtNombre.getText().contains("-")) {
				this.txtNombre.setText(this.txtNombre.getText().substring(1));
			} else {
				this.txtNombre.setText("-"+this.txtNombre.getText());
			}
		}
		
		else if (e.getSource() == this.btPoint) {
		    if (!this.txtNombre.getText().contains(".")) {
		        this.txtNombre.setText(this.txtNombre.getText() + ".");
		    }
		} 
		
		else if (e.getSource() == this.btDiv) {
			this.nb1 = Float.parseFloat(this.txtNombre.getText());
            this.operateur = '/';
            this.txtNombre.setText("");
		        
		    } else if (e.getSource() == this.btMult) {
		    	this.nb1 = Float.parseFloat(this.txtNombre.getText());
	            this.operateur = '*';
	            this.txtNombre.setText("");
		    }
		    else if (e.getSource() == this.btAdd) {
		    	this.nb1 = Float.parseFloat(this.txtNombre.getText());
	            this.operateur = '+';
	            this.txtNombre.setText("");
		    }  
			
		    else if (e.getSource() == this.btSous) {
		    	this.nb1 = Float.parseFloat(this.txtNombre.getText());
	            this.operateur = '-';
	            this.txtNombre.setText("");
		    }  
		
		
		    else if (e.getSource() == this.btEgal) {
		    	this.nb2 = Float.parseFloat(this.txtNombre.getText());
		    	 switch (operateur) {
		            case '+':
		                this.result = this.nb1 + this.nb2;
		                break;
		            case '-':
		                this.result = this.nb1 - this.nb2;
		                break;
		            case '*':
		                this.result = this.nb1 * this.nb2;
		                break;
		            case '/':
		                if (this.nb2 != 0) {
		                    this.result = this.nb1 / this.nb2;
		                } else {
		                	this.result = 0;
		                }
		    	 }
		    	this.txtNombre.setText(this.result + "");
		}
		    else if (e.getSource()== this.btPC) {
		    	this.nb1 = Float.parseFloat(this.txtNombre.getText());
	            this.result = this.nb1 * (float)0.10;
	            this.txtNombre.setText(this.result + "");
		    }
	}
}
