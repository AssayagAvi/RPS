package fr.parisnanterre.miage.rps.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @BeforeMethod
    public void setUp() {
        rps = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() {
        rps = null;
    }

    @Parameters({"papier","pierre"})
    @Test()
    public void testWinPlay(String p1 , String p2) {
        assertEquals(rps.play(Play.valueOf(p1),Play.valueOf(p2)),Result.WIN);
    }
    @Parameters({"papier","papier"})
    @Test()
    public void testTiePlay (String p1, String p2){
        assertEquals(rps.play(Play.valueOf(p1),Play.valueOf(p2)),Result.TIE);
    }

    @Parameters({"pierre","papier"})
    @Test()
    public void testLostPlay (String p1, String p2){
        assertEquals(rps.play(Play.valueOf(p1),Play.valueOf(p2)),Result.LOST);
    }

    @Test(dataProvider = "winData ")
        public Object [][] createWinData(){
            return new Object [][]{
                    {Play.PAPER , Play.ROCK},
                    {Play.ROCK , Play.SCISSORS},
                    {Play.SCISSORS , Play.PAPER}
            };
        }


    @Test(dataProvider = "tieData ")
    public Object [][] createTieData(){
        return new Object [][]{
                {Play.PAPER , Play.PAPER},
                {Play.ROCK , Play.ROCK},
                {Play.SCISSORS , Play.SCISSORS}
        };
    }

    @Test(dataProvider = "lostData ")
    public Object [][] createLostData(){
        return new Object [][]{
                {Play.PAPER , Play.SCISSORS},
                {Play.ROCK , Play.PAPER},
                {Play.SCISSORS , Play.ROCK}
        };
    }









//fin de la classe
}


