package controlador;
import org.jfree.chart.*;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

import modelo.MAlmacen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

import org.jfree.JCommon;



public class Graficas {
	public  Graficas() {
		
		
		
	
		
		
	}
	public ChartPanel CreaPanelTarta(int id) {
		
		DefaultPieDataset almacenes=new DefaultPieDataset();
		
		 
		MAlmacen m=new MAlmacen();
		double capacidad=m.getCapacidad(id);
		
		List<OLote> lotesAlmacen=new ArrayList<OLote>();
		List<OLote> lotesAlmacenM=new ArrayList<OLote>();
		
		lotesAlmacen=m.getSumLotesPorAlmacenComprados(id);
		lotesAlmacenM=m.getSumLotesPorAlmacenCreados(id);
		
		double disp=0;
		int contadorSeccion=0;
		
		if(lotesAlmacen.isEmpty()==false) {
		for(int i=0;i<lotesAlmacen.size();i++) {
			almacenes.setValue("lote comprado: "+lotesAlmacen.get(i).getLoteH()+", "+lotesAlmacen.get(i).getKg()+" kg", lotesAlmacen.get(i).getKg());
			disp=disp+lotesAlmacen.get(i).getKg();
			contadorSeccion++;
			
		}}
		if(lotesAlmacenM.isEmpty()==false) {
		for(int i=0;i<lotesAlmacenM.size();i++) {
			almacenes.setValue("lote creado: "+lotesAlmacenM.get(i).getLoteH()+", "+lotesAlmacenM.get(i).getKg()+" kg", lotesAlmacenM.get(i).getKg());
			disp=disp+lotesAlmacenM.get(i).getKg();
			contadorSeccion++;
		}}else {
			almacenes.setValue("Almac�n vacio: Espacio total:", m.getCapacidad(id));
		}
		double disptotal= capacidad-disp;
		
		if(lotesAlmacen.isEmpty()==false || lotesAlmacenM.isEmpty()==false) {
		almacenes.setValue("Espacio disponible:", disptotal);}
		//Rectangle leyenda=new Rectangle(0,0);
		
		JFreeChart cha=ChartFactory.createPieChart3D("Almac�n: "+id, almacenes,true,true,true);
		cha.setBackgroundPaint(Color.WHITE);
		cha.setBorderVisible(false);
		cha.getLegend().setBackgroundPaint(Color.WHITE);
		cha.getLegend().setItemFont(new Font("SimSun", Font.BOLD, 14));
		//cha.getLegend().setBounds(leyenda);
		//cha.getLegend().setHeight(100);
		//cha.getLegend().setWidth(200);
				
		cha.getPlot().setNoDataMessagePaint(Color.WHITE);
		cha.getPlot().setNoDataMessageFont(new Font("SimSun", Font.BOLD, 14));
		cha.getPlot().setBackgroundPaint(Color.WHITE);
		cha.getPlot().setOutlinePaint(Color.WHITE);
		cha.getTitle().setFont(new Font("SimSun", Font.BOLD, 20));
		
		
		
		
		PiePlot3D plot = ( PiePlot3D )cha.getPlot();
		  plot.setDepthFactor(0.3);
		  plot.setDarkerSides(false);
		  
		  Rotation rota=Rotation.CLOCKWISE; //direccion horaria
		  plot.setDirection(rota);//direccion
		  plot.setInteriorGap(0.2);//tama�o de la tarta
		  plot.setStartAngle(360);//donde empieza a girar la representacion de los datos
		  //plot.setLabelGap(0.4);
		  //plot.leg
		  

		  plot.setLabelGenerator(null); 
		  
		  plot.setLabelOutlinePaint(Color.BLACK);
		  plot.setLabelFont(new Font("SimSun", Font.BOLD, 20));
		  plot.setSectionPaint(contadorSeccion,Color.ORANGE);
		 
		  
		ChartPanel oPanell=new ChartPanel(cha);
		
		return oPanell;
	}
	
	
}
