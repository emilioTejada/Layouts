//LAYOUTS ANIMADOS CON JAVA

        package tejada.emilio.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

public class Ej_12_activity1 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej_12_activity1);

        int rp=TranslateAnimation.RELATIVE_TO_PARENT;
        TranslateAnimation traslacion= new TranslateAnimation(rp,1f,rp,0f,rp,0f,rp,0f);
        traslacion.setDuration(3000);

        LayoutAnimationController la= new LayoutAnimationController(traslacion);
        la.setDelay(1);
        la.setOrder(LayoutAnimationController.ORDER_NORMAL);

        LinearLayout ll=(LinearLayout) findViewById(R.id.layout);
        ll.setLayoutAnimation(la);
    }
}