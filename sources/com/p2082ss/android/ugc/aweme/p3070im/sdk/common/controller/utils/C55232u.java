package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.u */
public final class C55232u {

    /* renamed from: a */
    public static final WeakHashMap<View, Long> f126318a = new WeakHashMap<>();

    /* renamed from: b */
    public static final C55232u f126319b = new C55232u();

    /* renamed from: c */
    private static final int f126320c = 1200;

    private C55232u() {
    }

    static {
        Covode.recordClassIndex(64979);
    }

    /* renamed from: a */
    public static boolean m101003a(View view, long j) {
        if (view == null) {
            return false;
        }
        WeakHashMap<View, Long> weakHashMap = f126318a;
        Long l = weakHashMap.get(view);
        long nanoTime = System.nanoTime() / 1000000;
        if (l == null) {
            weakHashMap.put(view, Long.valueOf(nanoTime));
            return false;
        } else if (nanoTime - l.longValue() <= j) {
            return true;
        } else {
            weakHashMap.put(view, Long.valueOf(nanoTime));
            return false;
        }
    }
}
