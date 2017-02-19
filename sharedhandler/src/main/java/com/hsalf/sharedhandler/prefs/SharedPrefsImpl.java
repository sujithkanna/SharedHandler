package com.hsalf.sharedhandler.prefs;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by sujith on 19/2/17.
 */
public class SharedPrefsImpl implements SharedPrefs {

    private static final String TAG = "SharedPrefsImpl";

    private final SharedPreferences mSharedPreferences;

    public SharedPrefsImpl(Context context, String name) {
        mSharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    public static SharedPrefs prepare(Context context, String name) {
        return new SharedPrefsImpl(context, name);
    }
}
