package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.C87266h;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.support.C87272a;
import com.tencent.wcdb.support.C87274b;
import com.tencent.wcdb.support.Log;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class SQLiteConnection implements C87272a.AbstractC87273a {

    /* renamed from: a */
    public static final byte[] f197601a = new byte[0];

    /* renamed from: b */
    static final Pattern f197602b = Pattern.compile("[\\s]*\\n+[\\s]*");

    /* renamed from: i */
    private static final String[] f197603i = new String[0];

    /* renamed from: c */
    public final C87246d f197604c;

    /* renamed from: d */
    public final int f197605d;

    /* renamed from: e */
    public final boolean f197606e;

    /* renamed from: f */
    public final C87238b f197607f = new C87238b(this, (byte) 0);

    /* renamed from: g */
    public int f197608g;

    /* renamed from: h */
    public boolean f197609h;

    /* renamed from: j */
    private final C87253g f197610j;

    /* renamed from: k */
    private final boolean f197611k;

    /* renamed from: l */
    private final C87240d f197612l;

    /* renamed from: m */
    private C87239c f197613m;

    /* renamed from: n */
    private Thread f197614n;

    /* renamed from: o */
    private long f197615o;

    /* renamed from: p */
    private int f197616p;

    /* renamed from: q */
    private byte[] f197617q;

    /* renamed from: r */
    private SQLiteCipherSpec f197618r;

    /* renamed from: s */
    private C87237a f197619s;

    /* renamed from: t */
    private int f197620t;

    private static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    private static native void nativeBindDouble(long j, long j2, int i, double d);

    private static native void nativeBindLong(long j, long j2, int i, long j3);

    private static native void nativeBindNull(long j, long j2, int i);

    private static native void nativeBindString(long j, long j2, int i, String str);

    private static native void nativeCancel(long j);

    private static native void nativeClose(long j);

    private static native void nativeExecute(long j, long j2);

    private static native int nativeExecuteForChangedRowCount(long j, long j2);

    private static native long nativeExecuteForCursorWindow(long j, long j2, long j3, int i, int i2, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    private static native long nativeExecuteForLong(long j, long j2);

    private static native String nativeExecuteForString(long j, long j2);

    private static native void nativeFinalizeStatement(long j, long j2);

    private static native int nativeGetColumnCount(long j, long j2);

    private static native String nativeGetColumnName(long j, long j2, int i);

    private static native int nativeGetDbLookaside(long j);

    private static native int nativeGetParameterCount(long j, long j2);

    private static native boolean nativeIsReadOnly(long j, long j2);

    private native long nativeOpen(String str, int i, String str2);

    private static native long nativePrepareStatement(long j, String str);

    private static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterLocalizedCollators(long j, String str);

    private static native void nativeResetCancel(long j, boolean z);

    private static native void nativeResetStatement(long j, long j2, boolean z);

    private static native long nativeSQLiteHandle(long j, boolean z);

    private static native void nativeSetKey(long j, byte[] bArr);

    private static native void nativeSetUpdateNotification(long j, boolean z, boolean z2);

    private static native void nativeSetWalHook(long j);

    private static native long nativeWalCheckpoint(long j, String str);

    /* access modifiers changed from: package-private */
    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$a */
    public static final class C87237a {

        /* renamed from: k */
        private static final SimpleDateFormat f197621k = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        /* renamed from: a */
        public long f197622a;

        /* renamed from: b */
        public long f197623b;

        /* renamed from: c */
        public String f197624c;

        /* renamed from: d */
        public String f197625d;

        /* renamed from: e */
        public ArrayList<Object> f197626e;

        /* renamed from: f */
        public boolean f197627f;

        /* renamed from: g */
        public Exception f197628g;

        /* renamed from: h */
        public int f197629h;

        /* renamed from: i */
        public int f197630i;

        /* renamed from: j */
        public int f197631j;

        private C87237a() {
        }

        static {
            Covode.recordClassIndex(103104);
        }

        /* synthetic */ C87237a(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo141186a(StringBuilder sb) {
            String str;
            sb.append(this.f197624c);
            if (this.f197627f) {
                sb.append(" took ").append(this.f197623b - this.f197622a).append("ms");
            } else {
                sb.append(" started ").append(System.currentTimeMillis() - this.f197622a).append("ms ago");
            }
            StringBuilder append = sb.append(" - ");
            if (!this.f197627f) {
                str = "running";
            } else if (this.f197628g != null) {
                str = "failed";
            } else {
                str = "succeeded";
            }
            append.append(str);
            if (this.f197625d != null) {
                sb.append(", sql=\"").append(SQLiteConnection.f197602b.matcher(this.f197625d).replaceAll(" ")).append("\"");
            }
            if (this.f197631j > 0) {
                sb.append(", tid=").append(this.f197631j);
            }
            Exception exc = this.f197628g;
            if (exc != null && exc.getMessage() != null) {
                sb.append(", exception=\"").append(this.f197628g.getMessage()).append("\"");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141169a() {
        m151289c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141173a(Exception exc) {
        MethodCollector.m26663i(4908);
        int i = this.f197620t - 1;
        this.f197620t = i;
        if (i == 0 && this.f197619s != null) {
            nativeSQLiteHandle(this.f197615o, false);
            this.f197607f.mo141192b(this.f197619s.f197629h);
            this.f197619s = null;
        }
        MethodCollector.m26664o(4908);
    }

    /* renamed from: a */
    public final void mo141174a(String str, C87261n nVar) {
        C87246d dVar;
        MethodCollector.m26663i(5142);
        if (str != null) {
            C87237a a = this.f197607f.mo141187a("prepare", str, null);
            int i = a.f197629h;
            try {
                C87239c d = m151292d(str);
                a.f197630i = d.f197641f;
                try {
                    nVar.f197761a = d.f197640e;
                    nVar.f197763c = d.f197642g;
                    int nativeGetColumnCount = nativeGetColumnCount(this.f197615o, d.f197639d);
                    if (nativeGetColumnCount == 0) {
                        nVar.f197762b = f197603i;
                    } else {
                        nVar.f197762b = new String[nativeGetColumnCount];
                        for (int i2 = 0; i2 < nativeGetColumnCount; i2++) {
                            nVar.f197762b[i2] = nativeGetColumnName(this.f197615o, d.f197639d, i2);
                        }
                    }
                    mo141170a(d);
                    this.f197607f.mo141189a(i);
                    MethodCollector.m26664o(5142);
                } catch (Throwable th) {
                    mo141170a(d);
                    MethodCollector.m26664o(5142);
                    throw th;
                }
            } catch (RuntimeException e) {
                if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (dVar = this.f197604c) != null) {
                    dVar.mo141232a();
                }
                this.f197607f.mo141190a(i, e);
                MethodCollector.m26664o(5142);
                throw e;
            } catch (Throwable th2) {
                this.f197607f.mo141189a(i);
                MethodCollector.m26664o(5142);
                throw th2;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.m26664o(5142);
            throw illegalArgumentException;
        }
    }

    /* renamed from: a */
    public final void mo141175a(String str, Object[] objArr, C87272a aVar) {
        C87246d dVar;
        MethodCollector.m26663i(5154);
        if (str != null) {
            C87237a a = this.f197607f.mo141187a("execute", str, objArr);
            int i = a.f197629h;
            try {
                C87239c d = m151292d(str);
                a.f197630i = d.f197641f;
                try {
                    m151294d(d);
                    m151287a(d, objArr);
                    m151288b(aVar);
                    try {
                        nativeExecute(this.f197615o, d.f197639d);
                        mo141172a(aVar);
                        mo141170a(d);
                        this.f197607f.mo141189a(i);
                        MethodCollector.m26664o(5154);
                    } catch (Throwable th) {
                        mo141172a(aVar);
                        MethodCollector.m26664o(5154);
                        throw th;
                    }
                } catch (Throwable th2) {
                    mo141170a(d);
                    MethodCollector.m26664o(5154);
                    throw th2;
                }
            } catch (RuntimeException e) {
                if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (dVar = this.f197604c) != null) {
                    dVar.mo141232a();
                }
                this.f197607f.mo141190a(i, e);
                MethodCollector.m26664o(5154);
                throw e;
            } catch (Throwable th3) {
                this.f197607f.mo141189a(i);
                MethodCollector.m26664o(5154);
                throw th3;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.m26664o(5154);
            throw illegalArgumentException;
        }
    }

    @Override // com.tencent.wcdb.support.C87272a.AbstractC87273a
    /* renamed from: b */
    public final void mo141178b() {
        MethodCollector.m26663i(5462);
        nativeCancel(this.f197615o);
        MethodCollector.m26664o(5462);
    }

    static {
        Covode.recordClassIndex(103103);
    }

    /* renamed from: f */
    private void m151297f() {
        String str;
        if (!this.f197610j.mo141242a() && !this.f197611k) {
            if ((this.f197610j.f197711d & 536870912) != 0) {
                str = "WAL";
            } else {
                str = "PERSIST";
            }
            m151291c(str);
        }
    }

    /* renamed from: g */
    private void m151298g() {
        mo141175a("PRAGMA synchronous=".concat(String.valueOf(this.f197610j.f197716i)), null, null);
    }

    /* renamed from: i */
    private void m151300i() {
        MethodCollector.m26663i(5103);
        nativeSetUpdateNotification(this.f197615o, this.f197610j.f197717j, this.f197610j.f197718k);
        MethodCollector.m26664o(5103);
    }

    /* renamed from: c */
    private void m151289c() {
        MethodCollector.m26663i(5074);
        if (this.f197615o != 0) {
            int i = this.f197607f.mo141187a("close", null, null).f197629h;
            try {
                this.f197612l.mo141284a();
                nativeClose(this.f197615o);
                this.f197615o = 0;
            } finally {
                this.f197607f.mo141189a(i);
                MethodCollector.m26664o(5074);
            }
        } else {
            MethodCollector.m26664o(5074);
        }
    }

    /* renamed from: d */
    private void m151293d() {
        MethodCollector.m26663i(5079);
        if (!this.f197610j.mo141242a() && !this.f197611k) {
            if (this.f197610j.f197715h) {
                nativeSetWalHook(this.f197615o);
                MethodCollector.m26664o(5079);
                return;
            } else if (mo141177b("PRAGMA wal_autocheckpoint", null, null) != 100) {
                mo141177b("PRAGMA wal_autocheckpoint=100", null, null);
            }
        }
        MethodCollector.m26664o(5079);
    }

    /* renamed from: e */
    private void m151295e() {
        long j;
        if (!this.f197611k) {
            if (this.f197610j.f197714g) {
                j = 1;
            } else {
                j = 0;
            }
            if (mo141177b("PRAGMA foreign_keys", null, null) != j) {
                mo141175a("PRAGMA foreign_keys=".concat(String.valueOf(j)), null, null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            C87246d dVar = this.f197604c;
            if (!(dVar == null || this.f197615o == 0)) {
                Log.m151457a(5, "WCDB.SQLiteConnectionPool", "A SQLiteConnection object for database '" + dVar.f197673i.f197709b + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
                dVar.f197672h.set(true);
            }
            m151289c();
        } finally {
            super.finalize();
        }
    }

    public final String toString() {
        return "SQLiteConnection: " + this.f197610j.f197708a + " (" + this.f197605d + ")";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$b */
    public final class C87238b {

        /* renamed from: b */
        private final C87237a[] f197633b;

        /* renamed from: c */
        private int f197634c;

        /* renamed from: d */
        private int f197635d;

        static {
            Covode.recordClassIndex(103105);
        }

        /* renamed from: a */
        public final String mo141188a() {
            MethodCollector.m26663i(4924);
            synchronized (this.f197633b) {
                try {
                    C87237a aVar = this.f197633b[this.f197634c];
                    if (aVar == null || aVar.f197627f) {
                        MethodCollector.m26664o(4924);
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    aVar.mo141186a(sb);
                    return sb.toString();
                } finally {
                    MethodCollector.m26664o(4924);
                }
            }
        }

        private C87238b() {
            this.f197633b = new C87237a[20];
        }

        /* renamed from: c */
        private C87237a m151321c(int i) {
            C87237a aVar = this.f197633b[i & 255];
            if (aVar.f197629h == i) {
                return aVar;
            }
            return null;
        }

        /* renamed from: a */
        private static boolean m151320a(C87237a aVar) {
            if (aVar == null) {
                return false;
            }
            aVar.f197623b = System.currentTimeMillis();
            aVar.f197627f = true;
            if (aVar.f197628g == null || aVar.f197628g.getMessage() == null) {
                return SQLiteDebug.m151366a(aVar.f197623b - aVar.f197622a);
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
            if ("prepare".equals(r1) != false) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            r5.f197632a.f197604c.mo141236c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4912);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return r2;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo141192b(int r6) {
            /*
                r5 = this;
                r4 = 4912(0x1330, float:6.883E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
                com.tencent.wcdb.database.SQLiteConnection$a[] r3 = r5.f197633b
                monitor-enter(r3)
                com.tencent.wcdb.database.SQLiteConnection$a r0 = r5.m151321c(r6)     // Catch:{ all -> 0x002e }
                if (r0 != 0) goto L_0x0014
                r0 = 0
                monitor-exit(r3)     // Catch:{ all -> 0x002e }
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                return r0
            L_0x0014:
                boolean r2 = m151320a(r0)
                java.lang.String r1 = r0.f197624c
                monitor-exit(r3)
                java.lang.String r0 = "prepare"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x002a
                com.tencent.wcdb.database.SQLiteConnection r0 = com.tencent.wcdb.database.SQLiteConnection.this
                com.tencent.wcdb.database.d r0 = r0.f197604c
                r0.mo141236c()
            L_0x002a:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                return r2
            L_0x002e:
                r0 = move-exception
                monitor-exit(r3)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.C87238b.mo141192b(int):boolean");
        }

        /* renamed from: a */
        public final void mo141189a(int i) {
            String str;
            MethodCollector.m26663i(4905);
            synchronized (this.f197633b) {
                try {
                    C87237a c = m151321c(i);
                    if (m151320a(c)) {
                        m151319a(c, (String) null);
                    }
                    str = c.f197624c;
                } finally {
                    MethodCollector.m26664o(4905);
                }
            }
            if (!"prepare".equals(str)) {
                SQLiteConnection.this.f197604c.mo141236c();
            }
        }

        /* synthetic */ C87238b(SQLiteConnection sQLiteConnection, byte b) {
            this();
        }

        /* renamed from: a */
        private static void m151319a(C87237a aVar, String str) {
            StringBuilder sb = new StringBuilder();
            aVar.mo141186a(sb);
            if (str != null) {
                sb.append(", ").append(str);
            }
            Log.m151457a(4, "WCDB.SQLiteConnection", sb.toString());
        }

        /* renamed from: a */
        public final void mo141190a(int i, Exception exc) {
            MethodCollector.m26663i(4854);
            synchronized (this.f197633b) {
                try {
                    C87237a c = m151321c(i);
                    if (c != null) {
                        c.f197628g = exc;
                    }
                } finally {
                    MethodCollector.m26664o(4854);
                }
            }
        }

        /* renamed from: a */
        public final void mo141191a(int i, String str) {
            MethodCollector.m26663i(4916);
            synchronized (this.f197633b) {
                try {
                    C87237a c = m151321c(i);
                    if (c != null) {
                        m151319a(c, str);
                    }
                } finally {
                    MethodCollector.m26664o(4916);
                }
            }
        }

        /* renamed from: a */
        public final C87237a mo141187a(String str, String str2, Object[] objArr) {
            C87237a aVar;
            MethodCollector.m26663i(4786);
            synchronized (this.f197633b) {
                try {
                    int i = (this.f197634c + 1) % 20;
                    aVar = this.f197633b[i];
                    if (aVar == null) {
                        aVar = new C87237a((byte) 0);
                        this.f197633b[i] = aVar;
                    } else {
                        aVar.f197627f = false;
                        aVar.f197628g = null;
                        if (aVar.f197626e != null) {
                            aVar.f197626e.clear();
                        }
                    }
                    aVar.f197622a = System.currentTimeMillis();
                    aVar.f197624c = str;
                    aVar.f197625d = str2;
                    if (objArr != null) {
                        if (aVar.f197626e == null) {
                            aVar.f197626e = new ArrayList<>();
                        } else {
                            aVar.f197626e.clear();
                        }
                        for (Object obj : objArr) {
                            if (obj == null || !(obj instanceof byte[])) {
                                aVar.f197626e.add(obj);
                            } else {
                                aVar.f197626e.add(SQLiteConnection.f197601a);
                            }
                        }
                    }
                    int i2 = this.f197635d;
                    this.f197635d = i2 + 1;
                    aVar.f197629h = (i2 << 8) | i;
                    aVar.f197631j = SQLiteConnection.this.f197608g;
                    this.f197634c = i;
                } finally {
                    MethodCollector.m26664o(4786);
                }
            }
            return aVar;
        }
    }

    /* renamed from: h */
    private void m151299h() {
        MethodCollector.m26663i(5102);
        this.f197610j.f197711d |= 16;
        if ((this.f197610j.f197711d & 16) != 0) {
            MethodCollector.m26664o(5102);
            return;
        }
        String locale = this.f197610j.f197713f.toString();
        nativeRegisterLocalizedCollators(this.f197615o, locale);
        if (this.f197611k) {
            MethodCollector.m26664o(5102);
            return;
        }
        try {
            mo141175a("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            String c = mo141181c("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
            if (c == null || !c.equals(locale)) {
                mo141175a("BEGIN", null, null);
                try {
                    mo141175a("DELETE FROM android_metadata", null, null);
                    mo141175a("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{locale}, null);
                    mo141175a("REINDEX LOCALIZED", null, null);
                    mo141175a("COMMIT", null, null);
                    MethodCollector.m26664o(5102);
                } catch (Throwable th) {
                    mo141175a("ROLLBACK", null, null);
                    MethodCollector.m26664o(5102);
                    throw th;
                }
            } else {
                MethodCollector.m26664o(5102);
            }
        } catch (RuntimeException e) {
            SQLiteException sQLiteException = new SQLiteException("Failed to change locale for db '" + this.f197610j.f197709b + "' to '" + locale + "'.", e);
            MethodCollector.m26664o(5102);
            throw sQLiteException;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$c */
    public static final class C87239c {

        /* renamed from: a */
        WeakReference<SQLiteConnection> f197636a;

        /* renamed from: b */
        public C87239c f197637b;

        /* renamed from: c */
        public String f197638c;

        /* renamed from: d */
        public long f197639d;

        /* renamed from: e */
        public int f197640e;

        /* renamed from: f */
        public int f197641f;

        /* renamed from: g */
        public boolean f197642g;

        /* renamed from: h */
        public boolean f197643h;

        /* renamed from: i */
        public boolean f197644i;

        /* renamed from: j */
        C87237a f197645j;

        static {
            Covode.recordClassIndex(103106);
        }

        C87239c(SQLiteConnection sQLiteConnection) {
            this.f197636a = new WeakReference<>(sQLiteConnection);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tencent.wcdb.database.SQLiteConnection$d */
    public final class C87240d extends C87274b<String, C87239c> {
        static {
            Covode.recordClassIndex(103107);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.tencent.wcdb.support.C87274b
        /* renamed from: a */
        public final /* synthetic */ void mo141193a(C87239c cVar) {
            C87239c cVar2 = cVar;
            cVar2.f197643h = false;
            if (!cVar2.f197644i) {
                SQLiteConnection.this.mo141179b(cVar2);
            }
        }

        public C87240d(int i) {
            super(i);
        }
    }

    /* renamed from: e */
    private void m151296e(C87239c cVar) {
        cVar.f197638c = null;
        cVar.f197637b = this.f197613m;
        this.f197613m = cVar;
    }

    /* renamed from: b */
    private void m151288b(C87272a aVar) {
        MethodCollector.m26663i(5459);
        if (aVar != null) {
            aVar.mo141281a();
            int i = this.f197616p + 1;
            this.f197616p = i;
            if (i == 1) {
                nativeResetCancel(this.f197615o, true);
                aVar.mo141282a(this);
            }
        }
        MethodCollector.m26664o(5459);
    }

    /* renamed from: c */
    private void m151290c(C87239c cVar) {
        MethodCollector.m26663i(5690);
        nativeResetStatement(this.f197615o, cVar.f197639d, true);
        MethodCollector.m26664o(5690);
    }

    /* renamed from: d */
    private void m151294d(C87239c cVar) {
        if (this.f197609h && !cVar.f197642g) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141170a(C87239c cVar) {
        cVar.f197644i = false;
        if (cVar.f197643h) {
            try {
                m151290c(cVar);
            } catch (SQLiteException unused) {
                this.f197612l.mo141287c(cVar.f197638c);
            }
        } else {
            mo141179b(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo141168a(String str) {
        MethodCollector.m26663i(4857);
        if (this.f197615o == 0) {
            MethodCollector.m26664o(4857);
            return 0;
        }
        if (str != null && this.f197619s == null) {
            C87237a a = this.f197607f.mo141187a(str, null, null);
            this.f197619s = a;
            a.f197630i = 99;
        }
        this.f197620t++;
        long nativeSQLiteHandle = nativeSQLiteHandle(this.f197615o, true);
        MethodCollector.m26664o(4857);
        return nativeSQLiteHandle;
    }

    /* renamed from: b */
    public final void mo141179b(C87239c cVar) {
        MethodCollector.m26663i(5353);
        nativeFinalizeStatement(this.f197615o, cVar.f197639d);
        m151296e(cVar);
        MethodCollector.m26664o(5353);
    }

    /* renamed from: c */
    private void m151291c(String str) {
        String c = mo141181c("PRAGMA journal_mode", null, null);
        if (!c.equalsIgnoreCase(str)) {
            try {
                if (mo141181c("PRAGMA journal_mode=".concat(String.valueOf(str)), null, null).equalsIgnoreCase(str)) {
                    return;
                }
            } catch (SQLiteDatabaseLockedException unused) {
            }
            Log.m151457a(5, "WCDB.SQLiteConnection", "Could not change the database journal mode of '" + this.f197610j.f197709b + "' from '" + c + "' to '" + str + "' because the database is locked.  This usually means that there are other open connections to the database which prevents the database from enabling or disabling write-ahead logging mode.  Proceeding without changing the journal mode.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r5 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        if (r5.f197643h == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        nativeFinalizeStatement(r12.f197615o, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5348);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        throw r4;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.wcdb.database.SQLiteConnection.C87239c m151292d(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.m151292d(java.lang.String):com.tencent.wcdb.database.SQLiteConnection$c");
    }

    /* renamed from: a */
    public final void mo141172a(C87272a aVar) {
        MethodCollector.m26663i(5460);
        if (aVar != null) {
            int i = this.f197616p - 1;
            this.f197616p = i;
            if (i == 0) {
                aVar.mo141282a(null);
                nativeResetCancel(this.f197615o, false);
            }
        }
        MethodCollector.m26664o(5460);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo141180b(String str) {
        if (this.f197612l.mo141286b(str) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141171a(C87253g gVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        MethodCollector.m26663i(5113);
        boolean z5 = false;
        this.f197609h = false;
        int size = gVar.f197719l.size();
        for (int i = 0; i < size; i++) {
            SQLiteCustomFunction sQLiteCustomFunction = gVar.f197719l.get(i);
            if (!this.f197610j.f197719l.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.f197615o, sQLiteCustomFunction);
            }
        }
        if (((gVar.f197711d ^ this.f197610j.f197711d) & 536870912) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (gVar.f197714g != this.f197610j.f197714g) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = !gVar.f197713f.equals(this.f197610j.f197713f);
        if (gVar.f197715h != this.f197610j.f197715h) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (gVar.f197716i != this.f197610j.f197716i) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!(gVar.f197717j == this.f197610j.f197717j && gVar.f197718k == this.f197610j.f197718k)) {
            z5 = true;
        }
        this.f197610j.mo141241a(gVar);
        C87240d dVar = this.f197612l;
        int i2 = gVar.f197712e;
        if (i2 > 0) {
            synchronized (dVar) {
                try {
                    dVar.f197781b = i2;
                } finally {
                    MethodCollector.m26664o(5113);
                }
            }
            dVar.mo141285a(i2);
            if (z2) {
                m151295e();
            }
            if (z) {
                m151297f();
            }
            if (z4) {
                m151298g();
            }
            if (z3) {
                m151293d();
            }
            if (z6) {
                m151299h();
            }
            if (z5) {
                m151300i();
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("maxSize <= 0");
        MethodCollector.m26664o(5113);
        throw illegalArgumentException;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141176a(Thread thread, int i) {
        this.f197614n = thread;
        this.f197608g = i;
    }

    private void notifyCheckpoint(String str, int i) {
        C87246d dVar = this.f197604c;
        dVar.f197665a.get();
        AbstractC87244b bVar = dVar.f197668d;
    }

    /* renamed from: a */
    private void m151287a(C87239c cVar, Object[] objArr) {
        int i;
        long j;
        MethodCollector.m26663i(5569);
        if (objArr != null) {
            i = objArr.length;
        } else {
            i = 0;
        }
        if (i != cVar.f197640e) {
            SQLiteBindOrColumnIndexOutOfRangeException sQLiteBindOrColumnIndexOutOfRangeException = new SQLiteBindOrColumnIndexOutOfRangeException("Expected " + cVar.f197640e + " bind arguments but " + i + " were provided.");
            MethodCollector.m26664o(5569);
            throw sQLiteBindOrColumnIndexOutOfRangeException;
        } else if (i == 0) {
            MethodCollector.m26664o(5569);
        } else {
            long j2 = cVar.f197639d;
            int i2 = 0;
            do {
                Object obj = objArr[i2];
                if (obj == null) {
                    nativeBindNull(this.f197615o, j2, i2 + 1);
                } else if (obj instanceof byte[]) {
                    nativeBindBlob(this.f197615o, j2, i2 + 1, (byte[]) obj);
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    nativeBindDouble(this.f197615o, j2, i2 + 1, ((Number) obj).doubleValue());
                } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                    nativeBindLong(this.f197615o, j2, i2 + 1, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    long j3 = this.f197615o;
                    int i3 = i2 + 1;
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    nativeBindLong(j3, j2, i3, j);
                } else {
                    nativeBindString(this.f197615o, j2, i2 + 1, obj.toString());
                }
                i2++;
            } while (i2 < i);
            MethodCollector.m26664o(5569);
        }
    }

    /* renamed from: b */
    public final long mo141177b(String str, Object[] objArr, C87272a aVar) {
        C87246d dVar;
        MethodCollector.m26663i(5195);
        if (str != null) {
            C87237a a = this.f197607f.mo141187a("executeForLong", str, objArr);
            int i = a.f197629h;
            try {
                C87239c d = m151292d(str);
                a.f197630i = d.f197641f;
                try {
                    m151294d(d);
                    m151287a(d, objArr);
                    m151288b((C87272a) null);
                    try {
                        long nativeExecuteForLong = nativeExecuteForLong(this.f197615o, d.f197639d);
                        mo141172a((C87272a) null);
                        mo141170a(d);
                        this.f197607f.mo141189a(i);
                        MethodCollector.m26664o(5195);
                        return nativeExecuteForLong;
                    } catch (Throwable th) {
                        mo141172a((C87272a) null);
                        MethodCollector.m26664o(5195);
                        throw th;
                    }
                } catch (Throwable th2) {
                    mo141170a(d);
                    MethodCollector.m26664o(5195);
                    throw th2;
                }
            } catch (RuntimeException e) {
                if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (dVar = this.f197604c) != null) {
                    dVar.mo141232a();
                }
                this.f197607f.mo141190a(i, e);
                MethodCollector.m26664o(5195);
                throw e;
            } catch (Throwable th3) {
                this.f197607f.mo141189a(i);
                MethodCollector.m26664o(5195);
                throw th3;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.m26664o(5195);
            throw illegalArgumentException;
        }
    }

    /* renamed from: e */
    public final long mo141183e(String str, Object[] objArr, C87272a aVar) {
        C87246d dVar;
        MethodCollector.m26663i(5251);
        if (str != null) {
            C87237a a = this.f197607f.mo141187a("executeForLastInsertedRowId", str, objArr);
            int i = a.f197629h;
            try {
                C87239c d = m151292d(str);
                a.f197630i = d.f197641f;
                try {
                    m151294d(d);
                    m151287a(d, objArr);
                    m151288b((C87272a) null);
                    try {
                        long nativeExecuteForLastInsertedRowId = nativeExecuteForLastInsertedRowId(this.f197615o, d.f197639d);
                        mo141172a((C87272a) null);
                        mo141170a(d);
                        this.f197607f.mo141189a(i);
                        MethodCollector.m26664o(5251);
                        return nativeExecuteForLastInsertedRowId;
                    } catch (Throwable th) {
                        mo141172a((C87272a) null);
                        MethodCollector.m26664o(5251);
                        throw th;
                    }
                } catch (Throwable th2) {
                    mo141170a(d);
                    MethodCollector.m26664o(5251);
                    throw th2;
                }
            } catch (RuntimeException e) {
                if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (dVar = this.f197604c) != null) {
                    dVar.mo141232a();
                }
                this.f197607f.mo141190a(i, e);
                MethodCollector.m26664o(5251);
                throw e;
            } catch (Throwable th3) {
                this.f197607f.mo141189a(i);
                MethodCollector.m26664o(5251);
                throw th3;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.m26664o(5251);
            throw illegalArgumentException;
        }
    }

    /* renamed from: c */
    public final String mo141181c(String str, Object[] objArr, C87272a aVar) {
        C87246d dVar;
        MethodCollector.m26663i(5220);
        if (str != null) {
            C87237a a = this.f197607f.mo141187a("executeForString", str, objArr);
            int i = a.f197629h;
            try {
                C87239c d = m151292d(str);
                a.f197630i = d.f197641f;
                try {
                    m151294d(d);
                    m151287a(d, objArr);
                    m151288b((C87272a) null);
                    try {
                        String nativeExecuteForString = nativeExecuteForString(this.f197615o, d.f197639d);
                        mo141172a((C87272a) null);
                        mo141170a(d);
                        this.f197607f.mo141189a(i);
                        MethodCollector.m26664o(5220);
                        return nativeExecuteForString;
                    } catch (Throwable th) {
                        mo141172a((C87272a) null);
                        MethodCollector.m26664o(5220);
                        throw th;
                    }
                } catch (Throwable th2) {
                    mo141170a(d);
                    MethodCollector.m26664o(5220);
                    throw th2;
                }
            } catch (RuntimeException e) {
                if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (dVar = this.f197604c) != null) {
                    dVar.mo141232a();
                }
                this.f197607f.mo141190a(i, e);
                MethodCollector.m26664o(5220);
                throw e;
            } catch (Throwable th3) {
                this.f197607f.mo141189a(i);
                MethodCollector.m26664o(5220);
                throw th3;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.m26664o(5220);
            throw illegalArgumentException;
        }
    }

    /* renamed from: d */
    public final int mo141182d(String str, Object[] objArr, C87272a aVar) {
        C87246d dVar;
        MethodCollector.m26663i(5237);
        if (str != null) {
            C87237a a = this.f197607f.mo141187a("executeForChangedRowCount", str, objArr);
            int i = a.f197629h;
            try {
                C87239c d = m151292d(str);
                a.f197630i = d.f197641f;
                try {
                    m151294d(d);
                    m151287a(d, objArr);
                    m151288b(aVar);
                    try {
                        int nativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.f197615o, d.f197639d);
                        mo141172a(aVar);
                        mo141170a(d);
                        if (this.f197607f.mo141192b(i)) {
                            this.f197607f.mo141191a(i, "changedRows=".concat(String.valueOf(nativeExecuteForChangedRowCount)));
                        }
                        MethodCollector.m26664o(5237);
                        return nativeExecuteForChangedRowCount;
                    } catch (Throwable th) {
                        mo141172a(aVar);
                        MethodCollector.m26664o(5237);
                        throw th;
                    }
                } catch (Throwable th2) {
                    mo141170a(d);
                    MethodCollector.m26664o(5237);
                    throw th2;
                }
            } catch (RuntimeException e) {
                if (((e instanceof SQLiteDatabaseLockedException) || (e instanceof SQLiteTableLockedException)) && (dVar = this.f197604c) != null) {
                    dVar.mo141232a();
                }
                this.f197607f.mo141190a(i, e);
                MethodCollector.m26664o(5237);
                throw e;
            } catch (Throwable th3) {
                if (this.f197607f.mo141192b(i)) {
                    this.f197607f.mo141191a(i, "changedRows=".concat(String.valueOf(0)));
                }
                MethodCollector.m26664o(5237);
                throw th3;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("sql must not be null.");
            MethodCollector.m26664o(5237);
            throw illegalArgumentException;
        }
    }

    private void notifyChange(String str, String str2, long[] jArr, long[] jArr2, long[] jArr3) {
        C87246d dVar = this.f197604c;
        dVar.f197665a.get();
        AbstractC87243a aVar = dVar.f197666b;
    }

    private SQLiteConnection(C87246d dVar, C87253g gVar, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        boolean z2 = false;
        this.f197617q = bArr;
        if (sQLiteCipherSpec == null) {
            sQLiteCipherSpec2 = null;
        } else {
            sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
        }
        this.f197618r = sQLiteCipherSpec2;
        this.f197604c = dVar;
        C87253g gVar2 = new C87253g(gVar);
        this.f197610j = gVar2;
        this.f197605d = i;
        this.f197606e = z;
        this.f197611k = (gVar.f197711d & 1) != 0 ? true : z2;
        this.f197612l = new C87240d(gVar2.f197712e);
    }

    /* renamed from: a */
    static SQLiteConnection m151286a(C87246d dVar, C87253g gVar, int i, boolean z, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec) {
        String str;
        int i2;
        MethodCollector.m26663i(5007);
        SQLiteConnection sQLiteConnection = new SQLiteConnection(dVar, gVar, i, z, bArr, sQLiteCipherSpec);
        try {
            long nativeOpen = sQLiteConnection.nativeOpen(sQLiteConnection.f197610j.f197708a, sQLiteConnection.f197610j.f197711d, sQLiteConnection.f197610j.f197710c);
            sQLiteConnection.f197615o = nativeOpen;
            byte[] bArr2 = sQLiteConnection.f197617q;
            if (bArr2 != null && bArr2.length == 0) {
                sQLiteConnection.f197617q = null;
            }
            byte[] bArr3 = sQLiteConnection.f197617q;
            if (bArr3 != null) {
                nativeSetKey(nativeOpen, bArr3);
                SQLiteCipherSpec sQLiteCipherSpec2 = sQLiteConnection.f197618r;
                if (sQLiteCipherSpec2 != null) {
                    if (sQLiteCipherSpec2.cipher != null) {
                        sQLiteConnection.mo141175a("PRAGMA cipher=" + C87266h.m151445a(sQLiteConnection.f197618r.cipher), null, null);
                    }
                    if (sQLiteConnection.f197618r.kdfIteration != 0) {
                        sQLiteConnection.mo141175a("PRAGMA kdf_iter=" + sQLiteConnection.f197618r.kdfIteration, null, null);
                    }
                    sQLiteConnection.mo141175a("PRAGMA cipher_use_hmac=" + sQLiteConnection.f197618r.hmacEnabled, null, null);
                }
            }
            if (!sQLiteConnection.f197610j.mo141242a()) {
                if (sQLiteConnection.f197617q != null) {
                    str = "PRAGMA cipher_page_size";
                    SQLiteCipherSpec sQLiteCipherSpec3 = sQLiteConnection.f197618r;
                    if (sQLiteCipherSpec3 == null || sQLiteCipherSpec3.pageSize <= 0) {
                        i2 = SQLiteGlobal.f197662a;
                    } else {
                        i2 = sQLiteConnection.f197618r.pageSize;
                    }
                } else {
                    str = "PRAGMA page_size";
                    i2 = SQLiteGlobal.f197662a;
                }
                long j = (long) i2;
                if (sQLiteConnection.mo141177b(str, null, null) != j) {
                    sQLiteConnection.mo141175a(str + "=" + j, null, null);
                }
            }
            if (sQLiteConnection.f197611k) {
                sQLiteConnection.mo141175a("PRAGMA query_only = 1", null, null);
            }
            sQLiteConnection.m151295e();
            sQLiteConnection.m151297f();
            sQLiteConnection.m151298g();
            if (!sQLiteConnection.f197610j.mo141242a() && !sQLiteConnection.f197611k && sQLiteConnection.mo141177b("PRAGMA journal_size_limit", null, null) != 524288) {
                sQLiteConnection.mo141177b("PRAGMA journal_size_limit=524288", null, null);
            }
            sQLiteConnection.m151293d();
            sQLiteConnection.m151299h();
            sQLiteConnection.m151300i();
            int size = sQLiteConnection.f197610j.f197719l.size();
            for (int i3 = 0; i3 < size; i3++) {
                nativeRegisterCustomFunction(sQLiteConnection.f197615o, sQLiteConnection.f197610j.f197719l.get(i3));
            }
            MethodCollector.m26664o(5007);
            return sQLiteConnection;
        } catch (SQLiteException e) {
            try {
                SQLiteDebug.f197658a = SQLiteDebug.nativeGetLastErrorLine();
                ArrayList<SQLiteDebug.IOTraceStats> arrayList = new ArrayList<>();
                long a = sQLiteConnection.mo141168a((String) null);
                if (a != 0) {
                    SQLiteDebug.nativeGetIOTraceStats(a, arrayList);
                    sQLiteConnection.mo141173a((Exception) null);
                }
                SQLiteDebug.f197659b = arrayList;
            } catch (RuntimeException e2) {
                Log.m151457a(6, "WCDB.SQLiteDebug", "Cannot collect I/O trace statistics: " + e2.getMessage());
            }
            sQLiteConnection.m151289c();
            MethodCollector.m26664o(5007);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo141167a(java.lang.String r29, java.lang.Object[] r30, com.tencent.wcdb.CursorWindow r31, int r32, int r33, boolean r34, com.tencent.wcdb.support.C87272a r35) {
        /*
        // Method dump skipped, instructions count: 336
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteConnection.mo141167a(java.lang.String, java.lang.Object[], com.tencent.wcdb.CursorWindow, int, int, boolean, com.tencent.wcdb.support.a):int");
    }
}
