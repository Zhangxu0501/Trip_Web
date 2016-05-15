package com.zx.Controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zx.DAO.HbaseDAO;
import com.zx.DAO.Trip;



@Controller //用来标注当前类是springmvc的控制层类
public class TestController 
{
@RequestMapping("/hello.do")//用来访问控制层方法的注释
public String hello()
{
	return "index1";
}
@RequestMapping("/test.do")//用来访问控制层方法的注释
public String test()
{
	return "index11";
}
@RequestMapping("/t.do")
public void t(String AA,String BB) {
  System.out.println(AA+BB+222);
}

@RequestMapping("/search.do")
public  ModelAndView Search(String start_place,String date,String end_place) throws IOException
{
	//Snippet s = new Snippet();
	//System.out.println(s.getEncoding(start_place));
	
	start_place=new String(start_place.getBytes("iso-8859-1"),"GBK");
	end_place=new String(end_place.getBytes("iso-8859-1"),"GBK");
	date=new String(date.getBytes("iso-8859-1"),"GBK");
	System.out.println(start_place+"-"+date+"-"+end_place);
	
	HbaseDAO hbase = HbaseDAO.getInstance();
	ArrayList<Trip> tuniu;
	ArrayList<Trip> qunai;
	ArrayList<Trip> recommend;
	
	
	ArrayList<Trip> []t=hbase.Search(start_place,date,end_place);
	tuniu=t[0];
	qunai=t[1];
	recommend=t[2];
	System.out.println(tuniu);
	System.out.println(qunai);
	Map<String,Object> map = new HashMap<String, Object>();
	map.put("tuniu", tuniu);
	map.put("qunai", qunai);
	map.put("recommend", recommend);
	ModelAndView mav= new ModelAndView("index",map);
	return mav;
}


@RequestMapping("/search2.do")
public  ModelAndView toPersion4()
{
	
	ModelAndView mav= new ModelAndView("iin",null);
	return mav;
}
}

