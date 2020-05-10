package topic04.aboutclass;
//to know about interface as inner interface or nested interface
public class Pr02OuterClassNestedInterface {
    static int m1(){
        return 10;
    }

        int m2(){
        return 20;
    }

    interface NestedInterface{
        static int m1(){
            return 30;
        }

        static int m2(){ //interface cannot have non-static implemented methods so declared this method as static
            return 5;
        }

        public static void main(String[] args) {
        int classSum = Pr02OuterClassNestedInterface.m1() + new Pr02OuterClassNestedInterface().m2();
        int interfaceSum = NestedInterface.m1() + NestedInterface.m2();
        int sum2 = Pr02OuterClassNestedInterface.NestedInterface.m1() + Pr02OuterClassNestedInterface.NestedInterface.m2();
            System.out.println(classSum);
        System.out.println(interfaceSum);
        System.out.println(sum2);
        }
    }
    public static void main(String[] args) {
        int classSum = Pr02OuterClassNestedInterface.m1() + new Pr02OuterClassNestedInterface().m2();
        int interfaceSum = NestedInterface.m1() + NestedInterface.m2();
        int sum2 = Pr02OuterClassNestedInterface.NestedInterface.m1() + Pr02OuterClassNestedInterface.m1();
        System.out.println(classSum);
        System.out.println(interfaceSum);
        System.out.println(sum2);
    }


}
