package by.it.mogonov.jd01_15;

import by.it.mogonov.jd01_14.TaskA;

import java.io.File;

class PathCreator {

    public static final String USER_DIR = "user.dir";
    public static final String SRC = "src";

    private PathCreator() {

    }

    static String getFileName(Class<by.it.mogonov.jd01_15.TaskA> taskAClass, String filename) {
        String root = System.getProperty(USER_DIR);
        String path = by.it.mogonov.jd01_15.TaskA.class
                .getName()
                .replace(TaskA.class.getSimpleName(), "")
                .replace(".", File.separator);
        return root + File.separator + SRC + File.separator + path + filename;
    }

}







