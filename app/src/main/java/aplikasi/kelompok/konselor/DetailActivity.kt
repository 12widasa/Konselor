package aplikasi.kelompok.konselor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import aplikasi.kelompok.konselor.adapter.AdapterPsikiter
import aplikasi.kelompok.konselor.menu.DataPsikiater
import aplikasi.kelompok.konselor.menu.Psikiater

class DetailActivity : AppCompatActivity() {

    private var list : ArrayList<Psikiater> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var rvDosen : RecyclerView = findViewById(R.id.rv_psikiater)
        rvDosen.setHasFixedSize(true)

        list.addAll(DataPsikiater.listData)

        val cardViewHolder = AdapterPsikiter(list)
        rvDosen.adapter = cardViewHolder

        rvDosen.layoutManager = LinearLayoutManager(this)
    }
}