package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.ba */
public final class RunnableC26268ba implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f61707a;

    /* renamed from: b */
    private final /* synthetic */ long f61708b;

    /* renamed from: c */
    private final /* synthetic */ C26240a f61709c;

    static {
        Covode.recordClassIndex(31690);
    }

    public final void run() {
        C26240a aVar = this.f61709c;
        String str = this.f61707a;
        long j = this.f61708b;
        aVar.mo43002c();
        C25565r.m49316a(str);
        if (aVar.f61679b.isEmpty()) {
            aVar.f61680c = j;
        }
        Integer num = aVar.f61679b.get(str);
        if (num != null) {
            aVar.f61679b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (aVar.f61679b.size() >= 100) {
            aVar.mo43016q().f61830f.mo43169a("Too many ads visible");
        } else {
            aVar.f61679b.put(str, 1);
            aVar.f61678a.put(str, Long.valueOf(j));
        }
    }

    RunnableC26268ba(C26240a aVar, String str, long j) {
        this.f61709c = aVar;
        this.f61707a = str;
        this.f61708b = j;
    }
}
