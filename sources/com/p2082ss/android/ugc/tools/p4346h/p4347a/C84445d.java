package com.p2082ss.android.ugc.tools.p4346h.p4347a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.a.d */
public final class C84445d<KEY, RESULT> {

    /* renamed from: a */
    public final EnumC84446e f188779a;

    /* renamed from: b */
    public final KEY f188780b;

    /* renamed from: c */
    public final RESULT f188781c;

    /* renamed from: d */
    public final Exception f188782d;

    /* renamed from: e */
    public final Integer f188783e;

    static {
        Covode.recordClassIndex(98410);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84445d)) {
            return false;
        }
        C84445d dVar = (C84445d) obj;
        return C89219l.m154714a(this.f188779a, dVar.f188779a) && C89219l.m154714a(this.f188780b, dVar.f188780b) && C89219l.m154714a(this.f188781c, dVar.f188781c) && C89219l.m154714a(this.f188782d, dVar.f188782d) && C89219l.m154714a(this.f188783e, dVar.f188783e);
    }

    public final int hashCode() {
        EnumC84446e eVar = this.f188779a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        KEY key = this.f188780b;
        int hashCode2 = (hashCode + (key != null ? key.hashCode() : 0)) * 31;
        RESULT result = this.f188781c;
        int hashCode3 = (hashCode2 + (result != null ? result.hashCode() : 0)) * 31;
        Exception exc = this.f188782d;
        int hashCode4 = (hashCode3 + (exc != null ? exc.hashCode() : 0)) * 31;
        Integer num = this.f188783e;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "DownloadEvent(state=" + this.f188779a + ", key=" + ((Object) this.f188780b) + ", result=" + ((Object) this.f188781c) + ", exception=" + this.f188782d + ", progress=" + this.f188783e + ")";
    }

    public /* synthetic */ C84445d(EnumC84446e eVar, Object obj, Object obj2, Exception exc) {
        this(eVar, obj, obj2, exc, null);
    }

    public C84445d(EnumC84446e eVar, KEY key, RESULT result, Exception exc, Integer num) {
        C89219l.m154721d(eVar, "");
        this.f188779a = eVar;
        this.f188780b = key;
        this.f188781c = result;
        this.f188782d = exc;
        this.f188783e = num;
    }
}
