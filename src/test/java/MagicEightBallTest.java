import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MagicEightBallTest {

    MagicEightBall magicEightBall;
    ArrayList<String> answers;

    @Before
    public void before() {
        answers = new ArrayList<>();
        answers.add("Probably");
        answers.add("I don't think so");
        answers.add("Ask to your mum");
        magicEightBall = new MagicEightBall(answers);
    }

    @Test
    public void answersSetupCorrectly() {
        assertEquals(3, magicEightBall.answerCount());
    }

    @Test
    public void canHaveRandomAnswer() {
       assertEquals("I don't think so", magicEightBall.randomAnswer());
    }

   @Test
    public void canAddAnswer() {
        magicEightBall.addAnswer("42");
        assertEquals(4, magicEightBall.answerCount());
   }

   @Test
    public void canRemoveAnswer() {
        magicEightBall.removeAnswer(0);
        assertEquals(2, magicEightBall.answerCount());
   }
}



