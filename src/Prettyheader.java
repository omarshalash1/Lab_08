public class Prettyheader {
    public static void main(String[] args) {
        String message = "Message Centered Here";
        prettyHeader(message);
    }

    // Method to create a pretty header with a centered message
    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgWidth = msg.length();
        int starsWidth = (totalWidth - msgWidth - 6) / 2;

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");
        for (int i = 0; i < starsWidth; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < starsWidth; i++) {
            System.out.print(" ");
        }
        if (msgWidth % 2 == 1) {
            System.out.print(" ");
        }
        System.out.println("***");

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
    }
}
