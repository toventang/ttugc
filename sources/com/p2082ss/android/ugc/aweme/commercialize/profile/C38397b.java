package com.p2082ss.android.ugc.aweme.commercialize.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.AbstractC39144m;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.b */
public final class C38397b extends C39101b<C38455n> {
    static {
        Covode.recordClassIndex(45904);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: b */
    public final void mo57527b() {
        if (this.f92286h != null && this.f92287i != null) {
            AbstractC39085b bVar = this.f92286h;
            C89219l.m154716b(bVar, "");
            int i = ((AbstractC39100a) bVar).mListQueryType;
            if (i == 1) {
                ((AbstractC39102c) this.f92287i).mo59515b();
            } else if (i == 4) {
                ((AbstractC39102c) this.f92287i).aW_();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f92286h != null && this.f92287i != null) {
            if (this.f92287i instanceof C38402e) {
                AbstractC39144m mVar = this.f92287i;
                Objects.requireNonNull(mVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserProfileAwemeListFragment");
                AbstractC39085b bVar = this.f92286h;
                C89219l.m154716b(bVar, "");
                T t = bVar.mData;
                C89219l.m154716b(t, "");
                ((C38402e) mVar).f90737d = t.maxCursor;
            } else if (this.f92287i instanceof C41178b) {
                AbstractC39144m mVar2 = this.f92287i;
                Objects.requireNonNull(mVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel");
                C49812b bVar2 = ((AbstractC49815a) mVar2).f114782aJ;
                C89219l.m154716b(bVar2, "");
                AbstractC39085b bVar3 = this.f92286h;
                C89219l.m154716b(bVar3, "");
                T t2 = bVar3.mData;
                C89219l.m154716b(t2, "");
                bVar2.setMaxCursor(t2.maxCursor);
            }
            AbstractC39085b bVar4 = this.f92286h;
            C89219l.m154716b(bVar4, "");
            if (((AbstractC39100a) bVar4).mListQueryType == 1) {
                AbstractC39085b bVar5 = this.f92286h;
                C89219l.m154716b(bVar5, "");
                if (((AbstractC39100a) bVar5).isDataEmpty()) {
                    ((AbstractC39102c) this.f92287i).mo59525f();
                    return;
                }
                AbstractC39085b bVar6 = this.f92286h;
                C89219l.m154716b(bVar6, "");
                List items = ((AbstractC39100a) bVar6).getItems();
                AbstractC39085b bVar7 = this.f92286h;
                C89219l.m154716b(bVar7, "");
                ((AbstractC39102c) this.f92287i).mo59517b(items, ((AbstractC39100a) bVar7).isHasMore());
                return;
            }
            AbstractC39085b bVar8 = this.f92286h;
            C89219l.m154716b(bVar8, "");
            if (((AbstractC39100a) bVar8).mListQueryType == 4) {
                AbstractC39085b bVar9 = this.f92286h;
                C89219l.m154716b(bVar9, "");
                List items2 = ((AbstractC39100a) bVar9).getItems();
                AbstractC39085b bVar10 = this.f92286h;
                C89219l.m154716b(bVar10, "");
                ((AbstractC39102c) this.f92287i).mo59517b(items2, ((AbstractC39100a) bVar10).isHasMore());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        if (this.f92286h != null && this.f92287i != null) {
            AbstractC39085b bVar = this.f92286h;
            C89219l.m154716b(bVar, "");
            int i = ((AbstractC39100a) bVar).mListQueryType;
            if (i == 1) {
                ((AbstractC39102c) this.f92287i).mo59516b(exc);
            } else if (i == 4) {
                ((AbstractC39102c) this.f92287i).mo59522c(exc);
            }
        }
    }
}
