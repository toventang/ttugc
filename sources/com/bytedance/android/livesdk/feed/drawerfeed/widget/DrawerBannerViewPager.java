package com.bytedance.android.livesdk.feed.drawerfeed.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.feed.banner.C8506c;
import com.bytedance.android.livesdk.feed.p529e.C8565a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;

public class DrawerBannerViewPager extends C8506c {
    static {
        Covode.recordClassIndex(9419);
    }

    /* renamed from: c */
    private static void m16782c() {
        C6779a.m14563a().mo13053a(new C8565a(1));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            Boolean.valueOf(true);
            m16782c();
        } else if (action == 1 || action == 3) {
            Boolean.valueOf(false);
            m16782c();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public DrawerBannerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
