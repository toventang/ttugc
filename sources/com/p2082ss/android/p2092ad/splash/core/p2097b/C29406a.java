package com.p2082ss.android.p2092ad.splash.core.p2097b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.p2097b.C29407b;

/* renamed from: com.ss.android.ad.splash.core.b.a */
public class C29406a extends C29407b {

    /* renamed from: c */
    private static volatile C29406a f69836c;

    static {
        Covode.recordClassIndex(35800);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2097b.C29407b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C29407b.C29410c mo51432a() {
        return super.mo51432a();
    }

    private C29406a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static C29406a m58903a(Context context) {
        MethodCollector.m26663i(13450);
        if (f69836c == null) {
            synchronized (C29406a.class) {
                try {
                    if (f69836c == null) {
                        f69836c = new C29406a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13450);
                    throw th;
                }
            }
        }
        C29406a aVar = f69836c;
        MethodCollector.m26664o(13450);
        return aVar;
    }
}
