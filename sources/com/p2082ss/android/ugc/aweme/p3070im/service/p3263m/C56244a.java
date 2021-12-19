package com.p2082ss.android.ugc.aweme.p3070im.service.p3263m;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.service.m.a */
public final class C56244a {

    /* renamed from: a */
    public static final C56244a f128254a = new C56244a();

    /* renamed from: a */
    public static final void m102185a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
    }

    /* renamed from: b */
    public static final void m102190b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
    }

    private C56244a() {
    }

    /* renamed from: a */
    private static boolean m102189a() {
        if (C51423a.f118496a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(66053);
    }

    /* renamed from: a */
    public static final void m102188a(Throwable th) {
        C89219l.m154721d(th, "");
        if (m102189a()) {
            C51423a.m95790a(th);
        }
    }

    /* renamed from: a */
    public static final void m102187a(String str, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(th, "");
        if (m102189a()) {
            C51423a.m95784a(6, str, Log.getStackTraceString(th));
        }
    }

    /* renamed from: c */
    public static final void m102191c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (m102189a()) {
            C51423a.m95784a(4, str, str2);
        }
    }

    /* renamed from: d */
    public static final void m102192d(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (m102189a()) {
            C51423a.m95784a(5, str, str2);
        }
    }

    /* renamed from: e */
    public static final void m102193e(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (m102189a()) {
            C51423a.m95784a(6, str, str2);
        }
    }

    /* renamed from: a */
    public static final void m102186a(String str, String str2, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(th, "");
        if (m102189a()) {
            C51423a.m95791b(6, str, str2 + ": " + Log.getStackTraceString(th));
        }
    }
}
