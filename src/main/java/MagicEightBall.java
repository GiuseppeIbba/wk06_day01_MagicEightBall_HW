import java.util.ArrayList;
import java.util.Collections;

public class MagicEightBall {

    private ArrayList<String> answers;

    public MagicEightBall(ArrayList<String> answers){
        this.answers = answers;
    }


    public int answerCount() {
        return this.answers.size();
    }

    public String randomAnswer() {
        Collections.shuffle(this.answers);
        return answers.get(0);
    }


    public void addAnswer(String answer) {
        answers.add(answer);
    }


    public void removeAnswer(int index) {
        this.answers.remove(2);
    }
}

