public class dragonMain {
        public static void main(String[] args) {
            // Membuat objek Dragon dengan posisi awal (3, 4) 
            // Dan area dimensi permainan (10x10)
            Dragon dragon = new Dragon(3, 4, 10, 10);
    
            // Memindahkan Dragon dan cetak posisi
            dragon.moveLeft();
            dragon.printPosition(); // Posisi Dragon (2, 4)
    
            dragon.moveUp();
            dragon.printPosition(); // Posisi Dragon (2, 3)
    
            dragon.moveRight();
            dragon.printPosition(); // Posisi Dragon (3, 3)
    
            dragon.moveDown();
            dragon.printPosition(); // Posisi Dragon (3, 4)
    
            dragon.moveDown(); 
        }
    }
