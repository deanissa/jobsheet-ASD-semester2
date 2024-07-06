import java.util.Scanner;
public class LinkedList {
    private GameScavenger head;

    public LinkedList() {
        head = null;
    }
    public void addPoint(String question, String answer) {
        GameScavenger newPoint = new GameScavenger(question, answer);
        if (head == null) {
            head = newPoint;
        } else {
            GameScavenger current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }
    public String playGame() {
        StringBuilder result = new StringBuilder();
        GameScavenger current = head;
        Scanner scanner = new Scanner(System.in);

        while (current != null) {
            System.out.println(current.question);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(current.answer)) {
                System.out.println("Jawaban Anda benar! ");
                current = current.next;
            } else {
                System.out.println("Jawaban Anda salah. Silakan coba lagi. ");
            }
        }
        scanner.close();
        return result.toString();
}
}