package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ar */
final /* synthetic */ class C70214ar extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f156997a = new C70214ar();

    static {
        Covode.recordClassIndex(82657);
    }

    C70214ar() {
        super(CutVideoState.class, "nextEvent", "getNextEvent()Lcom/bytedance/jedi/arch/JediUnitEvent;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((CutVideoState) obj).getNextEvent();
    }
}
