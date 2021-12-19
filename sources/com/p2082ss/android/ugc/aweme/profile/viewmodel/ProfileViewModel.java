package com.p2082ss.android.ugc.aweme.profile.viewmodel;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel */
public final class ProfileViewModel extends JediViewModel<ProfileState> {

    /* renamed from: a */
    public static final C64397a f146011a = new C64397a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$a */
    public static final class C64397a {
        static {
            Covode.recordClassIndex(75857);
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$a$a */
        public static final class C64398a implements C1175ad.AbstractC1177b {
            static {
                Covode.recordClassIndex(75858);
            }

            C64398a() {
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                C89219l.m154721d(cls, "");
                return new ProfileViewModel();
            }
        }

        private C64397a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$a$b */
        public static final class C64399b extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

            /* renamed from: a */
            public static final C64399b f146012a = new C64399b();

            static {
                Covode.recordClassIndex(75859);
            }

            C64399b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
                C89219l.m154721d(profileState, "");
                return profileState;
            }
        }

        public /* synthetic */ C64397a(byte b) {
            this();
        }

        /* renamed from: a */
        public static ProfileViewModel m116300a(Fragment fragment) {
            C89219l.m154721d(fragment, "");
            AbstractC1174ac a = m116299a(C1181ae.m3879a(fragment, new C64398a()), ProfileViewModel.class.getName(), ProfileViewModel.class);
            C89219l.m154716b(a, "");
            ProfileViewModel profileViewModel = (ProfileViewModel) a;
            profileViewModel.mo33686a_(C64399b.f146012a);
            return profileViewModel;
        }

        /* renamed from: a */
        private static AbstractC1174ac m116299a(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    static {
        Covode.recordClassIndex(75856);
    }

    /* renamed from: a */
    public final void mo104027a() {
        mo33689c(new C64409k());
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ ProfileState mo23027d() {
        return new ProfileState(null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, null, null, 33554431, null);
    }

    /* renamed from: b */
    public final void mo104031b(List<? extends Aweme> list) {
        mo33689c(new C64410l(list));
    }

    /* renamed from: c */
    public final void mo104033c(boolean z) {
        mo33689c(new C64408j(z));
    }

    /* renamed from: d */
    public final void mo104034d(boolean z) {
        mo33689c(new C64406h(z));
    }

    /* renamed from: a */
    public final void mo104028a(User user) {
        C89219l.m154721d(user, "");
        mo33689c(new C64412n(user));
    }

    /* renamed from: b */
    public final void mo104032b(boolean z) {
        mo33689c(new C64405g(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$b */
    public static final class C64400b extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ int f146013a;

        static {
            Covode.recordClassIndex(75860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64400b(int i) {
            super(1);
            this.f146013a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, this.f146013a, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, null, null, 33554367, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$c */
    public static final class C64401c extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ int f146014a;

        static {
            Covode.recordClassIndex(75861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64401c(int i) {
            super(1);
            this.f146014a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, Integer.valueOf(this.f146014a), null, null, 29360127, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$d */
    public static final class C64402d extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ int f146015a;

        static {
            Covode.recordClassIndex(75862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64402d(int i) {
            super(1);
            this.f146015a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, Integer.valueOf(this.f146015a), false, null, null, null, null, 33030143, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$e */
    public static final class C64403e extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ String f146016a;

        static {
            Covode.recordClassIndex(75863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64403e(String str) {
            super(1);
            this.f146016a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, this.f146016a, null, null, null, null, false, false, false, null, false, null, null, null, null, 33552383, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$f */
    public static final class C64404f extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ String f146017a;

        static {
            Covode.recordClassIndex(75864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64404f(String str) {
            super(1);
            this.f146017a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, this.f146017a, null, null, null, null, null, false, false, false, null, false, null, null, null, null, 33553407, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$g */
    static final class C64405g extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f146018a;

        static {
            Covode.recordClassIndex(75865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64405g(boolean z) {
            super(1);
            this.f146018a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, Boolean.valueOf(this.f146018a), null, false, false, false, null, false, null, null, null, null, 33538047, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$h */
    public static final class C64406h extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f146019a;

        static {
            Covode.recordClassIndex(75866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64406h(boolean z) {
            super(1);
            this.f146019a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, this.f146019a, null, null, null, null, 32505855, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$i */
    static final class C64407i extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f146020a;

        static {
            Covode.recordClassIndex(75867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64407i(boolean z) {
            super(1);
            this.f146020a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, Boolean.valueOf(this.f146020a), null, null, false, false, false, null, false, null, null, null, null, 33546239, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$j */
    static final class C64408j extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f146021a;

        static {
            Covode.recordClassIndex(75868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64408j(boolean z) {
            super(1);
            this.f146021a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, Boolean.valueOf(this.f146021a), false, false, false, null, false, null, null, null, null, 33521663, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$k */
    public static final class C64409k extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ boolean f146022a = false;

        static {
            Covode.recordClassIndex(75869);
        }

        C64409k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, Boolean.valueOf(this.f146022a), null, null, null, false, false, false, null, false, null, null, null, null, 33550335, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$l */
    public static final class C64410l extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ List f146023a;

        static {
            Covode.recordClassIndex(75870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64410l(List list) {
            super(1);
            this.f146023a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, null, this.f146023a, 16777215, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$m */
    public static final class C64411m extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ List f146024a;

        static {
            Covode.recordClassIndex(75871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64411m(List list) {
            super(1);
            this.f146024a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, this.f146024a, null, 25165823, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$n */
    public static final class C64412n extends AbstractC89220m implements AbstractC89172b<ProfileState, ProfileState> {

        /* renamed from: a */
        final /* synthetic */ User f146025a;

        static {
            Covode.recordClassIndex(75872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64412n(User user) {
            super(1);
            this.f146025a = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            C89219l.m154721d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, this.f146025a, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, null, null, 33554427, null);
        }
    }

    /* renamed from: a */
    public final void mo104029a(List<? extends Aweme> list) {
        mo33689c(new C64411m(list));
    }

    /* renamed from: a */
    public final void mo104030a(boolean z) {
        mo33689c(new C64407i(z));
    }
}
