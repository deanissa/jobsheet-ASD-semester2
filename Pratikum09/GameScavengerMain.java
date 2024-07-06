public class GameScavengerMain {
    public static void main(String[] args) {
        LinkedList game = new LinkedList();

        game.addPoint("Hasil dari perkalian 2 x 5 ?", "10");
        game.addPoint("Apakah sapi memiliki kak 4? (IYA / TIDAK)", "IYA");
        game.addPoint("Berapakah jumlah provinsi di Indonesia?", "38");

        // Mulai permainan
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Selamat datang di Game Scavenger Hunt!");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        String result = game.playGame();
        System.out.println(result);
    }
}
