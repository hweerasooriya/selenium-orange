package com.testautomation.data;

import static com.testautomation.util.ExcelUtil.getCellData;
import static com.testautomation.util.ExcelUtil.setExcelFile;
import static com.testautomation.util.Util.TEST_DATA_FILE;

/**
 * Created by hawe on 3/5/2018.
 */
public class UsersData {
    public static String userName;

    static {
        try{
            //Data Sheet Connection
            setExcelFile(TEST_DATA_FILE,"UsersSearch");
            //Get the data from the data sheet
            userName = getCellData(1);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
