package com.tencent.wcdb.database;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.support.C87272a;
import com.tencent.wcdb.support.Log;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.tencent.wcdb.database.d */
public final class C87246d implements Closeable {

    /* renamed from: m */
    static final /* synthetic */ boolean f197664m = true;

    /* renamed from: a */
    final WeakReference<SQLiteDatabase> f197665a;

    /* renamed from: b */
    public volatile AbstractC87243a f197666b;

    /* renamed from: c */
    public volatile AbstractC87262o f197667c;

    /* renamed from: d */
    public volatile AbstractC87244b f197668d;

    /* renamed from: e */
    byte[] f197669e;

    /* renamed from: f */
    SQLiteCipherSpec f197670f;

    /* renamed from: g */
    public final Object f197671g = new Object();

    /* renamed from: h */
    final AtomicBoolean f197672h = new AtomicBoolean();

    /* renamed from: i */
    final C87253g f197673i;

    /* renamed from: j */
    boolean f197674j;

    /* renamed from: k */
    C87249b f197675k;

    /* renamed from: l */
    SQLiteConnection f197676l;

    /* renamed from: n */
    private int f197677n;

    /* renamed from: o */
    private int f197678o;

    /* renamed from: p */
    private C87249b f197679p;

    /* renamed from: q */
    private final ArrayList<SQLiteConnection> f197680q = new ArrayList<>();

    /* renamed from: r */
    private final WeakHashMap<SQLiteConnection, EnumC87248a> f197681r = new WeakHashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: com.tencent.wcdb.database.d$b */
    public static final class C87249b {

        /* renamed from: a */
        public C87249b f197689a;

        /* renamed from: b */
        public Thread f197690b;

        /* renamed from: c */
        public long f197691c;

        /* renamed from: d */
        public int f197692d;

        /* renamed from: e */
        public boolean f197693e;

        /* renamed from: f */
        public String f197694f;

        /* renamed from: g */
        public int f197695g;

        /* renamed from: h */
        public SQLiteConnection f197696h;

        /* renamed from: i */
        public RuntimeException f197697i;

        /* renamed from: j */
        public int f197698j;

        static {
            Covode.recordClassIndex(103138);
        }

        private C87249b() {
        }

        /* synthetic */ C87249b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo141234a(C87253g gVar) {
        boolean z;
        String str;
        String str2;
        MethodCollector.m26663i(7135);
        if (gVar != null) {
            synchronized (this.f197671g) {
                try {
                    m151385h();
                    if (((gVar.f197711d ^ this.f197673i.f197711d) & 536870912) != 0) {
                        z = true;
                        if (this.f197681r.isEmpty()) {
                            m151382e();
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                            MethodCollector.m26664o(7135);
                            throw illegalStateException;
                        }
                    } else {
                        z = false;
                    }
                    if (gVar.f197714g == this.f197673i.f197714g || this.f197681r.isEmpty()) {
                        if (((this.f197673i.f197711d ^ gVar.f197711d) & 268435473) != 0 || ((str = this.f197673i.f197710c) != (str2 = gVar.f197710c) && (str == null || !str.equals(str2)))) {
                            if (z) {
                                m151381d();
                            }
                            SQLiteConnection a = mo141230a(gVar, true);
                            m151381d();
                            m151375a(EnumC87248a.DISCARD);
                            this.f197676l = a;
                            this.f197673i.mo141241a(gVar);
                            m151379b(0);
                        } else {
                            this.f197673i.mo141241a(gVar);
                            m151379b(0);
                            m151383f();
                            m151384g();
                        }
                        mo141235b();
                    } else {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                        MethodCollector.m26664o(7135);
                        throw illegalStateException2;
                    }
                } finally {
                    MethodCollector.m26664o(7135);
                }
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("configuration must not be null.");
        MethodCollector.m26664o(7135);
        throw illegalArgumentException;
    }

    /* renamed from: a */
    public final SQLiteConnection mo141231a(String str, int i, C87272a aVar) {
        SystemClock.uptimeMillis();
        SQLiteConnection b = m151378b(str, i, aVar);
        if (this.f197667c != null) {
            SystemClock.uptimeMillis();
            this.f197665a.get();
        }
        return b;
    }

    /* renamed from: a */
    public final void mo141233a(SQLiteConnection sQLiteConnection) {
        MethodCollector.m26663i(7138);
        synchronized (this.f197671g) {
            try {
                EnumC87248a remove = this.f197681r.remove(sQLiteConnection);
                if (remove == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                    MethodCollector.m26664o(7138);
                    throw illegalStateException;
                } else if (!this.f197674j) {
                    m151380b(sQLiteConnection);
                } else if (sQLiteConnection.f197606e) {
                    if (m151377a(sQLiteConnection, remove)) {
                        if (f197664m || this.f197676l == null) {
                            this.f197676l = sQLiteConnection;
                        } else {
                            AssertionError assertionError = new AssertionError();
                            MethodCollector.m26664o(7138);
                            throw assertionError;
                        }
                    }
                    mo141235b();
                } else if (this.f197680q.size() >= this.f197677n - 1) {
                    m151380b(sQLiteConnection);
                } else {
                    if (m151377a(sQLiteConnection, remove)) {
                        this.f197680q.add(sQLiteConnection);
                    }
                    mo141235b();
                }
            } finally {
                MethodCollector.m26664o(7138);
            }
        }
    }

    /* renamed from: a */
    private boolean m151377a(SQLiteConnection sQLiteConnection, EnumC87248a aVar) {
        if (aVar == EnumC87248a.RECONFIGURE) {
            try {
                sQLiteConnection.mo141171a(this.f197673i);
            } catch (RuntimeException e) {
                Log.m151458a("WCDB.SQLiteConnectionPool", "Failed to reconfigure released connection, closing it: ".concat(String.valueOf(sQLiteConnection)), e);
                aVar = EnumC87248a.DISCARD;
            }
        }
        if (aVar != EnumC87248a.DISCARD) {
            return true;
        }
        m151380b(sQLiteConnection);
        return false;
    }

    /* renamed from: a */
    public final void mo141232a() {
        MethodCollector.m26663i(4260);
        synchronized (this.f197671g) {
            try {
                m151373a(0, 0);
            } finally {
                MethodCollector.m26664o(4260);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m151376a(false);
    }

    static {
        Covode.recordClassIndex(103135);
    }

    /* renamed from: d */
    private void m151381d() {
        m151382e();
        SQLiteConnection sQLiteConnection = this.f197676l;
        if (sQLiteConnection != null) {
            m151380b(sQLiteConnection);
            this.f197676l = null;
        }
    }

    /* renamed from: h */
    private void m151385h() {
        if (!this.f197674j) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo141236c() {
        this.f197665a.get();
        AbstractC87262o oVar = this.f197667c;
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        try {
            m151376a(true);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: e */
    private void m151382e() {
        int size = this.f197680q.size();
        for (int i = 0; i < size; i++) {
            m151380b(this.f197680q.get(i));
        }
        this.f197680q.clear();
    }

    /* renamed from: f */
    private void m151383f() {
        int size = this.f197680q.size();
        while (true) {
            int i = size - 1;
            if (size > this.f197677n - 1) {
                m151380b(this.f197680q.remove(i));
                size = i;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        return "SQLiteConnectionPool: " + this.f197673i.f197708a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tencent.wcdb.database.d$a */
    public enum EnumC87248a {
        NORMAL,
        RECONFIGURE,
        DISCARD;

        static {
            Covode.recordClassIndex(103137);
        }
    }

    /* renamed from: g */
    private void m151384g() {
        SQLiteConnection sQLiteConnection = this.f197676l;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.mo141171a(this.f197673i);
            } catch (RuntimeException e) {
                Log.m151458a("WCDB.SQLiteConnectionPool", "Failed to reconfigure available primary connection, closing it: " + this.f197676l, e);
                m151380b(this.f197676l);
                this.f197676l = null;
            }
        }
        int size = this.f197680q.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = this.f197680q.get(i);
            try {
                sQLiteConnection2.mo141171a(this.f197673i);
            } catch (RuntimeException e2) {
                Log.m151458a("WCDB.SQLiteConnectionPool", "Failed to reconfigure available non-primary connection, closing it: ".concat(String.valueOf(sQLiteConnection2)), e2);
                m151380b(sQLiteConnection2);
                this.f197680q.remove(i);
                size--;
                i--;
            }
            i++;
        }
        m151375a(EnumC87248a.RECONFIGURE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo141235b() {
        SQLiteConnection sQLiteConnection;
        C87249b bVar = this.f197675k;
        C87249b bVar2 = null;
        boolean z = false;
        boolean z2 = false;
        while (bVar != null) {
            boolean z3 = true;
            if (this.f197674j) {
                try {
                    if (!bVar.f197693e && !z) {
                        sQLiteConnection = m151372a(bVar.f197694f, bVar.f197695g);
                        if (sQLiteConnection == null) {
                            z = true;
                        }
                        bVar.f197696h = sQLiteConnection;
                    }
                    if (!z2) {
                        sQLiteConnection = m151371a(bVar.f197695g);
                        if (sQLiteConnection == null) {
                            z2 = true;
                        }
                        bVar.f197696h = sQLiteConnection;
                    }
                    if (!z || !z2) {
                        z3 = false;
                    } else {
                        return;
                    }
                } catch (RuntimeException e) {
                    bVar.f197697i = e;
                }
            }
            C87249b bVar3 = bVar.f197689a;
            if (z3) {
                if (bVar2 != null) {
                    bVar2.f197689a = bVar3;
                } else {
                    this.f197675k = bVar3;
                }
                bVar.f197689a = null;
                LockSupport.unpark(bVar.f197690b);
            } else {
                bVar2 = bVar;
            }
            bVar = bVar3;
        }
    }

    /* renamed from: a */
    private SQLiteConnection m151371a(int i) {
        SQLiteConnection sQLiteConnection = this.f197676l;
        if (sQLiteConnection != null) {
            this.f197676l = null;
            m151374a(sQLiteConnection, i);
            return sQLiteConnection;
        }
        for (SQLiteConnection sQLiteConnection2 : this.f197681r.keySet()) {
            if (sQLiteConnection2.f197606e) {
                return null;
            }
        }
        SQLiteConnection a = mo141230a(this.f197673i, true);
        m151374a(a, i);
        return a;
    }

    /* renamed from: b */
    private void m151379b(int i) {
        if (i <= 0) {
            if ((this.f197673i.f197711d & 536870912) != 0) {
                i = 4;
            } else {
                i = 1;
            }
        }
        this.f197677n = i;
        Log.m151459b("WCDB.SQLiteConnectionPool", "Max connection pool size is %d.", Integer.valueOf(i));
    }

    /* renamed from: b */
    private static void m151380b(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.mo141169a();
        } catch (RuntimeException e) {
            Log.m151457a(6, "WCDB.SQLiteConnectionPool", "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection + e.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.WeakHashMap<com.tencent.wcdb.database.SQLiteConnection, com.tencent.wcdb.database.d$a> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private void m151375a(EnumC87248a aVar) {
        if (!this.f197681r.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f197681r.size());
            for (Map.Entry<SQLiteConnection, EnumC87248a> entry : this.f197681r.entrySet()) {
                EnumC87248a value = entry.getValue();
                if (!(aVar == value || value == EnumC87248a.DISCARD)) {
                    arrayList.add(entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f197681r.put(arrayList.get(i), aVar);
            }
        }
    }

    /* renamed from: a */
    private void m151376a(boolean z) {
        MethodCollector.m26663i(6980);
        if (!z) {
            synchronized (this.f197671g) {
                try {
                    m151385h();
                    this.f197674j = false;
                    m151381d();
                    int size = this.f197681r.size();
                    if (size != 0) {
                        Log.m151457a(4, "WCDB.SQLiteConnectionPool", "The connection pool for " + this.f197673i.f197709b + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                    }
                    mo141235b();
                } finally {
                    MethodCollector.m26664o(6980);
                }
            }
            return;
        }
        MethodCollector.m26664o(6980);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SQLiteConnection mo141230a(C87253g gVar, boolean z) {
        int i = this.f197678o;
        this.f197678o = i + 1;
        return SQLiteConnection.m151286a(this, gVar, i, z, this.f197669e, this.f197670f);
    }

    /* renamed from: a */
    private SQLiteConnection m151372a(String str, int i) {
        int size = this.f197680q.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = this.f197680q.get(i2);
                if (sQLiteConnection.mo141180b(str)) {
                    this.f197680q.remove(i2);
                    m151374a(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection remove = this.f197680q.remove(size - 1);
            m151374a(remove, i);
            return remove;
        }
        int size2 = this.f197681r.size();
        if (this.f197676l != null) {
            size2++;
        }
        if (size2 >= this.f197677n) {
            return null;
        }
        SQLiteConnection a = mo141230a(this.f197673i, false);
        m151374a(a, i);
        return a;
    }

    /* renamed from: a */
    private void m151374a(SQLiteConnection sQLiteConnection, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            sQLiteConnection.f197609h = z;
            this.f197681r.put(sQLiteConnection, EnumC87248a.NORMAL);
        } catch (RuntimeException e) {
            Log.m151457a(6, "WCDB.SQLiteConnectionPool", "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i);
            m151380b(sQLiteConnection);
            throw e;
        }
    }

    /* renamed from: a */
    private void m151373a(long j, int i) {
        int i2;
        StringBuilder sb = new StringBuilder();
        if (j != 0) {
            Thread currentThread = Thread.currentThread();
            sb.append("The connection pool for database '").append(this.f197673i.f197709b);
            sb.append("' has been unable to grant a connection to thread ");
            sb.append(currentThread.getId()).append(" (").append(currentThread.getName()).append(") ");
            sb.append("with flags 0x").append(Integer.toHexString(i));
            sb.append(" for ").append(((float) j) * 0.001f).append(" seconds.\n");
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (!this.f197681r.isEmpty()) {
            i2 = 0;
            for (SQLiteConnection sQLiteConnection : this.f197681r.keySet()) {
                String a = sQLiteConnection.f197607f.mo141188a();
                if (a != null) {
                    arrayList.add(a);
                    i3++;
                } else {
                    i2++;
                }
            }
        } else {
            i2 = 0;
        }
        int size = this.f197680q.size();
        if (this.f197676l != null) {
            size++;
        }
        sb.append("Connections: ").append(i3).append(" active, ");
        sb.append(i2).append(" idle, ");
        sb.append(size).append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append("  ").append((String) it.next()).append("\n");
            }
        }
        Log.m151457a(5, "WCDB.SQLiteConnectionPool", sb.toString());
        if (this.f197665a.get() != null) {
            AbstractC87262o oVar = this.f197667c;
        }
    }

    C87246d(SQLiteDatabase sQLiteDatabase, C87253g gVar, int i) {
        this.f197665a = new WeakReference<>(sQLiteDatabase);
        this.f197673i = new C87253g(gVar);
        m151379b(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        if (r20 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        r20.mo141282a(new com.tencent.wcdb.database.C87246d.C872471(r17));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r0 = r5.f197691c + 3000;
        r12 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0095, code lost:
        if (r17.f197672h.compareAndSet(true, false) == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0097, code lost:
        r2 = r17.f197671g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0099, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        mo141235b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009e, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r12 * 1000000);
        java.lang.Thread.interrupted();
        r4 = r17.f197671g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00aa, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        m151385h();
        r3 = r5.f197696h;
        r2 = r5.f197697i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b2, code lost:
        if (r3 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b4, code lost:
        if (r2 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b7, code lost:
        r12 = android.os.SystemClock.uptimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bd, code lost:
        if (r12 >= r0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bf, code lost:
        r12 = r12 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c1, code lost:
        m151373a(r12 - r5.f197691c, r19);
        r0 = r12 + 3000;
        r12 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cc, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d0, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4245);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d4, code lost:
        r5.f197689a = r17.f197679p;
        r5.f197690b = null;
        r5.f197694f = null;
        r5.f197696h = null;
        r5.f197697i = null;
        r5.f197698j++;
        r17.f197679p = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e7, code lost:
        if (r3 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e9, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f2, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f3, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4245);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f6, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00f9, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4245);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00fc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00fe, code lost:
        if (r20 != null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0100, code lost:
        r20.mo141282a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0103, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4245);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0106, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.wcdb.database.SQLiteConnection m151378b(java.lang.String r18, int r19, com.tencent.wcdb.support.C87272a r20) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.C87246d.m151378b(java.lang.String, int, com.tencent.wcdb.support.a):com.tencent.wcdb.database.SQLiteConnection");
    }
}
