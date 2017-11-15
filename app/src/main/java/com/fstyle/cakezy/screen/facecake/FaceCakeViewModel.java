package com.fstyle.cakezy.screen.facecake;

import android.content.Context;
import android.databinding.ObservableField;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.data.model.ColorCake;
import com.fstyle.cakezy.data.model.DecorationsCake;
import com.fstyle.cakezy.screen.BaseRecyclerViewAdapter;
import com.fstyle.cakezy.screen.facecake.adaptercolorcake.ColorFaceCakeAdapter;
import com.fstyle.cakezy.screen.facecake.adapterdecorations.DecorationsCakeAdapter;
import com.fstyle.cakezy.utils.ColorManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Exposes the data to be used in the facecake screen.
 */

public class FaceCakeViewModel implements FaceCakeContract.ViewModel,
        BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object> {

    private Context mContext;
    private FaceCakeContract.Presenter mPresenter;
    private ColorFaceCakeAdapter mColorFaceCakeAdapter;
    private DecorationsCakeAdapter mDecorationsCakeAdapter;
    private ObservableField<ColorCake> mColorCakeObservableField = new ObservableField<>();
    private ObservableField<DecorationsCake> mDecorationsCakeObservableField =
            new ObservableField<>();

    FaceCakeViewModel(Context context, ColorFaceCakeAdapter colorFaceCakeAdapter,
            DecorationsCakeAdapter decorationsCakeAdapter, FaceCakeContract.Presenter presenter) {
        mContext = context;
        mPresenter = presenter;
        mColorFaceCakeAdapter = colorFaceCakeAdapter;
        mDecorationsCakeAdapter = decorationsCakeAdapter;
        mColorFaceCakeAdapter.setMItemClickListener(this);
        mDecorationsCakeAdapter.setMItemClickListener(this);
        mPresenter.setViewModel(this);
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
        return mColorFaceCakeAdapter;
    }

    @Override
    public DecorationsCakeAdapter getDecorationsAdapter() {
        return mDecorationsCakeAdapter;
    }

    @Override
    public ObservableField<ColorCake> getColorCake() {
        return mColorCakeObservableField;
    }

    @Override
    public ObservableField<DecorationsCake> getDecorationsCake() {
        return mDecorationsCakeObservableField;
    }

    @Override
    public void onNextButtonClick() {
        //Todo edit later
    }

    private void fillData() {
        //Todo edit later
        //Add data List Color Face Cake
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
        mColorFaceCakeAdapter.updateData(colorCakes);
        // Add data list decorations Cake
        List<DecorationsCake> decorationsCakes = new ArrayList<>();
        decorationsCakes.add(new DecorationsCake(getResource(R.drawable.face_1)));
        decorationsCakes.add(new DecorationsCake(getResource(R.drawable.face_2)));
        decorationsCakes.add(new DecorationsCake(getResource(R.drawable.face_3)));
        decorationsCakes.add(new DecorationsCake(getResource(R.drawable.face_4)));
        mDecorationsCakeAdapter.updateData(decorationsCakes);
    }

    @Override
    public void onItemRecyclerViewClick(Object item) {
        if (item instanceof ColorCake) {
            mColorCakeObservableField.set((ColorCake) item);
        } else if (item instanceof DecorationsCake) {
            mDecorationsCakeObservableField.set((DecorationsCake) item);
        }
    }

    private Bitmap getResource(int id) {
        return BitmapFactory.decodeResource(mContext.getResources(), id);
    }
}
