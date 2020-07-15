package lt.verbus;

import java.util.List;

public class Forest <T extends Tree > {

    public static void mixedForest(List<? extends Tree> mixedTrees){
        printSeparator();
        System.out.println("This is a mixed forest:");
        for (Tree tree: mixedTrees) {
            tree.describe();
        }
    }

    public static void coniferousForest(List<? extends Coniferous> coniferousTrees){
        printSeparator();
        System.out.println("This is a coniferous forest:");
        for (Tree tree: coniferousTrees) {
            tree.describe();
        }
    }
    public static void birchForest(List<Birch> birchTrees){
        printSeparator();
        System.out.println("This is birch forest:");
        for (Tree tree: birchTrees) {
            tree.describe();
        }
    }

    private static void printSeparator() {
        System.out.println("");
        System.out.println("----------------------------");
    }

}
