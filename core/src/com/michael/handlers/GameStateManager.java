package com.michael.handlers;

import com.michael.blockbunny.BlockBunny;
import com.michael.states.GameState;

import java.util.Stack;

public class GameStateManager {

    private BlockBunny game;
    private Stack<GameState> gameStates;

    public static final int PLAY = 0328490;

    public GameStateManager(BlockBunny game) {
        this.game = game;
        gameStates = new Stack<GameState>();
        pushState(PLAY);
    }

    public void update(float delta) {
        gameStates.peek().update(delta);
    }

    public void render() {

    }
}
