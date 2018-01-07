package com.formationandroid.vueslayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// init :
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// message de bienvenue :
		Toast.makeText(this, R.string.main_bienvenue, Toast.LENGTH_LONG).show();
	}
	
	/**
	 * Listener clic bouton retour.
	 * @param view Bouton retour
	 */
	public void onClickBoutonRetour(View view)
	{
		// retour en haut :
		ScrollView scrollViewArticle = findViewById(R.id.scrollview_article);
		scrollViewArticle.smoothScrollTo(0, 0);
		
		// message :
		Toast.makeText(this, R.string.main_retour, Toast.LENGTH_LONG).show();
	}
	
}
