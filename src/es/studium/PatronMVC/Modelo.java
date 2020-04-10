package es.studium.PatronMVC;

import java.awt.TextArea;
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

	public void GestorConexion() {

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

	}
	
	public int insertar(Connection con, String tabla, String departamentoFK, String extensionEmpleado, String fechaNacimientoEmpleado, 
			String fechaIngresoEmpleado, String salarioEmpleado, String comisionEmpleado, String hijosEmpleado, String nombreEmpleado)
	{
		int respuesta = 0;
		
		try
		{
			// Creamos un STATEMENT para una consulta SQL INSERT.
			Statement statement = con.createStatement();
			
			String cadenaSQL = "INSERT INTO " + tabla + " VALUES (null, '" 
				+ departamentoFK + "', '" + extensionEmpleado +  " ', '" + fechaNacimientoEmpleado + "', '" 
				+ fechaIngresoEmpleado + "', '" + salarioEmpleado + "', '" + comisionEmpleado + "', '" 
				+ hijosEmpleado + "', '" + nombreEmpleado + "');";
				System.out.println(cadenaSQL);
				statement.executeUpdate(cadenaSQL);			
			
				statement.close();
		} catch (SQLException ex)
		{
			System.out.println("ERROR:al hacer un Insert");
			ex.printStackTrace();
			respuesta = 1;
			
		}
		return respuesta;
	}
	
	public int borrar(Connection con, int idEmpleado)
	{
		int respuesta = 0;
		String sql = "DELETE FROM empleados WHERE idEmpleado = " + idEmpleado;
		System.out.println(sql);
		try
		{
			// Creamos un STATEMENT para una consulta SQL INSERT.
			Statement sta = con.createStatement();
			sta.executeUpdate(sql);
			sta.close();
		} catch (SQLException ex)
		{
			System.out.println("ERROR:al intentar borrar el empleado " + idEmpleado);
			ex.printStackTrace();
			respuesta = 1;
		}
		return respuesta;
	}
	public void ConsultaEmpleados(Connection con, TextArea areaTxt)
	{
		String statement = "SELECT * FROM empleados";
		try
		{
			// CREAR UN STATEMENT PARA UNA CONSULTA SELECT
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(statement);
			while (rs.next())
			{
				//String[] Servicio=listaServicios.getSelectedItem().split("-");
				if (areaTxt.getText().length() == 0)
				{
					areaTxt.setText(rs.getInt("idEmpleado") + "-" + rs.getString("idDepartamentoFK") + ", "
							+ rs.getString("extensionEmpleado") + ", " + rs.getString("fechaNacimientoEmpleado") + ", "
							+ rs.getString("fechaIngresoEmpleado") + ", " + rs.getString("salarioEmpleado") + ", "
							+ rs.getString("comisionEmpleado") + ", " + rs.getString("hijosEmpleado") + ", "
							+ rs.getString("nombreEmpleado"));
				} else
				{
					areaTxt.setText(areaTxt.getText() + "\n" + rs.getInt("idEmpleado") + "-"
							+ rs.getString("idDepartamentoFK") + ", " + rs.getString("extensionEmpleado") + ", "
							+ rs.getString("fechaNacimientoEmpleado") + ", " + rs.getString("fechaIngresoEmpleado") + ", "
							+ rs.getString("salarioEmpleado") + ", " + rs.getString("comisionEmpleado")+ ", " 
							+ rs.getString("hijosEmpleado") + ", " + rs.getString("nombreEmpleado"));			}
			}
			rs.close();
			stmt.close();
		} catch (SQLException ex)
		{
			System.out.println("ERROR:al realizar la consulta");
			ex.printStackTrace();
		}
	}
}
