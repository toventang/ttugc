package com.p2082ss.android.ugc.aweme.childhook.p2457a.p2459b;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.childhook.C35691d;
import com.p2082ss.android.ugc.aweme.childhook.C35692e;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.childhook.a.b.a */
public final class C35682a implements AbstractC35684c {
    static {
        Covode.recordClassIndex(42912);
    }

    @Override // com.p2082ss.android.ugc.aweme.childhook.p2457a.p2459b.AbstractC35684c
    /* renamed from: b */
    public final boolean mo62728b(String str) {
        C89219l.m154721d(str, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.childhook.p2457a.p2459b.AbstractC35684c
    /* renamed from: a */
    public final boolean mo62727a(String str) {
        List<String> list;
        C89219l.m154721d(str, "");
        C35691d dVar = C35692e.f84187a;
        if (dVar == null || (list = dVar.f84185c) == null) {
            list = C89086z.INSTANCE;
        }
        for (String str2 : list) {
            if (C13627m.m24499a(str2, str)) {
                return true;
            }
        }
        return false;
    }
}
