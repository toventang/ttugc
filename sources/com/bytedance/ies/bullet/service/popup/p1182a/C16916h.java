package com.bytedance.ies.bullet.service.popup.p1182a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.a.h */
public final class C16916h {

    /* renamed from: a */
    public final String f40209a;

    /* renamed from: b */
    public final int f40210b;

    static {
        Covode.recordClassIndex(19356);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16916h)) {
            return false;
        }
        C16916h hVar = (C16916h) obj;
        return C89219l.m154714a(this.f40209a, hVar.f40209a) && this.f40210b == hVar.f40210b;
    }

    public final int hashCode() {
        String str = this.f40209a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f40210b;
    }

    public final String toString() {
        return "KeyboardStyle(mode=" + this.f40209a + ", distance=" + this.f40210b + ")";
    }

    public /* synthetic */ C16916h() {
        this("center", 0);
    }

    public C16916h(String str, int i) {
        C89219l.m154719c(str, "");
        this.f40209a = str;
        this.f40210b = i;
    }
}
