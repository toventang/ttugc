package com.p2082ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.q */
final /* synthetic */ class C81292q extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181616a = new C81292q();

    static {
        Covode.recordClassIndex(94622);
    }

    C81292q() {
        super(ProfileNaviHubState.class, "isNaviDeleted", "isNaviDeleted()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviHubState) obj).isNaviDeleted());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviHubState) obj).setNaviDeleted(((Boolean) obj2).booleanValue());
    }
}
