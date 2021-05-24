package com.example.ltorerviewerexam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class SlideerAdapterreview extends RecyclerView.Adapter<SlideerAdapterreview.SliderViewHolder> {
    private List<reviewerslider> slideritems;
    private ViewPager2 viewPager2;

    public SlideerAdapterreview(List<reviewerslider> slideritems, ViewPager2 viewPager2) {
        this.slideritems = slideritems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.slide_item_reviewer_round,
                        parent,
                        false
                ));
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        holder.setImage(slideritems.get(position));
    }

    @Override
    public int getItemCount() {
        return slideritems.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder {

        private RoundedImageView imageView;

        SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageslide);
        }

        void setImage(reviewerslider sliderItem) {
            imageView.setImageResource(sliderItem.getImage());

        }
    }
}
