package com.p2082ss.android.ugc.gamora.editor.lightening.p4282b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.g */
public final class C82366g<V> {

    /* renamed from: d */
    public static final C82367a f184252d = new C82367a((byte) 0);

    /* renamed from: a */
    public final EnumC82368h f184253a;

    /* renamed from: b */
    public final V f184254b;

    /* renamed from: c */
    public final Throwable f184255c;

    static {
        Covode.recordClassIndex(96200);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82366g)) {
            return false;
        }
        C82366g gVar = (C82366g) obj;
        return C89219l.m154714a(this.f184253a, gVar.f184253a) && C89219l.m154714a(this.f184254b, gVar.f184254b) && C89219l.m154714a(this.f184255c, gVar.f184255c);
    }

    public final int hashCode() {
        EnumC82368h hVar = this.f184253a;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        V v = this.f184254b;
        int hashCode2 = (hashCode + (v != null ? v.hashCode() : 0)) * 31;
        Throwable th = this.f184255c;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "LoadEvent(state=" + this.f184253a + ", data=" + ((Object) this.f184254b) + ", exception=" + this.f184255c + ")";
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.g$a */
    public static final class C82367a {
        static {
            Covode.recordClassIndex(96201);
        }

        private C82367a() {
        }

        public /* synthetic */ C82367a(byte b) {
            this();
        }
    }

    private C82366g(EnumC82368h hVar, V v, Throwable th) {
        C89219l.m154721d(hVar, "");
        this.f184253a = hVar;
        this.f184254b = v;
        this.f184255c = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C82366g(EnumC82368h hVar, Object obj, Throwable th, int i) {
        this(hVar, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : th);
    }
}
