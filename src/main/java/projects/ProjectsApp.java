package projects;

import projects.dao.DbConnection;

/**
 * @author Holger
 *
 */
public class ProjectsApp {

   public static void main(String[] args) {
      DbConnection.getConnection();
   }

}
