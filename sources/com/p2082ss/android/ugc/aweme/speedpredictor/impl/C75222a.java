package com.p2082ss.android.ugc.aweme.speedpredictor.impl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.C75221e;
import com.p2082ss.android.ugc.p4314h.C84119i;

/* renamed from: com.ss.android.ugc.aweme.speedpredictor.impl.a */
final class C75222a {

    /* renamed from: com.ss.android.ugc.aweme.speedpredictor.impl.a$a */
    static class C75223a {
        static {
            Covode.recordClassIndex(88110);
        }
    }

    static {
        Covode.recordClassIndex(88109);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.speedpredictor.impl.a$b */
    public static class C75225b {
        static {
            Covode.recordClassIndex(88112);
        }

        /* renamed from: a */
        static C75221e m131987a(C84119i iVar) {
            if (iVar == null) {
                return null;
            }
            C75221e eVar = new C75221e(iVar.f187722c * 8.0d, (double) iVar.f187723d);
            eVar.f169134d = iVar.f187724e;
            return eVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.speedpredictor.impl.a$c */
    public static class C75226c {
        static {
            Covode.recordClassIndex(88113);
        }

        /* renamed from: a */
        static C75221e[] m131988a(C84119i[] iVarArr) {
            if (iVarArr == null) {
                return null;
            }
            C75221e[] eVarArr = new C75221e[iVarArr.length];
            for (int i = 0; i < iVarArr.length; i++) {
                eVarArr[i] = C75225b.m131987a(iVarArr[i]);
            }
            return eVarArr;
        }
    }
}
