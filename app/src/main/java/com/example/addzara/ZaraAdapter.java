package com.example.addzara;
import android.annotation.SuppressLint;
import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.auth.User;

import java.util.List;
import java.util.Optional;
public class ZaraAdapter extends RecyclerView.Adapter<ZaraAdapter.ViewHolder> {

        private List<Zara> mData;
        private Context context;
        private FirebaseServices fbs;

        public ZaraAdapter(Context context, List<Zara> mData) {
            this.mData = mData;
            this.context = context;
            this.fbs = FirebaseServices.getInstance();
        }
    @NonNull
    @Override
    public ZaraAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          LayoutInflater  mInflater = LayoutInflater.from(parent.getContext());
        View view = mInflater.inflate(R.layout.za_item, parent, false);
        return new ZaraAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Zara z = mData.get(position);
        holder.position = holder.getAdapterPosition();
        //Picasso.get().load(ap.getPhoto()).into(holder.ivBarber);
        holder.tvCustomerUsername.setText(mData.get(position).getProduct());
        holder.tvPhone.setText(mData.get(position).getPhone());
    }
        @Override
        public int getItemCount() {
            return mData.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            TextView tvCustomerUsername, tvPhone;
            RatingBar rbZara;
            int position;

           public ViewHolder(View itemView) {
                super(itemView);
                tvCustomerUsername = itemView.findViewById(R.id.etProductAddZaraFragment);
                tvPhone = itemView.findViewById(R.id.etPhoneAddZaraFragment);
                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {/*
                ((MainActivity)context).getMessage().showMessageDialog(context, mData.get(position).getComment());
                //FragmentTransaction ft= getActivity().getSupportFragmentManager().beginTransaction();
            /*
            ((MainActivity)context).getIntent().putExtra("barber", mData.get(position).getUsername());
            ((MainActivity)context).getIntent().putExtra("customer", FirebaseServices.getInstance().getAuth().getCurrentUser().getEmail());
            ((MainActivity)context).getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, new AddNewAppointmentFragment())
                    .addToBackStack(null)
                    .commit(); */
            }
        }
    }

