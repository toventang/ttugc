package com.p2082ss.android.ugc.aweme.p2479ck;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ck.q */
public final class C36122q implements AbstractC36109j {

    /* renamed from: a */
    private final C36125t.AbstractC36130b f85331a;

    static {
        Covode.recordClassIndex(43375);
    }

    public C36122q(C36125t.AbstractC36130b bVar) {
        C89219l.m154721d(bVar, "");
        this.f85331a = bVar;
    }

    /* renamed from: a */
    private final String m73582a(String str) {
        if (str == null) {
            return null;
        }
        return this.f85331a.mo59992a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: c */
    public final boolean mo63242c(String str) {
        String a = m73582a(str);
        if (a == null || a.length() == 0) {
            return false;
        }
        return C36125t.m73598a(C36125t.m73591a(), a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: a */
    public final boolean mo63240a(Activity activity, String str) {
        String a = m73582a(str);
        if (a == null || a.length() == 0) {
            return false;
        }
        return C36125t.m73596a(C36125t.m73591a(), activity, a);
    }
}
