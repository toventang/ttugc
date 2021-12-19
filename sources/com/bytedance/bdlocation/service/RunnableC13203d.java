package com.bytedance.bdlocation.service;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.p846a.C13149a;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.service.C13201c;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.bdlocation.service.d */
public final /* synthetic */ class RunnableC13203d implements Runnable {

    /* renamed from: a */
    private final C13201c.RunnableC13202a f32263a;

    /* renamed from: b */
    private final BDLocation f32264b;

    static {
        Covode.recordClassIndex(15152);
    }

    RunnableC13203d(C13201c.RunnableC13202a aVar, BDLocation bDLocation) {
        this.f32263a = aVar;
        this.f32264b = bDLocation;
    }

    public final void run() {
        C13201c.RunnableC13202a aVar = this.f32263a;
        BDLocation bDLocation = this.f32264b;
        C13162b.m23690d("BDLocation", "Client onLocationChanged");
        try {
            if (aVar.f32257a.size() > 0) {
                for (int i = 0; i < aVar.f32257a.size(); i++) {
                    C13149a.AbstractC13151a aVar2 = aVar.f32257a.get(i);
                    if (aVar2 != null) {
                        aVar2.mo21246a(bDLocation);
                    }
                }
            }
            C13201c.this.mo21326b();
        } catch (Exception unused) {
        }
        C13201c.this.mo21326b();
    }
}
