package com.bytedance.jedi.arch.ext.list;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.ext.list.o */
public class C20465o {

    /* renamed from: a */
    public final C20442b f48406a;

    /* renamed from: b */
    public final int f48407b;

    static {
        Covode.recordClassIndex(23986);
    }

    public C20465o() {
        this(false, 3, (byte) 0);
    }

    public int hashCode() {
        return (this.f48406a.hashCode() * 31) + this.f48407b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20465o)) {
            return false;
        }
        C20465o oVar = (C20465o) obj;
        if (!(!C89219l.m154714a(this.f48406a, oVar.f48406a)) && this.f48407b == oVar.f48407b) {
            return true;
        }
        return false;
    }

    public C20465o(boolean z, int i) {
        this.f48407b = i;
        this.f48406a = new C20442b(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20465o(boolean z, int i, byte b) {
        this((i & 1) != 0 ? true : z, 0);
    }
}
