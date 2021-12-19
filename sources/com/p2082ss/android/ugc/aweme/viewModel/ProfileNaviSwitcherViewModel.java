package com.p2082ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60118e;
import com.p2082ss.android.ugc.aweme.model.api.request.C60136c;
import com.p2082ss.android.ugc.aweme.model.api.request.ProfileNaviListRequest;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel */
public final class ProfileNaviSwitcherViewModel extends BaseJediViewModel<ProfileNaviSwitcherState> {
    static {
        Covode.recordClassIndex(94724);
    }

    /* renamed from: b */
    public final void mo124926b() {
        mo33690d(C81389g.f181776a);
        mo33690d(C81390h.f181777a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new ProfileNaviSwitcherState(null, false, false, false, false, 31, null);
    }

    /* renamed from: a */
    public final void mo124924a() {
        ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) aB_();
        profileNaviSwitcherState.getNaviList().clear();
        profileNaviSwitcherState.setHasMore(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel$d */
    public static final class C81386d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviSwitcherViewModel f181772a;

        /* renamed from: b */
        final /* synthetic */ int f181773b;

        static {
            Covode.recordClassIndex(94728);
        }

        C81386d(ProfileNaviSwitcherViewModel profileNaviSwitcherViewModel, int i) {
            this.f181772a = profileNaviSwitcherViewModel;
            this.f181773b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f181772a.mo124925a(this.f181773b + 1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel$a */
    public static final class C81383a extends AbstractC89220m implements AbstractC89172b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a */
        public static final C81383a f181768a = new C81383a();

        static {
            Covode.recordClassIndex(94725);
        }

        C81383a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            C89219l.m154721d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, false, false, true, 15, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel$b */
    public static final class C81384b extends AbstractC89220m implements AbstractC89172b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a */
        public static final C81384b f181769a = new C81384b();

        static {
            Covode.recordClassIndex(94726);
        }

        C81384b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            C89219l.m154721d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, false, false, false, 15, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel$e */
    public static final class C81387e extends AbstractC89220m implements AbstractC89172b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a */
        public static final C81387e f181774a = new C81387e();

        static {
            Covode.recordClassIndex(94729);
        }

        C81387e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            C89219l.m154721d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, false, true, false, 23, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel$f */
    public static final class C81388f extends AbstractC89220m implements AbstractC89172b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a */
        public static final C81388f f181775a = new C81388f();

        static {
            Covode.recordClassIndex(94730);
        }

        C81388f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            C89219l.m154721d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, false, false, false, 23, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel$g */
    public static final class C81389g extends AbstractC89220m implements AbstractC89172b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a */
        public static final C81389g f181776a = new C81389g();

        static {
            Covode.recordClassIndex(94731);
        }

        C81389g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            C89219l.m154721d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, true, false, false, 27, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel$h */
    public static final class C81390h extends AbstractC89220m implements AbstractC89172b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a */
        public static final C81390h f181777a = new C81390h();

        static {
            Covode.recordClassIndex(94732);
        }

        C81390h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            C89219l.m154721d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, false, false, false, 27, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel$c */
    public static final class C81385c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviSwitcherViewModel f181770a;

        /* renamed from: b */
        final /* synthetic */ int f181771b;

        static {
            Covode.recordClassIndex(94727);
        }

        C81385c(ProfileNaviSwitcherViewModel profileNaviSwitcherViewModel, int i) {
            this.f181770a = profileNaviSwitcherViewModel;
            this.f181771b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C60118e eVar = (C60118e) obj;
            if (eVar != null) {
                boolean z = true;
                if (eVar.error_code != 0) {
                    this.f181770a.mo124925a(this.f181771b + 1);
                } else if (eVar.f137037c != null) {
                    ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) this.f181770a.aB_();
                    profileNaviSwitcherState.getNaviList().addAll(eVar.f137037c);
                    if (eVar.f137036b != 1) {
                        z = false;
                    }
                    profileNaviSwitcherState.setHasMore(z);
                    this.f181770a.mo124926b();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo124925a(int i) {
        if (i < 3) {
            ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) aB_();
            if (profileNaviSwitcherState.getHasMore()) {
                C60136c.C60137a aVar = new C60136c.C60137a();
                aVar.f137078a = profileNaviSwitcherState.getNaviList().size();
                C89219l.m154716b(ProfileNaviListRequest.C60126a.m109596a(aVar.mo97814a()).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C81385c(this, i), new C81386d(this, i)), "");
                return;
            }
            mo124926b();
        }
    }
}
