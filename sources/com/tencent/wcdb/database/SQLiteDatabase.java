package com.tencent.wcdb.database;

import android.content.ContentValues;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.AbstractC87236d;
import com.tencent.wcdb.AbstractC87265g;
import com.tencent.wcdb.C87266h;
import com.tencent.wcdb.C87267i;
import com.tencent.wcdb.C87268j;
import com.tencent.wcdb.support.C87272a;
import com.tencent.wcdb.support.Log;
import java.util.Set;
import java.util.WeakHashMap;

public final class SQLiteDatabase extends AbstractC87245c {

    /* renamed from: d */
    static final /* synthetic */ boolean f197647d = true;

    /* renamed from: e */
    private static final WeakHashMap<SQLiteDatabase, Object> f197648e = new WeakHashMap<>();

    /* renamed from: j */
    private static final String[] f197649j = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: a */
    final Object f197650a = new Object();

    /* renamed from: b */
    final C87253g f197651b;

    /* renamed from: c */
    C87246d f197652c;

    /* renamed from: f */
    private final ThreadLocal<C87258l> f197653f = new ThreadLocal<C87258l>() {
        /* class com.tencent.wcdb.database.SQLiteDatabase.C872411 */

        static {
            Covode.recordClassIndex(103111);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ C87258l initialValue() {
            return SQLiteDatabase.this.mo141207f();
        }
    };

    /* renamed from: g */
    private final AbstractC87242a f197654g;

    /* renamed from: h */
    private final AbstractC87265g f197655h;

    /* renamed from: i */
    private boolean f197656i;

    public interface CustomFunction {
        static {
            Covode.recordClassIndex(103112);
        }
    }

    /* renamed from: com.tencent.wcdb.database.SQLiteDatabase$a */
    public interface AbstractC87242a {
        static {
            Covode.recordClassIndex(103113);
        }

        /* renamed from: a */
        AbstractC87236d mo141224a(AbstractC87252f fVar, String str, AbstractC87256j jVar);

        /* renamed from: a */
        AbstractC87256j mo141225a(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C87272a aVar);
    }

    /* renamed from: a */
    public final void mo141202a(int i) {
        mo141203b("PRAGMA user_version = ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public final C87260m mo141200a(String str) {
        mo141228d();
        try {
            return new C87260m(this, str, null);
        } finally {
            mo141229e();
        }
    }

    /* renamed from: a */
    public final AbstractC87236d mo141199a(String str, Object[] objArr) {
        mo141228d();
        try {
            return new C87254h(this, str).mo141240a(this.f197654g, objArr);
        } finally {
            mo141229e();
        }
    }

    /* renamed from: a */
    public final long mo141198a(String str, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        long a = mo141205b().mo141256a(i).mo141168a(str);
        if (a != 0) {
            return a;
        }
        throw new IllegalStateException("SQLiteConnection native handle not initialized.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141201a() {
        this.f197655h.mo31697a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.tencent.wcdb.database.AbstractC87245c
    /* renamed from: c */
    public final void mo141108c() {
        m151334c(false);
    }

    /* renamed from: r */
    public final void mo141220r() {
        mo141205b().mo141264c();
    }

    /* renamed from: b */
    public final C87258l mo141205b() {
        return this.f197653f.get();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        try {
            m151334c(true);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: j */
    public final int mo141212j() {
        return Long.valueOf(C87266h.m151444a(this, "PRAGMA user_version;")).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo141214l() {
        if ((this.f197651b.f197711d & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    private String m151335t() {
        String str;
        MethodCollector.m26663i(4583);
        synchronized (this.f197650a) {
            try {
                str = this.f197651b.f197709b;
            } finally {
                MethodCollector.m26664o(4583);
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C87258l mo141207f() {
        C87246d dVar;
        MethodCollector.m26663i(4588);
        synchronized (this.f197650a) {
            try {
                mo141221s();
                dVar = this.f197652c;
            } catch (Throwable th) {
                MethodCollector.m26664o(4588);
                throw th;
            }
        }
        C87258l lVar = new C87258l(dVar);
        MethodCollector.m26664o(4588);
        return lVar;
    }

    /* renamed from: g */
    public final void mo141209g() {
        mo141228d();
        try {
            mo141205b().mo141259a((C87272a) null);
        } finally {
            mo141229e();
        }
    }

    /* renamed from: h */
    public final void mo141210h() {
        mo141228d();
        try {
            mo141205b().mo141257a();
        } finally {
            mo141229e();
        }
    }

    /* renamed from: i */
    public final boolean mo141211i() {
        boolean z;
        mo141228d();
        try {
            if (mo141205b().f197751b != null) {
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            mo141229e();
        }
    }

    /* renamed from: k */
    public final boolean mo141213k() {
        boolean l;
        MethodCollector.m26663i(4810);
        synchronized (this.f197650a) {
            try {
                l = mo141214l();
            } finally {
                MethodCollector.m26664o(4810);
            }
        }
        return l;
    }

    /* renamed from: m */
    public final boolean mo141215m() {
        boolean z;
        MethodCollector.m26663i(4819);
        synchronized (this.f197650a) {
            try {
                if (this.f197652c != null) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(4819);
            }
        }
        return z;
    }

    /* renamed from: n */
    public final String mo141216n() {
        String str;
        MethodCollector.m26663i(4823);
        synchronized (this.f197650a) {
            try {
                str = this.f197651b.f197708a;
            } finally {
                MethodCollector.m26664o(4823);
            }
        }
        return str;
    }

    /* renamed from: p */
    public final AbstractC87262o mo141218p() {
        AbstractC87262o oVar;
        MethodCollector.m26663i(4839);
        synchronized (this.f197650a) {
            try {
                mo141221s();
                oVar = this.f197652c.f197667c;
            } finally {
                MethodCollector.m26664o(4839);
            }
        }
        return oVar;
    }

    public final String toString() {
        return "SQLiteDatabase: " + mo141216n();
    }

    static {
        Covode.recordClassIndex(103110);
        SQLiteGlobal.loadLib();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo141221s() {
        if (this.f197652c == null) {
            throw new IllegalStateException("The database '" + this.f197651b.f197709b + "' is not open.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = mo141199a("pragma database_list;", (java.lang.Object[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r3.moveToNext() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        r4.add(new android.util.Pair(r3.getString(1), r3.getString(2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (0 != 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4866);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        mo141229e();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4866);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        throw r0;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> mo141219q() {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.mo141219q():java.util.List");
    }

    /* renamed from: o */
    public final boolean mo141217o() {
        MethodCollector.m26663i(4834);
        synchronized (this.f197650a) {
            try {
                mo141221s();
                if ((this.f197651b.f197711d & 536870912) != 0) {
                    return true;
                }
                if (mo141214l()) {
                    MethodCollector.m26664o(4834);
                    return false;
                } else if (this.f197651b.mo141242a()) {
                    Log.m151457a(4, "WCDB.SQLiteDatabase", "can't enable WAL for memory databases.");
                    MethodCollector.m26664o(4834);
                    return false;
                } else if (this.f197656i) {
                    Log.m151457a(4, "WCDB.SQLiteDatabase", "this database: " + this.f197651b.f197709b + " has attached databases. can't  enable WAL.");
                    MethodCollector.m26664o(4834);
                    return false;
                } else {
                    C87253g gVar = this.f197651b;
                    gVar.f197711d = 536870912 | gVar.f197711d;
                    try {
                        this.f197652c.mo141234a(this.f197651b);
                        MethodCollector.m26664o(4834);
                        return true;
                    } catch (RuntimeException e) {
                        this.f197651b.f197711d &= -536870913;
                        MethodCollector.m26664o(4834);
                        throw e;
                    }
                }
            } finally {
                MethodCollector.m26664o(4834);
            }
        }
    }

    /* renamed from: a */
    static int m151329a(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || myLooper != Looper.getMainLooper()) {
            return i;
        }
        return i | 4;
    }

    /* renamed from: b */
    public final void mo141206b(boolean z) {
        int i;
        mo141228d();
        try {
            C87258l b = mo141205b();
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            b.mo141258a(i, m151329a(false), (C87272a) null);
        } finally {
            mo141229e();
        }
    }

    /* renamed from: a */
    private static Set<String> m151331a(ContentValues contentValues) {
        int i = Build.VERSION.SDK_INT;
        return contentValues.keySet();
    }

    /* renamed from: c */
    private void m151334c(boolean z) {
        C87246d dVar;
        MethodCollector.m26663i(4500);
        synchronized (this.f197650a) {
            try {
                dVar = this.f197652c;
                this.f197652c = null;
            } finally {
                MethodCollector.m26664o(4500);
            }
        }
        if (!z) {
            WeakHashMap<SQLiteDatabase, Object> weakHashMap = f197648e;
            synchronized (weakHashMap) {
                try {
                    weakHashMap.remove(this);
                } finally {
                    MethodCollector.m26664o(4500);
                }
            }
            if (dVar != null) {
                dVar.close();
            }
        }
    }

    /* renamed from: b */
    public final int mo141203b(String str) {
        MethodCollector.m26663i(4802);
        mo141228d();
        try {
            if (C87266h.m151447b(str) == 3) {
                boolean z = false;
                synchronized (this.f197650a) {
                    try {
                        if (!this.f197656i) {
                            this.f197656i = true;
                            z = true;
                        }
                    } finally {
                        MethodCollector.m26664o(4802);
                    }
                }
                if (z) {
                    synchronized (this.f197650a) {
                        try {
                            mo141221s();
                            if ((this.f197651b.f197711d & 536870912) != 0) {
                                this.f197651b.f197711d &= -536870913;
                                try {
                                    this.f197652c.mo141234a(this.f197651b);
                                } catch (RuntimeException e) {
                                    C87253g gVar = this.f197651b;
                                    gVar.f197711d = 536870912 | gVar.f197711d;
                                    MethodCollector.m26664o(4802);
                                    throw e;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            C87260m mVar = new C87260m(this, str, null);
            try {
                int g = mVar.mo141265g();
                mVar.close();
                return g;
            } catch (Throwable th2) {
                mVar.close();
                MethodCollector.m26664o(4802);
                throw th2;
            }
        } finally {
            mo141229e();
            MethodCollector.m26664o(4802);
        }
    }

    /* renamed from: b */
    public final long mo141204b(String str, String str2, ContentValues contentValues) {
        try {
            return mo141197a(str, (String) null, contentValues, 5);
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        } catch (C87268j e2) {
            Log.m151458a("WCDB.SQLiteDatabase", "Error inserting ".concat(String.valueOf(contentValues)), e2);
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0004 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m151332a(byte[] r5, com.tencent.wcdb.database.SQLiteCipherSpec r6, int r7) {
        /*
            r4 = this;
            r4.m151333b(r5, r6, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0004 }
            goto L_0x0034
        L_0x0004:
            r4.mo141201a()     // Catch:{ SQLiteException -> 0x000b }
            r4.m151333b(r5, r6, r7)     // Catch:{ SQLiteException -> 0x000b }
            return
        L_0x000b:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to open database '"
            r1.<init>(r0)
            java.lang.String r0 = r4.m151335t()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r0 = "'."
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r2 = r0.toString()
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r3
            java.lang.String r0 = "WCDB.SQLiteDatabase"
            com.tencent.wcdb.support.Log.m151458a(r0, r2, r1)
            r4.close()
            throw r3
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.database.SQLiteDatabase.m151332a(byte[], com.tencent.wcdb.database.SQLiteCipherSpec, int):void");
    }

    /* renamed from: b */
    private void m151333b(byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, int i) {
        SQLiteCipherSpec sQLiteCipherSpec2;
        MethodCollector.m26663i(4702);
        synchronized (this.f197650a) {
            try {
                if (f197647d || this.f197652c == null) {
                    C87253g gVar = this.f197651b;
                    if (gVar != null) {
                        C87246d dVar = new C87246d(this, gVar, i);
                        dVar.f197669e = bArr;
                        if (sQLiteCipherSpec == null) {
                            sQLiteCipherSpec2 = null;
                        } else {
                            sQLiteCipherSpec2 = new SQLiteCipherSpec(sQLiteCipherSpec);
                        }
                        dVar.f197670f = sQLiteCipherSpec2;
                        dVar.f197676l = dVar.mo141230a(dVar.f197673i, true);
                        dVar.f197674j = true;
                        this.f197652c = dVar;
                    } else {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("configuration must not be null.");
                        MethodCollector.m26664o(4702);
                        throw illegalArgumentException;
                    }
                } else {
                    AssertionError assertionError = new AssertionError();
                    MethodCollector.m26664o(4702);
                    throw assertionError;
                }
            } finally {
                MethodCollector.m26664o(4702);
            }
        }
        WeakHashMap<SQLiteDatabase, Object> weakHashMap = f197648e;
        synchronized (weakHashMap) {
            try {
                weakHashMap.put(this, null);
            } finally {
                MethodCollector.m26664o(4702);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final int mo141195a(String str, String str2, String[] strArr) {
        String str3;
        mo141228d();
        try {
            StringBuilder append = new StringBuilder("DELETE FROM ").append(str);
            if (!TextUtils.isEmpty(str2)) {
                str3 = " WHERE ".concat(String.valueOf(str2));
            } else {
                str3 = "";
            }
            C87260m mVar = new C87260m(this, append.append(str3).toString(), strArr);
            try {
                int g = mVar.mo141265g();
                mVar.close();
                return g;
            } catch (Throwable th) {
                mVar.close();
                throw th;
            }
        } finally {
            mo141229e();
        }
    }

    /* renamed from: a */
    public final long mo141196a(String str, String str2, ContentValues contentValues) {
        try {
            return mo141197a(str, (String) null, contentValues, 0);
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        } catch (C87268j e2) {
            Log.m151458a("WCDB.SQLiteDatabase", "Error inserting %s: %s", contentValues, e2);
            return -1;
        }
    }

    private SQLiteDatabase(String str, int i, AbstractC87242a aVar, AbstractC87265g gVar) {
        this.f197654g = aVar;
        this.f197655h = gVar == null ? new C87267i((byte) 0) : gVar;
        this.f197651b = new C87253g(str, i);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final int mo141194a(String str, ContentValues contentValues, String str2, String[] strArr) {
        int i;
        String str3;
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        mo141228d();
        try {
            StringBuilder sb = new StringBuilder(120);
            sb.append("UPDATE ");
            int i2 = 0;
            sb.append(f197649j[0]);
            sb.append(str);
            sb.append(" SET ");
            int size = contentValues.size();
            if (strArr == null) {
                i = size;
            } else {
                i = strArr.length + size;
            }
            Object[] objArr = new Object[i];
            for (String str4 : m151331a(contentValues)) {
                if (i2 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sb.append(str4);
                objArr[i2] = contentValues.get(str4);
                sb.append("=?");
                i2++;
            }
            if (strArr != null) {
                for (int i3 = size; i3 < i; i3++) {
                    objArr[i3] = strArr[i3 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append(" WHERE ");
                sb.append(str2);
            }
            C87260m mVar = new C87260m(this, sb.toString(), objArr);
            try {
                int g = mVar.mo141265g();
                mVar.close();
                return g;
            } catch (Throwable th) {
                mVar.close();
                throw th;
            }
        } finally {
            mo141229e();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final long mo141197a(String str, String str2, ContentValues contentValues, int i) {
        int i2;
        String str3;
        mo141228d();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(f197649j[i]);
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            Object[] objArr = null;
            int i3 = 0;
            if (contentValues == null || contentValues.size() <= 0) {
                i2 = 0;
            } else {
                i2 = contentValues.size();
            }
            if (i2 > 0) {
                objArr = new Object[i2];
                int i4 = 0;
                for (String str4 : m151331a(contentValues)) {
                    if (i4 > 0) {
                        str3 = ",";
                    } else {
                        str3 = "";
                    }
                    sb.append(str3);
                    sb.append(str4);
                    objArr[i4] = contentValues.get(str4);
                    i4++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                loop1:
                while (true) {
                    String str5 = "?";
                    while (true) {
                        sb.append(str5);
                        i3++;
                        if (i3 >= i2) {
                            break loop1;
                        } else if (i3 > 0) {
                            str5 = ",?";
                        }
                    }
                }
            } else {
                sb.append(str2 + ") VALUES (NULL");
            }
            sb.append(')');
            C87260m mVar = new C87260m(this, sb.toString(), objArr);
            try {
                long h = mVar.mo141266h();
                mVar.close();
                return h;
            } catch (Throwable th) {
                mVar.close();
                throw th;
            }
        } finally {
            mo141229e();
        }
    }

    /* renamed from: a */
    public static SQLiteDatabase m151330a(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, AbstractC87242a aVar, int i, AbstractC87265g gVar, int i2) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(str, i, aVar, gVar);
        sQLiteDatabase.m151332a(bArr, sQLiteCipherSpec, i2);
        return sQLiteDatabase;
    }
}
