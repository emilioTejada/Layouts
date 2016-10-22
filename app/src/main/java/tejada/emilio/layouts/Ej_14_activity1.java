package tejada.emilio.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class Ej_14_activity1 extends AppCompatActivity {
    private LinearLayout layoutAnimado;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej_14_activity1);
        layoutAnimado = (LinearLayout) findViewById(R.id.animado);
    }
    public void mostrar(View button) {
        if (layoutAnimado.getVisibility() == View.GONE)
        {
            Animation animation=AnimationUtils.loadAnimation(this,
                    R.anim.ej_14_sube );
            layoutAnimado.startAnimation(animation);
            layoutAnimado.setVisibility(View.VISIBLE);
        }
    }
    public void ocultar(View button) {
        if (layoutAnimado.getVisibility() == View.VISIBLE)
        {
            Animation animation=AnimationUtils.loadAnimation(this,
                    R.anim.ej_14_baja);
            layoutAnimado.startAnimation(animation);
            layoutAnimado.setVisibility(View.GONE);
        }
    }
}