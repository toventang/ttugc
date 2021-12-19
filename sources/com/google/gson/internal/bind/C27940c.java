package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27919i;
import com.google.gson.C28021n;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.EnumC27899b;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.gson.internal.bind.c */
public final class C27940c extends C27897a {

    /* renamed from: c */
    private static final Reader f65664c = new Reader() {
        /* class com.google.gson.internal.bind.C27940c.C279411 */

        static {
            Covode.recordClassIndex(33554);
        }

        @Override // java.io.Closeable, java.io.Reader, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* renamed from: d */
    private static final Object f65665d = new Object();

    /* renamed from: e */
    private Object[] f65666e = new Object[32];

    /* renamed from: f */
    private int f65667f;

    /* renamed from: g */
    private String[] f65668g = new String[32];

    /* renamed from: h */
    private int[] f65669h = new int[32];

    /* renamed from: s */
    private Object m56008s() {
        Object[] objArr = this.f65666e;
        int i = this.f65667f - 1;
        this.f65667f = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // com.google.gson.p2020c.C27897a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f65666e = new Object[]{f65665d};
        this.f65667f = 1;
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: e */
    public final boolean mo46626e() {
        EnumC27899b f = mo46627f();
        if (f == EnumC27899b.END_OBJECT || f == EnumC27899b.END_ARRAY) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final Object mo46731g() {
        return this.f65666e[this.f65667f - 1];
    }

    @Override // com.google.gson.p2020c.C27897a
    public final String toString() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(33553);
    }

    /* renamed from: t */
    private String m56009t() {
        return " at path " + mo46636p();
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: a */
    public final void mo46621a() {
        mo46729a(EnumC27899b.BEGIN_ARRAY);
        mo46730a(((C27919i) mo46731g()).iterator());
        this.f65669h[this.f65667f - 1] = 0;
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: b */
    public final void mo46622b() {
        mo46729a(EnumC27899b.END_ARRAY);
        m56008s();
        m56008s();
        int i = this.f65667f;
        if (i > 0) {
            int[] iArr = this.f65669h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: c */
    public final void mo46623c() {
        mo46729a(EnumC27899b.BEGIN_OBJECT);
        mo46730a(((C28022o) mo46731g()).f65804a.entrySet().iterator());
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: d */
    public final void mo46625d() {
        mo46729a(EnumC27899b.END_OBJECT);
        m56008s();
        m56008s();
        int i = this.f65667f;
        if (i > 0) {
            int[] iArr = this.f65669h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: j */
    public final boolean mo46630j() {
        mo46729a(EnumC27899b.BOOLEAN);
        boolean h = ((AbstractC28019l) m56008s()).mo46695h();
        int i = this.f65667f;
        if (i > 0) {
            int[] iArr = this.f65669h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return h;
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: k */
    public final void mo46631k() {
        mo46729a(EnumC27899b.NULL);
        m56008s();
        int i = this.f65667f;
        if (i > 0) {
            int[] iArr = this.f65669h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: h */
    public final String mo46628h() {
        mo46729a(EnumC27899b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) mo46731g()).next();
        String str = (String) entry.getKey();
        this.f65668g[this.f65667f - 1] = str;
        mo46730a(entry.getValue());
        return str;
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: o */
    public final void mo46635o() {
        if (mo46627f() == EnumC27899b.NAME) {
            mo46628h();
            this.f65668g[this.f65667f - 2] = "null";
        } else {
            m56008s();
            int i = this.f65667f;
            if (i > 0) {
                this.f65668g[i - 1] = "null";
            }
        }
        int i2 = this.f65667f;
        if (i2 > 0) {
            int[] iArr = this.f65669h;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: i */
    public final String mo46629i() {
        EnumC27899b f = mo46627f();
        if (f == EnumC27899b.STRING || f == EnumC27899b.NUMBER) {
            String c = ((AbstractC28019l) m56008s()).mo46689c();
            int i = this.f65667f;
            if (i > 0) {
                int[] iArr = this.f65669h;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return c;
        }
        throw new IllegalStateException("Expected " + EnumC27899b.STRING + " but was " + f + m56009t());
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: l */
    public final double mo46632l() {
        EnumC27899b f = mo46627f();
        if (f == EnumC27899b.NUMBER || f == EnumC27899b.STRING) {
            double d = ((AbstractC28019l) mo46731g()).mo46690d();
            if (this.f65506a || (!Double.isNaN(d) && !Double.isInfinite(d))) {
                m56008s();
                int i = this.f65667f;
                if (i > 0) {
                    int[] iArr = this.f65669h;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return d;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(d)));
        }
        throw new IllegalStateException("Expected " + EnumC27899b.NUMBER + " but was " + f + m56009t());
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: m */
    public final long mo46633m() {
        EnumC27899b f = mo46627f();
        if (f == EnumC27899b.NUMBER || f == EnumC27899b.STRING) {
            long f2 = ((AbstractC28019l) mo46731g()).mo46693f();
            m56008s();
            int i = this.f65667f;
            if (i > 0) {
                int[] iArr = this.f65669h;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return f2;
        }
        throw new IllegalStateException("Expected " + EnumC27899b.NUMBER + " but was " + f + m56009t());
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: n */
    public final int mo46634n() {
        EnumC27899b f = mo46627f();
        if (f == EnumC27899b.NUMBER || f == EnumC27899b.STRING) {
            int g = ((AbstractC28019l) mo46731g()).mo46694g();
            m56008s();
            int i = this.f65667f;
            if (i > 0) {
                int[] iArr = this.f65669h;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return g;
        }
        throw new IllegalStateException("Expected " + EnumC27899b.NUMBER + " but was " + f + m56009t());
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: p */
    public final String mo46636p() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.f65667f) {
            Object[] objArr = this.f65666e;
            if (objArr[i] instanceof C27919i) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[').append(this.f65669h[i]).append(']');
                }
            } else if (objArr[i] instanceof C28022o) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f65668g;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // com.google.gson.p2020c.C27897a
    /* renamed from: f */
    public final EnumC27899b mo46627f() {
        while (this.f65667f != 0) {
            Object g = mo46731g();
            if (g instanceof Iterator) {
                boolean z = this.f65666e[this.f65667f - 2] instanceof C28022o;
                Iterator it = (Iterator) g;
                if (it.hasNext()) {
                    if (z) {
                        return EnumC27899b.NAME;
                    }
                    mo46730a(it.next());
                } else if (z) {
                    return EnumC27899b.END_OBJECT;
                } else {
                    return EnumC27899b.END_ARRAY;
                }
            } else if (g instanceof C28022o) {
                return EnumC27899b.BEGIN_OBJECT;
            } else {
                if (g instanceof C27919i) {
                    return EnumC27899b.BEGIN_ARRAY;
                }
                if (g instanceof C28025r) {
                    C28025r rVar = (C28025r) g;
                    if (rVar.f65806a instanceof String) {
                        return EnumC27899b.STRING;
                    }
                    if (rVar.f65806a instanceof Boolean) {
                        return EnumC27899b.BOOLEAN;
                    }
                    if (rVar.f65806a instanceof Number) {
                        return EnumC27899b.NUMBER;
                    }
                    throw new AssertionError();
                } else if (g instanceof C28021n) {
                    return EnumC27899b.NULL;
                } else {
                    if (g == f65665d) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return EnumC27899b.END_DOCUMENT;
    }

    public C27940c(AbstractC28019l lVar) {
        super(f65664c);
        mo46730a(lVar);
    }

    /* renamed from: a */
    public final void mo46729a(EnumC27899b bVar) {
        if (mo46627f() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + mo46627f() + m56009t());
        }
    }

    /* renamed from: a */
    public final void mo46730a(Object obj) {
        int i = this.f65667f;
        Object[] objArr = this.f65666e;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f65669h, 0, iArr, 0, this.f65667f);
            System.arraycopy(this.f65668g, 0, strArr, 0, this.f65667f);
            this.f65666e = objArr2;
            this.f65669h = iArr;
            this.f65668g = strArr;
        }
        Object[] objArr3 = this.f65666e;
        int i2 = this.f65667f;
        this.f65667f = i2 + 1;
        objArr3[i2] = obj;
    }
}
