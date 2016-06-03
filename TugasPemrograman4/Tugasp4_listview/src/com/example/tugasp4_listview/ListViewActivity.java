package com.example.tugasp4_listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewActivity extends Activity{
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listview);
		
		ListView list = (ListView)findViewById(R.id.main_listview);
	
		Listview adapter = new Listview(10, getBaseContext());
		list.setAdapter(adapter);
	}
	
}
