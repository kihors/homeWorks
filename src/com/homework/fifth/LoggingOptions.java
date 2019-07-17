package com.homework.fifth;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.Handler;
import java.util.logging.ConsoleHandler;
import java.util.logging.XMLFormatter;

public class LoggingOptions {

    private static void configureLogging() {
        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerA.setLevel(Level.ALL);

        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerB.setLevel(Level.WARNING);

        Logger loggerPackage = Logger.getLogger("org.stepic.java");
        loggerPackage.setLevel(Level.ALL);
        loggerPackage.setUseParentHandlers(false);

        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        loggerPackage.addHandler(handler);
        handler.setFormatter(new XMLFormatter());
    }
}
