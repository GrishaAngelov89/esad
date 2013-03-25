package esad.chapter3.task2;

/**
 * @author: grisha_angelov
 */
public class SurveyData {
    DataType rawData = new DataType("raw.dat", true);
    DataType cleanedUpData = new DataType("cleanedUp.dat", true);
    DataType processedData = new DataType("processed.dat", true);
    DataType publicationData = new DataType("publication.dat", false);

    //..........
}

class DataType {
    String targetPath;
    boolean isFileHidden;
    final String dir = "c:/application/data/";

    DataType(String file, boolean fileHidden) {
        this.targetPath = dir + file;
        isFileHidden = fileHidden;
    }
}