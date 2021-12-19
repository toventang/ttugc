package com.p2082ss.android.ugc.aweme.common;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.f */
public final class C39109f {

    /* renamed from: a */
    public static final C39109f f92305a = new C39109f();

    /* renamed from: a */
    public static final void m79400a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
    }

    private C39109f() {
    }

    /* renamed from: a */
    private static boolean m79402a() {
        if (C51423a.f118496a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(46725);
    }

    /* renamed from: b */
    public static final void m79403b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (m79402a()) {
            C51423a.m95784a(4, str, str2);
        }
    }

    /* renamed from: c */
    public static final void m79404c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (m79402a()) {
            C51423a.m95784a(6, str, str2);
        }
    }

    /* renamed from: a */
    public static final void m79401a(String str, String str2, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (m79402a()) {
            C51423a.m95791b(6, str, str2 + ": " + Log.getStackTraceString(th));
        }
    }
}
