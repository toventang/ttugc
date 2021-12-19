package com.p2082ss.android.ugc.aweme.story.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4032a.C76849c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.e */
public final class C76627e {

    /* renamed from: a */
    public static volatile AbstractC50651a f171964a;

    /* renamed from: b */
    public static final C76627e f171965b = new C76627e();

    private C76627e() {
    }

    static {
        Covode.recordClassIndex(89614);
    }

    /* renamed from: b */
    public final void mo120335b() {
        mo120334a().mo86006d().mo86071f();
        mo120334a().mo86005c().mo86020a();
    }

    /* renamed from: a */
    public final AbstractC50651a mo120334a() {
        MethodCollector.m26663i(5457);
        if (f171964a == null) {
            synchronized (this) {
                try {
                    if (f171964a == null) {
                        f171964a = new C76849c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5457);
                    throw th;
                }
            }
        }
        AbstractC50651a aVar = f171964a;
        if (aVar == null) {
            C89219l.m154715b();
        }
        MethodCollector.m26664o(5457);
        return aVar;
    }
}
