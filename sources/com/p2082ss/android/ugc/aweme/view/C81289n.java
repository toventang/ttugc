package com.p2082ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.n */
final /* synthetic */ class C81289n extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181613a = new C81289n();

    static {
        Covode.recordClassIndex(94619);
    }

    C81289n() {
        super(ProfileNaviHubState.class, "isDoneNaviExperience", "isDoneNaviExperience()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviHubState) obj).isDoneNaviExperience());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviHubState) obj).setDoneNaviExperience(((Boolean) obj2).booleanValue());
    }
}
