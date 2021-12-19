package com.p2082ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12785h;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.extensions.C12791m;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C63973ae;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64207ac;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM */
public final class UserProfileFollowVM extends AssemViewModel<C64766o> {

    /* renamed from: k */
    public static final C64689b f146423k = new C64689b((byte) 0);

    /* renamed from: j */
    public final AbstractC12644a<AbstractC64763m> f146424j;

    /* renamed from: l */
    private final C12786i f146425l = new C12786i(true, new C64688a(this, null));

    static {
        Covode.recordClassIndex(76154);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C64871b mo23342g() {
        return (C64871b) this.f146425l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$b */
    public static final class C64689b {
        static {
            Covode.recordClassIndex(76156);
        }

        private C64689b() {
        }

        public /* synthetic */ C64689b(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C64766o mo20674f() {
        return new C64766o();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$k */
    static final class C64703k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UserProfileFollowVM f146447a;

        static {
            Covode.recordClassIndex(76170);
        }

        C64703k(UserProfileFollowVM userProfileFollowVM) {
            this.f146447a = userProfileFollowVM;
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$k$a */
        static final /* synthetic */ class C64706a extends C89217j implements AbstractC89171a<Integer> {
            static {
                Covode.recordClassIndex(76173);
            }

            C64706a(User user) {
                super(0, user, User.class, "getFansCount", "getFansCount()I", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(((User) this.receiver).getFansCount());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$k$c */
        static final /* synthetic */ class C64708c extends C89217j implements AbstractC89171a<Integer> {
            static {
                Covode.recordClassIndex(76175);
            }

            C64708c(User user) {
                super(0, user, User.class, "getFollowerCount", "getFollowerCount()I", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(((User) this.receiver).getFollowerCount());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$k$b */
        static final /* synthetic */ class C64707b extends C89217j implements AbstractC89172b<Integer, C89391z> {
            static {
                Covode.recordClassIndex(76174);
            }

            C64707b(User user) {
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

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$k$d */
        static final /* synthetic */ class C64709d extends C89217j implements AbstractC89172b<Integer, C89391z> {
            static {
                Covode.recordClassIndex(76176);
            }

            C64709d(User user) {
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

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final BaseResponse baseResponse = (BaseResponse) obj;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C647041 r2 = C647041.f146448a;
            if (C63973ae.m115689a(curUser)) {
                r2.invoke(new C64706a(curUser), new C64707b(curUser));
            } else {
                r2.invoke(new C64708c(curUser), new C64709d(curUser));
            }
            this.f146447a.mo20662a(new AbstractC89172b<C64766o, C64766o>() {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.C64703k.C647052 */

                static {
                    Covode.recordClassIndex(76172);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C64766o invoke(C64766o oVar) {
                    C64766o oVar2 = oVar;
                    C89219l.m154721d(oVar2, "");
                    return C64766o.m116607a(oVar2, null, null, new C12792n(baseResponse), null, 11);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$a */
    public static final class C64688a extends AbstractC89220m implements AbstractC89171a<C64871b> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f146426a;

        /* renamed from: b */
        final /* synthetic */ String f146427b;

        static {
            Covode.recordClassIndex(76155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64688a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.f146426a = assemViewModel;
            this.f146427b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f146426a
                com.bytedance.assem.arch.core.d r2 = r0.f31150d
                if (r2 == 0) goto L_0x000f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b.class
                java.lang.String r0 = r3.f146427b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            L_0x000f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.C64688a.invoke():java.lang.Object");
        }
    }

    /* renamed from: i */
    private final User m116564i() {
        C64615i iVar = (C64615i) C12801d.m23016a(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null) {
            return iVar.f146329a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final String mo23343h() {
        C64207ac acVar = (C64207ac) C12801d.m23016a(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145628c;
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$l */
    static final class C64710l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ UserProfileFollowVM f146450a;

        static {
            Covode.recordClassIndex(76177);
        }

        C64710l(UserProfileFollowVM userProfileFollowVM) {
            this.f146450a = userProfileFollowVM;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final Throwable th = (Throwable) obj;
            this.f146450a.mo20662a(new AbstractC89172b<C64766o, C64766o>() {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.C64710l.C647111 */

                static {
                    Covode.recordClassIndex(76178);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C64766o invoke(C64766o oVar) {
                    C64766o oVar2 = oVar;
                    C89219l.m154721d(oVar2, "");
                    Throwable th = th;
                    C89219l.m154716b(th, "");
                    return C64766o.m116607a(oVar2, null, null, new C12785h(th), null, 11);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$d */
    public static final class C64696d extends AbstractC89220m implements AbstractC89172b<C64766o, C64766o> {

        /* renamed from: a */
        public static final C64696d f146440a = new C64696d();

        static {
            Covode.recordClassIndex(76163);
        }

        C64696d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64766o invoke(C64766o oVar) {
            C64766o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            return C64766o.m116607a(oVar2, null, null, null, new C12776a(EnumC64712a.LOGIN), 7);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$e */
    public static final class C64697e extends AbstractC89220m implements AbstractC89172b<C64766o, C64766o> {

        /* renamed from: a */
        public static final C64697e f146441a = new C64697e();

        static {
            Covode.recordClassIndex(76164);
        }

        C64697e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64766o invoke(C64766o oVar) {
            C64766o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            return C64766o.m116607a(oVar2, null, null, null, new C12776a(EnumC64712a.BLOCK), 7);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$f */
    public static final class C64698f extends AbstractC89220m implements AbstractC89172b<C64766o, C64766o> {

        /* renamed from: a */
        public static final C64698f f146442a = new C64698f();

        static {
            Covode.recordClassIndex(76165);
        }

        C64698f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64766o invoke(C64766o oVar) {
            C64766o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            return C64766o.m116607a(oVar2, null, null, null, new C12776a(EnumC64712a.BAN), 7);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$g */
    public static final class C64699g extends AbstractC89220m implements AbstractC89172b<C64766o, C64766o> {

        /* renamed from: a */
        public static final C64699g f146443a = new C64699g();

        static {
            Covode.recordClassIndex(76166);
        }

        C64699g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64766o invoke(C64766o oVar) {
            C64766o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            return C64766o.m116607a(oVar2, null, null, null, new C12776a(EnumC64712a.TEMPORARY_BAN), 7);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$h */
    public static final class C64700h extends AbstractC89220m implements AbstractC89172b<C64766o, C64766o> {

        /* renamed from: a */
        public static final C64700h f146444a = new C64700h();

        static {
            Covode.recordClassIndex(76167);
        }

        C64700h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64766o invoke(C64766o oVar) {
            C64766o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            return C64766o.m116607a(oVar2, null, null, null, new C12776a(EnumC64712a.DOUBLE_CANCEL), 7);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$i */
    public static final class C64701i extends AbstractC89220m implements AbstractC89172b<C64766o, C64766o> {

        /* renamed from: a */
        public static final C64701i f146445a = new C64701i();

        static {
            Covode.recordClassIndex(76168);
        }

        C64701i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64766o invoke(C64766o oVar) {
            C64766o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            return C64766o.m116607a(oVar2, null, null, null, new C12776a(EnumC64712a.REQUESTED), 7);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$j */
    public static final class C64702j extends AbstractC89220m implements AbstractC89172b<C64766o, C64766o> {

        /* renamed from: a */
        public static final C64702j f146446a = new C64702j();

        static {
            Covode.recordClassIndex(76169);
        }

        C64702j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64766o invoke(C64766o oVar) {
            C64766o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            return C64766o.m116607a(oVar2, null, null, null, new C12776a(EnumC64712a.FINISH), 7);
        }
    }

    public UserProfileFollowVM(AbstractC12644a<AbstractC64763m> aVar) {
        C89219l.m154721d(aVar, "");
        this.f146424j = aVar;
    }

    /* renamed from: a */
    public static void m116560a(int i) {
        C39162r.m79460a("choose_punish_pop", new C33744d().mo59980a("is_follow", i).f79943a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM$c */
    public static final class C64690c extends AbstractC89220m implements AbstractC89172b<C64766o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UserProfileFollowVM f146428a;

        /* renamed from: b */
        final /* synthetic */ C63847n f146429b;

        static {
            Covode.recordClassIndex(76157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64690c(UserProfileFollowVM userProfileFollowVM, C63847n nVar) {
            super(1);
            this.f146428a = userProfileFollowVM;
            this.f146429b = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C64766o oVar) {
            C64766o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            if (!(oVar2.f146527b instanceof C12791m)) {
                this.f146428a.mo20662a(C646911.f146430a);
                AbstractC89568bz unused = C89624i.m155555a(this.f146428a.aP_(), null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.C64690c.C646922 */

                    /* renamed from: a */
                    Object f146431a;

                    /* renamed from: b */
                    Object f146432b;

                    /* renamed from: c */
                    Object f146433c;

                    /* renamed from: d */
                    Object f146434d;

                    /* renamed from: e */
                    int f146435e;

                    /* renamed from: f */
                    final /* synthetic */ C64690c f146436f;

                    static {
                        Covode.recordClassIndex(76159);
                    }

                    {
                        this.f146436f = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* renamed from: a */
                        public static void m116562a(User user) {
                            C39162r.m79460a("show_punish_pop", new C33744d().mo59983a("enter_from", "others_homepage").mo59983a("show_type", m116563b(user)).f79943a);
                        }

                        /* renamed from: b */
                        private static String m116563b(User user) {
                            GeneralPermission generalPermission;
                            if (user != null) {
                                generalPermission = user.getGeneralPermission();
                            } else {
                                generalPermission = null;
                            }
                            if (generalPermission == null) {
                                return "";
                            }
                            GeneralPermission generalPermission2 = user.getGeneralPermission();
                            C89219l.m154716b(generalPermission2, "");
                            int followToastType = generalPermission2.getFollowToastType();
                            if (followToastType == 1) {
                                return "ban";
                            }
                            if (followToastType == 2) {
                                return "suspend";
                            }
                            if (followToastType == 3) {
                                return "viewmodeA";
                            }
                            if (followToastType != 4) {
                                return "";
                            }
                            return "viewmodeB";
                        }

                        /* renamed from: a */
                        public final void mo104172a(EnumC64712a aVar) {
                            User i;
                            User i2;
                            User i3;
                            User i4;
                            GeneralPermission generalPermission;
                            User i5;
                            int i6;
                            C89219l.m154721d(aVar, "");
                            if (aVar.compareTo((Enum) EnumC64712a.LOGIN) < 0) {
                                IAccountUserService g = C31575b.m65865g();
                                C89219l.m154716b(g, "");
                                if (!g.isLogin()) {
                                    mo20662a(C64696d.f146440a);
                                    return;
                                }
                            }
                            if (aVar.compareTo((Enum) EnumC64712a.BLOCK) < 0 && (i5 = m116564i()) != null && i5.isBlock) {
                                User i7 = m116564i();
                                if (i7 != null) {
                                    i6 = i7.getFollowStatus();
                                } else {
                                    i6 = 0;
                                }
                                if (!C80580in.m139679a(i6)) {
                                    mo20662a(C64697e.f146441a);
                                    return;
                                }
                            }
                            if (!(aVar.compareTo((Enum) EnumC64712a.BAN) >= 0 || (i3 = m116564i()) == null || i3.getFollowStatus() != 0 || (i4 = m116564i()) == null || (generalPermission = i4.getGeneralPermission()) == null)) {
                                int followToastType = generalPermission.getFollowToastType();
                                if (followToastType == 1) {
                                    mo20662a(C64698f.f146442a);
                                    return;
                                } else if (followToastType == 2 || followToastType == 3 || followToastType == 4) {
                                    mo20662a(C64699g.f146443a);
                                    return;
                                }
                            }
                            if (aVar.compareTo((Enum) EnumC64712a.DOUBLE_CANCEL) < 0 && (i2 = m116564i()) != null && i2.getFollowStatus() == 2) {
                                mo20662a(C64700h.f146444a);
                            } else if (aVar.compareTo((Enum) EnumC64712a.REQUESTED) >= 0 || (i = m116564i()) == null || i.getFollowStatus() != 4) {
                                mo20662a(C64702j.f146446a);
                            } else {
                                mo20662a(C64701i.f146445a);
                            }
                        }

                        /* access modifiers changed from: package-private */
                        /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[RETURN] */
                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void mo104171a(com.p2082ss.android.ugc.aweme.metrics.C59256u.EnumC59257a r8, com.p2082ss.android.ugc.aweme.profile.model.User r9) {
                            /*
                            // Method dump skipped, instructions count: 134
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM.mo104171a(com.ss.android.ugc.aweme.metrics.u$a, com.ss.android.ugc.aweme.profile.model.User):void");
                        }

                        /* renamed from: a */
                        public static void m116561a(int i, Aweme aweme, String str, FollowStatus followStatus) {
                            if (str != null) {
                                int i2 = 1;
                                if (i == 1 && C37699a.m76222Y(aweme)) {
                                    int hashCode = str.hashCode();
                                    int i3 = 0;
                                    if (hashCode != -485371922) {
                                        if (hashCode == 3138974 && str.equals("feed")) {
                                            C38000g.m77050a().mo65879a(C17867d.m33078a(), aweme, followStatus);
                                            C18129a.C18130a a = C18129a.m33746a("draw_ad", "follow", aweme.getAwemeRawAd());
                                            if (followStatus != null && followStatus.isCheating()) {
                                                i3 = 1;
                                            }
                                            C18129a.C18130a a2 = a.mo28897a("is_cheated_follow", Integer.valueOf(i3));
                                            if (followStatus != null) {
                                                i2 = followStatus.followStatus;
                                            }
                                            a2.mo28897a("follow_status", Integer.valueOf(i2)).mo28902c();
                                        }
                                    } else if (str.equals("homepage")) {
                                        C38000g.m77050a().mo65888b(C17867d.m33078a(), aweme, followStatus);
                                        C18129a.C18130a a3 = C18129a.m33746a("homepage_ad", "follow", aweme.getAwemeRawAd());
                                        if (followStatus != null && followStatus.isCheating()) {
                                            i3 = 1;
                                        }
                                        C18129a.C18130a a4 = a3.mo28897a("is_cheated_follow", Integer.valueOf(i3));
                                        if (followStatus != null) {
                                            i2 = followStatus.followStatus;
                                        }
                                        a4.mo28897a("follow_status", Integer.valueOf(i2)).mo28902c();
                                    }
                                }
                            }
                        }
                    }
