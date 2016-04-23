package com.sr.resource;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.restlet.data.Form;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.sr.bo.StudentBO;
import com.sr.model.Student;

@Controller
@Scope("prototype")
public class StudentResource extends ServerResource{
	
	Logger log = Logger.getLogger(StudentResource.class);
	
	private Integer id;	
	
	@Autowired
	private StudentBO studentBO;
	
	public void setStudentBO(StudentBO studentBO) {
		this.studentBO = studentBO;
	}

	@Override
	protected void doInit() throws ResourceException {
		Map<String, Object> requestparams = getRequestAttributes();
		Iterator it = requestparams.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry<String, Object> entry = (Entry<String, Object>) it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue().toString());
		}
		
		id = Integer.valueOf((String) getRequestAttributes().get("studentId"));
		Form f = getQuery();
		System.out.println(f.getFirstValue("name"));
	}
	
	
	
	
	@Get("json")
	public Student findStudentById(){
		Student s = this.studentBO.getStudent(id);
		log.debug("name : " + getRequestAttributes().get("name"));
		log.debug("------------------------------------" + id);
//		ObjectMapper om = new ObjectMapper();
		return s;
	}
	
	
	
	@Delete("json")
	public Integer deleteStudentById() {
		return this.studentBO.removeStudent(id);
	}

	@Put("json")
	public Integer updateStudent(Student student) {
		student.setId(id);
		return this.studentBO.saveOrUpdateStudent(student);
	}
}
