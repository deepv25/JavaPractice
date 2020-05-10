package topic04.aboutclass;
//to know about nested non-static block
public class Pr05OuterClassNSClass {
    static int i=2;
    int j=4;

    class NestedNSClass{
        static final int i=10;
        int j=15;
        //int sumInner=NestedNSClass.i+ new NestedNSClass().j;
    }

    public static void main(String[] args) {

        Pr05OuterClassNSClass obj1=new Pr05OuterClassNSClass();
        int sumOuter=Pr05OuterClassNSClass.i+obj1.j;
        //int sumInner=Pr05OuterClassNSClass.NestedNSClass.i+obj1.new NestedNSClass().j;
        int sumInner=NestedNSClass.i+ obj1.new NestedNSClass().j;
        System.out.println(sumOuter+sumInner);
    }
}
