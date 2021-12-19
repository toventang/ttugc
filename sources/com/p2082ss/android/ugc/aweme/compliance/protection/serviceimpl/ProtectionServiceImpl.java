package com.p2082ss.android.ugc.aweme.compliance.protection.serviceimpl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39237h;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.C40061a;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a.C40067b;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.entity.C40104a;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.p2678a.C40093a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.C40106a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.serviceimpl.ProtectionServiceImpl */
public final class ProtectionServiceImpl implements IProtectionService {
    static {
        Covode.recordClassIndex(47886);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: g */
    public final void mo68710g() {
        C40074a.f94129d = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: f */
    public final boolean mo68709f() {
        return C40074a.f94129d;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: i */
    public final void mo68712i() {
        C40061a.m81025e();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: j */
    public final String mo68713j() {
        return C40106a.f94179a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: a */
    public final boolean mo68703a() {
        return C40061a.m81022b();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: b */
    public final int mo68705b() {
        return C40061a.m81024d();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: c */
    public final boolean mo68706c() {
        return C40061a.m81021a();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: k */
    public final AbstractC39237h mo68714k() {
        return new C40093a();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: h */
    public final int mo68711h() {
        if (C40074a.m81039b()) {
            return 1;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: e */
    public final void mo68708e() {
        C40104a aVar = C40074a.f94127b;
        if (aVar != null) {
            aVar.setRestrictModeSelf(false);
        }
        C40104a aVar2 = C40074a.f94127b;
        if (aVar2 != null) {
            aVar2.setTimeLockSelfInMin(0);
        }
        C40074a.m81038a(C40074a.f94127b);
        FamilyPiaringManager.f94145b.mo69223a((C40067b) null);
    }

    /* renamed from: l */
    public static IProtectionService m81109l() {
        MethodCollector.m26663i(1494);
        Object a = C81908b.m141854a(IProtectionService.class, false);
        if (a != null) {
            IProtectionService iProtectionService = (IProtectionService) a;
            MethodCollector.m26664o(1494);
            return iProtectionService;
        }
        if (C81908b.f183161aQ == null) {
            synchronized (IProtectionService.class) {
                try {
                    if (C81908b.f183161aQ == null) {
                        C81908b.f183161aQ = new ProtectionServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1494);
                    throw th;
                }
            }
        }
        ProtectionServiceImpl protectionServiceImpl = (ProtectionServiceImpl) C81908b.f183161aQ;
        MethodCollector.m26664o(1494);
        return protectionServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: d */
    public final boolean mo68707d() {
        IFamilyPairingService.EnumC39276a a = FamilyPiaringManager.m81048a();
        if (a == IFamilyPairingService.EnumC39276a.CHILD || a == IFamilyPairingService.EnumC39276a.UNLINK_LOCKED) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                return true;
            }
        }
        return C40074a.m81042e();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: a */
    public final void mo68702a(AbstractC39286a aVar) {
        C40061a.m81020a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: a */
    public final boolean mo68704a(AbstractC34709b<Boolean> bVar, String str) {
        C89219l.m154721d(str, "");
        return C40106a.m81128a(bVar, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService
    /* renamed from: a */
    public final void mo68701a(Context context, String str, Runnable runnable) {
        int i;
        if ((FamilyPiaringManager.m81048a() == IFamilyPairingService.EnumC39276a.CHILD || FamilyPiaringManager.m81048a() == IFamilyPairingService.EnumC39276a.UNLINK_LOCKED) && FamilyPiaringManager.m81052b()) {
            if (TextUtils.equals(str, "add_account")) {
                i = R.string.bqm;
            } else {
                i = R.string.bqp;
            }
            new C79459a(context).mo123050a(i).mo123053a();
        } else if (C40074a.m81039b()) {
            C40106a.m81128a(new C40061a.C40062a(runnable), str);
        } else {
            runnable.run();
        }
    }
}
