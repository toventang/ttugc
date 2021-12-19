package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.p3832a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70230aw;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71643d;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.q */
public final class C71625q extends C70230aw implements AbstractC71643d {

    /* renamed from: i */
    public static final C71626a f160489i = new C71626a((byte) 0);

    /* renamed from: j */
    private final String f160490j = "EditCutVideoSpeedScene";

    /* renamed from: k */
    private final C21582f f160491k;

    /* renamed from: l */
    private final AbstractC22186b f160492l;

    /* renamed from: t */
    private final int f160493t = R.id.b4f;

    static {
        Covode.recordClassIndex(84170);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70230aw
    /* renamed from: b */
    public final void mo110865b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a.q$a */
    public static final class C71626a {
        static {
            Covode.recordClassIndex(84171);
        }

        private C71626a() {
        }

        public /* synthetic */ C71626a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3831b.AbstractC71643d
    /* renamed from: a */
    public final String mo113345a() {
        return this.f160490j;
    }

    /* renamed from: C */
    public final void mo113349C() {
        if (this.f160492l.mo36422g(this)) {
            this.f160492l.mo36400c(this);
        }
    }

    /* renamed from: d */
    public final void mo113350d() {
        if (!this.f160492l.mo36421f(this)) {
            this.f160492l.mo36387a(this.f160493t, this, this.f160490j);
        }
        if (!this.f160492l.mo36422g(this)) {
            this.f160492l.mo36417e(this);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j, com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70230aw
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        mo110863a((CutMultiVideoViewModel) this.f160491k.mo35249a((Type) CutMultiVideoViewModel.class, (String) null));
        mo110864a((CutVideoSpeedViewModel) this.f160491k.mo35249a((Type) CutVideoSpeedViewModel.class, (String) null));
    }

    public C71625q(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f160491k = fVar;
        this.f160492l = bVar;
    }
}
