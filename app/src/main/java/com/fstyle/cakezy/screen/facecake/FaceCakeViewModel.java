package com.fstyle.cakezy.screen.facecake;

import android.databinding.ObservableField;
import com.fstyle.cakezy.data.model.ColorCake;
import com.fstyle.cakezy.screen.BaseRecyclerViewAdapter;
import com.fstyle.cakezy.screen.facecake.adapter.ColorFaceCakeAdapter;
import com.fstyle.cakezy.utils.ColorManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Exposes the data to be used in the facecake screen.
 */

public class FaceCakeViewModel implements FaceCakeContract.ViewModel,
        BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object> {

    private FaceCakeContract.Presenter mPresenter;
    private ColorFaceCakeAdapter mAdapter;
    private ObservableField<ColorCake> mColorCakeObservableField = new ObservableField<>();

    FaceCakeViewModel(ColorFaceCakeAdapter adapter, FaceCakeContract.Presenter presenter) {
        mAdapter = adapter;
        mPresenter = presenter;
        mPresenter.setViewModel(this);
        mAdapter.setMItemClickListener(this);
        fillData();
    }

    @Override
    public void onStart() {
        mPresenter.onStart();
    }

    @Override
    public void onStop() {
        mPresenter.onStop();
    }

    @Override
    public ColorFaceCakeAdapter getColorAdapter() {
        return mAdapter;
    }

    @Override
    public ObservableField<ColorCake> getColorCake() {
        return mColorCakeObservableField;
    }

    @Override
    public void onNextButtonClick() {
        //Todo edit later
    }

    private void fillData() {
        //Todo edit later
        List<ColorCake> colorCakes = new ArrayList<>();
        colorCakes.add(new ColorCake(ColorManager.getColorGrey200()));
        colorCakes.add(new ColorCake(ColorManager.getColorBrown300()));
        colorCakes.add(new ColorCake(ColorManager.getColorGrey100()));
        colorCakes.add(new ColorCake(ColorManager.getColorBrown200()));
        colorCakes.add(new ColorCake(ColorManager.getColorBrown100()));
        colorCakes.add(new ColorCake(ColorManager.getColorRed100()));
        colorCakes.add(new ColorCake(ColorManager.getColorPurple50()));
        colorCakes.add(new ColorCake(ColorManager.getColorPurple100()));
        colorCakes.add(new ColorCake(ColorManager.getColorWhite()));
        colorCakes.add(new ColorCake(ColorManager.getColorPink50()));
        colorCakes.add(new ColorCake(ColorManager.getColorPink100()));
        colorCakes.add(new ColorCake(ColorManager.getColorBrown50()));
        colorCakes.add(new ColorCake(ColorManager.getColorOrange50()));
        colorCakes.add(new ColorCake(ColorManager.getColorOrange100()));
        colorCakes.add(new ColorCake(ColorManager.getColorGreen100()));
        mAdapter.updateData(colorCakes);
    }

    @Override
    public void onItemRecyclerViewClick(Object item) {
        if (item instanceof ColorCake) {
            mColorCakeObservableField.set((ColorCake) item);
        }
    }
}
