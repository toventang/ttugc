package com.bytedance.android.livesdk.p458b.p459a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.b.a.e */
public final class C6896e implements Cloneable {

    /* renamed from: a */
    public int f17278a;

    /* renamed from: b */
    private long[] f17279b;

    /* renamed from: c */
    private long[] f17280c;

    static {
        Covode.recordClassIndex(7634);
    }

    public C6896e() {
        this((byte) 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C6896e clone() {
        try {
            C6896e eVar = (C6896e) super.clone();
            try {
                eVar.f17279b = (long[]) this.f17279b.clone();
                eVar.f17280c = (long[]) this.f17280c.clone();
                return eVar;
            } catch (CloneNotSupportedException unused) {
                return eVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public final String toString() {
        if (this.f17278a <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17278a * 28);
        sb.append('{');
        for (int i = 0; i < this.f17278a; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.f17279b[i]);
            sb.append('=');
            sb.append(this.f17280c[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    private C6896e(byte b) {
        int a = C6892b.m14751a(10);
        this.f17279b = new long[a];
        this.f17280c = new long[a];
        this.f17278a = 0;
    }

    /* renamed from: a */
    private void m14763a(int i) {
        int a = C6892b.m14751a(i);
        long[] jArr = new long[a];
        long[] jArr2 = new long[a];
        long[] jArr3 = this.f17279b;
        System.arraycopy(jArr3, 0, jArr, 0, jArr3.length);
        long[] jArr4 = this.f17280c;
        System.arraycopy(jArr4, 0, jArr2, 0, jArr4.length);
        this.f17279b = jArr;
        this.f17280c = jArr2;
    }

    /* renamed from: a */
    public final long mo13190a(long j) {
        int a = C6893c.m14752a(this.f17279b, this.f17278a, j);
        if (a < 0) {
            return 0;
        }
        return this.f17280c[a];
    }

    /* renamed from: b */
    public final void mo13192b(long j, long j2) {
        int i = this.f17278a;
        if (i == 0 || j > this.f17279b[i - 1]) {
            if (i >= this.f17279b.length) {
                m14763a(i + 1);
            }
            this.f17279b[i] = j;
            this.f17280c[i] = j2;
            this.f17278a = i + 1;
            return;
        }
        mo13191a(j, j2);
    }

    /* renamed from: a */
    public final void mo13191a(long j, long j2) {
        int a = C6893c.m14752a(this.f17279b, this.f17278a, j);
        if (a >= 0) {
            this.f17280c[a] = j2;
            return;
        }
        int i = a ^ -1;
        int i2 = this.f17278a;
        if (i2 >= this.f17279b.length) {
            m14763a(i2 + 1);
        }
        int i3 = this.f17278a;
        if (i3 - i != 0) {
            long[] jArr = this.f17279b;
            int i4 = i + 1;
            System.arraycopy(jArr, i, jArr, i4, i3 - i);
            long[] jArr2 = this.f17280c;
            System.arraycopy(jArr2, i, jArr2, i4, this.f17278a - i);
        }
        this.f17279b[i] = j;
        this.f17280c[i] = j2;
        this.f17278a++;
    }
}
