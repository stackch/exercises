/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/streams/filecopy
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.stream.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String[] args) {
		if (args.length <= 1) {
			System.out.println("usage: java ch.std.jpf2.stream.filecopy.FileCopy <src file> <dst file>");
			return;
		}
		try (FileInputStream fis = new FileInputStream(args[0]); FileOutputStream fos = new FileOutputStream(args[1])) {
			byte[] buf = new byte[1 << 16];
			int bytesRead = 0;
			while ((bytesRead = fis.read(buf)) > 0) {
				fos.write(buf, 0, bytesRead);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return;
	}
}
