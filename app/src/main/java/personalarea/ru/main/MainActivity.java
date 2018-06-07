package personalarea.ru.main;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import personalarea.ru.personalarea.R;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TableLayout table = new TableLayout(this);
        table.setStretchAllColumns(true);
        table.setShrinkAllColumns(true);
        //table.setBackgroundResource(R.drawable.d_back_para_count);
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
        params.span = 3;
        rowTitle.addView(title, params);

        TableRow dataLS = new TableRow(this);
        //dataLS.setGravity(Gravity.LEFT);
        //dataLS.setBackgroundResource(R.drawable.cellborder);
        dataLS.setGravity(Gravity.CENTER);
        dataLS.setPadding(1, 10, 1, 1);

        //Button btnNew = new Button(this);
        ImageButton btnNew = new ImageButton(this);
        btnNew.setBackgroundResource(R.drawable.d_back_compound_green);
        btnNew.setOnClickListener(this);
        TextView textBtn = new TextView(this);
        textBtn.setText("Подробно...");
        textBtn.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 17);
        textBtn.setGravity(Gravity.CENTER);
        textBtn.setPadding(1, 10, 1, 1);
        textBtn.setBackgroundResource(R.drawable.cellborder);

        FrameLayout fl = new FrameLayout(this);
        fl.addView(btnNew);
        fl.addView(textBtn);

        TextView addr = new TextView(this);
        addr.setText("Омск, ул. Перелета, д.8, кв. 379");
        addr.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 17);
        addr.setGravity(Gravity.CENTER);
        addr.setBackgroundResource(R.drawable.d_back_compound_green);
        addr.setPadding(1, 10, 1, 1);
        addr.setBackgroundResource(R.drawable.cellborder);

        TextView ls = new TextView(this);
        ls.setText("87150926785");
        ls.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 17);
        ls.setGravity(Gravity.CENTER);
        ls.setBackgroundResource(R.drawable.d_back_compound_green);
        ls.setPadding(1, 10, 1, 1);
        ls.setBackgroundResource(R.drawable.cellborder);

        dataLS.addView(fl);
        //dataLS.addView(btnNew);
        dataLS.addView(addr);
        dataLS.addView(ls);

        table.addView(rowTitle);
        //table.addView(emptyRow);
        table.addView(dataLS);
        setContentView(table);
    }
    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this, MoreAccount.class);

        startActivity(intent);
    }
}
