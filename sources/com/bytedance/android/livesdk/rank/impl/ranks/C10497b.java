package com.bytedance.android.livesdk.rank.impl.ranks;

import android.text.TextUtils;
import androidx.core.p036g.C0691d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b */
public final class C10497b {

    /* renamed from: a */
    public final int f25269a;

    /* renamed from: b */
    public final CharSequence f25270b;

    /* renamed from: c */
    public final int f25271c;

    /* renamed from: d */
    public final long f25272d;

    static {
        Covode.recordClassIndex(12072);
    }

    public final int hashCode() {
        return C0691d.m2447a(Integer.valueOf(this.f25269a), this.f25270b, Integer.valueOf(this.f25271c), Long.valueOf(this.f25272d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C10497b bVar = (C10497b) obj;
            if (this.f25269a == bVar.f25269a && this.f25271c == bVar.f25271c && this.f25272d == bVar.f25272d && TextUtils.equals(this.f25270b, bVar.f25270b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C10497b(int i, CharSequence charSequence, int i2, long j) {
        this.f25269a = i;
        this.f25270b = charSequence;
        this.f25271c = i2;
        this.f25272d = j;
    }
}
