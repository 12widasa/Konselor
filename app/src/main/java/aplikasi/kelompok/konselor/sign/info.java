package aplikasi.kelompok.konselor.sign;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import aplikasi.kelompok.konselor.R;

public class info extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_info);

        button = (Button) findViewById(R.id.btn_selanjutnya);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_info();
            }
        });
    }
    public void button_info(){
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
}