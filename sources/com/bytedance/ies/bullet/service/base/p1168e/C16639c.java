package com.bytedance.ies.bullet.service.base.p1168e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.base.e.c */
public final class C16639c {
    static {
        Covode.recordClassIndex(19076);
    }

    /* renamed from: a */
    public static final Long m30884a(String str) {
        boolean z;
        C89219l.m154719c(str, "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final String m30885a(Uri uri, String str) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(str, "");
        try {
            return uri.getQueryParameter(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
