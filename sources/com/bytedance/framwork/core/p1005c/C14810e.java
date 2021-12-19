package com.bytedance.framwork.core.p1005c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.p999b.C14766a;
import com.kakao.usermgmt.StringSet;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.framwork.core.c.e */
public class C14810e {

    /* renamed from: a */
    static final String[] f36092a = {"_id", "value", StringSet.type, "timestamp", "retry_count", "retry_time"};

    /* renamed from: b */
    private static C14810e f36093b;

    /* renamed from: c */
    private SQLiteDatabase f36094c;

    static {
        Covode.recordClassIndex(16910);
    }

    /* renamed from: c */
    private synchronized boolean m27190c() {
        MethodCollector.m26663i(11688);
        SQLiteDatabase sQLiteDatabase = this.f36094c;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                MethodCollector.m26664o(11688);
                return true;
            }
        }
        MethodCollector.m26664o(11688);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo23842b() {
        MethodCollector.m26663i(11853);
        if (!m27190c()) {
            MethodCollector.m26664o(11853);
            return;
        }
        try {
            this.f36094c.execSQL("DROP TABLE IF EXISTS queue");
            this.f36094c.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
            MethodCollector.m26664o(11853);
        } catch (Exception unused) {
            MethodCollector.m26664o(11853);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized long mo23837a() {
        MethodCollector.m26663i(11851);
        long j = 0;
        if (!m27190c()) {
            MethodCollector.m26664o(11851);
            return 0;
        }
        Cursor cursor = null;
        String str = "select count(*) from queue";
        try {
            if (!TextUtils.isEmpty(null)) {
                str = str + " " + ((String) null);
            }
            cursor = this.f36094c.rawQuery(str, null);
            if (cursor.moveToNext()) {
                j = cursor.getLong(0);
            }
        } catch (Throwable unused) {
        }
        m27189a(cursor);
        MethodCollector.m26664o(11851);
        return j;
    }

    /* renamed from: a */
    private static void m27189a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    private C14810e(Context context) {
        if (context != null) {
            try {
                this.f36094c = C14766a.m27096a(context).getWritableDatabase();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    static C14810e m27188a(Context context) {
        MethodCollector.m26663i(11687);
        if (f36093b == null) {
            synchronized (C14810e.class) {
                try {
                    if (f36093b == null) {
                        f36093b = new C14810e(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11687);
                    throw th;
                }
            }
        }
        C14810e eVar = f36093b;
        MethodCollector.m26664o(11687);
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.bytedance.framwork.core.c.b] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.bytedance.framwork.core.c.b] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0030] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bytedance.framwork.core.p1005c.C14805b mo23839a(long r18) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p1005c.C14810e.mo23839a(long):com.bytedance.framwork.core.c.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized long mo23838a(String str, byte[] bArr) {
        MethodCollector.m26663i(11852);
        if (m27190c() && bArr != null) {
            if (bArr.length > 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", bArr);
                contentValues.put(StringSet.type, str);
                contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("retry_count", (Integer) 0);
                contentValues.put("retry_time", (Long) 0L);
                long insert = this.f36094c.insert("queue", null, contentValues);
                MethodCollector.m26664o(11852);
                return insert;
            }
        }
        MethodCollector.m26664o(11852);
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo23840a(String str, int i, long j) {
        String str2;
        String[] strArr;
        MethodCollector.m26663i(11854);
        if (!m27190c()) {
            MethodCollector.m26664o(11854);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (TextUtils.isEmpty(str)) {
            str2 = "timestamp <= ? ";
            strArr = new String[]{String.valueOf(currentTimeMillis)};
        } else {
            str2 = "(timestamp <= ? OR retry_count > " + i + ") and type = ?";
            strArr = new String[]{String.valueOf(currentTimeMillis), str};
        }
        try {
            this.f36094c.delete("queue", str2, strArr);
            MethodCollector.m26664o(11854);
        } catch (Exception unused) {
            MethodCollector.m26664o(11854);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo23841a(long j, boolean z, long j2, int i) {
        MethodCollector.m26663i(12142);
        if (m27190c()) {
            if (j > 0) {
                String[] strArr = {String.valueOf(j)};
                if (!z) {
                    Cursor cursor = null;
                    try {
                        cursor = this.f36094c.query("queue", new String[]{"timestamp", "retry_count"}, "_id = ?", strArr, null, null, null);
                        if (!cursor.moveToNext()) {
                            return false;
                        }
                        long j3 = cursor.getLong(0);
                        int i2 = cursor.getInt(1);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - j3 >= j2 || i2 >= i) {
                            m27189a(cursor);
                        } else {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("retry_count", Integer.valueOf(i2 + 1));
                            contentValues.put("retry_time", Long.valueOf(currentTimeMillis));
                            this.f36094c.update("queue", contentValues, "_id = ?", strArr);
                            m27189a(cursor);
                            MethodCollector.m26664o(12142);
                            return true;
                        }
                    } catch (Exception unused) {
                        return false;
                    } finally {
                        m27189a(cursor);
                        MethodCollector.m26664o(12142);
                    }
                }
                try {
                    this.f36094c.delete("queue", "_id = ?", strArr);
                } catch (Throwable unused2) {
                }
                MethodCollector.m26664o(12142);
                return false;
            }
        }
        MethodCollector.m26664o(12142);
        return false;
    }
}
