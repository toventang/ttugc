package com.p2082ss.android.ugc.aweme.aabplugin.core.p2229b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1966e.AbstractC27034f;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.b.e */
public final class C31309e {

    /* renamed from: a */
    static final ConcurrentHashMap<String, AbstractC27034f> f75023a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, Integer> f75024b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(38009);
    }

    /* renamed from: a */
    public static AbstractC27034f m65492a(String str) {
        return f75023a.get(str);
    }
}
