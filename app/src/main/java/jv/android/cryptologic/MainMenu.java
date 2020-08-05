package jv.android.cryptologic;

import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainMenu extends AppCompatActivity {

	Button btGo;
	EditText etLetter;
	TextView tvMessage;
	TextView tvc1;
	TextView tvc2;
	TextView tvc3;
	TextView tvc4;
	TextView tvc5;
	TextView tvc6;
	TextView tvc7;
	TextView tvc8;
	TextView tvc9;
	TextView tvc10;
	TextView tvc11;
	TextView tvc12;
	TextView tvc13;
	TextView tvc14;
	TextView tvc15;
	TextView tvc16;
	TextView tvu1;
	TextView tvu2;
	TextView tvu3;
	TextView tvu4;
	TextView tvu5;
	TextView tvu6;
	TextView tvu7;
	TextView tvu8;
	TextView tvu9;
	TextView tvu10;
	TextView tvu11;
	TextView tvu12;
	TextView tvu13;
	TextView tvu14;
	TextView tvu15;
	TextView tvu16;
	LinearLayout llBarra1;
	LinearLayout llBarra2;

	String original;
	String encrypted;
	String typing;
	int errors;
	boolean started;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        
        btGo = (Button)findViewById(R.id.btGo);
        etLetter = (EditText)findViewById(R.id.etLetter);
        tvMessage = (TextView)findViewById(R.id.tvMessage);
        
    	tvc1 = (TextView)findViewById(R.id.tvC1);
    	tvc2 = (TextView)findViewById(R.id.tvC2);
    	tvc3 = (TextView)findViewById(R.id.tvC3);
    	tvc4 = (TextView)findViewById(R.id.tvC4);
    	tvc5 = (TextView)findViewById(R.id.tvC5);
    	tvc6 = (TextView)findViewById(R.id.tvC6);
    	tvc7 = (TextView)findViewById(R.id.tvC7);
    	tvc8 = (TextView)findViewById(R.id.tvC8);
    	tvc9 = (TextView)findViewById(R.id.tvC9);
    	tvc10 = (TextView)findViewById(R.id.tvC10);
    	tvc11 = (TextView)findViewById(R.id.tvC11);
    	tvc12 = (TextView)findViewById(R.id.tvC12);
    	tvc13 = (TextView)findViewById(R.id.tvC13);
    	tvc14 = (TextView)findViewById(R.id.tvC14);
    	tvc15 = (TextView)findViewById(R.id.tvC15);
    	tvc16 = (TextView)findViewById(R.id.tvC16);
    	tvu1 = (TextView)findViewById(R.id.tvU1);
    	tvu2 = (TextView)findViewById(R.id.tvU2);
    	tvu3 = (TextView)findViewById(R.id.tvU3);
    	tvu4 = (TextView)findViewById(R.id.tvU4);
    	tvu5 = (TextView)findViewById(R.id.tvU5);
    	tvu6 = (TextView)findViewById(R.id.tvU6);
    	tvu7 = (TextView)findViewById(R.id.tvU7);
    	tvu8 = (TextView)findViewById(R.id.tvU8);
    	tvu9 = (TextView)findViewById(R.id.tvU9);
    	tvu10 = (TextView)findViewById(R.id.tvU10);
    	tvu11 = (TextView)findViewById(R.id.tvU11);
    	tvu12 = (TextView)findViewById(R.id.tvU12);
    	tvu13 = (TextView)findViewById(R.id.tvU13);
    	tvu14 = (TextView)findViewById(R.id.tvU14);
    	tvu15 = (TextView)findViewById(R.id.tvU15);
    	tvu16 = (TextView)findViewById(R.id.tvU16);
        
    	llBarra1 = (LinearLayout)findViewById(R.id.llBarra1);
    	llBarra2 = (LinearLayout)findViewById(R.id.llBarra2);
    	llBarra1.setBackgroundColor(Color.BLUE);
    	llBarra2.setBackgroundColor(Color.BLUE);
    	
    	tvc1.setTextColor(Color.GREEN);
    	tvc2.setTextColor(Color.BLUE);
    	tvc3.setTextColor(Color.CYAN);
    	tvc4.setTextColor(Color.DKGRAY);
    	tvc5.setTextColor(Color.MAGENTA);
    	tvc6.setTextColor(Color.RED);
    	tvc7.setTextColor(Color.LTGRAY);
    	tvc8.setTextColor(Color.GRAY);
    	tvc9.setTextColor(Color.GREEN);
    	tvc10.setTextColor(Color.BLUE);
    	tvc11.setTextColor(Color.CYAN);
    	tvc12.setTextColor(Color.DKGRAY);
    	tvc13.setTextColor(Color.MAGENTA);
    	tvc14.setTextColor(Color.RED);
    	tvc15.setTextColor(Color.LTGRAY);
    	tvc16.setTextColor(Color.LTGRAY);

    	tvu1.setTextColor(Color.GREEN);
    	tvu2.setTextColor(Color.BLUE);
    	tvu3.setTextColor(Color.CYAN);
    	tvu4.setTextColor(Color.DKGRAY);
    	tvu5.setTextColor(Color.MAGENTA);
    	tvu6.setTextColor(Color.RED);
    	tvu7.setTextColor(Color.LTGRAY);
    	tvu8.setTextColor(Color.GRAY);
    	tvu9.setTextColor(Color.GREEN);
    	tvu10.setTextColor(Color.BLUE);
    	tvu11.setTextColor(Color.CYAN);
    	tvu12.setTextColor(Color.DKGRAY);
    	tvu13.setTextColor(Color.MAGENTA);
    	tvu14.setTextColor(Color.RED);
    	tvu15.setTextColor(Color.LTGRAY);
    	tvu16.setTextColor(Color.LTGRAY);
    	
    	btGo.setText(getString(R.string.avGo));
    	btGo.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
            	onGoClick();
            }
        });
    	
    	openning();
    }

//    @Override	
//    protected void onDestroy() {
//    	// closing Entire Application 
//		android.os.Process.killProcess(android.os.Process.myPid());
//		super.onDestroy();
//	}
    
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
      super.onSaveInstanceState(savedInstanceState);
      savedInstanceState.putString("original", original);
      savedInstanceState.putString("encrypted", encrypted);
      savedInstanceState.putString("typing", typing);
      savedInstanceState.putInt("errors", errors);
      savedInstanceState.putBoolean("started", started);
    }    

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
      super.onRestoreInstanceState(savedInstanceState);

      clear();
      
      original = savedInstanceState.getString("original");
      encrypted = savedInstanceState.getString("encrypted");
      typing = savedInstanceState.getString("typing");
      errors = savedInstanceState.getInt("errors");
      started = savedInstanceState.getBoolean("started");
            
      if (!original.equals("")) {
          printEncrypted(encrypted);
          printTyping(typing);
      } else {
    	  openning();
      }
      
      if (started) {
  		  tvMessage.setText(getString(R.string.avPlayer2TryToDecipher));
  		  etLetter.setEnabled(true);
  		  btGo.setEnabled(true);
      }
      else if (!original.equals("")) {
    	  tvMessage.setText(getString(R.string.avPlayer1TypeaWord));
      }
      
      verifyEndGame();
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main_menu, menu);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();

			if (id == R.id.mn1Player) {
				doNewGame(1);

				return true;
			} else if (id == R.id.mn2Players) {
				doNewGame(2);

				return true;
			} else if (id == R.id.mnAbout) {
				doAbout();

				return true;
			} else if (id == R.id.mnExit) {
				finish();

				return true;
			}

		return super.onOptionsItemSelected(item);
	}

    public void onGoClick() {
		// The letter is right?
    	if (!etLetter.getText().toString().trim().equals(""))
    	{
    		if (original.substring(typing.length(), typing.length() + 1).equals(etLetter.getText().toString().toUpperCase().trim())) {
    			// The user is right
    			typing = typing + etLetter.getText().toString().toUpperCase().trim();
    			printTyping(typing);

    			verifyEndGame();
    		} else {
    			errors++;
    			// The user is wrong
    		}
    	}
    	
		etLetter.setText("");    	  
    }
    
    public void verifyEndGame() {
		// The game ended?
		if (!original.equals("") && original.equals(typing)) {
			tvMessage.setText(getString(R.string.avYouGotIt) + " " +
		       (errors == 0 ? getString(R.string.avNoErrors) : 
		    	   (errors == 1 ? getString(R.string.avOneError) : String.valueOf(errors) + " " + 
		    			   getString(R.string.avErrors))));
			started = false;
			etLetter.setText("");    	  
			etLetter.setEnabled(false);
			btGo.setEnabled(false);
		}
    }
    
	public void showMessage(String title, String msg, int iconResource) {
		AlertDialog.Builder alert = new AlertDialog.Builder(MainMenu.this);            

		if (iconResource > -1) {
			alert.setIcon(iconResource);
		}
		
		alert.setTitle(title);            
		alert.setMessage(msg);            
		alert.setPositiveButton(getString(R.string.avOk), new DialogInterface.OnClickListener() {                
			public void onClick(DialogInterface dialog, int whichButton) {
				return;
			}            
		});            

		alert.create();            
		alert.show();
	}

    private void clear() {
    	original = "";
    	typing = "";
    	encrypted = "";
    	errors = 0;
    	started = false;
    	
    	etLetter.setText("");
    	etLetter.setEnabled(false);
    	btGo.setEnabled(false);
  		tvMessage.setText("");
    	tvc1.setText("");
    	tvc2.setText("");
    	tvc3.setText("");
    	tvc4.setText("");
    	tvc5.setText("");
    	tvc6.setText("");
    	tvc7.setText("");
    	tvc8.setText("");
    	tvc9.setText("");
    	tvc10.setText("");
    	tvc11.setText("");
    	tvc12.setText("");
    	tvc13.setText("");
    	tvc14.setText("");
    	tvc15.setText("");
    	tvc16.setText("");
    	tvu1.setText("");
    	tvu2.setText("");
    	tvu3.setText("");
    	tvu4.setText("");
    	tvu5.setText("");
    	tvu6.setText("");
    	tvu7.setText("");
    	tvu8.setText("");
    	tvu9.setText("");
    	tvu10.setText("");
    	tvu11.setText("");
    	tvu12.setText("");
    	tvu13.setText("");
    	tvu14.setText("");
    	tvu15.setText("");
    	tvu16.setText("");
    }

    private void openning() {
    	clear();

    	tvc1.setText("");
    	tvc2.setText("");
    	tvc3.setText("L");
     	tvc4.setText("O");
    	tvc5.setText("T");
    	tvc6.setText("!");
    	tvc7.setText("P");
    	tvc8.setText("I");
    	tvc9.setText("Y");
    	tvc10.setText("C");
    	tvc11.setText("G");
    	tvc12.setText("O");
    	tvc13.setText("C");
    	tvc14.setText("R");
    	tvc15.setText("");
    	tvc16.setText("");

    	tvu1.setText("");
    	tvu2.setText("");
    	tvu3.setText("C");
    	tvu4.setText("R");
    	tvu5.setText("Y");
    	tvu6.setText("P");
    	tvu7.setText("T");
    	tvu8.setText("O");
    	tvu9.setText("L");
    	tvu10.setText("O");
    	tvu11.setText("G");
    	tvu12.setText("I");
    	tvu13.setText("C");
    	tvu14.setText("!");
    	tvu15.setText("");
    	tvu16.setText("");
    }

    private void doAbout() {
        try
        {
        	showMessage (getString(R.string.mnAbout), "Cryptologic!\n\n" +
        		 	     getString(R.string.avVersion) + " " + this.getPackageManager().getPackageInfo(this.getPackageName(), 0).versionName + "\n\n" +
        		 	     getString(R.string.avAuthor) + " Joubert Vasconcelos\n\n" +
        		 	     getString(R.string.avTribute), R.drawable.sobre);
        } catch (Exception e) {
        	// Nothing to do
        }
    }

    protected boolean validWord(String word) {
    	char[] w = word.trim().toUpperCase().toCharArray();
    	
    	if (w.length > 16)
    		return false;
    	else {
    		for (int i = 0; i < w.length; i++) {
    			if ( (int)w[i] < (int)'A' || (int)w[i] > (int)'Z') {
    				return false;
    			}
    		}    		
    	}    	
    	return true;
    }
    
    private String encrypt(String word) {
    	char[] w = word.trim().toUpperCase().toCharArray();
    	char[] e = new char[w.length];
    	
    	for (int j=0; j < e.length; j++)
    		e[j] = ' ';
    	
    	Random randomGenerator = new Random();
    	
    	for (int i = 0; i < e.length; i++) {
    		int r = randomGenerator.nextInt(e.length);
    		
    		if (e[r] == ' ') {
    			e[r] = w[i];
    		} else {
    			i--;
    		}    		
    	}

    	return String.valueOf(e);
    }

    private void doNewGame(int players) {
    	if (players == 1) {
    		Resources res = getResources();
    		String[] words = res.getStringArray(R.array.words_array);

        	Random randomGenerator = new Random();
        	int r = randomGenerator.nextInt(words.length);
			startGame(words[r]);
    	} else if (players ==2 ) {
    		tvMessage.setText(getString(R.string.avPlayer1TypeaWord));

    		AlertDialog.Builder alert = new AlertDialog.Builder(this);            
	    	alert.setIcon(R.drawable.balao);
    		alert.setTitle(getString(R.string.avPlayer1TypeaWord));            
    		alert.setMessage(getString(R.string.avPleaseTypeaWord));            
    		
    		final TextView tx = new TextView(this);            
    		tx.setText("");            
    		alert.setView(tx);            
    		final EditText originalWord = new EditText(this);
    		originalWord.setInputType(InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS); 
    		alert.setView(originalWord);
    		
    		alert.setPositiveButton(getString(R.string.avOk), new DialogInterface.OnClickListener() {                
    			public void onClick(DialogInterface dialog, int whichButton) {                    
    				if (originalWord.getText().toString().trim().equals("")){
    					showMessage(getString(R.string.avWarning), 
    							    getString(R.string.avTheWordCannotBeEmpty), R.drawable.warning);
    				}
	    			else
    				{
	    				if (!validWord(originalWord.getText().toString())) {
	    					showMessage(getString(R.string.avWarning), 
	    							    getString(R.string.avWordRules), R.drawable.warning);
	    				} else {
	    					startGame(originalWord.getText().toString());
	    				}	    				
    				}
    			}            
    		});            
    		alert.setNegativeButton(getString(R.string.avCancel), new DialogInterface.OnClickListener() {                
    			public void onClick(DialogInterface dialog, int whichButton) {                    
    				openning();                
    			}            
    		});            

    		alert.create();            
    		alert.show();    	
    	} else {
        	showMessage (getString(R.string.avError), getString(R.string.avYouShouldNotSee), R.drawable.exclamation);
    	}
    }

    private void printEncrypted(String word) {
    	char[] w = word.toCharArray();
    	
    	for (int i = 0; i < w.length; i++) {
        	String s = String.valueOf(w[i]);

        	if (i == 0) tvc1.setText(s);
    		else if (i == 1) tvc2.setText(s);
    		else if (i == 2) tvc3.setText(s);
    		else if (i == 3) tvc4.setText(s);
    		else if (i == 4) tvc5.setText(s);
    		else if (i == 5) tvc6.setText(s);
    		else if (i == 6) tvc7.setText(s);
    		else if (i == 7) tvc8.setText(s);
    		else if (i == 8) tvc9.setText(s);
    		else if (i == 9) tvc10.setText(s);
    		else if (i == 10) tvc11.setText(s);
    		else if (i == 11) tvc12.setText(s);
    		else if (i == 12) tvc13.setText(s);
    		else if (i == 13) tvc14.setText(s);
    		else if (i == 14) tvc15.setText(s);
    		else if (i == 15) tvc16.setText(s);
    	}
    }
    
    private void printTyping(String word) {
    	char[] w = word.toCharArray();
    	
    	for (int i = 0; i < w.length; i++) {
        	String s = String.valueOf(w[i]);

        	if (i == 0) tvu1.setText(s);
    		else if (i == 1) tvu2.setText(s);
    		else if (i == 2) tvu3.setText(s);
    		else if (i == 3) tvu4.setText(s);
    		else if (i == 4) tvu5.setText(s);
    		else if (i == 5) tvu6.setText(s);
    		else if (i == 6) tvu7.setText(s);
    		else if (i == 7) tvu8.setText(s);
    		else if (i == 8) tvu9.setText(s);
    		else if (i == 9) tvu10.setText(s);
    		else if (i == 10) tvu11.setText(s);
    		else if (i == 11) tvu12.setText(s);
    		else if (i == 12) tvu13.setText(s);
    		else if (i == 13) tvu14.setText(s);
    		else if (i == 14) tvu15.setText(s);
    		else if (i == 15) tvu16.setText(s);
    	}
    }
    
    private void startGame (String word) {
    	clear();
    	started = true;
    	etLetter.setEnabled(true);
    	btGo.setEnabled(true);
    	original = word.trim().toUpperCase();
    	
    	if (original.equals("JOUBERT"))
    		original = "VERYGREATGEEK";
    	
    	encrypted = encrypt (original);
		tvMessage.setText(getString(R.string.avPlayer2TryToDecipher));
    	
    	printEncrypted(encrypted);
    }
    
}
