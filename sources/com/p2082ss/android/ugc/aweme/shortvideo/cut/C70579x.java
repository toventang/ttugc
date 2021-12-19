package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEListener;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.x */
public final class C70579x implements AbstractC70078j {

    /* renamed from: a */
    public final AbstractC89171a<VEEditorAutoStartStopArbiter> f157917a;

    /* renamed from: b */
    private final AbstractC89244h f157918b = C89250i.m154773a((AbstractC89171a) new C70580a(this));

    /* renamed from: c */
    private final AbstractC31071f f157919c;

    static {
        Covode.recordClassIndex(83043);
    }

    /* renamed from: e */
    private final VEEditorAutoStartStopArbiter m124667e() {
        return (VEEditorAutoStartStopArbiter) this.f157918b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j
    /* renamed from: a */
    public final long mo110548a() {
        return (long) this.f157919c.mo56370k();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j
    /* renamed from: c */
    public final long mo110553c() {
        return (long) this.f157919c.mo56368j();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.x$a */
    static final class C70580a extends AbstractC89220m implements AbstractC89171a<VEEditorAutoStartStopArbiter> {

        /* renamed from: a */
        final /* synthetic */ C70579x f157920a;

        static {
            Covode.recordClassIndex(83044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70580a(C70579x xVar) {
            super(0);
            this.f157920a = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ VEEditorAutoStartStopArbiter invoke() {
            return this.f157920a.f157917a.invoke();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j
    /* renamed from: b */
    public final boolean mo110551b() {
        if (this.f157919c.mo56356f() == C85581w.EnumC85611j.STARTED) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j
    /* renamed from: d */
    public final boolean mo110556d() {
        return m124667e().f200066a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j
    /* renamed from: d */
    public final void mo110555d(boolean z) {
        m124667e().f200067b = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j
    /* renamed from: c */
    public final void mo110554c(boolean z) {
        m124667e().f200066a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j
    /* renamed from: b */
    public final boolean mo110552b(boolean z) {
        if (z) {
            m124667e().mo142667a(true, false);
        } else {
            m124667e().mo142665a();
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j
    /* renamed from: a */
    public final boolean mo110550a(boolean z) {
        if (z) {
            m124667e().mo142667a(false, false);
            return true;
        }
        m124667e().mo142668b();
        return true;
    }

    public C70579x(AbstractC31071f fVar, AbstractC89171a<VEEditorAutoStartStopArbiter> aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        this.f157919c = fVar;
        this.f157917a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70078j
    /* renamed from: a */
    public final boolean mo110549a(long j, C85581w.EnumC85607f fVar, VEListener.AbstractC85250s sVar) {
        C89219l.m154721d(fVar, "");
        if (this.f157919c.mo56266a((int) j, fVar, sVar) == 0) {
            return true;
        }
        return false;
    }
}
