package tejada.emilio.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ScrollingActivity extends AppCompatActivity {
    int NUM_EJERCICIOS = 20;
    int EJERCICIO_INICIAL=1;
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);



      //  LinearLayout ll = (LinearLayout) findViewById(R.id.activity_lanzador);

        for (int i = EJERCICIO_INICIAL; i < EJERCICIO_INICIAL + NUM_EJERCICIOS; i++) {
            Button boton = new Button(this);
            boton.setText("Ejercicio " + i);
            boton.setTag(i);
            // boton.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));

            //LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
            //lparams.addRule(LinearLayout.ALIGN_PARENT_END, R.id.activity_lanzador);
           // boton.setLayoutParams(lparams);

            boton.setOnClickListener(getOnClickDoSomething(boton));

            //ll.addView(boton);

        }




    }



    View.OnClickListener getOnClickDoSomething(final Button button)  {
        return new View.OnClickListener() {
            public void onClick(View v) {
                String PACKAGE_NAME = getApplicationContext().getPackageName();
                String actividadAlanzar = String.valueOf(button.getTag());
                Class<?> activity = null;
                try {
                    activity = Class.forName(PACKAGE_NAME+".Ej_"+actividadAlanzar+"_activity1");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }


                Intent intent = new Intent(button.getContext(), activity);
                startActivity(intent);
            }
        };
    }

}
