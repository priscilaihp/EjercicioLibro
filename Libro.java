public class Libro
{
    // Variables de Instancia
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    private int prestamos;
    
    /**
     * Constructor
     * @author Priscila Hernandez
     * @param tLibro Pregunta el título del Libro.
     * @param aLibro Pregunta el autor del Libro.
     * @param pLibro Pregunta el total de las paginas del Libro.
     */
    public Libro(String tLibro, String aLibro, int pLibro)
    {
        titulo = tLibro;
        autor = aLibro;
        paginas = pLibro;
        numeroDeReferencia = "";
        prestamos = 0;
    }
    
    /**
     * @return Muestra el autor del Libro.
     */
    public String dimeAutor()
    {
        return autor;
    }
    
    /**
     * @return Muestra el título del Libro.
     */
    public String dimeTitulo()
    {
        return titulo;
    }
    
    /**
     * @return Muestra el total de las paginas del Libro.
     */
    public int dimePaginas()
    {
        return paginas;
    }
    
    /**
     * Muestra todos los detalles (Título, Autor, Páginas, Prestamos) del Libro.
     * Muestra el numero de referencia solo si se le a asignado valor.
     * @return Regresa una cadena de caracteres con toda la información.
     */
    public String dimeDetalles()
    {
        String datos = "";
        String compara = "";
        
        datos += "Título:";
        datos += titulo;
        datos += ", Autor:";
        datos += autor;
        datos += ", Páginas:";
        datos += paginas;
        
        if(numeroDeReferencia.length() != compara.length())
        {
            datos += ", Numero de Referencia:";
            datos += numeroDeReferencia;
        }
        else
        {
            numeroDeReferencia = "ZZZ";
        }
        datos += ", Prestamos:";
        datos += prestamos;
        
        return datos;
    }
    
    /**
     * Cambia el numero de referncia solo si es de 3 caracteres.
     */
    public void cambiaNumRef(String numReferencia)
    {
        String compara = "100";
        
        if(numReferencia.length() >= compara.length())
        {
            numeroDeReferencia = numReferencia;
        }
    }
    
    /**
     * @return Muestra el numero de referencia.
     */
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
    
    /**
     * Aumenta en uno el numero de los prestamos.
     */
    public void prestar()
    {
        prestamos += 1;
    }
    
    /**
     * @return Muestra el numero de prestamos.
     */
    public int dimePrestamos()
    {
        return prestamos;
    }
}