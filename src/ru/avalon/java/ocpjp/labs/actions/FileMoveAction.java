package ru.avalon.java.ocpjp.labs.actions;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Действие, которое перемещает файлы в пределах дискового
 * пространства.
 */
public class FileMoveAction implements Action {
    private static final Path from = Paths.get("test_file.txt");
    private static final Path to = Paths.get("/moved");
    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO №4 Реализуйте метод run класса FileMoveAction
         */
        try {
            Thread t = new Thread();
            t.start();
            t.join();
            Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws Exception {
        /*
         * TODO №5 Реализуйте метод close класса FileMoveAction
         */
        throw new UnsupportedOperationException("Not implemented yet!");
    }

}
