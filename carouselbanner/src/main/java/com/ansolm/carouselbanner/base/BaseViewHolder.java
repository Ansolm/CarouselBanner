package com.ansolm.carouselbanner.base;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.ansolm.carouselbanner.Banner;
import com.ansolm.carouselbanner.interfaces.OnCarouselItemClickListener;

/**
 * author  : Ansolm
 * e-mail  : ansolm@outlook.com
 * github  : http://github.com/ansolm
 * project : CarouselBanner
 */

public class BaseViewHolder extends RecyclerView.ViewHolder {
    protected ImageView imageView;

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public void bindData(final String url, final int position, final OnCarouselItemClickListener onClickListener) {
        Banner.factory().onLoadFactory(url, imageView);
        if (onClickListener != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClickListener.onItemClick(position, url);
                }
            });
        }
    }

}
