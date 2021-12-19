package com.p2082ss.android.ugc.aweme.p2759di;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.services.C33851d;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38216ad;
import com.p2082ss.android.ugc.aweme.main.service.ICommerceService;

/* renamed from: com.ss.android.ugc.aweme.di.CommerceServiceImpl */
public class CommerceServiceImpl implements ICommerceService {

    /* renamed from: a */
    private final ICommerceService f96788a = C33851d.C33852a.f80140a;

    static {
        Covode.recordClassIndex(49383);
    }

    /* renamed from: a */
    public static ICommerceService m83407a() {
        MethodCollector.m26663i(2467);
        Object a = C81908b.m141854a(ICommerceService.class, false);
        if (a != null) {
            ICommerceService iCommerceService = (ICommerceService) a;
            MethodCollector.m26664o(2467);
            return iCommerceService;
        }
        if (C81908b.f183167aW == null) {
            synchronized (ICommerceService.class) {
                try {
                    if (C81908b.f183167aW == null) {
                        C81908b.f183167aW = new CommerceServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2467);
                    throw th;
                }
            }
        }
        CommerceServiceImpl commerceServiceImpl = (CommerceServiceImpl) C81908b.f183167aW;
        MethodCollector.m26664o(2467);
        return commerceServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.service.ICommerceService
    /* renamed from: a */
    public final C38216ad mo60110a(String str) {
        return this.f96788a.mo60110a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.service.ICommerceService
    /* renamed from: a */
    public final boolean mo60111a(Context context, String str, String str2) {
        return this.f96788a.mo60111a(context, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.service.ICommerceService
    /* renamed from: a */
    public final boolean mo60112a(Context context, String str, boolean z) {
        return this.f96788a.mo60112a(context, str, z);
    }
}
