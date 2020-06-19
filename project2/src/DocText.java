import java.util.ArrayList;
import java.util.List;

public class DocText extends Document {
    private List<String> lines;
    public DocText(String name,double size,List<String> lines) {
        super(name,size);
        this.lines = lines;
        System.out.println("Wywołanie konstruktora: "+this.getClass().getName());
    }
    public DocText(){
        super();
        lines = new ArrayList<>();
        lines.add("Ala ma kota");
        lines.add("Domyślny tekst dokumentu tekstowego");
        System.out.println("Wywołanie konstruktora domyślnego: "+this.getClass().getName());
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Treść dokumentu tekstowego:\n");
        sb.append(getContent());
        return sb.toString();
    }
    private String getContent(){
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}