package com.p2082ss.android.ugc.aweme.feed.p2969u;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FollowingFeedListModel;
import com.p2082ss.android.ugc.aweme.feed.p2951j.C49709b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.u.r */
public final class C49985r extends C39101b<FollowingFeedListModel> {

    /* renamed from: a */
    private final List<Aweme> f115318a = new ArrayList();

    static {
        Covode.recordClassIndex(59097);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f7, code lost:
        if (((com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a) r0).isNewDataEmpty() == false) goto L_0x00f9;
     */
    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57528c() {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2969u.C49985r.mo57528c():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        C89219l.m154721d(exc, "");
        if (this.f92286h != null && this.f92287i != null) {
            AbstractC39085b bVar = this.f92286h;
            C89219l.m154716b(bVar, "");
            if (((AbstractC39100a) bVar).mListQueryType != 2 || !(exc instanceof C49709b)) {
                super.mo57526a_(exc);
            } else {
                ((AbstractC39102c) this.f92287i).mo59523c(this.f115318a, false);
            }
        }
    }
}
