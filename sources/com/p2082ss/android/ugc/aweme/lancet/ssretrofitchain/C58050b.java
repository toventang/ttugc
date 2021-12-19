package com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.b */
public class C58050b extends AbstractC58051c {

    /* renamed from: a */
    public static final AbstractC58051c.C58052a f132285a = new AbstractC58051c.C58052a();

    /* renamed from: c */
    private static volatile C58050b f132286c;

    static {
        Covode.recordClassIndex(68090);
    }

    /* renamed from: a */
    public static C58050b m104873a() {
        MethodCollector.m26663i(6895);
        if (f132286c == null) {
            synchronized (C58050b.class) {
                try {
                    if (f132286c == null) {
                        f132286c = new C58050b(new C58059h(new C58060i(new C58055f(new C58054e(new C58053d(new C58042a(new C58062j())))))));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6895);
                    throw th;
                }
            }
        }
        C58050b bVar = f132286c;
        MethodCollector.m26664o(6895);
        return bVar;
    }

    private C58050b(AbstractC58051c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c
    /* renamed from: a */
    public final AbstractC58051c.C58052a mo95554a(C58057g gVar, Request request, C22099u uVar) {
        return f132285a;
    }
}
