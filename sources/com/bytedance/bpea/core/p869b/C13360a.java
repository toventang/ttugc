package com.bytedance.bpea.core.p869b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bpea.core.b.a */
public final class C13360a<T> {

    /* renamed from: a */
    public final int f32647a;

    /* renamed from: b */
    public final String f32648b;

    /* renamed from: c */
    public final T f32649c;

    static {
        Covode.recordClassIndex(15356);
    }

    public C13360a() {
        this(0, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13360a)) {
            return false;
        }
        C13360a aVar = (C13360a) obj;
        return this.f32647a == aVar.f32647a && C89219l.m154714a(this.f32648b, aVar.f32648b) && C89219l.m154714a(this.f32649c, aVar.f32649c);
    }

    public final int hashCode() {
        int i = this.f32647a * 31;
        String str = this.f32648b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        T t = this.f32649c;
        if (t != null) {
            i2 = t.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ResultData(code=" + this.f32647a + ", msg=" + this.f32648b + ", data=" + ((Object) this.f32649c) + ")";
    }

    private C13360a(int i, String str, T t) {
        this.f32647a = i;
        this.f32648b = str;
        this.f32649c = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13360a(int i, String str, Object obj, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : obj);
    }
}
