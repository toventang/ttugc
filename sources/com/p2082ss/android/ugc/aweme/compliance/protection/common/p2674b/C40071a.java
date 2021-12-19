package com.p2082ss.android.ugc.aweme.compliance.protection.common.p2674b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.teenmode.AbstractC39286a;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.C40061a;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a.C40066a;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a.C40067b;
import com.p2082ss.android.ugc.aweme.compliance.protection.common.p2673a.C40069d;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.EnumC40076b;
import com.p2082ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.C40091a;
import com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.entity.C40104a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Objects;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.b.a */
public final class C40071a {
    static {
        Covode.recordClassIndex(47843);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.b.a$b */
    public static final class C40073b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC39286a f94125a;

        static {
            Covode.recordClassIndex(47845);
        }

        public C40073b(AbstractC39286a aVar) {
            this.f94125a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C40061a.f94103a = false;
            C39617a.m80456a("/tiktok/v1/compliance/guadig/settings/", 1);
            AbstractC39286a aVar = this.f94125a;
            if (aVar != null) {
                Objects.requireNonNull(th, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                aVar.mo68716a((Exception) th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.common.b.a$a */
    public static final class C40072a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC39286a f94124a;

        static {
            Covode.recordClassIndex(47844);
        }

        public C40072a(AbstractC39286a aVar) {
            this.f94124a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            boolean z2;
            int i;
            EnumC40076b bVar;
            Integer num;
            Integer num2;
            C40069d dVar = (C40069d) obj;
            if (dVar != null) {
                if (dVar.status_code == 0) {
                    C39617a.m80456a("/tiktok/v1/compliance/guadig/settings/", 0);
                    FamilyPiaringManager familyPiaringManager = FamilyPiaringManager.f94145b;
                    C40067b bVar2 = dVar.f94119a;
                    boolean b = C40061a.m81022b();
                    C40067b bVar3 = FamilyPiaringManager.f94144a;
                    familyPiaringManager.mo69223a(bVar2);
                    boolean b2 = FamilyPiaringManager.m81052b();
                    if (FamilyPiaringManager.m81051b(bVar3) != IFamilyPairingService.EnumC39276a.CHILD || FamilyPiaringManager.m81048a() == IFamilyPairingService.EnumC39276a.CHILD) {
                        if (FamilyPiaringManager.m81048a() == IFamilyPairingService.EnumC39276a.CHILD && b2 != b) {
                            FamilyPiaringManager.m81049a(b2);
                        }
                    } else if (FamilyPiaringManager.m81048a() != IFamilyPairingService.EnumC39276a.UNLINK_LOCKED && b) {
                        FamilyPiaringManager.m81049a(false);
                    }
                    C40066a aVar = dVar.f94120b;
                    C40104a aVar2 = C40074a.f94127b;
                    if (aVar2 != null) {
                        z = aVar2.isRestrictModeSelf();
                    } else {
                        z = false;
                    }
                    if (aVar == null || (num2 = aVar.f94113b) == null || num2.intValue() != 1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (aVar == null || (num = aVar.f94112a) == null) {
                        i = 0;
                    } else {
                        i = num.intValue();
                    }
                    C40074a.f94127b = new C40104a(z2, i);
                    boolean b3 = C40074a.m81039b();
                    if (C40091a.m81077a()) {
                        if (b3) {
                            bVar = EnumC40076b.OPEN;
                        } else {
                            bVar = EnumC40076b.CLOSE;
                        }
                        C40074a.m81037a(bVar);
                    }
                    if (b3 != z) {
                        IAccountUserService g = C31575b.m65865g();
                        C89219l.m154716b(g, "");
                        User curUser = g.getCurUser();
                        C89219l.m154716b(curUser, "");
                        if (!curUser.isUserCancelled()) {
                            C40061a.m81025e();
                            C40061a.m81020a(null);
                        } else {
                            C40074a.f94129d = true;
                        }
                    }
                    C40074a.m81038a(C40074a.f94127b);
                    AbstractC39286a aVar3 = this.f94124a;
                    if (aVar3 != null) {
                        aVar3.mo68715a();
                    }
                } else {
                    C39617a.m80456a("/tiktok/v1/compliance/guadig/settings/", 1);
                }
            }
            C40061a.f94103a = false;
        }
    }
}
