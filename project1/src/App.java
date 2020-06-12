// import java.util.Calendar;
// import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Witamy na kursie\nAplikacje mobilne");
        Hello hello = new Hello();
        //Hello hello2 = new Hello();        
        System.out.println(hello.sayHello());
        System.out.println("\n======================\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbe całkowitą: ");
        int limit = sc.nextInt();
        sc.close();
        MyFirst mf = new MyFirst(limit);
        mf.getNumbers();
    }
}
class Hello{
    public String sayHello(){
        Date date = Calendar.getInstance().getTime();
        String today = new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(date.toString()); 
        return "Hello from Java, today is: "+today;
    }
    @Override
    public String toString(){
        
        return getClass().getName()+": własna wersja toString";
    }
}