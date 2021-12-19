package com.p2082ss.android.ugc.aweme.compliance.protection.common;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.api.ProtectionApi;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.p2674b.C40071a;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.EnumC40076b;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.C40091a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.a */
public final class C40061a {

    /* renamed from: a */
    public static boolean f94103a;

    /* renamed from: b */
    public static final C40061a f94104b = new C40061a();

    /* renamed from: c */
    private static final AbstractC89244h f94105c = C89250i.m154773a((AbstractC89171a) C40065d.f94111a);

    private C40061a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.a$a */
    public static final class C40062a implements AbstractC34709b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Runnable f94106a;

        static {
            Covode.recordClassIndex(47833);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b
        /* renamed from: a */
        public final /* synthetic */ void mo61385a() {
            Runnable runnable = this.f94106a;
            if (runnable != null) {
                runnable.run();
            }
        }

        public C40062a(Runnable runnable) {
            this.f94106a = runnable;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.a$d */
    static final class C40065d extends AbstractC89220m implements AbstractC89171a<C40071a> {

        /* renamed from: a */
        public static final C40065d f94111a = new C40065d();

        static {
            Covode.recordClassIndex(47836);
        }

        C40065d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C40071a invoke() {
            return new C40071a();
        }
    }

    /* renamed from: d */
    public static int m81024d() {
        if (m81022b()) {
            return 2;
        }
        return 0;
    }

    /* renamed from: h */
    private static boolean m81028h() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(47832);
    }

    /* renamed from: f */
    public static boolean m81026f() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean h = m81028h();
        C58029j.f132256h = h;
        return h;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.a$b */
    public static final class C40063b implements AbstractC39286a {

        /* renamed from: a */
        final /* synthetic */ DialogC17223o f94107a;

        /* renamed from: b */
        final /* synthetic */ Activity f94108b;

        static {
            Covode.recordClassIndex(47834);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a
        /* renamed from: a */
        public final void mo68715a() {
            this.f94107a.dismiss();
            if (FamilyPiaringManager.m81048a() == IFamilyPairingService.EnumC39276a.CHILD) {
                SmartRouter.buildRoute(this.f94108b, "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Fguardian_child_t%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1").open();
            } else {
                SmartRouter.buildRoute(this.f94108b, "//teenage/setting").open();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a
        /* renamed from: a */
        public final void mo68716a(Exception exc) {
            C89219l.m154721d(exc, "");
            this.f94107a.dismiss();
            C33615a.m68848a((Context) this.f94108b, (Throwable) exc, (int) R.string.g1i);
        }

        public C40063b(DialogC17223o oVar, Activity activity) {
            this.f94107a = oVar;
            this.f94108b = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.a$c */
    public static final class C40064c implements AbstractC39286a {

        /* renamed from: a */
        final /* synthetic */ DialogC17223o f94109a;

        /* renamed from: b */
        final /* synthetic */ Activity f94110b;

        static {
            Covode.recordClassIndex(47835);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a
        /* renamed from: a */
        public final void mo68715a() {
            this.f94109a.dismiss();
            IFamilyPairingService.EnumC39276a a = FamilyPiaringManager.m81048a();
            if (a == IFamilyPairingService.EnumC39276a.CHILD) {
                SmartRouter.buildRoute(this.f94110b, "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Fguardian_child_t%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1").open();
            } else if (a == IFamilyPairingService.EnumC39276a.PARENT) {
                SmartRouter.buildRoute(this.f94110b, "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Fguardian_parent_t%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1").open();
            } else {
                SmartRouter.buildRoute(this.f94110b, FamilyPiaringManager.m81056e()).open();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a
        /* renamed from: a */
        public final void mo68716a(Exception exc) {
            C89219l.m154721d(exc, "");
            this.f94109a.dismiss();
            C33615a.m68848a((Context) this.f94110b, (Throwable) exc, (int) R.string.g1i);
        }

        public C40064c(DialogC17223o oVar, Activity activity) {
            this.f94109a = oVar;
            this.f94110b = activity;
        }
    }

    /* renamed from: b */
    public static boolean m81022b() {
        if (!C40091a.m81077a()) {
            return m81027g();
        }
        if (C40074a.f94130e.mo69221a() == EnumC40076b.DEFAULT) {
            if (m81027g()) {
                C40074a.m81037a(EnumC40076b.OPEN);
            } else {
                C40074a.m81037a(EnumC40076b.CLOSE);
            }
        }
        if (C40074a.f94130e.mo69221a() == EnumC40076b.OPEN) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m81023c() {
        IFamilyPairingService.EnumC39276a a = FamilyPiaringManager.m81048a();
        if (a == IFamilyPairingService.EnumC39276a.CHILD || a == IFamilyPairingService.EnumC39276a.UNLINK_LOCKED) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                return FamilyPiaringManager.m81055d();
            }
        }
        return C40074a.m81041d();
    }

    /* renamed from: e */
    public static void m81025e() {
        C31575b.m65861c().saveSharedAccount(null);
        Context j = C17873f.m33102j();
        if (j == null) {
            j = C17867d.m33078a();
        }
        if (j instanceof AbstractC59103j) {
            ((Activity) j).finish();
        }
        SmartRouter.buildRoute(j, "//main").addFlags(268468224).open();
    }

    /* renamed from: g */
    private static boolean m81027g() {
        IFamilyPairingService.EnumC39276a a = FamilyPiaringManager.m81048a();
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        boolean isLogin = g.isLogin();
        boolean b = FamilyPiaringManager.m81052b();
        if (a == IFamilyPairingService.EnumC39276a.CHILD && isLogin) {
            return b;
        }
        if (a != IFamilyPairingService.EnumC39276a.UNLINK_LOCKED || !isLogin || !b) {
            return C40074a.m81039b();
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m81021a() {
        IFamilyPairingService.EnumC39276a a = FamilyPiaringManager.m81048a();
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        boolean isLogin = g.isLogin();
        if (a == IFamilyPairingService.EnumC39276a.CHILD && isLogin) {
            return FamilyPiaringManager.m81054c();
        }
        if (a != IFamilyPairingService.EnumC39276a.UNLINK_LOCKED || !isLogin || !FamilyPiaringManager.m81054c()) {
            return C40074a.m81040c();
        }
        return true;
    }

    /* renamed from: a */
    public static void m81020a(AbstractC39286a aVar) {
        if (!f94103a) {
            f94105c.getValue();
            f94103a = true;
            ProtectionApi.C40070a.f94122a.getProtectionSettings().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C40071a.C40072a(aVar), new C40071a.C40073b(aVar));
        }
    }
}
