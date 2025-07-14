import java.util.function.Predicate;

// class Mypredicate implements Predicate<Integer> {
//    @Override
//   public boolean test(Integer i) {
//////       if (i > 10)
//////            return true;
//////        else {
//////            return false;
//////        }
//        return false;
//    }
////
//    }

class Test  {
    public  static  void main (String[] args) {
//        Predicate p =  new Mypredicate();
        Predicate<Integer>  p = i->i>10;
        System.out.println(p.test(10));
        System.out.println(p.test(100));
//        System.out.println(p.test(true));//compile time error
    }
}
