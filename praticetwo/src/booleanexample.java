public class booleanexample {
    public static void main(String[] args) {
        canFly(true);
        canFly(false);
    }

    public static void canFly(boolean isbird) {
        if (isbird == true) {
            System.out.println("can fly");
        } else {
            System.out.println("cannot fly");
        }

    }
}

