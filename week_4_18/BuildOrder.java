package week_4_18;

import java.util.ArrayList;
import java.util.List;


public class BuildOrder {
    
    private List<Project> projects;
    private List<String> buildOrder;
    
    public BuildOrder() {
        projects = new ArrayList<>();
        buildOrder = new ArrayList<>();
    }
    
    public void showBuildOrder(String[] projectNames, List<String[]> dependencies) {
        
        for (int i = 0; i < projectNames.length; i++) {
            buildOrder.add(projectNames[i]);
        }
        
        createProjects(dependencies);
        
//        if (checkForError()) {
//            System.out.println("Dependency Error");
//            return;
//        }
        
        while (buildOrder.size() < projectNames.length) {
            for (int i = 0; i < projects.size(); i++) {
                Project project = projects.get(i);
                if (!project.isInBuildOrder()) {
                    List<String> projectDependencies = project.getDependencies();
                    int matchCount = 0;
                    for (int j = 0; j < buildOrder.size(); j++) {
                        for (int k = 0; k < projectDependencies.size(); k++) {
                            if (projectDependencies.get(k).equals(buildOrder.get(j))) {
                                matchCount++;
                            }
                        }
                        if (matchCount == projectDependencies.size()) {
                            buildOrder.add(project.getName());
                            project.setInBuildOrder();
                            break;
                        }
                    }
                }
                
            }
        }
        
        for (int i = 0; i < buildOrder.size() - 1; i++) {
            System.out.print(buildOrder.get(i) + ", ");
        }
        System.out.print(buildOrder.get(buildOrder.size()-1));
        
    }
    
    private void createProjects(List<String[]> dependencies) {
        
        projects.add(new Project(dependencies.get(0)[1], dependencies.get(0)[0]));
        
        for (int i = 1; i < dependencies.size(); i++) {
            
            String name = dependencies.get(i)[1];
            String dependency = dependencies.get(i)[0];
            boolean projectListed = false;
            
            for (int j = 0; j < buildOrder.size(); j++) {
                if (buildOrder.get(j).equals(name)) {
                    buildOrder.remove(j);
                    break;
                }
            }

            for (int j = 0; j < projects.size(); j++) {
                Project project = projects.get(j);
                if (project.getName().equals(name)) {
                    project.addDependency(dependency);
                    projectListed = true;
                    break;
                }
            }
            
            if (projectListed == false) {
                projects.add(new Project(name, dependency));
            }
            
        } 
        
    }
    
//    private boolean checkForError() {
//        
//        List<String> projectNames = new ArrayList<>();
//        
//        for (Project project : projects) {
//            projectNames.add(project.getName());
//        }
//        
//        for (int i = 0; i < projects.size(); i++) {
//            List<String> visited = new ArrayList<>();
//            Project project = projects.get(i);
//            String name = project.getName();
//            visited.add(name);
//            while (project.getDependencies().contains(project));
//        }
//        return false;
//    }
    
}
