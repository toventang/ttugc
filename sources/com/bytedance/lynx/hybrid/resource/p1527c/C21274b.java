package com.bytedance.lynx.hybrid.resource.p1527c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.C21170d;
import com.bytedance.lynx.hybrid.resource.config.C21277c;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.service.p1538c.C21361a;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.lynx.hybrid.resource.c.b */
public final class C21274b {

    /* renamed from: a */
    public static final C21274b f50487a = new C21274b();

    private C21274b() {
    }

    static {
        Covode.recordClassIndex(24890);
    }

    /* renamed from: a */
    public static String m39976a(C21284j jVar) {
        String str;
        C89219l.m154719c(jVar, "");
        if (C89361p.m154874b(jVar.f50517h, "/", false)) {
            String str2 = jVar.f50517h;
            if (str2 != null) {
                str = str2.substring(1);
                C89219l.m154709a((Object) str, "");
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        } else {
            str = jVar.f50517h;
        }
        return jVar.f50529t + '_' + jVar.f50516g + '_' + str;
    }

    /* renamed from: a */
    public static boolean m39977a(C21277c cVar, Uri uri, C21284j jVar) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(jVar, "");
        String queryParameter = uri.getQueryParameter("__dev");
        if (C89219l.m154714a((Object) queryParameter, (Object) "1") || ((queryParameter == null || queryParameter.length() == 0) && C21170d.C21171a.m39868a().f50220a)) {
            return false;
        }
        if (C89219l.m154714a((Object) C21361a.m40113a(uri, "enable_memory_cache"), (Object) "1") || cVar.f50498e) {
            return true;
        }
        return false;
    }
}
