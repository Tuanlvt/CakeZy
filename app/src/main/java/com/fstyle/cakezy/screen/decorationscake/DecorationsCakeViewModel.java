package com.fstyle.cakezy.screen.decorationscake;

import android.content.Context;
import android.databinding.ObservableField;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.fstyle.cakezy.R;
import com.fstyle.cakezy.data.model.CandleCake;
import com.fstyle.cakezy.data.model.CreamCake;
import com.fstyle.cakezy.screen.BaseRecyclerViewAdapter;
import com.fstyle.cakezy.screen.decorationscake.adaptercandle.CandleAdapter;
import com.fstyle.cakezy.screen.decorationscake.adaptercream.CreamAdapter;
import com.fstyle.cakezy.utils.navigator.Navigator;
import java.util.ArrayList;
import java.util.List;

/**
 * Exposes the data to be used in the decorationscake screen.
 */

public class DecorationsCakeViewModel implements DecorationsCakeContract.ViewModel,
        BaseRecyclerViewAdapter.OnRecyclerViewItemClickListener<Object> {

    private Context mContext;
    private Navigator mNavigator;
    private DecorationsCakeContract.Presenter mPresenter;
    private CreamAdapter mCreamAdapter;
    private CandleAdapter mCandleAdapter;
    private ObservableField<CreamCake> mCreamCakeObservableField = new ObservableField<>();
    private ObservableField<CandleCake> mCandleCakeObservableField = new ObservableField<>();

    DecorationsCakeViewModel(Context context, Navigator navigator, CreamAdapter creamAdapter,
            CandleAdapter candleAdapter, DecorationsCakeContract.Presenter presenter) {
        mContext = context;
        mNavigator = navigator;
        mPresenter = presenter;
        mCreamAdapter = creamAdapter;
        mCandleAdapter = candleAdapter;
        mCandleAdapter.setMItemClickListener(this);
        mCreamAdapter.setMItemClickListener(this);
        mPresenter.setViewModel(this);
        init();
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
    public CreamAdapter getCreamAdapter() {
        return mCreamAdapter;
    }

    @Override
    public CandleAdapter getCandleAdapter() {
        return mCandleAdapter;
    }

    @Override
    public ObservableField<CreamCake> getCreamCake() {
        return mCreamCakeObservableField;
    }

    @Override
    public ObservableField<CandleCake> getCandleCake() {
        return mCandleCakeObservableField;
    }

    private void init() {
        //TODO edit later
        List<CreamCake> creamCake = new ArrayList<>();
        creamCake.add(new CreamCake(getResource(R.drawable.decoration1)));
        creamCake.add(new CreamCake(getResource(R.drawable.decoration2)));
        mCreamAdapter.updateData(creamCake);
        List<CandleCake> candleCake = new ArrayList<>();
        candleCake.add(new CandleCake(getResource(R.drawable.candle_design_1)));
        candleCake.add(new CandleCake(getResource(R.drawable.candle_design_2)));
        mCandleAdapter.updateData(candleCake);
    }

    @Override
    public void onItemRecyclerViewClick(Object item) {
        if (item instanceof CreamCake) {
            mCreamCakeObservableField.set((CreamCake) item);
        } else if (item instanceof CandleCake) {
            mCandleCakeObservableField.set((CandleCake) item);
        }
    }

    private Bitmap getResource(int id) {
        return BitmapFactory.decodeResource(mContext.getResources(), id);
    }
}
