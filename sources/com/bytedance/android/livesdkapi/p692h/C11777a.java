package com.bytedance.android.livesdkapi.p692h;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27889a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdkapi.h.a */
public class C11777a {
    @AbstractC27889a

    /* renamed from: L */
    public EnumC9596a f28131L = EnumC9596a.DEFAULT;

    /* renamed from: M */
    public transient long f28132M;

    /* renamed from: N */
    public volatile long f28133N = SystemClock.elapsedRealtime();
    @AbstractC27891c(mo46611a = "common")

    /* renamed from: O */
    public C11778b f28134O;

    static {
        Covode.recordClassIndex(13467);
    }

    /* renamed from: b */
    public boolean mo15100b() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo18721a(long j) {
        long j2;
        C11778b bVar = this.f28134O;
        if (bVar != null) {
            j2 = bVar.f28137c;
        } else {
            j2 = 0;
        }
        if (j == 0 || j != j2) {
            return false;
        }
        return true;
    }
}
