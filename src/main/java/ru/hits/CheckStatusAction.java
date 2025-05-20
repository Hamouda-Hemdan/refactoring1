package ru.hits;

public abstract class CheckStatusAction implements IAction{
    @Override
    public GameState handelAction(GameState state){

        System.out.println("HP: " + state.playerHp() + "/" + state.playerMaxHp() + ", Level: " + state.playerLevel() + ", EXP: " + state.playerExp());
        System.out.println("Inventory: " + state.inventory());
        return state;
    }

}
