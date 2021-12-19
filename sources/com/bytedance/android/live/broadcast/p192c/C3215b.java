package com.bytedance.android.live.broadcast.p192c;

import com.bytedance.android.live.broadcast.EnumC3338p;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.c.b */
public final class C3215b extends AbstractC3185a {

    /* renamed from: e */
    private C11672a f9244e;

    /* renamed from: f */
    private C11672a f9245f;

    static {
        Covode.recordClassIndex(3696);
    }

    /* renamed from: d */
    private void m8701d() {
        C4217d.m10321d().mo9846a("beauty", this.f9245f);
        m8699a("FaceDistortionEyeIntensity", this.f9195b);
        m8699a("FaceDistortionCheekIntensity", this.f9196c);
    }

    public C3215b() {
        mo8567b();
        mo8568c();
        mo8531a(AbstractC6804a.f16888Q.mo13066a().floatValue());
        mo8534c(AbstractC6804a.f16890S.mo13066a().floatValue());
        mo8533b(AbstractC6804a.f16889R.mo13066a().floatValue());
    }

    /* renamed from: b */
    public final C11672a mo8567b() {
        if (this.f9244e == null) {
            C11672a aVar = new C11672a();
            this.f9244e = aVar;
            aVar.f27893a = 1111;
            this.f9244e.f27908p.addAll(Arrays.asList("", "smooth/frag/smoothIntensity", "smooth/frag/brightenIntensity"));
            this.f9244e.mo18444c(EnumC3338p.INST.getBeautyComposerFilePath());
        }
        return this.f9244e;
    }

    /* renamed from: c */
    public final C11672a mo8568c() {
        if (this.f9245f == null) {
            C11672a aVar = new C11672a();
            this.f9245f = aVar;
            aVar.f27893a = 1112;
            this.f9245f.f27908p.addAll(Arrays.asList("FaceDistortionCheekIntensity", "FaceDistortionEyeIntensity"));
            this.f9245f.mo18444c(EnumC3338p.INST.getReshapeComposerFilePath());
        }
        return this.f9245f;
    }

    @Override // com.bytedance.android.live.broadcast.p192c.AbstractC3185a
    /* renamed from: e */
    public final void mo8536e(float f) {
        if (!m8700a(C4217d.m10321d().mo9847b("beauty"), this.f9245f)) {
            m8701d();
        } else {
            m8699a("FaceDistortionEyeIntensity", f);
        }
    }

    @Override // com.bytedance.android.live.broadcast.p192c.AbstractC3185a
    /* renamed from: f */
    public final void mo8537f(float f) {
        if (!m8700a(C4217d.m10321d().mo9847b("beauty"), this.f9245f)) {
            m8701d();
        } else {
            m8699a("FaceDistortionCheekIntensity", f);
        }
    }

    @Override // com.bytedance.android.live.broadcast.p192c.AbstractC3185a
    /* renamed from: d */
    public final void mo8535d(float f) {
        if (!m8700a(C4217d.m10321d().mo9847b("beauty"), this.f9244e)) {
            C4217d.m10321d().mo9846a("beauty", this.f9244e);
            m8699a("smooth/frag/smoothIntensity", this.f9194a);
            return;
        }
        m8699a("smooth/frag/smoothIntensity", f);
    }

    /* renamed from: a */
    private static void m8699a(String str, float f) {
        C4217d.m10321d().mo9857a(str, f);
    }

    /* renamed from: a */
    private static boolean m8700a(List<C11672a> list, C11672a aVar) {
        for (C11672a aVar2 : list) {
            if (C13627m.m24499a(aVar2.f27899g, aVar.f27899g)) {
                return true;
            }
        }
        return false;
    }
}
