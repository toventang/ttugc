package com.p2082ss.android.ugc.aweme.view.customView;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.view.customView.f */
public final /* synthetic */ class C81214f extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181500a = new C81214f();

    static {
        Covode.recordClassIndex(94544);
    }

    C81214f() {
        super(ProfileNaviSwitcherState.class, "hasNaviChanged", "getHasNaviChanged()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviSwitcherState) obj).getHasNaviChanged());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviSwitcherState) obj).setHasNaviChanged(((Boolean) obj2).booleanValue());
    }
}
