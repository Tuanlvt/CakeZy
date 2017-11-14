package com.fstyle.cakezy.screen.decorationscake.adaptercandle;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.data.model.CandleCake;
import com.fstyle.cakezy.databinding.ItemCandleCakeBinding;
import com.fstyle.cakezy.screen.BaseRecyclerViewAdapter;
import java.util.ArrayList;
import java.util.List;
import lombok.Setter;

/**
 * Created by Tuanlvt on 08/11/2017.
 */
public class CandleAdapter extends BaseRecyclerViewAdapter<CandleAdapter.ItemViewHolder> {
    private final List<CandleCake> mCandleCakes = new ArrayList<>();
    @Setter
    private OnRecyclerViewItemClickListener<Object> mItemClickListener;

    public CandleAdapter(@NonNull Context context) {
        super(context);
    }

    @Override
    public CandleAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemCandleCakeBinding binding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_candle_cake, parent, false);
        return new CandleAdapter.ItemViewHolder(binding, mItemClickListener);
    }

    @Override
    public void onBindViewHolder(final CandleAdapter.ItemViewHolder holder, int position) {
        holder.bind(mCandleCakes.get(position));
    }

    @Override
    public int getItemCount() {
        return mCandleCakes.size();
    }

    public void updateData(List<CandleCake> candleCakes) {
        if (candleCakes == null) {
            return;
        }
        mCandleCakes.addAll(candleCakes);
        notifyDataSetChanged();
    }

    /**
     * Item Candle Cake ViewHolder
     */
    static class ItemViewHolder extends RecyclerView.ViewHolder {
        private final OnRecyclerViewItemClickListener<Object> mItemClickListener;
        private ItemCandleCakeBinding mBinding;

        ItemViewHolder(ItemCandleCakeBinding binding,
                OnRecyclerViewItemClickListener<Object> listener) {
            super(binding.getRoot());
            mBinding = binding;
            mItemClickListener = listener;
        }

        void bind(CandleCake candleCake) {
            mBinding.setViewModel(new ItemCandleViewModel(candleCake, mItemClickListener));
            mBinding.executePendingBindings();
        }
    }
}
