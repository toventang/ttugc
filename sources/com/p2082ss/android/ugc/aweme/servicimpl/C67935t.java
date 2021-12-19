package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27242j;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import p4560f.p4561a.AbstractC88982v;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.t */
final /* synthetic */ class C67935t implements C70612k.AbstractC70613a {

    /* renamed from: a */
    private final ShortVideoContext f152182a;

    /* renamed from: b */
    private final AbstractC88982v f152183b;

    static {
        Covode.recordClassIndex(80104);
    }

    C67935t(ShortVideoContext shortVideoContext, AbstractC88982v vVar) {
        this.f152182a = shortVideoContext;
        this.f152183b = vVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k.AbstractC70613a
    /* renamed from: a */
    public final void mo87581a(C70625d dVar) {
        ShortVideoContext shortVideoContext = this.f152182a;
        AbstractC88982v vVar = this.f152183b;
        shortVideoContext.f155811au = dVar;
        vVar.mo143031a(AbstractC27242j.fromNullable(dVar));
        vVar.mo143023a();
    }
}
