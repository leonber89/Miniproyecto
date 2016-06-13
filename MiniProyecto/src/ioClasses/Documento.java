package ioClasses;

//Imports de las librerias que necesitamos
import java.util.ArrayList;
import java.util.List;

public class Documento {
	//Propiedades
	private List<String> parrafos;
    private String titulo;
    
    //Constructores
    /**
     * Constructor por default
    */
    public Documento() {
        parrafos = new ArrayList<>();
    }
    
    /**
     * Constructor con Titulo
    */
    public Documento(String titulo){
    	parrafos = new ArrayList<>();
    	this.titulo=titulo;
    }
    
    //Accesores
    /**
     * Asigna el titulo 
     * @param titulo
    */
    public void setTitulo(String titulo){
    	this.titulo=titulo;
    }
    
    /**
     * Regresa el titulo
     * @return El titulo
     */
    public String getTitulo(){
    	return titulo;
    }
    
    //Metodos
    /**
     * Permite agregar un parrafo al documento
     * @param parrafo
    */
    public void agregarParrafo(String parrafo){
    	parrafos.add(parrafo);
    }
    
    /**
     * Metodo que devuelve la cantidad de parrafos del documento
     * @return Numero de Parrafos
     */
    public int numeroParrafos(){
    	return parrafos.size();
    }
    
    /**
     * Metodo que retorna el texto de un parrafo en una posicion dada
     * @param posicion
     * @return El texto del parrafo en la posicion dada
     * @throws Exception Si la posicion es menor a 1
    */
    public String parrafo(int posicion) throws Exception{
    	if(posicion<1){
    		throw new Exception("Posicion no valida");
    	}
    	return parrafos.get(posicion);
    }
}
