package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27919i;
import com.google.gson.C28021n;
import com.google.gson.C28022o;
import com.google.gson.C28025r;
import com.google.gson.p2020c.C27900c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.gson.internal.bind.d */
public final class C27942d extends C27900c {

    /* renamed from: e */
    private static final Writer f65670e = new Writer() {
        /* class com.google.gson.internal.bind.C27942d.C279431 */

        static {
            Covode.recordClassIndex(33556);
        }

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* renamed from: f */
    private static final C28025r f65671f = new C28025r("closed");

    /* renamed from: g */
    private final List<AbstractC28019l> f65672g = new ArrayList();

    /* renamed from: h */
    private String f65673h;

    /* renamed from: i */
    private AbstractC28019l f65674i = C28021n.f65803a;

    @Override // com.google.gson.p2020c.C27900c, java.io.Flushable
    public final void flush() {
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: f */
    public final C27900c mo46654f() {
        m56028a(C28021n.f65803a);
        return this;
    }

    /* renamed from: i */
    private AbstractC28019l m56029i() {
        List<AbstractC28019l> list = this.f65672g;
        return list.get(list.size() - 1);
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: b */
    public final C27900c mo46647b() {
        C27919i iVar = new C27919i();
        m56028a(iVar);
        this.f65672g.add(iVar);
        return this;
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: d */
    public final C27900c mo46652d() {
        C28022o oVar = new C28022o();
        m56028a(oVar);
        this.f65672g.add(oVar);
        return this;
    }

    static {
        Covode.recordClassIndex(33555);
    }

    public C27942d() {
        super(f65670e);
    }

    @Override // com.google.gson.p2020c.C27900c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f65672g.isEmpty()) {
            this.f65672g.add(f65671f);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: c */
    public final C27900c mo46649c() {
        if (this.f65672g.isEmpty() || this.f65673h != null) {
            throw new IllegalStateException();
        } else if (m56029i() instanceof C27919i) {
            List<AbstractC28019l> list = this.f65672g;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: e */
    public final C27900c mo46653e() {
        if (this.f65672g.isEmpty() || this.f65673h != null) {
            throw new IllegalStateException();
        } else if (m56029i() instanceof C28022o) {
            List<AbstractC28019l> list = this.f65672g;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final AbstractC28019l mo46734a() {
        if (this.f65672g.isEmpty()) {
            return this.f65674i;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f65672g);
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: a */
    public final C27900c mo46642a(long j) {
        m56028a(new C28025r((Number) Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: a */
    public final C27900c mo46643a(Boolean bool) {
        if (bool == null) {
            return mo46654f();
        }
        m56028a(new C28025r(bool));
        return this;
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: b */
    public final C27900c mo46648b(String str) {
        if (str == null) {
            return mo46654f();
        }
        m56028a(new C28025r(str));
        return this;
    }

    /* renamed from: a */
    private void m56028a(AbstractC28019l lVar) {
        if (this.f65673h != null) {
            if (!(lVar instanceof C28021n) || this.f65527d) {
                ((C28022o) m56029i()).mo46797a(this.f65673h, lVar);
            }
            this.f65673h = null;
        } else if (this.f65672g.isEmpty()) {
            this.f65674i = lVar;
        } else {
            AbstractC28019l i = m56029i();
            if (i instanceof C27919i) {
                ((C27919i) i).mo46686a(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: a */
    public final C27900c mo46641a(double d) {
        if (this.f65525b || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m56028a(new C28025r((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(d)));
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: a */
    public final C27900c mo46644a(Number number) {
        if (number == null) {
            return mo46654f();
        }
        if (!this.f65525b) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        m56028a(new C28025r(number));
        return this;
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: a */
    public final C27900c mo46645a(String str) {
        if (this.f65672g.isEmpty() || this.f65673h != null) {
            throw new IllegalStateException();
        } else if (m56029i() instanceof C28022o) {
            this.f65673h = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.p2020c.C27900c
    /* renamed from: a */
    public final C27900c mo46646a(boolean z) {
        m56028a(new C28025r(Boolean.valueOf(z)));
        return this;
    }
}
