package com.bytedance.analytics.p124a;

import android.app.Activity;
import com.bytedance.analytics.page.C2607j;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.analytics.a.b */
public final class C2581b {

    /* renamed from: a */
    public static final C2581b f7785a = new C2581b();

    /* renamed from: b */
    static long f7786b;

    /* renamed from: c */
    public static final Map<Integer, Set<C2584d>> f7787c = new HashMap();

    /* renamed from: d */
    public static final Map<Integer, Map<String, C2582c>> f7788d = new HashMap();

    /* renamed from: e */
    private static long f7789e;

    private C2581b() {
    }

    static {
        Covode.recordClassIndex(2968);
    }

    /* renamed from: b */
    public static void m7531b() {
        Activity activity;
        Map<String, C2582c> map;
        WeakReference<Activity> weakReference = C2607j.f7853b;
        if (!(weakReference == null || (activity = weakReference.get()) == null || (map = f7788d.get(Integer.valueOf(activity.hashCode()))) == null)) {
            for (C2582c cVar : map.values()) {
                if (cVar.f7796g) {
                    cVar.mo7059a();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0157  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m7530a() {
        /*
        // Method dump skipped, instructions count: 428
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.analytics.p124a.C2581b.m7530a():void");
    }
}
