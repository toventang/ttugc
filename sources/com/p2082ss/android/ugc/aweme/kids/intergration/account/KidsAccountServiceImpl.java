package com.p2082ss.android.ugc.aweme.kids.intergration.account;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AbstractC40763cv;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.kids.api.account.AbstractC57152a;
import com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.p2082ss.android.ugc.aweme.kids.api.account.p3313a.AbstractC57153a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl */
public final class KidsAccountServiceImpl implements IAccountService.AbstractC31272b, IKidsAccountService {

    /* renamed from: a */
    private AbstractC57153a f131702a;

    static {
        Covode.recordClassIndex(67691);
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public final void onAccountResult(int i, boolean z, int i2, User user) {
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    /* renamed from: b */
    public final AbstractC57153a mo94318b() {
        return this.f131702a;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    /* renamed from: a */
    public final boolean mo94317a() {
        IAccountUserService b = C57719a.m104421b();
        C89219l.m154716b(b, "");
        return b.isLogin();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    /* renamed from: c */
    public final boolean mo94319c() {
        C57719a.m104420a();
        return C57719a.f131704a.mo57075k().getSaveLoginStatus();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    /* renamed from: d */
    public final boolean mo94320d() {
        C57719a.m104420a();
        return C57719a.f131704a.mo57075k().isOneKeyLoginExprimentEnable();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    /* renamed from: e */
    public final boolean mo94321e() {
        C57719a.m104420a();
        return C57719a.f131704a.mo57075k().isCurrentMethodAvaliable();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    /* renamed from: f */
    public final void mo94322f() {
        C57719a.m104420a();
        C57719a.f131704a.mo57066b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    /* renamed from: g */
    public final void mo94323g() {
        C57719a.m104420a();
        C57719a.f131704a.mo57064a(this);
    }

    public KidsAccountServiceImpl() {
        IAccountUserService b = C57719a.m104421b();
        C89219l.m154716b(b, "");
        User curUser = b.getCurUser();
        C89219l.m154716b(curUser, "");
        this.f131702a = new C57720b(curUser);
    }

    /* renamed from: h */
    public static IKidsAccountService m104406h() {
        MethodCollector.m26663i(8453);
        Object a = C81908b.m141854a(IKidsAccountService.class, false);
        if (a != null) {
            IKidsAccountService iKidsAccountService = (IKidsAccountService) a;
            MethodCollector.m26664o(8453);
            return iKidsAccountService;
        }
        if (C81908b.f183214bQ == null) {
            synchronized (IKidsAccountService.class) {
                try {
                    if (C81908b.f183214bQ == null) {
                        C81908b.f183214bQ = new KidsAccountServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8453);
                    throw th;
                }
            }
        }
        KidsAccountServiceImpl kidsAccountServiceImpl = (KidsAccountServiceImpl) C81908b.f183214bQ;
        MethodCollector.m26664o(8453);
        return kidsAccountServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl$a */
    public static final class C57718a implements AbstractC40763cv {

        /* renamed from: a */
        final /* synthetic */ AbstractC57152a f131703a;

        static {
            Covode.recordClassIndex(67692);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
        /* renamed from: a */
        public final void mo57507a(String str) {
        }

        C57718a(AbstractC57152a aVar) {
            this.f131703a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
        /* renamed from: a */
        public final void mo57508a(boolean z) {
            this.f131703a.mo94324a(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    /* renamed from: a */
    public final void mo94314a(AbstractC57152a aVar) {
        C89219l.m154721d(aVar, "");
        C57719a.m104421b().getSetPasswordStatus(new C57718a(aVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    /* renamed from: a */
    public final void mo94315a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C57719a.m104420a();
        C57719a.f131704a.mo57071g().logout(str, str2);
        this.f131702a = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    /* renamed from: a */
    public final void mo94316a(String str, boolean z) {
        C89219l.m154721d(str, "");
        C57719a.m104420a();
        C57719a.f131704a.mo57075k().updateMethodInfo(str, Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    /* renamed from: a */
    public final void mo94313a(Activity activity, String str, String str2, Bundle bundle) {
        C57719a.m104420a();
        C57719a.f131704a.mo57073i().changePassword(activity, str, str2, bundle, null);
    }
}
