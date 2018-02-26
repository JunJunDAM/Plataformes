package cat.flx.plataformes;

import android.graphics.Canvas;
import android.graphics.Paint;

class Character {
    GameEngine gameEngine;
    int x, y, state, sprite;
    private Paint paint;

    int getX() { return x; }
    int getY() { return y; }
    int getState() { return state; }

    Character(GameEngine gameEngine, int x, int y) {
        this.gameEngine = gameEngine;
        this.x = x;
        this.y = y;
        this.state = 0;
        this.sprite = 0;
        this.paint = new Paint();
    }

    int[][] getAnimations() { return null; }

    void physics(int delta) { }

    void draw(Canvas canvas) {
        try {
            int[] animation = getAnimations()[state];
            int bitmap = animation[sprite];
            canvas.drawBitmap(gameEngine.getBitmap(bitmap), x, y, paint);
            sprite++;
            sprite %= animation.length;
        }
        catch (Exception ignored) { }
    }

}