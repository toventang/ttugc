package com.bytedance.bdlocation.service;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.p846a.C13149a;
import com.bytedance.bdlocation.p846a.C13156e;
import com.bytedance.bdlocation.p846a.C13157f;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.p854g.C13185a;
import com.bytedance.bdlocation.service.C13205f;
import com.bytedance.bdlocation.utils.C13227a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.bdlocation.service.b */
public final /* synthetic */ class RunnableC13200b implements Runnable {

    /* renamed from: a */
    private final C13190a f32242a;

    /* renamed from: b */
    private final C13156e f32243b;

    /* renamed from: c */
    private final C13149a.AbstractC13151a f32244c;

    /* renamed from: d */
    private final C13149a.AbstractC13152b f32245d = null;

    static {
        Covode.recordClassIndex(15149);
    }

    RunnableC13200b(C13190a aVar, C13156e eVar, C13149a.AbstractC13151a aVar2) {
        this.f32242a = aVar;
        this.f32243b = eVar;
        this.f32244c = aVar2;
    }

    public final void run() {
        C13190a aVar = this.f32242a;
        C13156e eVar = this.f32243b;
        C13149a.AbstractC13151a aVar2 = this.f32244c;
        C13149a.AbstractC13152b bVar = this.f32245d;
        boolean z = true;
        int[] iArr = new int[1];
        BDLocation b = aVar.mo21313b(eVar);
        StringBuilder sb = new StringBuilder("BDLocationUPTest getSuitableCache :::");
        if (b == null) {
            z = false;
        }
        C13162b.m23687b(sb.append(String.valueOf(z)).toString());
        if (b != null) {
            C13227a.f32333a.f32336d.execute(new Runnable(aVar2, b) {
                /* class com.bytedance.bdlocation.service.C13190a.RunnableC131966 */

                /* renamed from: a */
                final /* synthetic */ C13149a.AbstractC13151a f32227a;

                /* renamed from: b */
                final /* synthetic */ BDLocation f32228b;

                static {
                    Covode.recordClassIndex(15145);
                }

                public final void run() {
                    this.f32227a.mo21246a(this.f32228b);
                }

                {
                    this.f32227a = r2;
                    this.f32228b = r3;
                }
            });
            C13185a aVar3 = eVar.f32083e;
            aVar3.mo21289a(b);
            aVar3.mo21291b();
            iArr[0] = -1;
            return;
        }
        aVar.f32208c.f32270c.post(new Runnable(iArr, eVar, aVar2, bVar) {
            /* class com.bytedance.bdlocation.service.C13190a.RunnableC131977 */

            /* renamed from: a */
            final /* synthetic */ int[] f32230a;

            /* renamed from: b */
            final /* synthetic */ C13156e f32231b;

            /* renamed from: c */
            final /* synthetic */ C13149a.AbstractC13151a f32232c;

            /* renamed from: d */
            final /* synthetic */ C13149a.AbstractC13152b f32233d;

            static {
                Covode.recordClassIndex(15146);
            }

            public final void run() {
                C13205f.C13206a aVar = C13190a.this.f32208c.f32269b;
                if (aVar == null) {
                    C13162b.m23690d("BDLocation", "BDLocationService:StartLocation: state is ready");
                    this.f32230a[0] = C13190a.this.f32207b.mo21323a(new C13157f(this.f32231b, this.f32232c));
                    C13190a.this.f32208c.mo21331a(this.f32231b);
                    C13190a.m23732a(this.f32233d, this.f32230a[0]);
                    return;
                }
                C13162b.m23687b("BDLocationService:LocateState:option mode" + aVar.f32273a.f32088j);
                C13156e a = C13205f.m23751a(aVar.f32273a, this.f32231b);
                if (a != null) {
                    C13162b.m23687b("BDLocationService:StartLocation: state is running,newOption start");
                    this.f32230a[0] = C13190a.this.f32207b.mo21323a(new C13157f(this.f32231b, this.f32232c));
                    C13190a.this.f32208c.mo21331a(a);
                    C13190a.m23732a(this.f32233d, this.f32230a[0]);
                    return;
                }
                C13162b.m23687b("BDLocationService:StartLocation: state is running,connectManager insert callback");
                C13190a.this.f32207b.mo21324a(this.f32232c);
            }

            {
                this.f32230a = r2;
                this.f32231b = r3;
                this.f32232c = r4;
                this.f32233d = r5;
            }
        });
    }
}
