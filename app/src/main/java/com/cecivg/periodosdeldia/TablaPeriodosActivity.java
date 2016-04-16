package com.cecivg.periodosdeldia;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TablaPeriodosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_periodos);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
  //      setSupportActionBar(toolbar);

/*        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        setTitle("Day Periods");
        showActualPeriod(findViewById(android.R.id.content));

    }

/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_tabla_periodos, menu);


        return true;
    }
*/
  /*  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
*/
    private int getDayNumberToday(){
        Calendar today= Calendar.getInstance();
        int day=today.get(Calendar.DAY_OF_WEEK);
        return day;
    }
    private int getPeriodNumberNow(){
        Calendar today= Calendar.getInstance();
        int hour= today.get(Calendar.HOUR_OF_DAY);
        int min= today.get(Calendar.MINUTE);

        int period=0;

        if(hour <= 3){
            if(hour==3 && min > 25) period=2;
            else period=1;
        }else {
            if (hour <= 6) {
                if (hour == 6 && min > 15) period = 3;
                else period = 2;
            }else{
                if(hour <= 10){
                    if(hour==10 && min > 17) period=4;
                    else period= 3;
                }else{
                    if(hour <= 13){
                        if(hour==13 && min >42) period=5;
                        else period=4;
                    }else{
                        if(hour <= 17){
                            if(hour == 17 && min>8) period=6;
                            else period=5;
                        }else{
                            if(hour <= 20){
                                if(hour==20 && min > 34) period=7;
                                else period=6;
                            }else period=7;
                        }
                    }
                }
            }
        }

        return period;
    }

    private char getPeriodLetter(int row, int column){
        TableLayout table= (TableLayout)findViewById(R.id.Period_table);
        TableRow tableRow= (TableRow) table.getChildAt(row);

        TextView textView= (TextView) tableRow.getChildAt(column);

        return textView.getText().charAt(0);
    }

    private void showActualPeriod(View view){
        int day_row;
        day_row = getDayNumberToday();

        int period_col;
        period_col= getPeriodNumberNow();

        char period_letter;
        period_letter= getPeriodLetter(day_row, period_col);

        switch(period_letter){
            case 'A': onClickA(view); break;
            case 'B': onClickB(view); break;
            case 'C': onClickC(view); break;
            case 'D': onClickD(view); break;
            case 'E': onClickE(view); break;
            case 'F': onClickF(view); break;
            case 'G': onClickG(view);
        }
    }

    public void onClickA(View view){
        TextView TitleView= (TextView) findViewById(R.id.Period_title_view);
        TitleView.setText(R.string.A_period_title);

        TextView FavView= (TextView) findViewById(R.id.Period_fav_detail_view);
        FavView.setText(R.string.A_period_fav_detail);

        TextView NoFavView= (TextView) findViewById(R.id.Period_nofav_detail_view);
        NoFavView.setText(R.string.A_period_nofav_detail);
    }

    public void onClickB(View view){
        TextView TitleView= (TextView) findViewById(R.id.Period_title_view);
        TitleView.setText(R.string.B_period_title);

        TextView FavView= (TextView) findViewById(R.id.Period_fav_detail_view);
        FavView.setText(R.string.B_period_fav_detail);

        TextView NoFavView= (TextView) findViewById(R.id.Period_nofav_detail_view);
        NoFavView.setText(R.string.B_period_nofav_detail);
    }

    public void onClickC(View view){
        TextView TitleView= (TextView) findViewById(R.id.Period_title_view);
        TitleView.setText(R.string.C_period_title);

        TextView FavView= (TextView) findViewById(R.id.Period_fav_detail_view);
        FavView.setText(R.string.C_period_fav_detail);

        TextView NoFavView= (TextView) findViewById(R.id.Period_nofav_detail_view);
        NoFavView.setText(R.string.C_period_nofav_detail);
    }

    public void onClickD(View view){
        TextView TitleView= (TextView) findViewById(R.id.Period_title_view);
        TitleView.setText(R.string.D_period_title);

        TextView FavView= (TextView) findViewById(R.id.Period_fav_detail_view);
        FavView.setText(R.string.D_period_fav_detail);

        TextView NoFavView= (TextView) findViewById(R.id.Period_nofav_detail_view);
        NoFavView.setText(R.string.D_period_nofav_detail);
    }

    public void onClickE(View view){
        TextView TitleView= (TextView) findViewById(R.id.Period_title_view);
        TitleView.setText(R.string.E_period_title);

        TextView FavView= (TextView) findViewById(R.id.Period_fav_detail_view);
        FavView.setText(R.string.E_period_fav_detail);

        TextView NoFavView= (TextView) findViewById(R.id.Period_nofav_detail_view);
        NoFavView.setText(R.string.E_period_nofav_detail);
    }

    public void onClickF(View view){
        TextView TitleView= (TextView) findViewById(R.id.Period_title_view);
        TitleView.setText(R.string.F_period_title);

        TextView FavView= (TextView) findViewById(R.id.Period_fav_detail_view);
        FavView.setText(R.string.F_period_fav_detail);

        TextView NoFavView= (TextView) findViewById(R.id.Period_nofav_detail_view);
        NoFavView.setText(R.string.F_period_nofav_detail);
    }

    public void onClickG(View view){
        TextView TitleView= (TextView) findViewById(R.id.Period_title_view);
        TitleView.setText(R.string.G_period_title);

        TextView FavView= (TextView) findViewById(R.id.Period_fav_detail_view);
        FavView.setText(R.string.G_period_fav_detail);

        TextView NoFavView= (TextView) findViewById(R.id.Period_nofav_detail_view);
        NoFavView.setText(R.string.G_period_nofav_detail);
    }

    public void changeLanguage(View view){

        TextView button= (TextView) findViewById(R.id.button_language);

        String languageToLoad  = "en";

        if (button.getText().equals("Spanish")) languageToLoad= "es";

        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        Context context = view.getContext();
        context.getResources().updateConfiguration(config,context.getResources().getDisplayMetrics());

        Intent intent = new Intent(this, TablaPeriodosActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        
    }
}
