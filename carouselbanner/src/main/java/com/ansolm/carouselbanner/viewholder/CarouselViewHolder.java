package com.ansolm.carouselbanner.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.ansolm.carouselbanner.base.BaseViewHolder;

/**
 * author  : Ansolm
 * e-mail  : ansolm@outlook.com
 * github  : http://github.com/ansolm
 * project : CarouselBanner
 */

public class CarouselViewHolder extends BaseViewHolder {

    public CarouselViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView;
        RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        imageView.setLayoutParams(params);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
