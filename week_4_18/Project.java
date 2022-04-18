package week_4_18;

import java.util.ArrayList;
import java.util.List;

public class Project {
    
    private String name;
    private List<String> dependencies;
    private boolean inBuildOrder;
    
    public Project(String name, String dependency) {
        this.name = name;
        dependencies = new ArrayList<>();
        addDependency(dependency);
        inBuildOrder = false;
    }
    
    public void addDependency(String dependency) {
        dependencies.add(dependency);
    }
    
    public String getName() {
        return name;
    }
    
    public List<String> getDependencies() {
        return dependencies;
    }
    
    public boolean isInBuildOrder() {
        return inBuildOrder;
    }
    
    public void setInBuildOrder() {
        inBuildOrder = true;
    }
    
}
