package com.bytedance.bdlocation.service;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.p846a.C13149a;
import com.bytedance.bdlocation.p846a.C13154c;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.p854g.C13185a;
import com.bytedance.bdlocation.service.C13201c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.bdlocation.service.e */
public final /* synthetic */ class RunnableC13204e implements Runnable {

    /* renamed from: a */
    private final C13201c.RunnableC13202a f32265a;

    /* renamed from: b */
    private final BDLocation f32266b;

    /* renamed from: c */
    private final C13154c f32267c;

    static {
        Covode.recordClassIndex(15153);
    }

    RunnableC13204e(C13201c.RunnableC13202a aVar, BDLocation bDLocation, C13154c cVar) {
        this.f32265a = aVar;
        this.f32266b = bDLocation;
        this.f32267c = cVar;
    }

    public final void run() {
        C13154c cVar;
        C13201c.RunnableC13202a aVar = this.f32265a;
        BDLocation bDLocation = this.f32266b;
        C13154c cVar2 = this.f32267c;
        int i = 0;
        if (bDLocation != null) {
            bDLocation.f32005Q = cVar2;
            if (aVar.f32257a.size() > 0) {
                try {
                    if (aVar.f32257a.size() > 0) {
                        while (i < aVar.f32257a.size()) {
                            C13149a.AbstractC13151a aVar2 = aVar.f32257a.get(i);
                            if (aVar2 != null) {
                                aVar2.mo21246a(bDLocation);
                            }
                            i++;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            C13162b.m23685a("BDLocation", "Client onError", null);
            try {
                if (aVar.f32257a.size() > 0) {
                    while (i < aVar.f32257a.size()) {
                        C13149a.AbstractC13151a aVar3 = aVar.f32257a.get(i);
                        if (aVar3 != null) {
                            C13185a aVar4 = aVar.f32258b.f32083e;
                            if (!aVar4.f32194d.isEmpty()) {
                                cVar = new C13154c(new ArrayList(aVar4.f32194d));
                            } else {
                                cVar = aVar4.f32193c;
                            }
                            aVar3.mo21247a(cVar);
                        }
                        i++;
                    }
                }
            } catch (Exception unused2) {
            }
            aVar.f32258b.f32083e.f32194d.clear();
        }
    }
}
