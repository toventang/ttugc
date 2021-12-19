package com.p2082ss.android.ugc.aweme.p2690cr;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cr.a */
public final class C40318a {

    /* renamed from: a */
    public static final C40318a f94484a = new C40318a();

    private C40318a() {
    }

    static {
        Covode.recordClassIndex(48119);
    }

    /* renamed from: a */
    public static Keva m81469a() {
        Keva repoFromSp = Keva.getRepoFromSp(C40963b.m82473a(), "AVStoragePreferences", 0);
        C89219l.m154716b(repoFromSp, "");
        return repoFromSp;
    }

    /* renamed from: a */
    public static final void m81470a(boolean z) {
        m81469a().storeBoolean("key_is_effect_storage_cleaning", z);
    }
}
