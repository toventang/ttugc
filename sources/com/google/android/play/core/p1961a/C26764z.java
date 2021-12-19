package com.google.android.play.core.p1961a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.C26896an;
import com.google.android.play.core.p1965d.C26991q;

/* renamed from: com.google.android.play.core.a.z */
public final /* synthetic */ class C26764z {

    /* renamed from: a */
    private static C26738ab f63411a;

    static {
        Covode.recordClassIndex(32236);
    }

    /* renamed from: a */
    static synchronized C26738ab m53156a(Context context) {
        C26738ab abVar;
        synchronized (C26764z.class) {
            MethodCollector.m26663i(11012);
            if (f63411a == null) {
                C26737aa aaVar = new C26737aa((byte) 0);
                aaVar.f63352a = new C26748j(C26991q.m53630a(context));
                C26896an.m53420a(aaVar.f63352a, C26748j.class);
                f63411a = new C26738ab(aaVar.f63352a);
            }
            abVar = f63411a;
            MethodCollector.m26664o(11012);
        }
        return abVar;
    }
}
