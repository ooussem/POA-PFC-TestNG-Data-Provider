package fr.p10.miage.rps.model;


import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;


/**
 * Created by OOussema on 03/10/2016.
 */
public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @BeforeClass
    public void setUp() throws Exception {
        rps  = new RockPaperScissors();
    }

    @AfterClass
    public void tearDown() throws Exception {
        rps = null;
    }

    @Test
    public void testPlay() throws Exception {

    }

    //************* DataProvider *************

    @DataProvider(name = "winData")
    public Object[][] createWinData(){
        return new Object[][]{{RPSEnum.PAPER, RPSEnum.ROCK}, {RPSEnum.ROCK,RPSEnum.SCISSORS},
                {RPSEnum.SCISSORS, RPSEnum.PAPER}};
    }

    @Test(dataProvider = "winData")
    public void testWinPlay(RPSEnum p1, RPSEnum p2) throws Exception {
        System.out.println("Test DP 1");
        assertEquals(rps.play(p1, p2), Result.WIN);
    }

    @DataProvider(name = "lostData")
    public Object[][] createLostData(){
        return new Object[][]{{RPSEnum.ROCK,RPSEnum.PAPER}, {RPSEnum.SCISSORS,RPSEnum.ROCK},
                {RPSEnum.PAPER,RPSEnum.SCISSORS}};
    }

    @Test(dataProvider = "lostData")
    public void testLostPlay(RPSEnum p1, RPSEnum p2) throws Exception {
        System.out.println("Test DP 2");
        assertEquals(rps.play(p1, p2), Result.LOST);
    }

    @DataProvider(name = "tieData")
    public Object[][] createTieData(){
        return new Object[][]{{RPSEnum.ROCK,RPSEnum.PAPER}, {RPSEnum.SCISSORS,RPSEnum.ROCK},
                {RPSEnum.PAPER,RPSEnum.SCISSORS}};
    }

    @Test(dataProvider = "tieData")
    public void testTiePlay(RPSEnum p1, RPSEnum p2) throws Exception {
        System.out.println("Test DP 2");
        assertEquals(rps.play(p1, p2), Result.TIE);
    }

    //************* Fin DataPorvider ****************




    //************* WIN *************

    @Parameters({"scissors","paper"})
    @Test
    public void testWinPlay0(String p1, String p2) throws Exception {
        System.out.println("Test 0 rock vs scissors");
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }

    @Parameters({"scissors","paper"})
    @Test
    public void testWinPlay1(String p1, String p2) throws Exception {
        System.out.println("Test 1 scissors vs paper");
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }

    @Parameters({"paper","rock"})
    @Test
    public void testWinPlay2(String p1, String p2) throws Exception {
        System.out.println("Test 2 paper vs rock");
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.WIN);
    }

    //************* TIE *********

    @Parameters({"paper","paper"})
    @Test
    public void testTiePlay1(String p1, String p2) throws Exception {
        System.out.println("Test T1 paper vs rock");
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

    @Parameters({"rock","rock"})
    @Test
    public void testTiePlay2(String p1, String p2) throws Exception {
        System.out.println("Test T2 rock vs rock");
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

    @Parameters({"scissors","scissors"})
    @Test
    public void testTiePlay3(String p1, String p2) throws Exception {
        System.out.println("Test T3 scissors vs scissors");
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.TIE);
    }

    //************** LOST ********************
    @Parameters({"scissors","rock"})
    @Test
    public void testLostPlay1(String p1, String p2) throws Exception {
        System.out.println("Test L0 rock vs scissors");
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }

    @Parameters({"paper","scissors"})
    @Test
    public void testLostPlay2(String p1, String p2) throws Exception {
        System.out.println("Test L2 0 rock vs scissors");
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }

    @Parameters({"rock","paper"})
    @Test
    public void testLostPlay3(String p1, String p2) throws Exception {
        System.out.println("Test L3 0 rock vs scissors");
        assertEquals(rps.play(RPSEnum.valueOf(p1), RPSEnum.valueOf(p2)), Result.LOST);
    }
}