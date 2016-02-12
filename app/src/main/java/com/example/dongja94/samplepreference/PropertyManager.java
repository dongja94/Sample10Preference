package com.example.dongja94.samplepreference;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by dongja94 on 2016-02-12.
 */
public class PropertyManager {
    private static PropertyManager instance;
    public static PropertyManager getInstance() {
        if (instance == null) {
            instance = new PropertyManager();
        }
        return instance;
    }

    SharedPreferences mPrefs;
    SharedPreferences.Editor mEditor;

    private PropertyManager() {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(MyApplication.getContext());
        mEditor = mPrefs.edit();
    }

    private static final String FIELD_PUSH = "push";

    public boolean isPush() {
        return mPrefs.getBoolean(FIELD_PUSH, false);
    }

    public void setPush(boolean push) {
        mEditor.putBoolean(FIELD_PUSH, push);
        mEditor.commit();
    }
}
