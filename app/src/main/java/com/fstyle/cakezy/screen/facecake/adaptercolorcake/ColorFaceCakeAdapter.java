package com.fstyle.cakezy.screen.facecake.adaptercolorcake;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.data.model.ColorCake;
import com.fstyle.cakezy.databinding.ItemColorCakeBinding;
import com.fstyle.cakezy.screen.BaseRecyclerViewAdapter;
import java.util.ArrayList;
import java.util.List;
import lombok.Setter;

/**
 * Created by Tuanlvt on 13/11/2017.
 */
public class ColorFaceCakeAdapter
        extends BaseRecyclerViewAdapter<ColorFaceCakeAdapter.ItemViewHolder> {
    private final List<ColorCake> mColorCakes = new ArrayList<>();
    @Setter
    private OnRecyclerViewItemClickListener<Object> mItemClickListener;

    public ColorFaceCakeAdapter(@NonNull Context context) {
        super(context);
    }

    @Override
    public ColorFaceCakeAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemColorCakeBinding binding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_color_cake, parent, false);
        return new ColorFaceCakeAdapter.ItemViewHolder(binding, mItemClickListener);
    }

    @Override
    public void onBindViewHolder(final ColorFaceCakeAdapter.ItemViewHolder holder, int position) {
        holder.bind(mColorCakes.get(position));
    }

    @Override
    public int getItemCount() {
        return mColorCakes.size();
    }

    public void updateData(List<ColorCake> colorCakes) {
        if (colorCakes == null) {
            return;
        }
        mColorCakes.addAll(colorCakes);
        notifyDataSetChanged();
    }

    /**
     * Item Color Cake ViewHolder
     */
    static class ItemViewHolder extends RecyclerView.ViewHolder {
        private final OnRecyclerViewItemClickListener<Object> mItemClickListener;
        private ItemColorCakeBinding mBinding;

        ItemViewHolder(ItemColorCakeBinding binding,
                OnRecyclerViewItemClickListener<Object> listener) {
            super(binding.getRoot());
            mBinding = binding;
            mItemClickListener = listener;
        }

        void bind(ColorCake colorCake) {
            mBinding.setViewModel(new ItemColorFaceCakeViewModel(colorCake, mItemClickListener));
            mBinding.executePendingBindings();
        }
    }
}
