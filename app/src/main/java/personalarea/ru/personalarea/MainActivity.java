package personalarea.ru.personalarea;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout layotVertButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TableLayout table = new TableLayout(this);
        table.setStretchAllColumns(true);
        table.setShrinkAllColumns(true);
        table.setBackgroundResource(R.drawable.d_back_para_count);
        TableRow rowTitle = new TableRow(this);
        rowTitle.setGravity(Gravity.CENTER_HORIZONTAL);
        rowTitle.setPadding(0, 10, 0, 0);

        TextView title = new TextView(this);
        title.setText("Общая информация");
        title.setBackgroundResource(R.drawable.d_back_compound_maroon);
        title.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
        title.setGravity(Gravity.CENTER);
        title.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);

        TableRow.LayoutParams params = new TableRow.LayoutParams();
        params.span = 2;
        rowTitle.addView(title, params);

        //TableRow emptyRow = new TableRow(this);
        //TextView emptyView = new TextView(this);
        //emptyRow.addView(emptyView);

        TableRow dataLS = new TableRow(this);
        //dataLS.setGravity(Gravity.LEFT);
        dataLS.setGravity(Gravity.CENTER);
        dataLS.setPadding(1, 10, 1, 1);

        //Button btnNew = new Button(this);
        ImageButton btnNew = new ImageButton(this);
        //btnNew.setImageResource(R.drawable.d_back_compound_green);
        btnNew.setBackgroundResource(R.drawable.d_back_compound_green);
        TextView textBtn = new TextView(this);
        textBtn.setText("Подробно");
        textBtn.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 17);
        textBtn.setGravity(Gravity.CENTER);

        FrameLayout fl = new FrameLayout(this);
        fl.addView(btnNew);
        fl.addView(textBtn);

        TextView addr = new TextView(this);
        addr.setText("Омск, ул. Перелета, д.8, кв. 379");
        addr.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 17);
        addr.setGravity(Gravity.CENTER);
        addr.setBackgroundResource(R.drawable.d_back_compound_green);

        dataLS.addView(fl);
        dataLS.addView(addr);

        table.addView(rowTitle);
        //table.addView(emptyRow);
        table.addView(dataLS);
        setContentView(table);
    }
}
