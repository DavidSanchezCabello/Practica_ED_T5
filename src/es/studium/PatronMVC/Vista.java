package es.studium.PatronMVC;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
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
	Label lblNombre = new Label ("Nombre");
	Label lblEmpleado = new Label ("Número");
	Label lblDepartamento = new Label ("Departamento");
	Label lblExtension = new Label ("Extensión");
	Label lblFechaNac = new Label ("Fecha Nac.");
	Label lblFechaIng = new Label ("Ingresos");
	Label lblSalario = new Label ("Salario");
	Label lblComision = new Label ("Comisión");
	Label lblHijos = new Label ("Hijos");
	
	
	//Creamos los campos de texto
	
	
	TextField txtNombre = new TextField ("Nombre");
	TextField txtEmpleado = new TextField ("Número");
	
	TextField txtExtension = new TextField ("Extensión");
	TextField txtFechaNac = new TextField ("Fecha Nac.");
	TextField txtFechaIng = new TextField ("Ingresos");
	TextField txtSalario = new TextField ("Salario");
	TextField txtComision = new TextField ("Comisión");
	TextField txtHijos = new TextField ("Hijos");
	
	Choice listaEmpleados = new Choice();
	Choice listaDepartamento = new Choice ();
	
	TextField txtCrear = new TextField(3);
	TextField txtConsultar = new TextField(3);
	TextField txtModificar = new TextField(3);
	
	
	TextField txtResultadoCrear = new TextField(3);
	TextField txtResultadoConsultar = new TextField(3);
	TextField txtResultadoModificar = new TextField(3);
	TextField txtResultadoEliminar = new TextField(3);
	
	//Creamos los objetos botón 
	
	Button btnCrear = new Button("");
	Button btnConsultar = new Button("");
	Button btnModificar = new Button("");
	Button btnEliminar = new Button("");
	Button btnCancelar = new Button("");
	
	
	public Vista() {
		
		frmEmpresa.setLayout(new FlowLayout());
		frmEmpresa.setTitle("Nuevo");
		
		frmEmpresa.setLocationRelativeTo(null);
		frmEmpresa.setSize(300, 200);
		frmEmpresa.setResizable(false);
		frmEmpresa.setVisible(true);
		
		mbPrincipal.add(mnEmpleados);
		
		mnEmpleados.add(mniNuevo);
		mnEmpleados.add(mniConsultar);
		mnEmpleados.add(mniEliminar);
		mnEmpleados.add(mniModificar);
		
		frmEmpresa.setMenuBar(mbPrincipal);
		
		//Creamos interfaz ventana NuevoEmpleado
		
		dlgNuevo.setLayout (new FlowLayout());
		dlgNuevo.setTitle("Crear nuevo empleado");
		dlgNuevo.setSize(300,250);
		dlgNuevo.setLocationRelativeTo(null);
		dlgNuevo.setResizable(false);
		dlgNuevo.setVisible(false);
		dlgNuevo.add(lblEmpleado);
		dlgNuevo.add(txtEmpleado);
		dlgNuevo.add(lblDepartamento);
		dlgNuevo.add(listaDepartamento);
		dlgNuevo.add(lblExtension);
		dlgNuevo.add(txtExtension);
		dlgNuevo.add(lblFechaNac);
		dlgNuevo.add(txtFechaIng);
		dlgNuevo.add(lblSalario);
		dlgNuevo.add(txtSalario);
		dlgNuevo.add(lblComision);
		dlgNuevo.add(txtComision);
		dlgNuevo.add(lblHijos);
		dlgNuevo.add(txtHijos);
		dlgNuevo.add(lblNombre);
		dlgNuevo.add(txtNombre);
		
		dlgNuevo.add(btnCrear);
		dlgNuevo.add(btnCancelar);
		
		//Creamos ventana ModificarEmpleado
		dlgModificar.setLayout (new FlowLayout());
		dlgModificar.setTitle("Crear nuevo empleado");
		dlgModificar.setSize(300,250);
		dlgModificar.setLocationRelativeTo(null);
		dlgModificar.setResizable(false);
		dlgModificar.setVisible(false);
		dlgModificar.add(lblEmpleado);
		dlgModificar.add(txtEmpleado);
		dlgModificar.add(lblDepartamento);
		dlgModificar.add(listaDepartamento);
		dlgModificar.add(lblExtension);
		dlgModificar.add(txtExtension);
		dlgModificar.add(lblFechaNac);
		dlgModificar.add(txtFechaIng);
		dlgModificar.add(lblSalario);
		dlgModificar.add(txtSalario);
		dlgModificar.add(lblComision);
		dlgModificar.add(txtComision);
		dlgModificar.add(lblHijos);
		dlgModificar.add(txtHijos);
		dlgModificar.add(lblNombre);
		dlgModificar.add(txtNombre);
		
		dlgModificar.add(btnModificar);
		dlgModificar.add(btnCancelar);
		
		//Crear ventana borrarEmpleado
		
		dlgEliminar.setLayout (new FlowLayout());
		dlgEliminar.setTitle("Crear nuevo empleado");
		dlgEliminar.setSize(300,250);
		dlgEliminar.setLocationRelativeTo(null);
		dlgEliminar.setResizable(false);
		dlgEliminar.setVisible(false);
		dlgEliminar.add(lblBorrar);
		dlgEliminar.add(listaEmpleados);
		dlgEliminar.add(btnModificar);
		dlgEliminar.add(btnCancelar);
		
	
	
	}
	public static void main(String[] args) {
		new Vista();
	}
}
