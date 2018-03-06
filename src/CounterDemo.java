import java.util.Scanner;

public class CounterDemo {

    public static void main(String[] args) {
        Counter c;
        c = new Counter();
        c.increment();
        c.increment(3);
        int temp = c.getCount();
        c.reset();
        Counter d = new Counter(5);
        d.increment();
        Counter e = d;
        temp = e.getCount();
        e.increment(2);


        String title = "Data Structures and Algorithms in Java";

        System.out.println(title.charAt(3));

        String term = "Over" + "load";

        Integer obj = 1045;

        System.out.println(obj);

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        double[] metrics = new double[1000];

        int total = 0;

        for(int val: primes)
            total += val;

        System.out.println(total);


        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        double age = input.nextDouble();

        System.out.print("Enter maximum heart rage: ");
        double rate = input.nextDouble();

        double fb = (rate - age) * 0.65;

        System.out.println("Ideal fat-burning rate: " + fb);



    }
}
