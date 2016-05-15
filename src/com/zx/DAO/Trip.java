package com.zx.DAO;

import java.util.Date;

public class Trip {
	public String start_place;//必选-----------------
	public String getStart_place() {
		return start_place;
	}
	public void setStart_place(String startPlace) {
		start_place = startPlace;
	}
	public String getEnd_place() {
		return end_place;
	}
	public void setEnd_place(String endPlace) {
		end_place = endPlace;
	}
	public String getTraffic() {
		return traffic;
	}
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getTour_route() {
		return tour_route;
	}
	public void setTour_route(String tourRoute) {
		tour_route = tourRoute;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String startDate) {
		start_date = startDate;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String end_place;//必选-----------
	public String traffic;//选----------
	public String hotel;//选-----------(去哪网没有)
	public int time;//必选-------------
	public String tour_route;//必选----------
	public String title;//必选----------
	public int price;//必选-------------
	public String start_date;//必选------------
	public String url;//必选----------
	public String web;
	@Override
	public String toString() {
		return "Trip [end_place=" + end_place + ", hotel=" + hotel + ", price="
				+ price + ", start_date=" + start_date + ", start_place="
				+ start_place + ", time=" + time + ", title=" + title
				+ ", tour_route=" + tour_route + ", traffic=" + traffic
				+ ", url=" + url + ", web=" + web + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
