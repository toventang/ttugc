package com.p2082ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46514m;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.C46462b;
import com.p2082ss.android.ugc.aweme.emoji.p2905h.C46539b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.e */
public final class C46643e {

    /* renamed from: a */
    public static final C46643e f108765a = new C46643e();

    private C46643e() {
    }

    static {
        Covode.recordClassIndex(55235);
    }

    /* renamed from: a */
    public static final int m90037a(C46514m mVar, int i) {
        C89219l.m154721d(mVar, "");
        AbstractC46452f b = mVar.mo79028b(i);
        if (b instanceof C46539b) {
            return 2;
        }
        if (!(b instanceof C46462b)) {
            return 1;
        }
        if (mVar.mo79030d(i) <= 0) {
            return 3;
        }
        return 4;
    }
}
