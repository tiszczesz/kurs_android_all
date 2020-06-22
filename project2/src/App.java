import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // cw1();
        // cw2();
        // cw3();
        // cw4();
        cw5();
    }
    public static void cw1(){
        Document d1 = new Document("dokument 1", 2000);
        System.out.println(d1);
        System.out.println("================================");
    }
    public static void cw2(){
        DocText dt1 = new DocText();
        System.out.println(dt1);
        System.out.println("================================");
    }
    public static void cw3(){
        List<String> list = new ArrayList<>();
        list.add("sfs sf sf sfsf s fs");
        list.add("drgdgdd gdgdg dg dg dg dg d");
        DocText dt1 = new DocText("tekstowy 1",200,list);
        System.out.println(dt1);
        System.out.println("================================");
    }
    public static void cw4(){
        DocImage di = new DocImage();
        System.out.println(di);
        System.out.println("================================");
    }
    public static void cw5(){
        List<Document> lista = Repository.getAll();
        lista.forEach(item->System.out.println(item));
        System.out.println("================================");
        for (Document document : lista) {
            if(document instanceof IPrintable ){
                IPrintable p = (IPrintable)document;
                p.PrintDoc();
            }else{
                System.out.println(document+ " nie może być drukowany");
            }
        }
    }
}
