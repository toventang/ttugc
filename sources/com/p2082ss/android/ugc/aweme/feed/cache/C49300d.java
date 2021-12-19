package com.p2082ss.android.ugc.aweme.feed.cache;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.d */
public final class C49300d {

    /* renamed from: a */
    public static volatile boolean f113309a;

    /* renamed from: b */
    public static volatile boolean f113310b;

    /* renamed from: c */
    public static WeakReference<AbstractC49298b> f113311c;

    /* renamed from: d */
    public static final C49300d f113312d = new C49300d();

    private C49300d() {
    }

    static {
        Covode.recordClassIndex(58101);
    }

    /* renamed from: a */
    public static void m92355a() {
        AbstractC49298b bVar;
        WeakReference<AbstractC49298b> weakReference = f113311c;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            bVar.mo80894a();
        }
    }
}
