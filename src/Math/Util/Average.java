package Math.Util;

import java.util.ArrayList;

public class Average {
	public double average(ArrayList<Double> al)//计算均值
	{
		double ave=0.0;
		int i=0;
		while(i<al.size())
		{
			ave+=al.get(i);
			i++;
		}
		ave=ave/al.size();
		return ave;
	}
	public double variance(ArrayList<Double> al,double u)//计算方差
	{
		double o = 0.0;
		int i=0;
		while(i<al.size())
		{
			o=o+(u-al.get(i))*(u-al.get(i));
			i++;
		}
		o=o/al.size();
		return o;
	}
}
