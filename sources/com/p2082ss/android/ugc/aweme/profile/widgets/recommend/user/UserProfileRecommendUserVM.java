package com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user;

import android.text.TextUtils;
import com.bytedance.assem.arch.extensions.C12791m;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63748i;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63765ad;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64207ac;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.permission.C80619d;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM */
public final class UserProfileRecommendUserVM extends AssemViewModel<C65125e> {

    /* renamed from: n */
    public static final C65087a f146938n = new C65087a((byte) 0);

    /* renamed from: j */
    public final C88411a f146939j = new C88411a();

    /* renamed from: k */
    public User f146940k;

    /* renamed from: l */
    public boolean f146941l;

    /* renamed from: m */
    public final AbstractC12644a<AbstractC65122c> f146942m;

    /* renamed from: o */
    private final AbstractC89244h f146943o = C89250i.m154773a((AbstractC89171a) new C65089c(this));

    static {
        Covode.recordClassIndex(76555);
    }

    /* renamed from: g */
    public final String mo23342g() {
        return (String) this.f146943o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$a */
    public static final class C65087a {
        static {
            Covode.recordClassIndex(76556);
        }

        private C65087a() {
        }

        public /* synthetic */ C65087a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C65125e mo20674f() {
        return new C65125e();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$c */
    static final class C65089c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ UserProfileRecommendUserVM f146945a;

        static {
            Covode.recordClassIndex(76558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65089c(UserProfileRecommendUserVM userProfileRecommendUserVM) {
            super(0);
            this.f146945a = userProfileRecommendUserVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (!this.f146945a.mo104322i()) {
                return "[\"private_account\", \"no_content_account\"]";
            }
            return "";
        }
    }

    /* renamed from: k */
    public final void mo104323k() {
        if (m116813j()) {
            mo20667b(new C65101i(this));
        }
    }

    /* renamed from: l */
    public final void mo104324l() {
        mo20667b(new C65099h(this));
    }

    /* renamed from: m */
    public final void mo104325m() {
        mo20667b(new C65090d(this));
    }

    /* renamed from: j */
    public static boolean m116813j() {
        if (!C66652b.f149825a.mo105656b()) {
            return C66652b.f149825a.mo105660f();
        }
        if (C16048b.m29633a().mo25412a(true, "other_page_recommend_users", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m116814n() {
        User user = this.f146940k;
        if (user == null || user.getFollowerCount() >= 1000 || user.getAccountType() == 2 || user.getAccountType() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo23343h() {
        if (m116814n()) {
            return false;
        }
        if (C63748i.m115281b() && !C63748i.m115282c()) {
            return true;
        }
        if (this.f146941l || !C63748i.m115282c()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo104322i() {
        if ((((Boolean) C63748i.f144507a.getValue()).booleanValue() || C63748i.m115282c()) && this.f146941l && !m116814n()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo104321a(boolean z) {
        mo20667b(new C65117p(this, z));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$l */
    static final class C65111l extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UserProfileRecommendUserVM f146983a;

        static {
            Covode.recordClassIndex(76580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65111l(UserProfileRecommendUserVM userProfileRecommendUserVM) {
            super(1);
            this.f146983a = userProfileRecommendUserVM;
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$l$a */
        static final class C65113a extends AbstractC89220m implements AbstractC89172b<User, Boolean> {

            /* renamed from: a */
            public static final C65113a f146985a = new C65113a();

            static {
                Covode.recordClassIndex(76582);
            }

            C65113a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(User user) {
                boolean z;
                User user2 = user;
                C89219l.m154716b(user2, "");
                if (user2.getFollowStatus() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
            r2 = r0.clone();
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65125e r4) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.profile.widgets.recommend.user.e r4 = (com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65125e) r4
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
                com.ss.android.ugc.aweme.friends.model.RecommendList r1 = r4.f147000b
                r0 = 0
                if (r1 == 0) goto L_0x0010
                java.util.List r0 = r1.getUserList()
            L_0x0010:
                boolean r0 = com.p2082ss.android.ugc.tools.utils.C84892d.m145850a(r0)
                if (r0 != 0) goto L_0x0038
                com.ss.android.ugc.aweme.friends.model.RecommendList r0 = r4.f147000b
                if (r0 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.friends.model.RecommendList r2 = r0.clone()
                if (r2 == 0) goto L_0x0038
                java.util.List r1 = r2.getUserList()
                if (r1 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$l$a r0 = com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.C65111l.C65113a.f146985a
                boolean r0 = p4600h.p4601a.C89070n.m154537a(r1, r0)
                if (r0 == 0) goto L_0x0038
                com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM r1 = r3.f146983a
                com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$l$1 r0 = new com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$l$1
                r0.<init>(r2)
                r1.mo20662a(r0)
            L_0x0038:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.C65111l.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$b */
    static final class C65088b extends AbstractC89220m implements AbstractC89172b<C65125e, C65125e> {

        /* renamed from: a */
        public static final C65088b f146944a = new C65088b();

        static {
            Covode.recordClassIndex(76557);
        }

        C65088b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C65125e invoke(C65125e eVar) {
            C65125e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C65125e.m116833a(eVar2, null, null, 0, null, false, 0, 0, 125);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$d */
    public static final class C65090d extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UserProfileRecommendUserVM f146946a;

        static {
            Covode.recordClassIndex(76559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65090d(UserProfileRecommendUserVM userProfileRecommendUserVM) {
            super(1);
            this.f146946a = userProfileRecommendUserVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C65125e eVar) {
            C65125e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            if (eVar2.f147004f == 2) {
                this.f146946a.mo20662a(C650911.f146947a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$n */
    static final class C65115n extends AbstractC89220m implements AbstractC89172b<C65125e, C65125e> {

        /* renamed from: a */
        final /* synthetic */ long f146988a;

        static {
            Covode.recordClassIndex(76584);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65115n(long j) {
            super(1);
            this.f146988a = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C65125e invoke(C65125e eVar) {
            C65125e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C65125e.m116833a(eVar2, null, null, this.f146988a, null, false, 0, 0, 123);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$o */
    static final class C65116o extends AbstractC89220m implements AbstractC89172b<C65125e, C65125e> {

        /* renamed from: a */
        final /* synthetic */ boolean f146989a;

        static {
            Covode.recordClassIndex(76585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65116o(boolean z) {
            super(1);
            this.f146989a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C65125e invoke(C65125e eVar) {
            C65125e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C65125e.m116833a(eVar2, null, null, 0, null, this.f146989a, 0, 0, 111);
        }
    }

    public UserProfileRecommendUserVM(AbstractC12644a<AbstractC65122c> aVar) {
        C89219l.m154721d(aVar, "");
        this.f146942m = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$e */
    public static final class C65092e extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UserProfileRecommendUserVM f146948a;

        /* renamed from: b */
        final /* synthetic */ int f146949b;

        static {
            Covode.recordClassIndex(76561);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65092e(UserProfileRecommendUserVM userProfileRecommendUserVM, int i) {
            super(1);
            this.f146948a = userProfileRecommendUserVM;
            this.f146949b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C65125e eVar) {
            final C65125e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            final C64207ac acVar = (C64207ac) C12801d.m23016a(this.f146948a, C89204ab.m154669a(AbstractC64206ab.class));
            AbstractC89568bz unused = C89624i.m155555a(this.f146948a.aP_(), null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.C65092e.C650931 */

                /* renamed from: a */
                int f146950a;

                /* renamed from: b */
                final /* synthetic */ C65092e f146951b;

                static {
                    Covode.recordClassIndex(76562);
                }

                {
                    this.f146951b = r2;
                }

                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                    C89219l.m154721d(dVar, "");
                    return 

                    /* access modifiers changed from: package-private */
                    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$k */
                    public static final class C65103k extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

                        /* renamed from: a */
                        final /* synthetic */ UserProfileRecommendUserVM f146967a;

                        /* renamed from: b */
                        final /* synthetic */ String f146968b;

                        /* renamed from: c */
                        final /* synthetic */ int f146969c = 1;

                        /* renamed from: d */
                        final /* synthetic */ int f146970d;

                        /* renamed from: e */
                        final /* synthetic */ String f146971e;

                        /* renamed from: f */
                        final /* synthetic */ int f146972f;

                        /* renamed from: g */
                        final /* synthetic */ String f146973g;

                        static {
                            Covode.recordClassIndex(76572);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C65103k(UserProfileRecommendUserVM userProfileRecommendUserVM, String str, int i) {
                            super(1);
                            this.f146967a = userProfileRecommendUserVM;
                            this.f146968b = str;
                            this.f146970d = i;
                            this.f146971e = null;
                            this.f146972f = 2;
                            this.f146973g = null;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C65125e eVar) {
                            final C65125e eVar2 = eVar;
                            C89219l.m154721d(eVar2, "");
                            if (!(eVar2.f146999a instanceof C12791m)) {
                                this.f146967a.mo20662a(C651041.f146974a);
                                AbstractC89568bz unused = C89624i.m155555a(this.f146967a.aP_(), null, null, new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.C65103k.C651052 */

                                    /* renamed from: a */
                                    int f146975a;

                                    /* renamed from: b */
                                    final /* synthetic */ C65103k f146976b;

                                    static {
                                        Covode.recordClassIndex(76574);
                                    }

                                    {
                                        this.f146976b = r2;
                                    }

                                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                        C89219l.m154721d(dVar, "");
                                        return 

                                        /* access modifiers changed from: package-private */
                                        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$h */
                                        public static final class C65099h extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

                                            /* renamed from: a */
                                            final /* synthetic */ UserProfileRecommendUserVM f146962a;

                                            static {
                                                Covode.recordClassIndex(76568);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C65099h(UserProfileRecommendUserVM userProfileRecommendUserVM) {
                                                super(1);
                                                this.f146962a = userProfileRecommendUserVM;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                            public final /* synthetic */ C89391z invoke(C65125e eVar) {
                                                User user;
                                                String recType;
                                                C65125e eVar2 = eVar;
                                                String str = "";
                                                C89219l.m154721d(eVar2, str);
                                                if (eVar2.f147004f != 2) {
                                                    C64615i iVar = (C64615i) C12801d.m23016a(this.f146962a, C89204ab.m154669a(AbstractC64616j.class));
                                                    String str2 = null;
                                                    if (iVar != null) {
                                                        user = iVar.f146329a;
                                                    } else {
                                                        user = null;
                                                    }
                                                    C64207ac acVar = (C64207ac) C12801d.m23016a(this.f146962a, C89204ab.m154669a(AbstractC64206ab.class));
                                                    if (acVar != null) {
                                                        str2 = acVar.f145626a;
                                                    }
                                                    if (!(user == null || (recType = user.getRecType()) == null)) {
                                                        str = recType;
                                                    }
                                                    C63765ad.m115316a(str2, str, Boolean.valueOf(eVar2.f147003e));
                                                    this.f146962a.mo20662a(C651001.f146963a);
                                                }
                                                return C89391z.f203057a;
                                            }
                                        }

                                        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$i */
                                        static final class C65101i extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

                                            /* renamed from: a */
                                            final /* synthetic */ UserProfileRecommendUserVM f146964a;

                                            static {
                                                Covode.recordClassIndex(76570);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C65101i(UserProfileRecommendUserVM userProfileRecommendUserVM) {
                                                super(1);
                                                this.f146964a = userProfileRecommendUserVM;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                            public final /* synthetic */ C89391z invoke(C65125e eVar) {
                                                C65125e eVar2 = eVar;
                                                C89219l.m154721d(eVar2, "");
                                                if (System.currentTimeMillis() - eVar2.f147001c >= 500) {
                                                    this.f146964a.mo20662a(new C65115n(System.currentTimeMillis()));
                                                    if (eVar2.f147004f == -1 || eVar2.f147004f == 0 || eVar2.f147004f == 3) {
                                                        this.f146964a.mo104321a(true);
                                                    } else if (eVar2.f147004f == 2) {
                                                        this.f146964a.mo104325m();
                                                    }
                                                }
                                                return C89391z.f203057a;
                                            }
                                        }

                                        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$f */
                                        static final class C65097f extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

                                            /* renamed from: a */
                                            final /* synthetic */ UserProfileRecommendUserVM f146957a;

                                            /* renamed from: b */
                                            final /* synthetic */ User f146958b;

                                            static {
                                                Covode.recordClassIndex(76566);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C65097f(UserProfileRecommendUserVM userProfileRecommendUserVM, User user) {
                                                super(1);
                                                this.f146957a = userProfileRecommendUserVM;
                                                this.f146958b = user;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                            public final /* synthetic */ C89391z invoke(C65125e eVar) {
                                                String str;
                                                int i;
                                                List<User> userList;
                                                C65125e eVar2 = eVar;
                                                C89219l.m154721d(eVar2, "");
                                                String requestId = this.f146958b.getRequestId();
                                                User user = this.f146958b;
                                                C64207ac acVar = (C64207ac) C12801d.m23016a(this.f146957a, C89204ab.m154669a(AbstractC64206ab.class));
                                                if (acVar != null) {
                                                    str = acVar.f145626a;
                                                } else {
                                                    str = null;
                                                }
                                                String recType = this.f146958b.getRecType();
                                                RecommendList recommendList = eVar2.f147000b;
                                                if (recommendList == null || (userList = recommendList.getUserList()) == null) {
                                                    i = -1;
                                                } else {
                                                    i = userList.indexOf(this.f146958b);
                                                }
                                                C33744d a = new C33744d().mo59983a("enter_method", "click_card").mo59983a("enter_from", "others_homepage").mo59983a("to_user_id", user.getUid()).mo59983a("req_id", requestId).mo59980a("impr_order", i).mo59983a("impr_id", requestId).mo59983a("rec_type", recType).mo59983a("from_user_id", str);
                                                C80409eu.m139390a(a, user);
                                                C39162r.m79460a("enter_personal_detail", a.f79943a);
                                                return C89391z.f203057a;
                                            }
                                        }

                                        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$j */
                                        static final class C65102j extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

                                            /* renamed from: a */
                                            final /* synthetic */ UserProfileRecommendUserVM f146965a;

                                            /* renamed from: b */
                                            final /* synthetic */ User f146966b;

                                            static {
                                                Covode.recordClassIndex(76571);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C65102j(UserProfileRecommendUserVM userProfileRecommendUserVM, User user) {
                                                super(1);
                                                this.f146965a = userProfileRecommendUserVM;
                                                this.f146966b = user;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                            public final /* synthetic */ C89391z invoke(C65125e eVar) {
                                                int i;
                                                String str;
                                                List<User> userList;
                                                C65125e eVar2 = eVar;
                                                C89219l.m154721d(eVar2, "");
                                                C64207ac acVar = (C64207ac) C12801d.m23016a(this.f146965a, C89204ab.m154669a(AbstractC64206ab.class));
                                                String requestId = this.f146966b.getRequestId();
                                                RecommendList recommendList = eVar2.f147000b;
                                                if (recommendList == null || (userList = recommendList.getUserList()) == null) {
                                                    i = 0;
                                                } else {
                                                    i = userList.indexOf(this.f146966b);
                                                }
                                                String uid = this.f146966b.getUid();
                                                if (acVar != null) {
                                                    str = acVar.f145626a;
                                                } else {
                                                    str = null;
                                                }
                                                C39162r.m79460a("follow_card", new C33744d().mo59983a("enter_from", "others_homepage").mo59983a("event_type", "impression").mo59983a("req_id", requestId).mo59980a("impr_order", i).mo59983a("rec_type", this.f146966b.getRecType()).mo59983a("relation_type", this.f146966b.getFriendTypeStr()).mo59983a("rec_uid", uid).mo59983a("from_user_id", str).f79943a);
                                                if (!eVar2.f147002d.contains(this.f146966b.getUid())) {
                                                    C61504e.C61505a.f139616a.mo99160a(1, this.f146966b.getUid());
                                                    List<String> list = eVar2.f147002d;
                                                    String uid2 = this.f146966b.getUid();
                                                    C89219l.m154716b(uid2, "");
                                                    list.add(uid2);
                                                }
                                                return C89391z.f203057a;
                                            }
                                        }

                                        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$m */
                                        static final class C65114m extends AbstractC89220m implements AbstractC89172b<C65125e, C65125e> {

                                            /* renamed from: a */
                                            final /* synthetic */ User f146986a;

                                            /* renamed from: b */
                                            final /* synthetic */ String f146987b;

                                            static {
                                                Covode.recordClassIndex(76583);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C65114m(User user, String str) {
                                                super(1);
                                                this.f146986a = user;
                                                this.f146987b = str;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                            public final /* synthetic */ C65125e invoke(C65125e eVar) {
                                                int i;
                                                RecommendList recommendList;
                                                List<User> userList;
                                                List<User> userList2;
                                                C65125e eVar2 = eVar;
                                                C89219l.m154721d(eVar2, "");
                                                String uid = this.f146986a.getUid();
                                                RecommendList recommendList2 = eVar2.f147000b;
                                                if (recommendList2 == null || (userList2 = recommendList2.getUserList()) == null) {
                                                    i = 0;
                                                } else {
                                                    i = userList2.indexOf(this.f146986a);
                                                }
                                                String requestId = this.f146986a.getRequestId();
                                                C39162r.m79460a("follow_card", new C33744d().mo59983a("rec_uid", uid).mo59983a("enter_from", "others_homepage").mo59983a("event_type", "delete").mo59980a("impr_order", i).mo59983a("rec_type", this.f146986a.getRecType()).mo59983a("relation_type", this.f146986a.getFriendTypeStr()).mo59983a("req_id", requestId).mo59983a("from_user_id", this.f146987b).f79943a);
                                                RecommendList recommendList3 = eVar2.f147000b;
                                                if (recommendList3 != null) {
                                                    recommendList = recommendList3.clone();
                                                } else {
                                                    recommendList = null;
                                                }
                                                if (!(recommendList == null || (userList = recommendList.getUserList()) == null)) {
                                                    userList.remove(this.f146986a);
                                                }
                                                return C65125e.m116833a(eVar2, null, recommendList, 0, null, false, 0, 0, 125);
                                            }
                                        }

                                        /* access modifiers changed from: package-private */
                                        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$p */
                                        public static final class C65117p extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

                                            /* renamed from: a */
                                            final /* synthetic */ UserProfileRecommendUserVM f146990a;

                                            /* renamed from: b */
                                            final /* synthetic */ boolean f146991b;

                                            static {
                                                Covode.recordClassIndex(76586);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C65117p(UserProfileRecommendUserVM userProfileRecommendUserVM, boolean z) {
                                                super(1);
                                                this.f146990a = userProfileRecommendUserVM;
                                                this.f146991b = z;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                            public final /* synthetic */ C89391z invoke(C65125e eVar) {
                                                String str;
                                                String str2;
                                                User user;
                                                C65125e eVar2 = eVar;
                                                C89219l.m154721d(eVar2, "");
                                                if (eVar2.f147004f != 2) {
                                                    this.f146990a.mo20662a(new C65116o(!this.f146991b));
                                                    C64615i iVar = (C64615i) C12801d.m23016a(this.f146990a, C89204ab.m154669a(AbstractC64616j.class));
                                                    C64207ac acVar = (C64207ac) C12801d.m23016a(this.f146990a, C89204ab.m154669a(AbstractC64206ab.class));
                                                    String str3 = null;
                                                    if (acVar != null) {
                                                        str = acVar.f145627b;
                                                    } else {
                                                        str = null;
                                                    }
                                                    if (!TextUtils.isEmpty(str)) {
                                                        eVar2.f147002d.clear();
                                                        if (eVar2.f147000b == null) {
                                                            UserProfileRecommendUserVM userProfileRecommendUserVM = this.f146990a;
                                                            if (acVar != null) {
                                                                str3 = acVar.f145627b;
                                                            }
                                                            userProfileRecommendUserVM.mo20667b(new C65103k(userProfileRecommendUserVM, str3, C80619d.m139776a()));
                                                        } else {
                                                            UserProfileRecommendUserVM userProfileRecommendUserVM2 = this.f146990a;
                                                            userProfileRecommendUserVM2.mo20667b(new C65111l(userProfileRecommendUserVM2));
                                                            final RecommendList recommendList = eVar2.f147000b;
                                                            if (!C84892d.m145850a(recommendList.getUserList())) {
                                                                if (this.f146991b || recommendList.getUserList().size() >= 3) {
                                                                    if (acVar != null) {
                                                                        str2 = acVar.f145626a;
                                                                    } else {
                                                                        str2 = null;
                                                                    }
                                                                    if (!(iVar == null || (user = iVar.f146329a) == null)) {
                                                                        str3 = user.getRecType();
                                                                    }
                                                                    C63765ad.m115316a(str2, str3, Boolean.valueOf(!this.f146991b));
                                                                    this.f146990a.mo104324l();
                                                                } else {
                                                                    this.f146990a.mo20662a(C651181.f146992a);
                                                                }
                                                            } else if (this.f146991b) {
                                                                this.f146990a.mo20662a(new AbstractC89172b<C65125e, C65125e>() {
                                                                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.C65117p.C651192 */

                                                                    static {
                                                                        Covode.recordClassIndex(76588);
                                                                    }

                                                                    /* Return type fixed from 'java.lang.Object' to match base method */
                                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                                    public final /* synthetic */ C65125e invoke(C65125e eVar) {
                                                                        C65125e eVar2 = eVar;
                                                                        C89219l.m154721d(eVar2, "");
                                                                        return C65125e.m116833a(eVar2, null, recommendList, 0, null, false, 3, eVar2.f147005g + 1, 29);
                                                                    }
                                                                });
                                                            }
                                                        }
                                                    }
                                                }
                                                return C89391z.f203057a;
                                            }
                                        }

                                        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM$g */
                                        static final class C65098g extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

                                            /* renamed from: a */
                                            final /* synthetic */ UserProfileRecommendUserVM f146959a;

                                            /* renamed from: b */
                                            final /* synthetic */ int f146960b;

                                            /* renamed from: c */
                                            final /* synthetic */ User f146961c;

                                            static {
                                                Covode.recordClassIndex(76567);
                                            }

                                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                            C65098g(UserProfileRecommendUserVM userProfileRecommendUserVM, int i, User user) {
                                                super(1);
                                                this.f146959a = userProfileRecommendUserVM;
                                                this.f146960b = i;
                                                this.f146961c = user;
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            /* JADX WARNING: Removed duplicated region for block: B:40:0x020b  */
                                            /* JADX WARNING: Removed duplicated region for block: B:42:0x021c  */
                                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65125e r32) {
                                                /*
                                                // Method dump skipped, instructions count: 558
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM.C65098g.invoke(java.lang.Object):java.lang.Object");
                                            }
                                        }
                                    }
