package com.p2082ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74318j;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73984bd;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.C78596f;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.k */
final /* synthetic */ class C67926k implements AbstractC74318j {

    /* renamed from: a */
    private final C67925j f152169a;

    static {
        Covode.recordClassIndex(80095);
    }

    C67926k(C67925j jVar) {
        this.f152169a = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74318j
    /* renamed from: a */
    public final void mo108517a(String str, String str2, String str3, int i) {
        AbstractC88979t a;
        C67925j jVar = this.f152169a;
        C73991bj.m130128a("MultiEditLog: concat statusCode".concat(String.valueOf(i)));
        C73975b.C73976a.f166071a.step("av_video_edit", "concatEnd");
        C78596f fVar = new C78596f(str, str2, str3, i);
        jVar.f152160h.f166637k.mo116642b();
        jVar.f152157e++;
        AbstractC88979t a2 = AbstractC88979t.m154294a(new C67931p(jVar.f152161i));
        ShortVideoContext shortVideoContext = jVar.f152161i;
        String str4 = fVar.f176641c;
        if (shortVideoContext.mo110022c()) {
            a = AbstractC88979t.m154294a(C67929n.f152173a);
        } else {
            a = AbstractC88979t.m154294a(new C67930o(jVar, shortVideoContext, str4)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        }
        AbstractC88979t.m154298a(a2, a, AbstractC88979t.m154294a(new C67932q(jVar, fVar)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)), C67927l.f152170a).mo143254a(new C67928m(jVar, fVar), C73984bd.C73985a.f166080a);
    }
}
