package com.testautomation.data;

import static com.testautomation.util.ExcelUtil.getCellData;
import static com.testautomation.util.ExcelUtil.setExcelFile;
import static com.testautomation.util.Util.TEST_DATA_FILE;

/**
 * Created by hawe on 3/2/2018.
 */
public class LoginData {
    public static String userName;
    public static String password;

    static {
        try{
            //Data Sheet Connection
            setExcelFile(TEST_DATA_FILE,"Login");
            //Get the data from the data sheet
            userName = getCellData(1);
            password = getCellData(2);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
