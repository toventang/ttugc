package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractC70516a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a.AbstractC71586a;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a.C71627r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.k */
public final class C71666k extends AbstractC71564a {

    /* renamed from: h */
    public static final C71667a f160565h = new C71667a((byte) 0);

    /* renamed from: i */
    private final String f160566i = "SingleClipAdjustBottomScene";

    /* renamed from: j */
    private final AbstractC89244h f160567j;

    static {
        Covode.recordClassIndex(84211);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71564a
    /* renamed from: E */
    public final int mo62771E() {
        return R.layout.d6;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.k$a */
    public static final class C71667a {
        static {
            Covode.recordClassIndex(84212);
        }

        private C71667a() {
        }

        public /* synthetic */ C71667a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71643d
    /* renamed from: a */
    public final String mo113345a() {
        return this.f160566i;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.k$b */
    static final class C71668b extends AbstractC89220m implements AbstractC89171a<C71627r> {

        /* renamed from: a */
        final /* synthetic */ C71666k f160568a;

        /* renamed from: b */
        final /* synthetic */ C21582f f160569b;

        static {
            Covode.recordClassIndex(84213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71668b(C71666k kVar, C21582f fVar) {
            super(0);
            this.f160568a = kVar;
            this.f160569b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C71627r invoke() {
            return new C71627r(this.f160569b, this.f160568a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71564a
    /* renamed from: P */
    public final void mo113327P() {
        super.mo113327P();
        View c = mo36475c(R.id.fbq);
        C89219l.m154716b(c, "");
        mo113329a((AbstractC70516a) c);
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71564a
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        mo113326O().mo113350d();
        ((AbstractC71586a) this.f160567j.getValue()).mo113331b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71666k(C21582f fVar, AbstractC22186b bVar) {
        super(fVar, bVar);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f160567j = C89250i.m154773a((AbstractC89171a) new C71668b(this, fVar));
    }
}
