package com.p2082ss.android.ugc.aweme.question.p3665g;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.aweme.translation.api.TranslationApi;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79027a;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79030c;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.g.d */
public final class RunnableC66534d implements Runnable {

    /* renamed from: a */
    public final C66504c f149604a;

    /* renamed from: b */
    private final C66530a f149605b;

    static {
        Covode.recordClassIndex(78077);
    }

    public final void run() {
        try {
            C27646l.m55298a(TranslationApi.m137860a(this.f149605b.f149593b, new C27910f().mo46674b(this.f149605b.f149592a), 4), new C66535a(this), ExecutorC34605m.f81660a);
        } catch (Exception e) {
            e.printStackTrace();
            mo105522a(new Exception());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.g.d$a */
    public static final class C66535a implements AbstractC27645k<C79027a> {

        /* renamed from: a */
        final /* synthetic */ RunnableC66534d f149606a;

        static {
            Covode.recordClassIndex(78078);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C66535a(RunnableC66534d dVar) {
            this.f149606a = dVar;
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onFailure(Throwable th) {
            C89219l.m154721d(th, "");
            this.f149606a.mo105522a(th);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final /* synthetic */ void onSuccess(C79027a aVar) {
            List<C79030c> list;
            C79030c cVar;
            C79027a aVar2 = aVar;
            if (aVar2 != null) {
                list = aVar2.f177634a;
            } else {
                list = null;
            }
            if (!C13603b.m24435a((Collection) list) && list != null && (cVar = list.get(0)) != null) {
                RunnableC66534d dVar = this.f149606a;
                CommentService e = CommentServiceImpl.m73664e();
                String str = cVar.f177641a;
                C89219l.m154716b(str, "");
                dVar.f149604a.setContent(e.mo63301b(str));
                this.f149606a.f149604a.setTranslated(true);
                C66533c.m118280a().mo105521a(this.f149606a.f149604a, false);
                C66533c a = C66533c.m118280a();
                C66504c cVar2 = this.f149606a.f149604a;
                if (cVar2 != null) {
                    a.f149600a.put(cVar2.getId().toString(), cVar2.clone());
                }
                C33943c<C66532b> a2 = C66533c.m118280a().mo105518a(String.valueOf(this.f149606a.f149604a.getId()));
                C89219l.m154716b(a2, "");
                a2.setValue(new C66532b(this.f149606a.f149604a, true));
            }
        }
    }

    /* renamed from: a */
    public final void mo105522a(Throwable th) {
        C66533c.m118280a().mo105521a(this.f149604a, false);
        C66532b bVar = new C66532b(this.f149604a, false);
        if (th instanceof Exception) {
            bVar.f149598c = (Exception) th;
        }
        C33943c<C66532b> a = C66533c.m118280a().mo105518a(String.valueOf(this.f149604a.getId()));
        C89219l.m154716b(a, "");
        a.setValue(bVar);
    }

    public RunnableC66534d(C66504c cVar, C66530a aVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        this.f149604a = cVar;
        this.f149605b = aVar;
    }
}
