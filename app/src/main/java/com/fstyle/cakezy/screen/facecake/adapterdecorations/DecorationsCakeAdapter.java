package com.fstyle.cakezy.screen.facecake.adapterdecorations;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.data.model.DecorationsCake;
import com.fstyle.cakezy.databinding.ItemDecorationsCakeBinding;
import com.fstyle.cakezy.screen.BaseRecyclerViewAdapter;
import java.util.ArrayList;
import java.util.List;
import lombok.Setter;

/**
 * Created by Tuanlvt on 15/11/2017.
 */

public class DecorationsCakeAdapter
        extends BaseRecyclerViewAdapter<DecorationsCakeAdapter.ItemViewHolder> {
    private final List<DecorationsCake> mDecorationsCakes = new ArrayList<>();
    @Setter
    private OnRecyclerViewItemClickListener<Object> mItemClickListener;

    public DecorationsCakeAdapter(@NonNull Context context) {
        super(context);
    }

    @Override
    public DecorationsCakeAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent,
            int viewType) {
        ItemDecorationsCakeBinding binding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_decorations_cake, parent, false);
        return new DecorationsCakeAdapter.ItemViewHolder(binding, mItemClickListener);
    }

    @Override
    public void onBindViewHolder(final DecorationsCakeAdapter.ItemViewHolder holder, int position) {
        holder.bind(mDecorationsCakes.get(position));
    }

    @Override
    public int getItemCount() {
        return mDecorationsCakes.size();
    }

    public void updateData(List<DecorationsCake> decorationsCakes) {
        if (decorationsCakes == null) {
            return;
        }
        mDecorationsCakes.addAll(decorationsCakes);
        notifyDataSetChanged();
    }

    /**
     * Item Decorations Cake ViewHolder
     */
    static class ItemViewHolder extends RecyclerView.ViewHolder {
        private final OnRecyclerViewItemClickListener<Object> mItemClickListener;
        private ItemDecorationsCakeBinding mBinding;

        ItemViewHolder(ItemDecorationsCakeBinding binding,
                OnRecyclerViewItemClickListener<Object> listener) {
            super(binding.getRoot());
            mBinding = binding;
            mItemClickListener = listener;
        }

        void bind(DecorationsCake decorationsCake) {
            mBinding.setViewModel(
                    new ItemDecorationsViewModel(decorationsCake, mItemClickListener));
            mBinding.executePendingBindings();
        }
    }
}
