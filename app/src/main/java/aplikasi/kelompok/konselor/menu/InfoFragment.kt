package aplikasi.kelompok.konselor.menu


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import aplikasi.kelompok.konselor.DetailActivity
import aplikasi.kelompok.konselor.DetailKonselorActivity
import aplikasi.kelompok.konselor.R

class InfoFragment : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var fragmentView = inflater.inflate(R.layout.fragment_info, container, false)

        val btnPsikiater : Button = fragmentView.findViewById(R.id.btn_psikiater)
        btnPsikiater.setOnClickListener(this)

        val btnKonselor : Button = fragmentView.findViewById(R.id.btn_konselor)
        btnKonselor.setOnClickListener(this)

        val btnPhone1 : Button = fragmentView.findViewById(R.id.btn_komnas)
        btnPhone1.setOnClickListener(this)

        val btnPhone2 : Button = fragmentView.findViewById(R.id.btn_lpm)
        btnPhone2.setOnClickListener(this)

        val btnPhone3 : Button = fragmentView.findViewById(R.id.btn_lbh)
        btnPhone3.setOnClickListener(this)
        return fragmentView
    }


    override fun onClick(v: View) {
        when(v.id){

            R.id.btn_komnas -> {
                val phone = "tel:0213903963"
                val phoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse(phone))
                startActivity(phoneIntent)
            }
            R.id.btn_konselor -> {
                val lokasi = Intent(this.context, DetailKonselorActivity::class.java)
                startActivity(lokasi)
            }
            R.id.btn_psikiater -> {
                val situs = Intent(this.context, DetailActivity::class.java)
                startActivity(situs)
            }
            R.id.btn_lpm -> {
                val phone = "tel:082125751234"
                val phoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse(phone))
                startActivity(phoneIntent)
            }
            R.id.btn_lbh -> {
                val phone = "tel:081388822669"
                val phoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse(phone))
                startActivity(phoneIntent)
            }
        }
    }
}