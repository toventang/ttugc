package com.p2082ss.android.ugc.aweme.comment.barrage.p2488c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.p2082ss.android.ugc.aweme.comment.barrage.view.AwemeCommentBubbleList;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.c.a */
public abstract class AbstractC36318a {

    /* renamed from: a */
    public String f85849a = "";

    /* renamed from: b */
    public final AwemeCommentBubbleList f85850b;

    /* renamed from: c */
    private final AbstractC17692b<C36320b> f85851c;

    static {
        Covode.recordClassIndex(43595);
    }

    /* renamed from: a */
    public abstract void mo63562a();

    /* renamed from: a */
    public abstract void mo63564a(AbstractC89124d<? super AbstractC17700f<C36320b>> dVar);

    /* renamed from: a */
    public abstract void mo63565a(AbstractC89124d<? super AbstractC17700f<C36320b>> dVar, C36320b bVar);

    /* renamed from: b */
    public void mo63566b() {
        this.f85849a = "";
        this.f85850b.mo5599q();
    }

    /* renamed from: c */
    public final void mo63567c() {
        this.f85850b.mo5599q();
        this.f85851c.f42330c.mo28163e();
    }

    public AbstractC36318a(AwemeCommentBubbleList awemeCommentBubbleList) {
        C89219l.m154721d(awemeCommentBubbleList, "");
        this.f85850b = awemeCommentBubbleList;
        C17693c cVar = new C17693c();
        cVar.f42319a = 10;
        cVar.f42320b = false;
        C363191 r2 = new AbstractC17692b<C36320b>(this, cVar) {
            /* class com.p2082ss.android.ugc.aweme.comment.barrage.p2488c.AbstractC36318a.C363191 */

            /* renamed from: a */
            final /* synthetic */ AbstractC36318a f85852a;

            static {
                Covode.recordClassIndex(43596);
            }

            @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
            /* renamed from: a */
            public final void mo23345a(AbstractC89124d<? super AbstractC17700f<C36320b>> dVar) {
                C89219l.m154721d(dVar, "");
                this.f85852a.mo63564a(dVar);
            }

            {
                this.f85852a = r1;
            }

            @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
            /* renamed from: b */
            public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
                C36320b bVar = (C36320b) obj;
                C89219l.m154721d(dVar, "");
                C89219l.m154721d(bVar, "");
                this.f85852a.mo63565a(dVar, bVar);
            }
        };
        this.f85851c = r2;
        awemeCommentBubbleList.mo28082a(r2);
        mo63562a();
    }

    /* renamed from: a */
    public void mo63563a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        String aid = aweme.getAid();
        C89219l.m154716b(aid, "");
        this.f85849a = aid;
        if (this.f85850b.getState().mo28134b() > 0) {
            this.f85850b.setVisibility(0);
        }
        this.f85851c.f42330c.mo28163e();
    }
}
