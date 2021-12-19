package com.p2082ss.android.ugc.aweme.legoImpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.legoapi.freso.IFrescoLegoTaskApi;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.legoImpl.task.FrescoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImpl.FrescoLegoTaskImpl */
public final class FrescoLegoTaskImpl implements IFrescoLegoTaskApi {
    static {
        Covode.recordClassIndex(68719);
    }

    @Override // com.p2082ss.android.legoapi.freso.IFrescoLegoTaskApi
    /* renamed from: a */
    public final AbstractC58264w mo52302a() {
        return new FrescoTask();
    }

    /* renamed from: b */
    public static IFrescoLegoTaskApi m107042b() {
        MethodCollector.m26663i(3213);
        Object a = C81908b.m141854a(IFrescoLegoTaskApi.class, false);
        if (a != null) {
            IFrescoLegoTaskApi iFrescoLegoTaskApi = (IFrescoLegoTaskApi) a;
            MethodCollector.m26664o(3213);
            return iFrescoLegoTaskApi;
        }
        if (C81908b.f183292cp == null) {
            synchronized (IFrescoLegoTaskApi.class) {
                try {
                    if (C81908b.f183292cp == null) {
                        C81908b.f183292cp = new FrescoLegoTaskImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3213);
                    throw th;
                }
            }
        }
        FrescoLegoTaskImpl frescoLegoTaskImpl = (FrescoLegoTaskImpl) C81908b.f183292cp;
        MethodCollector.m26664o(3213);
        return frescoLegoTaskImpl;
    }
}
