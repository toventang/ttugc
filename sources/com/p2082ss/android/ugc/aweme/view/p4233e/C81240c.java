package com.p2082ss.android.ugc.aweme.view.p4233e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.viewModel.C81391a;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.view.e.c */
final /* synthetic */ class C81240c extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f181538a = new C81240c();

    static {
        Covode.recordClassIndex(94570);
    }

    C81240c() {
        super(ProfileNaviOnboardingState.class, "onboardingStepState", "getOnboardingStepState()Lcom/ss/android/ugc/aweme/viewModel/OnboardingStep;", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return ((ProfileNaviOnboardingState) obj).getOnboardingStepState();
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((ProfileNaviOnboardingState) obj).setOnboardingStepState((C81391a) obj2);
    }
}
