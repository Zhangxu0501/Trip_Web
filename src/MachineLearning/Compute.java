package MachineLearning;

import java.util.ArrayList;
import Math.Util.Average;
import com.zx.DAO.Trip;


public class Compute {
	public static void sop(Object o)
	{
		System.out.println(o);
	}
	public static void compute(ArrayList<TrainSet> al)
	{
		int i=0;
		ArrayList<Double> true_day = new ArrayList<Double>();
		ArrayList<Double> false_day = new ArrayList<Double>();
		ArrayList<Double> true_place = new ArrayList<Double>();
		ArrayList<Double> false_place = new ArrayList<Double>();
		while(i<al.size())
		{
			TrainSet t = al.get(i);
			if(t.relation)
			{
				true_day.add(t.m_day);
				true_place.add(t.m_place);
			}
			else
			{
				false_day.add(t.m_day);
				false_place.add(t.m_place);
			}
			i++;
		}
		Average ave = new Average();
		double ave_true_day=ave.average(true_day);
		double ave_true_place=ave.average(true_place);
		double ave_false_day=ave.average(false_day);
		double ave_false_place=ave.average(false_place);
		
		double var_true_day = ave.variance(true_day, ave_true_day);
		double var_true_place = ave.variance(true_place, ave_true_place);
		double var_false_day = ave.variance(false_day, ave_false_day);
		double var_false_place = ave.variance(false_place, ave_false_place);
		sop("ave_true_day="+ave_true_day);
		sop("ave_true_place="+ave_true_place);
		sop("ave_false_day="+ave_false_day);
		sop("ave_false_place="+ave_false_place);
		sop("var_true_day="+var_true_day);
		sop("var_true_place="+var_true_place);
		sop("var_false_day="+var_false_day);
		sop("var_false_place="+var_false_place);
		//²âÊÔÕýÈ·¡£
	}
	
	public static void main(String[] args) {
		ArrayList<TrainSet> al = new ArrayList<TrainSet>();
		Trip t1=new Trip();
		Trip t2=new Trip();
		Trip t3=new Trip();
		Trip t4=new Trip();
		Trip t5=new Trip();
		Trip t6=new Trip();
		Trip t7=new Trip();
		Trip t8=new Trip();
		
		t1.price=10000;
		t2.price=20000;
		t3.price=30000;
		t4.price=40000;
		t5.price=50000;
		t6.price=60000;
		t7.price=70000;
		t8.price=80000;
		
		t1.time=4;
		t2.time=4;
		t3.time=5;
		t4.time=5;
		t5.time=6;
		t6.time=6;
		t7.time=7;
		t8.time=7;
		
		t1.tour_route="1>2>3>4>5";
		t2.tour_route="1>2>3>4>5>6";
		t3.tour_route="1>2>3>4>5>6>7";
		t4.tour_route="1>2>3>4>5>6>7>8";
		t5.tour_route="1>2>3>4>5>6>7>8>9";
		t6.tour_route="1>2>3>4>5>6>7>8>9>10";
		t7.tour_route="1>2>3>4>5>6>7>8>9>10>11";
		t8.tour_route="1>2>3>4>5>6>7>8>9>10>11>12";
		
		TrainSet ts1 = new TrainSet(t1,t2,true);
		TrainSet ts2 = new TrainSet(t3,t4,true);
		TrainSet ts3 = new TrainSet(t5,t6,false);
		TrainSet ts4 = new TrainSet(t7,t8,false);
		
		al.add(ts1);
		al.add(ts2);
		al.add(ts3);
		al.add(ts4);
		compute(al);
	}

}
