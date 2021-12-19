package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z */
public final class RunnableC26540z implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f62574a;

    /* renamed from: b */
    private final /* synthetic */ long f62575b;

    /* renamed from: c */
    private final /* synthetic */ C26240a f62576c;

    static {
        Covode.recordClassIndex(31962);
    }

    public final void run() {
        C26240a aVar = this.f62576c;
        String str = this.f62574a;
        long j = this.f62575b;
        aVar.mo43002c();
        C25565r.m49316a(str);
        Integer num = aVar.f61679b.get(str);
        if (num != null) {
            C26443hn a = aVar.mo43007h().mo43371a(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                aVar.f61679b.remove(str);
                Long l = aVar.f61678a.get(str);
                if (l == null) {
                    aVar.mo43016q().f61827c.mo43169a("First ad unit exposure time was never set");
                } else {
                    aVar.f61678a.remove(str);
                    aVar.mo42998a(str, j - l.longValue(), a);
                }
                if (!aVar.f61679b.isEmpty()) {
                    return;
                }
                if (aVar.f61680c == 0) {
                    aVar.mo43016q().f61827c.mo43169a("First ad exposure time was never set");
                    return;
                }
                aVar.mo42996a(j - aVar.f61680c, a);
                aVar.f61680c = 0;
                return;
            }
            aVar.f61679b.put(str, Integer.valueOf(intValue));
            return;
        }
        aVar.mo43016q().f61827c.mo43170a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    RunnableC26540z(C26240a aVar, String str, long j) {
        this.f62576c = aVar;
        this.f62574a = str;
        this.f62575b = j;
    }
}
