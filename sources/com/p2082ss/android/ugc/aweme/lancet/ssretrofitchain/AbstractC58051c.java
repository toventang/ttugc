package com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.c */
public abstract class AbstractC58051c {

    /* renamed from: b */
    AbstractC58051c f132287b;

    static {
        Covode.recordClassIndex(68091);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C58052a mo95554a(C58057g gVar, Request request, C22099u uVar);

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a */
    public static class C58052a {

        /* renamed from: a */
        public final boolean f132288a;

        /* renamed from: b */
        public final boolean f132289b;

        /* renamed from: c */
        final Map<String, String> f132290c;

        static {
            Covode.recordClassIndex(68092);
        }

        public C58052a() {
            this(false, false);
        }

        public C58052a(boolean z, boolean z2) {
            this.f132288a = z2;
            this.f132289b = z;
        }
    }

    public AbstractC58051c(AbstractC58051c cVar) {
        this.f132287b = cVar;
    }
}
