import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

public class poker extends JFrame {

	private JPanel contentPane;
	private static ArrayList<JButton>btns = new ArrayList<JButton>();
	


	
	public poker() {
		
		String[] nom= {"AA","AKs","AQs","AJs","ATs","A9s","A8s","A7s","A6s","A5s","A4s","A3s","A2s","AKo","KK","KQs","KJs","KTs","K9s","K8s","K7s","K6s","K5s","K4s","K3s","K2s","AQo","KQo","QQ","QJs","QTs","Q9s","Q8s","Q7s","Q6s","Q5s","Q4s","Q3s","Q2s","AJo","KJo","QJo","JJ","JTs","J9s","J8s","J7s","J6s","J5s","J4s","J3s","J2s","ATo","KTo","QTo","JTo","TT","T9s","T8s","T7s","T6s","T5s","T4s","T3s","T2s","A9o","K9o","Q9o","J9o","T9o","99","98s","97s","96s","95s","94s","93s","92s","A8o","K8o","Q8o","J8o","T8o","98o","88","87s","86s","85s","84s","83s","82s","A7o","K7o","Q7o","J7o","T7o","97o","87o","77","76s","75s","74s","73s","72s","A6o","K6o","Q6o","J6o","T6o","96o","86o","76o","66","65s","64s","63s","62s","A5o","K5o","Q5o","J5o","T5o","95o","85o","75o","65o","55","54s","53s","52s","A4o","K4o","Q4o","J4o","T4o","94o","84o","74o","64o","54o","44","43s","42s","A3o","K3o","Q3o","J3o","T3o","93o","83o","73o","63o","53o","43o","33","32s","A2o","K2o","Q2o","J2o","T2o","92o","82o","72o","62o","52o","42o","32o","22"};
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 537, 459);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(30, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 30));
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnDesmarcarTodos = new JButton("Desmarcar todos");
		btnDesmarcarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DesmarcarTodos();
			}
		});
		
		JButton btnMarcarTodos = new JButton("Marcar todos");
		btnMarcarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MarcarTodos();
			}
		});
		
		panel.add(btnMarcarTodos);
		panel.add(btnDesmarcarTodos);
		
		JPanel panelcentral = new JPanel();
		contentPane.add(panelcentral, BorderLayout.CENTER);
		GridBagLayout gbl_panelcentral = new GridBagLayout();
		gbl_panelcentral.columnWidths = new int[]{0};
		gbl_panelcentral.rowHeights = new int[]{0};
		gbl_panelcentral.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panelcentral.rowWeights = new double[]{Double.MIN_VALUE};
		panelcentral.setLayout(gbl_panelcentral);
		
		Boton bt=new Boton();
		CreacionBoton(nom,panelcentral);
		bt.setBtns(btns);
		for(int i=0;i<nom.length;i++) {
		btns.get(i).addActionListener(new Boton());
		}
		
	}
	
	public void cambiarVisibilidad(boolean x)
	{
		setVisible(x);
	}
	
public void CreacionBoton(String[] nom,JPanel pan) {
	int gx=0,gy=0;
	for(int i=0;i<nom.length;i++) {
		btns.add(new JButton(nom[i]));
		btns.get(i).setMargin(new Insets(1,1,1,1));
		btns.get(i).setPreferredSize(new Dimension(35, 30));
		btns.get(i).setBackground(Color.WHITE);
		GridBagConstraints gbc_btns = new GridBagConstraints();
		gbc_btns.insets = new Insets(0, 0, 0, 5);	
		gbc_btns.gridx = gx;
		gbc_btns.gridy = gy; 
		gx++; 
		if(gx==13) {
			gy++;
			gx=0;
		}
		pan.add(btns.get(i),gbc_btns);
	}
		
	}

public void DesmarcarTodos() {
	for(int i=0;i<btns.size();i++) {
		btns.get(i).setBackground(Color.WHITE);
	}
}

public void MarcarTodos() {
	for(int i=0;i<btns.size();i++) {
		btns.get(i).setBackground(Color.CYAN);
	}
}

}
