package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.live.broadcast.model.e */
public final class C3258e {
    @AbstractC27891c(mo46611a = "enable_live_audio")

    /* renamed from: a */
    public boolean f9321a;
    @AbstractC27891c(mo46611a = "enable_live_third_party")

    /* renamed from: b */
    public boolean f9322b;
    @AbstractC27891c(mo46611a = "enable_live_screenshot")

    /* renamed from: c */
    public boolean f9323c;
    @AbstractC27891c(mo46611a = "toast")

    /* renamed from: d */
    public C3259a f9324d;

    /* renamed from: com.bytedance.android.live.broadcast.model.e$a */
    public static class C3259a {
        @AbstractC27891c(mo46611a = "new_anchor")

        /* renamed from: a */
        public boolean f9325a;

        static {
            Covode.recordClassIndex(3741);
        }
    }

    static {
        Covode.recordClassIndex(3740);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3258e) {
            C3258e eVar = (C3258e) obj;
            if (this.f9321a == eVar.f9321a && this.f9322b == eVar.f9322b && this.f9323c == eVar.f9323c) {
                return true;
            }
            return false;
        }
        return false;
    }
}
