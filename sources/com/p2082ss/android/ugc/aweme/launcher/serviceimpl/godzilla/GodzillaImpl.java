package com.p2082ss.android.ugc.aweme.launcher.serviceimpl.godzilla;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.platform.godzilla.C21680a;
import com.bytedance.platform.godzilla.p1575b.C21694a;
import com.bytedance.platform.godzilla.p1585c.EnumC21720d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.utils.C80341df;

/* renamed from: com.ss.android.ugc.aweme.launcher.serviceimpl.godzilla.GodzillaImpl */
public final class GodzillaImpl implements IGodzillaApi {
    static {
        Covode.recordClassIndex(68135);
    }

    /* renamed from: b */
    public static IGodzillaApi m104978b() {
        MethodCollector.m26663i(1666);
        Object a = C81908b.m141854a(IGodzillaApi.class, false);
        if (a != null) {
            IGodzillaApi iGodzillaApi = (IGodzillaApi) a;
            MethodCollector.m26664o(1666);
            return iGodzillaApi;
        }
        if (C81908b.f183278cb == null) {
            synchronized (IGodzillaApi.class) {
                try {
                    if (C81908b.f183278cb == null) {
                        C81908b.f183278cb = new GodzillaImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1666);
                    throw th;
                }
            }
        }
        GodzillaImpl godzillaImpl = (GodzillaImpl) C81908b.f183278cb;
        MethodCollector.m26664o(1666);
        return godzillaImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi
    /* renamed from: a */
    public final void mo95585a() {
        if (C58152b.m105084b() && !C67214a.m119159i()) {
            C80341df.m139299a(C17879g.m33104a());
        }
        if (!C80341df.f179871a) {
            return;
        }
        if (C21680a.f51447a != null) {
            C21680a.f51447a.mo35336a(EnumC21720d.REGISTER_EXCEPTION);
            if (C58152b.m105088f() && C17879g.m33104a() != null) {
                new C21694a(C17879g.m33104a()).mo35350a();
                return;
            }
            return;
        }
        throw new RuntimeException("Godzilla.init() method must be called first");
    }
}
