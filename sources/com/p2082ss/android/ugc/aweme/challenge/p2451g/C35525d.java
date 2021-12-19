package com.p2082ss.android.ugc.aweme.challenge.p2451g;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.settingsrequest.C68765a;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.g.d */
public final class C35525d extends AbstractC39100a<Challenge, ChallengeList> {
    static {
        Covode.recordClassIndex(42721);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Challenge> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((ChallengeList) this.mData).items;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((ChallengeList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        C68765a.m121209b();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C68765a.m121209b();
        C34608n.m70658a().mo61083a(this.mHandler, CallableC35526e.f83789a, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        ChallengeList challengeList = (ChallengeList) obj;
        if (challengeList == null || C13603b.m24435a((Collection) challengeList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = challengeList;
            } else if (i == 4) {
                ((ChallengeList) this.mData).items.addAll(challengeList.items);
                ((ChallengeList) this.mData).maxCursor = Math.min(((ChallengeList) this.mData).maxCursor, challengeList.maxCursor);
                ((ChallengeList) this.mData).hasMore = ((ChallengeList) this.mData).hasMore;
            }
        } else if (this.mData != null) {
            ((ChallengeList) this.mData).hasMore = false;
        }
    }
}
