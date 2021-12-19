package com.p2082ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.h */
final /* synthetic */ class C81283h extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181607a = new C81283h();

    static {
        Covode.recordClassIndex(94613);
    }

    C81283h() {
        super(ProfileNaviOnboardingState.class, "starterAvatarSelected", "getStarterAvatarSelected()Lcom/ss/android/ugc/aweme/model/api/data/ProfileNaviDataModel;", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((ProfileNaviOnboardingState) obj).getStarterAvatarSelected();
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviOnboardingState) obj).setStarterAvatarSelected((C60107b) obj2);
    }
}
