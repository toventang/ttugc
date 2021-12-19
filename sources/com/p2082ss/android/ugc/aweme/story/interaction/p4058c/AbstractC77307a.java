package com.p2082ss.android.ugc.aweme.story.interaction.p4058c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.story.view.ReactionBubbleList;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.interaction.c.a */
public abstract class AbstractC77307a {

    /* renamed from: a */
    public String f173436a = "";

    /* renamed from: b */
    public final AbstractC17692b<C77309b> f173437b;

    /* renamed from: c */
    public final ReactionBubbleList f173438c;

    static {
        Covode.recordClassIndex(90326);
    }

    /* renamed from: a */
    public abstract void mo120906a(AbstractC89124d<? super AbstractC17700f<C77309b>> dVar);

    /* renamed from: a */
    public abstract void mo120907a(AbstractC89124d<? super AbstractC17700f<C77309b>> dVar, C77309b bVar);

    /* renamed from: a */
    public abstract boolean mo120908a();

    /* renamed from: b */
    public abstract void mo120909b();

    /* renamed from: c */
    public void mo120910c() {
        this.f173436a = "";
        this.f173438c.mo5599q();
    }

    public AbstractC77307a(ReactionBubbleList reactionBubbleList) {
        C89219l.m154721d(reactionBubbleList, "");
        this.f173438c = reactionBubbleList;
        C17693c cVar = new C17693c();
        cVar.f42319a = 10;
        cVar.f42320b = false;
        C773081 r2 = new AbstractC17692b<C77309b>(this, cVar) {
            /* class com.p2082ss.android.ugc.aweme.story.interaction.p4058c.AbstractC77307a.C773081 */

            /* renamed from: a */
            final /* synthetic */ AbstractC77307a f173439a;

            static {
                Covode.recordClassIndex(90327);
            }

            @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
            /* renamed from: a */
            public final void mo23345a(AbstractC89124d<? super AbstractC17700f<C77309b>> dVar) {
                C89219l.m154721d(dVar, "");
                this.f173439a.mo120906a(dVar);
            }

            {
                this.f173439a = r1;
            }

            @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
            /* renamed from: b */
            public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
                C77309b bVar = (C77309b) obj;
                C89219l.m154721d(dVar, "");
                C89219l.m154721d(bVar, "");
                this.f173439a.mo120907a(dVar, bVar);
            }
        };
        this.f173437b = r2;
        reactionBubbleList.mo28082a(r2);
        mo120909b();
    }

    /* renamed from: a */
    public void mo120905a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        Story story = aweme.getStory();
        if (story == null) {
            mo120910c();
        } else if (story.isOfficial() || story.isPublishing() || aweme.isProhibited()) {
            mo120910c();
        } else {
            String aid = aweme.getAid();
            C89219l.m154716b(aid, "");
            this.f173436a = aid;
            if (this.f173438c.getState().mo28134b() > 0) {
                this.f173438c.setVisibility(0);
            }
            this.f173437b.f42330c.mo28163e();
        }
    }
}
