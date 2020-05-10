package topic04.aboutclass;
//to know about non-static block
public class Pr04OuterClassNSblock {
    {
        System.out.println("Iam from non-static block");
    }

    int j=20;

    public static void main(String[] args) {
        System.out.println("Iam from main");
        System.out.println(new Pr04OuterClassNSblock().j);
    }

}
