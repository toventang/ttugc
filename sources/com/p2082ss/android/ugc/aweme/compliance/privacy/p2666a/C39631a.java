package com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39258q;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39672g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.a.a */
public final class C39631a {

    /* renamed from: a */
    public static final C39631a f93412a = new C39631a();

    private C39631a() {
    }

    static {
        Covode.recordClassIndex(47350);
    }

    /* renamed from: f */
    public static IAccountService m80490f() {
        IAccountService a = AccountService.m65215a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static String m80484a() {
        IAccountUserService e;
        IAccountService a = AccountService.m65215a();
        if (a == null || (e = a.mo57069e()) == null) {
            return null;
        }
        return e.getCurUserId();
    }

    /* renamed from: c */
    public static boolean m80487c() {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        User curUser = e.getCurUser();
        C89219l.m154716b(curUser, "");
        return curUser.isForcePrivateAccount();
    }

    /* renamed from: d */
    public static boolean m80488d() {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        return e.isLogin();
    }

    /* renamed from: e */
    public static User m80489e() {
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        User curUser = e.getCurUser();
        C89219l.m154716b(curUser, "");
        return curUser;
    }

    /* renamed from: b */
    public static boolean m80486b() {
        Boolean bool;
        boolean z;
        C39258q b = C39659b.m80540b();
        String str = null;
        if (b != null) {
            if (b.f92749h == 1) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        IAccountUserService e = AccountService.m65215a().mo57069e();
        C89219l.m154716b(e, "");
        User curUser = e.getCurUser();
        C89219l.m154716b(curUser, "");
        boolean isSecret = curUser.isSecret();
        boolean a = C89219l.m154714a(Boolean.valueOf(isSecret), bool);
        C89378p[] pVarArr = new C89378p[3];
        pVarArr[0] = C89387v.m154943a("fromProfile", Boolean.valueOf(isSecret));
        pVarArr[1] = C89387v.m154943a("fromPrivate", bool);
        LogPbBean logPbBean = C39672g.f93487b;
        if (logPbBean != null) {
            str = logPbBean.getImprId();
        }
        pVarArr[2] = C89387v.m154943a("logId", str);
        C39617a.m80458a("pri_acc_val_check", a, C89041ag.m154421a(pVarArr));
        return isSecret;
    }

    /* renamed from: a */
    public static void m80485a(boolean z) {
        AccountService.m65215a().mo57069e().updateCurAdAuthorization(z);
    }
}
