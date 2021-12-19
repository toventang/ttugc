package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.s */
final /* synthetic */ class C70728s extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f158324a = new C70728s();

    static {
        Covode.recordClassIndex(83199);
    }

    C70728s() {
        super(DuetLayoutModeState.class, "chosenPosition", "getChosenPosition()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((DuetLayoutModeState) obj).getChosenPosition());
    }
}
