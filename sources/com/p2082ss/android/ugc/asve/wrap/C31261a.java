package com.p2082ss.android.ugc.asve.wrap;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.asve.wrap.a */
public final class C31261a {

    /* renamed from: a */
    public final int f74944a;

    static {
        Covode.recordClassIndex(37910);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C31261a) && this.f74944a == ((C31261a) obj).f74944a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f74944a;
    }

    public final String toString() {
        return "AVSkeletonInfo(id=" + this.f74944a + ")";
    }

    private /* synthetic */ C31261a() {
        this(-1);
    }

    public C31261a(int i) {
        this.f74944a = i;
    }
}
