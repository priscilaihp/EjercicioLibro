public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro(String tLibro, String aLibro, int pLibro)
    {
        titulo = tLibro;
        autor = aLibro;
        paginas = pLibro;
    }
    
    String dimeAutor()
    {
        return autor;
    }
    
    String dimeTitulo()
    {
        return titulo;
    }
    
    int dimePaginas()
    {
        return paginas;
    }
    
    String dimeDetalles()
    {
        String datos = " ";
        
        datos += "Título:";
        datos += titulo;
        datos += ", Autor:";
        datos += autor;
        datos += ", Páginas:";
        datos += paginas;
        
        return datos;
    }
}