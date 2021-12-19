package com.p2082ss.android.ugc.aweme.flowfeed.utils;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.c */
public final class C51054c {

    /* renamed from: a */
    public Map<String, C51053b> f117766a = new HashMap();

    static {
        Covode.recordClassIndex(60239);
    }

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.c$a */
    public static class C51055a {

        /* renamed from: a */
        public static final C51054c f117767a = new C51054c();

        static {
            Covode.recordClassIndex(60240);
        }
    }

    /* renamed from: a */
    public final C51053b mo86392a(String str) {
        if (this.f117766a.isEmpty()) {
            return null;
        }
        return this.f117766a.get(str);
    }

    /* renamed from: a */
    public final void mo86393a(String str, C51053b bVar) {
        this.f117766a.put(str, bVar);
    }
}
