package com.p2082ss.android.ugc.aweme.viewModel;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39168w;
import com.p2082ss.android.ugc.aweme.model.C60103a;
import com.p2082ss.android.ugc.aweme.model.C60140b;
import com.p2082ss.android.ugc.aweme.model.C60141c;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60114a;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60115b;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60117d;
import com.p2082ss.android.ugc.aweme.model.api.request.ProfileNaviCreateRequest;
import com.p2082ss.android.ugc.aweme.model.api.request.ProfileNaviEditRequest;
import com.p2082ss.android.ugc.aweme.model.api.request.ProfileNaviInfoRequest;
import com.p2082ss.android.ugc.aweme.profile.C63425ak;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.File;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel */
public final class ProfileNaviCreatorViewModel extends BaseJediViewModel<ProfileNaviCreatorState> {

    /* renamed from: a */
    public static final C81300a f181630a = new C81300a((byte) 0);

    /* renamed from: b */
    private final String f181631b = "NaviCreatorViewModel";

    static {
        Covode.recordClassIndex(94631);
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$a */
    public static final class C81300a {
        static {
            Covode.recordClassIndex(94632);
        }

        private C81300a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$a$a */
        public static final class C81301a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ File f181632a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89183m f181633b;

            static {
                Covode.recordClassIndex(94633);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C81301a(File file, AbstractC89183m mVar) {
                super(0);
                this.f181632a = file;
                this.f181633b = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C39168w.m79473a(this.f181632a, this.f181633b, 0);
                return C89391z.f203057a;
            }
        }

        public /* synthetic */ C81300a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m141044a(File file, AbstractC89183m<? super AvatarUri, ? super Boolean, C89391z> mVar) {
            C60140b.m109601a(new C60103a(new C81301a(file, mVar)));
        }
    }

    /* renamed from: b */
    public static File m141033b() {
        C60141c cVar = C60159r.f137139b;
        if (cVar != null) {
            return cVar.f137084b;
        }
        return null;
    }

    /* renamed from: i */
    public static void m141034i() {
        C60140b.m109601a(new C60103a(C81325y.f181666a));
    }

    /* renamed from: g */
    public final void mo124800g() {
        mo33690d(C81321u.f181660a);
        mo33690d(C81322v.f181661a);
    }

    /* renamed from: h */
    public final void mo124801h() {
        mo33690d(C81302b.f181634a);
        mo33690d(C81303c.f181635a);
    }

    /* renamed from: j */
    public final void mo124802j() {
        C60140b.m109601a(new C60103a(new C81316p(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$p */
    public static final class C81316p extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviCreatorViewModel f181655a;

        static {
            Covode.recordClassIndex(94648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81316p(ProfileNaviCreatorViewModel profileNaviCreatorViewModel) {
            super(0);
            this.f181655a = profileNaviCreatorViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C60157q qVar = C60159r.f137138a;
            if (qVar != null) {
                String str = qVar.f137132a;
                if (str == null || str.length() == 0) {
                    this.f181655a.mo124796a(0);
                } else {
                    this.f181655a.mo124799b(0);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo124795a() {
        ProfileNaviCreatorState profileNaviCreatorState = (ProfileNaviCreatorState) aB_();
        profileNaviCreatorState.setProfileImageBackgroundColor(null);
        profileNaviCreatorState.setAnimationFileGenerated(false);
        profileNaviCreatorState.setContinueEditing(false);
        profileNaviCreatorState.setShouldGenerateAnimation(false);
        profileNaviCreatorState.setShouldSetAsProfileImage(false);
        profileNaviCreatorState.setShouldShowSetProfileView(false);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new ProfileNaviCreatorState(null, false, false, false, false, false, false, false, null, 511, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$y */
    public static final class C81325y extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C81325y f181666a = new C81325y();

        static {
            Covode.recordClassIndex(94657);
        }

        C81325y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            UrlModel urlModel;
            UrlModel urlModel2;
            String str;
            C60141c cVar = C60159r.f137140c;
            if (!(cVar == null || (urlModel = cVar.f137083a) == null)) {
                C60141c cVar2 = C60159r.f137141d;
                if (cVar2 != null) {
                    urlModel2 = cVar2.f137083a;
                } else {
                    urlModel2 = null;
                }
                C63425ak akVar = new C63425ak();
                akVar.f143980d = urlModel.getUri();
                akVar.mo102038a(urlModel.getUri());
                C31575b.m65865g().updateCurAvatar(urlModel, urlModel, urlModel);
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                User curUser = g.getCurUser();
                C89219l.m154716b(curUser, "");
                curUser.setAvatarVideoUri(urlModel);
                if (urlModel2 != null) {
                    akVar.mo102038a(urlModel2.getUri());
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, "");
                    User curUser2 = g2.getCurUser();
                    C89219l.m154716b(curUser2, "");
                    curUser2.setAvatarVideoUri(urlModel2);
                }
                Map<String, String> a = akVar.mo102037a();
                C89219l.m154716b(a, "");
                a.put("page_from", "0");
                C60157q qVar = C60159r.f137138a;
                if (!(qVar == null || (str = qVar.f137132a) == null)) {
                    a.put("navi_id", str);
                }
                if (urlModel2 != null) {
                    a.put("video_icon", urlModel2.getUri());
                }
                C31575b.m65865g().updateUserInfo(new WeakHandler(C81326a.f181667a), a);
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$y$a */
        static final class C81326a implements WeakHandler.IHandler {

            /* renamed from: a */
            public static final C81326a f181667a = new C81326a();

            static {
                Covode.recordClassIndex(94658);
            }

            C81326a() {
            }

            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
                C60140b.m109604c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$e */
    public static final class C81305e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviCreatorViewModel f181638a;

        /* renamed from: b */
        final /* synthetic */ int f181639b;

        static {
            Covode.recordClassIndex(94637);
        }

        C81305e(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, int i) {
            this.f181638a = profileNaviCreatorViewModel;
            this.f181639b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f181638a.mo124796a(this.f181639b + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$i */
    public static final class C81309i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviCreatorViewModel f181645a;

        /* renamed from: b */
        final /* synthetic */ String f181646b;

        /* renamed from: c */
        final /* synthetic */ int f181647c;

        static {
            Covode.recordClassIndex(94641);
        }

        C81309i(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, String str, int i) {
            this.f181645a = profileNaviCreatorViewModel;
            this.f181646b = str;
            this.f181647c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f181645a.mo124798a(this.f181646b, this.f181647c + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$x */
    public static final class C81324x<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviCreatorViewModel f181664a;

        /* renamed from: b */
        final /* synthetic */ int f181665b;

        static {
            Covode.recordClassIndex(94656);
        }

        C81324x(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, int i) {
            this.f181664a = profileNaviCreatorViewModel;
            this.f181665b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f181664a.mo124799b(this.f181665b + 1);
            }
        }
    }

    /* renamed from: a */
    public final void mo124797a(String str) {
        C89219l.m154721d(str, "");
        mo33690d(new C81320t(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$b */
    public static final class C81302b extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81302b f181634a = new C81302b();

        static {
            Covode.recordClassIndex(94634);
        }

        C81302b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, true, null, 383, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$c */
    public static final class C81303c extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81303c f181635a = new C81303c();

        static {
            Covode.recordClassIndex(94635);
        }

        C81303c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 383, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$d */
    public static final class C81304d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviCreatorViewModel f181636a;

        /* renamed from: b */
        final /* synthetic */ int f181637b;

        static {
            Covode.recordClassIndex(94636);
        }

        C81304d(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, int i) {
            this.f181636a = profileNaviCreatorViewModel;
            this.f181637b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C60157q qVar;
            C60114a aVar = (C60114a) obj;
            if (aVar == null) {
                return;
            }
            if (aVar.error_code == 0) {
                String str = aVar.f137030a;
                if (!(str == null || (qVar = C60159r.f137138a) == null)) {
                    qVar.f137132a = str;
                }
                C60140b.m109604c();
                return;
            }
            this.f181636a.mo124796a(this.f181637b + 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$f */
    public static final class C81306f extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81306f f181640a = new C81306f();

        static {
            Covode.recordClassIndex(94638);
        }

        C81306f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, true, false, false, false, false, false, false, null, 509, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$g */
    public static final class C81307g extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81307g f181641a = new C81307g();

        static {
            Covode.recordClassIndex(94639);
        }

        C81307g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 509, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$j */
    public static final class C81310j extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81310j f181648a = new C81310j();

        static {
            Covode.recordClassIndex(94642);
        }

        C81310j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, true, false, false, false, false, false, null, 507, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$k */
    public static final class C81311k extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81311k f181649a = new C81311k();

        static {
            Covode.recordClassIndex(94643);
        }

        C81311k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 507, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$l */
    public static final class C81312l extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81312l f181650a = new C81312l();

        static {
            Covode.recordClassIndex(94644);
        }

        C81312l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, true, false, false, null, 479, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$m */
    public static final class C81313m extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81313m f181651a = new C81313m();

        static {
            Covode.recordClassIndex(94645);
        }

        C81313m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 479, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$n */
    public static final class C81314n extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81314n f181652a = new C81314n();

        static {
            Covode.recordClassIndex(94646);
        }

        C81314n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 479, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$r */
    public static final class C81318r extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81318r f181657a = new C81318r();

        static {
            Covode.recordClassIndex(94650);
        }

        C81318r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, true, false, null, 447, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$t */
    static final class C81320t extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        final /* synthetic */ String f181659a;

        static {
            Covode.recordClassIndex(94652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81320t(String str) {
            super(1);
            this.f181659a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, this.f181659a, false, false, false, false, false, false, false, null, 510, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$u */
    public static final class C81321u extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81321u f181660a = new C81321u();

        static {
            Covode.recordClassIndex(94653);
        }

        C81321u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, true, false, false, false, null, 495, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$v */
    public static final class C81322v extends AbstractC89220m implements AbstractC89172b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a */
        public static final C81322v f181661a = new C81322v();

        static {
            Covode.recordClassIndex(94654);
        }

        C81322v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            C89219l.m154721d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 495, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$w */
    public static final class C81323w<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviCreatorViewModel f181662a;

        /* renamed from: b */
        final /* synthetic */ int f181663b;

        static {
            Covode.recordClassIndex(94655);
        }

        C81323w(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, int i) {
            this.f181662a = profileNaviCreatorViewModel;
            this.f181663b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C60115b bVar = (C60115b) obj;
            if (bVar == null) {
                return;
            }
            if (bVar.error_code == 0) {
                C60140b.m109604c();
            } else {
                this.f181662a.mo124799b(this.f181663b + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$h */
    public static final class C81308h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileNaviCreatorViewModel f181642a;

        /* renamed from: b */
        final /* synthetic */ String f181643b;

        /* renamed from: c */
        final /* synthetic */ int f181644c;

        static {
            Covode.recordClassIndex(94640);
        }

        C81308h(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, String str, int i) {
            this.f181642a = profileNaviCreatorViewModel;
            this.f181643b = str;
            this.f181644c = i;
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
                    C60159r.m109649a(bVar);
                    this.f181642a.mo124800g();
                    return;
                }
                return;
            }
            this.f181642a.mo124798a(this.f181643b, this.f181644c + 1);
        }
    }

    /* renamed from: a */
    public final void mo124796a(int i) {
        if (i < 3) {
            if (i > 0) {
                C60140b.m109603b();
                return;
            }
            C60157q qVar = C60159r.f137138a;
            if (qVar != null) {
                String b = new C27910f().mo46674b(qVar.mo97831a());
                C89219l.m154716b(b, "");
                C89219l.m154721d(b, "");
                C89219l.m154716b(ProfileNaviCreateRequest.f137040a.createNavi(b).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C81304d(this, i), new C81305e(this, i)), "");
            }
        }
    }

    /* renamed from: b */
    public final void mo124799b(int i) {
        if (i < 3) {
            if (i > 0) {
                C60140b.m109603b();
                return;
            }
            C60157q qVar = C60159r.f137138a;
            if (qVar != null) {
                String b = new C27910f().mo46674b(qVar.mo97831a());
                C89219l.m154716b(b, "");
                C89219l.m154721d(b, "");
                C89219l.m154716b(ProfileNaviEditRequest.f137046a.editNavi(b).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C81323w(this, i), new C81324x(this, i)), "");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$q */
    public static final class C81317q extends AbstractC89220m implements AbstractC89183m<AvatarUri, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60157q f181656a;

        static {
            Covode.recordClassIndex(94649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81317q(C60157q qVar) {
            super(2);
            this.f181656a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AvatarUri avatarUri, Boolean bool) {
            AvatarUri avatarUri2 = avatarUri;
            if (bool.booleanValue() || avatarUri2 == null) {
                C60140b.m109603b();
            } else {
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(avatarUri2.urlList);
                urlModel.setUri(avatarUri2.uri);
                this.f181656a.f137136e = urlModel;
                C60141c cVar = C60159r.f137139b;
                if (cVar != null) {
                    cVar.f137083a = urlModel;
                }
                C60157q qVar = C60159r.f137138a;
                if (qVar != null) {
                    qVar.f137136e = urlModel;
                }
                C60140b.m109604c();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$s */
    public static final class C81319s extends AbstractC89220m implements AbstractC89183m<AvatarUri, Boolean, C89391z> {

        /* renamed from: a */
        public static final C81319s f181658a = new C81319s();

        static {
            Covode.recordClassIndex(94651);
        }

        C81319s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AvatarUri avatarUri, Boolean bool) {
            AvatarUri avatarUri2 = avatarUri;
            if (bool.booleanValue() || avatarUri2 == null) {
                C60140b.m109603b();
            } else {
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(avatarUri2.urlList);
                urlModel.setUri(avatarUri2.uri);
                C60141c cVar = C60159r.f137140c;
                if (cVar != null) {
                    cVar.f137083a = urlModel;
                }
                C60140b.m109604c();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo124798a(String str, int i) {
        C89219l.m154721d(str, "");
        if (i < 3) {
            ProfileNaviInfoRequest.C60125a.m109595a(str).mo142918b(C88925a.m154184d(C88946a.f201989a)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C81308h(this, str, i), new C81309i(this, str, i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$o */
    public static final class C81315o extends AbstractC89220m implements AbstractC89183m<AvatarUri, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UrlModel f181653a;

        /* renamed from: b */
        final /* synthetic */ C60157q f181654b;

        static {
            Covode.recordClassIndex(94647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81315o(UrlModel urlModel, C60157q qVar) {
            super(2);
            this.f181653a = urlModel;
            this.f181654b = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AvatarUri avatarUri, Boolean bool) {
            AvatarUri avatarUri2 = avatarUri;
            if (bool.booleanValue() || avatarUri2 == null) {
                C60140b.m109603b();
            } else {
                this.f181653a.setUrlList(avatarUri2.urlList);
                this.f181653a.setUri(avatarUri2.uri);
                this.f181654b.f137137f = this.f181653a;
                if (C60159r.f137138a != null) {
                    C60157q qVar = C60159r.f137138a;
                    if (qVar == null) {
                        C89219l.m154715b();
                    }
                    if (C89219l.m154714a((Object) qVar.f137132a, (Object) this.f181654b.f137132a)) {
                        C60141c cVar = C60159r.f137141d;
                        if (cVar != null) {
                            cVar.f137083a = this.f181653a;
                        }
                        C60157q qVar2 = C60159r.f137138a;
                        if (qVar2 != null) {
                            qVar2.f137137f = this.f181653a;
                        }
                    }
                }
                C60140b.m109604c();
            }
            return C89391z.f203057a;
        }
    }
}
