package com.genty.controller;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.genty.Mapper.UserMapper;
import com.genty.model.User;


@Controller
public class LoginController {

	@Resource
    private UserMapper usermapper;
	
	@Resource
	private SqlSession sqlSession;

	@RequestMapping("/login")
	public String log() {
		System.out.println("reun.....");
	
		User u = usermapper.selectUserByid(6);
		
	//	User user = sqlSession.selectOne("com.genty.Mapper.UserMapper"+".selectUserByid", 6);
		
		System.out.println(u.getName());
		return "/user/log";
	}
}
