package com.p2082ss.android.ugc.aweme.search.p3705s;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.api.C41854a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42427n;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42434p;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.lynx.C42424d;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41546r;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42097l;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42670am;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.search.p3696l.EnumC67634k;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.s.b */
public final class C67721b {

    /* renamed from: a */
    public static final C67721b f151784a = new C67721b();

    private C67721b() {
    }

    static {
        Covode.recordClassIndex(79366);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.s.b$a */
    public static final class RunnableC67722a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C67678d f151785a;

        static {
            Covode.recordClassIndex(79367);
        }

        RunnableC67722a(C67678d dVar) {
            this.f151785a = dVar;
        }

        public final void run() {
            String str;
            Object a;
            if (C42097l.f98147c <= 0 || C42097l.f98148d != C42097l.f98147c) {
                C67678d dVar = this.f151785a;
                C89219l.m154721d(dVar, "");
                C89219l.m154721d(dVar, "");
                C42427n.C42428a a2 = new C42427n.C42428a().mo71623a(dVar);
                String keyword = dVar.getKeyword();
                C89219l.m154716b(keyword, "");
                C42427n.C42428a d = a2.mo71624a(keyword).mo71621a(0).mo71626b(C42434p.f98892c).mo71628c(1).mo71630d(!C89219l.m154714a("correct_word", dVar.getSearchFrom()) ? 1 : 0);
                String enterMethod = dVar.getEnterMethod();
                if (enterMethod == null || enterMethod.length() == 0) {
                    str = dVar.getSearchFrom();
                } else {
                    str = dVar.getEnterMethod();
                }
                C89219l.m154716b(str, "");
                C42427n.C42428a f = d.mo71631d(str).mo71632e(AbstractC42670am.f99493H).mo71635g(dVar.getIsRichSug()).mo71636h(dVar.getSugUserId()).mo71634f(C41854a.m83837a());
                f.f98885a.f98881v = dVar.getWordType();
                C42427n a3 = f.mo71625a();
                C89219l.m154721d(a3, "");
                if (!C80580in.m139687c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C42097l.f98146b = currentTimeMillis;
                    if (currentTimeMillis - C42097l.f98146b >= 1000) {
                        if (C67641m.m119787a()) {
                            a = a3.mo71617b();
                        } else {
                            a = a3.mo71616a();
                        }
                        C42097l.f98145a.put(a3, new C89378p<>(a3, a));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m119889a(C67678d dVar) {
        C89219l.m154721d(dVar, "");
        dVar.getKeyword();
        Thread currentThread = Thread.currentThread();
        C89219l.m154716b(currentThread, "");
        currentThread.getName();
        EnumC67634k.INSTANCE.async(new RunnableC67722a(dVar));
        if (C41546r.m83483a()) {
            AbstractC67567q a = C67486am.m119564a();
            if (a == null || a.mo106426a() == 0) {
                String keyword = dVar.getKeyword();
                C89219l.m154716b(keyword, "");
                C42424d.m84790a(keyword);
            }
        }
    }
}
