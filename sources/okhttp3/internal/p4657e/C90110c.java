package okhttp3.internal.p4657e;

import com.bytedance.covode.number.Covode;
import okhttp3.internal.C90084c;
import p4632k.C89427i;

/* renamed from: okhttp3.internal.e.c */
public final class C90110c {

    /* renamed from: a */
    public static final C89427i f204524a = C89427i.encodeUtf8(":");

    /* renamed from: b */
    public static final C89427i f204525b = C89427i.encodeUtf8(":status");

    /* renamed from: c */
    public static final C89427i f204526c = C89427i.encodeUtf8(":method");

    /* renamed from: d */
    public static final C89427i f204527d = C89427i.encodeUtf8(":path");

    /* renamed from: e */
    public static final C89427i f204528e = C89427i.encodeUtf8(":scheme");

    /* renamed from: f */
    public static final C89427i f204529f = C89427i.encodeUtf8(":authority");

    /* renamed from: g */
    public final C89427i f204530g;

    /* renamed from: h */
    public final C89427i f204531h;

    /* renamed from: i */
    final int f204532i;

    /* renamed from: okhttp3.internal.e.c$a */
    interface AbstractC90111a {
        static {
            Covode.recordClassIndex(106283);
        }
    }

    public final int hashCode() {
        return ((this.f204530g.hashCode() + 527) * 31) + this.f204531h.hashCode();
    }

    public final String toString() {
        return C90084c.m156407a("%s: %s", this.f204530g.utf8(), this.f204531h.utf8());
    }

    static {
        Covode.recordClassIndex(106282);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C90110c) {
            C90110c cVar = (C90110c) obj;
            if (!this.f204530g.equals(cVar.f204530g) || !this.f204531h.equals(cVar.f204531h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C90110c(C89427i iVar, String str) {
        this(iVar, C89427i.encodeUtf8(str));
    }

    public C90110c(String str, String str2) {
        this(C89427i.encodeUtf8(str), C89427i.encodeUtf8(str2));
    }

    public C90110c(C89427i iVar, C89427i iVar2) {
        this.f204530g = iVar;
        this.f204531h = iVar2;
        this.f204532i = iVar.size() + 32 + iVar2.size();
    }
}
