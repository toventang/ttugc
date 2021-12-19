package com.bytedance.ies.p1208im.core.service;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17466a;
import com.bytedance.ies.p1208im.core.api.p1218h.AbstractC17467b;
import com.bytedance.ies.p1208im.core.api.proxy.IIMCoreProxyService;
import com.p2082ss.android.ugc.C81908b;

/* renamed from: com.bytedance.ies.im.core.service.IMCoreProxyService */
public class IMCoreProxyService implements IIMCoreProxyService {

    /* renamed from: a */
    public static long f42086a = SystemClock.elapsedRealtime();

    static {
        Covode.recordClassIndex(20086);
    }

    @Override // com.bytedance.ies.p1208im.core.api.proxy.IIMCoreProxyService
    /* renamed from: a */
    public final AbstractC17466a mo27910a() {
        return (C17597a) C17601c.f42089a.getValue();
    }

    @Override // com.bytedance.ies.p1208im.core.api.proxy.IIMCoreProxyService
    /* renamed from: b */
    public final AbstractC17467b mo27911b() {
        return (C17599b) C17601c.f42090b.getValue();
    }

    /* renamed from: c */
    public static IIMCoreProxyService m32648c() {
        MethodCollector.m26663i(7841);
        Object a = C81908b.m141854a(IIMCoreProxyService.class, false);
        if (a != null) {
            IIMCoreProxyService iIMCoreProxyService = (IIMCoreProxyService) a;
            MethodCollector.m26664o(7841);
            return iIMCoreProxyService;
        }
        if (C81908b.f183144a == null) {
            synchronized (IIMCoreProxyService.class) {
                try {
                    if (C81908b.f183144a == null) {
                        C81908b.f183144a = new IMCoreProxyService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7841);
                    throw th;
                }
            }
        }
        IMCoreProxyService iMCoreProxyService = (IMCoreProxyService) C81908b.f183144a;
        MethodCollector.m26664o(7841);
        return iMCoreProxyService;
    }
}
