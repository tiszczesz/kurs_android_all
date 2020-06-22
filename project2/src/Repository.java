import java.util.ArrayList;
import java.util.List;

public class Repository {
    public static List<Document> getAll(){
        List<Document> lista = new ArrayList<>();
        lista.add(new DocText());
        lista.add(new DocImage());
        lista.add(new DocSound());
        return lista;
    }
    
}