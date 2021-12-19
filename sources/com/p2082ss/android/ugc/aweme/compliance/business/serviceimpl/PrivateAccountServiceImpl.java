package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.p2082ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.PrivateAccountServiceImpl */
public final class PrivateAccountServiceImpl implements IPrivateAccountService {
    static {
        Covode.recordClassIndex(47231);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    /* renamed from: b */
    public final boolean mo68683b() {
        Boolean forcePrivateAccount;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (forcePrivateAccount = c.getForcePrivateAccount()) == null) {
            return false;
        }
        return forcePrivateAccount.booleanValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    /* renamed from: c */
    public final int mo68684c() {
        Integer notifyPrivateAccount;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (notifyPrivateAccount = c.getNotifyPrivateAccount()) == null) {
            return 0;
        }
        return notifyPrivateAccount.intValue();
    }

    /* renamed from: e */
    public static IPrivateAccountService m80280e() {
        MethodCollector.m26663i(9343);
        Object a = C81908b.m141854a(IPrivateAccountService.class, false);
        if (a != null) {
            IPrivateAccountService iPrivateAccountService = (IPrivateAccountService) a;
            MethodCollector.m26664o(9343);
            return iPrivateAccountService;
        }
        if (C81908b.f183151aG == null) {
            synchronized (IPrivateAccountService.class) {
                try {
                    if (C81908b.f183151aG == null) {
                        C81908b.f183151aG = new PrivateAccountServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9343);
                    throw th;
                }
            }
        }
        PrivateAccountServiceImpl privateAccountServiceImpl = (PrivateAccountServiceImpl) C81908b.f183151aG;
        MethodCollector.m26664o(9343);
        return privateAccountServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    /* renamed from: a */
    public final boolean mo68682a() {
        if (!C31575b.m65865g().isLogin()) {
            return false;
        }
        if (C39223a.m79595i().mo68683b() && !C31575b.m65865g().getCurUser().isSecret()) {
            ProfileServiceImpl.m114884g().newUserPresenter().mo103291a();
            SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().mo59940b(true);
        }
        if (C39223a.m79595i().mo68684c() <= 0 || C31575b.m65865g().getCurUser().isSecret()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService
    /* renamed from: d */
    public final void mo68685d() {
        ComplianceSetting complianceSetting;
        ComplianceSetting c = C39608b.f93371b.mo69034c();
        if (c == null || (complianceSetting = ComplianceSetting.copy$default(c, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33553407, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 33551359, null);
        }
        C39608b.m80415b(complianceSetting);
    }
}
