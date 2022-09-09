import java.util.Scanner;

public class SuperGreeter {
    public void start() {
        System.out.println("Det virker!");
    }

    public static void main(String[] args) {
       SuperGreeter sg = new SuperGreeter();
       sg.start();
       sg.greet();

    }
    Scanner scanner = new Scanner(System.in);

    public void greet(){
        System.out.println("Indtast navn");
        String navn = scanner.next();
        System.out.println("Navn; " + navn);
        System.out.println("Du er: " + alder() + "år gammel");
    }
    public int alder(){
        System.out.println("Indtast alder");
        int alder = scanner.nextInt();
        return alder;

    }


}
