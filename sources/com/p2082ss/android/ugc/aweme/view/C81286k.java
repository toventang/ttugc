package com.p2082ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.k */
final /* synthetic */ class C81286k extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181610a = new C81286k();

    static {
        Covode.recordClassIndex(94616);
    }

    C81286k() {
        super(ProfileNaviCreatorState.class, "isDoneCreatingProfileImage", "isDoneCreatingProfileImage()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviCreatorState) obj).isDoneCreatingProfileImage());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviCreatorState) obj).setDoneCreatingProfileImage(((Boolean) obj2).booleanValue());
    }
}
