package com.shop.base.view.skeleton;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * @author dxl
 */

public class Skeleton {

    public static RecyclerViewSkeletonScreen.Builder bind(RecyclerView recyclerView) {
        return new RecyclerViewSkeletonScreen.Builder(recyclerView);
    }

    public static ViewSkeletonScreen.Builder bind(View view) {
        return new ViewSkeletonScreen.Builder(view);
    }

}
