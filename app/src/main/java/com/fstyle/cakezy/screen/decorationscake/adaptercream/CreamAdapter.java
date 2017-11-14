package com.fstyle.cakezy.screen.decorationscake.adaptercream;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.data.model.CreamCake;
import com.fstyle.cakezy.databinding.ItemCreamCakeBinding;
import com.fstyle.cakezy.screen.BaseRecyclerViewAdapter;
import java.util.ArrayList;
import java.util.List;
import lombok.Setter;

/**
 * Created by Tuanlvt on 08/11/2017.
 */
public class CreamAdapter extends BaseRecyclerViewAdapter<CreamAdapter.ItemViewHolder> {
    private final List<CreamCake> mCreamCakes = new ArrayList<>();
    @Setter
    private OnRecyclerViewItemClickListener<Object> mItemClickListener;

    public CreamAdapter(@NonNull Context context) {
        super(context);
    }

    @Override
    public CreamAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemCreamCakeBinding binding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_cream_cake, parent, false);
        return new CreamAdapter.ItemViewHolder(binding, mItemClickListener);
    }

    @Override
    public void onBindViewHolder(final CreamAdapter.ItemViewHolder holder, int position) {
        holder.bind(mCreamCakes.get(position));
    }

    @Override
    public int getItemCount() {
        return mCreamCakes.size();
    }

    public void updateData(List<CreamCake> creamCakeBitmaps) {
        if (creamCakeBitmaps == null) {
            return;
        }
        mCreamCakes.addAll(creamCakeBitmaps);
        notifyDataSetChanged();
    }

    /**
     * Item Cream Cake ViewHolder
     */
    static class ItemViewHolder extends RecyclerView.ViewHolder {
        private final OnRecyclerViewItemClickListener<Object> mItemClickListener;
        private ItemCreamCakeBinding mBinding;

        ItemViewHolder(ItemCreamCakeBinding binding,
                BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object> listener) {
            super(binding.getRoot());
            mBinding = binding;
            mItemClickListener = listener;
        }

        void bind(CreamCake creamCakeBitmap) {
            mBinding.setViewModel(new ItemDecorationViewModel(creamCakeBitmap, mItemClickListener));
            mBinding.executePendingBindings();
        }
    }
}
