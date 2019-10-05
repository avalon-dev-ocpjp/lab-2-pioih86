package ru.avalon.java.ocpjp.labs.actions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileRenameAction implements Action {
    private static final Path from = Paths.get("test_file.txt");
    private static final Path to = Paths.get("test_renamed.txt");

    @Override
    public void run() {
        try {
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(from);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {

    }
}
