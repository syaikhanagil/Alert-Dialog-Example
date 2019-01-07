package com.syaikhanagil.belajar.alertDialog;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Button exit = findViewById(R.id.mainButton);
		exit.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
					builder.setTitle("Exit");
					builder.setMessage("Are You Sure Want To Exit?");
					builder.setPositiveButton("Yes",new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface dialog, int which)
							{
								finishAffinity();
								System.exit(0);
							}
					});
					builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){

							@Override
							public void onClick(DialogInterface dialog, int which)
							{
								dialog.dismiss();
							}

					});
				builder.create().show();
				}
		});
    }
}
