package com.tpcodl.mylibdemo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class MyLibrary {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void openWebView(Context mContext){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        mContext.startActivity(browserIntent);
    }
}
