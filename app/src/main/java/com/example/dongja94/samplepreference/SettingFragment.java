package com.example.dongja94.samplepreference;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by dongja94 on 2016-02-12.
 */
public class SettingFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings_preference);
    }
}
