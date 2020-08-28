package controlador;

import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import modelo.MAlmacen;

public class graficasAlmacen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DefaultPieDataset almacenes=new DefaultPieDataset();
		
		boolean bandera= false;

		//repaint(); 
		MAlmacen m=new MAlmacen();
		double capacidad=m.getCapacidad(1);
		
		List<OLote> lotesAlmacen=new ArrayList<OLote>();
		List<OLote> lotesAlmacenM=new ArrayList<OLote>();
		
		lotesAlmacen=m.getSumLotesPorAlmacenComprados(2);
		lotesAlmacenM=m.getSumLotesPorAlmacenCreados(2);
		double disp=0;
		
		for(int i=0;i<lotesAlmacen.size();i++) {
			almacenes.setValue(""+lotesAlmacen.get(i).getLoteH(), lotesAlmacen.get(i).getKg());
			System.out.println("los lotes son: "+lotesAlmacen.get(i).getLoteH()+" y los kg acumulados son: "+lotesAlmacen.get(i).getKg());
			disp=disp+lotesAlmacen.get(i).getKg();
			
		}
		for(int i=0;i<lotesAlmacenM.size();i++) {
			almacenes.setValue(""+lotesAlmacenM.get(i).getLoteH(), lotesAlmacenM.get(i).getKg());
			System.out.println("los lotes son: "+lotesAlmacenM.get(i).getLoteH()+" y los kg acumulados son: "+lotesAlmacenM.get(i).getKg());
			disp=disp+lotesAlmacenM.get(i).getKg();
			
		}
		double disptotal= capacidad-disp;
		almacenes.setValue("Espacio disponible:", disptotal);

		
		JFreeChart cha=ChartFactory.createPieChart3D("Almacen: "+lotesAlmacen.get(1).getAlmacen(), almacenes,true,true,true);
		
		ChartPanel oPanell=new ChartPanel(cha);
		
		
	}

}
