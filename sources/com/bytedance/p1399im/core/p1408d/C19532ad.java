package com.bytedance.p1399im.core.p1408d;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19767d;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.internal.utils.C20002j;

/* renamed from: com.bytedance.im.core.d.ad */
public final class C19532ad {

    /* renamed from: a */
    public static final LruCache<String, C19591aq> f46371a = new LruCache<>(30);

    static {
        Covode.recordClassIndex(22376);
    }

    /* renamed from: a */
    public static C19591aq m36496a(String str) {
        C19591aq aqVar = f46371a.get(str);
        if (aqVar == null) {
            try {
                String a = C19767d.m37129a(str, "repaired_range_list");
                if (!TextUtils.isEmpty(a)) {
                    aqVar = (C19591aq) C19999h.f47538a.mo46670a(a, C19591aq.class);
                    if (aqVar == null) {
                    }
                    f46371a.put(str, aqVar);
                }
            } catch (Exception e) {
                C20002j.m37781b("CheckRangeListStore get rangeList failed", e);
            }
            aqVar = new C19591aq();
            f46371a.put(str, aqVar);
        }
        return aqVar;
    }

    /* renamed from: a */
    public static void m36497a(final String str, final C19591aq aqVar) {
        if (aqVar != null) {
            f46371a.put(str, aqVar);
            RunnableC19987d.m37729a(new AbstractC19986c<Boolean>() {
                /* class com.bytedance.p1399im.core.p1408d.C19532ad.C195331 */

                static {
                    Covode.recordClassIndex(22377);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public Boolean mo31187a() {
                    try {
                        return Boolean.valueOf(C19767d.m37130a(str, "repaired_range_list", C19999h.f47538a.mo46674b(aqVar.copy())));
                    } catch (Exception e) {
                        C20002j.m37781b("CheckRangeListStore update rangeList failed", e);
                        return false;
                    }
                }
            }, null, C19983a.m37717a());
        }
    }
}
