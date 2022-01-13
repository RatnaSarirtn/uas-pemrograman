package simple.example.motorpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import simple.example.motorpedia.model.Ayam;
import simple.example.motorpedia.model.Hewan;
import simple.example.motorpedia.model.Itik;
import simple.example.motorpedia.model.Puyuh;

public class GaleriActivity extends AppCompatActivity {

    Hewan hewan;
    TextView txBrand,txMerek,txCc,txDeskripsi;
    ImageView ivFotoMotor;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_brand);
        Intent intent = getIntent();
        hewan = (Hewan) intent.getSerializableExtra(DaftarMotorActivity.MOTOR_TERPILIH);
        inisialisasiView();
        tampilkanProfil(hewan);
    }

    private void inisialisasiView() {

        txBrand = findViewById(R.id.txBrand);
        txMerek = findViewById(R.id.txMerek);
        txCc = findViewById(R.id.txCc);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoMotor = findViewById(R.id.gambarMotor);
        btnBack = findViewById(R.id.btn_back_to_list);
        btnBack.setOnClickListener(view -> {
            onBackPressed();
        });
    }


    private void tampilkanProfil(Hewan hewan) {
        Log.d("HONDA","Menampilkan honda "+hewan.getMerek());
        if (hewan instanceof Itik) {
            txMerek.setText(getString(R.string.itik));
        } else if (hewan instanceof Ayam) {
            txMerek.setText(getString(R.string.ayam));
        } else if (hewan instanceof Puyuh) {
            txMerek.setText(getString(R.string.puyuh));
        }


        txBrand.setText(hewan.getBrand());
        txCc.setText(hewan.getCc());
        txDeskripsi.setText(hewan.getDeskripsi());
        ivFotoMotor.setImageDrawable(this.getDrawable(hewan.getDrawableRes()));
    }
}