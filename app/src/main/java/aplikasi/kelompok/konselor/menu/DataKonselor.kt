package aplikasi.kelompok.konselor.menu

import aplikasi.kelompok.konselor.R

object DataKonselor {
    private val konselorImages = intArrayOf(
        R.drawable.dany,
        R.drawable.diva,
        R.drawable.lucky,
        R.drawable.royzan
    )

    private val konselorNames = arrayOf(
        "Dany Tegar Prasetyo",
        "Aisya Diva",
        "Lucky Mumpuni",
        "Royzan Wida Saputra"
    )

    private val konselorBio = arrayOf(
        "Jangan takut gagal, karna ia bagian dari kesuksesan",
        "The most beautiful thing you can wear is confident",
        "Coba melihat dari sudut pandang lain",
        "stop saying \"I WISH\" start saying \"I WILL\""
    )

    private val konselorKeahlian = arrayOf(
        "Pakar keluarga dan hidup",
        "Pakar self love dan parenting",
        "Pakar pendidikan, perempuan, dan orientasi hidup",
        "Pakar cinta dan pertemanan"
    )

    val listData: ArrayList<Konselor>
        get() {
            val list = arrayListOf<Konselor>()
            for (position in konselorNames.indices){
                val konselor = Konselor()
                konselor.name = konselorNames[position]
                konselor.photo = konselorImages[position]
                konselor.bio = konselorBio[position]
                konselor.keahlian = konselorKeahlian[position]
                list.add(konselor)
            }
            return list
        }
}