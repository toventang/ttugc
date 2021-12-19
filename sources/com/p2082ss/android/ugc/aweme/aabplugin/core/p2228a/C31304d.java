package com.p2082ss.android.ugc.aweme.aabplugin.core.p2228a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.p1265a.C18115a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31344p;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.a.d */
public final class C31304d extends AbstractC31339n {
    static {
        Covode.recordClassIndex(38004);
    }

    @Override // com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n
    /* renamed from: a */
    public final void mo57308a(Map<String, String> map) {
        C89219l.m154721d(map, "");
        map.put(StringSet.name, this.f75088l);
        Iterable iterable = this.f75078b.f43122i;
        if (iterable == null) {
            iterable = C89086z.INSTANCE;
        }
        map.put("dependent_modules", C89070n.m154551a(iterable, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
        map.put("is_all_dependent_modules_installed", String.valueOf(mo57311b()));
    }

    public /* synthetic */ C31304d(String str, boolean z, AbstractC31344p pVar, C18115a aVar) {
        this(str, z, false, pVar, aVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31304d(java.lang.String r9, boolean r10, boolean r11, com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31344p r12, com.bytedance.ies.ugc.aweme.plugin.p1265a.C18115a r13) {
        /*
            r8 = this;
            java.lang.String r1 = ""
            r3 = r9
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r1)
            r7 = r13
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r1)
            com.bytedance.m.a.d r0 = com.bytedance.p1542m.p1543a.C21406d.m40180a()
            java.lang.String r2 = r0.mo35010a(r3)
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r1)
            r1 = r8
            r6 = r12
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.List<java.lang.String> r1 = r7.f43121h
            if (r1 != 0) goto L_0x0022
            h.a.z r1 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0022:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = p4600h.p4601a.C89070n.m154526a(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0031:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            com.bytedance.m.a.d r0 = com.bytedance.p1542m.p1543a.C21406d.m40180a()
            java.lang.String r0 = r0.mo35010a(r1)
            r3.add(r0)
            goto L_0x0031
        L_0x0049:
            java.util.List r3 = (java.util.List) r3
            r7.f43122i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.aabplugin.core.p2228a.C31304d.<init>(java.lang.String, boolean, boolean, com.ss.android.ugc.aweme.aabplugin.core.base.p, com.bytedance.ies.ugc.aweme.plugin.a.a):void");
    }
}
