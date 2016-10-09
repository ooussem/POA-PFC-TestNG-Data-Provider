package fr.p10.miage.rps.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by OOussema on 03/10/2016.
 */

public class Player {
    private String nom;
    private int score;
    private List<RPSEnum> listMovement;
    private final int min = 0;
    private final int max = 2;
    private final int nbreMvt = 20;

    public Player(String nom, List<RPSEnum> pListMovement) {
        this.nom = nom;
        this.listMovement = new ArrayList<RPSEnum>();
        this.listMovement.addAll(pListMovement);
    }

    public Player(String nom) {
        this.nom = nom;
        this.listMovement = movementRandom();
    }

    public List<RPSEnum> movementRandom()
    {
        List<RPSEnum> listMovementRand = null;
        try {
            int n;
            listMovementRand = new ArrayList<RPSEnum>();
            for (int i = 0; i < this.nbreMvt; i++)
            {
                n = (min + (int) (Math.random() * ((max - min) + 1)));
                switch (n)
                {
                    case 0:listMovementRand.add(RPSEnum.PAPER); break;
                    case 1:listMovementRand.add(RPSEnum.ROCK); break;
                    case 2:listMovementRand.add(RPSEnum.SCISSORS); break;
                    default:listMovementRand.add(null);
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listMovementRand;
    }

    public RPSEnum getNextMove()
    {
        RPSEnum rpsEnum = null;

        for(RPSEnum rps : this.listMovement)
        {
            rpsEnum = rps;
            return rps;
        }
        return rpsEnum;
    }



    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public int getNbreMvt() {
        return nbreMvt;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
