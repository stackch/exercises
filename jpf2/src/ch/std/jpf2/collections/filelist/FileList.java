/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/collections/filelist
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.collections.filelist;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileList {

	public static void main(String[] args) {
		if (args.length <= 0) {
			System.out.println("no args");
			return;
		}
		try {
			List<String> fileList = load(args[0]);
			for (String fileName : fileList) {
				System.out.println(fileName);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static List<String> load(String path) throws IOException {
		File dir = new File(path);
		if (!dir.exists()) {
			throw new IOException("path does not exist");
		}
		String[] fileNames = dir.list();
		List<String> list = Arrays.asList(fileNames);
		return list;
	}
}
