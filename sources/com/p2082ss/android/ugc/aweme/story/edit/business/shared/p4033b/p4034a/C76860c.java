package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4034a;

import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71027i;
import com.p2082ss.android.ugc.aweme.sticker.C75673r;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.a.c */
public final class C76860c extends AbstractC71027i {

    /* renamed from: a */
    public C75673r.AbstractC75674a f172490a;

    /* renamed from: b */
    public boolean f172491b = true;

    /* renamed from: c */
    public final AbstractC14552j f172492c;

    /* renamed from: d */
    private final AbstractC89244h f172493d = C89250i.m154773a((AbstractC89171a) new C76861a(this));

    static {
        Covode.recordClassIndex(89856);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71027i, com.bytedance.creativex.recorder.gesture.AbstractC14324b
    /* renamed from: a */
    public final boolean mo23105a() {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
    /* renamed from: a */
    public final boolean mo23109a(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
    /* renamed from: b */
    public final boolean mo23111b(float f) {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
    /* renamed from: c */
    public final boolean mo23112c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C76862d mo120469f() {
        return (C76862d) this.f172493d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC71027i
    /* renamed from: e */
    public final void mo112162e() {
        C75673r.AbstractC75674a aVar = this.f172490a;
        if (aVar != null) {
            aVar.mo119404a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.a.c$a */
    static final class C76861a extends AbstractC89220m implements AbstractC89171a<C76862d> {

        /* renamed from: a */
        final /* synthetic */ C76860c f172494a;

        static {
            Covode.recordClassIndex(89857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76861a(C76860c cVar) {
            super(0);
            this.f172494a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C76862d invoke() {
            C76860c cVar = this.f172494a;
            return new C76862d(cVar, cVar.f172492c.mo23382a());
        }
    }

    public C76860c(AbstractC14552j jVar) {
        C89219l.m154721d(jVar, "");
        this.f172492c = jVar;
    }
}
