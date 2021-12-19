package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55050c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.b */
public final class C53635b {

    /* renamed from: a */
    public static AbstractC17434e f123059a;

    /* renamed from: b */
    public static final C53635b f123060b = new C53635b();

    private C53635b() {
    }

    static {
        Covode.recordClassIndex(63215);
    }

    /* renamed from: a */
    public static boolean m98893a() {
        if (C16048b.m29633a().mo25412a(true, "im_preload_strategy", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.b$a */
    static final class RunnableC53636a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56245a f123061a;

        static {
            Covode.recordClassIndex(63216);
        }

        RunnableC53636a(C56245a aVar) {
            this.f123061a = aVar;
        }

        public final void run() {
            C56244a.m102190b("ImPreloadHelper", "create messageModel begin");
            String sessionId = this.f123061a.getSessionId();
            if (sessionId != null && sessionId.length() > 0) {
                String sessionId2 = this.f123061a.getSessionId();
                if (sessionId2 == null) {
                    C89219l.m154715b();
                }
                AbstractC17434e a = AbstractC17434e.C17435a.m32338a(sessionId2, ReadStateViewModel.f124327b);
                C53635b.f123059a = a;
                if (a != null) {
                    a.mo27765f();
                }
            }
            C56244a.m102190b("ImPreloadHelper", "create messageModel end");
        }
    }

    /* renamed from: a */
    public static void m98892a(C56245a aVar) {
        C89219l.m154721d(aVar, "");
        if (C55050c.m100668a()) {
            C58254p.f132679a.post(new RunnableC53636a(aVar));
        }
    }
}
