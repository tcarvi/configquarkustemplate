package com.tcarvi.ai.actions;

import com.tcarvi.ai.helper.ThreadExecution;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.util.Objects;

public class UpdateSiteSrc {

	// public static void gitClone(Path directory, String originUrl) throws IOException, InterruptedException {
	// 	runCommand(directory.getParent(), "git", "clone", originUrl, directory.getFileName().toString());
	// }

}

// 		String originUrl = "https://github.com/iiiiii.git";
// 		Path directory = Paths.get("c:\\temp\\iiii");
// 		gitClone(directory, originUrl);

// public static void runCommand(Path directory, String... command) throws IOException, InterruptedException {
// 	Objects.requireNonNull(directory, "directory");
// 	if (!Files.exists(directory)) {
// 		throw new RuntimeException("can't run command in non-existing directory '" + directory + "'");
// 	}
// 	ProcessBuilder pb = new ProcessBuilder()
// 			.command(command)
// 			.directory(directory.toFile());
// 	Process p = pb.start();
// 	ThreadExecution errorGobbler = new ThreadExecution(p.getErrorStream(), "ERROR");
// 	ThreadExecution outputGobbler = new ThreadExecution(p.getInputStream(), "OUTPUT");
// 	outputGobbler.start();
// 	errorGobbler.start();
// 	int exit = p.waitFor();
// 	errorGobbler.join();
// 	outputGobbler.join();
// 	if (exit != 0) {
// 		throw new AssertionError(String.format("runCommand returned %d", exit));
// 	}
// }

// 	public static void gitPull() throws IOException, InterruptedException {
// 		runCommand(directory, "git", "pull");
// 	}

// 	public static void gitClone(Path directory, String originUrl) throws IOException, InterruptedException {
// 		runCommand(directory.getParent(), "git", "clone", originUrl, directory.getFileName().toString());
// 	}

// 	public static void gitSubversionUpdate() throws IOException, InterruptedException {
// 		runCommand("git", "clone", originUrl, directory.getFileName().toString());
// 	}