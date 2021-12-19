package com.p2082ss.android.ugc.aweme.notification.p3521c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62339d;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62341f;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33368e;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.c.c */
public final class C61919c implements AbstractC62329c {

    /* renamed from: a */
    public static final C61920a f140573a = new C61920a((byte) 0);

    static {
        Covode.recordClassIndex(72668);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.c.c$a */
    public static final class C61920a {
        static {
            Covode.recordClassIndex(72669);
        }

        private C61920a() {
        }

        public /* synthetic */ C61920a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c
    /* renamed from: a */
    public final boolean mo100002a(C62341f fVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(fVar, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c
    /* renamed from: a */
    public final void mo100001a(C62339d dVar) {
        C61621c cVar;
        String str;
        AbstractC33368e a;
        C89219l.m154721d(dVar, "");
        C61630e eVar = dVar.f141467a.templateNotice;
        if (eVar != null && (cVar = eVar.f139886b) != null && (str = cVar.f139854o) != null) {
            List<String> a2 = C89070n.m154516a(Uri.parse(str).getQueryParameter("channel"));
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (f != null && (a = f.mo59376a()) != null) {
                a.mo59418c(a2);
            }
        }
    }
}
