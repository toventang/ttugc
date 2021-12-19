package com.p2082ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60118e;
import com.p2082ss.android.ugc.aweme.model.api.request.C60129a;
import com.p2082ss.android.ugc.aweme.model.api.request.C60136c;
import com.p2082ss.android.ugc.aweme.model.api.request.ProfileNaviDeleteRequest;
import com.p2082ss.android.ugc.aweme.model.api.request.ProfileNaviListRequest;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel */
public final class ProfileNaviHubViewModel extends BaseJediViewModel<ProfileNaviHubState> {
    static {
        Covode.recordClassIndex(94686);
    }

    /* renamed from: g */
    private final void m141065g() {
        mo33690d(C81361k.f181731a);
        mo33690d(C81362l.f181732a);
    }

    /* renamed from: b */
    public final void mo124877b() {
        mo33690d(C81351a.f181715a);
        mo33690d(C81352b.f181716a);
    }

    /* renamed from: a */
    public final void mo124873a() {
        ProfileNaviHubState profileNaviHubState = (ProfileNaviHubState) aB_();
        profileNaviHubState.setContinueEditing(false);
        profileNaviHubState.setDoneCreatingProfileImage(false);
        profileNaviHubState.setCreateProfileImage(false);
        profileNaviHubState.setDoneNaviExperience(false);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new ProfileNaviHubState(false, false, false, false, false, false, false, false, 255, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$f */
    public static final class C81356f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviHubViewModel f181721a;

        /* renamed from: b */
        final /* synthetic */ int f181722b;

        static {
            Covode.recordClassIndex(94692);
        }

        C81356f(ProfileNaviHubViewModel profileNaviHubViewModel, int i) {
            this.f181721a = profileNaviHubViewModel;
            this.f181722b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f181721a.mo124874a(this.f181722b + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$j */
    public static final class C81360j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviHubViewModel f181728a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f181729b;

        /* renamed from: c */
        final /* synthetic */ int f181730c;

        static {
            Covode.recordClassIndex(94696);
        }

        C81360j(ProfileNaviHubViewModel profileNaviHubViewModel, AbstractC89172b bVar, int i) {
            this.f181728a = profileNaviHubViewModel;
            this.f181729b = bVar;
            this.f181730c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f181728a.mo124875a(this.f181729b, this.f181730c + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$a */
    public static final class C81351a extends AbstractC89220m implements AbstractC89172b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a */
        public static final C81351a f181715a = new C81351a();

        static {
            Covode.recordClassIndex(94687);
        }

        C81351a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            C89219l.m154721d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, true, false, false, false, false, false, 251, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$b */
    public static final class C81352b extends AbstractC89220m implements AbstractC89172b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a */
        public static final C81352b f181716a = new C81352b();

        static {
            Covode.recordClassIndex(94688);
        }

        C81352b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            C89219l.m154721d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, false, false, 251, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$c */
    static final class C81353c extends AbstractC89220m implements AbstractC89172b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a */
        public static final C81353c f181717a = new C81353c();

        static {
            Covode.recordClassIndex(94689);
        }

        C81353c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            C89219l.m154721d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, true, false, false, 223, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$d */
    static final class C81354d extends AbstractC89220m implements AbstractC89172b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a */
        public static final C81354d f181718a = new C81354d();

        static {
            Covode.recordClassIndex(94690);
        }

        C81354d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            C89219l.m154721d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, false, false, 223, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$e */
    public static final class C81355e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviHubViewModel f181719a;

        /* renamed from: b */
        final /* synthetic */ int f181720b;

        static {
            Covode.recordClassIndex(94691);
        }

        C81355e(ProfileNaviHubViewModel profileNaviHubViewModel, int i) {
            this.f181719a = profileNaviHubViewModel;
            this.f181720b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            if (baseResponse != null && baseResponse.error_code != 0) {
                this.f181719a.mo124874a(this.f181720b + 1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$g */
    public static final class C81357g extends AbstractC89220m implements AbstractC89172b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a */
        public static final C81357g f181723a = new C81357g();

        static {
            Covode.recordClassIndex(94693);
        }

        C81357g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            C89219l.m154721d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, true, false, false, false, false, 247, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$h */
    public static final class C81358h extends AbstractC89220m implements AbstractC89172b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a */
        public static final C81358h f181724a = new C81358h();

        static {
            Covode.recordClassIndex(94694);
        }

        C81358h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            C89219l.m154721d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, false, false, 247, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$k */
    public static final class C81361k extends AbstractC89220m implements AbstractC89172b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a */
        public static final C81361k f181731a = new C81361k();

        static {
            Covode.recordClassIndex(94697);
        }

        C81361k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            C89219l.m154721d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, true, false, false, false, 239, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$l */
    public static final class C81362l extends AbstractC89220m implements AbstractC89172b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a */
        public static final C81362l f181732a = new C81362l();

        static {
            Covode.recordClassIndex(94698);
        }

        C81362l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            C89219l.m154721d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, false, false, 239, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$n */
    static final class C81364n extends AbstractC89220m implements AbstractC89172b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a */
        public static final C81364n f181734a = new C81364n();

        static {
            Covode.recordClassIndex(94700);
        }

        C81364n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            C89219l.m154721d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, true, false, 191, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$o */
    static final class C81365o extends AbstractC89220m implements AbstractC89172b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a */
        public static final C81365o f181735a = new C81365o();

        static {
            Covode.recordClassIndex(94701);
        }

        C81365o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            C89219l.m154721d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, false, false, 191, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$i */
    public static final class C81359i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviHubViewModel f181725a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f181726b;

        /* renamed from: c */
        final /* synthetic */ int f181727c;

        static {
            Covode.recordClassIndex(94695);
        }

        C81359i(ProfileNaviHubViewModel profileNaviHubViewModel, AbstractC89172b bVar, int i) {
            this.f181725a = profileNaviHubViewModel;
            this.f181726b = bVar;
            this.f181727c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C60118e eVar = (C60118e) obj;
            if (eVar == null) {
                return;
            }
            if (eVar.error_code == 0) {
                List<C60107b> list = eVar.f137037c;
                if (list == null || list.isEmpty()) {
                    this.f181726b.invoke(false);
                } else {
                    this.f181726b.invoke(true);
                }
            } else {
                this.f181725a.mo124875a(this.f181726b, this.f181727c + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel$m */
    public static final class C81363m extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviHubViewModel f181733a;

        static {
            Covode.recordClassIndex(94699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81363m(ProfileNaviHubViewModel profileNaviHubViewModel) {
            super(1);
            this.f181733a = profileNaviHubViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                ProfileNaviHubViewModel profileNaviHubViewModel = this.f181733a;
                profileNaviHubViewModel.mo33690d(C81364n.f181734a);
                profileNaviHubViewModel.mo33690d(C81365o.f181735a);
            } else {
                ProfileNaviHubViewModel profileNaviHubViewModel2 = this.f181733a;
                profileNaviHubViewModel2.mo33690d(C81353c.f181717a);
                profileNaviHubViewModel2.mo33690d(C81354d.f181718a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo124874a(int i) {
        String str;
        if (i < 3) {
            C60157q qVar = C60159r.f137138a;
            if (!(qVar == null || (str = qVar.f137132a) == null)) {
                ProfileNaviDeleteRequest.C60122a.m109594a(new C60129a.C60130a().mo97812a(str).mo97813a()).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C81355e(this, i), new C81356f(this, i));
            }
            m141065g();
        }
    }

    /* renamed from: a */
    public final void mo124876a(boolean z) {
        if (z) {
            mo124875a(new C81363m(this), 0);
        }
        ((ProfileNaviHubState) aB_()).setShouldShowSwitcher(z);
    }

    /* renamed from: a */
    public final void mo124875a(AbstractC89172b<? super Boolean, C89391z> bVar, int i) {
        if (i >= 3) {
            bVar.invoke(false);
        }
        C60136c.C60137a aVar = new C60136c.C60137a();
        aVar.f137078a = 0;
        ProfileNaviListRequest.C60126a.m109596a(aVar.mo97814a()).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C81359i(this, bVar, i), new C81360j(this, bVar, i));
    }
}
