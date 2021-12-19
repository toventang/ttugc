package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39144m;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42077d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.e.g */
public final class C42858g extends C39101b<C42077d> {
    static {
        Covode.recordClassIndex(50962);
    }

    /* renamed from: d */
    public final List<Aweme> mo73101d() {
        List<Aweme> items;
        AbstractC39100a aVar = (AbstractC39100a) this.f92286h;
        if (aVar == null || (items = aVar.getItems()) == null) {
            return new ArrayList();
        }
        return items;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f92286h != null && this.f92287i != null) {
            AbstractC39085b bVar = this.f92286h;
            C89219l.m154716b(bVar, "");
            int i = ((AbstractC39100a) bVar).mListQueryType;
            if (i == 1) {
                AbstractC39085b bVar2 = this.f92286h;
                C89219l.m154716b(bVar2, "");
                if (!((AbstractC39100a) bVar2).isDataEmpty()) {
                    AbstractC39144m mVar = this.f92287i;
                    Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.suicide.ISearchSuicideView");
                    AbstractC39085b bVar3 = this.f92286h;
                    C89219l.m154716b(bVar3, "");
                    ((AbstractC42843a) mVar).mo73087a(((AbstractC39100a) bVar3).isHasMore());
                }
            } else if (i == 4) {
                AbstractC39144m mVar2 = this.f92287i;
                Objects.requireNonNull(mVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.suicide.ISearchSuicideView");
                AbstractC39085b bVar4 = this.f92286h;
                C89219l.m154716b(bVar4, "");
                List<? extends Aweme> items = ((AbstractC39100a) bVar4).getItems();
                AbstractC39085b bVar5 = this.f92286h;
                C89219l.m154716b(bVar5, "");
                ((AbstractC42843a) mVar2).mo73088d(items, ((AbstractC39100a) bVar5).isHasMore());
            }
            AbstractC39085b bVar6 = this.f92286h;
            C89219l.m154716b(bVar6, "");
            T t = bVar6.mData;
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchApiResult");
            GlobalDoodleConfig globalDoodleConfig = t.globalDoodleConfig;
            AbstractC39144m mVar3 = this.f92287i;
            Objects.requireNonNull(mVar3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.suicide.ISearchSuicideView");
            ((AbstractC42843a) mVar3).mo73085a(globalDoodleConfig);
            AbstractC39144m mVar4 = this.f92287i;
            Objects.requireNonNull(mVar4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.suicide.ISearchSuicideView");
            AbstractC39085b bVar7 = this.f92286h;
            C89219l.m154716b(bVar7, "");
            T t2 = bVar7.mData;
            Objects.requireNonNull(t2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchApiResult");
            ((AbstractC42843a) mVar4).mo73086a(t2.logPb);
        }
    }
}
