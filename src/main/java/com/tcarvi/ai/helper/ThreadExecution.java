package com.tcarvi.ai.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public static class ThreadExecution extends Thread {

    private final InputStream is;
    private final String type;

    protected ThreadExecution(InputStream is, String type) {
        this.is = is;
        this.type = type;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is));) {
            String line;
            while ((line = br.readLine()) != null) {
                // TODO
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
