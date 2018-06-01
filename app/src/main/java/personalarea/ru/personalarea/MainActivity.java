package personalarea.ru.personalarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout layotVertButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //layotVertButton = (LinearLayout) findViewById(R.id.LayotVertButton);
        TableLayout tablelayout = new TableLayout(this);
        tablelayout.setStretchAllColumns(true);
        tablelayout.setShrinkAllColumns(true);
        TableRow rowTitle = new TableRow(this);
        rowTitle.setGravity(Gravity.CENTER_HORIZONTAL);
        TableRow rowDayLabels = new TableRow(this);
        TableRow rowHighs = new TableRow(this);
        TableRow rowLows = new TableRow(this);
        TableRow rowConditions = new TableRow(this);
        rowConditions.setGravity(Gravity.CENTER);
        setContentView(tablelayout);
     /*   ImageButton btnNew = new ImageButton(this);
        //btnNew.setText("ButtonTest");
        btnNew.setImageResource(R.drawable.doodlejump);
        layotVertButton.addView(btnNew);
        Button btnNew1 = new Button(this);
        btnNew1.setText("ButtonTest");
        layotVertButton.addView(btnNew1);
        */
    }
}
