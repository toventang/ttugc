package com.p2082ss.android.ugc.aweme.flowfeed.utils;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.d */
public final class C51056d {
    static {
        Covode.recordClassIndex(60241);
    }

    /* renamed from: a */
    private static int m95446a(Context context) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 3;
        return scaledTouchSlop * scaledTouchSlop;
    }

    /* renamed from: a */
    public static boolean m95447a(MotionEvent motionEvent, MotionEvent motionEvent2, Context context) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        int x = (int) (motionEvent2.getX() - motionEvent.getX());
        int y = (int) (motionEvent2.getY() - motionEvent.getY());
        int i = (x * x) + (y * y);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 3;
        if (i > m95446a(context) || Math.abs(x) >= scaledTouchSlop) {
            return true;
        }
        return false;
    }
}
