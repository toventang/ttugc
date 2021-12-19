package com.p2082ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.z */
public final class C63862z extends C39101b<AbstractC39100a> {

    /* renamed from: a */
    public String f144786a;

    /* renamed from: b */
    private Object[] f144787b;

    static {
        Covode.recordClassIndex(75286);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: c */
    public final void mo57528c() {
        if (this.f92286h != null && this.f92287i != null) {
            int i = ((AbstractC39100a) this.f92286h).mListQueryType;
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    ((AbstractC39102c) this.f92287i).mo59523c(((AbstractC39100a) this.f92286h).getItems(), true ^ ((AbstractC39100a) this.f92286h).isNewDataEmpty());
                } else if (i == 4) {
                    AbstractC39102c cVar = (AbstractC39102c) this.f92287i;
                    List items = ((AbstractC39100a) this.f92286h).getItems();
                    if (!((AbstractC39100a) this.f92286h).isHasMore() || ((AbstractC39100a) this.f92286h).isNewDataEmpty()) {
                        z = false;
                    }
                    cVar.mo59517b(items, z);
                }
            } else if (TextUtils.equals(this.f144786a, ((C63833b) this.f92286h).f144718c)) {
                ((AbstractC39102c) this.f92287i).mo59512a(((AbstractC39100a) this.f92286h).getItems(), ((AbstractC39100a) this.f92286h).isHasMore());
            } else {
                Object[] objArr = this.f144787b;
                if (objArr != null && objArr.length > 2 && (objArr[2] instanceof String) && TextUtils.equals((String) objArr[2], this.f144786a)) {
                    super.mo57616a(this.f144787b);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: a */
    public final boolean mo57616a(Object... objArr) {
        this.f144787b = objArr;
        return super.mo57616a(objArr);
    }
}
