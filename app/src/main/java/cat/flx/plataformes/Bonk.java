package cat.flx.plataformes;

import android.graphics.Canvas;

class Bonk extends Character {

    public Bonk(GameEngine gameEngine, int x, int y) {
        super(gameEngine, x, y);
    }

    private static final int[][] ANIMATIONS = new int[][] {
            new int[] { 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12,
                        12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 14 },   // 0 = STANDING
            new int[] { 6, 7, 8, 9 },                                       // 1 = WALKING LEFT
            new int[] { 0, 1, 2, 3 },                                       // 2 = WALKING RIGHT
    };
    @Override int[][] getAnimations() { return ANIMATIONS; }

    @Override void physics(int delta) {
        int newState;
        Input input = gameEngine.getInput();
        if (input.isLeft()) {
            x = Math.max(x - 2, 0);
            newState = 1;
        }
        else if (input.isRight()) {
            x = Math.min(x + 2, gameEngine.getScene().getWidth() - 24);
            newState = 2;
        }
        else {
            newState = 0;
        }
        if (input.isJump()) {
            y += 2;
            input.clearJump();
        }
        if (input.isKeyboard()) {
            input.stopLR();
            input.setKeyboard(false);
        }
        if (newState != state) {
            state = newState;
            sprite = 0;
        }
    }

}

