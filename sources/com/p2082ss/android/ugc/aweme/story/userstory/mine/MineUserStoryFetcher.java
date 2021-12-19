package com.p2082ss.android.ugc.aweme.story.userstory.mine;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.story.model.C77387j;
import com.p2082ss.android.ugc.aweme.story.userstory.C77694c;
import java.util.List;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher */
public final class MineUserStoryFetcher implements Object<Aweme> {

    /* renamed from: a */
    public final C88411a f174259a;

    /* renamed from: b */
    public final AbstractC1196i f174260b;

    static {
        Covode.recordClassIndex(90742);
    }

    public MineUserStoryFetcher(byte b) {
        this();
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    public /* synthetic */ MineUserStoryFetcher() {
        this((AbstractC1196i) null);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        this.f174259a.dispose();
    }

    /* renamed from: a */
    public static Aweme m135716a() {
        Aweme clone = C77697a.m135717a().clone();
        C89219l.m154716b(clone, "");
        return clone;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher$b */
    public static final class C77696b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f174262a;

        static {
            Covode.recordClassIndex(90744);
        }

        public C77696b(AbstractC89172b bVar) {
            this.f174262a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC89172b bVar = this.f174262a;
            C89219l.m154716b(obj, "");
            bVar.invoke(obj);
        }
    }

    public MineUserStoryFetcher(AbstractC1196i iVar) {
        this.f174260b = iVar;
        this.f174259a = new C88411a();
        if (iVar != null) {
            iVar.mo4012a(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher$a */
    public static final class C77695a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f174261a;

        static {
            Covode.recordClassIndex(90743);
        }

        public C77695a(AbstractC89172b bVar) {
            this.f174261a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Aweme aweme;
            C77387j jVar = (C77387j) obj;
            List<Aweme> awemes = jVar.getAwemes();
            if (awemes != null && (aweme = (Aweme) C89070n.m154583g((List) awemes)) != null) {
                C77694c.m135715a(aweme, jVar.extra.logid);
                C77697a.m135718a(aweme);
                AbstractC89172b bVar = this.f174261a;
                Aweme clone = aweme.clone();
                C89219l.m154716b(clone, "");
                bVar.invoke(clone);
            }
        }
    }
}
