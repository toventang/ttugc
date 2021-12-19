package com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17448a;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17450c;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17451d;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17452e;
import com.bytedance.ies.p1208im.core.api.proxy.IIMCoreDependProxyService;
import com.bytedance.p1399im.core.p1416h.AbstractC19704c;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3208a.C55621b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b.C55631a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b.C55633b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b.C55634c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b.C55636d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b.C55637e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b.C55638f;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.IMCoreDependProxyService */
public class IMCoreDependProxyService implements IIMCoreDependProxyService {
    static {
        Covode.recordClassIndex(65400);
    }

    @Override // com.bytedance.ies.p1208im.core.api.proxy.IIMCoreDependProxyService
    /* renamed from: a */
    public final AbstractC17451d mo27903a() {
        return C55636d.f126897a;
    }

    @Override // com.bytedance.ies.p1208im.core.api.proxy.IIMCoreDependProxyService
    /* renamed from: b */
    public final AbstractC17449b mo27904b() {
        return C55633b.f126893a;
    }

    @Override // com.bytedance.ies.p1208im.core.api.proxy.IIMCoreDependProxyService
    /* renamed from: c */
    public final AbstractC17450c mo27905c() {
        return C55634c.f126894a;
    }

    @Override // com.bytedance.ies.p1208im.core.api.proxy.IIMCoreDependProxyService
    /* renamed from: d */
    public final AbstractC17452e mo27906d() {
        return C55638f.f126899a;
    }

    @Override // com.bytedance.ies.p1208im.core.api.proxy.IIMCoreDependProxyService
    /* renamed from: e */
    public final AbstractC17448a mo27907e() {
        return C55631a.f126890a;
    }

    @Override // com.bytedance.ies.p1208im.core.api.proxy.IIMCoreDependProxyService
    /* renamed from: f */
    public final AbstractC17429c mo27908f() {
        return C55621b.f126875a;
    }

    @Override // com.bytedance.ies.p1208im.core.api.proxy.IIMCoreDependProxyService
    /* renamed from: g */
    public final AbstractC19704c mo27909g() {
        return C55637e.f126898a;
    }

    /* renamed from: h */
    public static IIMCoreDependProxyService m101313h() {
        MethodCollector.m26663i(3700);
        Object a = C81908b.m141854a(IIMCoreDependProxyService.class, false);
        if (a != null) {
            IIMCoreDependProxyService iIMCoreDependProxyService = (IIMCoreDependProxyService) a;
            MethodCollector.m26664o(3700);
            return iIMCoreDependProxyService;
        }
        if (C81908b.f183248by == null) {
            synchronized (IIMCoreDependProxyService.class) {
                try {
                    if (C81908b.f183248by == null) {
                        C81908b.f183248by = new IMCoreDependProxyService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3700);
                    throw th;
                }
            }
        }
        IMCoreDependProxyService iMCoreDependProxyService = (IMCoreDependProxyService) C81908b.f183248by;
        MethodCollector.m26664o(3700);
        return iMCoreDependProxyService;
    }
}
