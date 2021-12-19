package com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2527c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.C27910f;
import com.google.gson.internal.C27998g;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2523b.C37539b;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.c.c */
public final class C37553c {

    /* renamed from: a */
    public static ConcurrentHashMap<String, C37539b> f88751a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C37553c f88752b = new C37553c();

    /* renamed from: c */
    private static ConcurrentHashMap<String, C37539b> f88753c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static C27910f f88754d = new C27910f();

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.c.c$a */
    public static final class C37554a extends C27895a<C37539b> {
        static {
            Covode.recordClassIndex(44951);
        }

        C37554a() {
        }
    }

    private C37553c() {
    }

    static {
        Covode.recordClassIndex(44950);
    }

    /* renamed from: a */
    public static final ConcurrentHashMap<String, C37539b> m75720a() {
        ConcurrentHashMap concurrentHashMap;
        try {
            if (f88753c.isEmpty() && (concurrentHashMap = (ConcurrentHashMap) SettingsManager.m29616a().mo25396a("hashtag2emoji_map", ConcurrentHashMap.class)) != null) {
                for (String str : concurrentHashMap.keySet()) {
                    C27998g gVar = (C27998g) concurrentHashMap.get(str);
                    if (gVar != null) {
                        C89219l.m154716b(gVar, "");
                        C37539b bVar = (C37539b) f88754d.mo46671a(f88754d.mo46674b(gVar), new C37554a().type);
                        ConcurrentHashMap<String, C37539b> concurrentHashMap2 = f88753c;
                        C89219l.m154716b(str, "");
                        C89219l.m154716b(bVar, "");
                        concurrentHashMap2.put(str, bVar);
                    }
                }
            }
            return f88753c;
        } catch (Throwable unused) {
            return f88753c;
        }
    }
}
