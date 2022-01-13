package simple.example.motorpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnHonda, btnYamaha, btnSuzuki;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnHonda = findViewById(R.id.btn_buka_brand_honda);
        btnYamaha = findViewById(R.id.btn_buka_brand_yamaha);
        btnSuzuki = findViewById(R.id.btn_buka_brand_suzuki);

        btnHonda.setOnClickListener(view -> bukaGaleri("Ayam"));
        btnYamaha.setOnClickListener(view -> bukaGaleri("Puyuh"));
        btnSuzuki.setOnClickListener(view -> bukaGaleri("Itik"));


    }

    private void bukaGaleri(String jenisMotor) {
        Log.d("MAIN", "Buka activity motor");
        Intent intent = new Intent(this, DaftarMotorActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisMotor);
        startActivity(intent);
    }

    public void Profile(View view) {
        Intent intent = new Intent(MainActivity.this, ProfileKu.class);
        startActivity(intent);
    }
    public void Kembali(View view) {
        Intent intent = new Intent(MainActivity.this, ProfileKu.class);
        startActivity(intent);
    }
}