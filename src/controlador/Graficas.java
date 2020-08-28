package controlador;
import org.jfree.chart.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import modelo.MAlmacen;

import java.awt.Graphics;
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
		
		for(int i=0;i<lotesAlmacen.size();i++) {
			almacenes.setValue("lote comprado: "+lotesAlmacen.get(i).getLoteH()+", "+lotesAlmacen.get(i).getKg()+" kg", lotesAlmacen.get(i).getKg());
			System.out.println("los lotes son: "+lotesAlmacen.get(i).getLoteH()+" y los kg acumulados son: "+lotesAlmacen.get(i).getKg());
			disp=disp+lotesAlmacen.get(i).getKg();
			
		}
		for(int i=0;i<lotesAlmacenM.size();i++) {
			almacenes.setValue("lote creado: "+lotesAlmacenM.get(i).getLoteH()+", "+lotesAlmacenM.get(i).getKg()+" kg", lotesAlmacenM.get(i).getKg());
			System.out.println("los lotes son: "+lotesAlmacenM.get(i).getLoteH()+" y los kg acumulados son: "+lotesAlmacenM.get(i).getKg());
			disp=disp+lotesAlmacenM.get(i).getKg();
			
		}
		double disptotal= capacidad-disp;
		almacenes.setValue("Espacio disponible:", disptotal);

		
		JFreeChart cha=ChartFactory.createPieChart3D("Almacen: "+lotesAlmacen.get(1).getAlmacen(), almacenes,true,true,true);
		
		ChartPanel oPanell=new ChartPanel(cha);
		
		return oPanell;
	}
	
	
}
