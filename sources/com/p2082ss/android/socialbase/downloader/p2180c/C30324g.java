package com.p2082ss.android.socialbase.downloader.p2180c;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.p2189k.C30581j;

/* renamed from: com.ss.android.socialbase.downloader.c.g */
public final class C30324g {

    /* renamed from: a */
    private final SQLiteDatabase f72338a;

    /* renamed from: b */
    private final String f72339b;

    /* renamed from: c */
    private final String[] f72340c;

    /* renamed from: d */
    private final String[] f72341d;

    /* renamed from: e */
    private SQLiteStatement f72342e;

    /* renamed from: f */
    private SQLiteStatement f72343f;

    /* renamed from: g */
    private SQLiteStatement f72344g;

    /* renamed from: h */
    private SQLiteStatement f72345h;

    static {
        Covode.recordClassIndex(36836);
    }

    /* renamed from: a */
    public final SQLiteStatement mo53833a() {
        MethodCollector.m26663i(7380);
        if (this.f72342e == null) {
            String str = this.f72339b;
            String[] strArr = this.f72340c;
            StringBuilder sb = new StringBuilder("INSERT INTO ");
            sb.append('\"').append(str).append('\"').append(" (");
            C30581j.m62699a(sb, strArr);
            sb.append(") VALUES (");
            C30581j.m62697a(sb, strArr.length);
            sb.append(')');
            SQLiteStatement compileStatement = this.f72338a.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.f72342e == null) {
                        this.f72342e = compileStatement;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7380);
                    throw th;
                }
            }
            if (this.f72342e != compileStatement) {
                compileStatement.close();
            }
        }
        SQLiteStatement sQLiteStatement = this.f72342e;
        MethodCollector.m26664o(7380);
        return sQLiteStatement;
    }

    /* renamed from: b */
    public final SQLiteStatement mo53834b() {
        MethodCollector.m26663i(7535);
        if (this.f72344g == null) {
            String str = this.f72339b;
            String[] strArr = this.f72341d;
            String str2 = "\"" + str + '\"';
            StringBuilder sb = new StringBuilder("DELETE FROM ");
            sb.append(str2);
            if (strArr != null && strArr.length > 0) {
                sb.append(" WHERE ");
                C30581j.m62698a(sb, str2, strArr);
            }
            SQLiteStatement compileStatement = this.f72338a.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.f72344g == null) {
                        this.f72344g = compileStatement;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7535);
                    throw th;
                }
            }
            if (this.f72344g != compileStatement) {
                compileStatement.close();
            }
        }
        SQLiteStatement sQLiteStatement = this.f72344g;
        MethodCollector.m26664o(7535);
        return sQLiteStatement;
    }

    /* renamed from: c */
    public final SQLiteStatement mo53835c() {
        MethodCollector.m26663i(7857);
        if (this.f72343f == null) {
            String str = this.f72339b;
            String[] strArr = this.f72340c;
            String[] strArr2 = this.f72341d;
            String str2 = "\"" + str + '\"';
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(str2).append(" SET ");
            C30581j.m62700b(sb, strArr);
            if (strArr2 != null && strArr2.length > 0) {
                sb.append(" WHERE ");
                C30581j.m62698a(sb, str2, strArr2);
            }
            SQLiteStatement compileStatement = this.f72338a.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.f72343f == null) {
                        this.f72343f = compileStatement;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7857);
                    throw th;
                }
            }
            if (this.f72343f != compileStatement) {
                compileStatement.close();
            }
        }
        SQLiteStatement sQLiteStatement = this.f72343f;
        MethodCollector.m26664o(7857);
        return sQLiteStatement;
    }

    /* renamed from: d */
    public final SQLiteStatement mo53836d() {
        MethodCollector.m26663i(8288);
        if (this.f72345h == null) {
            String str = this.f72339b;
            String[] strArr = this.f72340c;
            StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO ");
            sb.append("\"" + str + '\"').append(" (");
            C30581j.m62699a(sb, strArr);
            sb.append(") VALUES (");
            C30581j.m62697a(sb, strArr.length);
            sb.append(')');
            SQLiteStatement compileStatement = this.f72338a.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.f72345h == null) {
                        this.f72345h = compileStatement;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8288);
                    throw th;
                }
            }
            if (this.f72345h != compileStatement) {
                compileStatement.close();
            }
        }
        SQLiteStatement sQLiteStatement = this.f72345h;
        MethodCollector.m26664o(8288);
        return sQLiteStatement;
    }

    public C30324g(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.f72338a = sQLiteDatabase;
        this.f72339b = str;
        this.f72340c = strArr;
        this.f72341d = strArr2;
    }
}
