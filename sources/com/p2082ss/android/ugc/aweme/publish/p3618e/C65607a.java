package com.p2082ss.android.ugc.aweme.publish.p3618e;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.settings.C68746l;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.publish.e.a */
public final class C65607a {

    /* renamed from: a */
    public static final int f147848a = SettingsManager.m29616a().mo25394a("studio_publish_log_max_length", 1000);

    /* renamed from: b */
    public static final C65607a f147849b = new C65607a();

    private C65607a() {
    }

    static {
        Covode.recordClassIndex(77098);
    }

    /* renamed from: a */
    public static void m117398a(String str, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(th, "");
        if (C68746l.m121179a()) {
            StringBuilder append = new StringBuilder("[stage-").append(str).append("][thread-");
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            C84911q.m145922a("Tiktok-Publish", C89361p.m154824c(append.append(currentThread.getName()).append("] ").append(Log.getStackTraceString(th)).toString(), f147848a));
        }
    }
}
