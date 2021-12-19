package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import java.util.Arrays;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bp */
public final class C74001bp {
    static {
        Covode.recordClassIndex(86751);
    }

    /* renamed from: b */
    public static final C65614f m130146b(C65616g gVar) {
        if (!(gVar instanceof C65611c)) {
            return null;
        }
        return ((C65611c) gVar).f147851a;
    }

    /* renamed from: a */
    public static final String m130145a(C65616g gVar) {
        C65614f b = m130146b(gVar);
        if (b == null) {
            return "";
        }
        String a = C1764a.m5929a(Locale.US, "https:%d ttnet:%d", Arrays.copyOf(new Object[]{Integer.valueOf(b.f147895j), Integer.valueOf(b.f147905t)}, 2));
        C89219l.m154716b(a, "");
        return a;
    }
}
