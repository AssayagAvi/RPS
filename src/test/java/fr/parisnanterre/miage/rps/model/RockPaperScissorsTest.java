package fr.parisnanterre.miage.rps.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

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


    @Test(dataProvider = "winData")
    public void testWinPlay(Play p1 , Play p2) {
        assertEquals(rps.play(p1,p2),Result.WIN);
    }

    @DataProvider (name= "winData")
        public Object [][] createWinData(){
            return new Object [][]{
                    {Play.PAPER , Play.ROCK},
                    {Play.ROCK , Play.SCISSORS},
                    {Play.SCISSORS , Play.PAPER}
            };
        }


    @DataProvider (name= "tieData")
    public Object [][] createTieData(){
        return new Object [][]{
                {Play.PAPER , Play.PAPER},
                {Play.ROCK , Play.ROCK},
                {Play.SCISSORS , Play.SCISSORS}
        };
    }
    @Test(dataProvider = "tieData")
    public void testTiePlay (Play p1, Play p2){
        assertEquals(rps.play(p1,p2),Result.TIE);
    }


    @DataProvider (name= "lostData")
    public Object [][] createLostData(){
        return new Object [][]{
                {Play.PAPER , Play.SCISSORS},
                {Play.ROCK , Play.PAPER},
                {Play.SCISSORS , Play.ROCK}
        };
    }
    @Test(dataProvider = "lostData")
    public void testLostPlay (Play p1, Play p2){
        assertEquals(rps.play(p1, p2),Result.LOST);
    }










//fin de la classe
}


