package es.studium.PatronMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Controlador extends WindowAdapter implements ActionListener {

	Vista objVista = null;
	Modelo objModelo = null;

	public Controlador(Vista objVista, Modelo objModelo) {

		this.objVista = objVista;
		this.objModelo = objModelo;

		// Llamamos a los escuchadores de los objetos de la clase Vista

		objVista.frmEmpresa.addWindowListener(this);
		objVista.dlgNuevo.addWindowListener(this);
		objVista.dlgModificar.addWindowListener(this);
		objVista.dlgSelectMod.addWindowListener(this);
		objVista.dlgSeguro.addWindowListener(this);
		objVista.dlgEliminar.addWindowListener(this);
		objVista.dlgConsultar.addWindowListener(this);

		objVista.mniNuevo.addActionListener(this);
		objVista.mniConsultar.addActionListener(this);
		objVista.mniEliminar.addActionListener(this);
		objVista.mniModificar.addActionListener(this);

		// A�adimos los objetos bot�n

		objVista.btnCrear.addActionListener(this);
		objVista.btnConsultar.addActionListener(this);
		objVista.btnEliminar.addActionListener(this);
		objVista.btnModificar.addActionListener(this);
		objVista.btnCancelarNuevo.addActionListener(this);
		objVista.btnCancelarModificar.addActionListener(this);
		objVista.btnLimpiarEliminar.addActionListener(this);
		objVista.btnImprimirConsultar.addActionListener(this);
		objVista.btnLimpiar.addActionListener(this);
		objVista.btnEditar.addActionListener(this);
		objVista.btnSi.addActionListener(this);
		objVista.btnNo.addActionListener(this);
		// A�adimos los objetos

	}

	public void windowClosing(WindowEvent e) {

		if (objVista.dlgNuevo.isActive()) {

			objVista.dlgNuevo.setVisible(false);

		} else if (objVista.dlgModificar.isActive()) {

			objVista.dlgModificar.setVisible(false);

		} else if (objVista.dlgEliminar.isActive()) {

			objVista.dlgEliminar.setVisible(false);

		} else if (objVista.dlgConsultar.isActive()) {

			objVista.dlgConsultar.setVisible(false);

		} else if (objVista.dlgSelectMod.isActive()) {

			objVista.dlgSelectMod.setVisible(false);

		} else if (objVista.dlgSeguro.isActive()) {

			objVista.dlgSeguro.setVisible(false);

		} else {

			System.exit(0);

		}

	}

	public void actionPerformed(ActionEvent event) {

		if (objVista.mniNuevo.equals(event.getSource())) {

			objVista.dlgNuevo.setVisible(true);

		} else if (objVista.btnCrear.equals(event.getSource())) {

			int respuesta = objModelo.insertar(objModelo.GestorConexion(), "empleados",
					objVista.txtExtensionNuevo.getText(), objVista.txtFechaNacNuevo.getText(),
					objVista.txtFechaIngNuevo.getText(), objVista.txtSalarioNuevo.getText(),
					objVista.txtComisionNuevo.getText(), objVista.txtHijosNuevo.getText(),
					objVista.txtNombreNuevo.getText());

			// Mostrar el resultado
			if ((respuesta == 0)) {
				System.out.println("ALTA de habitaci�n correcta");
			} else {
				System.out.println("Error en ALTA de habitaci�n");
			}

		} else if (objVista.btnCancelarNuevo.equals(event.getSource())) {

			objVista.dlgNuevo.setVisible(false);

		} else if (objVista.mniModificar.equals(event.getSource())) {

			objVista.listaEmpleadosModificar = objModelo.SelectEmpleado(objModelo.GestorConexion(),
					objVista.listaEmpleadosModificar);
			
			objModelo.CerrarConexion();
			
			objVista.dlgSelectMod.setVisible(true);
			
			

		} else if (objVista.btnEditar.equals(event.getSource())) {

			int id = Integer.parseInt(objVista.listaEmpleadosModificar.getSelectedItem().split("-")[0]);

			objModelo.mostrarDatos(objModelo.GestorConexion(), id, objVista.txtEmpleadoModificar,
					objVista.txtExtensionModificar, objVista.txtFechaNacModificar, objVista.txtFechaIngModificar,
					objVista.txtSalarioModificar, objVista.txtComisionModificar, objVista.txtHijosModificar,
					objVista.txtNombreModificar);
			
			objModelo.CerrarConexion();

			objVista.dlgModificar.setVisible(true);
			
			
		} else if (objVista.btnLimpiar.equals(event.getSource())) {

			objVista.listaEmpleadosModificar.select(0);

		} else if (objVista.btnModificar.equals(event.getSource())) {

			objVista.dlgModificar.setVisible(false);
			
			objVista.dlgSeguro.setVisible(true);

		} else if (objVista.btnCancelarModificar.equals(event.getSource())) {

			objVista.dlgModificar.setVisible(false);

		} else if (objVista.btnSi.equals(event.getSource())) {

			objModelo.modificarEmpleado(objModelo.GestorConexion(), objVista.txtEmpleadoModificar, objVista.txtExtensionModificar, objVista.txtFechaNacModificar, objVista.txtFechaIngModificar, objVista.txtSalarioModificar, objVista.txtComisionModificar, objVista.txtHijosModificar, objVista.txtNombreModificar);

			objVista.dlgModificar.setVisible(false);
			
			objVista.dlgSeguro.setVisible(false);
			
			objModelo.CerrarConexion();
			
			objVista.dlgSelectMod.setVisible(true);			
			
			
		} else if (objVista.btnNo.equals(event.getSource())) {

			objVista.dlgSeguro.setVisible(false);

		} else if (objVista.btnConsultar.equals(event.getSource())) {

			objVista.dlgConsultar.setVisible(false);

		} else if (objVista.mniConsultar.equals(event.getSource())) {

			objModelo.ConsultaEmpleados(objModelo.GestorConexion(), objVista.txtAreaConsultar);

			objModelo.CerrarConexion();

			objVista.dlgConsultar.setVisible(true);

		} else if (objVista.mniEliminar.equals(event.getSource())) {

			objVista.listaEmpleadoEliminar = objModelo.SelectEmpleado(objModelo.GestorConexion(),
					objVista.listaEmpleadoEliminar);

			objModelo.CerrarConexion();
			
			objVista.dlgEliminar.setVisible(true);

		} else if (objVista.btnEliminar.equals(event.getSource())) {

			// Hacemos un split para aislar el dato idEmpleado
			String[] empleado = objVista.listaEmpleadoEliminar.getSelectedItem().split("-");

			// Guardamos el resultado que nos devuelve el m�todo BorrarEmpleado en la
			// cvariable respuesta
			int respuesta = objModelo.BorrarEmpleado(objModelo.GestorConexion(), Integer.parseInt(empleado[0]));

			// Mostramos resultado
			if (respuesta == 0) {
				System.out.println("Borrado de empleado correcto");

			} else {
				System.out.println("Error en Borrado de empleado");
			}
			
			objModelo.CerrarConexion();

		} else if (objVista.btnLimpiarEliminar.equals(event.getSource())) {

			objVista.listaEmpleadoEliminar.select(0);

		} else if (objVista.btnModificar.equals(event.getSource())) {

			// Hacemos un split para aislar el dato idEmpleado
			String[] empleado = objVista.listaEmpleadosModificar.getSelectedItem().split("-");

			// Guardamos el resultado que nos devuelve el m�todo BorrarEmpleado en la
			// cvariable respuesta
			int respuesta = objModelo.BorrarEmpleado(objModelo.GestorConexion(), Integer.parseInt(empleado[0]));

			// Mostramos resultado
			if (respuesta == 0) {
				System.out.println("Borrado de empleado correcto");

			} else {
				System.out.println("Error en Borrado de empleado");
			}
			
			objModelo.CerrarConexion();

		}

	}
}
