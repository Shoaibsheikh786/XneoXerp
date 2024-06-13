package com.generic.methods;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Downloads {

	// Method to wait for the download to complete
	public static void waitForDownloadToComplete(String downloadPath, String fileName, int timeoutInSeconds) {
		File dir = new File(downloadPath);
		File file = new File(downloadPath + File.separator + fileName);
		int timeElapsed = 0;

		while (timeElapsed < timeoutInSeconds) {
			// Check if the file exists and is not a temporary file
			if (file.exists() && !isFileDownloading(file)) {
				System.out.println("Download completed.");
				return;
			}

			try {
				Thread.sleep(1000); // Wait for 1 second before checking again
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			timeElapsed++;
		}

		throw new RuntimeException("File download did not complete within the specified timeout.");
	}

	// Helper method to check if the file is still downloading
	public static boolean isFileDownloading(File file) {
		// Check if the file is still being written to (i.e., downloading)
		return file.getName().endsWith(".crdownload") || file.getName().endsWith(".tmp");
	}

	// Method to rename the downloaded file
	public static void renameDownloadedFile(String downloadPath, String oldFileName, String newFileName) {
		Path source = Paths.get(downloadPath + File.separator + oldFileName);
		Path target = Paths.get(downloadPath + File.separator + newFileName);
		try {
			Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("File renamed to " + newFileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// delete File
	public static void deleteDownloadedFile(String downloadPath, String fileName) {
		Path filePath = Paths.get(downloadPath, fileName);
		try {
			Files.deleteIfExists(filePath);
			System.out.println("File deleted successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
