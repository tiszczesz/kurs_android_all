public class Document {
    protected String name;
    protected double size;
    public Document(String name,double size) {
        System.out.println("Wywołanie konstruktora: "+this.getClass().getName());
        this.name = name;
        this.size = size;
    }
    public Document(){
        System.out.println("Wywołanie konstruktora domyslnego: "+this.getClass().getName());
        this.name = "noname";
        this.size = 0;
    }
    @Override
    public String toString(){
        return "Informacja o dokumencie: "+this.name+" rozmiar: "+this.size;
    }

}