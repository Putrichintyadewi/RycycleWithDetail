package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("http://www.hdtimelapse.net/content/HDtimelapse.net_Landscape/HDtimelapse.net_Landscape_0481_hirez.jpg");
        mNames.add("Pura Besakih");
        mDesc.add("Karangasem");
        mImageDet.add("Pura Besakih adalah sebuah komplek pura yang terletak di Desa Besakih, Kecamatan Rendang Kabupaten Karangasem, Bali. Komplek Pura Besakih terdiri dari 1 Pura Pusat (Pura Penataran Agung Besakih) dan 18 Pura Pendamping (1 Pura Basukian dan 17 Pura Lainnya). Di Pura Penataran Agung terdapat 3 arca atau candi utama simbol stana dari sifat Tuhan Tri Murti, yaitu Brahma, Wisnu dan Siwa.");

        mImageUrls.add("https://palm-living.com/wp-content/uploads/2018/07/Pura-Pulaki-1-1.jpg");
        mNames.add("Pura Pulaki");
        mDesc.add("Buleleng");
        mImageDet.add("Pura Pulaki terletak di Desa Banyupoh, Kecamatan Gerokgak , Kabupaten Buleleng. Pura Pulaki berdiri diatas tebing berbatu yang langsung menghadap ke laut. Dikawasan Pura Pulaki, disekitar Pura Melanting sekitar tahun 1987 ditemukan beberapa alat perkakas yang terbuat dari batu picisan berbentuk kapak dan alat-alat lain.");

        mImageUrls.add("https://images6.alphacoders.com/521/thumb-1920-521630.jpg");
        mNames.add("Pura Ulun Danu Beratan");
        mDesc.add("Tabanan");
        mImageDet.add("Pura Ulun Danu Beratan atau Bratan Pura merupakan sebuah candi air besar di Bali, candi utama air lainnya menjadi Pura Ulun Danu Batur. Kompleks candi ini terletak di tepi laut Danau Breratan di pegunungan dekat Bedugul. Candi ini sebenarnya digunakan untuk upacara persembahan kepada Dewi Danu, Dewi air danau dan sungai.");

        mImageUrls.add("https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Keindahan-Pura-Luhur-Uluwatu-Bali-1024x678.jpg");
        mNames.add("Pura Luhur Uluwatu");
        mDesc.add("Badung");
        mImageDet.add("Pura Luhur Uluwatu merupakan pura yang terletak di desa Pecatu, Kecamatan Kuta, Badung. Pura yang terletak di ujung barat daya pulau Bali di atas junjungan batu karang  yang terjal dan tinggi serta menjorok ke laut ini merupakan pura Sad Kahyangan yang dipercaya umat hindu sebagai penyangga 9 arah mata angin. ");

        mImageUrls.add("https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Pura-Ulun-Danu-Batur.jpg");
        mNames.add("Pura Ulun Danu Batur");
        mDesc.add("Bangli");
        mImageDet.add("Pura Ulun Danu Batur terletak di Desa Kintamani, Kabupateng Bangli. Pura ini adalah Pura paling penting kedua setelah Pura Besakih. Pura yang didirikan pada tahun 1926 ini pun dikenal juga dengan beberapa nama. Diantaranya adalah Pura Ulun Danu, Pura Batur ataupun Pura Bat. Pura Batur ini merupakan sebuah komplek yang terdiri dari 9 pura, dan didalamnya terdapat 285 paviliun dan candi.");

        mImageUrls.add("https://bali-travelnews.com/wp-content/uploads/sites/5/2017/05/Kawasan-Pura-Watu-Klotok-akan-Ditata.jpg");
        mNames.add("Pura Watu Klotok");
        mDesc.add("Klungkung");
        mImageDet.add("Pura Watu Klotok terletak di Kabupaten Klungkung. Disamping merupakan salah satu kahyangan jagad, Pura Watu Klotok juga kerap dijadikan pusat pasucian Ida Bhatara Pura Besakih. Pura Watu Klotok memiliki panorama pantai Klungkung yang sangat memukau.");

        mImageUrls.add("http://2.bp.blogspot.com/-SFVGD8bkEJ8/Ujeta-QTXtI/AAAAAAAAANM/50d9YMzDK5w/s1600/5.2.jpg");
        mNames.add("Pura Samuan Tiga");
        mDesc.add("Gianyar");
        mImageDet.add("Pura Samuan Tiga diyakini merupakan awal dari terbentuknya Pura Kahyangan Tiga di Bali. Bahkan, dipercaya sebagai awal adanya desa pakraman. Pura Samuan Tiga dikatakan sebagai kawitan desa pakraman dan Pura Kahyangan Tiga. Sebab, ddi masing-masing desa pakraman ada pura lambang Tri Murti yaitu Pura Puseh, Pura Desa dan Pura Dalem.");

        mImageUrls.add("http://panduanwisata.id/files/2015/02/Pura-Rambut-Siwi-purapurabali.blogspot.jpg");
        mNames.add("Pura Rambut Siwi");
        mDesc.add("Negara");
        mImageDet.add("Pura Rambut Siwi adalah pura yang berada kurang lebih 17 km dari Kota Negara. Pura ini digunakan umat hindu untuk memuja Dewa Pertanian. Di daerah itu terdapat tiga pura yang dapat dikunjungi, dari Pura Rambut Siwi turun kebawah lalu akan menemukan Pura Segara. Pura ini juga disebut Pura Taman, bersebelahan dengan Pura Segara tersebut ada Pura Penataran.");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, mImageUrls, mDesc, mImageDet);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, mImageUrls, mDesc, mImageDet);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mImageUrls);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}