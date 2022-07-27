package com.nova.student.service;

import com.nova.student.domain.Faculty;
import com.nova.student.domain.University;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class UniversityServiceTest {

    @Autowired
    private UniversityService universityService;

    @Autowired
    private FacultyService facultyService;

//    @Test
//    public void findUniversities() {
//
//        List<University> list = universityService.findUniversities();
//        list.forEach(u -> System.out.println(u.getUniversityId()+":"+u.getUniversityName()+ " "+ u.getFaculties().size()));
//    }

    @Test
    public void findFullUniversities(){
        List<University> list = universityService.findFullUniversities();
        list.forEach(u-> System.out.println(u.getUniversityId()+":"+u.getUniversityName()+ " "+ u.getFaculties().size()));
    }

    @Test
    public void getUniversities(){
        University u = universityService.getUniversity(2L);
        System.out.println(u.getUniversityId()+":"+u.getUniversityName()+ " "+ u.getFaculties().size());
    }


//    @Test
//    public  void findFaculties(){
//
//        List<Faculty> list = facultyService.findFaculties();
//        list.forEach(f-> System.out.println(f.getFacultyId() + ":" + f.getFacultyName() + " " + f.getUniversity().getUniversityName()));
//    }
}