package aplikasi.kelompok.konselor.menu

object DataPsikiater {

    private val psikiaterWeb = arrayOf(
        "https://klinikpratamapurisaras.business.site/",
        "http://tanyakakrani.com/",
        "https://rs-amino.jatengprov.go.id/",
        "http://ismedyusuf.com/",
        "http://www.lptsemarang.com/",
        "http://www.unika.ac.id/ppt",
        "https://instagram.com/psikocare.smg?utm_medium=copy_link",
        "http://www.smc-hospital.com/",
        "http://www.semaranghypnotherapy.com/",
        "https://instagram.com/pkbmtalenta?utm_medium=copy_link",
        "http://www.tamanbintang.com/",
        "https://instagram.com/rumahmentari_semarang?utm_medium=copy_link"
    )

    private val psikiaterTelp = arrayOf(
        "tel:082223473435",
        "tel:088228998101",
        "tel:0246722565",
        "tel:0243517241",
        "tel:0248415530",
        "tel:02486457912",
        "tel:087784400017",
        "tel:02486466000",
        "tel:08562743869",
        "tel:08170570897",
        "tel:081234595735",
        "tel:081343209695"
    )

    private val psikiaterMap = arrayOf(
        "https://maps.app.goo.gl/m3dxmYZj2rrWA5iM7",
        "https://g.page/Layanankonsultasipsikologi?share",
        "https://g.page/rsjdamino?share",
        "https://goo.gl/maps/i1RnLh6w8cEzyczf6",
        "https://goo.gl/maps/zRncjc2xPHn5c5No7",
        "https://goo.gl/maps/ZsPcTgX1DY6CafGU8",
        "https://g.page/PSIKOCARE?share",
        "https://goo.gl/maps/eoU1edbXhqAEA4FdA",
        "https://g.page/semaranghipnoterapicepat?share",
        "https://maps.app.goo.gl/5oUFw1d7SYCz6DAG7",
        "https://goo.gl/maps/d44DA5ZrPc59Hz4y7",
        "https://maps.app.goo.gl/9ZBTQR9ga2c5ARCfA"
    )




    private val psikiaterNames = arrayOf(
        "Klinik Pratama Puri Saras (BPJS dan UMUM)",
        "Praktek Psikolog Spirit Psychology Center Semarang",
        "RSJD Dr Amino Gondohutomo",
        "Dr. H. Ismed Yusuf",
        "Lembaga Psikologi Terapan",
        "Pusat Psikologi Terapan Unika Soegijapranata",
        "Jasa Layanan Psikologi Psikocare",
        "Semarang Hipnoterapi Cepat",
        "Konsultasi Psikologi",
        "Taman Bintang",
        "Layanan Psikologi Rumah Mentari",
        "RS Telogorejo"
    )

    private val psikiaterJadwal = arrayOf(
        "Senin-Sabtu 09.00-12.00,16-00-20.00",
        "Senin-Sabtu, 11.00-17.00",
        "Senin-Sabtu, 24 jam",
        "Senin-Sabtu, 16.00-20.00",
        "Senin-Sabtu, 08.00-17.00",
        "Senin-Sabtu, 08.00-16.00",
        "Senin-Sabtu, 08.00-16.00",
        "Senin-Sabtu , 24 jam",
        "Senin-Jumat, 07.00-16.00, " +
                "Sabtu, 07.00-12.00",
        "Senin-Jumat, 07.00-16.00" +
                "Sabtu, 07.00-12.00",
        "Senin-Jumat, 09.00-16.00",
        "Senin-Sabtu, 24 jam"
    )

    private val psikiaterAlamat = arrayOf(
        "Jl. Sompak Lama No.48, Lamper Lor, Kec. Semarang Selatan, Kota Semarang",
        "Jl. Drupadi No.2A/2, Plombokan, Kec. Semarang Utara, Kota Semarang",
        "Jl. Brigjen Sudiarto No.347, Gemah, Kec. Pedurungan, Kota Semarang",
        "Jl. Cilosari NO.572, Bugangan, Kec. Semarang Timur, Kota Semarang",
        "Jl. Kaligarang No.1, Petompon, Kec. Gajahmungkur, Kota Semarang",
        "Jl. Pawiyatan Luhur IV No. 1, Tinjomoyo, Kec. Banyumanik, Kota Semarang",
        "City Park Medoho Blk. L No. 11, Kalicari, Kec. Pedurungan, Kota Semarang",
        "Jl. WR. Supratman X No.27, Gisikdrono, Kec. Semarang Barat, Kota Semarang",
        "Jl. Mintojiwo Dalam V No.8, Gisikdrono, Kec. Semarang Barat, Kota Semarang",
        "Jl. MT. Haryono No.685 C, Wonodri, Kec. Semarang Selatan, Kota Semarang",
        "Jl. Panda Utara I No. 4, Palebon, Kec. Pedurungan, Kota Semarang",
        "Jl. KH Ahmad Dahlan, Pekuden, Kec.semarang Tengah, Kota Semarang"
    )

    val listData: ArrayList<Psikiater>
        get() {
            val list = arrayListOf<Psikiater>()
            for (position in psikiaterNames.indices){
                val psikiater = Psikiater()
                psikiater.map = psikiaterMap[position]
                psikiater.telp = psikiaterTelp[position]
                psikiater.web = psikiaterWeb[position]
                psikiater.name = psikiaterNames[position]
                psikiater.jadwal = psikiaterJadwal[position]
                psikiater.alamat = psikiaterAlamat[position]
                list.add(psikiater)
            }
            return list
        }
}