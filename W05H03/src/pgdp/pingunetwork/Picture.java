package pgdp.pingunetwork;

public class Picture {
    private String location;
    private int width;
    private int height;
    private int[][] data;
    private Picture[] thumbnails;

    public Picture(String location , int[][] data){
        this.location = location;
        this.data = data;
        height = data.length;
        if(data.length > 0){
            width = data[0].length;
        }
        thumbnails = new Picture[0];
    }

    public void setThumbnails(Picture[] thumbnails) {
        this.thumbnails = thumbnails;
    }

    public Picture[] getThumbnails() {
        return thumbnails;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int[][] getData() {
        return data;
    }

    public String getLocation() {
        return location;
    }

}
