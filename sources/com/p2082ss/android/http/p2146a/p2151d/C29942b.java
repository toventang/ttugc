package com.p2082ss.android.http.p2146a.p2151d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.p2150c.C29939a;

/* renamed from: com.ss.android.http.a.d.b */
public final class C29942b {

    /* renamed from: a */
    public char[] f71427a;

    /* renamed from: b */
    public int f71428b;

    static {
        Covode.recordClassIndex(36354);
    }

    public final String toString() {
        return new String(this.f71427a, 0, this.f71428b);
    }

    public C29942b(int i) {
        if (i >= 0) {
            this.f71427a = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: a */
    public final void mo52268a(char c) {
        int i = this.f71428b + 1;
        if (i > this.f71427a.length) {
            mo52269a(i);
        }
        this.f71427a[this.f71428b] = c;
        this.f71428b = i;
    }

    /* renamed from: a */
    public final void mo52269a(int i) {
        char[] cArr = new char[Math.max(this.f71427a.length << 1, i)];
        System.arraycopy(this.f71427a, 0, cArr, 0, this.f71428b);
        this.f71427a = cArr;
    }

    /* renamed from: a */
    public final void mo52270a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f71428b + length;
        if (i > this.f71427a.length) {
            mo52269a(i);
        }
        str.getChars(0, length, this.f71427a, this.f71428b);
        this.f71428b = i;
    }

    /* renamed from: a */
    public final String mo52267a(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f71428b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            return new String(this.f71427a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public final String mo52271b(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f71428b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            while (i < i2 && C29939a.m60336a(this.f71427a[i])) {
                i++;
            }
            while (i2 > i && C29939a.m60336a(this.f71427a[i2 - 1])) {
                i2--;
            }
            return new String(this.f71427a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
