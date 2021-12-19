package com.bytedance.android.live.liveinteract.multilive.anchor.p351b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.b.d */
public final class C5485d {

    /* renamed from: a */
    public boolean f14056a;

    /* renamed from: b */
    public String f14057b;

    static {
        Covode.recordClassIndex(6080);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5485d)) {
            return false;
        }
        C5485d dVar = (C5485d) obj;
        return this.f14056a == dVar.f14056a && C89219l.m154714a(this.f14057b, dVar.f14057b);
    }

    public final int hashCode() {
        boolean z = this.f14056a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f14057b;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OpenCameraDialogInfo(dialogShowing=" + this.f14056a + ", source=" + this.f14057b + ")";
    }

    public C5485d(boolean z, String str) {
        C89219l.m154721d(str, "");
        this.f14056a = z;
        this.f14057b = str;
    }
}
