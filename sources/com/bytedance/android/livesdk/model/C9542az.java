package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.az */
public class C9542az {
    @AbstractC27891c(mo46611a = "is_muted")

    /* renamed from: a */
    public boolean f23191a;
    @AbstractC27891c(mo46611a = "is_admin")

    /* renamed from: b */
    public boolean f23192b;
    @AbstractC27891c(mo46611a = "is_super_admin")

    /* renamed from: c */
    public boolean f23193c;
    @AbstractC27891c(mo46611a = "mute_duration")

    /* renamed from: d */
    public long f23194d;

    static {
        Covode.recordClassIndex(11081);
    }

    public int hashCode() {
        return ((this.f23191a ? 1 : 0) * 31) + (this.f23192b ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C9542az azVar = (C9542az) obj;
            if (this.f23191a == azVar.f23191a && this.f23192b == azVar.f23192b) {
                return true;
            }
        }
        return false;
    }
}
