package com.bytedance.ies.bullet.kit.p1148a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16666i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.kit.a.n */
public final class C16363n {

    /* renamed from: a */
    public static final C16363n f39349a = new C16363n();

    /* renamed from: b */
    private static final List<String> f39350b;

    private C16363n() {
    }

    static {
        Covode.recordClassIndex(18656);
        ArrayList arrayList = new ArrayList();
        arrayList.add("http");
        arrayList.add("local_file");
        arrayList.add("assets");
        arrayList.add("https");
        arrayList.add("lynxview");
        f39350b = arrayList;
    }

    /* renamed from: a */
    public static C16610ap m30384a(C16610ap apVar, C16667j jVar) {
        C89219l.m154719c(apVar, "");
        C89219l.m154719c(jVar, "");
        boolean z = false;
        if (C89070n.m154556a((Iterable) f39350b, (Object) apVar.f39754n.getScheme()) || apVar.f39757q != null || jVar.f39844l.length() > 0) {
            z = true;
        }
        apVar.f39760t = z;
        return apVar;
    }

    /* renamed from: a */
    public static boolean m30385a(C16666i iVar, String str) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(str, "");
        if (!iVar.f39827f.isEmpty()) {
            for (String str2 : iVar.f39827f) {
                if (C89361p.m154908a((CharSequence) str, (CharSequence) str2, false)) {
                    return false;
                }
            }
        }
        return true;
    }
}
