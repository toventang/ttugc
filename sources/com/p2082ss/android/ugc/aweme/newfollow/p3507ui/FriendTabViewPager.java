package com.p2082ss.android.ugc.aweme.newfollow.p3507ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1284f.C18274c;
import com.p2082ss.android.ugc.aweme.main.TabChangeManager;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewPager */
public class FriendTabViewPager extends C18274c {

    /* renamed from: a */
    private boolean f139625a = true;

    static {
        Covode.recordClassIndex(72171);
    }

    public void setCanScroll(boolean z) {
        this.f139625a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.bytedance.ies.uikit.p1284f.C18274c
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f139625a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.bytedance.ies.uikit.p1284f.C18274c
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f139625a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScrollHorizontally(int i) {
        if (TextUtils.equals(TabChangeManager.C59002a.m108439a((ActivityC0945e) getContext()).f134312d, "HOME")) {
            return false;
        }
        return super.canScrollHorizontally(i);
    }

    public FriendTabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return i2;
        }
    }
}
