package yulongproductions.com.thelabyrinth.model;


/**
 * Created by Yulong on 7/25/2015.
 */
public class Page {
    private int imageId;
    private int soundId;
    private String text;
    private Choice choice1;
    private Choice choice2;
    private boolean isFinal = false;
    private boolean isOneChoice = false;

    // Final Page / Death constructor
    public Page (int imageId, int soundId, String text) {
        this.isOneChoice = false;
        this.imageId = imageId;
        this.text = text;
        this.choice1 = null;
        this.choice2 = null;
        this.isFinal = true;
    }

    // Constructor if page needs an image
    public Page(int imageId, int soundId, String text, Choice c1, Choice c2) {
        this.isOneChoice = false;
        this.imageId = imageId;
        this.text = text;
        this.choice1 = c1;
        this.choice2 = c2;
    }

    // EXPERIMENTAL: Constructor used for simply continuing to the next page if text is too long
    // Use the set invisibility option with the text "continue to next page"
    public Page(int imageId, int soundId, String text, Choice choice) {
        this.isOneChoice = true;
        this.imageId = imageId;
        this.text = text;
        this.choice1 = null;
        this.choice2 = choice;
    }

    public int getImageId() {
        return this.imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getSoundId() {
        return this.soundId;
    }

    public void setSoundId(int soundId) {
        this.soundId = soundId;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Choice getChoice1() {
        return this.choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return this.choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }

    public boolean isFinal() {
        return this.isFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public boolean isOneChoice() {
        return this.isOneChoice;
    }

    public void setIsOneChoice(boolean isOneChoice) {
        this.isOneChoice = isOneChoice;
    }

    public boolean doesNotExist() {
        return this.getText() == null;
    }
}
