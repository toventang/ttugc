package com.tencent.wcdb.database;

import android.database.sqlite.SQLiteTransactionListener;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.C87266h;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.C87272a;

/* renamed from: com.tencent.wcdb.database.l */
public final class C87258l {

    /* renamed from: c */
    static final /* synthetic */ boolean f197749c = true;

    /* renamed from: a */
    SQLiteConnection f197750a;

    /* renamed from: b */
    C87259a f197751b;

    /* renamed from: d */
    private final C87246d f197752d;

    /* renamed from: e */
    private int f197753e;

    /* renamed from: f */
    private int f197754f;

    /* renamed from: g */
    private C87259a f197755g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.tencent.wcdb.database.l$a */
    public static final class C87259a {

        /* renamed from: a */
        public C87259a f197756a;

        /* renamed from: b */
        public int f197757b;

        /* renamed from: c */
        public SQLiteTransactionListener f197758c;

        /* renamed from: d */
        public boolean f197759d;

        /* renamed from: e */
        public boolean f197760e;

        static {
            Covode.recordClassIndex(103148);
        }

        private C87259a() {
        }

        /* synthetic */ C87259a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo141259a(C87272a aVar) {
        m151423d();
        if (f197749c || this.f197750a != null) {
            m151421b(aVar);
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141260a(String str, int i, C87272a aVar) {
        if (this.f197750a == null) {
            SQLiteConnection a = this.f197752d.mo141231a(str, i, aVar);
            this.f197750a = a;
            this.f197753e = i;
            a.mo141176a(Thread.currentThread(), Process.myTid());
        }
        this.f197754f++;
    }

    static {
        Covode.recordClassIndex(103147);
    }

    /* renamed from: d */
    private void m151423d() {
        if (this.f197751b == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    /* renamed from: c */
    public final void mo141264c() {
        SQLiteConnection sQLiteConnection = this.f197750a;
        if (sQLiteConnection != null) {
            sQLiteConnection.mo141173a((Exception) null);
        }
        mo141262b();
    }

    /* renamed from: e */
    private void m151424e() {
        C87259a aVar = this.f197751b;
        if (aVar != null && aVar.f197759d) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo141262b() {
        int i = this.f197754f - 1;
        this.f197754f = i;
        if (i == 0) {
            try {
                this.f197750a.mo141176a((Thread) null, 0);
                this.f197752d.mo141233a(this.f197750a);
            } finally {
                this.f197750a = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo141257a() {
        m151423d();
        m151424e();
        this.f197751b.f197759d = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SQLiteConnection mo141256a(int i) {
        mo141260a((String) null, i, (C87272a) null);
        return this.f197750a;
    }

    public C87258l(C87246d dVar) {
        if (dVar != null) {
            this.f197752d = dVar;
            return;
        }
        throw new IllegalArgumentException("connectionPool must not be null");
    }

    /* renamed from: a */
    private void m151420a(C87259a aVar) {
        aVar.f197756a = this.f197755g;
        aVar.f197758c = null;
        this.f197755g = aVar;
    }

    /* renamed from: b */
    private void m151421b(C87272a aVar) {
        boolean z;
        RuntimeException e;
        if (aVar != null) {
            aVar.mo141281a();
        }
        C87259a aVar2 = this.f197751b;
        boolean z2 = false;
        if (!aVar2.f197759d || aVar2.f197760e) {
            z = false;
        } else {
            z = true;
        }
        SQLiteTransactionListener sQLiteTransactionListener = aVar2.f197758c;
        if (sQLiteTransactionListener != null) {
            if (z) {
                try {
                    sQLiteTransactionListener.onCommit();
                } catch (RuntimeException e2) {
                    e = e2;
                }
            } else {
                sQLiteTransactionListener.onRollback();
            }
        }
        z2 = z;
        e = null;
        this.f197751b = aVar2.f197756a;
        m151420a(aVar2);
        C87259a aVar3 = this.f197751b;
        if (aVar3 == null) {
            if (z2) {
                try {
                    this.f197750a.mo141175a("COMMIT;", null, aVar);
                } catch (Throwable th) {
                    mo141262b();
                    throw th;
                }
            } else {
                this.f197750a.mo141175a("ROLLBACK;", null, aVar);
            }
            mo141262b();
        } else if (!z2) {
            aVar3.f197760e = true;
        }
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: a */
    private C87259a m151418a(int i, SQLiteTransactionListener sQLiteTransactionListener) {
        C87259a aVar = this.f197755g;
        if (aVar != null) {
            this.f197755g = aVar.f197756a;
            aVar.f197756a = null;
            aVar.f197759d = false;
            aVar.f197760e = false;
        } else {
            aVar = new C87259a((byte) 0);
        }
        aVar.f197757b = i;
        aVar.f197758c = sQLiteTransactionListener;
        return aVar;
    }

    /* renamed from: b */
    private boolean m151422b(String str, int i, C87272a aVar) {
        if (aVar != null) {
            aVar.mo141281a();
        }
        int b = C87266h.m151447b(str);
        if (b == 4) {
            mo141258a(2, i, aVar);
            return true;
        } else if (b == 5) {
            mo141257a();
            mo141259a(aVar);
            return true;
        } else if (b != 6) {
            return false;
        } else {
            mo141259a(aVar);
            return true;
        }
    }

    /* renamed from: c */
    public final long mo141263c(String str, Object[] objArr, int i) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m151422b(str, i, (C87272a) null)) {
            return 0;
        } else {
            mo141260a(str, i, (C87272a) null);
            try {
                return this.f197750a.mo141183e(str, objArr, null);
            } finally {
                mo141262b();
            }
        }
    }

    /* renamed from: b */
    public final String mo141261b(String str, Object[] objArr, int i) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m151422b(str, i, (C87272a) null)) {
            return null;
        } else {
            mo141260a(str, i, (C87272a) null);
            try {
                return this.f197750a.mo141181c(str, objArr, null);
            } finally {
                mo141262b();
            }
        }
    }

    /* renamed from: a */
    public final long mo141255a(String str, Object[] objArr, int i) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m151422b(str, i, (C87272a) null)) {
            return 0;
        } else {
            mo141260a(str, i, (C87272a) null);
            try {
                return this.f197750a.mo141177b(str, objArr, null);
            } finally {
                mo141262b();
            }
        }
    }

    /* renamed from: a */
    public final void mo141258a(int i, int i2, C87272a aVar) {
        m151424e();
        m151419a(i, (SQLiteTransactionListener) null, i2, aVar);
    }

    /* renamed from: a */
    public final int mo141253a(String str, Object[] objArr, int i, C87272a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (m151422b(str, i, (C87272a) null)) {
            return 0;
        } else {
            mo141260a(str, i, (C87272a) null);
            try {
                return this.f197750a.mo141182d(str, objArr, null);
            } finally {
                mo141262b();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m151419a(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, C87272a aVar) {
        if (aVar != null) {
            aVar.mo141281a();
        }
        if (this.f197751b == null) {
            mo141260a((String) null, i2, aVar);
        }
        try {
            if (this.f197751b == null) {
                if (i == 1) {
                    this.f197750a.mo141175a("BEGIN IMMEDIATE;", null, aVar);
                } else if (i != 2) {
                    this.f197750a.mo141175a("BEGIN;", null, aVar);
                } else {
                    this.f197750a.mo141175a("BEGIN EXCLUSIVE;", null, aVar);
                }
            }
            C87259a a = m151418a(i, null);
            a.f197756a = this.f197751b;
            this.f197751b = a;
        } catch (Throwable th) {
            if (this.f197751b == null) {
                mo141262b();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo141254a(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, C87272a aVar) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        } else if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        } else if (m151422b(str, i3, aVar)) {
            cursorWindow.mo141104a();
            return 0;
        } else {
            mo141260a(str, i3, aVar);
            try {
                return this.f197750a.mo141167a(str, objArr, cursorWindow, i, i2, z, aVar);
            } finally {
                mo141262b();
            }
        }
    }
}
