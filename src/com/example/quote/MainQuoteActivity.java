package com.example.quote;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView.BufferType;


public class MainQuoteActivity extends Activity implements OnClickListener{
	
	private static final String TAG =null;
	private static final BufferType String = null;
	private String[] anArray = {"\"Do not be deceived. Pause to pray. Listen to that still, small voice which speaks to the depths of our souls the Master’s gentle invitation, Come, follow me. By doing so, we turn from destruction, from death, and find happiness and life everlasting.\" -Thomas S. Monson","\"Test 2\" -Joseph Smith","\"Men will be held accountable for the things which they have and not for the things they have not. … All the light and intelligence communicated to them from their beneficent creator, whether it is much or little, by the same they in justice will be judged, and … they are required to yield obedience and improve upon that and that only which is given, for man is not to live by bread alone but by every word that proceeds out of the mouth of God.\"-Joseph Smith", "\"Here then is a great truth. In the pain, the agony, and the heroic endeavors of life, we pass through a refiner's fire, and the insignificant and the unimportant in our lives can melt away like dross and make our faith bright, intact, and strong.\"-James E. Faust", "\"Never assume that you can make it alone. You need the help of the Lord. Never hesitate to get on your knees in some private place and speak with Him.\"-Gordon B. Hinckley", "\"It is a duty which every Saint ought to render to his brethren freely—to always love them, and ever succor them.\"-Joseph Smith", "\"Partially losing my hearing has helped me develop patience for others, especially those with disabilities. It has helped me find faith to accept affliction. It has given me clarity to realize that instant, miraculous cures are not always the Lord’s will. In fact, sometimes just the opposite is true. …While afflictions are never easy, all of them can give us experience and can be for our good (see D&C 122:7).\"-Bonnie D. Parkin", "\"Test 8\"-Joseph Smith", "\"Test 9\"-Joseph Smith", "\"Test 10\"-Joseph Smith", "\"Test 11\"-Joseph Smith"};;

   
	EditText editText;
	Button updateButton;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_quote);
        //find views
        editText = (EditText) findViewById(R.id.quoteText);
        updateButton= (Button) findViewById(R.id.pushButton);
        updateButton.setOnClickListener((OnClickListener) this);
        
        
    }
	
	@Override
	public void onClick(View arg0){
		//TODO Auto-generated method stub
		
		Random number = new Random();
		int myNum;
		myNum = number.nextInt(10);
		String status = editText.getText().toString();
		Log.d(TAG, "onClicked:" + status);
		editText.setText(anArray[myNum], String);
	}
}
