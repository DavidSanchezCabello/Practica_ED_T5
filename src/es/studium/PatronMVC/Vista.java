package es.studium.PatronMVC;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;

public class Vista extends WindowAdapter {

	// Creamos un objeto de la clase Frame
	Frame frmEmpresa = new Frame();

	// Elementos Dialog del CRUD

	Dialog dlgNuevo = new Dialog(frmEmpresa, "¿Nueva Alta?", true);
	Dialog dlgConsultar = new Dialog(frmEmpresa, "¿Nueva Consulta?", true);
	Dialog dlgEliminar = new Dialog(frmEmpresa, "¿Nueva Baja?", true);
	Dialog dlgSelectMod = new Dialog(frmEmpresa, "Seleccione un empleado", true);
	Dialog dlgModificar = new Dialog(dlgSelectMod, "¿Nueva Modificación?", true);
	Dialog dlgSeguro = new Dialog(dlgModificar, "¿Seguro?", true);

	// Creamos los elementos que forman nuestro menú

	// Elemento/s barra menú
	MenuBar mbPrincipal = new MenuBar();
	// Elemento menú
	Menu mnEmpleados = new Menu("Empleados");
	// Elementos menú item de nuestro proyecto
	MenuItem mniNuevo = new MenuItem("Nuevo");
	MenuItem mniConsultar = new MenuItem("Consultar");
	MenuItem mniEliminar = new MenuItem("Eliminar");
	MenuItem mniModificar = new MenuItem("Modificar");

	// Creamos las etiquetas

	Label lblCrear = new Label("Empleado");
	Label lblConsultar = new Label("Empleados");
	Label lblModificar = new Label("Rellene los campos Empleado");
	Label lblBorrar = new Label("Seleccione Empleado");

	// Etiquetas Nuevo
	Label lblNombreNuevo = new Label("Nombre Empleado:");

	Label lblDepartamentoNuevo = new Label("Departamento:");
	Label lblExtensionNuevo = new Label("Extensión:");
	Label lblFechaNacNuevo = new Label("Fecha Nac.:");
	Label lblFechaIngNuevo = new Label("Fecha alta:");
	Label lblSalarioNuevo = new Label("Salario:");
	Label lblComisionNuevo = new Label("Comisión:");
	Label lblHijosNuevo = new Label("Hijos:");

	// Etiquetas Modificar

	Label lblNombreModificar = new Label("Nombre Empleado:");
	Label lblEmpleadoModificar = new Label("Nº Empleado");

	Label lblExtensionModificar = new Label("Extensión");
	Label lblFechaNacModificar = new Label("Fecha Nacimiento");
	Label lblFechaIngModificar = new Label("Fecha Alta");
	Label lblSalarioModificar = new Label("Salario");
	Label lblComisionModificar = new Label("Comisión");
	Label lblHijosModificar = new Label("Hijos");

	Label lblElegir = new Label("Elegir empleado a Editar");
	Label lblSeguro = new Label("¿Está seguro/a de editar el empleado? ");

	// Creamos los campos de texto NuevoEmpleado

	TextField txtNombreNuevo = new TextField("", 20);
	TextField txtExtensionNuevo = new TextField("", 20);
	TextField txtFechaNacNuevo = new TextField("", 20);
	TextField txtFechaIngNuevo = new TextField("", 20);
	TextField txtSalarioNuevo = new TextField("", 20);
	TextField txtComisionNuevo = new TextField("", 20);
	TextField txtHijosNuevo = new TextField("", 20);

	// Objetos Choice
	// nuevo
	Choice listaEmpleadosNuevo = new Choice();

	// eliminar
	Choice listaEmpleadoEliminar = new Choice();

	// modificar
	Choice listaEmpleadosModificar = new Choice();

	// Creamos los campos de texto NuevoEmpleado

	TextField txtNombreModificar = new TextField("", 20);
	TextField txtEmpleadoModificar = new TextField("", 20);

	TextField txtExtensionModificar = new TextField("", 20);
	TextField txtFechaNacModificar = new TextField("", 20);
	TextField txtFechaIngModificar = new TextField("", 20);
	TextField txtSalarioModificar = new TextField("", 20);
	TextField txtComisionModificar = new TextField("", 20);
	TextField txtHijosModificar = new TextField("", 20);

	TextArea txtAreaConsultar = new TextArea();

	// Creamos los objetos botón

	Button btnCrear = new Button("Aceptar");
	Button btnConsultar = new Button("Volver");
	Button btnModificar = new Button("Aceptar");
	Button btnEliminar = new Button("Aceptar");
	Button btnCancelarNuevo = new Button("Cancelar");
	Button btnLimpiarEliminar = new Button("Limpiar");
	Button btnCancelarModificar = new Button("Cancelar");
	Button btnImprimirConsultar = new Button("Imprimir");
	Button btnEditar = new Button("Modificar");
	Button btnLimpiar = new Button("Limpiar");
	Button btnAtras = new Button("Atrás");

	// botones dlgSeguro
	Button btnSi = new Button("Si");
	Button btnNo = new Button("No");

	public Vista() {

		frmEmpresa.setLayout(new FlowLayout());
		frmEmpresa.setTitle("Menú Empleados");

		frmEmpresa.setLocationRelativeTo(null);
		frmEmpresa.setSize(275, 150);
		frmEmpresa.setResizable(false);
		frmEmpresa.setVisible(true);

		mbPrincipal.add(mnEmpleados);

		mnEmpleados.add(mniNuevo);
		mnEmpleados.add(mniConsultar);
		mnEmpleados.add(mniEliminar);
		mnEmpleados.add(mniModificar);

		frmEmpresa.setMenuBar(mbPrincipal);

		// Creamos interfaz ventana NuevoEmpleado

		dlgNuevo.setLayout(new GridLayout(8, 2));
		dlgNuevo.setTitle("Crear nuevo empleado");
		dlgNuevo.setSize(300, 275);
		dlgNuevo.setLocationRelativeTo(null);
		dlgNuevo.setResizable(false);
		dlgNuevo.setVisible(false);

		dlgNuevo.add(lblNombreNuevo);
		dlgNuevo.add(txtNombreNuevo);
		dlgNuevo.add(lblFechaNacNuevo);
		dlgNuevo.add(txtFechaNacNuevo);
		dlgNuevo.add(lblFechaIngNuevo);
		dlgNuevo.add(txtFechaIngNuevo);
		dlgNuevo.add(lblSalarioNuevo);
		dlgNuevo.add(txtSalarioNuevo);
		dlgNuevo.add(lblComisionNuevo);
		dlgNuevo.add(txtComisionNuevo);
		dlgNuevo.add(lblHijosNuevo);
		dlgNuevo.add(txtHijosNuevo);
		dlgNuevo.add(lblExtensionNuevo);
		dlgNuevo.add(txtExtensionNuevo);

		dlgNuevo.add(btnCrear);
		dlgNuevo.add(btnCancelarNuevo);

		// Creamos ventana selección modificar

		dlgSelectMod.setLayout(new GridLayout(2, 1));
		dlgSelectMod.setTitle("Modificar Habitación");
		dlgSelectMod.setVisible(false);
		dlgSelectMod.setSize(450, 75);
		dlgSelectMod.setResizable(false);
		dlgSelectMod.setLocationRelativeTo(null);
		dlgSelectMod.add(lblElegir);
		dlgSelectMod.add(listaEmpleadosModificar);
		dlgSelectMod.add(btnEditar);
		dlgSelectMod.add(btnLimpiar);
		// Añadimos campos del objeto Choice
		listaEmpleadosModificar.add("Elegir una");

		// Creamos ventana ModificarEmpleado
		dlgModificar.setLayout(new GridLayout(9, 2));
		dlgModificar.setTitle("Editar empleado");
		dlgModificar.setSize(300, 275);
		dlgModificar.setLocationRelativeTo(null);
		dlgModificar.setResizable(false);
		dlgModificar.setVisible(false);
		dlgModificar.add(lblEmpleadoModificar);
		dlgModificar.add(txtEmpleadoModificar);
		dlgModificar.add(lblNombreModificar);
		dlgModificar.add(txtNombreModificar);
		dlgModificar.add(lblExtensionModificar);
		dlgModificar.add(txtExtensionModificar);
		dlgModificar.add(lblFechaNacModificar);
		dlgModificar.add(txtFechaNacModificar);
		dlgModificar.add(lblFechaIngModificar);
		dlgModificar.add(txtFechaIngModificar);
		dlgModificar.add(lblSalarioModificar);
		dlgModificar.add(txtSalarioModificar);
		dlgModificar.add(lblComisionModificar);
		dlgModificar.add(txtComisionModificar);
		dlgModificar.add(lblHijosModificar);
		dlgModificar.add(txtHijosModificar);

		// Creamos botones de modificar
		dlgModificar.add(btnModificar);
		dlgModificar.add(btnCancelarModificar);

		// Creamos la ventana ¿Seguro?

		dlgSeguro.setLayout(new FlowLayout());
		dlgSeguro.setTitle("¿Está seguro?");
		dlgSeguro.setSize(350, 95);
		dlgSeguro.setVisible(false);
		dlgSeguro.setLocationRelativeTo(null);
		dlgSeguro.setResizable(false);
		dlgSeguro.add(lblSeguro);
		dlgSeguro.add(btnSi);
		dlgSeguro.add(btnNo);

		// Creamos la ventana borrarEmpleado

		dlgEliminar.setLayout(new GridLayout(2, 1));
		dlgEliminar.setTitle("Borrar empleado");
		dlgEliminar.setSize(450, 75);
		dlgEliminar.setLocationRelativeTo(null);
		dlgEliminar.setResizable(false);
		dlgEliminar.setVisible(false);
		dlgEliminar.add(lblBorrar);
		dlgEliminar.add(listaEmpleadoEliminar);
		dlgEliminar.add(btnEliminar);
		dlgEliminar.add(btnLimpiarEliminar);

		// Creamos la ventana consultarEmpleado

		dlgConsultar.setLayout(new FlowLayout());
		dlgConsultar.setTitle("Crear nuevo empleado");
		dlgConsultar.setSize(500, 300);
		dlgConsultar.setLocationRelativeTo(null);
		dlgConsultar.setResizable(false);
		dlgConsultar.setVisible(false);
		txtAreaConsultar.setEditable(false);
		dlgConsultar.add(lblConsultar);
		dlgConsultar.add(txtAreaConsultar);
		dlgConsultar.add(btnConsultar);
		dlgConsultar.add(btnImprimirConsultar);

	}

}
