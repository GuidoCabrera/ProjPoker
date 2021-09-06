import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class Boton implements ActionListener {
	private static ArrayList<JButton> btns= new ArrayList<JButton>();

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("es el boton: "+arg0.getActionCommand());
		buscarboton(arg0.getActionCommand());
		
	}
	
	public Boton() {
		
	}
	
	public Boton(String text) {
		
	}

	public static ArrayList<JButton> getBtns() {
		return btns;
	}

	public static void setBtns(ArrayList<JButton> btns) {
		Boton.btns = btns;
	}
	
	public void buscarboton(String boton) {
		for(int i=0;i<btns.size();i++) {
			
			if(btns.get(i).getBackground()==Color.CYAN && boton==btns.get(i).getText()) {
				btns.get(i).setBackground(Color.WHITE);
			}
			
			else if(boton==btns.get(i).getText()) {
				btns.get(i).setBackground(Color.CYAN);
				
			}
			 
			
		}
	}
	
	public void MostrarArray() {
		for(int i=0;i<btns.size();i++) {
			System.out.println(btns.get(i).getText());
		}
	}
	
	

}
