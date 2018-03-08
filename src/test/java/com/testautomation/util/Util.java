package com.testautomation.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by hawe on 3/2/2018.
 */
public class Util {

    public static final String TEST_DATA_FILE = "TestDataexcel.xlsx";

    public static DateFormat dateFormat() {
        return new SimpleDateFormat("dd/MM/yyyy");
    }
}
