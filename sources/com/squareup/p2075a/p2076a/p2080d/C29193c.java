package com.squareup.p2075a.p2076a.p2080d;

import com.appsflyer.BuildConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.squareup.a.a.d.c */
final class C29193c {

    /* renamed from: a */
    final String f69144a;

    /* renamed from: b */
    final int f69145b;

    /* renamed from: c */
    int f69146c;

    /* renamed from: d */
    int f69147d;

    /* renamed from: e */
    int f69148e;

    /* renamed from: f */
    int f69149f;

    /* renamed from: g */
    char[] f69150g;

    static {
        Covode.recordClassIndex(35542);
    }

    /* renamed from: e */
    private char m58386e() {
        int i;
        int i2;
        int a = m58385a(this.f69146c);
        this.f69146c++;
        if (a < 128) {
            return (char) a;
        }
        if (a < 192 || a > 247) {
            return '?';
        }
        if (a <= 223) {
            i2 = a & 31;
            i = 1;
        } else if (a <= 239) {
            i = 2;
            i2 = a & 15;
        } else {
            i = 3;
            i2 = a & 7;
        }
        int i3 = 0;
        do {
            int i4 = this.f69146c + 1;
            this.f69146c = i4;
            if (i4 == this.f69145b || this.f69150g[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.f69146c = i5;
            int a2 = m58385a(i5);
            this.f69146c++;
            if ((a2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (a2 & 63);
            i3++;
        } while (i3 < i);
        return (char) i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final char mo50920d() {
        int i = this.f69146c + 1;
        this.f69146c = i;
        if (i != this.f69145b) {
            char[] cArr = this.f69150g;
            char c = cArr[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case BuildConfig.VERSION_CODE:
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case AudiencePingIntervalSetting.DEFAULT:
                            case '=':
                            case '>':
                                break;
                            default:
                                return m58386e();
                        }
                }
            }
            return cArr[i];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f69144a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo50918b() {
        int i;
        int i2 = this.f69146c;
        if (i2 + 4 < this.f69145b) {
            this.f69147d = i2;
            this.f69146c = i2 + 1;
            while (true) {
                i = this.f69146c;
                if (i == this.f69145b) {
                    break;
                }
                char[] cArr = this.f69150g;
                if (cArr[i] == '+' || cArr[i] == ',' || cArr[i] == ';') {
                    break;
                } else if (cArr[i] == ' ') {
                    this.f69148e = i;
                    this.f69146c = i + 1;
                    while (true) {
                        int i3 = this.f69146c;
                        if (i3 >= this.f69145b || this.f69150g[i3] != ' ') {
                            break;
                        }
                        this.f69146c = i3 + 1;
                    }
                } else {
                    if (cArr[i] >= 'A' && cArr[i] <= 'F') {
                        cArr[i] = (char) (cArr[i] + ' ');
                    }
                    this.f69146c = i + 1;
                }
            }
            this.f69148e = i;
            int i4 = this.f69148e;
            int i5 = this.f69147d;
            int i6 = i4 - i5;
            if (i6 < 5 || (i6 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f69144a);
            }
            int i7 = i6 / 2;
            byte[] bArr = new byte[i7];
            int i8 = i5 + 1;
            for (int i9 = 0; i9 < i7; i9++) {
                bArr[i9] = (byte) m58385a(i8);
                i8 += 2;
            }
            return new String(this.f69150g, this.f69147d, i6);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f69144a);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        r2 = r8.f69150g;
        r1 = r8.f69147d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        return new java.lang.String(r2, r1, r8.f69148e - r1);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo50919c() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.p2080d.C29193c.mo50919c():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo50917a() {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.p2080d.C29193c.mo50917a():java.lang.String");
    }

    public C29193c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f69144a = name;
        this.f69145b = name.length();
    }

    /* renamed from: a */
    private int m58385a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f69145b) {
            char[] cArr = this.f69150g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f69144a);
            } else {
                i2 = c - '7';
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f69144a);
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.f69144a);
    }
}
