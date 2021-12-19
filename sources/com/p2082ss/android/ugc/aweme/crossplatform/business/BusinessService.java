package com.p2082ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40521c;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.BusinessService */
public final class BusinessService {

    /* renamed from: a */
    private final C40589e f94931a;

    /* renamed from: b */
    private HashMap<Class, Business> f94932b = new HashMap<>();

    static {
        Covode.recordClassIndex(48392);
    }

    BusinessService(C40589e eVar) {
        this.f94931a = eVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business */
    public static abstract class Business {

        /* renamed from: i */
        protected final AbstractC40521c f94933i;

        /* renamed from: j */
        protected final C40589e f94934j;

        /* renamed from: k */
        protected final C40618a f94935k;

        /* renamed from: l */
        protected final Context f94936l;

        static {
            Covode.recordClassIndex(48393);
        }

        public Business(C40589e eVar) {
            this.f94934j = eVar;
            AbstractC40521c cVar = eVar.f94997a;
            this.f94933i = cVar;
            this.f94935k = cVar.getCrossPlatformParams();
            this.f94936l = cVar.getContext();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService.Business> T mo69713a(java.lang.Class<T> r7) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.business.BusinessService.mo69713a(java.lang.Class):com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business");
    }
}
