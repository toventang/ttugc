package com.p2082ss.android.ugc.aweme.p3382l.p3383a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.l.a.a */
public final class C58001a {

    /* renamed from: a */
    private static final WeakHashMap<View, Long> f132193a = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(68034);
    }

    /* renamed from: a */
    public static boolean m104815a(View view, long j) {
        if (view == null) {
            return false;
        }
        WeakHashMap<View, Long> weakHashMap = f132193a;
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
