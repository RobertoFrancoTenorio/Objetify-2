import java.util.ArrayList;
import java.util.Random;

/**
 * Clase 
 */
public class Biblioteca{
    private ArrayList <String> canciones;
    private Reproductor reproductor;
    private Random rnd;
    
    public Biblioteca()
    {
        canciones = new ArrayList<String>();
        reproductor = new Reproductor();
        Random rnd = new Random();
    }
    
    /**
     * Metodo para agregar archivos a la biblioteca
     */
    public void agregarCancion(String nombreArchivo)
    {
        canciones.add(nombreArchivo);
    }
    
    /**
     * Metodo para iniciar la reproduccion de una cancion
     * @param numCancion es para recibir el nombre de la cancion
     * @return regresa el nombre de la cancion en reproduccion
     */
    public void reproducirCancion(int numCancion)
    {
        reproductor.reproducir(canciones.get(numCancion));
    }
    
    /**
     * Metodo que regresa el numero de canciones en nuestro Array
     */
    public int numDeCanciones()
    {
        return canciones.size();
    }
    
    /**
     * Permite reproducir una cancion por su numero
     * @param recibe el numero de la cancion
     */
    public void reproducir(int cancionNo){
        reproductor.reproducir(canciones.get(cancionNo));
    }
    
    /**
     * Metodo para borrar todas las canciones de la biblioteca
     */
    public boolean BorraTodo()
    {
        canciones.removeAll(canciones);
        if(canciones.isEmpty()){
            return true;
        }
        else
            return false;
    }
    
    /**
     * Metodo para borrar un archivo definido por el usuario
     * @param es el archivo que ha ingresado el usuario
     */
    public void BorraEspecifico(int cancion)
    {
        canciones.remove(cancion);
    }
    
    /**
     * Se encarga de reproducir una cancion al azar
     */
    public void reproducirAleatorio()
    {
        int aux;
        Random rnd= new Random(System.currentTimeMillis());
        aux=rnd.nextInt(canciones.size());
        reproducir(aux);
    }
    
    /**
     * Metodo encargado de buscar una cancion especifico
     * @param recibe el nombre de la cancion deseada
     */
    public void buscaCancion(String nombre)
    {
        for(int i=0; i<canciones.size();i++){
            if(canciones.get(i) == nombre){
                String aux="";
                aux=canciones.get(i);
                reproductor.reproducir(aux);
            }
        }
    }
}
