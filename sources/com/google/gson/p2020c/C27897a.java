package com.google.gson.p2020c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.C28025r;
import com.google.gson.internal.AbstractC27996e;
import com.google.gson.internal.bind.C27940c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.gson.c.a */
public class C27897a implements Closeable {

    /* renamed from: c */
    private static final char[] f65505c = ")]}'\n".toCharArray();

    /* renamed from: a */
    public boolean f65506a;

    /* renamed from: b */
    int f65507b;

    /* renamed from: d */
    private final Reader f65508d;

    /* renamed from: e */
    private final char[] f65509e = new char[1024];

    /* renamed from: f */
    private int f65510f;

    /* renamed from: g */
    private int f65511g;

    /* renamed from: h */
    private int f65512h;

    /* renamed from: i */
    private int f65513i;

    /* renamed from: j */
    private long f65514j;

    /* renamed from: k */
    private int f65515k;

    /* renamed from: l */
    private String f65516l;

    /* renamed from: m */
    private int[] f65517m;

    /* renamed from: n */
    private int f65518n;

    /* renamed from: o */
    private String[] f65519o;

    /* renamed from: p */
    private int[] f65520p;

    /* renamed from: u */
    private void m55860u() {
        if (!this.f65506a) {
            throw m55853b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    static {
        Covode.recordClassIndex(33491);
        AbstractC27996e.f65766a = new AbstractC27996e() {
            /* class com.google.gson.p2020c.C27897a.C278981 */

            static {
                Covode.recordClassIndex(33492);
            }

            @Override // com.google.gson.internal.AbstractC27996e
            /* renamed from: a */
            public final void mo46640a(C27897a aVar) {
                if (aVar instanceof C27940c) {
                    C27940c cVar = (C27940c) aVar;
                    cVar.mo46729a(EnumC27899b.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) cVar.mo46731g()).next();
                    cVar.mo46730a(entry.getValue());
                    cVar.mo46730a(new C28025r((String) entry.getKey()));
                    return;
                }
                int i = aVar.f65507b;
                if (i == 0) {
                    i = aVar.mo46637q();
                }
                if (i == 13) {
                    aVar.f65507b = 9;
                } else if (i == 12) {
                    aVar.f65507b = 8;
                } else if (i == 14) {
                    aVar.f65507b = 10;
                } else {
                    throw new IllegalStateException("Expected a name but was " + aVar.mo46627f() + aVar.mo46638r());
                }
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f65507b = 0;
        this.f65517m[0] = 8;
        this.f65518n = 1;
        this.f65508d.close();
    }

    /* renamed from: e */
    public boolean mo46626e() {
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 2 || i == 4) {
            return false;
        }
        return true;
    }

    public String toString() {
        return getClass().getSimpleName() + mo46638r();
    }

    /* renamed from: v */
    private void m55861v() {
        char c;
        do {
            if (this.f65510f < this.f65511g || m55855b(1)) {
                char[] cArr = this.f65509e;
                int i = this.f65510f;
                int i2 = i + 1;
                this.f65510f = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.f65512h++;
                    this.f65513i = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* renamed from: x */
    private void m55863x() {
        m55849a(true);
        int i = this.f65510f - 1;
        this.f65510f = i;
        char[] cArr = f65505c;
        if (i + cArr.length <= this.f65511g || m55855b(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f65505c;
                if (i2 >= cArr2.length) {
                    this.f65510f += cArr2.length;
                    return;
                } else if (this.f65509e[this.f65510f + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo46622b() {
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 4) {
            int i2 = this.f65518n - 1;
            this.f65518n = i2;
            int[] iArr = this.f65520p;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f65507b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo46627f() + mo46638r());
    }

    /* renamed from: k */
    public void mo46631k() {
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 7) {
            this.f65507b = 0;
            int[] iArr = this.f65520p;
            int i2 = this.f65518n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo46627f() + mo46638r());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final String mo46638r() {
        int i = this.f65512h + 1;
        return " at line " + i + " column " + ((this.f65510f - this.f65513i) + 1) + " path " + mo46636p();
    }

    /* renamed from: c */
    public void mo46623c() {
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 1) {
            m55850a(3);
            this.f65507b = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo46627f() + mo46638r());
    }

    /* renamed from: d */
    public void mo46625d() {
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 2) {
            int i2 = this.f65518n - 1;
            this.f65518n = i2;
            this.f65519o[i2] = null;
            int[] iArr = this.f65520p;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f65507b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo46627f() + mo46638r());
    }

    /* renamed from: f */
    public EnumC27899b mo46627f() {
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        switch (i) {
            case 1:
                return EnumC27899b.BEGIN_OBJECT;
            case 2:
                return EnumC27899b.END_OBJECT;
            case 3:
                return EnumC27899b.BEGIN_ARRAY;
            case 4:
                return EnumC27899b.END_ARRAY;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return EnumC27899b.BOOLEAN;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return EnumC27899b.NULL;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return EnumC27899b.STRING;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
                return EnumC27899b.NAME;
            case 15:
            case 16:
                return EnumC27899b.NUMBER;
            case 17:
                return EnumC27899b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: h */
    public String mo46628h() {
        String b;
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 14) {
            b = m55859t();
        } else if (i == 12) {
            b = m55854b('\'');
        } else if (i == 13) {
            b = m55854b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + mo46627f() + mo46638r());
        }
        this.f65507b = 0;
        this.f65519o[this.f65518n - 1] = b;
        return b;
    }

    /* renamed from: j */
    public boolean mo46630j() {
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 5) {
            this.f65507b = 0;
            int[] iArr = this.f65520p;
            int i2 = this.f65518n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f65507b = 0;
            int[] iArr2 = this.f65520p;
            int i3 = this.f65518n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo46627f() + mo46638r());
        }
    }

    /* renamed from: p */
    public String mo46636p() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f65518n;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f65517m[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[').append(this.f65520p[i2]).append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f65519o;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: g */
    private int mo46731g() {
        String str;
        String str2;
        int i;
        char c = this.f65509e[this.f65510f];
        if (c == 't' || c == 'T') {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f65510f + i2 >= this.f65511g && !m55855b(i2 + 1)) {
                return 0;
            }
            char c2 = this.f65509e[this.f65510f + i2];
            if (!(c2 == str.charAt(i2) || c2 == str2.charAt(i2))) {
                return 0;
            }
        }
        if ((this.f65510f + length < this.f65511g || m55855b(length + 1)) && m55851a(this.f65509e[this.f65510f + length])) {
            return 0;
        }
        this.f65510f += length;
        this.f65507b = i;
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d0, code lost:
        if (r15 == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00df, code lost:
        if (r15 != false) goto L_0x00d3;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m55858s() {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p2020c.C27897a.m55858s():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0058, code lost:
        m55860u();
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m55859t() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p2020c.C27897a.m55859t():java.lang.String");
    }

    /* renamed from: w */
    private char m55862w() {
        int i;
        int i2;
        if (this.f65510f != this.f65511g || m55855b(1)) {
            char[] cArr = this.f65509e;
            int i3 = this.f65510f;
            int i4 = i3 + 1;
            this.f65510f = i4;
            char c = cArr[i3];
            if (c == '\n') {
                this.f65512h++;
                this.f65513i = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return '\b';
                }
                if (c == 'f') {
                    return '\f';
                }
                if (c == 'n') {
                    return '\n';
                }
                if (c == 'r') {
                    return '\r';
                }
                if (c == 't') {
                    return '\t';
                }
                if (c != 'u') {
                    throw m55853b("Invalid escape sequence");
                } else if (i4 + 4 <= this.f65511g || m55855b(4)) {
                    char c2 = 0;
                    int i5 = this.f65510f;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.f65509e[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f65509e, this.f65510f, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.f65510f += 4;
                    return c2;
                } else {
                    throw m55853b("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw m55853b("Unterminated escape sequence");
    }

    /* renamed from: i */
    public String mo46629i() {
        String str;
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 10) {
            str = m55859t();
        } else if (i == 8) {
            str = m55854b('\'');
        } else if (i == 9) {
            str = m55854b('\"');
        } else if (i == 11) {
            str = this.f65516l;
            this.f65516l = null;
        } else if (i == 15) {
            str = Long.toString(this.f65514j);
        } else if (i == 16) {
            str = new String(this.f65509e, this.f65510f, this.f65515k);
            this.f65510f += this.f65515k;
        } else {
            throw new IllegalStateException("Expected a string but was " + mo46627f() + mo46638r());
        }
        this.f65507b = 0;
        int[] iArr = this.f65520p;
        int i2 = this.f65518n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: l */
    public double mo46632l() {
        char c;
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 15) {
            this.f65507b = 0;
            int[] iArr = this.f65520p;
            int i2 = this.f65518n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f65514j;
        }
        if (i == 16) {
            this.f65516l = new String(this.f65509e, this.f65510f, this.f65515k);
            this.f65510f += this.f65515k;
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 10) {
                this.f65516l = m55859t();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + mo46627f() + mo46638r());
            }
            this.f65516l = m55854b(c);
        }
        this.f65507b = 11;
        double parseDouble = Double.parseDouble(this.f65516l);
        if (this.f65506a || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f65516l = null;
            this.f65507b = 0;
            int[] iArr2 = this.f65520p;
            int i3 = this.f65518n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new C27901d("JSON forbids NaN and infinities: " + parseDouble + mo46638r());
    }

    /* renamed from: m */
    public long mo46633m() {
        char c;
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 15) {
            this.f65507b = 0;
            int[] iArr = this.f65520p;
            int i2 = this.f65518n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f65514j;
        }
        if (i == 16) {
            this.f65516l = new String(this.f65509e, this.f65510f, this.f65515k);
            this.f65510f += this.f65515k;
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 10) {
                this.f65516l = m55859t();
                long parseLong = Long.parseLong(this.f65516l);
                this.f65507b = 0;
                int[] iArr2 = this.f65520p;
                int i3 = this.f65518n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } else {
                throw new IllegalStateException("Expected a long but was " + mo46627f() + mo46638r());
            }
            this.f65516l = m55854b(c);
            try {
                long parseLong2 = Long.parseLong(this.f65516l);
                this.f65507b = 0;
                int[] iArr22 = this.f65520p;
                int i32 = this.f65518n - 1;
                iArr22[i32] = iArr22[i32] + 1;
                return parseLong2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f65507b = 11;
        double parseDouble = Double.parseDouble(this.f65516l);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f65516l = null;
            this.f65507b = 0;
            int[] iArr3 = this.f65520p;
            int i4 = this.f65518n - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f65516l + mo46638r());
    }

    /* renamed from: n */
    public int mo46634n() {
        char c;
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 15) {
            long j = this.f65514j;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f65507b = 0;
                int[] iArr = this.f65520p;
                int i3 = this.f65518n - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f65514j + mo46638r());
        }
        if (i == 16) {
            this.f65516l = new String(this.f65509e, this.f65510f, this.f65515k);
            this.f65510f += this.f65515k;
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 10) {
                this.f65516l = m55859t();
                int parseInt = Integer.parseInt(this.f65516l);
                this.f65507b = 0;
                int[] iArr2 = this.f65520p;
                int i4 = this.f65518n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } else {
                throw new IllegalStateException("Expected an int but was " + mo46627f() + mo46638r());
            }
            this.f65516l = m55854b(c);
            try {
                int parseInt2 = Integer.parseInt(this.f65516l);
                this.f65507b = 0;
                int[] iArr22 = this.f65520p;
                int i42 = this.f65518n - 1;
                iArr22[i42] = iArr22[i42] + 1;
                return parseInt2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f65507b = 11;
        double parseDouble = Double.parseDouble(this.f65516l);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f65516l = null;
            this.f65507b = 0;
            int[] iArr3 = this.f65520p;
            int i6 = this.f65518n - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f65516l + mo46638r());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009d, code lost:
        m55860u();
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo46635o() {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p2020c.C27897a.mo46635o():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final int mo46637q() {
        int a;
        int[] iArr = this.f65517m;
        int i = this.f65518n;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int a2 = m55849a(true);
            if (a2 != 44) {
                if (a2 == 59) {
                    m55860u();
                } else if (a2 == 93) {
                    this.f65507b = 4;
                    return 4;
                } else {
                    throw m55853b("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5 && (a = m55849a(true)) != 44) {
                if (a == 59) {
                    m55860u();
                } else if (a == 125) {
                    this.f65507b = 2;
                    return 2;
                } else {
                    throw m55853b("Unterminated object");
                }
            }
            int a3 = m55849a(true);
            if (a3 == 34) {
                this.f65507b = 13;
                return 13;
            } else if (a3 == 39) {
                m55860u();
                this.f65507b = 12;
                return 12;
            } else if (a3 != 125) {
                m55860u();
                this.f65510f--;
                if (m55851a((char) a3)) {
                    this.f65507b = 14;
                    return 14;
                }
                throw m55853b("Expected name");
            } else if (i2 != 5) {
                this.f65507b = 2;
                return 2;
            } else {
                throw m55853b("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int a4 = m55849a(true);
            if (a4 != 58) {
                if (a4 == 61) {
                    m55860u();
                    if (this.f65510f < this.f65511g || m55855b(1)) {
                        char[] cArr = this.f65509e;
                        int i3 = this.f65510f;
                        if (cArr[i3] == '>') {
                            this.f65510f = i3 + 1;
                        }
                    }
                } else {
                    throw m55853b("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            if (this.f65506a) {
                m55863x();
            }
            this.f65517m[this.f65518n - 1] = 7;
        } else if (i2 == 7) {
            if (m55849a(false) == -1) {
                this.f65507b = 17;
                return 17;
            }
            m55860u();
            this.f65510f--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int a5 = m55849a(true);
        if (a5 == 34) {
            this.f65507b = 9;
            return 9;
        } else if (a5 != 39) {
            if (!(a5 == 44 || a5 == 59)) {
                if (a5 == 91) {
                    this.f65507b = 3;
                    return 3;
                } else if (a5 != 93) {
                    if (a5 != 123) {
                        this.f65510f--;
                        int g = mo46731g();
                        if (g != 0) {
                            return g;
                        }
                        int s = m55858s();
                        if (s != 0) {
                            return s;
                        }
                        if (m55851a(this.f65509e[this.f65510f])) {
                            m55860u();
                            this.f65507b = 10;
                            return 10;
                        }
                        throw m55853b("Expected value");
                    }
                    this.f65507b = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f65507b = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m55860u();
                this.f65510f--;
                this.f65507b = 7;
                return 7;
            }
            throw m55853b("Unexpected value");
        } else {
            m55860u();
            this.f65507b = 8;
            return 8;
        }
    }

    /* renamed from: a */
    public void mo46621a() {
        int i = this.f65507b;
        if (i == 0) {
            i = mo46637q();
        }
        if (i == 3) {
            m55850a(1);
            this.f65520p[this.f65518n - 1] = 0;
            this.f65507b = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo46627f() + mo46638r());
    }

    /* renamed from: b */
    private IOException m55853b(String str) {
        throw new C27901d(str + mo46638r());
    }

    public C27897a(Reader reader) {
        int[] iArr = new int[32];
        this.f65517m = iArr;
        int i = this.f65518n;
        this.f65518n = i + 1;
        iArr[i] = 6;
        this.f65519o = new String[32];
        this.f65520p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f65508d = reader;
    }

    /* renamed from: a */
    private void m55850a(int i) {
        int i2 = this.f65518n;
        int[] iArr = this.f65517m;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f65520p, 0, iArr3, 0, this.f65518n);
            System.arraycopy(this.f65519o, 0, strArr, 0, this.f65518n);
            this.f65517m = iArr2;
            this.f65520p = iArr3;
            this.f65519o = strArr;
        }
        int[] iArr4 = this.f65517m;
        int i3 = this.f65518n;
        this.f65518n = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: c */
    private void m55856c(char c) {
        char[] cArr = this.f65509e;
        while (true) {
            int i = this.f65510f;
            int i2 = this.f65511g;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f65510f = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f65510f = i3;
                        m55862w();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.f65512h++;
                            this.f65513i = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f65510f = i;
                    if (!m55855b(1)) {
                        throw m55853b("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m55851a(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m55860u();
        return false;
    }

    /* renamed from: b */
    private String m55854b(char c) {
        char[] cArr = this.f65509e;
        StringBuilder sb = null;
        while (true) {
            int i = this.f65510f;
            int i2 = this.f65511g;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.f65510f = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f65510f = i4;
                        int i6 = (i4 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i, i6);
                        sb.append(m55862w());
                    } else {
                        if (c2 == '\n') {
                            this.f65512h++;
                            this.f65513i = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i3 - i) * 2, 16));
                    }
                    sb.append(cArr, i, i3 - i);
                    this.f65510f = i3;
                    if (!m55855b(1)) {
                        throw m55853b("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private int m55849a(boolean z) {
        char[] cArr = this.f65509e;
        int i = this.f65510f;
        int i2 = this.f65511g;
        while (true) {
            if (i == i2) {
                this.f65510f = i;
                if (m55855b(1)) {
                    i = this.f65510f;
                    i2 = this.f65511g;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + mo46638r());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f65512h++;
                this.f65513i = i3;
            } else if (!(c == ' ' || c == '\r' || c == '\t')) {
                if (c == '/') {
                    this.f65510f = i3;
                    if (i3 == i2) {
                        this.f65510f = i3 - 1;
                        boolean b = m55855b(2);
                        this.f65510f++;
                        if (!b) {
                            return c;
                        }
                    }
                    m55860u();
                    int i4 = this.f65510f;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f65510f = i4 + 1;
                        if (m55852a("*/")) {
                            i = this.f65510f + 2;
                            i2 = this.f65511g;
                        } else {
                            throw m55853b("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f65510f = i4 + 1;
                        m55861v();
                        i = this.f65510f;
                        i2 = this.f65511g;
                    }
                } else if (c == '#') {
                    this.f65510f = i3;
                    m55860u();
                    m55861v();
                    i = this.f65510f;
                    i2 = this.f65511g;
                } else {
                    this.f65510f = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: b */
    private boolean m55855b(int i) {
        int i2;
        MethodCollector.m26663i(6313);
        char[] cArr = this.f65509e;
        int i3 = this.f65513i;
        int i4 = this.f65510f;
        this.f65513i = i3 - i4;
        int i5 = this.f65511g;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f65511g = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f65511g = 0;
        }
        this.f65510f = 0;
        do {
            Reader reader = this.f65508d;
            int i7 = this.f65511g;
            int read = reader.read(cArr, i7, cArr.length - i7);
            if (read != -1) {
                i2 = this.f65511g + read;
                this.f65511g = i2;
                if (this.f65512h == 0 && this.f65513i == 0 && i2 > 0 && cArr[0] == 65279) {
                    this.f65510f++;
                    this.f65513i = 1;
                    i++;
                    continue;
                }
            } else {
                MethodCollector.m26664o(6313);
                return false;
            }
        } while (i2 < i);
        MethodCollector.m26664o(6313);
        return true;
    }

    /* renamed from: a */
    private boolean m55852a(String str) {
        int length = str.length();
        while (true) {
            if (this.f65510f + length > this.f65511g && !m55855b(length)) {
                return false;
            }
            char[] cArr = this.f65509e;
            int i = this.f65510f;
            if (cArr[i] == '\n') {
                this.f65512h++;
                this.f65513i = i + 1;
            } else {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f65509e[this.f65510f + i2] == str.charAt(i2)) {
                    }
                }
                return true;
            }
            this.f65510f++;
        }
    }
}
