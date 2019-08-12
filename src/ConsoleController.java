import java.util.*;

public class ConsoleController {
    Category komandoska = new Category("komandoska", 8);
    Category szeregowa = new Category("szeregowa", 7);
    Category juniorka = new Category("juniorka", 6);
    Category starterka = new Category("starterka", 5);

    Girl komandoska1 = new Girl("komandoska1", komandoska);
    Girl komandoska2 = new Girl("komandoska2", komandoska);
    Girl komandoska3 = new Girl("komandoska3", komandoska);
    Girl szeregowa1 = new Girl("szeregowa1", szeregowa);
    Girl szeregowa2 = new Girl("szeregowa2", szeregowa);
    Girl szeregowa3 = new Girl("szeregowa3", szeregowa);
    Girl szeregowa4 = new Girl("szeregowa4", szeregowa);
    Girl szeregowa5 = new Girl("szeregowa5", szeregowa);
    Girl szeregowa6 = new Girl("szeregowa6", szeregowa);
    Girl szeregowa7 = new Girl("szeregowa7", szeregowa);
    Girl juniorka1 = new Girl("juniorka1", juniorka);
    Girl juniorka2 = new Girl("juniorka2", juniorka);
    Girl juniorka3 = new Girl("juniorka3", juniorka);
    Girl juniorka4 = new Girl("juniorka4", juniorka);
    Girl juniorka5 = new Girl("juniorka5", juniorka);
    Girl starterka1 = new Girl("starterka1", starterka);
    Girl starterka2 = new Girl("starterka2", starterka);
    Girl starterka3 = new Girl("starterka3", starterka);
    Girl starterka4 = new Girl("starterka4", starterka);
    Girl starterka5 = new Girl("starterka5", starterka);

    List<Girl> starterki = new ArrayList<>(Arrays.asList(starterka1, starterka2, starterka3, starterka4, starterka5));
    List<Girl> juniorki = new ArrayList<>(Arrays.asList(juniorka1, juniorka2, juniorka3, juniorka4, juniorka5));
    List<Girl> szeregowe = new ArrayList<>(Arrays.asList(szeregowa1, szeregowa2, szeregowa3, szeregowa4,
            szeregowa5, szeregowa6, szeregowa7));
    List<Girl> komandoski = new ArrayList<>(Arrays.asList(komandoska1, komandoska2, komandoska3));

    Group gamerki = new Group("gamerki", new ArrayList<>());
    Group heroski = new Group("heroski", new ArrayList<>());
    Group kosmonautki = new Group("kosmonautki", new ArrayList<>());
    Group zonyHollywood = new Group("zonyHollywood", new ArrayList<>());

    void action() {
        Collections.shuffle(starterki);
        Collections.shuffle(juniorki);
        Collections.shuffle(szeregowe);
        Collections.shuffle(komandoski);

        List<Girl> allGirls = new ArrayList<>();
        allGirls.addAll(komandoski);
        allGirls.addAll(szeregowe);
        allGirls.addAll(juniorki);
        allGirls.addAll(starterki);
        System.out.println("all girls: " + allGirls.toString());

        List<Group> groups = new ArrayList<>(Arrays.asList(gamerki, heroski, kosmonautki, zonyHollywood));

        int position = 0;
        for (int k = 0; k < 5; k++) {
            System.out.println("Kolejka " + k);
            Collections.shuffle(groups);
            groups.sort(Comparator.comparing(Group::getPoints));

            for (Group group : groups) {
                Girl girl = allGirls.get(position);
                int point = group.getPoints() + girl.getCategory().getPoints();
                group.getGirls().add(girl);
                group.setPoints(point);
                position++;
            }

            for (Group group : groups) {
                System.out.println(group);
            }
        }
    }
}
