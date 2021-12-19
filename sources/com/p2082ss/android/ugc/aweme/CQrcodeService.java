package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.CQrcodeService */
public final class CQrcodeService implements ICQrcodeService {
    static {
        Covode.recordClassIndex(37921);
    }

    @Override // com.p2082ss.android.ugc.aweme.ICQrcodeService
    /* renamed from: a */
    public final boolean mo57031a() {
        return C34260av.m70043a();
    }

    /* renamed from: b */
    public static ICQrcodeService m65222b() {
        MethodCollector.m26663i(14322);
        Object a = C81908b.m141854a(ICQrcodeService.class, false);
        if (a != null) {
            ICQrcodeService iCQrcodeService = (ICQrcodeService) a;
            MethodCollector.m26664o(14322);
            return iCQrcodeService;
        }
        if (C81908b.f183405n == null) {
            synchronized (ICQrcodeService.class) {
                try {
                    if (C81908b.f183405n == null) {
                        C81908b.f183405n = new CQrcodeService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(14322);
                    throw th;
                }
            }
        }
        CQrcodeService cQrcodeService = (CQrcodeService) C81908b.f183405n;
        MethodCollector.m26664o(14322);
        return cQrcodeService;
    }

    @Override // com.p2082ss.android.ugc.aweme.ICQrcodeService
    /* renamed from: a */
    public final void mo57030a(Activity activity) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(activity, "");
        Intent intent = new Intent(activity, CQRCodeFailActivity.class);
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }
}
