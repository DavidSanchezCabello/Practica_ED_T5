package es.studium.PatronMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


public class Controlador implements ActionListener  {
	
	Vista objVista = null;
	Modelo objModelo = null;
	
	public Controlador (Vista objVista, Modelo objModelo) {
		
		this.objVista = objVista;
		this.objModelo = objModelo;
		
		//Llamamos a los escuchadores de los objetos de la clase Vista
		
		objVista.frmEmpresa.addWindowListener(objVista);
		
		objVista.mniNuevo.addActionListener(this);
		objVista.mniConsultar.addActionListener(this);
		objVista.mniEliminar.addActionListener(null);
		objVista.mniModificar.addActionListener(this);
		
		//Añadimos los objetos botón
		
		
		objVista.btnCrear.addActionListener(this);
		objVista.btnConsultar.addActionListener(this);
		objVista.btnEliminar.addActionListener(this);
		objVista.btnModificar.addActionListener(this);
		objVista.btnCancelar.addActionListener(this);
		
		//Añadimos los objetos
		
		
		
		
		
		
		
	}
	
	
	
	public void windowClosing(WindowEvent e)
	{
		
		
	}

	
	public void actionPerformed(ActionEvent event) {
		
		if (objVista.mniNuevo.equals(event) ) {
			
			
			
			
			
		}
		
	}



	
}
