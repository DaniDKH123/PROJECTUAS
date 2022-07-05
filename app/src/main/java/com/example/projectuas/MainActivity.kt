package com.example.projectuas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namakotaList = listOf<namakota>(
            namakota(
                R.drawable.jakarta,
                namenamakota = "Jakarta",
                descnamakota = "Jakarta Raya adalah ibu kota negara dan kota terbesar di Indonesia. Jakarta merupakan satu-satunya kota di Indonesia yang memiliki status setingkat provinsi. Jakarta terletak di pesisir bagian barat laut Pulau Jawa. Dahulu pernah dikenal dengan beberapa nama di antaranya Sunda Kelapa, Jayakarta, dan Batavia. Jakarta juga mempunyai julukan The Big Durian karena dianggap kota yang sebanding New York City (Big Apple) di Indonesia.",
                desc2namakota = "Jakarta memiliki luas sekitar 664,01 km² (lautan: 6.977,5 km²) \n" +
                        " penduduk berjumlah 10.562.088 jiwa (2020)\n" +
                        " Wilayah metropolitan Jakarta (Jabodetabek) yang berpenduduk sekitar 28 juta jiwa\n" +
                        " Sebagai pusat bisnis, politik, dan kebudayaan, Jakarta merupakan tempat berdirinya kantor-kantor pusat BUMN, perusahaan swasta, dan perusahaan asing\n" +
                        " Kota ini juga menjadi tempat kedudukan lembaga-lembaga pemerintahan dan kantor sekretariat ASEAN. Jakarta dilayani oleh dua bandar udara, yakni Bandara Soekarno–Hatta dan Bandara Halim Perdanakusuma, serta tiga pelabuhan laut di Tanjung Priok, Sunda Kelapa, dan Ancol"
            ),

            namakota(
                R.drawable.jambi,
                namenamakota = "Jambi",
                descnamakota = "Jambi (Jawi: جامبي) adalah sebuah provinsi di Indonesia yang terletak di pesisir timur di bagian tengah pulau Sumatra, ibu kotanya berada di kota Jambi. Provinsi Jambi adalah nama provinsi di Indonesia yang ibu kotanya memiliki nama sama dengan provinsi selain Bengkulu, Daerah Khusus Ibukota Jakarta, Daerah Istimewa Yogyakarta, dan Gorontalo.",
                desc2namakota = "Kota ini dibelah oleh sungai terpanjang di Sumatra yang bernama Batang Hari, kedua kawasan tersebut terhubung oleh jembatan Aur Duri \n" +
                        " Kota Jambi memiliki luas sekitar 205,38 km²\n" +
                        " jumlah penduduk tahun 2021 sebanyak 621.365 jiwa\n" +
                        " Hari jadi Kota Jambi ditetapkan pada tanggal 28 Mei 1401 berdasarkan peraturan daerah Kota Jambi nomor 3 tahun 2014\n" +
                        " Dalam pertimbangan disebutkan bahwa penetapan hari jadi tersebut tidak lepas dari momentum sejarah ditemukannya tanah pilih oleh Putri Selaras Pinang Masak bersama sepasang angsa yang terjadi pada tanggal 28 Mei 1401 Masehi, berlokasi disepanjang rumah dinas komandan resort militer sampai ke Masjid Agung Al-Falah."
            ),

            namakota(
                R.drawable.madiun,
                namenamakota = "Madiun",
                descnamakota = "Madiun adalah sebuah kabupaten di Provinsi Jawa Timur, Indonesia. Kabupaten ini berbatasan dengan Kabupaten Bojonegoro di utara, Kabupaten Nganjuk di timur, Kabupaten Ponorogo di selatan, serta Kabupaten Magetan, dan Kabupaten Ngawi di barat. ",
                desc2namakota = "Ibu kotanya adalah Caruban sesuai dengan Peraturan Pemerintah Nomor 3 Tahun 2019. Sebagian gedung-gedung pemerintahan sudah berada di wilayah Mejayan yang merupakan bagian dari Kecamatan Mejayan. Gedung pemerintahan lain telah dipindah secara bertahap dari Kota Madiun ke Mejayan sejak 2011 \n" +
                        " Kabupaten Madiun terdiri dari 15 kecamatan, 8 kelurahan, dan 198 desa\n" +
                        " Pada tahun 2017, jumlah penduduknya mencapai 727.994 jiwa \n" +
                        " luas wilayah 1.037,58 km²\n" +
                        " sebaran penduduk 701 jiwa/km²"
            ),

            namakota(
                R.drawable.magelang,
                namenamakota = "Magelang",
                descnamakota = "Magelang (bahasa Jawa: \u200Bꦩꦒꦼꦭꦁ, translit. Magêlang) adalah salah satu kota yang terletak di provinsi Jawa Tengah, Indonesia. Kota Magelang merupakan enklave dari Kabupaten Magelang, yang terletak pada jalur antara Kota Semarang–Daerah Istimewa Yogyakarta.",
                desc2namakota = "Kota Magelang terdiri dari 3 kecamatan dan 17 kelurahan \n" +
                        " Pada tahun 2017, jumlah penduduknya diperkirakan sebesar 129.303 jiwa \n" +
                        " kepadatan 8.051 jiwa/km² \n" +
                        " luas wilayah 16,06 km² \n" +
                        " Pada tahun 2021, jumlah penduduk kota Magelang sebanyak 127.251 jiwa, dengan kepadatan penduduk 7.919 jiwa/km2"
            ),

            namakota(
                R.drawable.makasar,
                namenamakota = "Makasar",
                descnamakota = "Makasar adalah salah satu kota yang juga merupakan ibu kota provinsi Sulawesi Selatan. Makassar merupakan kota metropolitan terbesar keempat di Indonesia dan kawasan Indonesia Timur dan pada masa lalu pernah menjadi ibu kota Negara Indonesia Timur dan provinsi Sulawesi.",
                desc2namakota = "Makassar terletak di pesisir barat daya Pulau Sulawesi dan berbatasan dengan Selat Makassar di sebelah barat, Kabupaten Kepulauan Pangkajene di sebelah utara, Kabupaten Maros di sebelah timur dan Kabupaten Gowa di sebelah selatan. \n" +
                        " Menurut Bappenas, Makassar adalah salah satu dari empat pusat pertumbuhan utama di Indonesia, bersama dengan Medan, Jakarta, dan Surabaya \n" +
                        " wilayah seluas 175,77 km² \n" +
                        " jumlah penduduk lebih dari 1,5 juta jiwa \n" +
                        " kota ini berada di urutan ketujuh kota terbesar di Indonesia setelah Jakarta, Surabaya, Bandung, Medan, Semarang dan Palembang"
            ),

            namakota(
                R.drawable.malang,
                namenamakota = "Malang",
                descnamakota = "Malang adalah sebuah kota yang terletak di provinsi Jawa Timur, Indonesia, kota terbesar kedua di Jawa Timur setelah Surabaya, dan kota terbesar ke-12 di Indonesia. ",
                desc2namakota = "Kota ini didirikan pada masa Pemerintahan Belanda pada tanggal 1 April 1914, yang dimana E.K Broeveldt sebagai walikota pertama,Kota ini terletak di dataran tinggi seluas 145,28 km² yang merupakan enklave Kabupaten Malang. Bersama dengan Kota Batu dan Kabupaten Malang, Kota Malang merupakan bagian dari kesatuan wilayah yang dikenal dengan Malang Raya. \n" +
                        " Kota Malang terdiri dari 5 kecamatan dan 57 kelurahan (dari total 666 kecamatan, 777 kelurahan, dan 7.724 desa di Jawa Timur). \n" +
                        " sebaran penduduk 5.744 jiwa/km² \n" +
                        " Pada tahun 2017, jumlah penduduknya mencapai 834.545 jiwa. \n" +
                        " luas wilayah 145,28 km²"
            ),

            namakota(
                R.drawable.medan,
                namenamakota = "Medan",
                descnamakota = " Medan adalah ibu kota provinsi Sumatra Utara, Indonesia. Kota ini merupakan kota terbesar ketiga di Indonesia setelah DKI Jakarta dan Surabaya serta kota terbesar di luar pulau Jawa. ",
                desc2namakota = " Kota Medan merupakan pintu gerbang wilayah Indonesia bagian barat dengan keberadaan Pelabuhan Belawan dan Bandar Udara Internasional Kuala Namu yang merupakan bandara terbesar kedua di Indonesia. Akses dari pusat kota menuju pelabuhan dan bandara dilengkapi oleh jalan tol dan kereta api. \n" +
                        " Medan adalah kota pertama di Indonesia yang mengintegrasikan bandara dengan kereta api. Berbatasan dengan Selat Malaka, Medan menjadi kota perdagangan, industri, dan bisnis yang sangat penting di Indonesia.  \n" +
                        " Kota Medan terdiri dari 21 kecamatan dan 151 kelurahan  \n" +
                        " luas wilayah mencapai 265,00 km² dan jumlah penduduk sekitar 2.478.145 jiwa (2017) dengan kepadatan penduduk 9.352 jiwa/km². \n" +
                        " Pada tahun 2020, kota Medan memiliki penduduk sebanyak 2.435.252 jiwa, dan kepadatan penduduk 9.522,22 jiwa/km2 "
            ),

            namakota(
                R.drawable.padang,
                namenamakota = "Padang",
                descnamakota = " Padang adalah kota terbesar di pantai barat Pulau Sumatra dan ibu kota provinsi Sumatra Barat, Indonesia. Kota ini merupakan pintu gerbang barat Indonesia dari Samudra Hindia. ",
                desc2namakota = " Secara geografi, Padang dikelilingi perbukitan yang mencapai ketinggian 1.853 mdpl dengan luas wilayah 693,66 km², lebih dari separuhnya berupa hutan lindung. \n" +
                        " Padang merupakan kota inti dari pengembangan wilayah metropolitan Palapa.  \n" +
                        " Kota Padang memiliki 11 kecamatan dan 104 kelurahan.  \n" +
                        " Luas wilayahnya mencapai 693,66 km² dan penduduk 883.767 jiwa (2017) dengan sebaran 1.274 jiwa/km². \n" +
                        " Berdasarkan data Badan Pusat Statistik (BPS) pada 2021, kota ini memiliki jumlah penduduk sebanyak 909.040 jiwa. "
            ),

            namakota(
                R.drawable.pekanbaru,
                namenamakota = "Pekanbaru",
                descnamakota = " Kota Pekanbaru (Jawi: كوتا ڤكنبارو) adalah ibu kota dan kota terbesar di provinsi Riau, Indonesia. Kota ini merupakan salah satu sentra ekonomi terbesar di pulau Sumatra dan termasuk kota dengan tingkat pertumbuhan, migrasi, dan urbanisasi yang tinggi. ",
                desc2namakota = " Pekanbaru terletak di tepian Sungai Siak dan pada awalnya merupakan sebuah kota kecil yang memiliki pasar (pekan) yang bernama Payung Sekaki atau Senapelan.  \n" +
                        " Perekonomian Pekanbaru didukung oleh perdagangan dan pertambangan minyak bumi. Kota ini memiliki sebuah bandar udara internasional, terminal bus antar kota dan antar provinsi, serta dua pelabuhan.  \n" +
                        " Kota Pekanbaru memiliki 15 kecamatan dan 83 kelurahan (dari total 169 kecamatan dan 268 kelurahan di seluruh Riau).  \n" +
                        " Pada tahun 2017, jumlah penduduknya sebesar 886.226 jiwa \n" +
                        " luas wilayahnya 632,27 km² dan sebaran penduduk 1.401 jiwa/km². "
            ),

            namakota(
                R.drawable.yogyakarta,
                namenamakota = "DI Yogyakarta",
                descnamakota = " Kota Yogyakarta  atau dikenal oleh masyarakat setempat dengan nama Kota Jogja atau Kota Yogya adalah ibu kota dan pusat pemerintahan Daerah Istimewa Yogyakarta, Indonesia. Kota ini adalah kota besar yang mempertahankan konsep tradisional dan budaya Jawa. ",
                desc2namakota = " Kota Yogyakarta merupakan salah satu kota terbesar di Indonesia dan kota terbesar keempat di wilayah Pulau Jawa bagian selatan menurut jumlah penduduk. Kota Yogyakarta juga pernah menjadi ibu kota RI pada tahun 1946. \n" +
                        " Salah satu kecamatan di Yogyakarta, yaitu Kotagede pernah menjadi pusat Kesultanan Mataram antara kurun tahun 1575–1640.  \n" +
                        " Kota Yogyakarta memiliki 14 Kemantren dan 45 Kelurahan.   \n" +
                        " Pada tahun 2017, jumlah penduduk mencapai 410.262 jiwa. \n" +
                        " tersebar di wilayah seluas 32,50 km² dengan tingkat kepadatan penduduk 12.623 jiwa/km². "
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_kota)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = namakotaadapter(this, namakotaList) {
            val intent = Intent(this, detail_namakota::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}




