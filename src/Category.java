public class Category {
    private String categoryName;
    private int points;

    public Category(String categoryName, int points) {
        this.categoryName = categoryName;
        this.points = points;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
