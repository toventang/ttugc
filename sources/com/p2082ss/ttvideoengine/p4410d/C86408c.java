package com.p2082ss.ttvideoengine.p4410d;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttvideoengine.p4430s.C86641i;

/* renamed from: com.ss.ttvideoengine.d.c */
public final class C86408c {

    /* renamed from: a */
    public boolean f193689a;

    /* renamed from: b */
    private SQLiteDatabase f193690b;

    /* renamed from: c */
    private String f193691c;

    /* renamed from: d */
    private C86407b f193692d;

    static {
        Covode.recordClassIndex(101636);
    }

    /* renamed from: a */
    public final boolean mo137429a(String str) {
        MethodCollector.m26663i(6867);
        if (this.f193690b == null || TextUtils.isEmpty(str)) {
            C86641i.m150113b("KVDBManager", "open db fail");
            MethodCollector.m26664o(6867);
            return false;
        }
        this.f193690b.beginTransaction();
        try {
            this.f193690b.execSQL(C1764a.m5928a("DELETE FROM %s WHERE key='%s'", new Object[]{this.f193691c, str}));
            this.f193690b.setTransactionSuccessful();
        } catch (Exception unused) {
            this.f193690b.endTransaction();
            MethodCollector.m26664o(6867);
            return false;
        } catch (Throwable unused2) {
        }
        this.f193690b.endTransaction();
        C86641i.m150113b("KVDBManager", "remove key ".concat(String.valueOf(str)));
        MethodCollector.m26664o(6867);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1787);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:7:0x001e] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo137431b(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4410d.C86408c.mo137431b(java.lang.String):java.lang.String");
    }

    public C86408c(Context context, String str) {
        MethodCollector.m26663i(6718);
        if (context == null || TextUtils.isEmpty(str)) {
            C86641i.m150117e("KVDBManager", "context or name is invalid");
            MethodCollector.m26664o(6718);
            return;
        }
        this.f193691c = str;
        C86407b bVar = new C86407b(context, this.f193691c);
        this.f193692d = bVar;
        boolean z = false;
        try {
            SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
            this.f193690b = writableDatabase;
            if (writableDatabase != null) {
                this.f193690b.execSQL(C1764a.m5928a("CREATE TABLE IF NOT EXISTS %s(key TEXT PRIMARY KEY,value TEXT,time INTEGER)", new Object[]{this.f193691c}));
            }
            if (this.f193692d == null) {
                C86641i.m150117e("KVDBManager", "create db fail, mHelper == null, table name " + this.f193691c);
            }
            this.f193689a = this.f193692d != null ? true : z;
            MethodCollector.m26664o(6718);
        } catch (Throwable unused) {
            C86641i.m150117e("KVDBManager", "create db fail, table name " + this.f193691c);
            if (this.f193692d == null) {
                C86641i.m150117e("KVDBManager", "create db fail, mHelper == null, table name " + this.f193691c);
            }
            this.f193689a = false;
            MethodCollector.m26664o(6718);
        }
    }

    /* renamed from: a */
    public final boolean mo137430a(String str, String str2) {
        MethodCollector.m26663i(6865);
        if (this.f193690b == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C86641i.m150117e("KVDBManager", "open db fail");
            MethodCollector.m26664o(6865);
            return false;
        }
        C86641i.m150110a("KVDBManager", "save key: " + str + " value: " + str2);
        this.f193690b.beginTransaction();
        try {
            this.f193690b.execSQL(C1764a.m5928a("REPLACE INTO %s VALUES ('%s','%s',%d)", new Object[]{this.f193691c, str, str2, Long.valueOf(System.currentTimeMillis())}));
            this.f193690b.setTransactionSuccessful();
        } catch (SQLException unused) {
            this.f193690b.endTransaction();
            MethodCollector.m26664o(6865);
            return false;
        } catch (IllegalStateException unused2) {
        }
        this.f193690b.endTransaction();
        MethodCollector.m26664o(6865);
        return true;
    }
}
