package com.p2082ss.android.ugc.aweme.shortvideo;

import androidx.lifecycle.AbstractC1174ac;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel */
public class StatusStoreViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private Map<String, Object> f155845a = new C0484a();

    static {
        Covode.recordClassIndex(82136);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        super.onCleared();
        this.f155845a.clear();
    }

    /* renamed from: a */
    public final <T> void mo110053a(String str, T t) {
        this.f155845a.put(str, t);
    }
}
