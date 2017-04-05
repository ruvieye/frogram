package frog.gram.pattern.observer.subject;


import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by heesu on 2017-02-28.
 */
public class ScoreRecord extends Subject {
    private List<Integer> scores = new ArrayList<Integer>();

    public void addScore(int score) {
        scores.add(score);
        notifyObservers();
    }

    @Nonnull
    public List<Integer> getScoreRecord() {
        if (scores != null && scores.size() == 3) {
            return null;
        }
        return scores;

    }
}
