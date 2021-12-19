package com.p2082ss.android.ugc.aweme.plugin.aab;

import android.app.Application;
import com.bytedance.common.utility.p906a.C13584a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1542m.AbstractC21397a;
import com.bytedance.p1542m.C21411c;

/* renamed from: com.ss.android.ugc.aweme.plugin.aab.c */
public class C63128c implements AbstractC21397a {

    /* renamed from: a */
    private static boolean f143465a;

    static {
        Covode.recordClassIndex(73972);
    }

    private C63128c() {
        C21411c.m40192a(this);
    }

    @Override // com.bytedance.p1542m.AbstractC21397a
    /* renamed from: a */
    public final Application mo34999a() {
        return (Application) C17867d.m33078a();
    }

    @Override // com.bytedance.p1542m.AbstractC21397a
    /* renamed from: b */
    public final int mo35000b() {
        return C13584a.m24416a(C17867d.m33078a(), "SS_VERSION_CODE");
    }

    /* renamed from: c */
    public static void m114082c() {
        MethodCollector.m26663i(5365);
        if (!f143465a) {
            synchronized (C63128c.class) {
                try {
                    if (!f143465a) {
                        new C63128c();
                        f143465a = true;
                    }
                } finally {
                    MethodCollector.m26664o(5365);
                }
            }
            return;
        }
        MethodCollector.m26664o(5365);
    }
}
