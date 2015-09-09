package it.android.exercises.resources;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class TossingCoingActivity extends Activity {
	/** Called when the activity is first created. */
	private Button buttonToss;
	private Button buttonRepeat;
	private Button buttonExit;
	private Random rand;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		rand = new Random();
		setContentView(R.layout.main);
		buttonToss = (Button) findViewById(R.id.button1);
		buttonRepeat = (Button) findViewById(R.id.button2);
		buttonExit = (Button) findViewById(R.id.button3);
	}

	public void buttonToss(View view) {

		// TODO Auto-generated method stub
		Log.d("CLICK_EVENT", "Toss button clicked! ");
		TextView tw = (TextView) findViewById(R.id.textView1);
		ImageView iw = (ImageView) findViewById(R.id.imageView1);

		if (rand.nextDouble() < 0.5) {
			tw.setText(getResources().getString(R.string.val1));
			iw.setImageResource(R.drawable.heads);
		} else {
			tw.setText(getResources().getString(R.string.val2));
			iw.setImageResource(R.drawable.tails);
		}

		buttonRepeat.setVisibility(View.VISIBLE);
		buttonExit.setVisibility(View.VISIBLE);
		buttonToss.setVisibility(View.INVISIBLE);
	}

	public void buttonRepeat(View view) {

		TextView tw = (TextView) findViewById(R.id.textView1);
		ImageView iw = (ImageView) findViewById(R.id.imageView1);

		buttonRepeat.setVisibility(View.INVISIBLE);
		buttonExit.setVisibility(View.INVISIBLE);
		buttonToss.setVisibility(View.VISIBLE);
		tw.setText("");
		iw.setImageResource(R.drawable.question);

	}

	public void buttonExit(View view) {

		this.finish();

	}

}
