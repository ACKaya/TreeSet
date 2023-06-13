import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> tSet=new TreeSet<>(new NameComparator());
        tSet.add(new Student("Ayi Bogan Reco",31));
        tSet.add(new Student("Resul",30));
        tSet.add(new Student("Reis",100));
        tSet.add(new Student("Yahya",60));
       for(Student stu:tSet){
           System.out.println(stu.getName());
       }
    }
}
