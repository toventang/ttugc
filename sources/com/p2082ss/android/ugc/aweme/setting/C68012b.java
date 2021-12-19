package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2482cn.AbstractC36144a;

/* renamed from: com.ss.android.ugc.aweme.setting.b */
public class C68012b extends AbstractC36144a {

    /* renamed from: b */
    private static C68012b f152362b;

    static {
        Covode.recordClassIndex(80208);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2482cn.AbstractC36144a
    /* renamed from: a */
    public final void mo63261a() {
        this.f85379a = "ab_test_config";
    }

    /* renamed from: b */
    public static C68012b m120309b() {
        MethodCollector.m26663i(6921);
        if (f152362b == null) {
            synchronized (C68012b.class) {
                try {
                    if (f152362b == null) {
                        f152362b = new C68012b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6921);
                    throw th;
                }
            }
        }
        C68012b bVar = f152362b;
        MethodCollector.m26664o(6921);
        return bVar;
    }
}
