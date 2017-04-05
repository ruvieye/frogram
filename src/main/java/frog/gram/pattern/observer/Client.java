package frog.gram.pattern.observer;

import frog.gram.pattern.observer.observer.DataSheetView;
import frog.gram.pattern.observer.observer.MinMaxDataView;
import frog.gram.pattern.observer.subject.ScoreRecord;

/**
 * Created by heesu on 2017-02-28.
 */
public class Client {

    public static void main(String args[]) {
        ScoreRecord scoreRecord = new ScoreRecord();

        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
        MinMaxDataView minMaxDataView = new MinMaxDataView(scoreRecord);
        try {
            //옵저버 등록
            scoreRecord.attach(dataSheetView3);
            scoreRecord.attach(dataSheetView5);
            scoreRecord.attach(minMaxDataView);

            for (int i = 1; i <= 5; i++) {
                int score = i * 10;
                System.out.println("------------------------");
                System.out.println("adding score : " + score);
                scoreRecord.addScore(score);
            }
        } catch (Exception ne) {
            System.out.println("=NPE");
        }
    }
}
