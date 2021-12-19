package com.google.android.play.core.p1961a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.a.y */
final class C26763y extends AbstractC26741d {

    /* renamed from: a */
    private final int f63409a;

    /* renamed from: b */
    private final boolean f63410b;

    static {
        Covode.recordClassIndex(32235);
    }

    /* synthetic */ C26763y(int i, boolean z) {
        this.f63409a = i;
        this.f63410b = z;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26741d
    /* renamed from: a */
    public final int mo44406a() {
        return this.f63409a;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26741d
    /* renamed from: b */
    public final boolean mo44407b() {
        return this.f63410b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC26741d) {
            AbstractC26741d dVar = (AbstractC26741d) obj;
            return this.f63409a == dVar.mo44406a() && this.f63410b == dVar.mo44407b();
        }
    }

    public final int hashCode() {
        return ((this.f63409a ^ 1000003) * 1000003) ^ (true != this.f63410b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f63409a;
        boolean z = this.f63410b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
