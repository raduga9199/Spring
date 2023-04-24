package com.cydeo.controller;

import com.cydeo.model.Mentor;
import com.cydeo.enums.Gender;
import com.sun.jdi.request.StepRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("mentor")
public class MentorController {

    @RequestMapping("/list")
    public String showTable(Model model){
        List<Mentor> mentorList = new ArrayList<>(
                Arrays.asList(
                        new Mentor("Mike","Smith",45,Gender.MALE),
                        new Mentor("Tom","Hanks",65,Gender.MALE),
                        new Mentor("Ammy","Bryan",25,Gender.FEMALE)
                )
        );

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";
    }
}
