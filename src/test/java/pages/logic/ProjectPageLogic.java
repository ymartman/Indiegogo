package pages.logic;

import driver.DriverManager;
import pages.ProjectPage;

public class ProjectPageLogic {

    private ProjectPage projectPage = new ProjectPage(DriverManager.currentDriver());

    public ProjectPage get(){
        return this.projectPage;
    }

}
