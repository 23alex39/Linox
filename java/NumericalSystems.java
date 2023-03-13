import javax.sound.midi.Soundbank;
import java.util.SortedMap;

public class NumericalSystems {
    public static void main(String[] args) {
        //Qwert = Q*10^4+W*10^3+E*10^2+R*10^1+T*10^0
        //43210< reversed indexes

        int a = 123;
        System.out.println(1*Math.pow(10,2)+2*Math.pow(10,1)+3*Math.pow(10,0));

        int b = 1024;
        System.out.println(1*Math.pow(10,3)+0*Math.pow(10,2)+2*Math.pow(10,1)+4*Math.pow(10,0));
        //OCTAL
        int c = 219;
        // 10->8
        System.out.println(219/8);
        System.out.println(219%8);

        System.out.println(27/8);
        System.out.println(27%8);

        System.out.println(3/8);
        System.out.println(3%8);

        int d = 100;
        int d8 = 0144;
        System.out.println(d8);
        System.out.println(1*Math.pow(8,2)+4*Math.pow(8,1)+4*Math.pow(8,0));

        int e = 1144;
        System.out.println(1*Math.pow(10,3)+1*Math.pow(10,2)+4*Math.pow(10,1)+4*Math.pow(10,0));
        System.out.println(1144/8); //143
        System.out.println(1144%8);     //0
        System.out.println(143/8); //17
        System.out.println(143%8);      //7
        System.out.println(17/8); //2
        System.out.println(17%8);       //1
        System.out.println(2/8); //0
        System.out.println(2%8);        //2

        int e8 = 02170;
        System.out.println(e8);
        System.out.println(2*Math.pow(8,3)+1*Math.pow(8,2)+4*Math.pow(8,1)+4*Math.pow(8,0));

        int f = 978;
        System.out.println(9*Math.pow(10,2)+7*Math.pow(10,1)+8*Math.pow(10,0));
        System.out.println(978/8); // 122
        System.out.println(978%8);     //2
        System.out.println(122/8); //15
        System.out.println(122%8);     //2
        System.out.println(15/8);  //1
        System.out.println(15%8);       //7
        System.out.println(1/8);   //0
        System.out.println(1%8);        //1

        int f8 = 01722;
        System.out.println(f8);
        System.out.println(1*Math.pow(8,3)+7*Math.pow(8,2)+2*Math.pow(8,1)+2*Math.pow(8,0));

        int g = 12;
        System.out.println(1*Math.pow(10,1)+2*Math.pow(10,0));
        System.out.println(12/8); //1
        System.out.println(12%8);       //4
        System.out.println(1/8);  //0
        System.out.println(1%8);        //1

        int g8 = 014;
        System.out.println(g8);
        System.out.println(1*Math.pow(8,1)+4*Math.pow(8,0));

















    }
}
