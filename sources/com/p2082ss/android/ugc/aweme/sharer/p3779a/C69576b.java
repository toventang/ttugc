package com.p2082ss.android.ugc.aweme.sharer.p3779a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.sharer.a.b */
public final class C69576b {

    /* renamed from: a */
    public static final C69576b f155399a = new C69576b();

    /* renamed from: b */
    private static final WeakHashMap<View, Long> f155400b = new WeakHashMap<>();

    private C69576b() {
    }

    static {
        Covode.recordClassIndex(81922);
    }

    /* renamed from: a */
    public static boolean m122788a(View view, long j) {
        if (view == null) {
            return false;
        }
        WeakHashMap<View, Long> weakHashMap = f155400b;
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
