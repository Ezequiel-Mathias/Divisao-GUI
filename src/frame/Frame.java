package frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

public class Frame {
		
	public void telajframe() {
	JFrame telajframe = new JFrame (); 
	telajframe.setSize(600, 600);
	telajframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	telajframe.setTitle(" Divisão e resto ");
	telajframe.setLayout(null);
	
	// componentes da tela
	
	JLabel titulo = new JLabel();
	titulo.setText(" Divisão ");
	telajframe.getContentPane().add(titulo);
	titulo.setBounds(10, 20, 150, 30);
	titulo.setForeground(Color.blue);
	titulo.setFont(new FontUIResource(" Tabuada", 1 , 20));
	titulo.setBounds(20, 10, 150, 30);
	
	
	JLabel numerador = new JLabel();
	numerador.setText("Numerador: ");
	telajframe.getContentPane().add(numerador);
	numerador.setBounds(75, 60, 150, 30);
	
	
	JLabel denominador = new JLabel();
	denominador.setText("Denominador : ");
	telajframe.getContentPane().add(denominador);
	denominador.setBounds(75, 100, 150, 30);
	
	
	JLabel resultado = new JLabel();
	resultado.setText("Resultado : ");
	telajframe.getContentPane().add(resultado);
	resultado.setBounds(300, 50, 150, 30);
	
	
	JTextField caixadetextodonumerador =  new JTextField();
	caixadetextodonumerador.setText("");
	telajframe.getContentPane().add(caixadetextodonumerador);
	caixadetextodonumerador.setBounds(165, 60, 80, 30);
	
	
	JTextField caixadetextododenominador =  new JTextField();
	caixadetextododenominador.setText("");
	telajframe.getContentPane().add(caixadetextododenominador);
	caixadetextododenominador.setBounds(165, 100, 80, 30);
	
	
	JButton btnAdd = new JButton();
	btnAdd.setText("Calcular");
	telajframe.getContentPane().add(btnAdd);
	btnAdd.setBounds(100, 200, 150, 40);
	
	
	JButton bntDel = new JButton();
	bntDel.setText("Limpar");
	telajframe.getContentPane().add(bntDel);
	bntDel.setBounds(100, 250, 150, 40);
	
	
	JScrollPane scroll = new JScrollPane();
	scroll.setBounds(340, 90, 100, 30);
	telajframe.getContentPane().add(scroll);
	
	DefaultListModel cidadeModel = new DefaultListModel();
	
	
	
	JList cidadelist = new JList();
	scroll.getViewport().add(cidadelist);
	cidadelist.setModel(cidadeModel);
	scroll.getViewport().add(cidadelist);

	
	telajframe.setVisible(true);

	btnAdd.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			int numerador = Integer.parseInt(caixadetextodonumerador.getText());
			int denominador = Integer.parseInt(caixadetextododenominador.getText());
			int div = numerador / denominador;
			cidadeModel.addElement((div));
			
			
		}
	});

	bntDel.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			int i = cidadelist.getSelectedIndex();
			System.out.println(i);
			cidadeModel.removeRange(0, 0);
			caixadetextododenominador.setText("");
			caixadetextododenominador.setText("");
			caixadetextododenominador.requestFocus();
			caixadetextodonumerador.setText("");
			caixadetextodonumerador.setText("");
			caixadetextodonumerador.requestFocus();
			

		}
	});

	
	}
	
}
