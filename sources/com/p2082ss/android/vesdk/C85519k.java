package com.p2082ss.android.vesdk;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85521l;
import com.p2082ss.android.vesdk.audio.AbstractC85331a;
import com.p2082ss.android.vesdk.audio.AbstractC85333c;
import com.p2082ss.android.vesdk.audio.AbstractC85334d;
import com.p2082ss.android.vesdk.audio.AbstractC85340h;
import com.p2082ss.android.vesdk.audio.C85335e;
import com.p2082ss.android.vesdk.audio.C85341i;
import com.p2082ss.android.vesdk.audio.C85342j;

/* renamed from: com.ss.android.vesdk.k */
public final class C85519k implements AbstractC85331a {

    /* renamed from: a */
    C85297a<AbstractC85340h> f191571a = new C85297a<>();

    /* renamed from: b */
    public AbstractC85333c f191572b = null;

    /* renamed from: c */
    private C85335e f191573c;

    static {
        Covode.recordClassIndex(99679);
    }

    /* renamed from: a */
    public final void mo131425a() {
        this.f191573c.f191029b = true;
    }

    /* renamed from: b */
    public final void mo131428b() {
        this.f191573c.f191029b = false;
    }

    public C85519k() {
        C85335e eVar = new C85335e();
        this.f191573c = eVar;
        eVar.f191032e = new AbstractC85334d() {
            /* class com.p2082ss.android.vesdk.C85519k.C855201 */

            static {
                Covode.recordClassIndex(99680);
            }

            @Override // com.p2082ss.android.vesdk.audio.AbstractC85334d
            /* renamed from: a */
            public final void mo130667a(C85342j jVar) {
                for (AbstractC85340h hVar : C85519k.this.f191571a.mo130623c()) {
                    hVar.onReceive(jVar);
                }
            }

            @Override // com.p2082ss.android.vesdk.audio.AbstractC85334d
            /* renamed from: a */
            public final void mo130666a(int i, int i2, String str) {
                for (AbstractC85340h hVar : C85519k.this.f191571a.mo130623c()) {
                    hVar.onError(i, i2, str);
                }
            }

            @Override // com.p2082ss.android.vesdk.audio.AbstractC85334d
            /* renamed from: a */
            public final void mo130665a(int i, int i2, double d, Object obj) {
                for (AbstractC85340h hVar : C85519k.this.f191571a.mo130623c()) {
                    hVar.onInfo(i, i2, d, obj);
                }
            }
        };
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public final void release(PrivacyCert privacyCert) {
        this.f191573c.release(privacyCert);
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public final int start(PrivacyCert privacyCert) {
        return this.f191573c.start(privacyCert);
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public final int stop(PrivacyCert privacyCert) {
        return this.f191573c.stop(privacyCert);
    }

    /* renamed from: a */
    public final void mo131426a(C85341i iVar) {
        if (iVar != null) {
            this.f191573c.f191038k = iVar;
        }
    }

    /* renamed from: b */
    public final boolean mo131429b(AbstractC85340h hVar) {
        return this.f191571a.mo130622b(hVar);
    }

    /* renamed from: a */
    public final boolean mo131427a(AbstractC85340h hVar) {
        return this.f191571a.mo130620a(hVar);
    }

    @Override // com.p2082ss.android.vesdk.audio.AbstractC85331a
    public final int init(C85521l lVar) {
        C85521l.C85522a aVar = new C85521l.C85522a(lVar);
        aVar.f191584a.f191578d = ((Integer) C85568t.m147473a().mo131557a("ve_audio_source_type", (Object) 1)).intValue();
        return this.f191573c.init(aVar.f191584a);
    }
}
