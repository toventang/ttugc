package com.p2082ss.android.ugc.aweme.user.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20372aj;
import com.bytedance.jedi.arch.C20379aq;
import com.bytedance.jedi.arch.C20466f;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.p1445a.p1448c.C20169f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C63973ae;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.aweme.userservice.api.IUserService;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel */
public final class UserViewModel extends JediViewModel<UserState> {

    /* renamed from: a */
    public final String f179462a = "follow_user";

    /* renamed from: b */
    public final String f179463b = "unfollow_user";

    static {
        Covode.recordClassIndex(93318);
    }

    /* renamed from: a */
    public final void mo123555a() {
        mo33689c(C80097e.f179472a);
    }

    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$d */
    public static final class C80091d extends AbstractC89220m implements AbstractC89183m<UserState, AbstractC20362a<? extends BaseResponse>, UserState> {

        /* renamed from: a */
        public static final C80091d f179470a = new C80091d();

        static {
            Covode.recordClassIndex(93324);
        }

        C80091d() {
            super(2);
        }

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$d$a */
        static final /* synthetic */ class C80093a extends C89217j implements AbstractC89171a<Integer> {
            static {
                Covode.recordClassIndex(93326);
            }

            C80093a(User user) {
                super(0, user, User.class, "getFansCount", "getFansCount()I", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(((User) this.receiver).getFansCount());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$d$c */
        static final /* synthetic */ class C80095c extends C89217j implements AbstractC89171a<Integer> {
            static {
                Covode.recordClassIndex(93328);
            }

            C80095c(User user) {
                super(0, user, User.class, "getFollowerCount", "getFollowerCount()I", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(((User) this.receiver).getFollowerCount());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$d$b */
        static final /* synthetic */ class C80094b extends C89217j implements AbstractC89172b<Integer, C89391z> {
            static {
                Covode.recordClassIndex(93327);
            }

            C80094b(User user) {
                super(1, user, User.class, "setFansCount", "setFansCount(I)V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Integer num) {
                ((User) this.receiver).setFansCount(num.intValue());
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$d$d */
        static final /* synthetic */ class C80096d extends C89217j implements AbstractC89172b<Integer, C89391z> {
            static {
                Covode.recordClassIndex(93329);
            }

            C80096d(User user) {
                super(1, user, User.class, "setFollowerCount", "setFollowerCount(I)V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Integer num) {
                ((User) this.receiver).setFollowerCount(num.intValue());
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ UserState invoke(UserState userState, AbstractC20362a<? extends BaseResponse> aVar) {
            UserState userState2 = userState;
            AbstractC20362a<? extends BaseResponse> aVar2 = aVar;
            C89219l.m154721d(userState2, "");
            C89219l.m154721d(aVar2, "");
            if (aVar2 instanceof C20372aj) {
                Object a = aVar2.mo33695a();
                if (a == null) {
                    C89219l.m154715b();
                }
                if (((BaseResponse) a).status_code == 0) {
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    User curUser = g.getCurUser();
                    C800921 r2 = C800921.f179471a;
                    if (C63973ae.m115689a(curUser)) {
                        r2.invoke(new C80093a(curUser), new C80094b(curUser));
                    } else {
                        r2.invoke(new C80095c(curUser), new C80096d(curUser));
                    }
                    return UserState.copy$default(userState2, null, true, null, null, null, 29, null);
                }
            }
            if (aVar2 instanceof C20466f) {
                return UserState.copy$default(userState2, null, false, null, null, ((C20466f) aVar2).f48408a, 15, null);
            }
            return userState2;
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ UserState mo23027d() {
        return new UserState(null, false, null, null, null, 31, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bk_() {
        super.bk_();
        mo33687b_(new C80088c(this));
        mo33680a(mo33683a(C80098a.f179473a, new C20370ah(), C80087b.f179466a));
    }

    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$b */
    static final class C80087b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        public static final C80087b f179466a = new C80087b();

        static {
            Covode.recordClassIndex(93320);
        }

        C80087b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            if (th2 instanceof C34485a) {
                C33615a.m68846a(C17867d.m33078a(), (C34485a) th2);
            } else if (th2 != null) {
                C51423a.m95790a(th2);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$e */
    public static final class C80097e extends AbstractC89220m implements AbstractC89172b<UserState, UserState> {

        /* renamed from: a */
        public static final C80097e f179472a = new C80097e();

        static {
            Covode.recordClassIndex(93330);
        }

        C80097e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ UserState invoke(UserState userState) {
            UserState userState2 = userState;
            C89219l.m154721d(userState2, "");
            return UserState.copy$default(userState2, null, false, C20379aq.f48273a, null, null, 27, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c */
    static final class C80088c extends AbstractC89220m implements AbstractC89172b<UserState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UserViewModel f179467a;

        static {
            Covode.recordClassIndex(93321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80088c(UserViewModel userViewModel) {
            super(1);
            this.f179467a = userViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(UserState userState) {
            UserState userState2 = userState;
            C89219l.m154721d(userState2, "");
            String uid = userState2.getUser().getUid();
            if (uid == null || uid.length() == 0) {
                C51423a.m95784a(6, "UserViewModel", "Uid is unexpected null or empty when observer user change.");
            } else {
                UserViewModel userViewModel = this.f179467a;
                IUserService d = UserService.m138861d();
                String uid2 = userState2.getUser().getUid();
                C89219l.m154716b(uid2, "");
                AbstractC88412b d2 = d.mo123564a(uid2).mo143289d(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.user.repository.UserViewModel.C80088c.C800891 */

                    /* renamed from: a */
                    final /* synthetic */ C80088c f179468a;

                    static {
                        Covode.recordClassIndex(93322);
                    }

                    {
                        this.f179468a = r1;
                    }

                    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c$1$a */
                    static final class C80090a extends AbstractC89220m implements AbstractC89172b<UserState, UserState> {

                        /* renamed from: a */
                        final /* synthetic */ User f179469a;

                        static {
                            Covode.recordClassIndex(93323);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C80090a(User user) {
                            super(1);
                            this.f179469a = user;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ UserState invoke(UserState userState) {
                            UserState userState2 = userState;
                            C89219l.m154721d(userState2, "");
                            return UserState.copy$default(userState2, this.f179469a, false, null, null, null, 30, null);
                        }
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        User user = (User) ((C20169f) obj).mo33486a();
                        if (user != null) {
                            this.f179468a.f179467a.mo33689c(new C80090a(user));
                        }
                    }
                });
                C89219l.m154716b(d2, "");
                userViewModel.mo33680a(d2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo123556a(C63847n nVar) {
        C89219l.m154721d(nVar, "");
        mo33679a(UserService.m138861d().mo123563a(nVar.f144765a, nVar.f144766b, nVar.f144767c, C33721c.m69041a(nVar.f144770f), nVar.f144768d, nVar.f144771g, nVar.f144769e), new C80086a(this, nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$a */
    public static final class C80086a extends AbstractC89220m implements AbstractC89183m<UserState, AbstractC20362a<? extends FollowStatus>, UserState> {

        /* renamed from: a */
        final /* synthetic */ UserViewModel f179464a;

        /* renamed from: b */
        final /* synthetic */ C63847n f179465b;

        static {
            Covode.recordClassIndex(93319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80086a(UserViewModel userViewModel, C63847n nVar) {
            super(2);
            this.f179464a = userViewModel;
            this.f179465b = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ UserState invoke(UserState userState, AbstractC20362a<? extends FollowStatus> aVar) {
            UserState userState2 = userState;
            AbstractC20362a<? extends FollowStatus> aVar2 = aVar;
            C89219l.m154721d(userState2, "");
            C89219l.m154721d(aVar2, "");
            if (aVar2 instanceof C20372aj) {
                User clone = userState2.getUser().clone();
                C89219l.m154716b(clone, "");
                clone.setFollowStatus(((C20372aj) aVar2).f48256a.followStatus);
                C89219l.m154716b(clone, "");
                return UserState.copy$default(userState2, clone, false, aVar2, null, null, 26, null);
            }
            if (aVar2 instanceof C20466f) {
                Throwable th = ((C20466f) aVar2).f48408a;
                if (th instanceof C34485a) {
                    if (this.f179465b.f144767c == 0) {
                        RuntimeBehaviorServiceImpl.m94812c().mo85866a(this.f179464a.f179463b, String.valueOf(((C34480a) th).getErrorCode()));
                    } else if (this.f179465b.f144767c == 0) {
                        RuntimeBehaviorServiceImpl.m94812c().mo85866a(this.f179464a.f179462a, String.valueOf(((C34480a) th).getErrorCode()));
                    }
                }
            }
            return UserState.copy$default(userState2, null, false, aVar2, null, null, 27, null);
        }
    }

    /* renamed from: a */
    public static void m138853a(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (i == 0) {
            C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", str).mo59983a("to_user_id", str2).f79943a);
        } else {
            C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", str).mo59983a("to_user_id", str2).f79943a);
        }
    }
}
