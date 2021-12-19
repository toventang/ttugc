package com.p2082ss.android.ugc.aweme.view.p4231c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.c.d */
final /* synthetic */ class C81196d extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181405a = new C81196d();

    static {
        Covode.recordClassIndex(94524);
    }

    C81196d() {
        super(ProfileNaviSwitcherState.class, "hasListBeenUpdated", "getHasListBeenUpdated()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviSwitcherState) obj).getHasListBeenUpdated());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviSwitcherState) obj).setHasListBeenUpdated(((Boolean) obj2).booleanValue());
    }
}
