package MediumBDD.utils;

import java.util.ArrayList;
import java.util.List;

import MediumBDD.models.Post;

public class FileManagment {
	
	public static List<Post> readExcel() {
		List<Post> list = new ArrayList<Post>();
		list.add(new Post("Apps That Work Natively on the Web and Mobile","Sebastian Witalec","Aug 22, 2018","7"));
		list.add(new Post("Learn how to create your first Angular app in 20 minutes","SaidHayani@","Mar 9, 2018","8"));
		//list.add(new Post("Everything you need to know about <ng-template>, <ng-content>, <ng-container> and *ngTemplateOutlet in Angular","Prateek Mishra","Oct 29, 2018","7"));
		return list;
	}

}
