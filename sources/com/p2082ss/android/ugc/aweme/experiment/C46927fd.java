package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.experiment.fd */
public final class C46927fd {

    /* renamed from: a */
    public final boolean f109358a;

    /* renamed from: b */
    public final boolean f109359b;

    /* renamed from: c */
    public final int f109360c;

    static {
        Covode.recordClassIndex(55528);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46927fd)) {
            return false;
        }
        C46927fd fdVar = (C46927fd) obj;
        return this.f109358a == fdVar.f109358a && this.f109359b == fdVar.f109359b && this.f109360c == fdVar.f109360c;
    }

    public final int hashCode() {
        boolean z = this.f109358a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        if (!this.f109359b) {
            i = 0;
        }
        return ((i5 + i) * 31) + this.f109360c;
    }

    public final String toString() {
        return "PopupConfig(needContactPopup=" + this.f109358a + ", needFBPopup=" + this.f109359b + ", triggerScene=" + this.f109360c + ")";
    }

    public C46927fd(boolean z, boolean z2, int i) {
        this.f109358a = z;
        this.f109359b = z2;
        this.f109360c = i;
    }
}
