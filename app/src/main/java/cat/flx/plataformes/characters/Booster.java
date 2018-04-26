package cat.flx.plataformes.characters;

import cat.flx.plataformes.GameEngine;

public class Booster extends Character
{
    public Booster(GameEngine gameEngine, int x, int y)
    {
        super(gameEngine, x, y);
    }

    @Override
    int[][] getAnimations()
    {
        return ANIMATIONS;
    }

    private static final int[][] ANIMATIONS = new int[][]{
            new int[]{54,52,53,55}
    };

    @Override
    void updatePhysics(int delta)
    {

    }

    @Override
    void updateCollisionRect()
    {
        collisionRect.set(x, y, x + 16, y + 16);
    }
}
