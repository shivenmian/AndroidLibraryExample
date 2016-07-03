package com.shivenmian.awesomelibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by shivenmian on 03/07/16.
 */
public class AwesomeLibrary {
    private static AwesomeLibrary ourInstance = new AwesomeLibrary();

    public static AwesomeLibrary getInstance() {
        return ourInstance;
    }

    private AwesomeLibrary() {
    }

    public void makeMeAwesome(Context context, String data){
        Toast.makeText(context, "LibTest: " + data, Toast.LENGTH_SHORT).show();
    }
}
