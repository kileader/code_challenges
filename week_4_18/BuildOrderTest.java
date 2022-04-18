package week_4_18;

import java.util.ArrayList;
import java.util.List;

/*
Build Order: You are given a list of projects and a list of dependencies 
(which is a list of pairs of projects, where the second project is dependent on the first project).
All of a project's dependencies must be built before the project is. Find a build order that will allow the projects to be built.
If there is no valid build order, return an error.
Example:
Input:
projects: a, b, c, d, e, f
dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)
Output: f, e, a, b, d, c
 */
public class BuildOrderTest {

    public static void main(String args[]) {
        BuildOrder bo = new BuildOrder();
        String[] projectNames = {"a", "b", "c", "d", "e", "f"};
        List<String[]> dependencies = new ArrayList<>();
        dependencies.add(new String[] {"a", "d"});
        dependencies.add(new String[] {"f", "b"});
        dependencies.add(new String[] {"b", "d"});
        dependencies.add(new String[] {"f", "a"});
        dependencies.add(new String[] {"d", "c"});
        bo.showBuildOrder(projectNames, dependencies);
//        
//        System.out.println();
//        
//        BuildOrder boError = new BuildOrder();
//        String[] projectNames2 = {"a", "b", "c"};
//        List<String[]> dependencies2 = new ArrayList<>();
//        dependencies2.add(new String[] {"a", "b"});
//        dependencies2.add(new String[] {"b", "c"});
//        dependencies2.add(new String[] {"c", "a"});
//        boError.showBuildOrder(projectNames2, dependencies2);
    }
    
}
