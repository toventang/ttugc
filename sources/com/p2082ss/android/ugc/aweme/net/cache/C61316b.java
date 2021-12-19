package com.p2082ss.android.ugc.aweme.net.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;
import p4632k.C89427i;

/* renamed from: com.ss.android.ugc.aweme.net.cache.b */
public final class C61316b {
    static {
        Covode.recordClassIndex(71947);
    }

    /* renamed from: a */
    public static final C61321f m111000a(Request request) {
        C89219l.m154721d(request, "");
        Object extraInfo = request.getExtraInfo();
        if (extraInfo instanceof C61321f) {
            return (C61321f) extraInfo;
        }
        return null;
    }

    /* renamed from: b */
    public static final C61318d m111003b(Request request) {
        C89219l.m154721d(request, "");
        Object extraInfo = request.getExtraInfo();
        if (extraInfo instanceof C61321f) {
            return ((C61321f) extraInfo).f139271v;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m111004c(Request request) {
        C61318d b;
        C89219l.m154721d(request, "");
        if (!m111007f(request) || (b = m111003b(request)) == null) {
            return false;
        }
        int i = b.f139268d;
        if (i == 0 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m111005d(Request request) {
        C61318d b;
        C89219l.m154721d(request, "");
        if (!m111007f(request) || (b = m111003b(request)) == null) {
            return false;
        }
        int i = b.f139268d;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final String m111006e(Request request) {
        C89219l.m154721d(request, "");
        Object tag = request.tag(C61330k.class);
        if (tag != null) {
            return ((C61330k) tag).f139288a;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: f */
    private static boolean m111007f(Request request) {
        C89219l.m154721d(request, "");
        return C89361p.m154872a("GET", request.getMethod(), true);
    }

    /* renamed from: a */
    public static final String m111001a(String str) {
        C89219l.m154721d(str, "");
        return C89427i.C89428a.m155139a(str).md5().hex();
    }

    /* renamed from: a */
    public static final void m111002a(Request request, boolean z) {
        C89219l.m154721d(request, "");
        C61321f a = m111000a(request);
        if (a != null) {
            a.f139272w = z;
        }
    }
}
