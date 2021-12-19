package com.bytedance.creativex.recorder.p940b.p941a;

import android.view.animation.Animation;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.b.a.k */
public final class C14191k {

    /* renamed from: a */
    public final Animation f34465a;

    /* renamed from: b */
    public final boolean f34466b;

    static {
        Covode.recordClassIndex(16260);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14191k)) {
            return false;
        }
        C14191k kVar = (C14191k) obj;
        return C89219l.m154714a(this.f34465a, kVar.f34465a) && this.f34466b == kVar.f34466b;
    }

    public final int hashCode() {
        Animation animation = this.f34465a;
        int hashCode = (animation != null ? animation.hashCode() : 0) * 31;
        boolean z = this.f34466b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "OnAnimVisibilityChanged(anim=" + this.f34465a + ", toVisible=" + this.f34466b + ")";
    }

    public C14191k(Animation animation, boolean z) {
        C89219l.m154721d(animation, "");
        this.f34465a = animation;
        this.f34466b = z;
    }
}
