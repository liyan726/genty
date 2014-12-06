package com.genty.Mapper;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.genty.model.User;


@RunWith(SpringJUnit4ClassRunner.class) //Ê¹ÓÃSpringtest¿ò¼Ü
@ContextConfiguration("/beans.xml")
public class TestMybatisInterMapper {

	@Resource //×¢Èë
	private UserMapper userMapper;
	
	@Test
	public void test() {
		User u = userMapper.selectUserByid(6);
		
		System.out.println(u.getName());
	}

}
