package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27242j;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.aw */
final /* synthetic */ class C69845aw implements AbstractC74318j {

    /* renamed from: a */
    private final C69844av f156086a;

    static {
        Covode.recordClassIndex(82253);
    }

    C69845aw(C69844av avVar) {
        this.f156086a = avVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74318j
    /* renamed from: a */
    public final void mo108517a(String str, String str2, String str3, int i) {
        AbstractC88979t a;
        C69844av avVar = this.f156086a;
        C73991bj.m130128a("MultiEditLog: concat statusCode".concat(String.valueOf(i)));
        C73975b.C73976a.f166071a.step("av_video_edit", "concatEnd");
        C78596f fVar = new C78596f(str, str2, str3, i);
        avVar.f156082h.f166637k.mo116642b();
        avVar.f156079e++;
        AbstractC88979t<AbstractC27242j<C70625d>> a2 = C69844av.m123415a(avVar.f156083i);
        ShortVideoContext shortVideoContext = avVar.f156083i;
        String str4 = fVar.f176641c;
        if (shortVideoContext.mo110022c()) {
            a = AbstractC88979t.m154294a(C69848az.f156090a);
        } else {
            a = AbstractC88979t.m154294a(new C69851ba(avVar, shortVideoContext, str4)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
        }
        AbstractC88979t.m154298a(a2, a, AbstractC88979t.m154294a(new C69853bc(avVar, fVar)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)), C69846ax.f156087a).mo143254a(new C69847ay(avVar, fVar), C73984bd.C73985a.f166080a);
    }
}
