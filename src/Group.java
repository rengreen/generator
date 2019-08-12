import java.util.List;

public class Group {
    private String name;
    private List<Girl> girls;
    private int points;

    public Group(String name, List<Girl> girls) {
        this.name = name;
        this.girls = girls;
    }

    public Group(String name, List<Girl> girls, int points) {
        this.name = name;
        this.girls = girls;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Girl> getGirls() {
        return girls;
    }

    public void setGirls(List<Girl> girls) {
        this.girls = girls;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", girls=" + girls +
                ", points=" + points +
                '}';
    }
}
