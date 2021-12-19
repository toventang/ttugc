package com.p2082ss.android.ugc.aweme.publish.p3624h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65677j;
import com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.p3616a.C65531b;
import com.p2082ss.android.ugc.aweme.publish.p3618e.C65607a;
import com.p2082ss.android.ugc.aweme.settings.C68746l;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.ttuploader.UploadEventManager;
import org.json.JSONArray;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.publish.h.g */
final class C65652g implements AbstractC65677j {
    static {
        Covode.recordClassIndex(77143);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65677j
    /* renamed from: a */
    public final JSONArray mo104816a() {
        JSONArray popAllImageEvents = ((UploadEventManager) new C65531b().f147765a.getValue()).popAllImageEvents();
        if (popAllImageEvents == null) {
            return new JSONArray();
        }
        return popAllImageEvents;
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65677j
    /* renamed from: a */
    public final void mo104818a(String str, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(th, "");
        C65607a.m117398a(str, th);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65677j
    /* renamed from: a */
    public final void mo104817a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (C68746l.m121179a()) {
            StringBuilder append = new StringBuilder("[stage-").append(str).append("][thread-");
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            C84911q.m145922a("Tiktok-Publish", C89361p.m154824c(append.append(currentThread.getName()).append("] ").append(str2).toString(), C65607a.f147848a));
        }
    }
}
