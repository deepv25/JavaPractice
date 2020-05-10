package topic04.aboutclass;
//to know about enum as inner enum or nested enum
public class Pr01OuterClassNestedEnum {

    static int m1() {
        return 10;
    }

    int m2() {
        return 20;
    }

    enum Pr01InnerEnum { //inner class

        enumobj;

        static int m1() {
            return 1000;
        }

        int m2() {
            return 2000;
        }

        public static void main(String[] args) {
            System.out.println(Pr01OuterClassNestedEnum.m1() + new Pr01OuterClassNestedEnum().m2() + Pr01InnerEnum.m1() + Pr01InnerEnum.enumobj.m2());
        }

    }

    public static void main(String[] args) {
        System.out.println(Pr01OuterClassNestedEnum.m1() + new Pr01OuterClassNestedEnum().m2());
    }

}
