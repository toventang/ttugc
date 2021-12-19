package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.p4201b.C80234a;
import org.greenrobot.eventbus.EventBus;

/* renamed from: com.ss.android.ugc.aweme.utils.cg */
public final class C80298cg {
    static {
        Covode.recordClassIndex(93566);
    }

    /* renamed from: a */
    public static void m139204a(Object obj) {
        C80234a.m139070a(new C80299ch(obj));
        if (!EventBus.m156962a().mo145393a(obj)) {
            C80234a.m139070a(new C80300ci(obj));
            EventBus.m156966a(EventBus.m156962a(), obj);
        }
    }

    /* renamed from: b */
    public static void m139205b(Object obj) {
        C80234a.m139070a(new C80301cj(obj));
        if (EventBus.m156962a().mo145393a(obj)) {
            C80234a.m139070a(new C80302ck(obj));
            EventBus.m156962a().mo145395b(obj);
        }
    }
}
