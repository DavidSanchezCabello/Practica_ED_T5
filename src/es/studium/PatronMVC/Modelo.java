package es.studium.PatronMVC;

import java.awt.Choice;
import java.awt.TextArea;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modelo {

	Connection connect = null;

	public void CerrarConexion() {

		try {

			connect.close();

			System.out.println("La conexión a la base de datos se ha cerrado correctamente");
		} catch (SQLException ex) {

			System.out.println("Se ha detectado un error inesperado al cerrar la conexión: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	public Connection GestorConexion() {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/empresa?autoReconnect=true&useSSL=false";
		String login = "root";
		String pass = "Studium2019;";

		try {

			// Cargar los controladores para acceder a la Base de Datos
			Class.forName(driver);
			// Establecer la conexión con la base de datos
			connect = DriverManager.getConnection(url, login, pass);

			if (connect != null) {

				System.out.println(" Conectado correctamente a la base de datos");

			}

		} catch (SQLException ex) {

			System.out.println("ERROR: No se ha podido conectar con la base de datos" + ex.getMessage());
			ex.printStackTrace();
		} catch (ClassNotFoundException error) {

			System.out.println("No se encontró el controlador: " + error.getMessage());

		}
		return connect;

	}

	public int insertar(Connection con, String tabla, String extensionEmpleado, String fechaNacimientoEmpleado,
			String fechaIngresoEmpleado, String salarioEmpleado, String comisionEmpleado, String hijosEmpleado,
			String nombreEmpleado) {
		int respuesta = 0;

		try {
			// Creamos un STATEMENT para una consulta SQL INSERT.
			Statement statement = con.createStatement();

			String cadenaSQL = "INSERT INTO " + tabla + " VALUES (null, null ,'" + extensionEmpleado + " ', '"
					+ fechaNacimientoEmpleado + "', '" + fechaIngresoEmpleado + "', '" + salarioEmpleado + "', '"
					+ comisionEmpleado + "', '" + hijosEmpleado + "', '" + nombreEmpleado + "');";
			System.out.println(cadenaSQL);
			statement.executeUpdate(cadenaSQL);

			statement.close();
		} catch (SQLException ex) {
			System.out.println("ERROR:al hacer un Insert");
			ex.printStackTrace();
			respuesta = 1;

		}
		return respuesta;
	}

	public int BorrarEmpleado(Connection con, int idEmpleado)

	{
		int respuesta = 0;
		String sql = "DELETE FROM empleados WHERE idEmpleado = " + idEmpleado;
		System.out.println(sql);

		try {
			// Creamos un STATEMENT para una consulta SQL INSERT.
			Statement sta = con.createStatement();
			sta.executeUpdate(sql);
			sta.close();
		} catch (SQLException ex) {
			System.out.println("ERROR:al intentar borrar el empleado " + idEmpleado);
			ex.printStackTrace();
			respuesta = 1;
		}
		return respuesta;
	}

	public void ConsultaEmpleados(Connection con, TextArea areaTxt) {
		String statement = "SELECT * FROM empleados";
		try {
			// CREAR UN STATEMENT PARA UNA CONSULTA SELECT
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(statement);
			while (rs.next()) {
				// String[] Servicio=listaServicios.getSelectedItem().split("-");
				if (areaTxt.getText().length() == 0) {
					areaTxt.setText(rs.getInt("idEmpleado") + "-" + rs.getString("idDepartamentoFK") + ", "
							+ rs.getString("extensionEmpleado") + ", " + rs.getString("fechaNacimientoEmpleado") + ", "
							+ rs.getString("fechaIngresoEmpleado") + ", " + rs.getString("salarioEmpleado") + ", "
							+ rs.getString("comisionEmpleado") + ", " + rs.getString("hijosEmpleado") + ", "
							+ rs.getString("nombreEmpleado"));
				} else {
					areaTxt.setText(areaTxt.getText() + "\n" + rs.getInt("idEmpleado") + "-"
							+ rs.getString("idDepartamentoFK") + ", " + rs.getString("extensionEmpleado") + ", "
							+ rs.getString("fechaNacimientoEmpleado") + ", " + rs.getString("fechaIngresoEmpleado")
							+ ", " + rs.getString("salarioEmpleado") + ", " + rs.getString("comisionEmpleado") + ", "
							+ rs.getString("hijosEmpleado") + ", " + rs.getString("nombreEmpleado"));
				}
			}
			rs.close();
			stmt.close();
		} catch (SQLException ex) {
			System.out.println("ERROR:al realizar la consulta");
			ex.printStackTrace();
		}
	}

	public Choice SelectEmpleado(Connection con, Choice listaEmpleado) {

		String statement = "SELECT * FROM empleados";
		try {

			// CREAR UN STATEMENT PARA UNA CONSULTA SELECT
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(statement);
			while (rs.next()) {
				listaEmpleado.add(rs.getInt("idEmpleado") + "- " + rs.getString("nombreEmpleado") + ", "
						+ rs.getString("extensionEmpleado") + ", "

						+ rs.getString("salarioEmpleado"));

			}
		} catch (SQLException error) {

			System.out.println("Se ha producido un error");
		}
		return listaEmpleado;
	}

	public void mostrarDatos(Connection con, int empleado, TextField txtNumeroModificar,
			TextField txtExtensionModificar, TextField txtFechaNacModificar, TextField txtFechaIngModificar,
			TextField txtSalarioModificar, TextField txtComisionModificar, TextField txtHijosModificar,
			TextField txtNombreModificar) {
		String sqlSelect = "SELECT * FROM empleados WHERE idEmpleado = " + empleado;
		try {

			// Creamos un STATEMENT para una consulta SQL.
			Statement sta = con.createStatement();
			ResultSet rs = sta.executeQuery(sqlSelect);
			while (rs.next()) {
				String stringEmpleado = rs.getString("idEmpleado");
				/* String stringHabitacion = rs.getString(habitacion); */
				txtNumeroModificar.setText(stringEmpleado);
				txtNumeroModificar.setEnabled(false);
				String stringExtension = rs.getString("extensionEmpleado");
				txtExtensionModificar.setText(stringExtension);
				String stringFechaNac = rs.getString("fechaNacimientoEmpleado");
				txtFechaNacModificar.setText(stringFechaNac);
				String stringFechaIng = rs.getString("fechaIngresoEmpleado");
				txtFechaIngModificar.setText(stringFechaIng);
				String stringSalario = rs.getString("salarioEmpleado");
				txtSalarioModificar.setText(stringSalario);
				String stringComision = rs.getString("comisionEmpleado");
				txtComisionModificar.setText(stringComision);
				String stringHijos = rs.getString("hijosEmpleado");
				txtHijosModificar.setText(stringHijos);
				String stringNombre = rs.getString("nombreEmpleado");
				txtNombreModificar.setText(stringNombre);

			}
			sta.close();
		} catch (SQLException ex) {
			System.out.println("ERROR:al hacer el Select");
			ex.printStackTrace();
		}

	}
	public void modificarEmpleado (Connection con, TextField txtNumeroModificar,
			TextField txtExtensionModificar, TextField txtFechaNacModificar, TextField txtFechaIngModificar,
			TextField txtSalarioModificar, TextField txtComisionModificar, TextField txtHijosModificar,
			TextField txtNombreModificar) {
		
		int id = Integer.parseInt(txtNumeroModificar.getText());
		String extension = txtExtensionModificar.getText();
		String fechaNac = txtFechaNacModificar.getText();
		String fechaIng = txtFechaIngModificar.getText();
		String salario = txtSalarioModificar.getText();
		String comision = txtComisionModificar.getText();
		String hijos = txtHijosModificar.getText();
		String nombre = txtNombreModificar.getText();			
		
		// Ejecutar el UPDATE
		String sqlUpdate = "UPDATE empleados SET extensionEmpleado = '" + extension 
				+ "', fechaNacimientoEmpleado = '" + fechaNac + "', fechaIngresoEmpleado = '" 
				+ fechaIng + "', salarioEmpleado = '" + salario + "', comisionEmpleado = '" 
				+ comision + "', hijosEmpleado = '" + hijos+ "', nombreEmpleado = '" + nombre
				+ "'  WHERE idEmpleado = '" + id + "'";
		//System.out.println(sqlUpdate);
		
		try
		{
			// CREAR UN STATEMENT PARA UNA CONSULTA SELECT
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sqlUpdate);
			stmt.close();
		} catch (SQLException ex)
		{
			System.out.println("ERROR:al modificar");
			ex.printStackTrace();
		}
		
	}
}
