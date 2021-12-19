package com.p2082ss.android.ugc.aweme.setting.p3723k;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.model.C68175e;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.k.a */
public final class C68119a extends AbstractC39100a<User, C68175e> {

    /* renamed from: a */
    private int f152526a;

    /* renamed from: b */
    private int f152527b;

    static {
        Covode.recordClassIndex(80315);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean needCheckEmptyForQueryType() {
        return false;
    }

    public C68119a() {
        this((byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<User> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C68175e) this.mData).f152638a;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((C68175e) this.mData).f152640c) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        m120404a(0, 0, 0);
    }

    private C68119a(byte b) {
        this.f152527b = 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        m120404a(this.f152526a, ((C68175e) this.mData).f152641d, ((C68175e) this.mData).f152642e);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        C68175e eVar = (C68175e) obj;
        if (eVar == null || C13603b.m24435a((Collection) eVar.f152638a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        int i = this.mListQueryType;
        if (i == 1) {
            this.mData = eVar;
            if (!this.mIsNewDataEmpty || (eVar != null && isHasMore())) {
                this.f152526a = eVar.f152639b;
            }
        } else if (i == 4) {
            if (eVar != null) {
                ((C68175e) this.mData).f152641d = eVar.f152641d;
                ((C68175e) this.mData).f152642e = eVar.f152642e;
                ((C68175e) this.mData).f152643f = eVar.f152643f;
            }
            if (!this.mIsNewDataEmpty || (eVar != null && isHasMore())) {
                ((C68175e) this.mData).f152638a.addAll(eVar.f152638a);
                ((C68175e) this.mData).f152640c = eVar.f152640c;
                this.f152526a = eVar.f152639b;
                return;
            }
            ((C68175e) this.mData).f152640c = false;
        }
    }

    /* renamed from: a */
    private void m120404a(int i, int i2, int i3) {
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC68120b(this, i, i2, i3), 0);
    }
}
