package com.p2082ss.android.ugc.aweme.shortvideo.p3885v;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC71893j;
import com.p2082ss.android.ugc.aweme.shortvideo.AbstractC74304x;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.j */
public final class C74093j extends AbstractC74052a {

    /* renamed from: h */
    private volatile boolean f166343h;

    /* renamed from: i */
    private volatile boolean f166344i;

    /* renamed from: j */
    private volatile boolean f166345j;

    /* renamed from: k */
    private volatile boolean f166346k;

    /* renamed from: l */
    private volatile C65616g f166347l;

    /* renamed from: m */
    private volatile C65616g f166348m;

    static {
        Covode.recordClassIndex(86845);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    public final String toString() {
        return "ShoutOutSyncSynthesisPublisher";
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: e */
    public final void mo116442e() {
        mo116432a();
        mo116436b();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: f */
    public final void mo116444f() {
        this.f166343h = true;
        mo116432a();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: g */
    public final synchronized void mo116446g() {
        MethodCollector.m26663i(7222);
        this.f166344i = true;
        mo116436b();
        if (this.f166343h) {
            mo116438c();
        }
        MethodCollector.m26664o(7222);
    }

    /* renamed from: l */
    private final void m130293l() {
        String str;
        if (this.f166343h && this.f166346k && this.f166344i) {
            C65616g gVar = new C65616g();
            gVar.f147920i = "";
            C65616g gVar2 = this.f166347l;
            if (gVar2 != null) {
                str = gVar2.f147919h;
            } else {
                str = null;
            }
            gVar.f147919h = str;
            mo116439c(gVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: d */
    public final void mo116441d(C65616g gVar) {
        if (this.f166343h) {
            mo116437b(gVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: e */
    public final void mo116443e(C65616g gVar) {
        this.f166345j = true;
        this.f166348m = gVar;
        m130293l();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3885v.AbstractC74052a
    /* renamed from: f */
    public final void mo116445f(C65616g gVar) {
        this.f166346k = true;
        this.f166347l = gVar;
        m130293l();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74093j(AbstractC71893j jVar, int i, int i2, int i3, String str, boolean z, AbstractC74304x<C69831ai> xVar) {
        super(jVar, i, i2, i3, str, z, xVar);
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(xVar, "");
    }
}
