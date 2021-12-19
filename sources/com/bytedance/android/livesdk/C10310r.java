package com.bytedance.android.livesdk;

import androidx.p025c.C0489d;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.manage.C9462a;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.ugc.live.p4460a.p4461a.p4466e.C87038c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.r */
public final class C10310r {

    /* renamed from: a */
    public static final C10310r f24913a = new C10310r();

    private C10310r() {
    }

    static {
        Covode.recordClassIndex(11876);
    }

    /* renamed from: a */
    public static final long m18754a(long j) {
        Long a = C9462a.C9465b.f23010a.f23005b.mo2078a(j, null);
        if (a != null) {
            return a.longValue();
        }
        return 0;
    }

    /* renamed from: a */
    public static final void m18755a(long j, long j2) {
        C9462a.C9465b.f23010a.f23005b.mo2087c(j, Long.valueOf(j2));
    }

    /* renamed from: a */
    public static final void m18756a(List<? extends AssetsModel> list, C0489d<Long> dVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(dVar, "");
        C6805b<String> bVar = AbstractC6804a.f17054e;
        C89219l.m154716b(bVar, "");
        String a = bVar.mo13066a();
        C6805b<String> bVar2 = AbstractC6804a.f17055f;
        C89219l.m154716b(bVar2, "");
        String a2 = bVar2.mo13066a();
        C27910f fVar = C4139e.C4140a.f11575b;
        String str = null;
        if (C87038c.m150749a(a) || C13627m.m24498a(a2)) {
            C6805b<String> bVar3 = AbstractC6804a.f17054e;
            C89219l.m154716b(bVar3, "");
            C6806c.m14603a(bVar3, fVar != null ? fVar.mo46674b(list) : null);
            C6805b<String> bVar4 = AbstractC6804a.f17055f;
            C89219l.m154716b(bVar4, "");
            if (fVar != null) {
                str = fVar.mo46674b(dVar);
            }
            C6806c.m14603a(bVar4, str);
            return;
        }
        Object a3 = fVar.mo46671a(a, new C9462a.C9475l().type);
        C89219l.m154716b(a3, "");
        List list2 = (List) a3;
        Object a4 = fVar.mo46671a(a2, new C9462a.C9474k().type);
        C89219l.m154716b(a4, "");
        C0489d dVar2 = (C0489d) a4;
        for (Object obj : list) {
            if (!list2.contains(obj)) {
                list2.add(obj);
            }
        }
        int b = dVar.mo2080b();
        for (int i = 0; i < b; i++) {
            dVar2.mo2083b(dVar.mo2081b(i), dVar.mo2085c(i));
        }
        C6805b<String> bVar5 = AbstractC6804a.f17054e;
        C89219l.m154716b(bVar5, "");
        C6806c.m14603a(bVar5, fVar.mo46674b(list2));
        C6805b<String> bVar6 = AbstractC6804a.f17055f;
        C89219l.m154716b(bVar6, "");
        C6806c.m14603a(bVar6, fVar.mo46674b(dVar2));
    }
}
