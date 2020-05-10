package topic04.aboutclass;
//to know about nested static class
public class Pr03OuterClassNestedStaticClass {
    static int i=1;
    int j=2;

    public static void main(String[] args) {
        int outerSum= Pr03OuterClassNestedStaticClass.i+new Pr03OuterClassNestedStaticClass().j;
        System.out.println(outerSum);
    }

    static class NestedStaticClass{
        static int i=3;
        int j=4;

        public static void main(String[] args) {
            int nestedSum=NestedStaticClass.i+new NestedStaticClass().j;
            int outerSum1= Pr03OuterClassNestedStaticClass.i+new Pr03OuterClassNestedStaticClass().j;
            System.out.println(nestedSum);
            System.out.println(outerSum1);
            System.out.println(nestedSum+outerSum1);

        }
    }

}
