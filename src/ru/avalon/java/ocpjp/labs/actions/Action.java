package ru.avalon.java.ocpjp.labs.actions;

/**
 * Абстрактное представление о действии, как функциональном
 * элементе приложения.
 * <p>
 * Действие является потоковым объектом, что позволяет
 * исполнять несколько действий параллельно и не блокировать
 * основной поток исполнения.
 */
public interface Action extends Runnable, AutoCloseable {
    /**
     * Запускает потоковый объект на исполнение в отдельном
     * потоке исполнения.
     */
    default void start() throws Exception {
        /*
         * TODO №1 Реализуйте метод start интерфейса Action.
         */
        this.run();
        this.close();
    }
}
