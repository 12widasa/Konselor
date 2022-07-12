package aplikasi.kelompok.konselor.adapter;

import aplikasi.kelompok.konselor.R

import android.app.AlertDialog
import android.app.PendingIntent.getActivity
import android.content.DialogInterface
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import aplikasi.kelompok.konselor.menu.DataPsikiater
import aplikasi.kelompok.konselor.menu.Psikiater
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class AdapterPsikiter(private val listPsikiater: ArrayList<Psikiater>) : RecyclerView.Adapter<AdapterPsikiter.CardViewHolder>() {
    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvJadwal: TextView = itemView.findViewById(R.id.tv_item_jadwal)
        var tvAlamat: TextView = itemView.findViewById(R.id.tv_item_alamat)
        var btnLokasi: Button = itemView.findViewById(R.id.btn_lokasi)
        var btnHubungi: Button = itemView.findViewById(R.id.btn_hubungi)
        var btnSitus: Button = itemView.findViewById(R.id.btn_situs)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.card_item_layout, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val psikiater = listPsikiater[position]

        holder.tvName.text = psikiater.name
        holder.tvJadwal.text = psikiater.jadwal
        holder.tvAlamat.text = psikiater.alamat

        holder.btnSitus.setOnClickListener {
            var website = psikiater.web
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(website))
            holder.itemView.context.startActivity(intent)
        }
        holder.btnLokasi.setOnClickListener {
            var lokasi = psikiater.map
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(lokasi))
            holder.itemView.context.startActivity(intent)
        }
        holder.btnHubungi.setOnClickListener {
            var telepon = psikiater.telp
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(telepon))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
            return listPsikiater.size
        }
}

