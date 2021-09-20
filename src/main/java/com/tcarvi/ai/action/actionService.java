package com.tcarvi.ai.action;

import com.tcarvi.ai.action.helper.ThreadExecution;

public class actionService {

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