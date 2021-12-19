package com.p2082ss.android.ugc.aweme.compliance.protection.serviceimpl;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.DialogC17223o;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.C40061a;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a.C40067b;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a.C40068c;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.C40087a;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.C40089b;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.serviceimpl.FamilyPairingServiceImpl */
public final class FamilyPairingServiceImpl implements IFamilyPairingService {
    static {
        Covode.recordClassIndex(47885);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    /* renamed from: a */
    public final IFamilyPairingService.EnumC39276a mo68649a() {
        return FamilyPiaringManager.m81048a();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    /* renamed from: b */
    public final AbstractC36109j mo68652b() {
        return new C40089b();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    /* renamed from: c */
    public final AbstractC36109j mo68654c() {
        return new C40087a();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    /* renamed from: d */
    public final IInterceptor mo68655d() {
        return new C40087a();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    /* renamed from: e */
    public final boolean mo68656e() {
        C40068c cVar;
        Integer num;
        C40067b bVar = FamilyPiaringManager.f94144a;
        if (bVar == null || (cVar = bVar.f94115b) == null || (num = cVar.f94118c) == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static IFamilyPairingService m81100f() {
        MethodCollector.m26663i(1571);
        Object a = C81908b.m141854a(IFamilyPairingService.class, false);
        if (a != null) {
            IFamilyPairingService iFamilyPairingService = (IFamilyPairingService) a;
            MethodCollector.m26664o(1571);
            return iFamilyPairingService;
        }
        if (C81908b.f183160aP == null) {
            synchronized (IFamilyPairingService.class) {
                try {
                    if (C81908b.f183160aP == null) {
                        C81908b.f183160aP = new FamilyPairingServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1571);
                    throw th;
                }
            }
        }
        FamilyPairingServiceImpl familyPairingServiceImpl = (FamilyPairingServiceImpl) C81908b.f183160aP;
        MethodCollector.m26664o(1571);
        return familyPairingServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    /* renamed from: a */
    public final boolean mo68651a(String str) {
        return FamilyPiaringManager.m81050a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    /* renamed from: a */
    public final void mo68650a(Activity activity) {
        if (activity == null) {
            return;
        }
        if (!C40061a.m81026f()) {
            new C79459a(activity).mo123052a(activity.getString(R.string.bop)).mo123053a();
            return;
        }
        DialogC17223o oVar = new DialogC17223o(activity);
        oVar.show();
        C40061a.m81020a(new C40061a.C40063b(oVar, activity));
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService
    /* renamed from: b */
    public final void mo68653b(Activity activity) {
        if (!C40061a.m81026f()) {
            new C79459a(activity).mo123052a(activity.getString(R.string.bop)).mo123053a();
            return;
        }
        DialogC17223o oVar = new DialogC17223o(activity);
        oVar.show();
        C40061a.m81020a(new C40061a.C40064c(oVar, activity));
    }
}
