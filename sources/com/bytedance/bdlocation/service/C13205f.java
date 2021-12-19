package com.bytedance.bdlocation.service;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bdlocation.AbstractC13160c;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bdlocation.p846a.C13156e;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14756f;

/* renamed from: com.bytedance.bdlocation.service.f */
public final class C13205f {

    /* renamed from: a */
    final AbstractC13160c f32268a;

    /* renamed from: b */
    public C13206a f32269b;

    /* renamed from: c */
    public Handler f32270c;

    /* renamed from: d */
    C13210j f32271d;

    /* renamed from: e */
    private Context f32272e;

    static {
        Covode.recordClassIndex(15154);
    }

    /* renamed from: a */
    public final void mo21331a(C13156e eVar) {
        this.f32270c.post(new RunnableC13207g(this, eVar));
    }

    /* renamed from: a */
    public final void mo21332a(boolean z) {
        this.f32270c.post(new RunnableC13208h(this, z));
    }

    /* renamed from: com.bytedance.bdlocation.service.f$a */
    public static class C13206a {

        /* renamed from: a */
        final C13156e f32273a;

        /* renamed from: b */
        final long f32274b;

        static {
            Covode.recordClassIndex(15155);
        }

        public C13206a(C13156e eVar, long j) {
            this.f32273a = eVar;
            this.f32274b = j;
        }
    }

    /* renamed from: b */
    private static boolean m23752b(C13156e eVar, C13156e eVar2) {
        if (eVar == eVar2) {
            return true;
        }
        if (eVar.f32088j == eVar2.f32088j && eVar.f32081c == eVar2.f32081c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C13156e m23751a(C13156e eVar, C13156e eVar2) {
        int i;
        if (m23752b(eVar, eVar2)) {
            C13162b.m23690d("BDLocation", "LocationScheduler:composeLocationOption equalsWithScheduleInfo true");
            return null;
        }
        C13162b.m23690d("BDLocation", "LocationScheduler:composeLocationOption equalsWithScheduleInfo false");
        C13156e eVar3 = new C13156e(eVar);
        if (eVar.f32081c > 0) {
            eVar3.f32081c = Math.min(eVar.f32081c, eVar2.f32081c);
        } else {
            eVar3.f32081c = eVar2.f32081c;
        }
        int i2 = 2;
        if (TextUtils.isEmpty(eVar2.f32085g)) {
            if (eVar.f32088j != eVar2.f32088j) {
                i = 2;
            } else {
                i = eVar.f32088j;
            }
            eVar3.f32088j = i;
        } else {
            eVar3.f32088j = eVar2.f32088j;
            eVar3.f32085g = eVar2.f32085g;
        }
        if (eVar.f32088j == eVar2.f32088j) {
            i2 = eVar.f32088j;
        }
        eVar3.f32088j = i2;
        eVar3.f32082d = Math.min(eVar.f32082d, eVar2.f32082d);
        eVar3.f32080b = Math.min(eVar.f32080b, eVar2.f32080b);
        return eVar3;
    }

    public C13205f(Context context, AbstractC13160c cVar, Looper looper) {
        this.f32268a = cVar;
        this.f32270c = new Handler(looper);
        this.f32272e = context;
        C13162b.m23687b("init LocationScheduler");
        PrivacyCert build = PrivacyCert.Builder.with("bpea-742").usage("").tag("request_location_within_sdk").policies(PrivacyPolicyStore.getLatitudeAndLongitudePrivacyPolicy()).build();
        if (C14756f.m27057b(context)) {
            this.f32270c.postDelayed(new RunnableC13209i(context, build), (long) C13153b.f32053l);
        }
    }
}
