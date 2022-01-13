package simple.example.motorpedia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import simple.example.motorpedia.model.Hewan;

public class DaftarMotorAdapter extends ArrayAdapter<Hewan> {

    Context context;

    public DaftarMotorAdapter(Context context, List<Hewan> hewans) {
        super(context, R.layout.row_daftar_motor, hewans);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textBrand;
        TextView textCc;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Hewan hewan = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftar_motor, parent, false);
            viewHolder.textBrand =  convertView.findViewById(R.id.row_text_brand);
            viewHolder.textCc = (TextView) convertView.findViewById(R.id.row_text_cc);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_motor);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textBrand.setText(hewan.getBrand());
        viewHolder.textCc.setText(hewan.getCc());
        viewHolder.gambar.setImageDrawable(context.getDrawable(hewan.getDrawableRes()));
        return convertView;
    }
}
