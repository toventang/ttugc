package com.p2082ss.android.ugc.aweme.childhook.p2457a.p2460c;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.childhook.C35691d;
import com.p2082ss.android.ugc.aweme.childhook.C35692e;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.childhook.a.c.a */
public final class C35685a implements AbstractC35687c {
    static {
        Covode.recordClassIndex(42915);
    }

    @Override // com.p2082ss.android.ugc.aweme.childhook.p2457a.p2460c.AbstractC35687c
    /* renamed from: b */
    public final boolean mo62730b(String str) {
        C89219l.m154721d(str, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.childhook.p2457a.p2460c.AbstractC35687c
    /* renamed from: a */
    public final boolean mo62729a(String str) {
        List<String> list;
        C89219l.m154721d(str, "");
        C35691d dVar = C35692e.f84187a;
        if (dVar == null || (list = dVar.f84186d) == null) {
            list = C89086z.INSTANCE;
        }
        if (!(!list.isEmpty())) {
            return false;
        }
        for (String str2 : list) {
            if (C13627m.m24499a(str2, str)) {
                return true;
            }
        }
        return false;
    }
}
