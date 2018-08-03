package in.co.cg.sortedfilesanddirectories;

import java.io.File;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.function.Predicate;

//List all files and folders of directories 
public class SortedDirectoriesAndFiles {

	public static void main(String[] args) {

		File file = new File("c:");// Directory path

		File listOfFolder[] = file.listFiles();

		// treeset object with lambda
		TreeSet<File> treeSet = new TreeSet<File>((arg0, arg1) -> arg0.compareTo(arg1));

		treeSet.addAll(Arrays.asList(listOfFolder));
		Predicate<File> predicate = (element) -> element.getName().contains(".");// returns true or false if it is file or not

		treeSet.stream().filter(predicate.negate()).forEach(System.out::println);
		// Printing files and folders 
		treeSet.stream().filter(predicate).forEach(System.out::println);

	}

}
