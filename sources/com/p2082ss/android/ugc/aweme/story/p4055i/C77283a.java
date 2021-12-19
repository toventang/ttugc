package com.p2082ss.android.ugc.aweme.story.p4055i;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.i.a */
public final class C77283a {

    /* renamed from: a */
    public static final C77283a f173372a = new C77283a();

    private C77283a() {
    }

    /* renamed from: a */
    private static boolean m135110a() {
        if (C51423a.f118496a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(90300);
    }

    /* renamed from: a */
    private static String m135106a(String str) {
        return "Story-".concat(String.valueOf(str));
    }

    /* renamed from: a */
    public static void m135107a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String a = m135106a(str);
        if (m135110a()) {
            C51423a.m95784a(4, a, str2);
        }
    }

    /* renamed from: b */
    public static void m135111b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String a = m135106a(str);
        if (m135110a()) {
            C51423a.m95784a(3, a, str2);
        }
    }

    /* renamed from: c */
    public static void m135112c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String a = m135106a(str);
        if (m135110a()) {
            C51423a.m95784a(6, a, str2);
        }
    }

    /* renamed from: a */
    public static void m135109a(String str, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(th, "");
        String a = m135106a(str);
        if (m135110a()) {
            C51423a.m95784a(6, a, Log.getStackTraceString(th));
        }
    }

    /* renamed from: a */
    public static void m135108a(String str, String str2, Throwable th) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(th, "");
        String a = m135106a(str);
        if (m135110a()) {
            C51423a.m95791b(6, a, str2 + ": " + Log.getStackTraceString(th));
        }
    }
}
