package com.p2082ss.android.ugc.aweme.servicimpl;

import androidx.p025c.C0484a;
import com.bytedance.apm.p779k.C12534d;
import com.bytedance.apm.p779k.p780a.C12514a;
import com.bytedance.apm.p779k.p780a.C12515b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.performance.C62827a;
import com.p2082ss.android.ugc.aweme.performance.C62837c;
import com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.p2082ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.e */
public final class C67909e implements ICreativePerformanceMonitorService {

    /* renamed from: a */
    private final C0484a<String, C62827a> f152116a = new C0484a<>();

    /* renamed from: b */
    private final C0484a<String, C62837c> f152117b = new C0484a<>();

    static {
        Covode.recordClassIndex(80078);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final Map<String, Double> getCpuRate() {
        HashMap hashMap = new HashMap();
        C12514a a = C12534d.m22529a();
        hashMap.put("cpu_rate", Double.valueOf(a.f30393a));
        hashMap.put("cpu_speed", Double.valueOf(a.f30394b));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final Map<String, Long> getMemory() {
        HashMap hashMap = new HashMap();
        C12515b a = C12534d.m22530a(C17867d.m33078a());
        hashMap.put("mem_java_total", Long.valueOf(a.f30395a));
        hashMap.put("mem_java_free", Long.valueOf(a.f30396b));
        hashMap.put("mem_java_used", Long.valueOf(a.f30397c));
        hashMap.put("mem_pss_dalvik", Long.valueOf(a.f30398d));
        hashMap.put("mem_pss_native", Long.valueOf(a.f30399e));
        hashMap.put("mem_pss_total", Long.valueOf(a.f30400f));
        hashMap.put("mem_graphics", Long.valueOf(a.f30401g));
        hashMap.put("mem_vmsize", Long.valueOf(a.f30402h));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void stopBlockMonitor(String str) {
        C89219l.m154721d(str, "");
        C62827a aVar = this.f152116a.get(str);
        if (aVar != null) {
            aVar.mo100795b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void stopFpsMonitor(String str) {
        C89219l.m154721d(str, "");
        C62837c cVar = this.f152117b.get(str);
        if (cVar != null) {
            cVar.mo100803b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startFpsMonitor(String str, LagDataCallback lagDataCallback) {
        C89219l.m154721d(str, "");
        startFpsMonitor(str, -1, lagDataCallback);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startBlockMonitor(String str, int i, LagDataCallback lagDataCallback) {
        C89219l.m154721d(str, "");
        startBlockMonitor(str, i, -1, lagDataCallback);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startFpsMonitor(String str, long j, LagDataCallback lagDataCallback) {
        C89219l.m154721d(str, "");
        C62837c cVar = this.f152117b.get(str);
        if (cVar != null) {
            cVar.mo100802a(lagDataCallback);
            if (j == -1) {
                cVar.mo100800a();
            } else {
                cVar.mo100801a(j);
            }
        } else {
            C62837c cVar2 = new C62837c(str);
            this.f152117b.put(str, cVar2);
            cVar2.mo100802a(lagDataCallback);
            if (j == -1) {
                cVar2.mo100800a();
            } else {
                cVar2.mo100801a(j);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startBlockMonitor(String str, int i, long j, LagDataCallback lagDataCallback) {
        C89219l.m154721d(str, "");
        C62827a aVar = this.f152116a.get(str);
        if (aVar != null) {
            aVar.f142471f = i;
            aVar.mo100794a(lagDataCallback);
            if (j == -1) {
                aVar.mo100792a();
            } else {
                aVar.mo100793a(j);
            }
        } else {
            C62827a aVar2 = new C62827a(str);
            this.f152116a.put(str, aVar2);
            aVar2.mo100794a(lagDataCallback);
            if (j == -1) {
                aVar2.mo100792a();
            } else {
                aVar2.mo100793a(j);
            }
        }
    }
}
