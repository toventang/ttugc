package com.bytedance.sdk.p1625a.p1643f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22463a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.bytedance.sdk.a.f.g */
public class C22383g implements AbstractC22463a {

    /* renamed from: a */
    private static volatile AbstractC22463a f52926a;

    /* renamed from: b */
    private final Context f52927b;

    static {
        Covode.recordClassIndex(26199);
    }

    private C22383g(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f52927b = applicationContext;
    }

    /* renamed from: a */
    public static AbstractC22463a m42210a(Context context) {
        MethodCollector.m26663i(1536);
        if (f52926a == null) {
            synchronized (C22383g.class) {
                try {
                    if (f52926a == null) {
                        f52926a = new C22383g(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1536);
                    throw th;
                }
            }
        }
        AbstractC22463a aVar = f52926a;
        MethodCollector.m26664o(1536);
        return aVar;
    }
}
