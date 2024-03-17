public class Dragon {

    int x, y, width, height;

    public Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    //moveLeft x berkurang 1
    void moveLeft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision();
        }
    }
    //moveRight x bertambah 1
    void moveRight() {
        if (x < width) {
            x++;
        } else {
            detectCollision();
        }
    }
    //moveUp y bertambah 1
    void moveUp() {
        if (y > 0) {
            y--;
        } else {
            detectCollision();
        }
    }
    //moveDown y bertambah 1
    void moveDown() {
        if (y < height) {
            y++;
        } else {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Dragon di posisi : (" + x + ", " + y + ")");
    }

    void detectCollision() {
        System.out.println("Game Over");
    }
}
