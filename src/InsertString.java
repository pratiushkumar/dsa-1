import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator
{
    @Override
    public int compare(Object obj1, Object obj2) {
        //FIRST STEP IS TO CONVERT IT FROM INTEGER TO STRING
        String str1  =obj1.toString();
        String str2 =obj2.toString();
        //returning reverse of natural order
        return  -str1.compareTo(str2);
//        str2 agar pehle aa gaya toh reverse yanoi descending order mein hoaga

    }
}
class InsertString {
    public static void main(String[] args ) {
        TreeSet ts =new TreeSet(new MyComparator());
        ts.add("sachin");
        ts.add("ponting");
        ts.add("gibbs");
        ts.add("devuiliers");
        //STRING OBJECT BYDEFAULT IMPLEMENTS COMPARABLE AND THEY ARE HOMOGENOUS SO IN ASCENDING ORDER SORTING WILL HAPPEN
//                     |
//                     |
//        WE WANT REVERSE SO WE WILL USE COMPARATOR

        //dont work with STRING BUFFER

        System.out.println(ts);//Ascending order

    }
}
