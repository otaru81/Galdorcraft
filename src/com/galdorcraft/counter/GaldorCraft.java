package com.galdorcraft.counter;

import android.os.Bundle;
import android.app.Activity;
import android.os.SystemClock;
import android.view.Menu;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.EditText;

import static android.view.View.OnLongClickListener;

public class GaldorCraft extends Activity {
	
	public int count = 0;
	public String curlife = "";
	public String curwood = "";
	public String curore = "";
	public String currare = "";
    public String curfracrare = "";
    public String curturn = "";

    public Chronometer chronoTT;
    public Chronometer chronoGT;

    public void ResetGameonBtnClick() {

        ImageButton btnResetGame = (ImageButton) findViewById(R.id.imgBtnResetGame);

        btnResetGame.setOnLongClickListener(new OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                EditText Turnbox = (EditText) findViewById(R.id.txtTurnCount);
                Turnbox.setText("0");

                chronoTT = (Chronometer) findViewById(R.id.chronoTurnTime);
                chronoTT.setBase(SystemClock.elapsedRealtime());
                chronoTT.stop();

                chronoGT = (Chronometer) findViewById(R.id.chronoGameTime);
                chronoGT.setBase(SystemClock.elapsedRealtime());
                chronoGT.stop();

                ImageButton btnResetLife = (ImageButton) findViewById(R.id.imgBtnResetLife);
                ImageButton btnResetWood = (ImageButton) findViewById(R.id.imgBtnResetWood);
                ImageButton btnResetOre = (ImageButton) findViewById(R.id.imgBtnResetOre);
                ImageButton btnResetRare = (ImageButton) findViewById(R.id.imgBtnResetRare);

                btnResetLife.performClick();
                btnResetWood.performClick();
                btnResetOre.performClick();
                btnResetRare.performClick();

                return true;
            }
        });

    }

	public void ResetLifeonBtnClick() {
		
		ImageButton btnResetLife = (ImageButton) findViewById(R.id.imgBtnResetLife);
		
		btnResetLife.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				EditText Lifebox = (EditText)findViewById(R.id.txtLife);
				Lifebox.setText("40");
			}
		});
			
		}
	
	public void ResetWoodonBtnClick() {
		
		ImageButton btnResetWood = (ImageButton) findViewById(R.id.imgBtnResetWood);
		
		btnResetWood.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				EditText Woodbox = (EditText)findViewById(R.id.txtWood);
				Woodbox.setText("0");
			}
		});
			
		}
	
	public void ResetOreonBtnClick() {
		
		ImageButton btnResetOre = (ImageButton) findViewById(R.id.imgBtnResetOre);
		
		btnResetOre.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				EditText Orebox = (EditText)findViewById(R.id.txtOre);
				Orebox.setText("0");
			}
		});
			
		}
	
	public void ResetRareonBtnClick() {
		
		ImageButton btnResetRare = (ImageButton) findViewById(R.id.imgBtnResetRare);
		
		btnResetRare.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v)
			{
				EditText Rarebox = (EditText)findViewById(R.id.txtRare);
				Rarebox.setText("0");
			}
		});
			
		}

    public void ResetFracRareonBtnClick() {

        ImageButton btnResetFracRare = (ImageButton) findViewById(R.id.imgBtnResetFracRare);

        btnResetFracRare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                EditText FracRarebox = (EditText)findViewById(R.id.txtFracRare);
                FracRarebox.setText("0");
            }
        });

    }

    public void IncTurnonBtnClick() {

        ImageButton btnIncTurn = (ImageButton) findViewById(R.id.imgBtnIncTurn);

        btnIncTurn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                EditText Turnbox = (EditText)findViewById(R.id.txtTurnCount);
                curturn = Turnbox.getText().toString();
                count = Integer.parseInt(curturn);
                count++;

                if (count == 1)
                {
                    chronoGT = (Chronometer) findViewById(R.id.chronoGameTime);
                    chronoGT.setBase(SystemClock.elapsedRealtime());
                    chronoGT.start();
                }

                chronoTT = (Chronometer) findViewById(R.id.chronoTurnTime);
                chronoTT.setBase(SystemClock.elapsedRealtime());
                chronoTT.start();

                Turnbox.setText("" + count);
            }

        });

    }

    public void IncLifeonBtnClick() {

        ImageButton btnIncLife = (ImageButton) findViewById(R.id.imgBtnIncLife);

        btnIncLife.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                EditText Turnbox = (EditText)findViewById(R.id.txtTurnCount);
                curturn = Turnbox.getText().toString();
                count = Integer.parseInt(curturn);
                if (count == 0) return;

                EditText Lifebox = (EditText)findViewById(R.id.txtLife);
                curlife = Lifebox.getText().toString();
                count = Integer.parseInt(curlife);
                count++;

                Lifebox.setText("" + count);
            }

        });

    }

    public void DecLifeonBtnClick() {
			
	    ImageButton btnDecLife = (ImageButton) findViewById(R.id.imgBtnDecLife);
	    
	    btnDecLife.setOnClickListener(new View.OnClickListener() {
	    	
	    	@Override
	    	public void onClick(View v)
	    	{
                EditText Turnbox = (EditText)findViewById(R.id.txtTurnCount);
                curturn = Turnbox.getText().toString();
                count = Integer.parseInt(curturn);
                if (count == 0) return;

                EditText Lifebox = (EditText)findViewById(R.id.txtLife);
	    		curlife = Lifebox.getText().toString();
	    		count = Integer.parseInt(curlife);
	    		count--;
	    		
	    		Lifebox.setText("" + count);
	    	}
	    });
	    
		}
		
	public void IncWoodonBtnClick() {
			
			ImageButton btnIncWood = (ImageButton) findViewById(R.id.imgBtnIncWood);
		    
		    btnIncWood.setOnClickListener(new View.OnClickListener() {
		    
		    	@Override
		    	public void onClick(View v)
		    	{
                    EditText Turnbox = (EditText)findViewById(R.id.txtTurnCount);
                    curturn = Turnbox.getText().toString();
                    count = Integer.parseInt(curturn);
                    if (count == 0) return;

                    EditText Woodbox = (EditText)findViewById(R.id.txtWood);
		    		curwood = Woodbox.getText().toString();
		            count = Integer.parseInt(curwood);
		            count++;
		            
		            if (count >= 10) {
		            	count = 10;
		            }
		            
		            Woodbox.setText("" + count);
		    	}

		    });
		    
			}
			
	public void DecWoodonBtnClick() {
				
		    ImageButton btnDecWood = (ImageButton) findViewById(R.id.imgBtnDecWood);
		    
		    btnDecWood.setOnClickListener(new View.OnClickListener() {
		    	
		    	@Override
		    	public void onClick(View v)
		    	{
		    		EditText Woodbox = (EditText)findViewById(R.id.txtWood);
		    		curwood = Woodbox.getText().toString();
		    		count = Integer.parseInt(curwood);
		    		count--;
		    		
		    		if (count <= 0) {
		            	count = 0;
		            }
		    		
		    		Woodbox.setText("" + count);
		    	}
		    });
		    
			}
		
	public void IncOreonBtnClick() {
				
				ImageButton btnIncOre = (ImageButton) findViewById(R.id.imgBtnIncOre);
			    
			    btnIncOre.setOnClickListener(new View.OnClickListener() {
			    
			    	@Override
			    	public void onClick(View v)
			    	{
                        EditText Turnbox = (EditText)findViewById(R.id.txtTurnCount);
                        curturn = Turnbox.getText().toString();
                        count = Integer.parseInt(curturn);
                        if (count == 0) return;

                        EditText Orebox = (EditText)findViewById(R.id.txtOre);
			    		curore = Orebox.getText().toString();
			            count = Integer.parseInt(curore);
			            count++;
			            
			            if (count >= 10) {
			            	count = 10;
			            }
			            
			            Orebox.setText("" + count);
			    	}

			    });
			    
				}
				
	public void DecOreonBtnClick() {
					
			    ImageButton btnDecOre = (ImageButton) findViewById(R.id.imgBtnDecOre);
			    
			    btnDecOre.setOnClickListener(new View.OnClickListener() {
			    	
			    	@Override
			    	public void onClick(View v)
			    	{
			    		EditText Orebox = (EditText)findViewById(R.id.txtOre);
			    		curore = Orebox.getText().toString();
			    		count = Integer.parseInt(curore);
			    		count--;
			    		
			    		if (count <= 0) {
			            	count = 0;
			            }
			    		
			    		Orebox.setText("" + count);
			    	}
			    });
			    
				}

    public void IncRareonBtnClick() {

        ImageButton btnIncRare = (ImageButton) findViewById(R.id.imgBtnIncRare);

        btnIncRare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                EditText Turnbox = (EditText)findViewById(R.id.txtTurnCount);
                curturn = Turnbox.getText().toString();
                count = Integer.parseInt(curturn);
                if (count == 0) return;

                EditText Rarebox = (EditText)findViewById(R.id.txtRare);
                currare = Rarebox.getText().toString();
                count = Integer.parseInt(currare);
                count++;

                if (count >= 10) {
                    count = 10;
                }

                Rarebox.setText("" + count);
            }

        });

    }

    public void DecRareonBtnClick() {

        ImageButton btnDecRare = (ImageButton) findViewById(R.id.imgBtnDecRare);

        btnDecRare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                EditText Rarebox = (EditText)findViewById(R.id.txtRare);
                currare = Rarebox.getText().toString();
                count = Integer.parseInt(currare);
                count--;

                if (count <= 0) {
                    count = 0;
                }

                Rarebox.setText("" + count);
            }
        });

    }

    public void IncFracRareonBtnClick() {

        ImageButton btnIncFracRare = (ImageButton) findViewById(R.id.imgBtnIncFracRare);

        btnIncFracRare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                EditText Turnbox = (EditText)findViewById(R.id.txtTurnCount);
                curturn = Turnbox.getText().toString();
                count = Integer.parseInt(curturn);
                if (count == 0) return;

                EditText FracRarebox = (EditText)findViewById(R.id.txtFracRare);
                curfracrare = FracRarebox.getText().toString();
                count = Integer.parseInt(curfracrare);
                count++;

                if (count >= 10) {
                    count = 10;
                }

                FracRarebox.setText("" + count);
            }

        });

    }

    public void DecFracRareonBtnClick() {

        ImageButton btnDecFracRare = (ImageButton) findViewById(R.id.imgBtnDecFracRare);

        btnDecFracRare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                EditText FracRarebox = (EditText)findViewById(R.id.txtFracRare);
                curfracrare = FracRarebox.getText().toString();
                count = Integer.parseInt(curfracrare);
                count--;

                if (count <= 0) {
                    count = 0;
                }

                FracRarebox.setText("" + count);
            }
        });

    }

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_galdor_craft);

        ResetGameonBtnClick();
		ResetLifeonBtnClick();
		ResetWoodonBtnClick();
		ResetOreonBtnClick();
		ResetRareonBtnClick();
        ResetFracRareonBtnClick();
        IncTurnonBtnClick();
		IncLifeonBtnClick();
		DecLifeonBtnClick();
		IncWoodonBtnClick();
		DecWoodonBtnClick();
		IncOreonBtnClick();
		DecOreonBtnClick();
        IncRareonBtnClick();
        DecRareonBtnClick();
        IncFracRareonBtnClick();
        DecFracRareonBtnClick();
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_galdor_craft, menu);
		return true;
	}

}
