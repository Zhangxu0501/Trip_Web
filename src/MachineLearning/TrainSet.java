package MachineLearning;

import com.zx.DAO.Trip;



public class TrainSet {
	public double m_day;
	public double m_place;
	public boolean relation=true;
	public TrainSet(Trip t1,Trip t2,boolean b)
	{
		m_day=((double)(t1.price-t2.price))/t1.time;
		int count1=t1.tour_route.split(">").length-2;
		int count2=t2.tour_route.split(">").length-2;
		m_place=(((double)t1.price)/count1)-(((double)t2.price)/count2);
		relation=b;
		System.out.println(m_day);
		System.out.println(m_place);
	}
}
