package com.example.myapplication;

import android.util.Log;

public class MDebug {

    private static final Boolean isDebug = true;
    private static final String AUTH_ = "tch_";
    private static final String DECO_ = "==========>";

    public static void d_(String msg) {
        String _class_name = Thread.currentThread().getStackTrace()[2].getClassName();
        String _method_name =  Thread.currentThread().getStackTrace()[2].getMethodName();
        int _linenumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        final String _msg = _class_name + ".java " + _method_name + " line : " + _linenumber + " " + msg;
        if(isDebug)
        Log.d(DECO_ + AUTH_, _msg);
    }
}
