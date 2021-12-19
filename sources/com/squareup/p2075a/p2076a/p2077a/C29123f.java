package com.squareup.p2075a.p2076a.p2077a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import p4632k.C89427i;

/* renamed from: com.squareup.a.a.a.f */
public final class C29123f {

    /* renamed from: a */
    public static final C89427i f68890a = C89427i.encodeUtf8(":status");

    /* renamed from: b */
    public static final C89427i f68891b = C89427i.encodeUtf8(":method");

    /* renamed from: c */
    public static final C89427i f68892c = C89427i.encodeUtf8(":path");

    /* renamed from: d */
    public static final C89427i f68893d = C89427i.encodeUtf8(":scheme");

    /* renamed from: e */
    public static final C89427i f68894e = C89427i.encodeUtf8(":authority");

    /* renamed from: f */
    public static final C89427i f68895f = C89427i.encodeUtf8(":host");

    /* renamed from: g */
    public static final C89427i f68896g = C89427i.encodeUtf8(":version");

    /* renamed from: h */
    public final C89427i f68897h;

    /* renamed from: i */
    public final C89427i f68898i;

    /* renamed from: j */
    final int f68899j;

    public final int hashCode() {
        return ((this.f68897h.hashCode() + 527) * 31) + this.f68898i.hashCode();
    }

    public final String toString() {
        return C1764a.m5928a("%s: %s", new Object[]{this.f68897h.utf8(), this.f68898i.utf8()});
    }

    static {
        Covode.recordClassIndex(35472);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C29123f) {
            C29123f fVar = (C29123f) obj;
            if (!this.f68897h.equals(fVar.f68897h) || !this.f68898i.equals(fVar.f68898i)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C29123f(C89427i iVar, String str) {
        this(iVar, C89427i.encodeUtf8(str));
    }

    public C29123f(String str, String str2) {
        this(C89427i.encodeUtf8(str), C89427i.encodeUtf8(str2));
    }

    public C29123f(C89427i iVar, C89427i iVar2) {
        this.f68897h = iVar;
        this.f68898i = iVar2;
        this.f68899j = iVar.size() + 32 + iVar2.size();
    }
}
