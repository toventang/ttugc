package com.p2082ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.a */
public final class C47469a extends AbstractC39100a<Challenge, C47471b> {
    static {
        Covode.recordClassIndex(56083);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Challenge> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C47471b) this.mData).f110280a;
    }

    public C47469a() {
        C47471b bVar = new C47471b();
        bVar.f110280a = new ArrayList();
        bVar.mo79743a(true);
        this.mData = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((C47471b) this.mData).mo79744a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        m90522a(0, 12);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        m90522a(((C47471b) this.mData).f110281b, 10);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        C47471b bVar = (C47471b) obj;
        boolean z2 = false;
        if (bVar == null || C13603b.m24435a((Collection) bVar.f110280a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = bVar;
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = bVar;
                    return;
                }
                List<Challenge> list = ((C47471b) this.mData).f110280a;
                List<Challenge> list2 = bVar.f110280a;
                List<Challenge> list3 = ((C47471b) this.mData).f110280a;
                ArrayList arrayList = new ArrayList();
                for (Challenge challenge : list2) {
                    arrayList.add(challenge);
                    for (Challenge challenge2 : list3) {
                        if (challenge.getCid().equals(challenge2.getCid())) {
                            arrayList.remove(challenge);
                        }
                    }
                }
                list.addAll(arrayList);
                ((C47471b) this.mData).f110281b = bVar.f110281b;
                C47471b bVar2 = (C47471b) this.mData;
                if (bVar.mo79744a() && ((C47471b) this.mData).mo79744a()) {
                    z2 = true;
                }
                bVar2.mo79743a(z2);
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                ((C47471b) this.mData).f110280a.clear();
            }
            ((C47471b) this.mData).mo79743a(false);
        }
    }

    /* renamed from: a */
    private void m90522a(final int i, final int i2) {
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.favorites.model.C47469a.CallableC474701 */

            static {
                Covode.recordClassIndex(56084);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UserFavoritesApi.m90366a(i, i2);
            }
        }, 0);
    }
}
