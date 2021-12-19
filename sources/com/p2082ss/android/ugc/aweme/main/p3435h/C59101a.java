package com.p2082ss.android.ugc.aweme.main.p3435h;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69908cb;
import com.p2082ss.android.ugc.aweme.shortvideo.View$OnClickListenerC70004cq;

/* renamed from: com.ss.android.ugc.aweme.main.h.a */
public final class C59101a {
    static {
        Covode.recordClassIndex(69451);
    }

    /* renamed from: a */
    public static boolean m108578a() {
        if (!AVExternalServiceImpl.m113114a().publishService().isPublishable()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m108579b(ActivityC0945e eVar) {
        if (eVar != null) {
            Fragment a = eVar.getSupportFragmentManager().mo3551a("publish");
            if (a instanceof View$OnClickListenerC70004cq) {
                ((View$OnClickListenerC70004cq) a).mo110447b();
            } else if (a instanceof C69908cb) {
                ((C69908cb) a).mo110320b();
            }
        }
    }

    /* renamed from: a */
    public static void m108577a(ActivityC0945e eVar) {
        if (eVar != null) {
            IAVPublishService publishService = AVExternalServiceImpl.m113114a().publishService();
            if (publishService.isParallelPublishEnabled()) {
                if (publishService.getAllPublishModel().size() > 0) {
                    Fragment a = eVar.getSupportFragmentManager().mo3551a("publish");
                    if (a instanceof View$OnClickListenerC70004cq) {
                        ((View$OnClickListenerC70004cq) a).mo110446a();
                    } else if (a instanceof C69908cb) {
                        ((C69908cb) a).mo110319a();
                    }
                }
            } else if (m108578a()) {
                Fragment a2 = eVar.getSupportFragmentManager().mo3551a("publish");
                if (a2 instanceof View$OnClickListenerC70004cq) {
                    ((View$OnClickListenerC70004cq) a2).mo110446a();
                } else if (a2 instanceof C69908cb) {
                    ((C69908cb) a2).mo110319a();
                }
            }
        }
    }
}
