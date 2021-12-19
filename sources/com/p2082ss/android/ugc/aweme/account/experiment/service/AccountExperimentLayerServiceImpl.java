package com.p2082ss.android.ugc.aweme.account.experiment.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.EnumC35462cf;
import com.p2082ss.android.ugc.aweme.IAccountExperimentLayerService;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;
import p4600h.p4619j.C89269g;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl */
public final class AccountExperimentLayerServiceImpl implements IAccountExperimentLayerService {

    /* renamed from: b */
    public static final C31664a f75735b = new C31664a((byte) 0);

    /* renamed from: a */
    public final Keva f75736a = Keva.getRepo("AccountExperimentLayers");

    /* renamed from: c */
    private final AbstractC89244h f75737c = C89250i.m154773a((AbstractC89171a) new C31665b(this));

    static {
        Covode.recordClassIndex(38395);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl$a */
    public static final class C31664a {
        static {
            Covode.recordClassIndex(38396);
        }

        private C31664a() {
        }

        public /* synthetic */ C31664a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountExperimentLayerService
    /* renamed from: a */
    public final boolean mo57061a() {
        return SettingsManager.m29616a().mo25400a("account_experiment_full_layer_allocation_override", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl$b */
    static final class C31665b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AccountExperimentLayerServiceImpl f75738a;

        static {
            Covode.recordClassIndex(38397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31665b(AccountExperimentLayerServiceImpl accountExperimentLayerServiceImpl) {
            super(0);
            this.f75738a = accountExperimentLayerServiceImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            if (this.f75738a.f75736a.contains("AccountExperimentLayers")) {
                return Boolean.valueOf(this.f75738a.f75736a.getBoolean("AccountExperimentLayers", false));
            }
            Boolean a = C49907s.m93685a();
            Keva keva = this.f75738a.f75736a;
            C89219l.m154716b(a, "");
            keva.storeBoolean("AccountExperimentLayers", a.booleanValue());
            return a;
        }
    }

    /* renamed from: b */
    public static IAccountExperimentLayerService m65977b() {
        MethodCollector.m26663i(10853);
        Object a = C81908b.m141854a(IAccountExperimentLayerService.class, false);
        if (a != null) {
            IAccountExperimentLayerService iAccountExperimentLayerService = (IAccountExperimentLayerService) a;
            MethodCollector.m26664o(10853);
            return iAccountExperimentLayerService;
        }
        if (C81908b.f183119B == null) {
            synchronized (IAccountExperimentLayerService.class) {
                try {
                    if (C81908b.f183119B == null) {
                        C81908b.f183119B = new AccountExperimentLayerServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10853);
                    throw th;
                }
            }
        }
        AccountExperimentLayerServiceImpl accountExperimentLayerServiceImpl = (AccountExperimentLayerServiceImpl) C81908b.f183119B;
        MethodCollector.m26664o(10853);
        return accountExperimentLayerServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountExperimentLayerService
    /* renamed from: a */
    public final boolean mo57062a(EnumC35462cf cfVar) {
        C89219l.m154721d(cfVar, "");
        boolean z = false;
        if (this.f75736a.contains(cfVar.getId())) {
            return this.f75736a.getBoolean(cfVar.getId(), false);
        }
        if (!cfVar.getShouldFilterProvider().invoke().booleanValue()) {
            return false;
        }
        if (cfVar.getNewUserOnly() && !((Boolean) this.f75737c.getValue()).booleanValue()) {
            return false;
        }
        if (cfVar.getPercentAllocation().f95693b <= 0 || cfVar.getPercentAllocation().f95693b > 100) {
            throw new IllegalArgumentException("Invalid allocation percentage");
        }
        boolean z2 = true;
        if (!cfVar.getPercentAllocation().f95692a) {
            if (C89271h.m154763a(new C89269g(1, 100), AbstractC89255c.Default) <= cfVar.getPercentAllocation().f95693b) {
                z = true;
            }
            z2 = z;
        }
        this.f75736a.storeBoolean(cfVar.getId(), z2);
        return z2;
    }
}
