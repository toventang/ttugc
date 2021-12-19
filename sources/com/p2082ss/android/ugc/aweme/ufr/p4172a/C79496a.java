package com.p2082ss.android.ugc.aweme.ufr.p4172a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AbstractC20884a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C20886c;
import com.bytedance.lobby.internal.C20919d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.api.AbstractC51474a;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import com.p2082ss.android.ugc.aweme.ufr.C79519c;
import com.p2082ss.android.ugc.aweme.ufr.C79547e;
import com.p2082ss.android.ugc.aweme.ufr.C79548f;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ufr.a.a */
public final class C79496a extends AbstractC79495a {

    /* renamed from: l */
    public static final C79497a f178439l = new C79497a((byte) 0);

    /* renamed from: h */
    public String f178440h = "";

    /* renamed from: i */
    public int f178441i;

    /* renamed from: j */
    public long f178442j = -1;

    /* renamed from: k */
    public AbstractC88412b f178443k;

    static {
        Covode.recordClassIndex(92699);
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.a.a$a */
    public static final class C79497a {
        static {
            Covode.recordClassIndex(92700);
        }

        private C79497a() {
        }

        public /* synthetic */ C79497a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: g */
    public final AbstractC88979t<C79547e> mo123079g() {
        AbstractC88979t<C79547e> a = AbstractC88979t.m154294a(new C79505d(this));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: i */
    public final AbstractC88979t<C79547e> mo123081i() {
        AbstractC88979t<C79547e> b = AbstractC88979t.m154294a(new C79512f(this)).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: j */
    public final void mo123082j() {
        C39162r.m79460a("authorize_facebook_failure", new C33744d().mo59983a("enter_from", mo123075c()).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: f */
    public final AbstractC88979t<C79547e> mo123078f() {
        boolean z;
        if (C79519c.C79521b.f178476a.mo86987a(mo123074b()).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC88979t<C79547e> b = AbstractC88979t.m154310b(new C79547e(z, 0, 0, null, 14));
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: h */
    public final AbstractC88979t<C79547e> mo123080h() {
        boolean z;
        if (!this.f178437f || !C89219l.m154714a((Object) "version_update", (Object) mo123075c())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            AbstractC88979t<C79547e> a = AbstractC88979t.m154294a(new C79498b(this));
            C89219l.m154716b(a, "");
            return a;
        }
        AbstractC88979t<C79547e> a2 = AbstractC88979t.m154294a(new C79500c(this));
        C89219l.m154716b(a2, "");
        return a2;
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: e */
    public final AbstractC88979t<C79547e> mo123077e() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    AbstractC88979t<C79547e> b = AbstractC88979t.m154310b(new C79547e(socialPlatformSetting.getSyncStatus(), 0, 0, null, 14));
                    C89219l.m154716b(b, "");
                    return b;
                }
            }
        }
        AbstractC88979t<C79547e> b2 = AbstractC88979t.m154310b(new C79547e(false, 0, 0, null, 14));
        C89219l.m154716b(b2, "");
        return b2;
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.a.a$e */
    static final class C79509e<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C79496a f178458a;

        /* renamed from: b */
        final /* synthetic */ boolean f178459b;

        /* renamed from: c */
        final /* synthetic */ int f178460c;

        static {
            Covode.recordClassIndex(92712);
        }

        C79509e(C79496a aVar, boolean z, int i) {
            this.f178458a = aVar;
            this.f178459b = z;
            this.f178460c = i;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C79547e> vVar) {
            C89219l.m154721d(vVar, "");
            this.f178458a.f178443k = AbstractC51474a.m95881a().syncSocialRelationStatusInRx(2, Boolean.valueOf(this.f178459b)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.p4172a.C79496a.C79509e.C795101 */

                /* renamed from: a */
                final /* synthetic */ C79509e f178461a;

                static {
                    Covode.recordClassIndex(92713);
                }

                {
                    this.f178461a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    String str;
                    C79548f.m138255a(EnumC66622f.FACEBOOK);
                    vVar.mo143031a(new C79547e(this.f178461a.f178459b, 0, 0, null, 14));
                    if (this.f178461a.f178459b) {
                        String c = this.f178461a.f178458a.mo123075c();
                        if (this.f178461a.f178460c == 1) {
                            str = "both";
                        } else {
                            str = "uid";
                        }
                        C51488a.m95930b(c, "user", "facebook", this.f178461a.f178458a.mo123076d(), str, "process", this.f178461a.f178458a.f178436e);
                    }
                    AbstractC88412b bVar = this.f178461a.f178458a.f178443k;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.p4172a.C79496a.C79509e.C795112 */

                /* renamed from: a */
                final /* synthetic */ C79509e f178463a;

                static {
                    Covode.recordClassIndex(92714);
                }

                {
                    this.f178463a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    int i;
                    String str;
                    int i2;
                    Throwable th = (Throwable) obj;
                    AbstractC88982v vVar = vVar;
                    boolean z = this.f178463a.f178459b;
                    if (!(th instanceof C34485a)) {
                        th = null;
                    }
                    C34480a aVar = (C34480a) th;
                    if (aVar != null) {
                        i = aVar.getErrorCode();
                    } else {
                        i = -1;
                    }
                    vVar.mo143031a(new C79547e(z, 0, i, null, 10));
                    if (this.f178463a.f178459b) {
                        String c = this.f178463a.f178458a.mo123075c();
                        if (this.f178463a.f178460c == 1) {
                            str = "both";
                        } else {
                            str = "uid";
                        }
                        String d = this.f178463a.f178458a.mo123076d();
                        if (C79519c.C79521b.f178476a.mo86987a(this.f178463a.f178458a.mo123074b()).length() == 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        C51488a.m95917a(c, "user", "facebook", str, d, "process", 0, Integer.valueOf(i2 ^ 1), Integer.valueOf(this.f178463a.f178458a.f178441i));
                    }
                    AbstractC88412b bVar = this.f178463a.f178458a.f178443k;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m138216a(AuthResult authResult) {
        Bundle bundle = authResult.f49376j;
        C89219l.m154716b(bundle, "");
        String[] stringArray = bundle.getStringArray("fb_granted_permissions");
        if (stringArray == null || stringArray.length == 0) {
            return false;
        }
        for (String str : stringArray) {
            if (C89219l.m154714a((Object) "user_friends", (Object) str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.a.a$b */
    static final class C79498b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C79496a f178444a;

        static {
            Covode.recordClassIndex(92701);
        }

        C79498b(C79496a aVar) {
            this.f178444a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ufr.a.a$b$a */
        static final class C79499a implements AbstractC20884a {

            /* renamed from: a */
            final /* synthetic */ C79498b f178445a;

            /* renamed from: b */
            final /* synthetic */ AbstractC88982v f178446b;

            static {
                Covode.recordClassIndex(92702);
            }

            C79499a(C79498b bVar, AbstractC88982v vVar) {
                this.f178445a = bVar;
                this.f178446b = vVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: f.a.v */
            /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: f.a.v */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.lobby.auth.AbstractC20884a
            /* renamed from: a */
            public final void mo34320a(AuthResult authResult) {
                int i;
                C89219l.m154721d(authResult, "");
                if (!authResult.f49367a || authResult.f49368b || TextUtils.isEmpty(authResult.f49372f) || !C79496a.m138216a(authResult)) {
                    C79496a aVar = this.f178445a.f178444a;
                    if (!authResult.f49367a || C79496a.m138216a(authResult)) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    aVar.f178441i = i;
                    this.f178445a.f178444a.mo123082j();
                    this.f178446b.mo143031a(new C79547e(false, 0, 0, null, 14));
                    return;
                }
                C79496a aVar2 = this.f178445a.f178444a;
                String str = authResult.f49372f;
                C89219l.m154716b(str, "");
                aVar2.f178440h = str;
                this.f178445a.f178444a.f178442j = authResult.f49374h;
                this.f178446b.mo143031a(new C79547e(true, 0, 0, null, 14));
            }
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<C79547e> vVar) {
            C89219l.m154721d(vVar, "");
            C20919d.m39339a();
            Context a = this.f178444a.mo123071a();
            Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C20886c.C20887a aVar = new C20886c.C20887a((ActivityC0945e) a);
            aVar.f49390a = "facebook";
            C20886c.C20887a a2 = aVar.mo34321a(new C80222ap().mo123649a("fb_read_permissions", "user_friends").f179700a);
            a2.f49392c = new C79499a(this, vVar);
            C20886c a3 = a2.mo34322a();
            C89219l.m154716b(a3, "");
            C20919d.m39340a(a3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.a.a$c */
    static final class C79500c<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C79496a f178447a;

        static {
            Covode.recordClassIndex(92703);
        }

        C79500c(C79496a aVar) {
            this.f178447a = aVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 6
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final p4560f.p4561a.AbstractC88982v<com.p2082ss.android.ugc.aweme.ufr.C79547e> r8) {
            /*
                r7 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r8, r0)
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f178447a
                java.lang.String r1 = r0.mo123075c()
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f178447a
                java.lang.String r4 = r0.mo123076d()
                java.lang.String r6 = com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95909a()
                java.lang.String r2 = "user"
                java.lang.String r3 = "facebook"
                java.lang.String r5 = "off"
                com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95915a(r1, r2, r3, r4, r5, r6)
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f178447a
                android.content.Context r0 = r0.mo123071a()
                com.bytedance.tux.dialog.b r1 = com.bytedance.tux.dialog.C23013a.C23015a.m43405a(r0)
                java.lang.String r0 = com.p2082ss.android.ugc.aweme.experiment.C46905er.m90204b()
                com.bytedance.tux.dialog.b r1 = r1.mo37411b(r0)
                java.lang.String r0 = com.p2082ss.android.ugc.aweme.experiment.C46905er.m90205c()
                com.bytedance.tux.dialog.b r1 = r1.mo37413d(r0)
                com.ss.android.ugc.aweme.ufr.a.a$c$1 r0 = new com.ss.android.ugc.aweme.ufr.a.a$c$1
                r0.<init>(r7, r8)
                com.bytedance.tux.dialog.b r1 = com.bytedance.tux.dialog.p1713b.C23028c.m43435a(r1, r0)
                r0 = 0
                com.bytedance.tux.dialog.internal.b r0 = r1.mo37482a(r0)
                com.bytedance.tux.dialog.b r0 = (com.bytedance.tux.dialog.C23023b) r0
                com.bytedance.tux.dialog.a r0 = r0.mo37405a()
                android.app.Dialog r0 = r0.mo37396b()
                r0.show()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ufr.p4172a.C79496a.C79500c.subscribe(f.a.v):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.a.a$d */
    static final class C79505d<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C79496a f178453a;

        static {
            Covode.recordClassIndex(92708);
        }

        C79505d(C79496a aVar) {
            this.f178453a = aVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 6 out of bounds for length 6
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final p4560f.p4561a.AbstractC88982v<com.p2082ss.android.ugc.aweme.ufr.C79547e> r8) {
            /*
                r7 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r8, r0)
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f178453a
                java.lang.String r1 = r0.mo123075c()
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f178453a
                java.lang.String r4 = r0.mo123076d()
                java.lang.String r2 = "user"
                java.lang.String r3 = "facebook"
                java.lang.String r5 = "on"
                java.lang.String r6 = "off"
                com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a.m95915a(r1, r2, r3, r4, r5, r6)
                com.ss.android.ugc.aweme.ufr.a.a r0 = r7.f178453a
                android.content.Context r0 = r0.mo123071a()
                com.bytedance.tux.dialog.b r1 = com.bytedance.tux.dialog.C23013a.C23015a.m43405a(r0)
                java.lang.String r0 = com.p2082ss.android.ugc.aweme.experiment.C46905er.m90204b()
                com.bytedance.tux.dialog.b r1 = r1.mo37411b(r0)
                java.lang.String r0 = com.p2082ss.android.ugc.aweme.experiment.C46905er.m90205c()
                com.bytedance.tux.dialog.b r1 = r1.mo37413d(r0)
                com.ss.android.ugc.aweme.ufr.a.a$d$1 r0 = new com.ss.android.ugc.aweme.ufr.a.a$d$1
                r0.<init>(r7, r8)
                com.bytedance.tux.dialog.b r1 = com.bytedance.tux.dialog.p1713b.C23028c.m43435a(r1, r0)
                r0 = 0
                com.bytedance.tux.dialog.internal.b r0 = r1.mo37482a(r0)
                com.bytedance.tux.dialog.b r0 = (com.bytedance.tux.dialog.C23023b) r0
                com.bytedance.tux.dialog.a r0 = r0.mo37405a()
                android.app.Dialog r0 = r0.mo37396b()
                r0.show()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ufr.p4172a.C79496a.C79505d.subscribe(f.a.v):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ufr.a.a$f */
    static final class C79512f<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C79496a f178465a;

        static {
            Covode.recordClassIndex(92715);
        }

        C79512f(C79496a aVar) {
            this.f178465a = aVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<C79547e> vVar) {
            C89219l.m154721d(vVar, "");
            this.f178465a.f178443k = AbstractC51474a.m95881a().socialFriends("facebook", C79519c.C79521b.f178476a.mo86987a(this.f178465a.mo123074b()), null, Long.valueOf(C79519c.C79521b.f178476a.mo86995d(this.f178465a.mo123074b()))).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.p4172a.C79496a.C79512f.C795131 */

                /* renamed from: a */
                final /* synthetic */ C79512f f178466a;

                static {
                    Covode.recordClassIndex(92716);
                }

                {
                    this.f178466a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    vVar.mo143031a(new C79547e(true, 0, 0, null, 14));
                    AbstractC88412b bVar = this.f178466a.f178465a.f178443k;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.ufr.p4172a.C79496a.C79512f.C795142 */

                /* renamed from: a */
                final /* synthetic */ C79512f f178468a;

                static {
                    Covode.recordClassIndex(92717);
                }

                {
                    this.f178468a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    Throwable th;
                    int i;
                    Throwable th2 = (Throwable) obj;
                    AbstractC88982v vVar = vVar;
                    boolean z = th2 instanceof C34485a;
                    if (!z) {
                        th = null;
                    } else {
                        th = th2;
                    }
                    C34480a aVar = (C34480a) th;
                    if (aVar != null) {
                        i = aVar.getErrorCode();
                    } else {
                        i = -1;
                    }
                    vVar.mo143031a(new C79547e(false, 0, i, null, 10));
                    if (!z) {
                        th2 = null;
                    }
                    C34480a aVar2 = (C34480a) th2;
                    if (aVar2 != null && aVar2.getErrorCode() == 3002047) {
                        C79519c.C79521b.f178476a.mo86992b(this.f178468a.f178465a.mo123074b());
                    }
                    AbstractC88412b bVar = this.f178468a.f178465a.f178443k;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a
    /* renamed from: a */
    public final AbstractC88979t<C79547e> mo123072a(boolean z, int i) {
        if (z && !TextUtils.equals(this.f178440h, "")) {
            C79519c.C79521b.f178476a.mo86989a(mo123074b(), this.f178440h, this.f178442j);
        }
        C79519c.C79521b.f178476a.mo86990a(z);
        AbstractC88979t<C79547e> a = AbstractC88979t.m154294a(new C79509e(this, z, i));
        C89219l.m154716b(a, "");
        return a;
    }
}
