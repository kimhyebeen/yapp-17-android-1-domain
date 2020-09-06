public class PostColor {
    private String colors;
    private Feel feel;

    PostColor(String colors, Feel feel) {
        this.colors = colors;
        this.feel = feel;
    }

    public String getColors() {
        return this.colors;
    }

    public Feel getFeel() {
        return this.feel;
    }
}
