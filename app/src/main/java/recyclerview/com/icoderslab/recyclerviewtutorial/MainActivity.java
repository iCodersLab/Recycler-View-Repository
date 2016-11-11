package recyclerview.com.icoderslab.recyclerviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<EmployeeInfo> employeeInfoList = new ArrayList<>();
    private RecyclerView recyclerView;
    private EmployeeInfoAdapter employeeInfoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.employee_recycler_view);

        employeeInfoAdapter = new EmployeeInfoAdapter(employeeInfoList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(employeeInfoAdapter);

        PopulateEmployeeData();

    }

    private void PopulateEmployeeData() {
        EmployeeInfo employeeInfo = new EmployeeInfo("Aleshia", "Tomkiewicz", "Alan D Rosenburg Cpa Pc","St. Stephens Ward","Kent","01835-703597");
        employeeInfoList.add(employeeInfo);

        employeeInfo = new EmployeeInfo("Evan", "Zigomalas", "Cap Gemini America","Abbey Ward","Buckinghamshire","01937-864715");
        employeeInfoList.add(employeeInfo);

        employeeInfo = new EmployeeInfo("France", "Andrade", "Elliott, John W Esq","East Southbourne and Tuckton W","Bournemouth","01347-368222");
        employeeInfoList.add(employeeInfo);

        employeeInfo = new EmployeeInfo("Ulysses", "Mcwalters", "Mcmahan, Ben L","Hawerby cum Beesby","Lincolnshire","01912-771311");
        employeeInfoList.add(employeeInfo);

        employeeInfo = new EmployeeInfo("Tyisha", "Veness", "Champagne Room","Greets Green and Lyng Ward","West Midlands","01547-429341");
        employeeInfoList.add(employeeInfo);

        employeeInfo = new EmployeeInfo("Eric", "Rampy", "Thompson, Michael C Esq","Desborough","Northamptonshire","01969-886290");
        employeeInfoList.add(employeeInfo);

        employeeInfo = new EmployeeInfo("Marg", "Grasmick", "Wrangle Hill Auto Auct & Slvg","Bargate Ward","Southampton","01865-582516");
        employeeInfoList.add(employeeInfo);

        employeeInfo = new EmployeeInfo("Laquita", "Hisaw", "In Communications Inc","Chirton Ward","Tyne & Wear","01746-394243");
        employeeInfoList.add(employeeInfo);

        employeeInfo = new EmployeeInfo("Lura", "Manzella", "Bizerba Usa Inc","Staple Hill Ward","South Gloucestershire","01907-538509");
        employeeInfoList.add(employeeInfo);

        employeeInfo = new EmployeeInfo("Yuette", "Klapec", "Max Video","Parwich","Derbyshire","01903-649460");
        employeeInfoList.add(employeeInfo);


        employeeInfo = new EmployeeInfo("Fernanda", "Writer", "K & R Associates Inc","Wilmington","Kent","01630-202053");
        employeeInfoList.add(employeeInfo);


        employeeInfo = new EmployeeInfo("Charlesetta", "Erm", "Cain, John M Esq","Loundsley Green Ward","Derbyshire","01276-816806");
        employeeInfoList.add(employeeInfo);


        employeeInfo = new EmployeeInfo("Corrinne", "Jaret", "Sound Vision Corp","Dee Ward","Dumfries and Galloway","01625-932209");
        employeeInfoList.add(employeeInfo);


        employeeInfo = new EmployeeInfo("Niesha", "Bruch", "Rowley/hansell Petetin","Broxburn, Uphall and Winchburg","West Lothian","01874-856950");
        employeeInfoList.add(employeeInfo);


        employeeInfo = new EmployeeInfo("Rueben", "Gastellum", "Industrial Engineering Assocs","Weston-Super-Mare","North Somerset","01976-755279");
        employeeInfoList.add(employeeInfo);


        employeeInfo = new EmployeeInfo("Michell", "Throssell", "Weiss Spirt & Guyer","Carbrooke","Norfolk","01967-580851");
        employeeInfoList.add(employeeInfo);


        employeeInfo = new EmployeeInfo("Edgar", "Kanne", "Crowan, Kenneth W Esq","New Milton","Hampshire","01326-532337");
        employeeInfoList.add(employeeInfo);


        employeeInfo = new EmployeeInfo("Dewitt", "Julio", "Rittenhouse Motor Co","Parkham","Devon","01253-528327");
        employeeInfoList.add(employeeInfo);


        employeeInfo = new EmployeeInfo("Charisse", "Spinello", "Modern Plastics Corp","Darnall Ward","Yorkshire, South","01719-831436");
        employeeInfoList.add(employeeInfo);

        employeeInfoAdapter.notifyDataSetChanged();
    }
}

