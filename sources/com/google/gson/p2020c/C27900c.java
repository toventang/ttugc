package com.google.gson.p2020c;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* renamed from: com.google.gson.c.c */
public class C27900c implements Closeable, Flushable {

    /* renamed from: e */
    private static final String[] f65522e = new String[128];

    /* renamed from: f */
    private static final String[] f65523f;

    /* renamed from: a */
    public final Writer f65524a;

    /* renamed from: b */
    public boolean f65525b;

    /* renamed from: c */
    public boolean f65526c;

    /* renamed from: d */
    public boolean f65527d;

    /* renamed from: g */
    private int[] f65528g = new int[32];

    /* renamed from: h */
    private int f65529h;

    /* renamed from: i */
    private String f65530i;

    /* renamed from: j */
    private String f65531j;

    /* renamed from: k */
    private String f65532k;

    /* renamed from: a */
    public C27900c mo46645a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f65532k != null) {
            throw new IllegalStateException();
        } else if (this.f65529h != 0) {
            this.f65532k = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: a */
    public C27900c mo46646a(boolean z) {
        MethodCollector.m26663i(9202);
        mo46656g();
        mo46657h();
        this.f65524a.write(z ? "true" : "false");
        MethodCollector.m26664o(9202);
        return this;
    }

    /* renamed from: a */
    public C27900c mo46644a(Number number) {
        if (number == null) {
            return mo46654f();
        }
        mo46656g();
        String obj = number.toString();
        if (this.f65525b || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            mo46657h();
            this.f65524a.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
    }

    /* renamed from: c */
    public C27900c mo46649c() {
        return m55883a(1, 2, "]");
    }

    /* renamed from: d */
    public C27900c mo46652d() {
        mo46656g();
        return m55884a(3, "{");
    }

    /* renamed from: e */
    public C27900c mo46653e() {
        return m55883a(3, 5, "}");
    }

    /* renamed from: g */
    public final void mo46656g() {
        if (this.f65532k != null) {
            m55889j();
            m55887d(this.f65532k);
            this.f65532k = null;
        }
    }

    /* renamed from: a */
    private int mo46734a() {
        int i = this.f65529h;
        if (i != 0) {
            return this.f65528g[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: b */
    public C27900c mo46647b() {
        mo46656g();
        return m55884a(1, "[");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f65524a.close();
        int i = this.f65529h;
        if (i > 1 || (i == 1 && this.f65528g[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f65529h = 0;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f65529h != 0) {
            this.f65524a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: i */
    private void m55888i() {
        MethodCollector.m26663i(9798);
        if (this.f65530i == null) {
            MethodCollector.m26664o(9798);
            return;
        }
        this.f65524a.write("\n");
        int i = this.f65529h;
        for (int i2 = 1; i2 < i; i2++) {
            this.f65524a.write(this.f65530i);
        }
        MethodCollector.m26664o(9798);
    }

    /* renamed from: j */
    private void m55889j() {
        MethodCollector.m26663i(9941);
        int a = mo46734a();
        if (a == 5) {
            this.f65524a.write(44);
        } else if (a != 3) {
            IllegalStateException illegalStateException = new IllegalStateException("Nesting problem.");
            MethodCollector.m26664o(9941);
            throw illegalStateException;
        }
        m55888i();
        m55886b(4);
        MethodCollector.m26664o(9941);
    }

    /* renamed from: f */
    public C27900c mo46654f() {
        MethodCollector.m26663i(9048);
        if (this.f65532k != null) {
            if (this.f65527d) {
                mo46656g();
            } else {
                this.f65532k = null;
                MethodCollector.m26664o(9048);
                return this;
            }
        }
        mo46657h();
        this.f65524a.write("null");
        MethodCollector.m26664o(9048);
        return this;
    }

    static {
        Covode.recordClassIndex(33494);
        int i = 0;
        do {
            f65522e[i] = C1764a.m5928a("\\u%04x", new Object[]{Integer.valueOf(i)});
            i++;
        } while (i <= 31);
        String[] strArr = f65522e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f65523f = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    /* renamed from: h */
    public final void mo46657h() {
        int a = mo46734a();
        if (a == 1) {
            m55886b(2);
            m55888i();
        } else if (a == 2) {
            this.f65524a.append(',');
            m55888i();
        } else if (a != 4) {
            if (a != 6) {
                if (a != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f65525b) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m55886b(7);
        } else {
            this.f65524a.append((CharSequence) this.f65531j);
            m55886b(5);
        }
    }

    /* renamed from: b */
    private void m55886b(int i) {
        this.f65528g[this.f65529h - 1] = i;
    }

    public C27900c(Writer writer) {
        m55885a(6);
        this.f65531j = ":";
        this.f65527d = true;
        Objects.requireNonNull(writer, "out == null");
        this.f65524a = writer;
    }

    /* renamed from: c */
    public final void mo46650c(String str) {
        if (str.length() == 0) {
            this.f65530i = null;
            this.f65531j = ":";
            return;
        }
        this.f65530i = str;
        this.f65531j = ": ";
    }

    /* renamed from: b */
    public C27900c mo46648b(String str) {
        if (str == null) {
            return mo46654f();
        }
        mo46656g();
        mo46657h();
        m55887d(str);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m55887d(java.lang.String r10) {
        /*
            r9 = this;
            r8 = 9652(0x25b4, float:1.3525E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r8)
            boolean r0 = r9.f65526c
            if (r0 == 0) goto L_0x0047
            java.lang.String[] r7 = com.google.gson.p2020c.C27900c.f65523f
        L_0x000b:
            java.io.Writer r0 = r9.f65524a
            java.lang.String r6 = "\""
            r0.write(r6)
            int r5 = r10.length()
            r4 = 0
            r3 = 0
        L_0x0018:
            if (r4 >= r5) goto L_0x004a
            char r1 = r10.charAt(r4)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L_0x0029
            r2 = r7[r1]
            if (r2 != 0) goto L_0x002f
        L_0x0026:
            int r4 = r4 + 1
            goto L_0x0018
        L_0x0029:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L_0x0040
            java.lang.String r2 = "\\u2028"
        L_0x002f:
            if (r3 >= r4) goto L_0x0038
            java.io.Writer r1 = r9.f65524a
            int r0 = r4 - r3
            r1.write(r10, r3, r0)
        L_0x0038:
            java.io.Writer r0 = r9.f65524a
            r0.write(r2)
            int r3 = r4 + 1
            goto L_0x0026
        L_0x0040:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L_0x0026
            java.lang.String r2 = "\\u2029"
            goto L_0x002f
        L_0x0047:
            java.lang.String[] r7 = com.google.gson.p2020c.C27900c.f65522e
            goto L_0x000b
        L_0x004a:
            if (r3 >= r5) goto L_0x0052
            java.io.Writer r0 = r9.f65524a
            int r5 = r5 - r3
            r0.write(r10, r3, r5)
        L_0x0052:
            java.io.Writer r0 = r9.f65524a
            r0.write(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p2020c.C27900c.m55887d(java.lang.String):void");
    }

    /* renamed from: a */
    private void m55885a(int i) {
        int i2 = this.f65529h;
        int[] iArr = this.f65528g;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f65528g = iArr2;
        }
        int[] iArr3 = this.f65528g;
        int i3 = this.f65529h;
        this.f65529h = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: a */
    public C27900c mo46641a(double d) {
        mo46656g();
        if (this.f65525b || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            mo46657h();
            this.f65524a.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(d)));
    }

    /* renamed from: a */
    public C27900c mo46642a(long j) {
        MethodCollector.m26663i(9500);
        mo46656g();
        mo46657h();
        this.f65524a.write(Long.toString(j));
        MethodCollector.m26664o(9500);
        return this;
    }

    /* renamed from: a */
    public C27900c mo46643a(Boolean bool) {
        String str;
        MethodCollector.m26663i(9351);
        if (bool == null) {
            C27900c f = mo46654f();
            MethodCollector.m26664o(9351);
            return f;
        }
        mo46656g();
        mo46657h();
        Writer writer = this.f65524a;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        MethodCollector.m26664o(9351);
        return this;
    }

    /* renamed from: a */
    private C27900c m55884a(int i, String str) {
        MethodCollector.m26663i(8891);
        mo46657h();
        m55885a(i);
        this.f65524a.write(str);
        MethodCollector.m26664o(8891);
        return this;
    }

    /* renamed from: a */
    private C27900c m55883a(int i, int i2, String str) {
        MethodCollector.m26663i(9045);
        int a = mo46734a();
        if (a != i2 && a != i) {
            IllegalStateException illegalStateException = new IllegalStateException("Nesting problem.");
            MethodCollector.m26664o(9045);
            throw illegalStateException;
        } else if (this.f65532k == null) {
            this.f65529h--;
            if (a == i2) {
                m55888i();
            }
            this.f65524a.write(str);
            MethodCollector.m26664o(9045);
            return this;
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException("Dangling name: " + this.f65532k);
            MethodCollector.m26664o(9045);
            throw illegalStateException2;
        }
    }
}
