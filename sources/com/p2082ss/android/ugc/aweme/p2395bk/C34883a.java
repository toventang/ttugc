package com.p2082ss.android.ugc.aweme.p2395bk;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.bk.a */
public final class C34883a {

    /* renamed from: a */
    public static final C34883a f82329a = new C34883a();

    /* renamed from: b */
    public Keva f82330b = Keva.getRepoSync("search_local_repo", 0);

    static {
        Covode.recordClassIndex(41892);
    }

    private C34883a() {
        System.nanoTime();
    }

    /* renamed from: a */
    public final long mo61771a(String str) {
        return this.f82330b.getLong(str, 0);
    }

    /* renamed from: a */
    public final void mo61772a(String str, long j) {
        this.f82330b.storeLong(str, j);
    }
}
