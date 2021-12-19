package com.bytedance.ies.bullet.kit.p1148a.p1150b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.kit.a.b.b */
public final class C16335b {

    /* renamed from: a */
    public static final C16335b f39243a = new C16335b();

    private C16335b() {
    }

    static {
        Covode.recordClassIndex(18628);
    }

    /* renamed from: a */
    public static String m30344a(C16610ap apVar, C16667j jVar) {
        String str;
        C89219l.m154719c(apVar, "");
        C89219l.m154719c(jVar, "");
        if (C89361p.m154874b(jVar.f39845m, "/", false)) {
            String str2 = jVar.f39845m;
            if (str2 != null) {
                str = str2.substring(1);
                C89219l.m154709a((Object) str, "");
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        } else {
            str = jVar.f39845m;
        }
        return jVar.f39857y + '_' + jVar.f39844l + '_' + str;
    }
}
