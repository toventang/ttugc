package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71913g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.as */
public final class C73966as {

    /* renamed from: a */
    public static int f166053a;

    /* renamed from: b */
    public static final C73966as f166054b = new C73966as();

    private C73966as() {
    }

    static {
        Covode.recordClassIndex(86716);
    }

    /* renamed from: a */
    public static final int m130092a() {
        if (!C63238c.f143594u.mo93901a() && C71913g.m126989b()) {
            return f166053a + 300;
        }
        if (C63238c.f143594u.mo93901a() || !C71913g.m126990c()) {
            return f166053a + 150;
        }
        return f166053a + 500;
    }
}
