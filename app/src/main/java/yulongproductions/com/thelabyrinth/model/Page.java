package yulongproductions.com.thelabyrinth.model;

/**
 * Created by Yulong on 7/25/2015.
 */
public class Page {
    private int imageId;
    private String text;
    private Choice choice1;
    private Choice choice2;
    private boolean isFinal = false;

    // Final Page / Death constructor
    public Page (int imageId, String text) {
        this.imageId = imageId;
        this.text = text;
        this.choice1 = null;
        this.choice2 = null;
        this.isFinal = true;
    }

    // Constructor if page needs an image
    public Page(int imageId, String text, Choice c1, Choice c2) {
        this.imageId = imageId;
        this.text = text;
        this.choice1 = c1;
        this.choice2 = c2;
    }

    // Constructor if page doesn't need an image
    public Page(String text, Choice c1, Choice c2) {
        this.text = text;
        this.choice1 = c1;
        this.choice2 = c2;
    }

    public int getImageId() {
        return this.imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
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
}
