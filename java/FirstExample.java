import com.auto.germany.Car;

public class FirstExample{
    public static void main(String[] args) {
      Car a = new Car();
      System.out.println(a.weight);
      System.out.println(a.year);
      System.out. println(a.model);
      System.out.println(Car.year0fBirth);
Car.year0fBirth=1700;
      Car aNew= new Car();
      aNew.year= 2023;
        System.out.println(aNew.weight);
        System.out.println(aNew.year);
        System.out. println(aNew.model);
      System.out.println(Car.year0fBirth);



    }
}
