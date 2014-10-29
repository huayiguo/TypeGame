package edu.upenn.cis542.typegame;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class FullscreenActivity extends Activity {
	String answer = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fullscreen);
		TextView text = (TextView)findViewById(R.id.textView);
		answer = text.getText().toString();
		Button submit = (Button)findViewById(R.id.submit);
		submit.setOnClickListener(new submitlistener());
		Button quit = (Button)findViewById(R.id.quit);
		quit.setOnClickListener(new quitlistener());
	}
	
	class quitlistener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			finish();
		}	
	}
	
	class submitlistener implements OnClickListener{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			EditText inputView = (EditText)findViewById(R.id.Edit);
			String input = inputView.getText().toString();
			if(input.equals(answer)){
				Toast.makeText(getApplicationContext(), "You are right!", Toast.LENGTH_LONG).show();
			}else{
				Toast.makeText(getApplicationContext(), "You are wrong!", Toast.LENGTH_LONG).show();
			}
			
		}
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fullscreen, menu);
		return true;
	}

}
