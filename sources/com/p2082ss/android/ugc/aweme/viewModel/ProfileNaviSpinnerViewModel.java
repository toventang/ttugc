package com.p2082ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerViewModel */
public final class ProfileNaviSpinnerViewModel extends BaseJediViewModel<ProfileNaviSpinnerState> {
    static {
        Covode.recordClassIndex(94720);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new ProfileNaviSpinnerState(false, 1, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerViewModel$a */
    public static final class C81381a extends AbstractC89220m implements AbstractC89172b<ProfileNaviSpinnerState, ProfileNaviSpinnerState> {

        /* renamed from: a */
        public static final C81381a f181766a = new C81381a();

        static {
            Covode.recordClassIndex(94721);
        }

        C81381a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviSpinnerState invoke(ProfileNaviSpinnerState profileNaviSpinnerState) {
            ProfileNaviSpinnerState profileNaviSpinnerState2 = profileNaviSpinnerState;
            C89219l.m154721d(profileNaviSpinnerState2, "");
            return profileNaviSpinnerState2.copy(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerViewModel$b */
    public static final class C81382b extends AbstractC89220m implements AbstractC89172b<ProfileNaviSpinnerState, ProfileNaviSpinnerState> {

        /* renamed from: a */
        public static final C81382b f181767a = new C81382b();

        static {
            Covode.recordClassIndex(94722);
        }

        C81382b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviSpinnerState invoke(ProfileNaviSpinnerState profileNaviSpinnerState) {
            ProfileNaviSpinnerState profileNaviSpinnerState2 = profileNaviSpinnerState;
            C89219l.m154721d(profileNaviSpinnerState2, "");
            return profileNaviSpinnerState2.copy(true);
        }
    }
}
