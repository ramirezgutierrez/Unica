package controlador;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class OPanelFondo extends JPanel {
	
	
	public Image imagen;
	public java.net.URL fondo;
	
	public OPanelFondo() {
		
		fondo=this.getClass().getResource("/imagenes/harina.png");
		
		imagen=new ImageIcon(fondo).getImage();
		
	}
	
	public void paint(Graphics g) {
		
		
		g.drawImage(imagen,0,0,getWidth(), getHeight(),null);
		
		setOpaque(false);
		super.paint(g);
		
	}
	

}
