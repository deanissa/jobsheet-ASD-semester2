public class GameScavenger {
        String question;
        String answer;
        GameScavenger next;
    
        public GameScavenger(String question, String answer) {
            this.question = question;
            this.answer = answer;
            this.next = null;
        }   
}
