package mx.com.cyrux.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    private List<Car> carList;

    public CarAdapter(List<Car> cars) {
        carList = cars;
    }

    @NonNull
    @Override
    public CarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View carView = layoutInflater.inflate(R.layout.item_car, parent, false);

        return new ViewHolder(carView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Car car = carList.get(position);

        TextView tvModel = holder.getTvModel();
        tvModel.setText(car.getModel());
        TextView tvBrand = holder.getTvBrand();
        tvBrand.setText(car.getBrand());
        TextView tvYear = holder.getTvYear();
        tvYear.setText(String.valueOf(car.getYear()));
    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvModel;
        private TextView tvBrand;
        private TextView tvYear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvModel = itemView.findViewById(R.id.tvModel);
            tvBrand = itemView.findViewById(R.id.tvBrand);
            tvYear = itemView.findViewById(R.id.tvYear);
        }

        public TextView getTvModel() {
            return tvModel;
        }

        public TextView getTvBrand() {
            return tvBrand;
        }

        public TextView getTvYear() {
            return tvYear;
        }
    }
}