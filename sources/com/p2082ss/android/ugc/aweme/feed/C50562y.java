package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.y */
public final class C50562y {

    /* renamed from: a */
    private List<Object> f116858a;

    static {
        Covode.recordClassIndex(59709);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.y$a */
    public static class C50563a {

        /* renamed from: a */
        public static C50562y f116859a = new C50562y((byte) 0);

        static {
            Covode.recordClassIndex(59710);
        }
    }

    private C50562y() {
        this.f116858a = new ArrayList();
    }

    /* renamed from: a */
    public final void mo85858a() {
        Iterator<Object> it = this.f116858a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* synthetic */ C50562y(byte b) {
        this();
    }

    /* renamed from: a */
    public static void m94795a(C34932b bVar) {
        HashMap<String, Long> hashMap = bVar.f82410R;
        HashMap<String, Long> hashMap2 = bVar.f82411S;
        for (Map.Entry<String, Long> entry : hashMap.entrySet()) {
            C58945a.C58947b.f134185a.mo96423a(entry.getKey() + "_duration_pre", entry.getValue().longValue());
        }
        for (Map.Entry<String, Long> entry2 : hashMap2.entrySet()) {
            C58945a.C58947b.f134185a.mo96423a(entry2.getKey() + "_duration_post", entry2.getValue().longValue());
        }
    }
}
