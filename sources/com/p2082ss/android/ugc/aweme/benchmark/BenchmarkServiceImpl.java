package com.p2082ss.android.ugc.aweme.benchmark;

import com.benchmark.collection.AbstractC2460f;
import com.benchmark.collection.C2439b;
import com.benchmark.port.C2497a;
import com.benchmark.strategy.C2507a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.p2396bl.IBenchmarkService;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl */
public final class BenchmarkServiceImpl implements IBenchmarkService {
    static {
        Covode.recordClassIndex(41823);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2396bl.IBenchmarkService
    /* renamed from: a */
    public final void mo61661a() {
        C2439b bVar = C2439b.f7341a;
        C89219l.m154716b(bVar, "");
        AbstractC2460f a = bVar.mo6804a();
        if (a != null) {
            a.mo6811b();
        }
    }

    /* renamed from: c */
    public static IBenchmarkService m71140c() {
        MethodCollector.m26663i(6665);
        Object a = C81908b.m141854a(IBenchmarkService.class, false);
        if (a != null) {
            IBenchmarkService iBenchmarkService = (IBenchmarkService) a;
            MethodCollector.m26664o(6665);
            return iBenchmarkService;
        }
        if (C81908b.f183137T == null) {
            synchronized (IBenchmarkService.class) {
                try {
                    if (C81908b.f183137T == null) {
                        C81908b.f183137T = new BenchmarkServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6665);
                    throw th;
                }
            }
        }
        BenchmarkServiceImpl benchmarkServiceImpl = (BenchmarkServiceImpl) C81908b.f183137T;
        MethodCollector.m26664o(6665);
        return benchmarkServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2396bl.IBenchmarkService
    /* renamed from: b */
    public final float mo61663b() {
        Object obj;
        try {
            obj = C89379q.m157068constructorimpl(Float.valueOf(C2507a.f7604b.mo6953a(C2497a.f7570a.f7579j)));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        Float f = (Float) obj;
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2396bl.IBenchmarkService
    /* renamed from: a */
    public final void mo61662a(int i) {
        C2439b bVar = C2439b.f7341a;
        C89219l.m154716b(bVar, "");
        AbstractC2460f a = bVar.mo6804a();
        if (a != null) {
            a.mo6807a(i);
        }
    }
}
