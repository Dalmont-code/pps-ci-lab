public class Cat {
    private int lives = 9;

    public void hiss() {
        System.out.println("HISSSSSSSSSS");
    }

    public void meow() {
        System.out.println("MEOW");
    }

    public int getLives() {
        return lives;
    }

    public void die() {
        lives = lives - 1;
        if (lives <= 0) {
            System.out.println("Meow :C");
        }
    }
}
