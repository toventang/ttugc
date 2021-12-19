package com.p2082ss.android.ugc.tiktok.location.serviceimpl;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.tiktok.location.p4330a.C84309b;
import com.p2082ss.android.ugc.tiktok.location.p4330a.C84311c;
import com.p2082ss.android.ugc.tiktok.location.p4330a.C84325f;
import com.p2082ss.android.ugc.tiktok.location.p4331b.C84328b;
import com.p2082ss.android.ugc.tiktok.location.task.InitLocationTask;
import com.p2082ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl */
public final class LocationServiceImpl implements ILocationService {
    static {
        Covode.recordClassIndex(98267);
    }

    @Override // com.p2082ss.android.ugc.tiktok.location_api.service.ILocationService
    /* renamed from: a */
    public final AbstractC58264w mo129339a() {
        return new InitLocationTask();
    }

    @Override // com.p2082ss.android.ugc.tiktok.location_api.service.ILocationService
    /* renamed from: b */
    public final int mo129343b() {
        return C16048b.m29633a().mo25412a(false, "request_location_permission", 0);
    }

    /* renamed from: c */
    public static ILocationService m145036c() {
        MethodCollector.m26663i(3051);
        Object a = C81908b.m141854a(ILocationService.class, false);
        if (a != null) {
            ILocationService iLocationService = (ILocationService) a;
            MethodCollector.m26664o(3051);
            return iLocationService;
        }
        if (C81908b.f183365eI == null) {
            synchronized (ILocationService.class) {
                try {
                    if (C81908b.f183365eI == null) {
                        C81908b.f183365eI = new LocationServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3051);
                    throw th;
                }
            }
        }
        LocationServiceImpl locationServiceImpl = (LocationServiceImpl) C81908b.f183365eI;
        MethodCollector.m26664o(3051);
        return locationServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.tiktok.location_api.service.ILocationService
    /* renamed from: a */
    public final void mo129342a(boolean z) {
        C84309b.f188530a = z;
    }

    @Override // com.p2082ss.android.ugc.tiktok.location_api.service.ILocationService
    /* renamed from: a */
    public final void mo129340a(AbstractC13343d dVar) {
        C89219l.m154721d(dVar, "");
        if (!C13153b.m23674b()) {
            C84328b.m145031a(dVar);
        }
    }

    @Override // com.p2082ss.android.ugc.tiktok.location_api.service.ILocationService
    /* renamed from: a */
    public final void mo129341a(String str, ActivityC0945e eVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str) && eVar != null && C84309b.m145007a() == 3 && !C84325f.f188556b) {
            Set<String> set = C84325f.f188555a;
            if (!set.contains(str)) {
                if (set.size() >= 3) {
                    C84311c.m145009a(eVar);
                    C84325f.f188556b = true;
                }
                C89219l.m154721d(str, "");
                if (!C84325f.f188555a.contains(str)) {
                    C84325f.f188555a.add(str);
                }
            }
        }
    }
}
