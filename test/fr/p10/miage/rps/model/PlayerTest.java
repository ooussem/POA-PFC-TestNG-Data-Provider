package fr.p10.miage.rps.model;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.annotations.*;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by OOussema on 09/10/2016.
 */
public class PlayerTest {

    Player player;
    @BeforeClass
    public void setUp() throws Exception {
        player = new Player("Boby");
    }

    @AfterClass
    public void tearDown() throws Exception {
        player = null;
    }

    @Test
    public void testMovementRandom() throws Exception {
        List<RPSEnum> rpsEna = player.movementRandom();
        for(RPSEnum rps : rpsEna){
            System.out.println(rps);
        }
    }

    @Test(enabled = false)
    public void testGetNextMove() throws Exception {

    }

    @Test
    public void testGetNom() throws Exception {
        assertEquals(player.getNom(),"Boby");
    }

    @Test(enabled = false)
    public void testGetScore() throws Exception {

    }

    @Test
    public void testGetNbreMvt() throws Exception {
        assertEquals(player.getNbreMvt(),20,0.0);
    }

    @Test
    public void testSetScore() throws Exception {
        player.setScore(5);
        assertEquals(player.getScore(),5,0.00);
    }

}