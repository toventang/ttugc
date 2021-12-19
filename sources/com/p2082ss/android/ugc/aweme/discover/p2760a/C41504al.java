package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.discover.a.al */
public final class C41504al {

    /* renamed from: a */
    public static final boolean f96824a;

    /* renamed from: b */
    public static final C41504al f96825b = new C41504al();

    private C41504al() {
    }

    static {
        Covode.recordClassIndex(49411);
        boolean z = true;
        if (C16048b.m29633a().mo25412a(true, "show_suggest_search_words", 0) == 0) {
            z = false;
        }
        f96824a = z;
    }

    /* renamed from: a */
    public static final int m83449a() {
        if (f96824a) {
            if (!C41502aj.f96820a) {
                return 1;
            }
            if (C41502aj.f96820a) {
                return 3;
            }
            return 0;
        } else if (C41502aj.f96820a) {
            return 2;
        } else {
            return 0;
        }
    }
}
