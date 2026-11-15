package com.ansolm.carouselbanner.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ansolm.carouselbanner.R;
import com.ansolm.carouselbanner.base.BaseBannerAdapter;
import com.ansolm.carouselbanner.interfaces.OnCarouselItemClickListener;
import com.ansolm.carouselbanner.viewholder.CoolCarouselViewHolder;

import java.util.List;

/**
 * author  : Ansolm
 * e-mail  : ansolm@outlook.com
 * github  : http://github.com/ansolm
 * project : CarouselBanner
 */
public class CoolCarouselAdapter extends BaseBannerAdapter<CoolCarouselViewHolder> {

    public CoolCarouselAdapter(List<String> urlList, OnCarouselItemClickListener onBannerItemClickListener) {
        super(urlList, onBannerItemClickListener);
    }

    @Override
    public CoolCarouselViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CoolCarouselViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false));
    }
}
