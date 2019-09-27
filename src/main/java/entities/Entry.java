package entities;

public class Entry {
    private String table;
    private String word;
    private String transcription;
    private String translation;
    private String example;

    public Entry(String table, String word, String transcription, String translation, String example) {
        this.table = table;
        this.word = word;
        this.transcription = transcription;
        this.translation = translation;
        this.example = example;
    }

    public String getTable() {
        return table;
    }

    public String getWord() {
        return word;
    }

    public String getTranscription() {
        return transcription;
    }

    public String getTranslation() {
        return translation;
    }

    public String getExample() {
        return example;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public void setExample(String example) {
        this.example = example;
    }

}
