package com.squareup.p2075a.p2076a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2075a.p2076a.p2079c.AbstractC29187a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89447y;
import p4632k.C89409ab;
import p4632k.C89420f;
import p4632k.C89436q;

/* renamed from: com.squareup.a.a.b */
public final class C29146b implements Closeable {

    /* renamed from: a */
    static final Pattern f68962a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: j */
    public static final AbstractC89447y f68963j = new AbstractC89447y() {
        /* class com.squareup.p2075a.p2076a.C29146b.C291493 */

        static {
            Covode.recordClassIndex(35498);
        }

        @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // p4632k.AbstractC89447y, java.io.Flushable
        public final void flush() {
        }

        @Override // p4632k.AbstractC89447y
        public final C89409ab timeout() {
            return C89409ab.f203072h;
        }

        @Override // p4632k.AbstractC89447y
        /* renamed from: a */
        public final void mo22060a(C89420f fVar, long j) {
            fVar.mo143838l(j);
        }
    };

    /* renamed from: k */
    static final /* synthetic */ boolean f68964k = true;

    /* renamed from: b */
    public final AbstractC29187a f68965b;

    /* renamed from: c */
    public final File f68966c;

    /* renamed from: d */
    public final int f68967d;

    /* renamed from: e */
    public final LinkedHashMap<String, C29152b> f68968e = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: f */
    public int f68969f;

    /* renamed from: g */
    public boolean f68970g;

    /* renamed from: h */
    public boolean f68971h;

    /* renamed from: i */
    public boolean f68972i;

    /* renamed from: l */
    private final File f68973l;

    /* renamed from: m */
    private final File f68974m;

    /* renamed from: n */
    private final File f68975n;

    /* renamed from: o */
    private final int f68976o;

    /* renamed from: p */
    private long f68977p;

    /* renamed from: q */
    private long f68978q;

    /* renamed from: r */
    private AbstractC89425g f68979r;

    /* renamed from: s */
    private long f68980s = 0;

    /* renamed from: t */
    private final Executor f68981t;

    /* renamed from: u */
    private final Runnable f68982u = new Runnable() {
        /* class com.squareup.p2075a.p2076a.C29146b.RunnableC291471 */

        static {
            Covode.recordClassIndex(35496);
        }

        public final void run() {
            boolean z;
            MethodCollector.m26663i(2130);
            synchronized (C29146b.this) {
                try {
                    if (!C29146b.this.f68971h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !C29146b.this.f68972i) {
                        try {
                            C29146b.this.mo50843c();
                            if (C29146b.this.mo50841b()) {
                                C29146b.this.mo50838a();
                                C29146b.this.f68969f = 0;
                            }
                            MethodCollector.m26664o(2130);
                        } catch (IOException e) {
                            RuntimeException runtimeException = new RuntimeException(e);
                            MethodCollector.m26664o(2130);
                            throw runtimeException;
                        }
                    }
                } finally {
                    MethodCollector.m26664o(2130);
                }
            }
        }
    };

    /* renamed from: com.squareup.a.a.b$c */
    public final class C29153c implements Closeable {

        /* renamed from: a */
        public final String f69000a;

        /* renamed from: b */
        public final long f69001b;

        /* renamed from: c */
        public final AbstractC89408aa[] f69002c;

        /* renamed from: e */
        private final long[] f69004e;

        static {
            Covode.recordClassIndex(35502);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (AbstractC89408aa aaVar : this.f69002c) {
                C29206j.m58438a(aaVar);
            }
        }

        private C29153c(String str, long j, AbstractC89408aa[] aaVarArr, long[] jArr) {
            this.f69000a = str;
            this.f69001b = j;
            this.f69002c = aaVarArr;
            this.f69004e = jArr;
        }

        /* synthetic */ C29153c(C29146b bVar, String str, long j, AbstractC89408aa[] aaVarArr, long[] jArr, byte b) {
            this(str, j, aaVarArr, jArr);
        }
    }

    /* renamed from: h */
    private synchronized boolean m58241h() {
        boolean z;
        MethodCollector.m26663i(3364);
        z = this.f68972i;
        MethodCollector.m26664o(3364);
        return z;
    }

    /* renamed from: com.squareup.a.a.b$a */
    public final class C29150a {

        /* renamed from: a */
        public final C29152b f68986a;

        /* renamed from: b */
        public final boolean[] f68987b;

        /* renamed from: c */
        public boolean f68988c;

        /* renamed from: e */
        private boolean f68990e;

        static {
            Covode.recordClassIndex(35499);
        }

        /* renamed from: b */
        public final void mo50849b() {
            MethodCollector.m26663i(5276);
            synchronized (C29146b.this) {
                try {
                    C29146b.this.mo50839a(this, false);
                } finally {
                    MethodCollector.m26664o(5276);
                }
            }
        }

        /* renamed from: a */
        public final void mo50848a() {
            MethodCollector.m26663i(5274);
            synchronized (C29146b.this) {
                try {
                    if (this.f68988c) {
                        C29146b.this.mo50839a(this, false);
                        C29146b.this.mo50840a(this.f68986a);
                    } else {
                        C29146b.this.mo50839a(this, true);
                    }
                    this.f68990e = true;
                } finally {
                    MethodCollector.m26664o(5274);
                }
            }
        }

        /* renamed from: a */
        public final AbstractC89447y mo50847a(int i) {
            C291511 r0;
            MethodCollector.m26663i(5217);
            synchronized (C29146b.this) {
                try {
                    if (this.f68986a.f68997f == this) {
                        if (!this.f68986a.f68996e) {
                            this.f68987b[i] = true;
                        }
                        try {
                            r0 = new C29186c(C29146b.this.f68965b.mo50898b(this.f68986a.f68995d[i])) {
                                /* class com.squareup.p2075a.p2076a.C29146b.C29150a.C291511 */

                                static {
                                    Covode.recordClassIndex(35500);
                                }

                                /* access modifiers changed from: protected */
                                @Override // com.squareup.p2075a.p2076a.C29186c
                                /* renamed from: a */
                                public final void mo50846a() {
                                    MethodCollector.m26663i(2116);
                                    synchronized (C29146b.this) {
                                        try {
                                            C29150a.this.f68988c = true;
                                        } finally {
                                            MethodCollector.m26664o(2116);
                                        }
                                    }
                                }
                            };
                        } catch (FileNotFoundException unused) {
                            AbstractC89447y yVar = C29146b.f68963j;
                            MethodCollector.m26664o(5217);
                            return yVar;
                        }
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.m26664o(5217);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.m26664o(5217);
                }
            }
            return r0;
        }

        private C29150a(C29152b bVar) {
            boolean[] zArr;
            this.f68986a = bVar;
            if (bVar.f68996e) {
                zArr = null;
            } else {
                zArr = new boolean[C29146b.this.f68967d];
            }
            this.f68987b = zArr;
        }

        /* synthetic */ C29150a(C29146b bVar, C29152b bVar2, byte b) {
            this(bVar2);
        }
    }

    static {
        Covode.recordClassIndex(35495);
    }

    /* renamed from: f */
    private AbstractC89425g m58239f() {
        return C89436q.m155159a(new C29186c(this.f68965b.mo50899c(this.f68973l)) {
            /* class com.squareup.p2075a.p2076a.C29146b.C291482 */

            /* renamed from: a */
            static final /* synthetic */ boolean f68984a = true;

            static {
                Covode.recordClassIndex(35497);
            }

            /* access modifiers changed from: protected */
            @Override // com.squareup.p2075a.p2076a.C29186c
            /* renamed from: a */
            public final void mo50846a() {
                if (f68984a || Thread.holdsLock(C29146b.this)) {
                    C29146b.this.f68970g = true;
                    return;
                }
                throw new AssertionError();
            }
        });
    }

    /* renamed from: i */
    private synchronized void m58242i() {
        MethodCollector.m26663i(3368);
        if (!m58241h()) {
            MethodCollector.m26664o(3368);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("cache is closed");
            MethodCollector.m26664o(3368);
            throw illegalStateException;
        }
    }

    /* renamed from: b */
    public final boolean mo50841b() {
        int i = this.f68969f;
        if (i < 2000 || i < this.f68968e.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo50843c() {
        while (this.f68978q > this.f68977p) {
            mo50840a(this.f68968e.values().iterator().next());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.b$b */
    public final class C29152b {

        /* renamed from: a */
        public final String f68992a;

        /* renamed from: b */
        public final long[] f68993b;

        /* renamed from: c */
        public final File[] f68994c;

        /* renamed from: d */
        public final File[] f68995d;

        /* renamed from: e */
        public boolean f68996e;

        /* renamed from: f */
        public C29150a f68997f;

        /* renamed from: g */
        public long f68998g;

        static {
            Covode.recordClassIndex(35501);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C29153c mo50850a() {
            if (Thread.holdsLock(C29146b.this)) {
                AbstractC89408aa[] aaVarArr = new AbstractC89408aa[C29146b.this.f68967d];
                long[] jArr = (long[]) this.f68993b.clone();
                int i = 0;
                for (int i2 = 0; i2 < C29146b.this.f68967d; i2++) {
                    try {
                        aaVarArr[i2] = C29146b.this.f68965b.mo50896a(this.f68994c[i2]);
                    } catch (FileNotFoundException unused) {
                        while (i < C29146b.this.f68967d && aaVarArr[i] != null) {
                            C29206j.m58438a(aaVarArr[i]);
                            i++;
                        }
                        return null;
                    }
                }
                return new C29153c(C29146b.this, this.f68992a, this.f68998g, aaVarArr, jArr, (byte) 0);
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        private static IOException m58257b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo50851a(AbstractC89425g gVar) {
            for (long j : this.f68993b) {
                gVar.mo68847a(32).mo68855b(j);
            }
        }

        /* renamed from: a */
        public final void mo50852a(String[] strArr) {
            if (strArr.length == C29146b.this.f68967d) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f68993b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m58257b(strArr);
                    }
                }
                return;
            }
            throw m58257b(strArr);
        }

        private C29152b(String str) {
            this.f68992a = str;
            this.f68993b = new long[C29146b.this.f68967d];
            this.f68994c = new File[C29146b.this.f68967d];
            this.f68995d = new File[C29146b.this.f68967d];
            StringBuilder append = new StringBuilder(str).append('.');
            int length = append.length();
            for (int i = 0; i < C29146b.this.f68967d; i++) {
                append.append(i);
                this.f68994c[i] = new File(C29146b.this.f68966c, append.toString());
                append.append(".tmp");
                this.f68995d[i] = new File(C29146b.this.f68966c, append.toString());
                append.setLength(length);
            }
        }

        /* synthetic */ C29152b(C29146b bVar, String str, byte b) {
            this(str);
        }
    }

    /* renamed from: g */
    private void m58240g() {
        this.f68965b.mo50900d(this.f68974m);
        Iterator<C29152b> it = this.f68968e.values().iterator();
        while (it.hasNext()) {
            C29152b next = it.next();
            int i = 0;
            if (next.f68997f == null) {
                while (i < this.f68967d) {
                    this.f68978q += next.f68993b[i];
                    i++;
                }
            } else {
                next.f68997f = null;
                while (i < this.f68967d) {
                    this.f68965b.mo50900d(next.f68994c[i]);
                    this.f68965b.mo50900d(next.f68995d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.m26663i(3372);
        if (!this.f68971h || this.f68972i) {
            this.f68972i = true;
            MethodCollector.m26664o(3372);
            return;
        }
        C29152b[] bVarArr = (C29152b[]) this.f68968e.values().toArray(new C29152b[this.f68968e.size()]);
        for (C29152b bVar : bVarArr) {
            if (bVar.f68997f != null) {
                bVar.f68997f.mo50849b();
            }
        }
        mo50843c();
        this.f68979r.close();
        this.f68979r = null;
        this.f68972i = true;
        MethodCollector.m26664o(3372);
    }

    /* renamed from: d */
    private synchronized void m58237d() {
        MethodCollector.m26663i(3202);
        if (!f68964k && !Thread.holdsLock(this)) {
            AssertionError assertionError = new AssertionError();
            MethodCollector.m26664o(3202);
            throw assertionError;
        } else if (this.f68971h) {
            MethodCollector.m26664o(3202);
        } else {
            if (this.f68965b.mo50901e(this.f68975n)) {
                if (this.f68965b.mo50901e(this.f68973l)) {
                    this.f68965b.mo50900d(this.f68975n);
                } else {
                    this.f68965b.mo50897a(this.f68975n, this.f68973l);
                }
            }
            if (this.f68965b.mo50901e(this.f68973l)) {
                try {
                    m58238e();
                    m58240g();
                    this.f68971h = true;
                    MethodCollector.m26664o(3202);
                    return;
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + this.f68966c + " is corrupt: " + e.getMessage() + ", removing");
                    close();
                    this.f68965b.mo50903g(this.f68966c);
                    this.f68972i = false;
                }
            }
            mo50838a();
            this.f68971h = true;
            MethodCollector.m26664o(3202);
        }
    }

    /* renamed from: e */
    private void m58238e() {
        String s;
        String str;
        AbstractC89426h a = C89436q.m155160a(this.f68965b.mo50896a(this.f68973l));
        try {
            String s2 = a.mo143850s();
            String s3 = a.mo143850s();
            String s4 = a.mo143850s();
            String s5 = a.mo143850s();
            String s6 = a.mo143850s();
            if (!"libcore.io.DiskLruCache".equals(s2) || !"1".equals(s3) || !Integer.toString(this.f68976o).equals(s4) || !Integer.toString(this.f68967d).equals(s5) || !"".equals(s6)) {
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
                                this.f68968e.remove(str);
                                i++;
                            }
                        } else {
                            str = s.substring(i2, indexOf2);
                        }
                        C29152b bVar = this.f68968e.get(str);
                        if (bVar == null) {
                            bVar = new C29152b(this, str, (byte) 0);
                            this.f68968e.put(str, bVar);
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
                                bVar.f68996e = true;
                                bVar.f68997f = null;
                                bVar.mo50852a(split);
                                i++;
                            }
                        }
                        if (indexOf == 5) {
                            if (!s.startsWith("DIRTY")) {
                                break;
                            }
                            bVar.f68997f = new C29150a(this, bVar, (byte) 0);
                            i++;
                        }
                        i++;
                    } else {
                        throw new IOException("unexpected journal line: ".concat(String.valueOf(s)));
                    }
                } catch (EOFException unused) {
                    this.f68969f = i - this.f68968e.size();
                    if (!a.mo143815e()) {
                        mo50838a();
                    } else {
                        this.f68979r = m58239f();
                    }
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(String.valueOf(s)));
        } finally {
            C29206j.m58438a(a);
        }
    }

    /* renamed from: a */
    public final synchronized void mo50838a() {
        MethodCollector.m26663i(3304);
        AbstractC89425g gVar = this.f68979r;
        if (gVar != null) {
            gVar.close();
        }
        AbstractC89425g a = C89436q.m155159a(this.f68965b.mo50898b(this.f68974m));
        try {
            a.mo68849a("libcore.io.DiskLruCache").mo68847a(10);
            a.mo68849a("1").mo68847a(10);
            a.mo68855b((long) this.f68976o).mo68847a(10);
            a.mo68855b((long) this.f68967d).mo68847a(10);
            a.mo68847a(10);
            for (C29152b bVar : this.f68968e.values()) {
                if (bVar.f68997f != null) {
                    a.mo68849a("DIRTY").mo68847a(32);
                    a.mo68849a(bVar.f68992a);
                    a.mo68847a(10);
                } else {
                    a.mo68849a("CLEAN").mo68847a(32);
                    a.mo68849a(bVar.f68992a);
                    bVar.mo50851a(a);
                    a.mo68847a(10);
                }
            }
            a.close();
            if (this.f68965b.mo50901e(this.f68973l)) {
                this.f68965b.mo50897a(this.f68973l, this.f68975n);
            }
            this.f68965b.mo50897a(this.f68974m, this.f68973l);
            this.f68965b.mo50900d(this.f68975n);
            this.f68979r = m58239f();
            this.f68970g = false;
            MethodCollector.m26664o(3304);
        } catch (Throwable th) {
            a.close();
            MethodCollector.m26664o(3304);
            throw th;
        }
    }

    /* renamed from: c */
    private static void m58236c(String str) {
        if (!f68962a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo50842b(String str) {
        MethodCollector.m26663i(3360);
        m58237d();
        m58242i();
        m58236c(str);
        C29152b bVar = this.f68968e.get(str);
        if (bVar == null) {
            MethodCollector.m26664o(3360);
            return false;
        }
        boolean a = mo50840a(bVar);
        MethodCollector.m26664o(3360);
        return a;
    }

    /* renamed from: a */
    public final synchronized C29153c mo50837a(String str) {
        MethodCollector.m26663i(3311);
        m58237d();
        m58242i();
        m58236c(str);
        C29152b bVar = this.f68968e.get(str);
        if (bVar == null || !bVar.f68996e) {
            MethodCollector.m26664o(3311);
            return null;
        }
        C29153c a = bVar.mo50850a();
        if (a == null) {
            MethodCollector.m26664o(3311);
            return null;
        }
        this.f68969f++;
        this.f68979r.mo68849a("READ").mo68847a(32).mo68849a(str).mo68847a(10);
        if (mo50841b()) {
            this.f68981t.execute(this.f68982u);
        }
        MethodCollector.m26664o(3311);
        return a;
    }

    /* renamed from: a */
    public final boolean mo50840a(C29152b bVar) {
        if (bVar.f68997f != null) {
            bVar.f68997f.f68988c = true;
        }
        for (int i = 0; i < this.f68967d; i++) {
            this.f68965b.mo50900d(bVar.f68994c[i]);
            this.f68978q -= bVar.f68993b[i];
            bVar.f68993b[i] = 0;
        }
        this.f68969f++;
        this.f68979r.mo68849a("REMOVE").mo68847a(32).mo68849a(bVar.f68992a).mo68847a(10);
        this.f68968e.remove(bVar.f68992a);
        if (mo50841b()) {
            this.f68981t.execute(this.f68982u);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2 != null) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.squareup.p2075a.p2076a.C29146b.C29150a mo50836a(java.lang.String r8, long r9) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.C29146b.mo50836a(java.lang.String, long):com.squareup.a.a.b$a");
    }

    /* renamed from: a */
    public final synchronized void mo50839a(C29150a aVar, boolean z) {
        MethodCollector.m26663i(3356);
        C29152b bVar = aVar.f68986a;
        if (bVar.f68997f == aVar) {
            if (z && !bVar.f68996e) {
                for (int i = 0; i < this.f68967d; i++) {
                    if (!aVar.f68987b[i]) {
                        aVar.mo50849b();
                        IllegalStateException illegalStateException = new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                        MethodCollector.m26664o(3356);
                        throw illegalStateException;
                    } else if (!this.f68965b.mo50901e(bVar.f68995d[i])) {
                        aVar.mo50849b();
                        MethodCollector.m26664o(3356);
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f68967d; i2++) {
                File file = bVar.f68995d[i2];
                if (!z) {
                    this.f68965b.mo50900d(file);
                } else if (this.f68965b.mo50901e(file)) {
                    File file2 = bVar.f68994c[i2];
                    this.f68965b.mo50897a(file, file2);
                    long j = bVar.f68993b[i2];
                    long f = this.f68965b.mo50902f(file2);
                    bVar.f68993b[i2] = f;
                    this.f68978q = (this.f68978q - j) + f;
                }
            }
            this.f68969f++;
            bVar.f68997f = null;
            if (bVar.f68996e || z) {
                bVar.f68996e = true;
                this.f68979r.mo68849a("CLEAN").mo68847a(32);
                this.f68979r.mo68849a(bVar.f68992a);
                bVar.mo50851a(this.f68979r);
                this.f68979r.mo68847a(10);
                if (z) {
                    long j2 = this.f68980s;
                    this.f68980s = 1 + j2;
                    bVar.f68998g = j2;
                }
            } else {
                this.f68968e.remove(bVar.f68992a);
                this.f68979r.mo68849a("REMOVE").mo68847a(32);
                this.f68979r.mo68849a(bVar.f68992a);
                this.f68979r.mo68847a(10);
            }
            this.f68979r.flush();
            if (this.f68978q > this.f68977p || mo50841b()) {
                this.f68981t.execute(this.f68982u);
            }
            MethodCollector.m26664o(3356);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException();
        MethodCollector.m26664o(3356);
        throw illegalStateException2;
    }

    public C29146b(AbstractC29187a aVar, File file, long j, Executor executor) {
        this.f68965b = aVar;
        this.f68966c = file;
        this.f68976o = 201105;
        this.f68973l = new File(file, "journal");
        this.f68974m = new File(file, "journal.tmp");
        this.f68975n = new File(file, "journal.bkp");
        this.f68967d = 2;
        this.f68977p = j;
        this.f68981t = executor;
    }
}
