public class PostColor {
    private Emotion emotion;
    private Colors colors;

    PostColor(Colors colors, Emotion emotion) {
        this.emotion = emotion;
        this.colors = colors;
    }

    public Colors getColors() {
        return this.colors;
    }

    public Emotion getEmotion() {
        return this.emotion;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }
}
