package com.bytedance.apm.block.p766a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.block.a.e */
public final class C12363e {

    /* renamed from: a */
    public long[] f29786a = new long[4];

    /* renamed from: b */
    public boolean f29787b;

    static {
        Covode.recordClassIndex(14169);
    }

    /* renamed from: a */
    public final boolean mo20118a() {
        long[] jArr = this.f29786a;
        if (jArr[0] - jArr[2] > 100) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo20117a(long j) {
        long[] jArr = this.f29786a;
        if (jArr[0] == 0) {
            jArr[0] = SystemClock.uptimeMillis();
        }
        long[] jArr2 = this.f29786a;
        jArr2[1] = jArr2[1] + 1;
        if (j < jArr2[2]) {
            jArr2[2] = j;
        }
        if (j > jArr2[3]) {
            jArr2[3] = j;
        }
        this.f29787b = true;
    }
}
