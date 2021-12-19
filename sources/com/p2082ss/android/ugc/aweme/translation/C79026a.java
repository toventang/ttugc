package com.p2082ss.android.ugc.aweme.translation;

import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79031d;

/* renamed from: com.ss.android.ugc.aweme.translation.a */
public class C79026a {

    /* renamed from: b */
    private static volatile C79026a f177632b;

    /* renamed from: a */
    public C0490e<String, C79031d> f177633a = new C0490e<>(100);

    static {
        Covode.recordClassIndex(92197);
    }

    private C79026a() {
    }

    /* renamed from: a */
    public static C79026a m137857a() {
        MethodCollector.m26663i(7998);
        if (f177632b == null) {
            synchronized (C79026a.class) {
                try {
                    if (f177632b == null) {
                        f177632b = new C79026a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7998);
                    throw th;
                }
            }
        }
        C79026a aVar = f177632b;
        MethodCollector.m26664o(7998);
        return aVar;
    }

    /* renamed from: a */
    public final C79031d mo122855a(String str) {
        if (str == null) {
            return null;
        }
        return this.f177633a.mo2091a(str);
    }
}
