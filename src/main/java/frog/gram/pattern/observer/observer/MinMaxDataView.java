package frog.gram.pattern.observer.observer;

import frog.gram.pattern.observer.subject.ScoreRecord;

import java.util.Collections;
import java.util.List;

/**
 * Created by heesu on 2017-02-28.
 */
public class MinMaxDataView implements Observer {
    private ScoreRecord scoreRecord;

    public MinMaxDataView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScores(record);
    }

    private void displayScores(List<Integer> record) {
        System.out.println("Min " + Collections.min(record) + ", Max " + Collections.max(record));
    }
}
