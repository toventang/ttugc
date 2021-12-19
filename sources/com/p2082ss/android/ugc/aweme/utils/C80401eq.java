package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.eq */
public final class C80401eq {

    /* renamed from: a */
    public static final C80401eq f179958a = new C80401eq();

    private C80401eq() {
    }

    static {
        Covode.recordClassIndex(93669);
    }

    /* renamed from: a */
    public static String m139376a() {
        try {
            Keva repo = Keva.getRepo("user_logout_log");
            C89219l.m154716b(repo, "");
            Map<String, ?> all = repo.getAll();
            if (all.isEmpty()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            C89219l.m154716b(all, "");
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (!C89219l.m154714a((Object) entry.getKey(), (Object) "last_time")) {
                    sb.append(entry.getKey()).append(":").append(entry.getValue()).append(" ");
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return "error";
        }
    }
}
