package com.multi.test100;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@Autowired
	PageDAO dao;
	
	@RequestMapping("list1")
	public void list1(PageVO pageVO, Model model) { //start, end
		pageVO.setStartEnd();
		System.out.println(pageVO);
		List<BbsVO> list = dao.list1(pageVO);
		System.out.println(list.size());
		//views의 list1.jsp로 전달 
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list2")
	public void list2(PageVO pageVO, Model model) { //start, end
		pageVO.setStartEnd();
		System.out.println(pageVO);
		List<BbsVO> list = dao.list1(pageVO);
		//전체 페이지수 구하기 
		int count = dao.count(); //전체게시물 수 
		System.out.println("전체 게시물수>> " + count);
		int pages = count / 10; 
		//모델로 views까지 페이지수를 넘겨야 페이지수 버튼을 만들 수 있음. 
		System.out.println(list.size());
		//views의 list1.jsp로 전달 
		model.addAttribute("list", list);
	}
	
}
