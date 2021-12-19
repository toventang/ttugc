package com.p2082ss.android.ugc.aweme.services;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.main.MainAnimViewModel;
import com.p2082ss.android.ugc.aweme.profile.p3570d.AbstractC63507a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl$mainAnimViewModel$1 */
public final class ProfileDependentComponentImpl$mainAnimViewModel$1 implements AbstractC63507a {
    final /* synthetic */ ActivityC0945e $activity;
    private final MainAnimViewModel mainAnimViewModel;

    static {
        Covode.recordClassIndex(79713);
    }

    public final MainAnimViewModel getMainAnimViewModel() {
        return this.mainAnimViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3570d.AbstractC63507a
    public final C1213t<Boolean> isUserProfileFragmentVisible2() {
        return this.mainAnimViewModel.f134236c;
    }

    /* renamed from: com_ss_android_ugc_aweme_services_ProfileDependentComponentImpl$mainAnimViewModel$1_androidx_lifecycle_VScopeLancet_of */
    public static C1175ad m120117x930014d3(ActivityC0945e eVar) {
        return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
    }

    ProfileDependentComponentImpl$mainAnimViewModel$1(ActivityC0945e eVar) {
        this.$activity = eVar;
        AbstractC1174ac a = m120117x930014d3(eVar).mo3983a(MainAnimViewModel.class);
        C89219l.m154716b(a, "");
        this.mainAnimViewModel = (MainAnimViewModel) a;
    }
}
