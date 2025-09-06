//public class Scoped {
//    String vname;
//
//    Scoped(String vname) {
//        this.vname = vname;
//    }
//}
//
//    public class TLDBConn {
//
//        final static ThreadLocal<Scoped> TLUSER = new ThreadLocal<>();
//
//        public static String open(String info) {
//            System.out.println(info + ": " + TLUSER.get().vname);
//            return info + ": " + TLUSER.get().vname;
//        }
//    }
