package fr.p10.miage.rps.model;

/**
 * Created by OOussema on 03/10/2016.
 */

//Conseil : papier = PAPER

public class RockPaperScissors {

    public RockPaperScissors() {
    }

    Result play(RPSEnum p1, RPSEnum p2){
        if(p1.equals(p2)) return Result.TIE;

        if(p1.equals(RPSEnum.PAPER))
            if(p2.equals(RPSEnum.ROCK))
                return Result.WIN;
            else
                return Result.LOST;

        if(p1.equals(RPSEnum.ROCK))
            if(p2.equals(RPSEnum.PAPER))
                return Result.LOST;
            else
                return Result.WIN;

        if(p1.equals(RPSEnum.SCISSORS))
            if(p2.equals(RPSEnum.PAPER))
                return Result.WIN;
            else
                return Result.LOST;

        else
            return Result.LOST;
    }

}
