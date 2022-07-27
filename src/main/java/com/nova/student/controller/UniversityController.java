package com.nova.student.controller;

import com.nova.student.domain.University;
import com.nova.student.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping(path = "/universityList")
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping
    public String findUniversity(Model model){

        List<University> list = universityService.findFullUniversities();
        model.addAttribute("today", LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        model.addAttribute("universities", list);

        return "universityList";
    }


}
