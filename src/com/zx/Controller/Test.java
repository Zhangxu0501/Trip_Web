package com.zx.Controller;

import java.io.IOException;
import java.util.ArrayList;

import com.zx.DAO.HbaseDAO;
import com.zx.DAO.Trip;

public class Test {

	public static void sop(Object p)
	{
		System.out.println(p);
	}
	public static void main(String[] args) throws IOException {
		HbaseDAO hbase = HbaseDAO.getInstance();
		ArrayList<Trip> tuniu = new ArrayList<Trip>();
		ArrayList<Trip> qunai = new ArrayList<Trip>();
		//hbase.Search("北京","6","三亚",tuniu,qunai);
		
		//sop(tuniu);
		//sop(qunai);
		
		/*
		 p =hbase.Search("武汉","6","南京");
		ArrayList<Trip> tuniu1 =p[0];
		ArrayList<Trip> qunai1 = p[1];
		
		 p =hbase.Search("北京","6","南京");
		ArrayList<Trip> tuniu2 =p[0];
		ArrayList<Trip> qunai2 = p[1];
		
		 p =hbase.Search("北京","6","杭州");
		ArrayList<Trip> tuniu3 =p[0];
		ArrayList<Trip> qunai3 = p[1];
		
	 p =hbase.Search("北京","6","大理");
		ArrayList<Trip> tuniu4 =p[0];
		ArrayList<Trip> qunai4 = p[1];
		
	 p =hbase.Search("北京","6","丽江");
		ArrayList<Trip> tuniu5 =p[0];
		ArrayList<Trip> qunai5 = p[1];
		
	 p =hbase.Search("上海","6","丽江");
		ArrayList<Trip> tuniu6 =p[0];
		ArrayList<Trip> qunai6 = p[1];
		
		
	 p =hbase.Search("广州","6","丽江");
		ArrayList<Trip> tuniu7 =p[0];
		ArrayList<Trip> qunai7 = p[1];
		
	*/

	

		

	
	
	
	
		
		/*
		for(Trip t:tuniu1)
			for(Trip q:qunai1)
				ts.add(new TrainSet(t,q,true));
		for(Trip t:tuniu1)
			for(Trip q:qunai1)
				ts.add(new TrainSet(t,q,true));
		
		for(Trip t:tuniu2)
			for(Trip q:qunai2)
				ts.add(new TrainSet(t,q,true));
		
		for(Trip t:tuniu3)
			for(Trip q:qunai3)
				ts.add(new TrainSet(t,q,true));
		
		for(Trip t:tuniu4)
			for(Trip q:qunai4)
				ts.add(new TrainSet(t,q,true));
		
		for(Trip t:tuniu5)
			for(Trip q:qunai5)
				ts.add(new TrainSet(t,q,true));
		
	Compute.compute(ts);*/
				

		
		
		
	}
}
