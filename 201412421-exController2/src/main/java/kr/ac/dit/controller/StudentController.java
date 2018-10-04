package kr.ac.dit.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.dit.domain.StudentVO;

@Controller
public class StudentController {
	@RequestMapping("read")
	public void read(Model model) {		
		StudentVO studentVO = new StudentVO();
		studentVO.setNo("201412421");
		studentVO.setName("yongju");
		model.addAttribute(studentVO);
		
	}
	
}