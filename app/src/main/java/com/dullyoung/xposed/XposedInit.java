package com.dullyoung.xposed;

import android.util.Log;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/*
 *  Created  in  2021/5/22
 */
public class XposedInit implements IXposedHookLoadPackage {
    private String TAG = "aaaaa";

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        Log.i(TAG, "handleLoadPackage: " + lpparam);
        if (lpparam.packageName.equals("the pkg name you want to hook")) {
            Log.i(TAG, "-------------:  running ");
        }
    }
}
