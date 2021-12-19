package com.p2082ss.android.ugc.aweme.app.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38216ad;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38256t;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.main.service.ICommerceService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.services.d */
public final class C33851d implements ICommerceService {
    static {
        Covode.recordClassIndex(40764);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.services.d$a */
    public static class C33852a {

        /* renamed from: a */
        public static final C33851d f80140a = new C33851d();

        static {
            Covode.recordClassIndex(40765);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.main.service.ICommerceService
    /* renamed from: a */
    public final C38216ad mo60110a(String str) {
        boolean z;
        C38256t tVar;
        C38216ad[] adVarArr;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(z || (tVar = CommerceSettingsApi.f88905a) == null || (adVarArr = tVar.f90411b) == null)) {
            for (C38216ad adVar : adVarArr) {
                if (C89219l.m154714a((Object) adVar.f90278a, (Object) str)) {
                    return adVar;
                }
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.main.service.ICommerceService
    /* renamed from: a */
    public final boolean mo60111a(Context context, String str, String str2) {
        return C38767w.m78639a(context, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.service.ICommerceService
    /* renamed from: a */
    public final boolean mo60112a(Context context, String str, boolean z) {
        return C38767w.m78643a(context, str, z);
    }
}
