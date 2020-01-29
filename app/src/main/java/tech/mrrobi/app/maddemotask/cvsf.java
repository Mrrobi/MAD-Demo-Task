package tech.mrrobi.app.maddemotask;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cvsf extends AppCompatActivity {

    Dialog myDialog;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvsf);
        myDialog = new Dialog(this);

        final Button b1 = (Button)findViewById(R.id.btn11);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText tvin = (EditText) findViewById(R.id.tvin1);
                final TextView tvout = (TextView)findViewById(R.id.tvout1);
                String str = tvin.getText().toString();
                double val = Double.parseDouble(str);

                double res = (val * (9.00/5.00))+32.00;
                str = Double.toString(res);

                tvout.setText(str);

            }
        });

    }

}
