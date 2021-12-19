package com.p2082ss.android.ugc.aweme.live.p3406c;

import android.content.Context;
import com.bytedance.android.livesdk.utils.C11266h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.live.C58490ab;

/* renamed from: com.ss.android.ugc.aweme.live.c.b */
public class C58595b implements AbstractC58594a {

    /* renamed from: a */
    private static volatile C58595b f133464a;

    static {
        Covode.recordClassIndex(68891);
    }

    private C58595b() {
    }

    /* renamed from: a */
    public static C58595b m107707a() {
        MethodCollector.m26663i(199);
        if (f133464a == null) {
            synchronized (C58595b.class) {
                try {
                    if (f133464a == null) {
                        f133464a = new C58595b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(199);
                    throw th;
                }
            }
        }
        C58595b bVar = f133464a;
        MethodCollector.m26664o(199);
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3406c.AbstractC58594a
    /* renamed from: a */
    public final String mo96053a(String str) {
        return C11266h.m19967a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3406c.AbstractC58594a
    /* renamed from: a */
    public final String mo96052a(Context context, String str) {
        return C58490ab.m107312a(context, str);
    }
}
