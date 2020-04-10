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

	//Creamos un objeto de la clase Frame
	Frame frmEmpresa = new Frame();
	
	//Elementos Dialog del CRUD
	
	Dialog dlgNuevo = new Dialog(frmEmpresa, "�Nueva Alta?", true);
	Dialog dlgConsultar = new Dialog(frmEmpresa, "�Nueva Consulta?", true);
	Dialog dlgEliminar = new Dialog(frmEmpresa, "�Nueva Baja?", true);
	Dialog dlgModificar = new Dialog(frmEmpresa, "�Nueva Modificaci�n?", true);
	
	//Creamos los elementos que forman nuestro men�
	
	//Elemento/s barra men�
	MenuBar mbPrincipal = new MenuBar();
	//Elemento men� 
	Menu  mnEmpleados  = new Menu("Empleados");
	//Elementos men� item de nuestro proyecto
	MenuItem mniNuevo = new MenuItem("Nuevo");
	MenuItem mniConsultar = new MenuItem("Consultar");
	MenuItem mniEliminar = new MenuItem("Eliminar");
	MenuItem mniModificar = new MenuItem("Modificar");
	


	
	//Creamos las etiquetas 
	
	Label lblCrear =new Label("Empleado");
	Label lblConsultar =new Label("Empleados");	
	Label lblModificar =new Label("Rellene los campos Empleado");	
	Label lblBorrar =new Label("Seleccione Empleado");
	
	//Etiquetas Nuevo
	Label lblNombreNuevo = new Label ("Nombre Empleado:");
	Label lblEmpleadoNuevo = new Label ("N�mero Empleado:");
	Label lblDepartamentoNuevo = new Label ("Departamento:");
	Label lblExtensionNuevo = new Label ("Extensi�n:");
	Label lblFechaNacNuevo = new Label ("Fecha Nac.:");
	Label lblFechaIngNuevo = new Label ("Fecha alta:");
	Label lblSalarioNuevo = new Label ("Salario:");
	Label lblComisionNuevo = new Label ("Comisi�n:");
	Label lblHijosNuevo = new Label ("Hijos:");
	
	//Etiquetas Modificar
	
	Label lblNombreModificar = new Label ("Nombre Empleado:");
	Label lblEmpleadoModificar = new Label ("N�mero Empleado");
	Label lblDepartamentoModificar = new Label ("Departamento");
	Label lblExtensionModificar = new Label ("Extensi�n");
	Label lblFechaNacModificar = new Label ("Fecha Nacimiento");
	Label lblFechaIngModificar = new Label ("Fecha Alta");
	Label lblSalarioModificar = new Label ("Salario");
	Label lblComisionModificar = new Label ("Comisi�n");
	Label lblHijosModificar = new Label ("Hijos");
	
	
	//Creamos los campos de texto NuevoEmpleado
	
	
	TextField txtNombreNuevo = new TextField ("",20);
	TextField txtEmpleadoNuevo = new TextField ("",20);
	
	TextField txtExtensionNuevo = new TextField ("",20);
	TextField txtFechaNacNuevo = new TextField ("",20);
	TextField txtFechaIngNuevo = new TextField ("",20);
	TextField txtSalarioNuevo = new TextField ("",20);
	TextField txtComisionNuevo = new TextField ("",20);
	TextField txtHijosNuevo = new TextField ("",20);
	
	//Objetos Choice
		//nuevo
	Choice listaEmpleadosNuevo = new Choice();
	Choice listaDepartamentosNuevo = new Choice();
		//eliminar
	Choice listaEmpleadosEliminar = new Choice();
	Choice listaDepartamentoNuevo = new Choice();
		//modificar
	Choice listaEmpleadosModificar = new Choice();
	Choice listaDepartamentoModificar = new Choice ();

	//Creamos los campos de texto NuevoEmpleado
	
	
	TextField txtNombreModificar = new TextField ("",20);
	TextField txtEmpleadoModificar = new TextField ("",20);
	
	TextField txtExtensionModificar = new TextField ("",20);
	TextField txtFechaNacModificar = new TextField ("",20);
	TextField txtFechaIngModificar = new TextField ("",20);
	TextField txtSalarioModificar = new TextField ("",20);
	TextField txtComisionModificar = new TextField ("",20);
	TextField txtHijosModificar = new TextField ("",20);	

	TextArea txtAreaConsultar = new TextArea();
	
	
	
	
	//Creamos los objetos bot�n 
	
	Button btnCrear = new Button("Aceptar");
	Button btnConsultar = new Button("Volver");
	Button btnModificar = new Button("Aceptar");
	Button btnEliminar = new Button("Aceptar");
	Button btnCancelarNuevo = new Button("Cancelar");
	Button btnCancelarEliminar = new Button("Cancelar");
	Button btnCancelarModificar = new Button("Cancelar");
	Button btnCancelarConsultar = new Button("Imprimir");
	
	public Vista() {
		
		frmEmpresa.setLayout(new FlowLayout());
		frmEmpresa.setTitle("Men� Empleados");
		
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
		
		//Creamos interfaz ventana NuevoEmpleado
		
		dlgNuevo.setLayout (new GridLayout(10, 2));
		dlgNuevo.setTitle("Crear nuevo empleado");
		dlgNuevo.setSize(300,275);
		dlgNuevo.setLocationRelativeTo(null);
		dlgNuevo.setResizable(false);
		dlgNuevo.setVisible(false);
		dlgNuevo.add(lblEmpleadoNuevo);
		dlgNuevo.add(txtEmpleadoNuevo);
		dlgNuevo.add(lblDepartamentoNuevo);
		dlgNuevo.add(listaDepartamentoNuevo);
		dlgNuevo.add(lblExtensionNuevo);
		dlgNuevo.add(txtExtensionNuevo);
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
		dlgNuevo.add(lblNombreNuevo);
		dlgNuevo.add(txtNombreNuevo);
		
		dlgNuevo.add(btnCrear);
		dlgNuevo.add(btnCancelarNuevo);
		
		//Creamos ventana ModificarEmpleado
		dlgModificar.setLayout (new GridLayout(10, 2));
		dlgModificar.setTitle("Editar empleado");
		dlgModificar.setSize(300,275);
		dlgModificar.setLocationRelativeTo(null);
		dlgModificar.setResizable(false);
		dlgModificar.setVisible(false);
		dlgModificar.add(lblEmpleadoModificar);
		dlgModificar.add(txtEmpleadoModificar);
		dlgModificar.add(lblDepartamentoModificar);
		dlgModificar.add(listaDepartamentoModificar);
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
		dlgModificar.add(lblNombreModificar);
		dlgModificar.add(txtNombreModificar);
		
		dlgModificar.add(btnModificar);
		dlgModificar.add(btnCancelarModificar);
		
		//Creamos la ventana borrarEmpleado
		
		dlgEliminar.setLayout (new GridLayout(2, 2));
		dlgEliminar.setTitle("Crear nuevo empleado");
		dlgEliminar.setSize(250,150);
		dlgEliminar.setLocationRelativeTo(null);
		dlgEliminar.setResizable(false);
		dlgEliminar.setVisible(false);
		dlgEliminar.add(lblBorrar);
		dlgEliminar.add(listaEmpleadosEliminar);
		dlgEliminar.add(btnEliminar);
		dlgEliminar.add(btnCancelarEliminar);
		
		//Creamos la ventana consultarEmpleado
		
		dlgConsultar.setLayout (new FlowLayout());
		dlgConsultar.setTitle("Crear nuevo empleado");
		dlgConsultar.setSize(500,300);
		dlgConsultar.setLocationRelativeTo(null);
		dlgConsultar.setResizable(false);
		dlgConsultar.setVisible(false);
		dlgConsultar.add(lblConsultar);
		dlgConsultar.add(txtAreaConsultar);
		dlgConsultar.add(btnConsultar);
		dlgConsultar.add(btnCancelarConsultar);
		txtAreaConsultar.setEditable(false);
		
	
	}
	
}
