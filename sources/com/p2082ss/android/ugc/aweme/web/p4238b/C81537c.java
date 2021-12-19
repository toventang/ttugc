package com.p2082ss.android.ugc.aweme.web.p4238b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.web.b.c */
public final class C81537c {

    /* renamed from: c */
    private static volatile C81537c f182332c;

    /* renamed from: a */
    public Map<String, String> f182333a;

    /* renamed from: b */
    public Context f182334b;

    static {
        Covode.recordClassIndex(94915);
    }

    private C81537c() {
    }

    /* renamed from: a */
    public static C81537c m141403a() {
        MethodCollector.m26663i(5892);
        if (f182332c == null) {
            synchronized (C17301b.class) {
                try {
                    if (f182332c == null) {
                        f182332c = new C81537c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5892);
                    throw th;
                }
            }
        }
        C81537c cVar = f182332c;
        MethodCollector.m26664o(5892);
        return cVar;
    }
}
