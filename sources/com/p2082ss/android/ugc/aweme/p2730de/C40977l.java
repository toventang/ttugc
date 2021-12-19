package com.p2082ss.android.ugc.aweme.p2730de;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.de.l */
public final class C40977l {

    /* renamed from: a */
    public static final C40977l f95813a = new C40977l();

    /* renamed from: b */
    private static final WeakHashMap<View, Long> f95814b = new WeakHashMap<>();

    private C40977l() {
    }

    static {
        Covode.recordClassIndex(48829);
    }

    /* renamed from: a */
    public static boolean m82500a(View view, long j) {
        if (view == null) {
            return false;
        }
        WeakHashMap<View, Long> weakHashMap = f95814b;
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
