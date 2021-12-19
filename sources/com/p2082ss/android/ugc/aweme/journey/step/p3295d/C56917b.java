package com.p2082ss.android.ugc.aweme.journey.step.p3295d;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.d.b */
public final class C56917b {

    /* renamed from: a */
    public final boolean f129621a;

    /* renamed from: b */
    public final Intent f129622b;

    static {
        Covode.recordClassIndex(66804);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56917b)) {
            return false;
        }
        C56917b bVar = (C56917b) obj;
        return this.f129621a == bVar.f129621a && C89219l.m154714a(this.f129622b, bVar.f129622b);
    }

    public final int hashCode() {
        boolean z = this.f129621a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        Intent intent = this.f129622b;
        return i4 + (intent != null ? intent.hashCode() : 0);
    }

    public final String toString() {
        return "DeeplinkData(isLoginRequired=" + this.f129621a + ", intent=" + this.f129622b + ")";
    }

    public C56917b(boolean z, Intent intent) {
        C89219l.m154721d(intent, "");
        this.f129621a = z;
        this.f129622b = intent;
    }
}
