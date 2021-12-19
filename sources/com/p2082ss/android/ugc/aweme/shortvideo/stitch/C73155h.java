package com.p2082ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.h */
final /* synthetic */ class C73155h extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f164262a = new C73155h();

    static {
        Covode.recordClassIndex(85869);
    }

    C73155h() {
        super(CutVideoState.class, "quitEvent", "getQuitEvent()Lcom/bytedance/jedi/arch/JediUnitEvent;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((CutVideoState) obj).getQuitEvent();
    }
}
