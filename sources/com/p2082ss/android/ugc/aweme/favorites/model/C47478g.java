package com.p2082ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27246l;
import com.google.p1998c.p2001c.C27512l;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.favorites.p2920b.C47201b;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.g */
public final class C47478g extends AbstractC39100a<C75445g, C47201b> {
    static {
        Covode.recordClassIndex(56092);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<C75445g> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C47201b) this.mData).f109870a;
    }

    public C47478g() {
        C47201b bVar = new C47201b();
        bVar.f109870a = new ArrayList();
        bVar.mo79640a(false);
        this.mData = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((C47201b) this.mData).mo79641a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        m90531a(0, 12);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        m90531a(((C47201b) this.mData).f109871b, 10);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        boolean z2;
        C47201b bVar = (C47201b) obj;
        boolean z3 = false;
        if (bVar == null || C13603b.m24435a((Collection) bVar.f109870a)) {
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
                List<C75445g> list = ((C47201b) this.mData).f109870a;
                List<C75445g> list2 = bVar.f109870a;
                List<C75445g> list3 = ((C47201b) this.mData).f109870a;
                if (list3 == null || list3.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.addAll(C27512l.m54997a((Collection) list2, (AbstractC27246l) new C47480i(z2, list3)));
                ((C47201b) this.mData).f109871b = bVar.f109871b;
                C47201b bVar2 = (C47201b) this.mData;
                if (bVar.mo79641a() && ((C47201b) this.mData).mo79641a()) {
                    z3 = true;
                }
                bVar2.mo79640a(z3);
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                ((C47201b) this.mData).f109870a.clear();
            }
            ((C47201b) this.mData).mo79640a(false);
        }
    }

    /* renamed from: a */
    private void m90531a(int i, int i2) {
        if (!C80580in.m139687c()) {
            C34608n.m70658a().mo61083a(this.mHandler, new CallableC47479h(i, i2), 0);
        }
    }
}
