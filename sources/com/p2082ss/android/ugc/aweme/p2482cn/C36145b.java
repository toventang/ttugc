package com.p2082ss.android.ugc.aweme.p2482cn;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.cn.b */
public class C36145b extends AbstractC36144a {

    /* renamed from: b */
    private static C36145b f85380b;

    static {
        Covode.recordClassIndex(43398);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2482cn.AbstractC36144a
    /* renamed from: a */
    public final void mo63261a() {
        this.f85379a = "default_config";
    }

    /* renamed from: b */
    public static C36145b m73641b() {
        MethodCollector.m26663i(14323);
        if (f85380b == null) {
            synchronized (C36145b.class) {
                try {
                    if (f85380b == null) {
                        f85380b = new C36145b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14323);
                    throw th;
                }
            }
        }
        C36145b bVar = f85380b;
        MethodCollector.m26664o(14323);
        return bVar;
    }
}
