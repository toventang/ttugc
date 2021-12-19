package com.p2082ss.android.ugc.tools.infosticker.view.internal.base;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.base.c */
public final class C84679c {
    static {
        Covode.recordClassIndex(98646);
    }

    /* renamed from: a */
    public static final <DATA> C89378p<EnumC84444c, Integer> m145516a(Map<DATA, ? extends C89378p<? extends EnumC84444c, Integer>> map, DATA data) {
        C89378p<EnumC84444c, Integer> pVar = (C89378p) map.get(data);
        if (pVar == null) {
            return C89387v.m154943a(EnumC84444c.UNKNOWN, 0);
        }
        return pVar;
    }
}
