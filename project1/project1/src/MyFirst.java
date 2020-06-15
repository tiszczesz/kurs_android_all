public class MyFirst {
    private int limit;
    public MyFirst(int limit) {
        setLimit(limit);
    }
    public void setLimit(int limit){
        this.limit = limit>=0 ?limit: -limit;
    }
    public void getNumbers(){
        System.out.println("Pętla for:");
        for(int i=0;i<limit;i++){
            System.out.println(i);
        }
        System.out.println("Pętla while");
        int i=0;
        while(i<limit){
            System.out.println(++i);
        }
        System.out.println("Pętla do-while");
        i=0;
        do{
            System.out.println(i);
        }//while(i++<limit);//0,1,2,3,4//najpierw porownanie potem zwiekszenie
        while(++i<limit);//0,1,2,3//najpierw zwiekszenie potem porownanie
    }
}