package tejada.emilio.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Ej_9_activity1 extends AppCompatActivity {

    private TextView text1;
    private TextView text2;
    private FrameLayout frame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ej_9_activity1);
        frame = (FrameLayout) findViewById(R.id.framelayout);
        text1 = (TextView) findViewById(R.id.texto1);
        text2 = (TextView) findViewById(R.id.texto2);
        text1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setVisibility(View.GONE);
                text2.setVisibility(View.VISIBLE);}
        });
    }
}