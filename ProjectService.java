package Project.Service;

import java.util.List;
import java.util.NoSuchElementException;

import Project.Dao.ProjectDao;
import Project.entity.Project;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	
	}

	public Project fetchProjectById(Integer projectId) {
		
	return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException(
			"Project with project ID=" + projectId + " does not exist." ));
	
	}

	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}
}
