package com.p2082ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.l */
final /* synthetic */ class C81287l extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181611a = new C81287l();

    static {
        Covode.recordClassIndex(94617);
    }

    C81287l() {
        super(ProfileNaviCreatorState.class, "isBackPressed", "isBackPressed()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviCreatorState) obj).isBackPressed());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviCreatorState) obj).setBackPressed(((Boolean) obj2).booleanValue());
    }
}
