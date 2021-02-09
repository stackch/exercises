/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/collections/filelist
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.collections.filelist;

import java.io.File;
import java.util.Arrays;
import java.util.List;

class FileListException extends Exception {

	private static final long serialVersionUID = 8883250486347621793L;

	public FileListException(String msg) {
		super(msg);
	}
	
}

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

	public static List<String> load(String path) throws FileListException {
		File dir = new File(path);
		if (!dir.exists()) {
			throw new FileListException("path does not exist");
		}
		String[] fileNames = dir.list();
		List<String> list = Arrays.asList(fileNames);
		return list;
	}
}
