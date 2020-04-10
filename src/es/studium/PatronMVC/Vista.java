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
import java.awt.TextField;
import java.awt.event.WindowAdapter;

public class Vista extends WindowAdapter {

	//Creamos un objeto de la clase Frame
	Frame frmEmpresa = new Frame();
	
	//Elementos Dialog del CRUD
	
	Dialog dlgNuevo = new Dialog(frmEmpresa, "¿Nueva Alta?", true);
	Dialog dlgConsultar = new Dialog(frmEmpresa, "¿Nueva Consulta?", true);
	Dialog dlgEliminar = new Dialog(frmEmpresa, "¿Nueva Baja?", true);
	Dialog dlgModificar = new Dialog(frmEmpresa, "¿Nueva Modificación?", true);
	
	//Creamos los elementos que forman nuestro menú
	
	//Elemento/s barra menú
	MenuBar mbPrincipal = new MenuBar();
	//Elemento menú 
	Menu  mnEmpleados  = new Menu("Empleados");
	//Elementos menú item de nuestro proyecto
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
	Label lblEmpleadoNuevo = new Label ("Número Empleado:");
	Label lblDepartamentoNuevo = new Label ("Departamento:");
	Label lblExtensionNuevo = new Label ("Extensión:");
	Label lblFechaNacNuevo = new Label ("Fecha Nac.:");
	Label lblFechaIngNuevo = new Label ("Ingresos:");
	Label lblSalarioNuevo = new Label ("Salario:");
	Label lblComisionNuevo = new Label ("Comisión:");
	Label lblHijosNuevo = new Label ("Hijos:");
	
	//Etiquetas Modificar
	
	Label lblNombreModificar = new Label ("Nombre");
	Label lblEmpleadoModificar = new Label ("Número");
	Label lblDepartamentoModificar = new Label ("Departamento");
	Label lblExtensionModificar = new Label ("Extensión");
	Label lblFechaNacModificar = new Label ("Fecha Nac.");
	Label lblFechaIngModificar = new Label ("Ingresos");
	Label lblSalarioModificar = new Label ("Salario");
	Label lblComisionModificar = new Label ("Comisión");
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
	Choice listaDepartamentoNuevo = new Choice ();
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
	
	

	
	
	
	
	//Creamos los objetos botón 
	
	Button btnCrear = new Button("Aceptar");
	Button btnConsultar = new Button("Aceptar");
	Button btnModificar = new Button("Aceptar");
	Button btnEliminar = new Button("Aceptar");
	Button btnCancelarNuevo = new Button("Cancelar");
	Button btnCancelarEliminar = new Button("Cancelar");
	Button btnCancelarModificar = new Button("Cancelar");
	Button btnCancelarConsultar = new Button("Cancelar");
	
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
		
		//Creamos interfaz ventana NuevoEmpleado
		
		dlgNuevo.setLayout (new GridLayout(9, 2));
		dlgNuevo.setTitle("Crear nuevo empleado");
		dlgNuevo.setSize(275,250);
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
		dlgModificar.setLayout (new GridLayout(9, 2));
		dlgModificar.setTitle("Editar empleado");
		dlgModificar.setSize(275,250);
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
		
		//Crear ventana borrarEmpleado
		
		dlgEliminar.setLayout (new FlowLayout());
		dlgEliminar.setTitle("Crear nuevo empleado");
		dlgEliminar.setSize(350,350);
		dlgEliminar.setLocationRelativeTo(null);
		dlgEliminar.setResizable(false);
		dlgEliminar.setVisible(false);
		dlgEliminar.add(lblBorrar);
		dlgEliminar.add(listaEmpleadosEliminar);
		dlgEliminar.add(btnEliminar);
		dlgEliminar.add(btnCancelarEliminar);
		
	
	
	}
	
}
