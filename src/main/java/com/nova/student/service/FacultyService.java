package com.nova.student.service;

import com.nova.student.dao.FacultyRepository;
import com.nova.student.domain.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    @Transactional(readOnly = true)
    public List<Faculty> findFaculties(){
        return facultyRepository.findAll();
    }
}
