package es.studium.PatronMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Controlador implements ActionListener {

	Vista objVista = null;
	Modelo objModelo = null;

	public Controlador(Vista objVista, Modelo objModelo) {

		this.objVista = objVista;
		this.objModelo = objModelo;

		// Llamamos a los escuchadores de los objetos de la clase Vista

		objVista.frmEmpresa.addWindowListener(objVista);
		objVista.dlgNuevo.addWindowListener(objVista);
		objVista.dlgModificar.addWindowListener(objVista);
		objVista.dlgEliminar.addWindowListener(objVista);
		objVista.dlgConsultar.addWindowListener(objVista);

		objVista.mniNuevo.addActionListener(this);
		objVista.mniConsultar.addActionListener(this);
		objVista.mniEliminar.addActionListener(null);
		objVista.mniModificar.addActionListener(this);

		// Añadimos los objetos botón

		objVista.btnCrear.addActionListener(this);
		objVista.btnConsultar.addActionListener(this);
		objVista.btnEliminar.addActionListener(this);
		objVista.btnModificar.addActionListener(this);

		// Botones cancelar
		objVista.btnCancelarNuevo.addActionListener(this);
		objVista.btnCancelarModificar.addActionListener(this);
		objVista.btnCancelarEliminar.addActionListener(this);
		objVista.btnCancelarConsultar.addActionListener(this);

		// Añadimos los objetos

	}

	public void windowClosing(WindowEvent e) {

		if (objVista.dlgNuevo.isActive()) {

			objVista.dlgNuevo.setVisible(false);

		}else if (objVista.dlgModificar.isActive()) {
			
			objVista.dlgModificar.setVisible(false);
			
		}else if (objVista.dlgEliminar.isActive()) {
			
			objVista.dlgEliminar.setVisible(false);
			
		}else if (objVista.dlgConsultar.isActive()) {
			
			objVista.dlgConsultar.setVisible(false);
			
		}else {
			objVista.frmEmpresa.setVisible(false);
			
		}
		// if (objVista.dlgNuevo.hasFocus()) {
		//
		// objVista.dlgNuevo.setVisible(false);
		//
		// }else {
		// System.exit(0);
		//
		// }

	}

	public void actionPerformed(ActionEvent event) {

		if (objVista.mniNuevo.equals(event.getSource())) {

			objVista.dlgNuevo.setVisible(true);

		} else if (objVista.mniModificar.equals(event.getSource())) {

			objVista.dlgModificar.setVisible(true);

		} else if (objVista.mniConsultar.equals(event.getSource())) {

			objVista.dlgConsultar.setVisible(true);

		} else if (objVista.mniEliminar.equals(event.getSource())) {

			objVista.dlgEliminar.setVisible(true);

		}

	}

}
