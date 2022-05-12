package aplimovil.android.helloandroidx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btn;
    private int contador;

    @Override
    protected void onCreate(Bundle Icicle) {
        super.onCreate(Icicle);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
        updateTime();
    }

    public void updateTime()
    {
        contador ++;
        btn.setText(new Date().toString());

    }

    @Override
    public void onClick(View view)
    {
        updateTime();
    }
}