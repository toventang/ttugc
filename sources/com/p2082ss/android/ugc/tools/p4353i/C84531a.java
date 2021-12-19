package com.p2082ss.android.ugc.tools.p4353i;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C28027t;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.google.gson.p2020c.EnumC27899b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.i.a */
public final class C84531a extends AbstractC28031v<Integer> {
    static {
        Covode.recordClassIndex(98496);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ Integer read(C27897a aVar) {
        return m145353a(aVar);
    }

    /* renamed from: a */
    private static Integer m145353a(C27897a aVar) {
        C89219l.m154721d(aVar, "");
        EnumC27899b f = aVar.mo46627f();
        if (f != null) {
            int i = C84532b.f188935a[f.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    aVar.mo46631k();
                    return null;
                } else if (i == 3) {
                    try {
                        return Integer.valueOf(aVar.mo46634n());
                    } catch (NumberFormatException e) {
                        throw new C28027t(e);
                    }
                } else if (i == 4) {
                    if (Boolean.parseBoolean(aVar.mo46629i())) {
                        return 1;
                    }
                    return 0;
                }
            } else if (aVar.mo46630j()) {
                return 1;
            } else {
                return 0;
            }
        }
        throw new IllegalStateException("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(f)));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ void write(C27900c cVar, Integer num) {
        Integer num2 = num;
        C89219l.m154721d(cVar, "");
        if (num2 == null) {
            cVar.mo46654f();
        } else {
            cVar.mo46644a(num2);
        }
    }
}
