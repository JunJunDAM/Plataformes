package cat.flx.plataformes;

/**
 * Created by alu2015059 on 26/02/2018.
 */

public class Coin extends Character {

    Coin(GameEngine gameEngine, int x, int y) {
        super(gameEngine, x, y);
    }

    private static final int [][] ANIMATIONS = new int[][]{
            new int[] {29, 30, 31, 32, 33}
    };

     @Override
     int [][] getAnimations(){
         return ANIMATIONS;
     }
}
