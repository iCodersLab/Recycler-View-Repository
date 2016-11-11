package recyclerview.com.icoderslab.recyclerviewtutorial;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Faizan Abbas on 11/11/2016.
 */
public class EmployeeInfoAdapter extends RecyclerView.Adapter<EmployeeInfoAdapter.MyViewHolder> {

    private List<EmployeeInfo> employeeInfoList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView first_name, last_name, company,city,country,phone;

        public MyViewHolder(View view) {
            super(view);
            first_name = (TextView) view.findViewById(R.id.employee_first_name);
            last_name = (TextView) view.findViewById(R.id.employee_last_name);
            company = (TextView) view.findViewById(R.id.employee_compnay);
            city = (TextView) view.findViewById(R.id.employee_city);
            country = (TextView) view.findViewById(R.id.employee_country);
            phone = (TextView) view.findViewById(R.id.employee_phone);
        }
    }


    public EmployeeInfoAdapter(List<EmployeeInfo> employeeInfoList) {
        this.employeeInfoList = employeeInfoList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.employee_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        EmployeeInfo employeeInfo = employeeInfoList.get(position);
        holder.first_name.setText(employeeInfo.getFirstName()+" ");
        holder.last_name.setText(employeeInfo.getLastName());
        holder.company.setText(employeeInfo.getCompanyName());
        holder.city.setText(employeeInfo.getCity()+", ");
        holder.country.setText(employeeInfo.getCountry());
        holder.phone.setText(employeeInfo.getPhoneNo());

    }

    @Override
    public int getItemCount() {
        return employeeInfoList.size();
    }
}
