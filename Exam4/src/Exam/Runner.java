package Exam;

import java.awt.geom.Arc2D.Double;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Runner {
	
	public static ArrayList<Tent> copyListSortedByArea(List<Tent> tents){
		ArrayList<Tent> sortList = new ArrayList<>();
		sortList.addAll(tents);
		sortList.stream().sorted(Comparator.comparing(Tent :: getErea)).forEach(System.out :: println);
//		sortList.stream().sorted((t1, t2) -> {
//			double diff = t1.getErea() - t2.getErea();
//			return diff == 0.0 ? 0 : (diff > 0 ? 1 : -1);
//		}).forEach(System.out :: println);
//		System.out.println(sortList);
		return sortList;
	}
	
	public static ArrayList<Tent> listContainsNumPeopleBiggerToNumSortedByNumPeople(List<Tent> tents, int num) {
		ArrayList<Tent> sortList = new ArrayList<>();
		sortList.addAll(tents);
		sortList.stream().filter(t -> t.getNumPeople()>= num).sorted(Comparator.comparing(Tent :: getNumPeople)).forEach(System.out :: println);
		return sortList;
	}
	
	public static boolean tentHighestInList(List<Tent> tents , Tent tent) {
		Tent tentMax = tents.stream().max( Comparator.comparing( Tent::getHeight ) ).get();
		return tentMax.getHeight() == tent.getHeight();
	}
	
//	public static Map<Double,List<Tent>> listTentsToMapTents(List<Tent> tents){
//		
//////		List<Double> height = tents.stream().map(Tent::getHeight).collect(Collectors.toList());
////		Map<Double,List<Tent>> mapTents = height.stream().collect(Collectors.toMap(Tent::getHeight, tents.stream().filter(t -> t.getHeight() == ?)));
////		return mapTents;
//
//	}
	
	public static Collection<List<Tent>> tentsHeightRange(Map<Double,List<Tent>> map, int maxHeight, int minHeight){
//		map.values().stream().filter(t -> t.g)
		System.out.println(map.values());
//		map.values();
		return map.values();
	}

	
	public static void main(String[] args) {
		
		List<Tent> tents = new ArrayList<>();
		tents.add(new Tent(5, 4, 5, 10));
		tents.add(new Tent(15, 20, 6, 13));
		tents.add(new Tent(10, 7, 5, 13));
		tents.add(new Tent(7, 3, 5, 9));
		tents.add(new Tent(1, 1, 7, 8));
		tents.add(new Tent(2, 4, 3, 7));
		tents.add(new Tent(6, 2, 15, 10));
		tents.add(new Tent(3, 8, 5, 10));
		tents.add(new Tent(4, 4, 15, 10));
		tents.add(new Tent(15, 2, 5, 10));
		
		//Q1
//		List<Tent> temp = copyListSortedByArea(tents);
//		System.out.println("in main:");
////		System.out.println(copyListSortedByArea(tents)); 
//		temp.stream().forEach(System.out :: println);
		
		//Q2
//		listContainsNumPeopleBiggerToNumSortedByNumPeople(tents, 3);
		//Q3
//		tentHighestInList(tents, new Tent(15, 2, 5, 13));
		
		//Q4
//		listTentsToMapTents(tents);
		//Q5
		Map<Double, List<Tent>> map = new HashMap<>();
		Double d = new Double(5);
		map.put(d, tents);
		tentsHeightRange(map ,3, 10);
		
	}

}
