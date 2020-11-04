
public class Conexion implements AutoCloseable {

	public Conexion() {
        System.out.println("Abriendo conexion");
    }

    public void leerDatos() {
        System.out.println("Recibiendo datos");
        throw new IllegalStateException();
    }

    public void cerrar() {
        System.out.println("Cerrando conexion");
    }

	@Override
	public void close() throws Exception {
		cerrar();
	}

}
