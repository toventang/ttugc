package com.p2082ss.android.ugc.aweme.simkit.impl.p3910a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.a.b */
public final class C74621b implements AbstractC74605d {

    /* renamed from: a */
    private AbstractC74605d f167761a;

    static {
        Covode.recordClassIndex(87442);
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d
    /* renamed from: b */
    public final void mo117330b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.a.b$a */
    public static class C74622a {

        /* renamed from: a */
        public static final AbstractC74605d f167762a = new C74621b();

        static {
            Covode.recordClassIndex(87443);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d
    /* renamed from: a */
    public final void mo117329a() {
        AbstractC74605d dVar = this.f167761a;
        if (dVar != null) {
            dVar.mo117329a();
        }
    }

    public C74621b() {
        if (AbstractC74616d.m131036a().mo117290b().getCommonConfig().getSuperResolutionStrategyConfigV2() != null) {
            this.f167761a = new C74623c();
        } else if (AbstractC74616d.m131036a().mo117290b().getCommonConfig().getSuperResolutionStrategyConfig() != null) {
            this.f167761a = new C74620a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d
    /* renamed from: a */
    public final int mo117328a(String str, boolean z, long j, int i, String str2, float f) {
        AbstractC74605d dVar = this.f167761a;
        if (dVar == null) {
            return 1;
        }
        return dVar.mo117328a(str, z, j, i, str2, f);
    }
}
