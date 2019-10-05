package ru.avalon.java.ocpjp.labs.actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/**
 * Действие, которое копирует файлы в пределах дискового
 * пространства.
 */
public class FileCopyAction implements Action {
    private static final Path from = Paths.get("test_file.txt");
    private static final Path to = Paths.get("test_file_copy.txt");
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №2 Реализуйте метод run класса FileCopyAction
         */
        try {
            Thread t = new Thread();
            t.start();
            t.join();
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException | InterruptedException e) {
            System.err.println(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №3 Реализуйте метод close класса FileCopyAction
         */
        Thread.currentThread().interrupt();
    }
}
