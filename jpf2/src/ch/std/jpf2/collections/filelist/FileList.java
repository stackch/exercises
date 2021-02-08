/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/collections/filelist
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.collections.filelist;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileList {

	public static void main(String[] args) {
		if (args.length <= 0) {
			System.out.println("no args");
			return;
		}
		List<String> fileList = load(args[0]);
		for (String fileName : fileList) {
			System.out.println(fileName);
		}
	}

	public static List<String> load(String path) {
		File dir = new File(path);
		String[] fileNames = dir.list();
		List<String> list = Arrays.asList(fileNames);
		return list;
	}
}
