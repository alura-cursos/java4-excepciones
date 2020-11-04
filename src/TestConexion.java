
public class TestConexion {
	
	public static void main(String[] args) throws Exception {
		
		
		Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		} 
		catch (IllegalStateException ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("Ejecutando finally");
			if (con != null) {
				con.cerrar();
			}
		} 

	}
	
}
