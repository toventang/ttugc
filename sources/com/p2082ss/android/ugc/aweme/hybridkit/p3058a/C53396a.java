package com.p2082ss.android.ugc.aweme.hybridkit.p3058a;

import com.bytedance.android.alog.C2688c;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1524j.AbstractC21208a;
import com.bytedance.lynx.hybrid.p1524j.EnumC21209b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.hybridkit.a.a */
public final class C53396a implements AbstractC21208a {
    static {
        Covode.recordClassIndex(62962);
    }

    @Override // com.bytedance.lynx.hybrid.p1524j.AbstractC21208a
    /* renamed from: a */
    public final void mo34821a(Throwable th, String str, String str2) {
        C89219l.m154721d(th, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C2688c.m7778a(4, str2, str);
    }

    @Override // com.bytedance.lynx.hybrid.p1524j.AbstractC21208a
    /* renamed from: a */
    public final void mo34820a(String str, EnumC21209b bVar, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str2, "");
        int i = C53397b.f122606a[bVar.ordinal()];
        if (i == 1) {
            C2688c.m7778a(1, str2, str);
        } else if (i == 2) {
            C2688c.m7778a(0, str2, str);
        } else if (i == 3) {
            C2688c.m7778a(2, str2, str);
        } else if (i == 4) {
            C2688c.m7778a(3, str2, str);
        } else if (i == 5) {
            C2688c.m7778a(4, str2, str);
        }
    }
}
