package com.bytedance.android.live.liveinteract.multilive.p341a.p342a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.a.i */
public final class C5393i {

    /* renamed from: a */
    public int f13905a;

    /* renamed from: b */
    public int f13906b;

    static {
        Covode.recordClassIndex(5988);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5393i)) {
            return false;
        }
        C5393i iVar = (C5393i) obj;
        return this.f13905a == iVar.f13905a && this.f13906b == iVar.f13906b;
    }

    public final int hashCode() {
        return (this.f13905a * 31) + this.f13906b;
    }

    public final String toString() {
        return "GuestApplyInfo(position=" + this.f13905a + ", seiVersion=" + this.f13906b + ")";
    }

    public /* synthetic */ C5393i(int i) {
        this(i, 0);
    }

    public C5393i(int i, int i2) {
        this.f13905a = i;
        this.f13906b = i2;
    }
}
