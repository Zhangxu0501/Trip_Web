package com.zx.DAO;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.filter.SubstringComparator;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.util.Bytes;

import MachineLearning.Compute;
import MachineLearning.TrainSet;



public class HbaseDAO {
	private HbaseDAO()
	{}
	private static HbaseDAO hbase = new HbaseDAO();
	public static HbaseDAO getInstance()
	{
		return hbase;
	}
	
private static Configuration conf = null;
	
	static{
		conf = HBaseConfiguration.create();
		conf.set("hbase.zookeeper.quorum", "zx0:2181");
		}
	
	
	public void sop()
	{
		System.out.println("Spring and hbase and SpringMVC worked");
	}
	
	public static int byteToInt(byte[] b) {  
		  
        int mask=0xff;  
        int temp=0;  
        int n=0;  
        for(int i=0;i<4;i++){  
           n<<=8;  
           temp=b[i]&mask;  
           n|=temp;  
        }  
        	return n;  
		}  
	
	public ArrayList<Trip>[] Search (String start_place,String time,String end_place) throws IOException
	{
		ArrayList<Trip>[] als = new ArrayList[3];
		ArrayList<Trip> arr_tuniu = new ArrayList<Trip>();
		ArrayList<Trip> arr_qunai = new ArrayList<Trip>();
		ArrayList<Trip> recommend = new ArrayList<Trip>();
		HTable table = new HTable(conf,"Trip1");
		
		Scan scan_tuniu = new Scan();
		Scan scan_qunai = new Scan();
		
		ArrayList<Filter> al_tuniu = new ArrayList<Filter>();
		ArrayList<Filter> al_qunai = new ArrayList<Filter>();
		
		SubstringComparator comparator_start_place = new SubstringComparator(start_place);
		Filter f_start_place=new SingleColumnValueFilter("bi".getBytes(), "start_place".getBytes(), CompareOp.EQUAL, comparator_start_place);
		
		SubstringComparator comparator_end_place = new SubstringComparator(end_place);
		Filter f_end_place=new SingleColumnValueFilter("bi".getBytes(), "end_place".getBytes(), CompareOp.EQUAL, comparator_end_place);
		
		
		SubstringComparator comparator_web_tuniu = new SubstringComparator("Í¾Å£Íø");
		Filter f_web_tuniu=new SingleColumnValueFilter("bi".getBytes(), "web".getBytes(), CompareOp.EQUAL, comparator_web_tuniu);
		Random rr = new Random();
		SubstringComparator comparator_web_qunai = new SubstringComparator("È¥ÄÄ¶ùÍø");
		Filter f_web_qunai=new SingleColumnValueFilter("bi".getBytes(), "web".getBytes(), CompareOp.EQUAL, comparator_web_qunai);
		
		
		al_tuniu.add(f_start_place);
		al_tuniu.add(f_end_place);
		al_tuniu.add(f_web_tuniu);
		
		al_qunai.add(f_start_place);
		al_qunai.add(f_web_qunai);
		
		
		

		
		Filter filter_tuniu = new FilterList(FilterList.Operator.MUST_PASS_ALL,al_tuniu);
		Filter filter_qunai = new FilterList(FilterList.Operator.MUST_PASS_ALL,al_qunai);
		
		
		
		
		scan_tuniu.setFilter(filter_tuniu);
		scan_qunai.setFilter(filter_qunai);
		

		ResultScanner res_tuniu = table.getScanner(scan_tuniu);
		ResultScanner res_qunai = table.getScanner(scan_qunai);
		
		
		for(Result r:res_tuniu)
		{
			Trip t = new Trip();
			String s_place=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("start_place")))).getBytes("gbk"),"utf-8");
			String e_place=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("end_place")))).getBytes("gbk"),"utf-8");
			
			int times=byteToInt((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("time"))));
			if(times!=Integer.parseInt(time))
				continue;
			byte[] b;
			if((b =r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("traffic")))==null)
				t.traffic="Î´Öª";
			else
				t.traffic=new String(new String(b).getBytes("gbk"),"utf-8");
			
			if((b =r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("hotel")))==null)
				t.hotel="Î´Öª";
			else
				t.hotel=new String(new String(b).getBytes("gbk"),"utf-8");
			int price=byteToInt((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("price"))));
			
			
			String tour_route=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("tour_route")))).getBytes("gbk"),"utf-8");
			String title=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("title")))).getBytes("gbk"),"utf-8");
			
			
			
			String start_date=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("start_data")))).getBytes("gbk"),"utf-8");
			String url=new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("url"))));
			String web=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("web")))).getBytes("gbk"),"utf-8");

			
			t.start_place=s_place;
			t.end_place=e_place;
			
			
			
			t.time=times;
			t.tour_route=tour_route;
			t.title=title;
			t.price=price;
			t.start_date=start_date;
			t.url=url;
			t.web=web;
			arr_tuniu.add(t);
			System.out.println(t);
		}
		Pattern p=Pattern.compile(end_place);
		
		for(Result r:res_qunai)
		{
			
			
			int times=byteToInt((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("time"))));
			if(times!=Integer.parseInt(time))
				continue; 
			String s_place=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("start_place")))).getBytes("gbk"),"utf-8");
			String e_place=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("end_place")))).getBytes("gbk"),"utf-8");
			e_place=URLDecoder.decode(e_place, "GBK");
			
			Matcher m = p.matcher(e_place);
			if(!m.find())
				continue;
			
			Trip t = new Trip();
			byte [] b;
			if((b =r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("traffic")))==null)
				t.traffic="Î´Öª";
			else
				t.traffic=new String(new String(b).getBytes("gbk"),"utf-8");
			
			String tour_route=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("tour_route")))).getBytes("gbk"),"utf-8");
			String title=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("title")))).getBytes("gbk"),"utf-8");
			
			
			int price=byteToInt((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("price"))));
			String start_date=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("start_data")))).getBytes("gbk"),"utf-8");
			String url=new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("url"))));
			String web=new String(new String((r.getValue(Bytes.toBytes("bi"), Bytes.toBytes("web")))).getBytes("gbk"),"utf-8");

			
			t.start_place=s_place;
			t.end_place=e_place;
			t.tour_route=tour_route;
			t.title=title;
			t.price=price;
			t.time=times;
			t.start_date=start_date;
			t.url=url;
			t.web=web;
			System.out.println(t);
			arr_qunai.add(t);
		}
		ArrayList<TrainSet> al = new ArrayList<TrainSet>();
		for(Trip t:arr_tuniu)
			for(Trip q:arr_qunai)
				al.add(new TrainSet(t,q,false));
		Compute c = new Compute();
		c.compute(al);
		table.close();
		if(arr_tuniu.size()>=4&&arr_qunai.size()>=4)
		{
			recommend.add(arr_tuniu.get(1));
			recommend.add(arr_tuniu.get(4));
			recommend.add(arr_qunai.get(2));
			recommend.add(arr_qunai.get(3));
		}
		
		else if(arr_tuniu.size()<=2&&arr_tuniu.size()>=1&&arr_qunai.size()<=2&&arr_qunai.size()>=1)
		{
			recommend.add(arr_tuniu.get(0));
			recommend.add(arr_qunai.get(0));
		}

		als[0]=arr_tuniu;
		als[1]=arr_qunai;
		als[2]=recommend ;
		return als;
	}
}
