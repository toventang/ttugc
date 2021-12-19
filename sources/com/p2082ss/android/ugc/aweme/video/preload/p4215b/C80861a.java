package com.p2082ss.android.ugc.aweme.video.preload.p4215b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.C75221e;
import com.p2082ss.android.ugc.p4314h.C84119i;

/* renamed from: com.ss.android.ugc.aweme.video.preload.b.a */
final class C80861a {

    /* renamed from: com.ss.android.ugc.aweme.video.preload.b.a$a */
    static class C80862a {
        static {
            Covode.recordClassIndex(94160);
        }
    }

    static {
        Covode.recordClassIndex(94159);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.preload.b.a$b */
    public static class C80864b {
        static {
            Covode.recordClassIndex(94162);
        }

        /* renamed from: a */
        static C84119i m140279a(C75221e eVar) {
            if (eVar == null) {
                return null;
            }
            return new C84119i(eVar.f169133c, eVar.f169131a / 8.0d, (long) eVar.f169132b, eVar.f169134d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.b.a$c */
    static class C80865c {
        static {
            Covode.recordClassIndex(94163);
        }

        /* renamed from: a */
        static C84119i[] m140280a(C75221e[] eVarArr) {
            if (eVarArr == null) {
                return null;
            }
            C84119i[] iVarArr = new C84119i[eVarArr.length];
            for (int i = 0; i < eVarArr.length; i++) {
                iVarArr[i] = C80864b.m140279a(eVarArr[i]);
            }
            return iVarArr;
        }
    }
}
