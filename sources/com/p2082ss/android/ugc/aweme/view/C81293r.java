package com.p2082ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.r */
final /* synthetic */ class C81293r extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181617a = new C81293r();

    static {
        Covode.recordClassIndex(94623);
    }

    C81293r() {
        super(ProfileNaviSpinnerState.class, "shouldShowSpinner", "getShouldShowSpinner()Z", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileNaviSpinnerState) obj).getShouldShowSpinner());
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviSpinnerState) obj).setShouldShowSpinner(((Boolean) obj2).booleanValue());
    }
}
