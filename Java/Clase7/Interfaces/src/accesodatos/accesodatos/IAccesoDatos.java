package accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTRO = 10;//Atributo de una interface (constante)
    
    //Metodo abstracto y sin cuerpo
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    //Metodos clasicos al trabajar con bases de datos, aunque no vamos a agregar una BD
    //Similamos una implementacion a la base de datos de MySQL
}
