package com.xinlan.imageeditlibrary.editimage.view;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import android.util.AttributeSet;

public class CustomViewPager extends ViewPager {
	private boolean isCanScroll = false;

	public CustomViewPager(Context context) {
		super(context);
	}

	@Override
	public void setCurrentItem(int item, boolean smoothScroll) {
		isCanScroll = true;
		super.setCurrentItem(item, smoothScroll);
		isCanScroll = false;
	}

	@Override
	public void setCurrentItem(int item) {
		setCurrentItem(item, false);
	}

	public CustomViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public void setScanScroll(boolean isCanScroll) {
		this.isCanScroll = isCanScroll;
	}

	@Override
	public void scrollTo(int x, int y) {
		if (isCanScroll) {
			super.scrollTo(x, y);
		}
	}
}  
