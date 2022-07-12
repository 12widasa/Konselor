package aplikasi.kelompok.konselor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import aplikasi.kelompok.konselor.adapter.AdapterKonselor
import aplikasi.kelompok.konselor.adapter.AdapterPsikiter
import aplikasi.kelompok.konselor.menu.DataKonselor
import aplikasi.kelompok.konselor.menu.DataPsikiater
import aplikasi.kelompok.konselor.menu.Konselor
import aplikasi.kelompok.konselor.menu.Psikiater

class DetailKonselorActivity : AppCompatActivity() {

    private var list : ArrayList<Konselor> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_konselor)

        var rvKonselor : RecyclerView = findViewById(R.id.rv_konselor)
        rvKonselor.setHasFixedSize(true)

        list.addAll(DataKonselor.listData)

        val cardViewHolder = AdapterKonselor(list)
        rvKonselor.adapter = cardViewHolder

        rvKonselor.layoutManager = LinearLayoutManager(this)
    }
}