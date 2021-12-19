package com.facebook.p1902j.p1903a;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.j.a.a */
final class C24800a {

    /* renamed from: a */
    byte[] f58839a;

    /* renamed from: b */
    int f58840b;

    /* renamed from: c */
    int f58841c;

    /* renamed from: d */
    char f58842d;

    /* renamed from: e */
    boolean f58843e;

    static {
        Covode.recordClassIndex(28953);
    }

    C24800a() {
    }

    /* renamed from: d */
    private void m47512d() {
        if (!this.f58843e) {
            throw new IllegalStateException("Must call useDelimiter first");
        }
    }

    /* renamed from: c */
    public final void mo40613c() {
        mo40610a();
        m47512d();
        m47513e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40610a() {
        if (this.f58839a == null) {
            throw new IllegalStateException("Must call reset first");
        }
    }

    /* renamed from: e */
    private int m47513e() {
        mo40610a();
        m47512d();
        int i = this.f58841c;
        int i2 = this.f58840b;
        if (i > i2) {
            int a = m47511a(this.f58839a, i2, i, this.f58842d);
            if (a == -1) {
                int i3 = this.f58841c;
                int i4 = i3 - this.f58840b;
                this.f58840b = i3;
                return i4;
            }
            int i5 = a - this.f58840b;
            this.f58840b = a + 1;
            return i5;
        }
        throw new NoSuchElementException("Reading past end of input stream at " + this.f58840b + ".");
    }

    /* renamed from: b */
    public final int mo40612b() {
        mo40610a();
        m47512d();
        int i = this.f58840b;
        int e = m47513e();
        byte[] bArr = this.f58839a;
        int i2 = e + i;
        int i3 = 0;
        while (i < i2) {
            int i4 = i + 1;
            int i5 = bArr[i] - 48;
            if (i5 < 0 || i5 > 9) {
                throw new NumberFormatException("Invalid int in buffer at " + (i4 - 1) + ".");
            }
            i3 = (i3 * 10) + i5;
            i = i4;
        }
        return i3;
    }

    /* renamed from: a */
    public final boolean mo40611a(String str) {
        int i = this.f58840b;
        if (str.length() != m47513e()) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) != this.f58839a[i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: a */
    private static int m47511a(byte[] bArr, int i, int i2, char c) {
        while (i < i2) {
            if (bArr[i] == c) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
