package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.data.ImUnder16Manger;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl */
public class IMAdapterServiceImpl extends AbstractC55277a {
    static {
        Covode.recordClassIndex(65031);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService
    /* renamed from: b */
    public final boolean mo90130b() {
        return ImUnder16Manger.m102067b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService
    /* renamed from: c */
    public final boolean mo90131c() {
        return ImUnder16Manger.m102070c();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService
    /* renamed from: a */
    public final boolean mo90129a() {
        if (SharePrefCache.inst().getCanIm().mo59941c().intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static IIMAdapterService m101068d() {
        MethodCollector.m26663i(5299);
        Object a = C81908b.m141854a(IIMAdapterService.class, false);
        if (a != null) {
            IIMAdapterService iIMAdapterService = (IIMAdapterService) a;
            MethodCollector.m26664o(5299);
            return iIMAdapterService;
        }
        if (C81908b.f183247bx == null) {
            synchronized (IIMAdapterService.class) {
                try {
                    if (C81908b.f183247bx == null) {
                        C81908b.f183247bx = new IMAdapterServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5299);
                    throw th;
                }
            }
        }
        AbstractC55277a aVar = (AbstractC55277a) C81908b.f183247bx;
        MethodCollector.m26664o(5299);
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService, com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.AbstractC55277a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo90128a(User user) {
        super.mo90128a(user);
    }
}
