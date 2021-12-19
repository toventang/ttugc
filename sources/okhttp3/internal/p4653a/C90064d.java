package okhttp3.internal.p4653a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4658f.AbstractC90149a;
import okhttp3.internal.p4659g.C90160f;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89447y;
import p4632k.C89436q;

/* renamed from: okhttp3.internal.a.d */
public final class C90064d implements Closeable, Flushable {

    /* renamed from: a */
    static final Pattern f204351a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: m */
    static final /* synthetic */ boolean f204352m = true;

    /* renamed from: b */
    final AbstractC90149a f204353b;

    /* renamed from: c */
    public final File f204354c;

    /* renamed from: d */
    final int f204355d;

    /* renamed from: e */
    AbstractC89425g f204356e;

    /* renamed from: f */
    final LinkedHashMap<String, C90069b> f204357f = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: g */
    int f204358g;

    /* renamed from: h */
    boolean f204359h;

    /* renamed from: i */
    boolean f204360i;

    /* renamed from: j */
    boolean f204361j;

    /* renamed from: k */
    boolean f204362k;

    /* renamed from: l */
    boolean f204363l;

    /* renamed from: n */
    private final File f204364n;

    /* renamed from: o */
    private final File f204365o;

    /* renamed from: p */
    private final File f204366p;

    /* renamed from: q */
    private final int f204367q;

    /* renamed from: r */
    private long f204368r;

    /* renamed from: s */
    private long f204369s;

    /* renamed from: t */
    private long f204370t = 0;

    /* renamed from: u */
    private final Executor f204371u;

    /* renamed from: v */
    private final Runnable f204372v = new Runnable() {
        /* class okhttp3.internal.p4653a.C90064d.RunnableC900651 */

        static {
            Covode.recordClassIndex(106237);
        }

        public final void run() {
            boolean z;
            MethodCollector.m26663i(10899);
            synchronized (C90064d.this) {
                try {
                    if (!C90064d.this.f204360i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !C90064d.this.f204361j) {
                        try {
                            C90064d.this.mo144801c();
                        } catch (IOException unused) {
                            C90064d.this.f204362k = true;
                        }
                        try {
                            if (C90064d.this.mo144799b()) {
                                C90064d.this.mo144796a();
                                C90064d.this.f204358g = 0;
                            }
                        } catch (IOException unused2) {
                            C90064d.this.f204363l = true;
                            C90064d.this.f204356e = C89436q.m155159a(C89436q.m155161a());
                        }
                        MethodCollector.m26664o(10899);
                    }
                } finally {
                    MethodCollector.m26664o(10899);
                }
            }
        }
    };

    /* renamed from: okhttp3.internal.a.d$c */
    public final class C90070c implements Closeable {

        /* renamed from: a */
        public final String f204389a;

        /* renamed from: b */
        public final long f204390b;

        /* renamed from: c */
        public final AbstractC89408aa[] f204391c;

        /* renamed from: e */
        private final long[] f204393e;

        static {
            Covode.recordClassIndex(106242);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (AbstractC89408aa aaVar : this.f204391c) {
                C90084c.m156415a(aaVar);
            }
        }

        C90070c(String str, long j, AbstractC89408aa[] aaVarArr, long[] jArr) {
            this.f204389a = str;
            this.f204390b = j;
            this.f204391c = aaVarArr;
            this.f204393e = jArr;
        }
    }

    /* renamed from: h */
    private synchronized boolean m156333h() {
        boolean z;
        MethodCollector.m26663i(7401);
        z = this.f204361j;
        MethodCollector.m26664o(7401);
        return z;
    }

    static {
        Covode.recordClassIndex(106236);
    }

    /* renamed from: f */
    private AbstractC89425g m156331f() {
        return C89436q.m155159a(new C90071e(this.f204353b.mo144937c(this.f204364n)) {
            /* class okhttp3.internal.p4653a.C90064d.C900662 */

            /* renamed from: a */
            static final /* synthetic */ boolean f204374a = true;

            static {
                Covode.recordClassIndex(106238);
            }

            /* access modifiers changed from: protected */
            @Override // okhttp3.internal.p4653a.C90071e
            /* renamed from: a */
            public final void mo144805a() {
                if (f204374a || Thread.holdsLock(C90064d.this)) {
                    C90064d.this.f204359h = true;
                    return;
                }
                throw new AssertionError();
            }
        });
    }

    /* renamed from: i */
    private synchronized void m156334i() {
        MethodCollector.m26663i(7556);
        if (!m156333h()) {
            MethodCollector.m26664o(7556);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("cache is closed");
            MethodCollector.m26664o(7556);
            throw illegalStateException;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo144799b() {
        int i = this.f204358g;
        if (i < 2000 || i < this.f204357f.size()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo144801c() {
        while (this.f204369s > this.f204368r) {
            mo144798a(this.f204357f.values().iterator().next());
        }
        this.f204362k = false;
    }

    /* renamed from: okhttp3.internal.a.d$a */
    public final class C90067a {

        /* renamed from: a */
        final C90069b f204376a;

        /* renamed from: b */
        final boolean[] f204377b;

        /* renamed from: d */
        private boolean f204379d;

        static {
            Covode.recordClassIndex(106239);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo144807a() {
            if (this.f204376a.f204386f == this) {
                for (int i = 0; i < C90064d.this.f204355d; i++) {
                    try {
                        C90064d.this.f204353b.mo144938d(this.f204376a.f204384d[i]);
                    } catch (IOException unused) {
                    }
                }
                this.f204376a.f204386f = null;
            }
        }

        /* renamed from: b */
        public final void mo144808b() {
            MethodCollector.m26663i(10902);
            synchronized (C90064d.this) {
                try {
                    if (!this.f204379d) {
                        if (this.f204376a.f204386f == this) {
                            C90064d.this.mo144797a(this, true);
                        }
                        this.f204379d = true;
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.m26664o(10902);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.m26664o(10902);
                }
            }
        }

        /* renamed from: c */
        public final void mo144809c() {
            MethodCollector.m26663i(11049);
            synchronized (C90064d.this) {
                try {
                    if (!this.f204379d) {
                        if (this.f204376a.f204386f == this) {
                            C90064d.this.mo144797a(this, false);
                        }
                        this.f204379d = true;
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.m26664o(11049);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.m26664o(11049);
                }
            }
        }

        /* renamed from: a */
        public final AbstractC89447y mo144806a(int i) {
            MethodCollector.m26663i(10901);
            synchronized (C90064d.this) {
                try {
                    if (this.f204379d) {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.m26664o(10901);
                        throw illegalStateException;
                    } else if (this.f204376a.f204386f != this) {
                        return C89436q.m155161a();
                    } else {
                        if (!this.f204376a.f204385e) {
                            this.f204377b[i] = true;
                        }
                        try {
                            C900681 r0 = new C90071e(C90064d.this.f204353b.mo144936b(this.f204376a.f204384d[i])) {
                                /* class okhttp3.internal.p4653a.C90064d.C90067a.C900681 */

                                static {
                                    Covode.recordClassIndex(106240);
                                }

                                /* access modifiers changed from: protected */
                                @Override // okhttp3.internal.p4653a.C90071e
                                /* renamed from: a */
                                public final void mo144805a() {
                                    MethodCollector.m26663i(9457);
                                    synchronized (C90064d.this) {
                                        try {
                                            C90067a.this.mo144807a();
                                        } finally {
                                            MethodCollector.m26664o(9457);
                                        }
                                    }
                                }
                            };
                            MethodCollector.m26664o(10901);
                            return r0;
                        } catch (FileNotFoundException unused) {
                            AbstractC89447y a = C89436q.m155161a();
                            MethodCollector.m26664o(10901);
                            return a;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(10901);
                }
            }
        }

        C90067a(C90069b bVar) {
            boolean[] zArr;
            this.f204376a = bVar;
            if (bVar.f204385e) {
                zArr = null;
            } else {
                zArr = new boolean[C90064d.this.f204355d];
            }
            this.f204377b = zArr;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        MethodCollector.m26663i(7729);
        if (!this.f204360i) {
            MethodCollector.m26664o(7729);
            return;
        }
        m156334i();
        mo144801c();
        this.f204356e.flush();
        MethodCollector.m26664o(7729);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.a.d$b */
    public final class C90069b {

        /* renamed from: a */
        final String f204381a;

        /* renamed from: b */
        final long[] f204382b;

        /* renamed from: c */
        final File[] f204383c;

        /* renamed from: d */
        final File[] f204384d;

        /* renamed from: e */
        boolean f204385e;

        /* renamed from: f */
        C90067a f204386f;

        /* renamed from: g */
        long f204387g;

        static {
            Covode.recordClassIndex(106241);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C90070c mo144810a() {
            if (Thread.holdsLock(C90064d.this)) {
                AbstractC89408aa[] aaVarArr = new AbstractC89408aa[C90064d.this.f204355d];
                long[] jArr = (long[]) this.f204382b.clone();
                int i = 0;
                for (int i2 = 0; i2 < C90064d.this.f204355d; i2++) {
                    try {
                        aaVarArr[i2] = C90064d.this.f204353b.mo144934a(this.f204383c[i2]);
                    } catch (FileNotFoundException unused) {
                        while (i < C90064d.this.f204355d && aaVarArr[i] != null) {
                            C90084c.m156415a(aaVarArr[i]);
                            i++;
                        }
                        try {
                            C90064d.this.mo144798a(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new C90070c(this.f204381a, this.f204387g, aaVarArr, jArr);
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        private static IOException m156349b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo144811a(AbstractC89425g gVar) {
            for (long j : this.f204382b) {
                gVar.mo68847a(32).mo68855b(j);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo144812a(String[] strArr) {
            if (strArr.length == C90064d.this.f204355d) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f204382b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m156349b(strArr);
                    }
                }
                return;
            }
            throw m156349b(strArr);
        }

        C90069b(String str) {
            this.f204381a = str;
            this.f204382b = new long[C90064d.this.f204355d];
            this.f204383c = new File[C90064d.this.f204355d];
            this.f204384d = new File[C90064d.this.f204355d];
            StringBuilder append = new StringBuilder(str).append('.');
            int length = append.length();
            for (int i = 0; i < C90064d.this.f204355d; i++) {
                append.append(i);
                this.f204383c[i] = new File(C90064d.this.f204354c, append.toString());
                append.append(".tmp");
                this.f204384d[i] = new File(C90064d.this.f204354c, append.toString());
                append.setLength(length);
            }
        }
    }

    /* renamed from: g */
    private void m156332g() {
        this.f204353b.mo144938d(this.f204365o);
        Iterator<C90069b> it = this.f204357f.values().iterator();
        while (it.hasNext()) {
            C90069b next = it.next();
            int i = 0;
            if (next.f204386f == null) {
                while (i < this.f204355d) {
                    this.f204369s += next.f204382b[i];
                    i++;
                }
            } else {
                next.f204386f = null;
                while (i < this.f204355d) {
                    this.f204353b.mo144938d(next.f204383c[i]);
                    this.f204353b.mo144938d(next.f204384d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.m26663i(7875);
        if (!this.f204360i || this.f204361j) {
            this.f204361j = true;
            MethodCollector.m26664o(7875);
            return;
        }
        C90069b[] bVarArr = (C90069b[]) this.f204357f.values().toArray(new C90069b[this.f204357f.size()]);
        for (C90069b bVar : bVarArr) {
            if (bVar.f204386f != null) {
                bVar.f204386f.mo144809c();
            }
        }
        mo144801c();
        this.f204356e.close();
        this.f204356e = null;
        this.f204361j = true;
        MethodCollector.m26664o(7875);
    }

    /* renamed from: d */
    private synchronized void m156329d() {
        MethodCollector.m26663i(6799);
        if (!f204352m && !Thread.holdsLock(this)) {
            AssertionError assertionError = new AssertionError();
            MethodCollector.m26664o(6799);
            throw assertionError;
        } else if (this.f204360i) {
            MethodCollector.m26664o(6799);
        } else {
            if (this.f204353b.mo144939e(this.f204366p)) {
                if (this.f204353b.mo144939e(this.f204364n)) {
                    this.f204353b.mo144938d(this.f204366p);
                } else {
                    this.f204353b.mo144935a(this.f204366p, this.f204364n);
                }
            }
            if (this.f204353b.mo144939e(this.f204364n)) {
                try {
                    m156330e();
                    m156332g();
                    this.f204360i = true;
                    MethodCollector.m26664o(6799);
                    return;
                } catch (IOException e) {
                    C90160f.f204720c.mo144946a(5, "DiskLruCache " + this.f204354c + " is corrupt: " + e.getMessage() + ", removing", e);
                    close();
                    this.f204353b.mo144941g(this.f204354c);
                    this.f204361j = false;
                } catch (Throwable th) {
                    this.f204361j = false;
                    MethodCollector.m26664o(6799);
                    throw th;
                }
            }
            mo144796a();
            this.f204360i = true;
            MethodCollector.m26664o(6799);
        }
    }

    /* renamed from: e */
    private void m156330e() {
        String s;
        String str;
        AbstractC89426h a = C89436q.m155160a(this.f204353b.mo144934a(this.f204364n));
        try {
            String s2 = a.mo143850s();
            String s3 = a.mo143850s();
            String s4 = a.mo143850s();
            String s5 = a.mo143850s();
            String s6 = a.mo143850s();
            if (!"libcore.io.DiskLruCache".equals(s2) || !"1".equals(s3) || !Integer.toString(this.f204367q).equals(s4) || !Integer.toString(this.f204355d).equals(s5) || !"".equals(s6)) {
                throw new IOException("unexpected journal header: [" + s2 + ", " + s3 + ", " + s5 + ", " + s6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    s = a.mo143850s();
                    int indexOf = s.indexOf(32);
                    if (indexOf != -1) {
                        int i2 = indexOf + 1;
                        int indexOf2 = s.indexOf(32, i2);
                        if (indexOf2 == -1) {
                            str = s.substring(i2);
                            if (indexOf == 6 && s.startsWith("REMOVE")) {
                                this.f204357f.remove(str);
                                i++;
                            }
                        } else {
                            str = s.substring(i2, indexOf2);
                        }
                        C90069b bVar = this.f204357f.get(str);
                        if (bVar == null) {
                            bVar = new C90069b(str);
                            this.f204357f.put(str, bVar);
                        }
                        if (indexOf2 != -1) {
                            if (indexOf != 5 || !s.startsWith("CLEAN")) {
                                if (indexOf2 != -1) {
                                    if (indexOf2 != -1) {
                                        break;
                                    }
                                    if (indexOf != 4 || !s.startsWith("READ")) {
                                        break;
                                    }
                                    i++;
                                }
                            } else {
                                String[] split = s.substring(indexOf2 + 1).split(" ");
                                bVar.f204385e = true;
                                bVar.f204386f = null;
                                bVar.mo144812a(split);
                                i++;
                            }
                        }
                        if (indexOf == 5) {
                            if (!s.startsWith("DIRTY")) {
                                break;
                            }
                            bVar.f204386f = new C90067a(bVar);
                            i++;
                        }
                        i++;
                    } else {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(s)));
                    }
                } catch (EOFException unused) {
                    this.f204358g = i - this.f204357f.size();
                    if (!a.mo143815e()) {
                        mo144796a();
                    } else {
                        this.f204356e = m156331f();
                    }
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(String.valueOf(s)));
        } finally {
            C90084c.m156415a(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo144796a() {
        MethodCollector.m26663i(6808);
        AbstractC89425g gVar = this.f204356e;
        if (gVar != null) {
            gVar.close();
        }
        AbstractC89425g a = C89436q.m155159a(this.f204353b.mo144936b(this.f204365o));
        try {
            a.mo68849a("libcore.io.DiskLruCache").mo68847a(10);
            a.mo68849a("1").mo68847a(10);
            a.mo68855b((long) this.f204367q).mo68847a(10);
            a.mo68855b((long) this.f204355d).mo68847a(10);
            a.mo68847a(10);
            for (C90069b bVar : this.f204357f.values()) {
                if (bVar.f204386f != null) {
                    a.mo68849a("DIRTY").mo68847a(32);
                    a.mo68849a(bVar.f204381a);
                    a.mo68847a(10);
                } else {
                    a.mo68849a("CLEAN").mo68847a(32);
                    a.mo68849a(bVar.f204381a);
                    bVar.mo144811a(a);
                    a.mo68847a(10);
                }
            }
            a.close();
            if (this.f204353b.mo144939e(this.f204364n)) {
                this.f204353b.mo144935a(this.f204364n, this.f204366p);
            }
            this.f204353b.mo144935a(this.f204365o, this.f204364n);
            this.f204353b.mo144938d(this.f204366p);
            this.f204356e = m156331f();
            this.f204359h = false;
            this.f204363l = false;
            MethodCollector.m26664o(6808);
        } catch (Throwable th) {
            a.close();
            MethodCollector.m26664o(6808);
            throw th;
        }
    }

    /* renamed from: c */
    private static void m156328c(String str) {
        if (!f204351a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo144800b(String str) {
        MethodCollector.m26663i(7254);
        m156329d();
        m156334i();
        m156328c(str);
        C90069b bVar = this.f204357f.get(str);
        if (bVar == null) {
            MethodCollector.m26664o(7254);
            return false;
        }
        mo144798a(bVar);
        if (this.f204369s <= this.f204368r) {
            this.f204362k = false;
        }
        MethodCollector.m26664o(7254);
        return true;
    }

    /* renamed from: a */
    public final synchronized C90070c mo144795a(String str) {
        MethodCollector.m26663i(7103);
        m156329d();
        m156334i();
        m156328c(str);
        C90069b bVar = this.f204357f.get(str);
        if (bVar == null || !bVar.f204385e) {
            MethodCollector.m26664o(7103);
            return null;
        }
        C90070c a = bVar.mo144810a();
        if (a == null) {
            MethodCollector.m26664o(7103);
            return null;
        }
        this.f204358g++;
        this.f204356e.mo68849a("READ").mo68847a(32).mo68849a(str).mo68847a(10);
        if (mo144799b()) {
            this.f204371u.execute(this.f204372v);
        }
        MethodCollector.m26664o(7103);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo144798a(C90069b bVar) {
        if (bVar.f204386f != null) {
            bVar.f204386f.mo144807a();
        }
        for (int i = 0; i < this.f204355d; i++) {
            this.f204353b.mo144938d(bVar.f204383c[i]);
            this.f204369s -= bVar.f204382b[i];
            bVar.f204382b[i] = 0;
        }
        this.f204358g++;
        this.f204356e.mo68849a("REMOVE").mo68847a(32).mo68849a(bVar.f204381a).mo68847a(10);
        this.f204357f.remove(bVar.f204381a);
        if (mo144799b()) {
            this.f204371u.execute(this.f204372v);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2 != null) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.p4653a.C90064d.C90067a mo144794a(java.lang.String r8, long r9) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4653a.C90064d.mo144794a(java.lang.String, long):okhttp3.internal.a.d$a");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo144797a(C90067a aVar, boolean z) {
        MethodCollector.m26663i(7251);
        C90069b bVar = aVar.f204376a;
        if (bVar.f204386f == aVar) {
            if (z && !bVar.f204385e) {
                for (int i = 0; i < this.f204355d; i++) {
                    if (!aVar.f204377b[i]) {
                        aVar.mo144809c();
                        IllegalStateException illegalStateException = new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                        MethodCollector.m26664o(7251);
                        throw illegalStateException;
                    } else if (!this.f204353b.mo144939e(bVar.f204384d[i])) {
                        aVar.mo144809c();
                        MethodCollector.m26664o(7251);
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f204355d; i2++) {
                File file = bVar.f204384d[i2];
                if (!z) {
                    this.f204353b.mo144938d(file);
                } else if (this.f204353b.mo144939e(file)) {
                    File file2 = bVar.f204383c[i2];
                    this.f204353b.mo144935a(file, file2);
                    long j = bVar.f204382b[i2];
                    long f = this.f204353b.mo144940f(file2);
                    bVar.f204382b[i2] = f;
                    this.f204369s = (this.f204369s - j) + f;
                }
            }
            this.f204358g++;
            bVar.f204386f = null;
            if (bVar.f204385e || z) {
                bVar.f204385e = true;
                this.f204356e.mo68849a("CLEAN").mo68847a(32);
                this.f204356e.mo68849a(bVar.f204381a);
                bVar.mo144811a(this.f204356e);
                this.f204356e.mo68847a(10);
                if (z) {
                    long j2 = this.f204370t;
                    this.f204370t = 1 + j2;
                    bVar.f204387g = j2;
                }
            } else {
                this.f204357f.remove(bVar.f204381a);
                this.f204356e.mo68849a("REMOVE").mo68847a(32);
                this.f204356e.mo68849a(bVar.f204381a);
                this.f204356e.mo68847a(10);
            }
            this.f204356e.flush();
            if (this.f204369s > this.f204368r || mo144799b()) {
                this.f204371u.execute(this.f204372v);
            }
            MethodCollector.m26664o(7251);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException();
        MethodCollector.m26664o(7251);
        throw illegalStateException2;
    }

    public C90064d(AbstractC90149a aVar, File file, long j, Executor executor) {
        this.f204353b = aVar;
        this.f204354c = file;
        this.f204367q = 201105;
        this.f204364n = new File(file, "journal");
        this.f204365o = new File(file, "journal.tmp");
        this.f204366p = new File(file, "journal.bkp");
        this.f204355d = 2;
        this.f204368r = 1048576;
        this.f204371u = executor;
    }
}
