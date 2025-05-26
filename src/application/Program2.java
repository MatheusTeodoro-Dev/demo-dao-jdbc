package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("Test 1: Department Find By ID");
		Department department = departmentDao.findById(3);
		
		System.out.println(department);
		
		System.out.println("\nTest 2: Department FindALL");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\nTest 3: Department Insert");
		Department dep = new Department(null, "Games");
		departmentDao.insert(dep);
		System.out.println("Dep insertion realized");
		
		System.out.println("\nTest 4: Department Update");
		dep = departmentDao.findById(6);
		dep.setName("Cinema");
		departmentDao.update(dep);
		System.out.println("Updated!");
		
		System.out.println("\nTest 4: Department Delete");
		departmentDao.deleteById(11);
		System.out.println("Id " + 11 + " deleted");
	}

}
