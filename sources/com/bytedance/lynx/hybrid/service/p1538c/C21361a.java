package com.bytedance.lynx.hybrid.service.p1538c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.service.c.a */
public final class C21361a {
    static {
        Covode.recordClassIndex(24980);
    }

    /* renamed from: a */
    public static final String m40113a(Uri uri, String str) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(str, "");
        try {
            return uri.getQueryParameter(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
