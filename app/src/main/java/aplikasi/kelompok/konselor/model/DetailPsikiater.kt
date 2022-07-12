package aplikasi.kelompok.konselor.model;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import aplikasi.kelompok.konselor.R
import aplikasi.kelompok.konselor.adapter.AdapterPsikiter
import aplikasi.kelompok.konselor.menu.DataPsikiater
import aplikasi.kelompok.konselor.menu.Psikiater

class DetailPsikiater : AppCompatActivity() {

    private var list : ArrayList<Psikiater> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rvPsikiater : RecyclerView = findViewById(R.id.rv_psikiater)
        rvPsikiater.setHasFixedSize(true)

        list.addAll(DataPsikiater.listData)

        val cardViewHolder = AdapterPsikiter(list)
        rvPsikiater.adapter = cardViewHolder

        rvPsikiater.layoutManager = LinearLayoutManager(this)
    }
}