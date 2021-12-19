package com.bytedance.android.livesdk.model.utils.p593a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.utils.a.b */
public final class C9908b {

    /* renamed from: a */
    public char[] f24026a;

    /* renamed from: b */
    public int f24027b;

    static {
        Covode.recordClassIndex(11454);
    }

    public final String toString() {
        return new String(this.f24026a, 0, this.f24027b);
    }

    public C9908b(int i) {
        if (i >= 0) {
            this.f24026a = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: a */
    private void m18211a(int i) {
        char[] cArr = new char[Math.max(this.f24026a.length << 1, i)];
        System.arraycopy(this.f24026a, 0, cArr, 0, this.f24027b);
        this.f24026a = cArr;
    }

    /* renamed from: a */
    public final void mo16608a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f24027b + length;
        if (i > this.f24026a.length) {
            m18211a(i);
        }
        str.getChars(0, length, this.f24026a, this.f24027b);
        this.f24027b = i;
    }
}
