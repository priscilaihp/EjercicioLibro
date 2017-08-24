public class Libro
{
    private String titulo;
    private String autor;
    
    public Libro(String tLibro, String aLibro)
    {
        titulo = tLibro;
        autor = aLibro;
    }
    
    String dimeAutor()
    {
        return autor;
    }
    
    String dimeTitulo()
    {
        return titulo;
    }
}