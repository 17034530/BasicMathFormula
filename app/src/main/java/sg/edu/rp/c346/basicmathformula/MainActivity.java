package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMath;
    ArrayList<basic> formulaArrayList;
    customAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMath=findViewById(R.id.lvMath);

        formulaArrayList = new ArrayList<>();
        formulaArrayList.add(new basic("Area of rectangle","Length x Length","Formula type is: Area"));
        formulaArrayList.add(new basic("Area of triangle","(Length of base x Length)/2","Formula type is: Area"));
        formulaArrayList.add(new basic("Volume of cube","Length x Length x Length","Formula type is: Volume"));

        customAdapter = new customAdapter(this,R.layout.basic_item,formulaArrayList);
        lvMath.setAdapter(customAdapter);
    }
}
