package aplikasi.kelompok.konselor.adapter

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import aplikasi.kelompok.konselor.R
import aplikasi.kelompok.konselor.menu.Konselor
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class AdapterKonselor(private val listKonselor: ArrayList<Konselor>) : RecyclerView.Adapter<AdapterKonselor.CardViewHolder>() {
    class CardViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto : CircleImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvBio : TextView = itemView.findViewById(R.id.tv_item_bio)
        var tvKeahlian : TextView = itemView.findViewById(R.id.tv_item_keahlian)
        var btnFavorite : Button = itemView.findViewById(R.id.btn_favorit)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.activity_card_item_layoutkonselor, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val konselor = listKonselor[position]

        Glide.with(holder.itemView.context)
            .load(konselor.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)

        holder.tvName.text = konselor.name
        holder.tvBio.text = konselor.bio
        holder.tvKeahlian.text = konselor.keahlian

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Klik Favorite jika ${listKonselor[holder.adapterPosition].name} adalah konselor favoritemu",
                Toast.LENGTH_SHORT).show()
        }
        holder.btnFavorite.setOnClickListener {
            AlertDialog.Builder(holder.itemView.context)
                .setTitle("Konselor Favorite \uD83D\uDC95")
                .setMessage("Kamu memilih ${listKonselor[holder.adapterPosition].name} sebagai konselor favorite")
                .setCancelable(true)
                .setPositiveButton("Ya", DialogInterface.OnClickListener { _, _ ->
                    Toast.makeText(holder.itemView.context, "Ehem kamu suka ${listKonselor[holder.adapterPosition].name} ya~ hihihi",
                        Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton("Batal", DialogInterface.OnClickListener { dialog, _ ->  dialog.cancel()})
                .create()
                .show()
        }
    }

    override fun getItemCount(): Int {
        return listKonselor.size
    }
}