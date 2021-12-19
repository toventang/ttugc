package com.p2082ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.f */
public final class C47476f extends AbstractC39100a<C66504c, C47473d> {
    static {
        Covode.recordClassIndex(56090);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<C66504c> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C47473d) this.mData).f110287a;
    }

    public C47476f() {
        C47473d dVar = new C47473d();
        dVar.f110287a = new ArrayList();
        dVar.mo79747a(true);
        this.mData = dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((C47473d) this.mData).mo79748a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        m90530a(0, 12);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        m90530a(((C47473d) this.mData).f110288b, 10);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        C47473d dVar = (C47473d) obj;
        boolean z2 = false;
        if (dVar == null || C13603b.m24435a((Collection) dVar.f110287a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = dVar;
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = dVar;
                    return;
                }
                List list = (List) Objects.requireNonNull(((C47473d) this.mData).f110287a);
                List<C66504c> list2 = dVar.f110287a;
                List<C66504c> list3 = ((C47473d) this.mData).f110287a;
                ArrayList arrayList = new ArrayList();
                for (C66504c cVar : list2) {
                    arrayList.add(cVar);
                    for (C66504c cVar2 : list3) {
                        if (cVar.getId().equals(cVar2.getId())) {
                            arrayList.remove(cVar);
                        }
                    }
                }
                list.addAll(arrayList);
                ((C47473d) this.mData).f110288b = dVar.f110288b;
                C47473d dVar2 = (C47473d) this.mData;
                if (dVar.mo79748a() && ((C47473d) this.mData).mo79748a()) {
                    z2 = true;
                }
                dVar2.mo79747a(z2);
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                ((List) Objects.requireNonNull(((C47473d) this.mData).f110287a)).clear();
            }
            ((C47473d) this.mData).mo79747a(false);
        }
    }

    /* renamed from: a */
    private void m90530a(final int i, final int i2) {
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.favorites.model.C47476f.CallableC474771 */

            static {
                Covode.recordClassIndex(56091);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UserFavoritesApi.m90368c(i, i2);
            }
        }, 0);
    }
}
