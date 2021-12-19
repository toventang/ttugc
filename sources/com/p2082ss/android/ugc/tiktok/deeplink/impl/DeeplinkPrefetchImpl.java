package com.p2082ss.android.ugc.tiktok.deeplink.impl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import com.p2082ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl */
public final class DeeplinkPrefetchImpl implements IDeepLinkSecurityService {
    static {
        Covode.recordClassIndex(98222);
    }

    /* renamed from: a */
    public static IDeepLinkSecurityService m144998a() {
        MethodCollector.m26663i(11743);
        Object a = C81908b.m141854a(IDeepLinkSecurityService.class, false);
        if (a != null) {
            IDeepLinkSecurityService iDeepLinkSecurityService = (IDeepLinkSecurityService) a;
            MethodCollector.m26664o(11743);
            return iDeepLinkSecurityService;
        }
        if (C81908b.f183364eH == null) {
            synchronized (IDeepLinkSecurityService.class) {
                try {
                    if (C81908b.f183364eH == null) {
                        C81908b.f183364eH = new DeeplinkPrefetchImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11743);
                    throw th;
                }
            }
        }
        DeeplinkPrefetchImpl deeplinkPrefetchImpl = (DeeplinkPrefetchImpl) C81908b.f183364eH;
        MethodCollector.m26664o(11743);
        return deeplinkPrefetchImpl;
    }

    @Override // com.p2082ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    /* renamed from: a */
    public final void mo129326a(Context context) {
        C84300a aVar;
        if (SettingsManager.m29616a().mo25400a("roma_schema_enabled", true) && C84301b.f188514b == null) {
            boolean z = Keva.getRepo("gecko_deeplink").getBoolean(C84301b.f188513a + C17867d.m33088i(), true);
            C81631k kVar = C81631k.f182525a;
            C89219l.m154716b(kVar, "");
            String c = kVar.mo125297c();
            long j = -1L;
            C89219l.m154716b(c, "");
            C89219l.m154716b(C81631k.f182525a, "");
            String a = C84301b.m145003a(C80333dc.m139272a("offlineX", c, "roma_schema_config"));
            if (!TextUtils.isEmpty(a)) {
                C89219l.m154716b(C81631k.f182525a, "");
                j = C80333dc.m139276b("offlineX", c, "roma_schema_config");
            }
            if (a == null || a.length() == 0) {
                aVar = null;
            } else {
                aVar = new C84300a(a, j);
            }
            if (!z || aVar == null) {
                C84300a a2 = C84301b.m145002a(context);
                if (aVar == null) {
                    C84301b.f188514b = a2;
                    return;
                }
                if (!(a2 == null || aVar.f188509a == null)) {
                    long longValue = a2.f188512d.longValue();
                    Long l = aVar.f188512d;
                    C89219l.m154716b(l, "");
                    if (longValue > l.longValue()) {
                        C84301b.f188514b = a2;
                        return;
                    }
                }
                C84301b.f188514b = aVar;
                Keva.getRepo("gecko_deeplink").storeBoolean(C84301b.f188513a + C17867d.m33088i(), true);
                return;
            }
            C84301b.f188514b = aVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    @Override // com.p2082ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.tiktok.deeplink.C84299b mo129325a(com.p2082ss.android.ugc.tiktok.deeplink.C84298a r12) {
        /*
        // Method dump skipped, instructions count: 496
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl.mo129325a(com.ss.android.ugc.tiktok.deeplink.a):com.ss.android.ugc.tiktok.deeplink.b");
    }
}
