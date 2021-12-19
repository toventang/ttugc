package com.p2082ss.android.ugc.aweme.viewModel;

import android.content.SharedPreferences;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.model.C60161t;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60108c;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60112f;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60113g;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60117d;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60119f;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60120g;
import com.p2082ss.android.ugc.aweme.model.api.request.ProfileNaviInfoRequest;
import com.p2082ss.android.ugc.aweme.model.api.request.ProfileNaviStarterAvatarListRequest;
import com.p2082ss.android.ugc.aweme.model.api.request.ProfileNaviStarterAvatarRequest;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel */
public final class ProfileNaviOnboardingViewModel extends BaseJediViewModel<ProfileNaviOnboardingState> {

    /* renamed from: d */
    public static final String f181736d = "profile_navi_onboarding_tutorial_shown";

    /* renamed from: e */
    public static final C81366a f181737e = new C81366a((byte) 0);

    /* renamed from: a */
    public final long f181738a = 1500;

    /* renamed from: b */
    public Handler f181739b = new Handler();

    /* renamed from: c */
    public SharedPreferences f181740c;

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$a */
    public static final class C81366a {
        static {
            Covode.recordClassIndex(94704);
        }

        private C81366a() {
        }

        public /* synthetic */ C81366a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo124891a() {
        ((ProfileNaviOnboardingState) aB_()).setStarterAvatarSelected(null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new ProfileNaviOnboardingState(null, null, null, 7, null);
    }

    @Override // androidx.lifecycle.AbstractC1174ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        this.f181739b.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$h */
    public static final class RunnableC81375h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviOnboardingViewModel f181756a;

        static {
            Covode.recordClassIndex(94713);
        }

        public RunnableC81375h(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel) {
            this.f181756a = profileNaviOnboardingViewModel;
        }

        public final void run() {
            this.f181756a.mo33689c(C813761.f181757a);
            this.f181756a.f181739b.postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel.RunnableC81375h.RunnableC813772 */

                /* renamed from: a */
                final /* synthetic */ RunnableC81375h f181758a;

                static {
                    Covode.recordClassIndex(94715);
                }

                {
                    this.f181758a = r1;
                }

                public final void run() {
                    this.f181758a.f181756a.mo124895b();
                }
            }, this.f181756a.f181738a);
        }
    }

    static {
        Covode.recordClassIndex(94703);
    }

    /* renamed from: b */
    public final void mo124895b() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        mo33689c(C81373f.f181754a);
        SharedPreferences sharedPreferences = this.f181740c;
        if (!(sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putBoolean = edit.putBoolean(f181736d, true)) == null)) {
            putBoolean.apply();
        }
        mo124892a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$c */
    public static final class C81369c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviOnboardingViewModel f181745a;

        /* renamed from: b */
        final /* synthetic */ String f181746b;

        /* renamed from: c */
        final /* synthetic */ int f181747c;

        static {
            Covode.recordClassIndex(94707);
        }

        C81369c(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, String str, int i) {
            this.f181745a = profileNaviOnboardingViewModel;
            this.f181746b = str;
            this.f181747c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f181745a.mo124894a(this.f181746b, this.f181747c + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$e */
    public static final class C81372e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviOnboardingViewModel f181752a;

        /* renamed from: b */
        final /* synthetic */ int f181753b;

        static {
            Covode.recordClassIndex(94710);
        }

        C81372e(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, int i) {
            this.f181752a = profileNaviOnboardingViewModel;
            this.f181753b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f181752a.mo124892a(this.f181753b + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$j */
    public static final class C81380j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviOnboardingViewModel f181763a;

        /* renamed from: b */
        final /* synthetic */ C60161t f181764b;

        /* renamed from: c */
        final /* synthetic */ int f181765c;

        static {
            Covode.recordClassIndex(94718);
        }

        C81380j(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, C60161t tVar, int i) {
            this.f181763a = profileNaviOnboardingViewModel;
            this.f181764b = tVar;
            this.f181765c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f181763a.mo124893a(this.f181764b, this.f181765c + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$b */
    public static final class C81367b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviOnboardingViewModel f181741a;

        /* renamed from: b */
        final /* synthetic */ String f181742b;

        /* renamed from: c */
        final /* synthetic */ int f181743c;

        static {
            Covode.recordClassIndex(94705);
        }

        C81367b(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, String str, int i) {
            this.f181741a = profileNaviOnboardingViewModel;
            this.f181742b = str;
            this.f181743c = i;
        }

        /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$b$a */
        static final class C81368a extends AbstractC89220m implements AbstractC89172b<ProfileNaviOnboardingState, ProfileNaviOnboardingState> {

            /* renamed from: a */
            final /* synthetic */ C60107b f181744a;

            static {
                Covode.recordClassIndex(94706);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C81368a(C60107b bVar) {
                super(1);
                this.f181744a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ ProfileNaviOnboardingState invoke(ProfileNaviOnboardingState profileNaviOnboardingState) {
                ProfileNaviOnboardingState profileNaviOnboardingState2 = profileNaviOnboardingState;
                C89219l.m154721d(profileNaviOnboardingState2, "");
                return ProfileNaviOnboardingState.copy$default(profileNaviOnboardingState2, null, null, this.f181744a, 3, null);
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C60117d dVar = (C60117d) obj;
            if (dVar == null) {
                return;
            }
            if (dVar.error_code == 0) {
                C60107b bVar = dVar.f137034a;
                if (bVar != null) {
                    this.f181741a.mo33690d(new C81368a(bVar));
                    return;
                }
                return;
            }
            this.f181741a.mo124894a(this.f181742b, this.f181743c + 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$d */
    public static final class C81370d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviOnboardingViewModel f181748a;

        /* renamed from: b */
        final /* synthetic */ int f181749b;

        static {
            Covode.recordClassIndex(94708);
        }

        C81370d(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, int i) {
            this.f181748a = profileNaviOnboardingViewModel;
            this.f181749b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C60119f fVar = (C60119f) obj;
            if (fVar == null) {
                return;
            }
            if (fVar.error_code == 0) {
                this.f181748a.mo33690d(new C81371a(this, fVar));
            } else {
                this.f181748a.mo124892a(this.f181749b + 1);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$d$a */
        static final class C81371a extends AbstractC89220m implements AbstractC89172b<ProfileNaviOnboardingState, ProfileNaviOnboardingState> {

            /* renamed from: a */
            final /* synthetic */ C81370d f181750a;

            /* renamed from: b */
            final /* synthetic */ C60119f f181751b;

            static {
                Covode.recordClassIndex(94709);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C81371a(C81370d dVar, C60119f fVar) {
                super(1);
                this.f181750a = dVar;
                this.f181751b = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ ProfileNaviOnboardingState invoke(ProfileNaviOnboardingState profileNaviOnboardingState) {
                C60113g image;
                UrlModel thumbnailUrl;
                List<String> urlList;
                ProfileNaviOnboardingState profileNaviOnboardingState2 = profileNaviOnboardingState;
                C89219l.m154721d(profileNaviOnboardingState2, "");
                C60119f fVar = this.f181751b;
                C89219l.m154721d(fVar, "");
                ArrayList arrayList = new ArrayList();
                List<C60112f> list = fVar.f137038a;
                if (list != null) {
                    for (C60112f fVar2 : list) {
                        String id = fVar2.getId();
                        if (!(id == null || id.length() == 0 || (image = fVar2.getImage()) == null || (thumbnailUrl = image.getThumbnailUrl()) == null || (urlList = thumbnailUrl.getUrlList()) == null || urlList.size() <= 0)) {
                            String id2 = fVar2.getId();
                            if (id2 == null) {
                                C89219l.m154715b();
                            }
                            String str = urlList.get(0);
                            C89219l.m154716b(str, "");
                            arrayList.add(new C60161t(id2, str));
                        }
                    }
                }
                return ProfileNaviOnboardingState.copy$default(profileNaviOnboardingState2, null, arrayList, null, 5, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$f */
    public static final class C81373f extends AbstractC89220m implements AbstractC89172b<ProfileNaviOnboardingState, ProfileNaviOnboardingState> {

        /* renamed from: a */
        public static final C81373f f181754a = new C81373f();

        static {
            Covode.recordClassIndex(94711);
        }

        C81373f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviOnboardingState invoke(ProfileNaviOnboardingState profileNaviOnboardingState) {
            ProfileNaviOnboardingState profileNaviOnboardingState2 = profileNaviOnboardingState;
            C89219l.m154721d(profileNaviOnboardingState2, "");
            return ProfileNaviOnboardingState.copy$default(profileNaviOnboardingState2, new C81391a(EnumC81392b.DEFAULT, 2), null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$g */
    public static final class C81374g extends AbstractC89220m implements AbstractC89172b<ProfileNaviOnboardingState, ProfileNaviOnboardingState> {

        /* renamed from: a */
        public static final C81374g f181755a = new C81374g();

        static {
            Covode.recordClassIndex(94712);
        }

        C81374g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviOnboardingState invoke(ProfileNaviOnboardingState profileNaviOnboardingState) {
            ProfileNaviOnboardingState profileNaviOnboardingState2 = profileNaviOnboardingState;
            C89219l.m154721d(profileNaviOnboardingState2, "");
            return ProfileNaviOnboardingState.copy$default(profileNaviOnboardingState2, new C81391a(EnumC81392b.TUTORIAL_1, 2), null, null, 6, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$i */
    public static final class C81378i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviOnboardingViewModel f181759a;

        /* renamed from: b */
        final /* synthetic */ C60161t f181760b;

        /* renamed from: c */
        final /* synthetic */ int f181761c;

        static {
            Covode.recordClassIndex(94716);
        }

        C81378i(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, C60161t tVar, int i) {
            this.f181759a = profileNaviOnboardingViewModel;
            this.f181760b = tVar;
            this.f181761c = i;
        }

        /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel$i$a */
        static final class C81379a extends AbstractC89220m implements AbstractC89172b<ProfileNaviOnboardingState, ProfileNaviOnboardingState> {

            /* renamed from: a */
            final /* synthetic */ List f181762a;

            static {
                Covode.recordClassIndex(94717);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C81379a(List list) {
                super(1);
                this.f181762a = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ ProfileNaviOnboardingState invoke(ProfileNaviOnboardingState profileNaviOnboardingState) {
                ProfileNaviOnboardingState profileNaviOnboardingState2 = profileNaviOnboardingState;
                C89219l.m154721d(profileNaviOnboardingState2, "");
                return ProfileNaviOnboardingState.copy$default(profileNaviOnboardingState2, null, null, new C60107b(null, null, null, null, this.f181762a, null, 47, null), 3, null);
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C60120g gVar = (C60120g) obj;
            if (gVar == null) {
                return;
            }
            if (gVar.error_code == 0) {
                List<C60108c> list = gVar.f137039a;
                if (list != null) {
                    this.f181759a.mo33690d(new C81379a(list));
                    return;
                }
                return;
            }
            this.f181759a.mo124893a(this.f181760b, this.f181761c + 1);
        }
    }

    /* renamed from: a */
    public final void mo124892a(int i) {
        if (i < 3) {
            ProfileNaviStarterAvatarListRequest.f137058a.getStarterAvatar().mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C81370d(this, i), new C81372e(this, i));
        }
    }

    /* renamed from: a */
    public final void mo124893a(C60161t tVar, int i) {
        C89219l.m154721d(tVar, "");
        if (i < 3) {
            ProfileNaviStarterAvatarRequest.C60128a.m109597a(tVar.mo97835a()).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C81378i(this, tVar, i), new C81380j(this, tVar, i));
        }
    }

    /* renamed from: a */
    public final void mo124894a(String str, int i) {
        C89219l.m154721d(str, "");
        if (i < 3) {
            ProfileNaviInfoRequest.C60125a.m109595a(str).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C81367b(this, str, i), new C81369c(this, str, i));
        }
    }
}
