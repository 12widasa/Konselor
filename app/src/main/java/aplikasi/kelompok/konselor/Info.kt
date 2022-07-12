package aplikasi.kelompok.konselor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import aplikasi.kelompok.konselor.sign.SignIn

class Info : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val btnMoveActivity: Button = findViewById(R.id.btn_selanjutnya)
        btnMoveActivity.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_selanjutnya -> {
                val moveActivity = Intent(this, SignIn::class.java)
                startActivity(moveActivity)
            }
        }
    }
}