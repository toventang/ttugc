package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.support.C87272a;
import com.tencent.wcdb.support.Log;

/* renamed from: com.tencent.wcdb.database.k */
public final class C87257k extends AbstractC87256j {

    /* renamed from: f */
    private final C87272a f197748f;

    static {
        Covode.recordClassIndex(103146);
    }

    public final String toString() {
        return "SQLiteQuery: " + this.f197741b;
    }

    C87257k(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, C87272a aVar) {
        super(sQLiteDatabase, str, objArr, aVar);
        this.f197748f = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo141251a(CursorWindow cursorWindow, int i, int i2, boolean z) {
        mo141228d();
        try {
            cursorWindow.mo141228d();
            try {
                int a = mo141245a().mo141254a(this.f197741b, this.f197743d, cursorWindow, i, i2, z, mo141248b(), this.f197748f);
                cursorWindow.mo141229e();
                return a;
            } catch (SQLiteException e) {
                Log.m151457a(6, "WCDB.SQLiteQuery", "exception: " + e.getMessage() + "; query: " + this.f197741b);
                mo141247a(e);
                throw e;
            } catch (Throwable th) {
                cursorWindow.mo141229e();
                throw th;
            }
        } finally {
            mo141229e();
        }
    }
}
