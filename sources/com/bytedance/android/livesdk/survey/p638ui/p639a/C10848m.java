package com.bytedance.android.livesdk.survey.p638ui.p639a;

import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.a.m */
public final class C10848m extends AbstractC10836f {
    static {
        Covode.recordClassIndex(12450);
    }

    public C10848m() {
        super((byte) 0);
    }

    @Override // com.bytedance.android.livesdk.survey.p638ui.p639a.AbstractC10836f
    /* renamed from: a */
    public final void mo17734a() {
        this.f26067d.mo142945a(C6779a.m14563a().mo13052a(C8454g.class).mo143289d(new C10849a(this)));
    }

    /* renamed from: com.bytedance.android.livesdk.survey.ui.a.m$a */
    static final class C10849a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10848m f26080a;

        static {
            Covode.recordClassIndex(12451);
        }

        C10849a(C10848m mVar) {
            this.f26080a = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C8454g gVar = (C8454g) obj;
            C89219l.m154716b(gVar, "");
            this.f26080a.mo17739a(gVar.f20901a.get(1));
        }
    }
}
