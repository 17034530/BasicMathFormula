package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17034530 on 18/7/2018.
 */

public class customAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<basic> formula;


    public customAdapter(@NonNull Context context, int resource ,
                         @NonNull ArrayList<basic> objects) {
        super(context, resource,objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.formula = objects;
    }

    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvformula = rowView.findViewById(R.id.tvFormula);
        TextView tvType = rowView.findViewById(R.id.tvType);
        basic currentItem = formula.get(position);
        tvName.setText(currentItem.getName());
        tvformula.setText(currentItem.getFormula());
        tvType.setText(currentItem.getType());
        return rowView;
    }

}
