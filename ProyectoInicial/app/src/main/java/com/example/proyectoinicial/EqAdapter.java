package com.example.proyectoinicial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectoinicial.databinding.EqListItemBinding;

public class EqAdapter extends ListAdapter<EartQuake,EqAdapter.EqViewHolder> {

    public static final DiffUtil.ItemCallback<EartQuake> DIFF_CALLBACK =
            new DiffUtil.ItemCallback<EartQuake>() {
                @Override
                public boolean areItemsTheSame(@NonNull EartQuake oldItem, @NonNull EartQuake newItem) {
                    return oldItem.getId().equals(newItem.getId());
                }

                @Override
                public boolean areContentsTheSame(@NonNull EartQuake oldItem, @NonNull EartQuake newItem) {
                    return oldItem.equals(newItem);
                }
            };


    protected EqAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public EqAdapter.EqViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        EqListItemBinding binding = EqListItemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new EqViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull EqAdapter.EqViewHolder holder, int position) {
            EartQuake eartQuake = getItem(position);
            holder.bind(eartQuake);
    }

    class EqViewHolder extends RecyclerView.ViewHolder {

        private final EqListItemBinding binding;

        public EqViewHolder(@NonNull EqListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(EartQuake eartQuake){
            binding.magnitudText.setText(String.valueOf(eartQuake.getMagnitud()));
            binding.placeText.setText(eartQuake.getPlace());

            binding.executePendingBindings();
        }
    }
}