package lt.verbus;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Tree> mixedTrees = Arrays.asList(new Birch(), new Juniper(), new Oak(), new Pine(), new Spruce());
        List<Coniferous> coniferousTrees = Arrays.asList(new Juniper(), new Pine(), new Spruce());
        List<Birch> birchTrees = Arrays.asList(new Birch(), new Birch(), new Birch());

        Forest.mixedForest(mixedTrees);
        Forest.coniferousForest(coniferousTrees);
        Forest.birchForest(birchTrees);
    }
}
