package fr.parisnanterre.miage.rps.model;

public enum Play {
    PAPER, ROCK, SCISSORS;

    protected static Play Random (int x){
        switch(x){
            case 1 :
                return Play.SCISSORS;
            case 2 :
                return Play.ROCK;
            default:
                return Play.PAPER;
        }
    }

    public static Play Hasard(){
        int random = (int) (Math.random()*5);
        return Random(random);
    }
}