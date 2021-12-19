package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.support.C87272a;

/* renamed from: com.tencent.wcdb.database.m */
public final class C87260m extends AbstractC87256j {
    static {
        Covode.recordClassIndex(103149);
    }

    public final String toString() {
        return "SQLiteProgram: " + this.f197741b;
    }

    /* renamed from: g */
    public final int mo141265g() {
        mo141228d();
        try {
            int a = mo141245a().mo141253a(this.f197741b, this.f197743d, mo141248b(), (C87272a) null);
            mo141229e();
            return a;
        } catch (SQLiteDatabaseCorruptException e) {
            mo141247a(e);
            throw e;
        } catch (Throwable th) {
            mo141229e();
            throw th;
        }
    }

    /* renamed from: h */
    public final long mo141266h() {
        mo141228d();
        try {
            long c = mo141245a().mo141263c(this.f197741b, this.f197743d, mo141248b());
            mo141229e();
            return c;
        } catch (SQLiteDatabaseCorruptException e) {
            mo141247a(e);
            throw e;
        } catch (Throwable th) {
            mo141229e();
            throw th;
        }
    }

    /* renamed from: i */
    public final long mo141267i() {
        mo141228d();
        try {
            long a = mo141245a().mo141255a(this.f197741b, this.f197743d, mo141248b());
            mo141229e();
            return a;
        } catch (SQLiteDatabaseCorruptException e) {
            mo141247a(e);
            throw e;
        } catch (Throwable th) {
            mo141229e();
            throw th;
        }
    }

    /* renamed from: j */
    public final String mo141268j() {
        mo141228d();
        try {
            String b = mo141245a().mo141261b(this.f197741b, this.f197743d, mo141248b());
            mo141229e();
            return b;
        } catch (SQLiteDatabaseCorruptException e) {
            mo141247a(e);
            throw e;
        } catch (Throwable th) {
            mo141229e();
            throw th;
        }
    }

    C87260m(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr, null);
    }
}
