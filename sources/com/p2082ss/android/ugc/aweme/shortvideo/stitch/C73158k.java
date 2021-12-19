package com.p2082ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.k */
final /* synthetic */ class C73158k extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f164265a = new C73158k();

    static {
        Covode.recordClassIndex(85872);
    }

    C73158k() {
        super(CutVideoState.class, "nextEvent", "getNextEvent()Lcom/bytedance/jedi/arch/JediUnitEvent;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((CutVideoState) obj).getNextEvent();
    }
}
