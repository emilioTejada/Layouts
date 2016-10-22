package tejada.emilio.layouts;

    import android.app.Activity;
    import android.os.Bundle;
    import android.view.animation.Animation;
    import android.view.animation.AnimationUtils;
    import android.widget.TextView;
public class Ej_11_activity1 extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej_11_activity1);

        TextView texto= (TextView) findViewById(R.id.texto1);
        texto.setText("ANIMACIÓN ROTACIÓN");

        TextView ejemplo= (TextView) findViewById(R.id.texto);
        ejemplo.setText("TEXTO GIRANDO");

        Animation td = AnimationUtils.loadAnimation(this,R.anim.rotacion);
        td.setRepeatMode(Animation.RESTART);
        td.setRepeatCount(20);
        ejemplo.startAnimation(td);
    }
}