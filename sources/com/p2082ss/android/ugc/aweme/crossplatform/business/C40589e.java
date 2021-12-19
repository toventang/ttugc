package com.p2082ss.android.ugc.aweme.crossplatform.business;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.e */
public class C40589e implements AbstractC40591g {

    /* renamed from: a */
    final AbstractC40521c f94997a;

    /* renamed from: b */
    private final BusinessService f94998b = new BusinessService(this);

    static {
        Covode.recordClassIndex(48428);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g
    /* renamed from: a */
    public final void mo69749a() {
        this.f94998b.mo69713a(WalletBusiness.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g
    /* renamed from: a */
    public final <T extends BusinessService.Business> T mo69748a(Class<T> cls) {
        return (T) this.f94998b.mo69713a(cls);
    }

    C40589e(AbstractC40521c cVar) {
        this.f94997a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.crossplatform.business.AbstractC40591g
    /* renamed from: a */
    public final void mo69750a(C40618a aVar) {
        if (aVar != null && aVar.f95068a.f95054c != null) {
            int intValue = aVar.f95068a.f95052a.intValue();
            if ((intValue == 3 || intValue == 1) && aVar.f95068a.f95054c.endsWith("pay")) {
                this.f94998b.mo69713a(WalletBusiness.class);
            }
        }
    }
}
