package com.p2082ss.android.ugc.aweme.benchmark;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.p2396bl.IBenchmarkInitService;

/* renamed from: com.ss.android.ugc.aweme.benchmark.BenchmarkInitService */
public final class BenchmarkInitService implements IBenchmarkInitService {
    static {
        Covode.recordClassIndex(41822);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2396bl.IBenchmarkInitService
    /* renamed from: a */
    public final AbstractC58264w mo61660a() {
        return new BenchmarkInitRequest();
    }

    /* renamed from: b */
    public static IBenchmarkInitService m71138b() {
        MethodCollector.m26663i(6514);
        Object a = C81908b.m141854a(IBenchmarkInitService.class, false);
        if (a != null) {
            IBenchmarkInitService iBenchmarkInitService = (IBenchmarkInitService) a;
            MethodCollector.m26664o(6514);
            return iBenchmarkInitService;
        }
        if (C81908b.f183136S == null) {
            synchronized (IBenchmarkInitService.class) {
                try {
                    if (C81908b.f183136S == null) {
                        C81908b.f183136S = new BenchmarkInitService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6514);
                    throw th;
                }
            }
        }
        BenchmarkInitService benchmarkInitService = (BenchmarkInitService) C81908b.f183136S;
        MethodCollector.m26664o(6514);
        return benchmarkInitService;
    }
}
