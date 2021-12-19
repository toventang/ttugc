package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.C78596f;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import java.lang.reflect.Type;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.q */
final /* synthetic */ class C67932q implements AbstractC88983w {

    /* renamed from: a */
    private final C67925j f152178a;

    /* renamed from: b */
    private final C78596f f152179b;

    static {
        Covode.recordClassIndex(80101);
    }

    C67932q(C67925j jVar, C78596f fVar) {
        this.f152178a = jVar;
        this.f152179b = fVar;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C67925j jVar = this.f152178a;
        if (this.f152179b.f176642d > 0) {
            ((AbstractC84089j) jVar.f152160h.getDiContainer().mo35249a((Type) AbstractC84089j.class, (String) null)).mo23133o();
        }
        vVar.mo143031a(new Object());
        vVar.mo143023a();
    }
}
