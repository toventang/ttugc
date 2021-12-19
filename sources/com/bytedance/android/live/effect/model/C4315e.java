package com.bytedance.android.live.effect.model;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.model.e */
public final class C4315e<T> {

    /* renamed from: a */
    public final String f11861a;

    /* renamed from: b */
    public final List<T> f11862b;

    static {
        Covode.recordClassIndex(4887);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4315e)) {
            return false;
        }
        C4315e eVar = (C4315e) obj;
        return C89219l.m154714a(this.f11861a, eVar.f11861a) && C89219l.m154714a(this.f11862b, eVar.f11862b);
    }

    public final int hashCode() {
        String str = this.f11861a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<T> list = this.f11862b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "LiveEffectPanel(panelName=" + this.f11861a + ", effectList=" + this.f11862b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4315e(String str, List<? extends T> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.f11861a = str;
        this.f11862b = list;
    }
}
