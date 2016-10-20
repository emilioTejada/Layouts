package tejada.emilio.layouts;


import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class Lanzador extends AppCompatActivity {
    int NUM_EJERCICIOS = 9;
    int EJERCICIO_INICIAL=1;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanzador);
        LinearLayout ll = (LinearLayout) findViewById(R.id.activity_lanzador);

        for (int i = EJERCICIO_INICIAL; i < EJERCICIO_INICIAL + NUM_EJERCICIOS; i++) {
            Button boton = new Button(this);
            boton.setText("Ejercicio " + i);
            boton.setTag(i);
            // boton.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));

            LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);
            //lparams.addRule(LinearLayout.ALIGN_PARENT_END, R.id.activity_lanzador);
            boton.setLayoutParams(lparams);

            boton.setOnClickListener(getOnClickDoSomething(boton));

            ll.addView(boton);

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




//       Button bt = new Button(this);
//        bt.setText("A Button");
//

}
