package fr.parisnanterre.miage.rps.model;


public class RockPaperScissors {

    public RockPaperScissors() {

    }

    public Result play (Play p1, Play p2) {
        switch (p1) {
            case ROCK:
                switch (p2) {
                    case ROCK:
                        return Result.TIE;
                    case PAPER:
                        return Result.LOST;
                    case SCISSORS:
                        return Result.WIN;
                }
            case SCISSORS:
                switch (p2) {
                    case ROCK:
                        return Result.LOST;
                    case PAPER:
                        return Result.WIN;
                    case SCISSORS:
                        return Result.TIE;
                }
            case PAPER:
                switch (p2) {
                    case ROCK:
                        return Result.WIN;
                    case PAPER:
                        return Result.TIE;
                    case SCISSORS:
                        return Result.LOST;
                }
        }
        return null;
    }
}

