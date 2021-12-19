package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.C78596f;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import java.lang.reflect.Type;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bc */
final /* synthetic */ class C69853bc implements AbstractC88983w {

    /* renamed from: a */
    private final C69844av f156100a;

    /* renamed from: b */
    private final C78596f f156101b;

    static {
        Covode.recordClassIndex(82261);
    }

    C69853bc(C69844av avVar, C78596f fVar) {
        this.f156100a = avVar;
        this.f156101b = fVar;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C69844av avVar = this.f156100a;
        if (this.f156101b.f176642d > 0) {
            ((AbstractC84089j) avVar.f156082h.getDiContainer().mo35249a((Type) AbstractC84089j.class, (String) null)).mo23133o();
        }
        vVar.mo143031a(new Object());
        vVar.mo143023a();
    }
}
