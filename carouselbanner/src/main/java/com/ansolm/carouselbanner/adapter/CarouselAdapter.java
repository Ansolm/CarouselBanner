package com.ansolm.carouselbanner.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;

import com.ansolm.carouselbanner.base.BaseBannerAdapter;
import com.ansolm.carouselbanner.interfaces.OnCarouselItemClickListener;
import com.ansolm.carouselbanner.viewholder.CarouselViewHolder;

import java.util.List;

/**
 * author  : Ansolm
 * e-mail  : ansolm@outlook.com
 * github  : http://github.com/ansolm
 * project : CarouselBanner
 */
public class CarouselAdapter extends BaseBannerAdapter<CarouselViewHolder> {

    public CarouselAdapter(List<String> urlList, OnCarouselItemClickListener onBannerItemClickListener) {
        super(urlList, onBannerItemClickListener);
    }

    @Override
    public CarouselViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CarouselViewHolder(new ImageView(parent.getContext()));
    }
}
