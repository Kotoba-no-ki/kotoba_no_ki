package com.kotoba.noo.ki;

import android.app.*;
import android.os.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        
        // Set main.xml as user interface layout
        setContentView(R.layout.main);
    }
}