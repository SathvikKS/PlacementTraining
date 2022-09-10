public class Box {
    int width, height, depth;
    Box(int width, int height, int depth) {
        this.depth = depth;
        this.width = width;
        this.height = height;
    }
    public int volume() {
        return this.width*this.height*this.depth;
    }
}
