package frog.gram.pattern.observer.observer;

import frog.gram.pattern.observer.subject.ScoreRecord;

import java.util.List;

/**
 * Created by heesu on 2017-02-28.
 */
public class DataSheetView implements Observer {
    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScores(record, viewCount);
    }

    private void displayScores(List<Integer> record, int viewCount) {
        System.out.println("List of " + viewCount + "entries: ");
        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.println("" + record.get(i));

        }
        System.out.println("");
    }
}
