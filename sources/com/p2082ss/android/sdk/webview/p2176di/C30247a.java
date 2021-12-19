package com.p2082ss.android.sdk.webview.p2176di;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.services.MainServiceForJsb;

/* renamed from: com.ss.android.sdk.webview.di.a */
public class C30247a {

    /* renamed from: b */
    private static C30247a f72162b;

    /* renamed from: a */
    public IMainServiceForJsb f72163a;

    static {
        Covode.recordClassIndex(36759);
    }

    /* renamed from: a */
    public static C30247a m61216a() {
        MethodCollector.m26663i(6982);
        if (f72162b == null) {
            synchronized (C30247a.class) {
                try {
                    if (f72162b == null) {
                        IMainServiceForJsb createIMainServiceForJsbbyMonsterPlugin = MainServiceForJsb.createIMainServiceForJsbbyMonsterPlugin(false);
                        if (createIMainServiceForJsbbyMonsterPlugin != null) {
                            C30247a aVar = new C30247a(createIMainServiceForJsbbyMonsterPlugin);
                            f72162b = aVar;
                            aVar.f72163a = createIMainServiceForJsbbyMonsterPlugin;
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException("Please add serviceImpl for IMainServiceForJsb");
                            MethodCollector.m26664o(6982);
                            throw illegalStateException;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6982);
                    throw th;
                }
            }
        }
        C30247a aVar2 = f72162b;
        MethodCollector.m26664o(6982);
        return aVar2;
    }

    private C30247a(IMainServiceForJsb iMainServiceForJsb) {
        this.f72163a = iMainServiceForJsb;
    }

    /* renamed from: a */
    public static synchronized void m61217a(IMainServiceForJsb iMainServiceForJsb) {
        synchronized (C30247a.class) {
            MethodCollector.m26663i(6837);
            C30247a aVar = f72162b;
            if (aVar == null) {
                f72162b = new C30247a(iMainServiceForJsb);
                MethodCollector.m26664o(6837);
                return;
            }
            aVar.f72163a = iMainServiceForJsb;
            MethodCollector.m26664o(6837);
        }
    }
}
