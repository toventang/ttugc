package com.p2082ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.e */
public final class C47474e extends AbstractC39100a<Comment, C47472c> {
    static {
        Covode.recordClassIndex(56088);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.comment.model.Comment>, java.util.List<com.ss.android.ugc.aweme.comment.model.Comment> */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Comment> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C47472c) this.mData).f110283a;
    }

    public C47474e() {
        C47472c cVar = new C47472c();
        cVar.f110283a = new ArrayList();
        cVar.mo79745a(true);
        this.mData = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((C47472c) this.mData).mo79746a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        m90529a(0);
    }

    /* renamed from: a */
    private void m90529a(final int i) {
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.favorites.model.C47474e.CallableC474751 */

            /* renamed from: b */
            final /* synthetic */ int f110292b = 30;

            static {
                Covode.recordClassIndex(56089);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UserFavoritesApi.m90367b(i, this.f110292b);
            }
        }, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        m90529a(((C47472c) this.mData).f110284b);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        C47472c cVar = (C47472c) obj;
        boolean z2 = false;
        if (cVar == null || C13603b.m24435a((Collection) cVar.f110283a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = cVar;
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = cVar;
                    return;
                }
                List list = (List) Objects.requireNonNull(((C47472c) this.mData).f110283a);
                List<? extends Comment> list2 = cVar.f110283a;
                List<? extends Comment> list3 = ((C47472c) this.mData).f110283a;
                ArrayList arrayList = new ArrayList();
                for (Comment comment : list2) {
                    arrayList.add(comment);
                    for (Comment comment2 : list3) {
                        if (comment.getCid().equals(comment2.getCid())) {
                            arrayList.remove(comment);
                        }
                    }
                }
                list.addAll(arrayList);
                ((C47472c) this.mData).f110284b = cVar.f110284b;
                C47472c cVar2 = (C47472c) this.mData;
                if (cVar.mo79746a() && ((C47472c) this.mData).mo79746a()) {
                    z2 = true;
                }
                cVar2.mo79745a(z2);
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                ((List) Objects.requireNonNull(((C47472c) this.mData).f110283a)).clear();
            }
            ((C47472c) this.mData).mo79745a(false);
        }
    }
}
