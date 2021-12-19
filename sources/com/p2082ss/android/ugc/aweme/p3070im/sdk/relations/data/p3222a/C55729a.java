package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3222a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56200a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56215j;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.a.a */
public final class C55729a {

    /* renamed from: a */
    public static final Keva f127100a;

    /* renamed from: b */
    public static final C55729a f127101b = new C55729a();

    private C55729a() {
    }

    static {
        Covode.recordClassIndex(65515);
        Keva repo = Keva.getRepo("repo_mention_privacy_update");
        C89219l.m154716b(repo, "");
        f127100a = repo;
    }

    /* renamed from: a */
    public static boolean m101483a() {
        if (!C56200a.m102109a() || (System.currentTimeMillis() - f127100a.getLong("key_cold_start_time", 0)) / 1000 < C56215j.m102130a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m101482a(int i) {
        if (i == 0) {
            f127100a.storeLong("key_cold_start_time", System.currentTimeMillis());
        } else if (i != 1) {
            C56244a.m102190b("MentionPrivacyUpdate", "Illegal argument of startType=".concat(String.valueOf(i)));
        } else {
            f127100a.storeLong("key_warm_start_time", System.currentTimeMillis());
        }
    }
}
