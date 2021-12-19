package com.p2082ss.android.ugc.aweme.view.p4234f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.f.h */
final /* synthetic */ class C81281h extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181605a = new C81281h();

    static {
        Covode.recordClassIndex(94611);
    }

    C81281h() {
        super(ProfileNaviCreatorState.class, "isAnimationFileGenerated", "isAnimationFileGenerated()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviCreatorState) obj).isAnimationFileGenerated());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviCreatorState) obj).setAnimationFileGenerated(((Boolean) obj2).booleanValue());
    }
}
