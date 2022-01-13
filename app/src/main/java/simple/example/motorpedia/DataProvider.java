package simple.example.motorpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.motorpedia.model.Ayam;
import simple.example.motorpedia.model.Hewan;
import simple.example.motorpedia.model.Itik;
import simple.example.motorpedia.model.Puyuh;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Ayam> initDataAyam(Context ctx) {
        List<Ayam> ayams = new ArrayList<>();
        ayams.add(new Ayam(ctx.getString(R.string.cemani_nama), ctx.getString(R.string.cemani_asal),
        ctx.getString(R.string.cemani_deskripsi), R.drawable.cemani));
        ayams.add(new Ayam(ctx.getString(R.string.tukung_nama), ctx.getString(R.string.tukung_asal),
        ctx.getString(R.string.tukung_deskripsi), R.drawable.tukung));
        ayams.add(new Ayam(ctx.getString(R.string.pelung_nama), ctx.getString(R.string.pelung_asal),
        ctx.getString(R.string.pelung_deskripsi), R.drawable.pelung));
        return ayams;
    }

    private static List<Puyuh> initDataPuyuh(Context ctx) {
        List<Puyuh> puyuhs = new ArrayList<>();
        puyuhs.add(new Puyuh(ctx.getString(R.string.puyuhbatu_nama), ctx.getString(R.string.puyuhbatu_asal),
        ctx.getString(R.string.puyuhbatu_deskripsi), R.drawable.puyuhbatu));
        puyuhs.add(new Puyuh(ctx.getString(R.string.puyuhblaster_nama), ctx.getString(R.string.puyuhblaster_asal),
                ctx.getString(R.string.puyuhblaster_deskripsi), R.drawable.puyuhblaster));
        puyuhs.add(new Puyuh(ctx.getString(R.string.puyuhjepang_nama), ctx.getString(R.string.puyuhjepang_asal),
        ctx.getString(R.string.puyuhjepang_deskripsi), R.drawable.puyuhjepang));
        return puyuhs;
    }

    private static List<Itik> initDataItik(Context ctx) {
        List<Itik> itiks = new ArrayList<>();
        itiks.add(new Itik(ctx.getString(R.string.itikbali_nama), ctx.getString(R.string.itikbali_asal),
                ctx.getString(R.string.itikbali_deskripsi), R.drawable.itikbali));
        itiks.add(new Itik(ctx.getString(R.string.manila_nama), ctx.getString(R.string.manila_asal),
                ctx.getString(R.string.kmanila_deskripsi), R.drawable.manila));
        itiks.add(new Itik(ctx.getString(R.string.serati_nama), ctx.getString(R.string.serati_asal),
                ctx.getString(R.string.serati_deskripsi), R.drawable.serati));
        return itiks;
    }

    private static void initAllMotors(Context ctx) {
        hewans.addAll(initDataAyam(ctx));
        hewans.addAll(initDataPuyuh(ctx));
        hewans.addAll(initDataItik(ctx));
    }

    public static List<Hewan> getAllMotor(Context ctx) {
        if (hewans.size() == 0) {
            initAllMotors(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getMotorsByTipe(Context ctx, String merek) {
        List<Hewan> motorsByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllMotors(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getMerek().equals(merek)) {
                motorsByType.add(h);
            }
        }
        return motorsByType;
    }

}
