package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.C87266h;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.database.SQLiteDebug;
import com.tencent.wcdb.support.C87272a;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.tencent.wcdb.database.j */
public abstract class AbstractC87256j extends AbstractC87245c {

    /* renamed from: f */
    private static final String[] f197739f = new String[0];

    /* renamed from: a */
    public final SQLiteDatabase f197740a;

    /* renamed from: b */
    public final String f197741b;

    /* renamed from: c */
    public final String[] f197742c;

    /* renamed from: d */
    public final Object[] f197743d;

    /* renamed from: e */
    protected SQLiteConnection.C87239c f197744e;

    /* renamed from: g */
    private final boolean f197745g;

    /* renamed from: h */
    private final int f197746h;

    /* renamed from: i */
    private C87258l f197747i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C87258l mo141245a() {
        return this.f197740a.mo141205b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo141248b() {
        return SQLiteDatabase.m151329a(this.f197745g);
    }

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.database.AbstractC87245c
    /* renamed from: c */
    public void mo141108c() {
        mo141265g();
        mo141249f();
    }

    static {
        Covode.recordClassIndex(103145);
    }

    /* renamed from: f */
    public final void mo141249f() {
        Object[] objArr = this.f197743d;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        synchronized (this) {
            if (this.f197747i != null || this.f197744e != null) {
                throw new SQLiteMisuseException("Acquired prepared statement is not released.");
            }
        }
        super.finalize();
    }

    /* renamed from: g */
    private synchronized void mo141265g() {
        C87258l lVar = this.f197747i;
        if (lVar == null) {
            if (this.f197744e == null) {
                return;
            }
        } else if (this.f197744e != null) {
            if (lVar == this.f197740a.mo141205b()) {
                C87258l lVar2 = this.f197747i;
                SQLiteConnection.C87239c cVar = this.f197744e;
                if (lVar2.f197750a != null) {
                    lVar2.f197750a.mo141170a(cVar);
                    lVar2.mo141262b();
                }
                this.f197744e = null;
                this.f197747i = null;
                return;
            }
            throw new IllegalStateException("SQLiteProgram has bound to another thread.");
        }
        throw new IllegalStateException("Internal state error.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo141247a(SQLiteException sQLiteException) {
        if ((sQLiteException instanceof SQLiteDatabaseCorruptException) || ((sQLiteException instanceof SQLiteFullException) && this.f197745g)) {
            SQLiteDatabase sQLiteDatabase = this.f197740a;
            try {
                SQLiteDebug.f197658a = SQLiteDebug.nativeGetLastErrorLine();
                ArrayList<SQLiteDebug.IOTraceStats> arrayList = new ArrayList<>();
                long a = sQLiteDatabase.mo141198a("collectIoStat", false);
                if (a != 0) {
                    SQLiteDebug.nativeGetIOTraceStats(a, arrayList);
                }
                sQLiteDatabase.mo141220r();
                SQLiteDebug.f197659b = arrayList;
            } catch (RuntimeException e) {
                Log.m151457a(6, "WCDB.SQLiteDebug", "Cannot collect I/O trace statistics: " + e.getMessage());
            }
            this.f197740a.mo141201a();
        }
    }

    /* renamed from: a */
    public final void mo141246a(int i, Object obj) {
        if (i <= 0 || i > this.f197746h) {
            throw new IllegalArgumentException("Cannot bind argument at index " + i + " because the index is out of range.  The statement has " + this.f197746h + " parameters.");
        }
        this.f197743d[i - 1] = obj;
    }

    /* JADX INFO: finally extract failed */
    protected AbstractC87256j(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C87272a aVar) {
        this.f197740a = sQLiteDatabase;
        String trim = str.trim();
        this.f197741b = trim;
        int b = C87266h.m151447b(trim);
        if (b == 4 || b == 5 || b == 6) {
            this.f197745g = false;
            this.f197742c = f197739f;
            this.f197746h = 0;
        } else {
            boolean z = b != 1 ? false : true;
            C87261n nVar = new C87261n();
            C87258l b2 = sQLiteDatabase.mo141205b();
            int a = SQLiteDatabase.m151329a(z);
            if (trim != null) {
                if (aVar != null) {
                    aVar.mo141281a();
                }
                b2.mo141260a(trim, a, aVar);
                try {
                    b2.f197750a.mo141174a(trim, nVar);
                    b2.mo141262b();
                    this.f197745g = nVar.f197763c;
                    this.f197742c = nVar.f197762b;
                    this.f197746h = nVar.f197761a;
                } catch (Throwable th) {
                    b2.mo141262b();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("sql must not be null.");
            }
        }
        if (objArr == null || objArr.length <= this.f197746h) {
            int i = this.f197746h;
            if (i != 0) {
                Object[] objArr2 = new Object[i];
                this.f197743d = objArr2;
                if (objArr != null) {
                    System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                }
            } else {
                this.f197743d = null;
            }
            this.f197744e = null;
            this.f197747i = null;
            return;
        }
        throw new IllegalArgumentException("Too many bind arguments.  " + objArr.length + " arguments were provided but the statement needs " + this.f197746h + " arguments.");
    }
}
