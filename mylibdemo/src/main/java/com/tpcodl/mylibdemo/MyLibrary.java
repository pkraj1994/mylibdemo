package com.tpcodl.mylibdemo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class MyLibrary {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void openWebView(Context mContext,String caNumberS){


        String caNumber="";


        try {
            try {
                caNumber= URLEncoder.encode(CommonMethods.getEncryptedString(CommonMethods.secretKey, caNumberS), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }



        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://portal.tpcentralodisha.com:4114/tpcodl-bill-view/getPrepaidInfoHtml?caEnc="+caNumber));
        mContext.startActivity(browserIntent);
    }
}
