package com.bytedance.ies.powerlist.optimize.p1233a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.ies.powerlist.optimize.a.a */
public final class C17663a {

    /* renamed from: a */
    private HashMap<Class<? extends PowerCell>, Integer> f42237a;

    static {
        Covode.recordClassIndex(20220);
    }

    public C17663a() {
        HashMap<Class<? extends PowerCell>, Integer> hashMap = new HashMap<>();
        this.f42237a = hashMap;
        hashMap.put(MixFeedCell.class, Integer.valueOf((int) R.layout.akp));
    }

    /* renamed from: a */
    public final Integer mo28150a(Class<? extends PowerCell> cls) {
        if (this.f42237a.get(cls) != null) {
            return this.f42237a.get(cls);
        }
        return 0;
    }
}
