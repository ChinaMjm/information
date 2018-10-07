package main.java.course.model;

import java.util.ArrayList;
import java.util.List;

import main.java.course.bean.PaikeOne;

public class ListModel {

	public PaikeOne[][] changeList(List list) {
		// TODO Auto-generated method stub
		
		int j=0;
		PaikeOne [][]arr = new PaikeOne[7][7];
		for (int i = 0; i < list.size(); i++) {
			PaikeOne paikeOne = (PaikeOne) list.get(i);
				int timeNumber = paikeOne.getTimeNumber();
				if(paikeOne.getWeek().equals("周一")){
					arr[timeNumber-1][0]=paikeOne;
				}else if(paikeOne.getWeek().equals("周二")){
					arr[timeNumber-1][1]=paikeOne;
				}else if(paikeOne.getWeek().equals("周三")){
					arr[timeNumber-1][2]=paikeOne;
				}else if(paikeOne.getWeek().equals("周四")){
					arr[timeNumber-1][3]=paikeOne;
				}else if(paikeOne.getWeek().equals("周五")){
					arr[timeNumber-1][4]=paikeOne;
				}else if(paikeOne.getWeek().equals("周六")){
					arr[timeNumber-1][5]=paikeOne;
				}else if(paikeOne.getWeek().equals("周日")){
					arr[timeNumber-1][6]=paikeOne;
				}
					
		}
		return arr;
	}

}
