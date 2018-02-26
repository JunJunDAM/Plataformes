package cat.flx.plataformes;

class Input {
    private boolean left, right, jump, pause;

    // FAST SETTERS

    void goLeft() { left = true; right = false; }
    void goRight() { left = false; right = true; }
    void stopLR() { left = right = false; }
    void stop() { left = right = jump = false; }

    void jump() { jump = true; }
    void clearJump() { jump = false; }

    void pause() { pause = true; }
    void clearPause() { pause = false; }

    // FAST GETTERS

    boolean isLeft() { return left; }
    boolean isRight() { return right; }

    boolean isJump() { return jump; }
    boolean isJumpL() { return jump & left; }
    boolean isJumpR() { return jump & right; }
    boolean isJumpU() { return jump & !left & !right; }

    boolean isPause() { return pause; }

    boolean isStoppedLR() { return !left & !right; }
    boolean isStopped() { return !left & !right & !jump; }

    // needed for keyboard input
    private boolean keyboard;
    void setKeyboard(boolean keyboard) { this.keyboard = keyboard; }
    boolean isKeyboard() { return keyboard; }
}
