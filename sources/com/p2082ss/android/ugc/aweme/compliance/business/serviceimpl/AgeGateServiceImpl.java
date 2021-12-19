package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.p2082ss.android.ugc.aweme.compliance.api.services.depend.C39275a;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.compliance.common.p2661b.C39614a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl */
public final class AgeGateServiceImpl implements IAgeGateService {

    /* renamed from: a */
    public static final C39520a f93217a = new C39520a((byte) 0);

    /* renamed from: b */
    private final Keva f93218b = Keva.getRepo("age_gate_service_repo");

    static {
        Covode.recordClassIndex(47213);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl$a */
    public static final class C39520a {
        static {
            Covode.recordClassIndex(47214);
        }

        private C39520a() {
        }

        public /* synthetic */ C39520a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    /* renamed from: d */
    public final boolean mo68585d() {
        return this.f93218b.getBoolean("age_gate_completed", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    /* renamed from: b */
    public final void mo68583b() {
        Activity j;
        if (C80580in.m139691e() && (j = C17873f.m33102j()) != null && !C39275a.m79779a().mo68103a()) {
            C31575b.m65862d().mo57198a(j);
        }
    }

    /* renamed from: e */
    public static IAgeGateService m80208e() {
        MethodCollector.m26663i(9654);
        Object a = C81908b.m141854a(IAgeGateService.class, false);
        if (a != null) {
            IAgeGateService iAgeGateService = (IAgeGateService) a;
            MethodCollector.m26664o(9654);
            return iAgeGateService;
        }
        if (C81908b.f183195ay == null) {
            synchronized (IAgeGateService.class) {
                try {
                    if (C81908b.f183195ay == null) {
                        C81908b.f183195ay = new AgeGateServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9654);
                    throw th;
                }
            }
        }
        AgeGateServiceImpl ageGateServiceImpl = (AgeGateServiceImpl) C81908b.f183195ay;
        MethodCollector.m26664o(9654);
        return ageGateServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    /* renamed from: a */
    public final int mo68581a() {
        if (GuestModeServiceImpl.m65990d().mo57219c() || MultiAccountService.m65945c().mo57226b()) {
            return 0;
        }
        if (C39608b.m80417c() > 0) {
            return C39608b.m80417c();
        }
        return 2;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    /* renamed from: c */
    public final boolean mo68584c() {
        Long valueOf;
        if (C39608b.m80417c() != 1) {
            return false;
        }
        C39614a aVar = C39608b.f93371b;
        if (aVar.f93394f != null) {
            valueOf = aVar.f93394f;
        } else {
            valueOf = Long.valueOf(aVar.f93389a.getLong("age_gate_block_device_register_expire_time", 0));
        }
        if (valueOf == null) {
            return false;
        }
        long longValue = valueOf.longValue();
        if (longValue <= 0 || System.currentTimeMillis() / 1000 > longValue) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    /* renamed from: a */
    public final void mo68582a(boolean z) {
        if (z) {
            this.f93218b.storeBoolean("age_gate_completed", true);
        } else {
            this.f93218b.erase("age_gate_completed");
        }
    }
}
