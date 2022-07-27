package com.nova.student.service;

import com.nova.student.dao.UniversityRepository;
import com.nova.student.domain.University;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    @Transactional(readOnly = true)
    public List<University> findUniversities(){
        return universityRepository.findAll();
    }

    @Transactional(readOnly = true)
    public University getUniversity(Long universityId){
        Optional<University> uop = universityRepository.findById(universityId);

        University u = uop.get();

        Hibernate.initialize(u.getFaculties());
        return u;
    }

    @Transactional(readOnly = true)
    public List<University> findFullUniversities(){
        return universityRepository.findFullUniversities();
    }
}

